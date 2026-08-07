package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f99013h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f99014k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f99015t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f99016w;

    public ParSet(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f99015t = i11;
        this.f99013h = iArr;
        this.f99016w = iArr2;
        this.f99014k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException("BigInteger not in Range: " + iIntValueExact);
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f99013h);
    }

    public int[] getK() {
        return Arrays.clone(this.f99014k);
    }

    public int getT() {
        return this.f99015t;
    }

    public int[] getW() {
        return Arrays.clone(this.f99016w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i11 = 0; i11 < this.f99013h.length; i11++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f99013h[i11]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f99016w[i11]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f99014k[i11]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f99015t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException("sie of seqOfParams = " + aSN1Sequence.size());
        }
        this.f99015t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f99015t || aSN1Sequence3.size() != this.f99015t || aSN1Sequence4.size() != this.f99015t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f99013h = new int[aSN1Sequence2.size()];
        this.f99016w = new int[aSN1Sequence3.size()];
        this.f99014k = new int[aSN1Sequence4.size()];
        for (int i11 = 0; i11 < this.f99015t; i11++) {
            this.f99013h[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i11));
            this.f99016w[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i11));
            this.f99014k[i11] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i11));
        }
    }
}
