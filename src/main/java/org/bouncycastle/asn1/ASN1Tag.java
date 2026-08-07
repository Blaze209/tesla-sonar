package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes9.dex */
final class ASN1Tag {
    private final int tagClass;
    private final int tagNumber;

    private ASN1Tag(int i11, int i12) {
        this.tagClass = i11;
        this.tagNumber = i12;
    }

    static ASN1Tag create(int i11, int i12) {
        return new ASN1Tag(i11, i12);
    }

    int getTagClass() {
        return this.tagClass;
    }

    int getTagNumber() {
        return this.tagNumber;
    }
}
