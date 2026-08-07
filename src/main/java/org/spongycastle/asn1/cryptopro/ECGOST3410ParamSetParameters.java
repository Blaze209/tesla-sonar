package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes10.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f99351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f99352b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f99353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f99354q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f99355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f99356y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, BigInteger bigInteger5) {
        this.f99351a = new ASN1Integer(bigInteger);
        this.f99352b = new ASN1Integer(bigInteger2);
        this.f99353p = new ASN1Integer(bigInteger3);
        this.f99354q = new ASN1Integer(bigInteger4);
        this.f99355x = new ASN1Integer(i11);
        this.f99356y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }

    public BigInteger getA() {
        return this.f99351a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f99353p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f99354q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f99351a);
        aSN1EncodableVector.add(this.f99352b);
        aSN1EncodableVector.add(this.f99353p);
        aSN1EncodableVector.add(this.f99354q);
        aSN1EncodableVector.add(this.f99355x);
        aSN1EncodableVector.add(this.f99356y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException("Invalid GOST3410Parameter: " + obj.getClass().getName());
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f99351a = (ASN1Integer) objects.nextElement();
        this.f99352b = (ASN1Integer) objects.nextElement();
        this.f99353p = (ASN1Integer) objects.nextElement();
        this.f99354q = (ASN1Integer) objects.nextElement();
        this.f99355x = (ASN1Integer) objects.nextElement();
        this.f99356y = (ASN1Integer) objects.nextElement();
    }
}
