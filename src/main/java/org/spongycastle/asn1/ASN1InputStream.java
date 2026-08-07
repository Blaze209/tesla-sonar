package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    static ASN1Primitive createPrimitiveDERObject(int i11, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        if (i11 == 10) {
            return ASN1Enumerated.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
        }
        if (i11 == 12) {
            return new DERUTF8String(definiteLengthInputStream.toByteArray());
        }
        if (i11 == 30) {
            return new DERBMPString(getBMPCharBuffer(definiteLengthInputStream));
        }
        switch (i11) {
            case 1:
                return ASN1Boolean.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            case 2:
                return new ASN1Integer(definiteLengthInputStream.toByteArray(), false);
            case 3:
                return ASN1BitString.fromInputStream(definiteLengthInputStream.getRemaining(), definiteLengthInputStream);
            case 4:
                return new DEROctetString(definiteLengthInputStream.toByteArray());
            case 5:
                return DERNull.INSTANCE;
            case 6:
                return ASN1ObjectIdentifier.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            default:
                switch (i11) {
                    case 18:
                        return new DERNumericString(definiteLengthInputStream.toByteArray());
                    case 19:
                        return new DERPrintableString(definiteLengthInputStream.toByteArray());
                    case 20:
                        return new DERT61String(definiteLengthInputStream.toByteArray());
                    case 21:
                        return new DERVideotexString(definiteLengthInputStream.toByteArray());
                    case 22:
                        return new DERIA5String(definiteLengthInputStream.toByteArray());
                    case 23:
                        return new ASN1UTCTime(definiteLengthInputStream.toByteArray());
                    case 24:
                        return new ASN1GeneralizedTime(definiteLengthInputStream.toByteArray());
                    case 25:
                        return new DERGraphicString(definiteLengthInputStream.toByteArray());
                    case 26:
                        return new DERVisibleString(definiteLengthInputStream.toByteArray());
                    case 27:
                        return new DERGeneralString(definiteLengthInputStream.toByteArray());
                    case 28:
                        return new DERUniversalString(definiteLengthInputStream.toByteArray());
                    default:
                        throw new IOException("unknown tag " + i11 + " encountered");
                }
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        int i11;
        int remaining = definiteLengthInputStream.getRemaining() / 2;
        char[] cArr = new char[remaining];
        for (int i12 = 0; i12 < remaining; i12++) {
            int i13 = definiteLengthInputStream.read();
            if (i13 < 0 || (i11 = definiteLengthInputStream.read()) < 0) {
                break;
            }
            cArr[i12] = (char) ((i13 << 8) | (i11 & 255));
        }
        return cArr;
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        int remaining = definiteLengthInputStream.getRemaining();
        if (definiteLengthInputStream.getRemaining() >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        Streams.readFully(definiteLengthInputStream, bArr2);
        return bArr2;
    }

    static int readTagNumber(InputStream inputStream, int i11) throws IOException {
        int i12 = i11 & 31;
        if (i12 != 31) {
            return i12;
        }
        int i13 = inputStream.read();
        if ((i13 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i14 = 0;
        while (i13 >= 0 && (i13 & 128) != 0) {
            i14 = ((i13 & 127) | i14) << 7;
            i13 = inputStream.read();
        }
        if (i13 >= 0) {
            return (i13 & 127) | i14;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream definiteLengthInputStream) {
        return new ASN1InputStream(definiteLengthInputStream).buildEncodableVector();
    }

    ASN1EncodableVector buildEncodableVector() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Primitive object = readObject();
            if (object == null) {
                return aSN1EncodableVector;
            }
            aSN1EncodableVector.add(object);
        }
    }

    protected ASN1Primitive buildObject(int i11, int i12, int i13) throws IOException {
        boolean z11 = (i11 & 32) != 0;
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i13);
        if ((i11 & 64) != 0) {
            return new DERApplicationSpecific(z11, i12, definiteLengthInputStream.toByteArray());
        }
        if ((i11 & 128) != 0) {
            return new ASN1StreamParser(definiteLengthInputStream).readTaggedObject(z11, i12);
        }
        if (!z11) {
            return createPrimitiveDERObject(i12, definiteLengthInputStream, this.tmpBuffers);
        }
        if (i12 == 4) {
            ASN1EncodableVector aSN1EncodableVectorBuildDEREncodableVector = buildDEREncodableVector(definiteLengthInputStream);
            int size = aSN1EncodableVectorBuildDEREncodableVector.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            for (int i14 = 0; i14 != size; i14++) {
                aSN1OctetStringArr[i14] = (ASN1OctetString) aSN1EncodableVectorBuildDEREncodableVector.get(i14);
            }
            return new BEROctetString(aSN1OctetStringArr);
        }
        if (i12 == 8) {
            return new DERExternal(buildDEREncodableVector(definiteLengthInputStream));
        }
        if (i12 == 16) {
            return this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DERFactory.createSequence(buildDEREncodableVector(definiteLengthInputStream));
        }
        if (i12 == 17) {
            return DERFactory.createSet(buildDEREncodableVector(definiteLengthInputStream));
        }
        throw new IOException("unknown tag " + i12 + " encountered");
    }

    int getLimit() {
        return this.limit;
    }

    protected void readFully(byte[] bArr) throws EOFException {
        if (Streams.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    protected int readLength() {
        return readLength(this, this.limit);
    }

    public ASN1Primitive readObject() {
        int i11 = read();
        if (i11 <= 0) {
            if (i11 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int tagNumber = readTagNumber(this, i11);
        boolean z11 = (i11 & 32) != 0;
        int length = readLength();
        if (length >= 0) {
            try {
                return buildObject(i11, tagNumber, length);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        }
        if (!z11) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit);
        if ((i11 & 64) != 0) {
            return new BERApplicationSpecificParser(tagNumber, aSN1StreamParser).getLoadedObject();
        }
        if ((i11 & 128) != 0) {
            return new BERTaggedObjectParser(true, tagNumber, aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 4) {
            return new BEROctetStringParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 8) {
            return new DERExternalParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 16) {
            return new BERSequenceParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 17) {
            return new BERSetParser(aSN1StreamParser).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    static int readLength(InputStream inputStream, int i11) throws IOException {
        int i12 = inputStream.read();
        if (i12 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i12 == 128) {
            return -1;
        }
        if (i12 <= 127) {
            return i12;
        }
        int i13 = i12 & 127;
        if (i13 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i13);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = inputStream.read();
            if (i16 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i14 = (i14 << 8) + i16;
        }
        if (i14 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i14 < i11) {
            return i14;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    public ASN1InputStream(byte[] bArr, boolean z11) {
        this(new ByteArrayInputStream(bArr), bArr.length, z11);
    }

    public ASN1InputStream(InputStream inputStream, int i11) {
        this(inputStream, i11, false);
    }

    public ASN1InputStream(InputStream inputStream, boolean z11) {
        this(inputStream, StreamUtil.findLimit(inputStream), z11);
    }

    public ASN1InputStream(InputStream inputStream, int i11, boolean z11) {
        super(inputStream);
        this.limit = i11;
        this.lazyEvaluate = z11;
        this.tmpBuffers = new byte[11][];
    }
}
