package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BERBitString extends ASN1BitString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(byte b11, int i11) {
        super(b11, i11);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].contents;
        }
        int i11 = length - 1;
        int length2 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr = aSN1BitStringArr[i12].contents;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i11].contents;
        byte b11 = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b11;
        int i13 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.contents;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i13, length3);
            i13 += length3;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        ASN1OutputStream aSN1OutputStream2;
        if (!encodeConstructed()) {
            byte[] bArr = this.contents;
            DLBitString.encode(aSN1OutputStream, z11, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z11, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr == null) {
            byte[] bArr2 = this.contents;
            if (bArr2.length >= 2) {
                byte b11 = bArr2[0];
                int length = bArr2.length;
                int i11 = length - 1;
                int i12 = this.segmentLimit - 1;
                while (i11 > i12) {
                    ASN1OutputStream aSN1OutputStream3 = aSN1OutputStream;
                    DLBitString.encode(aSN1OutputStream3, true, (byte) 0, this.contents, length - i11, i12);
                    i11 -= i12;
                    aSN1OutputStream = aSN1OutputStream3;
                }
                aSN1OutputStream2 = aSN1OutputStream;
                DLBitString.encode(aSN1OutputStream2, true, b11, this.contents, length - i11, i11);
            }
            aSN1OutputStream2.write(0);
            aSN1OutputStream2.write(0);
        }
        aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        aSN1OutputStream2 = aSN1OutputStream;
        aSN1OutputStream2.write(0);
        aSN1OutputStream2.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z11, this.contents.length);
        }
        int iEncodedLength = z11 ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return iEncodedLength;
            }
            int length = bArr.length - 2;
            int i11 = this.segmentLimit;
            int i12 = length / (i11 - 1);
            return iEncodedLength + (DLBitString.encodedLength(true, i11) * i12) + DLBitString.encodedLength(true, this.contents.length - (i12 * (this.segmentLimit - 1)));
        }
        int i13 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i13 >= aSN1BitStringArr.length) {
                return iEncodedLength;
            }
            iEncodedLength += aSN1BitStringArr[i13].encodedLength(true);
            i13++;
        }
    }

    public BERBitString(ASN1Encodable aSN1Encodable) {
        this(aSN1Encodable.toASN1Primitive().getEncoded("DER"), 0);
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(byte[] bArr, int i11) {
        this(bArr, i11, 1000);
    }

    public BERBitString(byte[] bArr, int i11, int i12) {
        super(bArr, i11);
        this.elements = null;
        this.segmentLimit = i12;
    }

    BERBitString(byte[] bArr, boolean z11) {
        super(bArr, z11);
        this.elements = null;
        this.segmentLimit = 1000;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, 1000);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i11) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i11;
    }
}
