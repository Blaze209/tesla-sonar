package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECFieldElement;

/* JADX INFO: loaded from: classes9.dex */
public class X9FieldElement extends ASN1Object {
    private static X9IntegerConverter converter = new X9IntegerConverter();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ECFieldElement f98566f;

    public X9FieldElement(ECFieldElement eCFieldElement) {
        this.f98566f = eCFieldElement;
    }

    public ECFieldElement getValue() {
        return this.f98566f;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(converter.integerToBytes(this.f98566f.toBigInteger(), converter.getByteLength(this.f98566f)));
    }
}
