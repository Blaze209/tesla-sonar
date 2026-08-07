package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1OctetString[] elements;
    private final int segmentLimit;

    public BEROctetString(byte[] bArr) {
        this(bArr, 1000);
    }

    static byte[] flattenOctetStrings(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].string;
        }
        int length2 = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            length2 += aSN1OctetString.string.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.string;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeIdentifier(z11, 36);
        aSN1OutputStream.write(128);
        ASN1OctetString[] aSN1OctetStringArr = this.elements;
        if (aSN1OctetStringArr == null) {
            int i11 = 0;
            while (true) {
                byte[] bArr = this.string;
                if (i11 >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i11, this.segmentLimit);
                DEROctetString.encode(aSN1OutputStream, true, this.string, i11, iMin);
                i11 += iMin;
            }
        } else {
            aSN1OutputStream.writePrimitives(aSN1OctetStringArr);
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        int iEncodedLength = z11 ? 4 : 3;
        if (this.elements == null) {
            int length = this.string.length;
            int i11 = this.segmentLimit;
            int i12 = length / i11;
            int iEncodedLength2 = iEncodedLength + (DEROctetString.encodedLength(true, i11) * i12);
            int length2 = this.string.length - (i12 * this.segmentLimit);
            return length2 > 0 ? iEncodedLength2 + DEROctetString.encodedLength(true, length2) : iEncodedLength2;
        }
        int i13 = 0;
        while (true) {
            ASN1OctetString[] aSN1OctetStringArr = this.elements;
            if (i13 >= aSN1OctetStringArr.length) {
                return iEncodedLength;
            }
            iEncodedLength += aSN1OctetStringArr[i13].encodedLength(true);
            i13++;
        }
    }

    public BEROctetString(byte[] bArr, int i11) {
        this(bArr, null, i11);
    }

    private BEROctetString(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr, int i11) {
        super(bArr);
        this.elements = aSN1OctetStringArr;
        this.segmentLimit = i11;
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        this(aSN1OctetStringArr, 1000);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr, int i11) {
        this(flattenOctetStrings(aSN1OctetStringArr), aSN1OctetStringArr, i11);
    }
}
