package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McEliecePublicKey extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GF2Matrix f99740g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99741n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f99742t;

    public McEliecePublicKey(int i11, int i12, GF2Matrix gF2Matrix) {
        this.f99741n = i11;
        this.f99742t = i12;
        this.f99740g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f99740g);
    }

    public int getN() {
        return this.f99741n;
    }

    public int getT() {
        return this.f99742t;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f99741n));
        aSN1EncodableVector.add(new ASN1Integer(this.f99742t));
        aSN1EncodableVector.add(new DEROctetString(this.f99740g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f99741n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue().intValue();
        this.f99742t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f99740g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
