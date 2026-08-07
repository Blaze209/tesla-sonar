package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McEliecePublicKey extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GF2Matrix f99010g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99011n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f99012t;

    public McEliecePublicKey(int i11, int i12, GF2Matrix gF2Matrix) {
        this.f99011n = i11;
        this.f99012t = i12;
        this.f99010g = new GF2Matrix(gF2Matrix);
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
        return new GF2Matrix(this.f99010g);
    }

    public int getN() {
        return this.f99011n;
    }

    public int getT() {
        return this.f99012t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f99011n));
        aSN1EncodableVector.add(new ASN1Integer(this.f99012t));
        aSN1EncodableVector.add(new DEROctetString(this.f99010g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f99011n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f99012t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f99010g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
