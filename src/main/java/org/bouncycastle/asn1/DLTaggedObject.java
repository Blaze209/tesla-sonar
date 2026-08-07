package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    DLTaggedObject(int i11, int i12, int i13, ASN1Encodable aSN1Encodable) {
        super(i11, i12, i13, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean zIsExplicit = isExplicit();
        if (z11) {
            int i11 = this.tagClass;
            if (zIsExplicit || dLObject.encodeConstructed()) {
                i11 |= 32;
            }
            aSN1OutputStream.writeIdentifier(true, i11, this.tagNo);
        }
        if (zIsExplicit) {
            aSN1OutputStream.writeDL(dLObject.encodedLength(true));
        }
        dLObject.encode(aSN1OutputStream.getDLSubStream(), zIsExplicit);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return isExplicit() || this.obj.toASN1Primitive().toDLObject().encodeConstructed();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        boolean zIsExplicit = isExplicit();
        int iEncodedLength = dLObject.encodedLength(zIsExplicit);
        if (zIsExplicit) {
            iEncodedLength += ASN1OutputStream.getLengthOfDL(iEncodedLength);
        }
        return iEncodedLength + (z11 ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1Sequence rebuildConstructed(ASN1Primitive aSN1Primitive) {
        return new DLSequence(aSN1Primitive);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    ASN1TaggedObject replaceTag(int i11, int i12) {
        return new DLTaggedObject(this.explicitness, i11, i12, this.obj);
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        return this;
    }

    public DLTaggedObject(int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(true, i11, i12, aSN1Encodable);
    }

    public DLTaggedObject(int i11, ASN1Encodable aSN1Encodable) {
        super(true, i11, aSN1Encodable);
    }

    public DLTaggedObject(boolean z11, int i11, int i12, ASN1Encodable aSN1Encodable) {
        super(z11, i11, i12, aSN1Encodable);
    }

    public DLTaggedObject(boolean z11, int i11, ASN1Encodable aSN1Encodable) {
        super(z11, i11, aSN1Encodable);
    }
}
