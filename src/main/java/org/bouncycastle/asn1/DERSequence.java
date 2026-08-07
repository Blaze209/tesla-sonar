package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class DERSequence extends ASN1Sequence {
    private int contentsLength;

    public DERSequence() {
        this.contentsLength = -1;
    }

    public static DERSequence convert(ASN1Sequence aSN1Sequence) {
        return (DERSequence) aSN1Sequence.toDERObject();
    }

    private int getContentsLength() {
        if (this.contentsLength < 0) {
            int length = this.elements.length;
            int iEncodedLength = 0;
            for (int i11 = 0; i11 < length; i11++) {
                iEncodedLength += this.elements[i11].toASN1Primitive().toDERObject().encodedLength(true);
            }
            this.contentsLength = iEncodedLength;
        }
        return this.contentsLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeIdentifier(z11, 48);
        DEROutputStream dERSubStream = aSN1OutputStream.getDERSubStream();
        int length = this.elements.length;
        int i11 = 0;
        if (this.contentsLength >= 0 || length > 16) {
            aSN1OutputStream.writeDL(getContentsLength());
            while (i11 < length) {
                this.elements[i11].toASN1Primitive().toDERObject().encode(dERSubStream, true);
                i11++;
            }
            return;
        }
        ASN1Primitive[] aSN1PrimitiveArr = new ASN1Primitive[length];
        int iEncodedLength = 0;
        for (int i12 = 0; i12 < length; i12++) {
            ASN1Primitive dERObject = this.elements[i12].toASN1Primitive().toDERObject();
            aSN1PrimitiveArr[i12] = dERObject;
            iEncodedLength += dERObject.encodedLength(true);
        }
        this.contentsLength = iEncodedLength;
        aSN1OutputStream.writeDL(iEncodedLength);
        while (i11 < length) {
            aSN1PrimitiveArr[i11].encode(dERSubStream, true);
            i11++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, getContentsLength());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1BitString toASN1BitString() {
        return new DERBitString(BERBitString.flattenBitStrings(getConstructedBitStrings()), false);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1External toASN1External() {
        return new DERExternal(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1OctetString toASN1OctetString() {
        return new DEROctetString(BEROctetString.flattenOctetStrings(getConstructedOctetStrings()));
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1Set toASN1Set() {
        return new DLSet(false, toArrayInternal());
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.contentsLength = -1;
    }

    public DERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.contentsLength = -1;
    }

    public DERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.contentsLength = -1;
    }

    DERSequence(ASN1Encodable[] aSN1EncodableArr, boolean z11) {
        super(aSN1EncodableArr, z11);
        this.contentsLength = -1;
    }
}
