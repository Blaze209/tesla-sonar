package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
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

    ASN1Encodable implParseObject(int i11) throws IOException {
        set00Check(false);
        int tagNumber = ASN1InputStream.readTagNumber(this._in, i11);
        int length = ASN1InputStream.readLength(this._in, this._limit, tagNumber == 3 || tagNumber == 4 || tagNumber == 16 || tagNumber == 17 || tagNumber == 8);
        if (length < 0) {
            if ((i11 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit, this.tmpBuffers);
            int i12 = i11 & 192;
            return i12 != 0 ? new BERTaggedObjectParser(i12, tagNumber, aSN1StreamParser) : aSN1StreamParser.parseImplicitConstructedIL(tagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, length, this._limit);
        if ((i11 & 224) == 0) {
            return parseImplicitPrimitive(tagNumber, definiteLengthInputStream);
        }
        ASN1StreamParser aSN1StreamParser2 = new ASN1StreamParser(definiteLengthInputStream, definiteLengthInputStream.getLimit(), this.tmpBuffers);
        int i13 = i11 & 192;
        if (i13 != 0) {
            return new DLTaggedObjectParser(i13, tagNumber, (i11 & 32) != 0, aSN1StreamParser2);
        }
        return aSN1StreamParser2.parseImplicitConstructedDL(tagNumber);
    }

    ASN1Primitive loadTaggedDL(int i11, int i12, boolean z11) {
        return !z11 ? ASN1TaggedObject.createPrimitive(i11, i12, ((DefiniteLengthInputStream) this._in).toByteArray()) : ASN1TaggedObject.createConstructedDL(i11, i12, readVector());
    }

    ASN1Primitive loadTaggedIL(int i11, int i12) {
        return ASN1TaggedObject.createConstructedIL(i11, i12, readVector());
    }

    ASN1Encodable parseImplicitConstructedDL(int i11) throws ASN1Exception {
        if (i11 == 3) {
            return new BERBitStringParser(this);
        }
        if (i11 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i11 == 8) {
            return new DERExternalParser(this);
        }
        if (i11 == 16) {
            return new DLSequenceParser(this);
        }
        if (i11 == 17) {
            return new DLSetParser(this);
        }
        throw new ASN1Exception("unknown DL object encountered: 0x" + Integer.toHexString(i11));
    }

    ASN1Encodable parseImplicitConstructedIL(int i11) throws ASN1Exception {
        if (i11 == 3) {
            return new BERBitStringParser(this);
        }
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

    ASN1Encodable parseImplicitPrimitive(int i11) {
        return parseImplicitPrimitive(i11, (DefiniteLengthInputStream) this._in);
    }

    ASN1Encodable parseObject(int i11) throws IOException {
        if (i11 < 0 || i11 > 30) {
            throw new IllegalArgumentException("invalid universal tag number: " + i11);
        }
        int i12 = this._in.read();
        if (i12 < 0) {
            return null;
        }
        if ((i12 & (-33)) == i11) {
            return implParseObject(i12);
        }
        throw new IOException("unexpected identifier encountered: " + i12);
    }

    ASN1TaggedObjectParser parseTaggedObject() throws IOException {
        int i11 = this._in.read();
        if (i11 < 0) {
            return null;
        }
        if ((i11 & 192) != 0) {
            return (ASN1TaggedObjectParser) implParseObject(i11);
        }
        throw new ASN1Exception("no tagged object found");
    }

    public ASN1Encodable readObject() throws IOException {
        int i11 = this._in.read();
        if (i11 < 0) {
            return null;
        }
        return implParseObject(i11);
    }

    ASN1EncodableVector readVector() throws IOException {
        int i11 = this._in.read();
        if (i11 < 0) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            ASN1Encodable aSN1EncodableImplParseObject = implParseObject(i11);
            aSN1EncodableVector.add(aSN1EncodableImplParseObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) aSN1EncodableImplParseObject).getLoadedObject() : aSN1EncodableImplParseObject.toASN1Primitive());
            i11 = this._in.read();
        } while (i11 >= 0);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i11) {
        this(inputStream, i11, new byte[11][]);
    }

    ASN1Encodable parseImplicitPrimitive(int i11, DefiniteLengthInputStream definiteLengthInputStream) throws ASN1Exception {
        if (i11 == 3) {
            return new DLBitStringParser(definiteLengthInputStream);
        }
        if (i11 == 4) {
            return new DEROctetStringParser(definiteLengthInputStream);
        }
        if (i11 == 8) {
            throw new ASN1Exception("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i11 == 16) {
            throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i11 == 17) {
            throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return ASN1InputStream.createPrimitiveDERObject(i11, definiteLengthInputStream, this.tmpBuffers);
        } catch (IllegalArgumentException e11) {
            throw new ASN1Exception("corrupted stream detected", e11);
        }
    }

    ASN1StreamParser(InputStream inputStream, int i11, byte[][] bArr) {
        this._in = inputStream;
        this._limit = i11;
        this.tmpBuffers = bArr;
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
