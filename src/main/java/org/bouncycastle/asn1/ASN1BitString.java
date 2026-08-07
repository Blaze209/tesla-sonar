package org.bouncycastle.asn1;

import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    ASN1BitString(byte b11, int i11) {
        if (i11 > 7 || i11 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = new byte[]{(byte) i11, b11};
    }

    static ASN1BitString createPrimitive(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i11 = bArr[0] & 255;
        if (i11 > 0) {
            if (i11 > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b11 = bArr[length - 1];
            if (b11 != ((byte) ((255 << i11) & b11))) {
                return new DLBitString(bArr, false);
            }
        }
        return new DERBitString(bArr, false);
    }

    public static ASN1BitString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BitString) {
                return (ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: " + e11.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i11 = length - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        int i13 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i11] & i13)) == ((byte) (bArr2[i11] & i13));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i11 = bArr[0] & 255;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = bArrCopyOfRange.length - 1;
        bArrCopyOfRange[length] = (byte) (((byte) (255 << i11)) & bArrCopyOfRange[length]);
        return bArrCopyOfRange;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i11 = this.contents[0] & 255;
        if (i11 == 0) {
            return getBitStream();
        }
        throw new IOException("expected octet-aligned bitstring, but found padBits: " + i11);
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & 255;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i11 = 0; i11 != encoded.length; i11++) {
                byte b11 = encoded[i11];
                char[] cArr = table;
                stringBuffer.append(cArr[(b11 >>> 4) & 15]);
                stringBuffer.append(cArr[b11 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e11) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e11.getMessage(), e11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i11 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ ((byte) ((255 << i11) & bArr[length]));
    }

    public int intValue() {
        int iMin = Math.min(5, this.contents.length - 1);
        int i11 = 0;
        for (int i12 = 1; i12 < iMin; i12++) {
            i11 |= (255 & this.contents[i12]) << ((i12 - 1) * 8);
        }
        if (1 > iMin || iMin >= 5) {
            return i11;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[iMin] & (255 << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8)) | i11;
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    ASN1BitString(byte[] bArr, int i11) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i11 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i11 > 7 || i11 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.contents = Arrays.prepend(bArr, (byte) i11);
    }

    protected static byte[] getBytes(int i11) {
        if (i11 == 0) {
            return new byte[0];
        }
        int i12 = 4;
        for (int i13 = 3; i13 >= 1 && ((255 << (i13 * 8)) & i11) == 0; i13--) {
            i12--;
        }
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) ((i11 >> (i14 * 8)) & 255);
        }
        return bArr;
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1BitString) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }

    protected static int getPadBits(int i11) {
        int i12;
        int i13 = 3;
        while (true) {
            if (i13 < 0) {
                i12 = 0;
                break;
            }
            if (i13 != 0) {
                int i14 = i11 >> (i13 * 8);
                if (i14 != 0) {
                    i12 = i14 & 255;
                    break;
                }
                i13--;
            } else {
                if (i11 != 0) {
                    i12 = i11 & 255;
                    break;
                }
                i13--;
            }
        }
        if (i12 == 0) {
            return 0;
        }
        int i15 = 1;
        while (true) {
            i12 <<= 1;
            if ((i12 & 255) == 0) {
                return 8 - i15;
            }
            i15++;
        }
    }

    ASN1BitString(byte[] bArr, boolean z11) {
        if (z11) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i11 = bArr[0] & 255;
            if (i11 > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i11 > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.contents = bArr;
    }
}
