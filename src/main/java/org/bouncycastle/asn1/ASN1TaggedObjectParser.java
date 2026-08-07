package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes9.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    int getTagClass();

    int getTagNo();

    boolean hasContextTag();

    boolean hasContextTag(int i11);

    boolean hasTag(int i11, int i12);

    boolean hasTagClass(int i11);

    ASN1Encodable parseBaseUniversal(boolean z11, int i11);

    ASN1Encodable parseExplicitBaseObject();

    ASN1TaggedObjectParser parseExplicitBaseTagged();

    ASN1TaggedObjectParser parseImplicitBaseTagged(int i11, int i12);
}
