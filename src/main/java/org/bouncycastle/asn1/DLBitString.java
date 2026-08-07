package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b11, int i11) {
        super(b11, i11);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) {
        aSN1OutputStream.writeEncodingDL(z11, 3, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DLBitString(int i11) {
        super(ASN1BitString.getBytes(i11), ASN1BitString.getPadBits(i11));
    }

    static void encode(ASN1OutputStream aSN1OutputStream, boolean z11, byte b11, byte[] bArr, int i11, int i12) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 3, b11, bArr, i11, i12);
    }

    static int encodedLength(boolean z11, int i11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, i11);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded("DER"), 0);
    }

    static void encode(ASN1OutputStream aSN1OutputStream, boolean z11, byte[] bArr, int i11, int i12) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 3, bArr, i11, i12);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    DLBitString(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }
}
