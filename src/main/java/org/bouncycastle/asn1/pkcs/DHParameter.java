package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes9.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f98524g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ASN1Integer f98525l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f98526p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i11) {
        this.f98526p = new ASN1Integer(bigInteger);
        this.f98524g = new ASN1Integer(bigInteger2);
        this.f98525l = i11 != 0 ? new ASN1Integer(i11) : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f98524g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f98525l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f98526p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f98526p);
        aSN1EncodableVector.add(this.f98524g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f98525l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f98526p = ASN1Integer.getInstance(objects.nextElement());
        this.f98524g = ASN1Integer.getInstance(objects.nextElement());
        this.f98525l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}
