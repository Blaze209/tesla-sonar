package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z11) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z11);
        }
    }

    ASN1Encodable readImplicit(boolean z11, int i11) throws IOException {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            if (z11) {
                return readIndef(i11);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z11) {
            if (i11 == 4) {
                return new BEROctetStringParser(this);
            }
            if (i11 == 16) {
                return new DERSequenceParser(this);
            }
            if (i11 == 17) {
                return new DERSetParser(this);
            }
        } else {
            if (i11 == 4) {
                return new DEROctetStringParser((DefiniteLengthInputStream) inputStream);
            }
            if (i11 == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i11 == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new ASN1Exception("implicit tagging not implemented");
    }

    ASN1Encodable readIndef(int i11) throws ASN1Exception {
        if (i11 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i11 == 8) {
            return new DERExternalParser(this);
        }
        if (i11 == 16) {
            return new BERSequenceParser(this);
        }
        if (i11 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i11));
    }

    public ASN1Encodable readObject() throws IOException {
        int i11 = this._in.read();
        if (i11 == -1) {
            return null;
        }
        set00Check(false);
        int tagNumber = ASN1InputStream.readTagNumber(this._in, i11);
        boolean z11 = (i11 & 32) != 0;
        int length = ASN1InputStream.readLength(this._in, this._limit);
        if (length < 0) {
            if (!z11) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit);
            if ((i11 & 64) != 0) {
                return new BERApplicationSpecificParser(tagNumber, aSN1StreamParser);
            }
            return (i11 & 128) != 0 ? new BERTaggedObjectParser(true, tagNumber, aSN1StreamParser) : aSN1StreamParser.readIndef(tagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, length);
        if ((i11 & 64) != 0) {
            return new DERApplicationSpecific(z11, tagNumber, definiteLengthInputStream.toByteArray());
        }
        if ((i11 & 128) != 0) {
            return new BERTaggedObjectParser(z11, tagNumber, new ASN1StreamParser(definiteLengthInputStream));
        }
        if (!z11) {
            if (tagNumber == 4) {
                return new DEROctetStringParser(definiteLengthInputStream);
            }
            try {
                return ASN1InputStream.createPrimitiveDERObject(tagNumber, definiteLengthInputStream, this.tmpBuffers);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        }
        if (tagNumber == 4) {
            return new BEROctetStringParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (tagNumber == 8) {
            return new DERExternalParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (tagNumber == 16) {
            return new DERSequenceParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (tagNumber == 17) {
            return new DERSetParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        throw new IOException("unknown tag " + tagNumber + " encountered");
    }

    ASN1Primitive readTaggedObject(boolean z11, int i11) throws IOException {
        if (!z11) {
            return new DERTaggedObject(false, i11, new DEROctetString(((DefiniteLengthInputStream) this._in).toByteArray()));
        }
        ASN1EncodableVector vector = readVector();
        if (this._in instanceof IndefiniteLengthInputStream) {
            return vector.size() == 1 ? new BERTaggedObject(true, i11, vector.get(0)) : new BERTaggedObject(false, i11, BERFactory.createSequence(vector));
        }
        return vector.size() == 1 ? new DERTaggedObject(true, i11, vector.get(0)) : new DERTaggedObject(false, i11, DERFactory.createSequence(vector));
    }

    ASN1EncodableVector readVector() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Encodable object = readObject();
            if (object == null) {
                return aSN1EncodableVector;
            }
            if (object instanceof InMemoryRepresentable) {
                aSN1EncodableVector.add(((InMemoryRepresentable) object).getLoadedObject());
            } else {
                aSN1EncodableVector.add(object.toASN1Primitive());
            }
        }
    }

    public ASN1StreamParser(InputStream inputStream, int i11) {
        this._in = inputStream;
        this._limit = i11;
        this.tmpBuffers = new byte[11][];
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
