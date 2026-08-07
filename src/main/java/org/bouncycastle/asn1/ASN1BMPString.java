package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    ASN1BMPString(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = str.toCharArray();
    }

    static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z11, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i11 = length & (-4);
        int i12 = 0;
        while (i12 < i11) {
            char[] cArr = this.string;
            char c11 = cArr[i12];
            char c12 = cArr[i12 + 1];
            char c13 = cArr[i12 + 2];
            char c14 = cArr[i12 + 3];
            i12 += 4;
            bArr[0] = (byte) (c11 >> '\b');
            bArr[1] = (byte) c11;
            bArr[2] = (byte) (c12 >> '\b');
            bArr[3] = (byte) c12;
            bArr[4] = (byte) (c13 >> '\b');
            bArr[5] = (byte) c13;
            bArr[6] = (byte) (c14 >> '\b');
            bArr[7] = (byte) c14;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i12 < length) {
            int i13 = 0;
            do {
                char c15 = this.string[i12];
                i12++;
                int i14 = i13 + 1;
                bArr[i13] = (byte) (c15 >> '\b');
                i13 += 2;
                bArr[i14] = (byte) c15;
            } while (i12 < length);
            aSN1OutputStream.write(bArr, 0, i13);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }

    ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i11 = length / 2;
        char[] cArr = new char[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            int i13 = i12 * 2;
            cArr[i12] = (char) ((bArr[i13 + 1] & 255) | (bArr[i13] << 8));
        }
        this.string = cArr;
    }

    static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1BMPString) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }

    ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = cArr;
    }
}
