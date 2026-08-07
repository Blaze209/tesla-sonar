package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes9.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f98529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f98530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f98531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f98532m;

    public DSTU4145BinaryField(int i11, int i12) {
        this(i11, i12, 0, 0);
    }

    public static DSTU4145BinaryField getInstance(Object obj) {
        if (obj instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj;
        }
        if (obj != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int getK1() {
        return this.f98530k;
    }

    public int getK2() {
        return this.f98529j;
    }

    public int getK3() {
        return this.f98531l;
    }

    public int getM() {
        return this.f98532m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new ASN1Integer(this.f98532m));
        if (this.f98529j == 0) {
            aSN1EncodableVector.add(new ASN1Integer(this.f98530k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(new ASN1Integer(this.f98530k));
            aSN1EncodableVector2.add(new ASN1Integer(this.f98529j));
            aSN1EncodableVector2.add(new ASN1Integer(this.f98531l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i11, int i12, int i13, int i14) {
        this.f98532m = i11;
        this.f98530k = i12;
        this.f98529j = i13;
        this.f98531l = i14;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f98532m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.f98530k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.f98530k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            this.f98529j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            this.f98531l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
    }
}
