package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes9.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f98510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f98511b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f98512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f98513q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f98514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f98515y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i11, BigInteger bigInteger5) {
        this.f98510a = new ASN1Integer(bigInteger);
        this.f98511b = new ASN1Integer(bigInteger2);
        this.f98512p = new ASN1Integer(bigInteger3);
        this.f98513q = new ASN1Integer(bigInteger4);
        this.f98514x = new ASN1Integer(i11);
        this.f98515y = new ASN1Integer(bigInteger5);
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

    public BigInteger getA() {
        return this.f98510a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f98512p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f98513q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f98510a);
        aSN1EncodableVector.add(this.f98511b);
        aSN1EncodableVector.add(this.f98512p);
        aSN1EncodableVector.add(this.f98513q);
        aSN1EncodableVector.add(this.f98514x);
        aSN1EncodableVector.add(this.f98515y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f98510a = (ASN1Integer) objects.nextElement();
        this.f98511b = (ASN1Integer) objects.nextElement();
        this.f98512p = (ASN1Integer) objects.nextElement();
        this.f98513q = (ASN1Integer) objects.nextElement();
        this.f98514x = (ASN1Integer) objects.nextElement();
        this.f98515y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z11));
    }
}
