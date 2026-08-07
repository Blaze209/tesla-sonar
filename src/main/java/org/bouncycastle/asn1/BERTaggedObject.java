package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    BERTaggedObject(int i11, int i12, int i13, ASN1Encodable aSN1Encodable) {
        super(i11, i12, i13, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        if (z11) {
            int i11 = this.tagClass;
            if (zIsExplicit || aSN1Primitive.encodeConstructed()) {
                i11 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i11, this.tagNo);
        }
        if (!zIsExplicit) {
            aSN1Primitive.encode(aSN1OutputStream, false);
            return;
        }
        aSN1OutputStream.write(128);
        aSN1Primitive.encode(aSN1OutputStream, true);
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = aSN1Primitive.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += 3;
        }
        return iEncodedLength + (z11 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1TaggedObject replaceTag(int i11, int i12) {
        return new BERTaggedObject(this.explicitness, i11, i12, this.obj);
    }

    public BERTaggedObject(int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(true, i11, i12, aSN1Encodable);
    }

    public BERTaggedObject(int i11, ASN1Encodable aSN1Encodable) {
        super(true, i11, aSN1Encodable);
    }

    public BERTaggedObject(boolean z11, int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(z11, i11, i12, aSN1Encodable);
    }

    public BERTaggedObject(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        super(z11, i11, aSN1Encodable);
    }
}
