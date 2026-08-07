package org.spongycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1EncodableVector {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Vector f99345v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.f99345v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration enumerationElements = aSN1EncodableVector.f99345v.elements();
        while (enumerationElements.hasMoreElements()) {
            this.f99345v.addElement(enumerationElements.nextElement());
        }
    }

    public ASN1Encodable get(int i11) {
        return (ASN1Encodable) this.f99345v.elementAt(i11);
    }

    public int size() {
        return this.f99345v.size();
    }
}
