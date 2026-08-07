package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingIL(z11, 48, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        int iEncodedLength = z11 ? 4 : 3;
        int length = this.elements.length;
        for (int i11 = 0; i11 < length; i11++) {
            iEncodedLength += this.elements[i11].toASN1Primitive().encodedLength(true);
        }
        return iEncodedLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1BitString toASN1BitString() {
        return new BERBitString(getConstructedBitStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1External toASN1External() {
        return ((ASN1Sequence) toDLObject()).toASN1External();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1OctetString toASN1OctetString() {
        return new BEROctetString(getConstructedOctetStrings());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1Set toASN1Set() {
        return new BERSet(false, toArrayInternal());
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }
}
