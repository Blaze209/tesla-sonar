package org.spongycastle.asn1;

/* JADX INFO: loaded from: classes10.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i11, boolean z11);

    int getTagNo();
}
