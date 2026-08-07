package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes10.dex */
public class McElieceCCA2PublicKey extends ASN1Object {
    private final AlgorithmIdentifier digest;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final GF2Matrix f99735g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99736n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f99737t;

    public McElieceCCA2PublicKey(int i11, int i12, GF2Matrix gF2Matrix, AlgorithmIdentifier algorithmIdentifier) {
        this.f99736n = i11;
        this.f99737t = i12;
        this.f99735g = new GF2Matrix(gF2Matrix.getEncoded());
        this.digest = algorithmIdentifier;
    }

    public static McElieceCCA2PublicKey getInstance(Object obj) {
        if (obj instanceof McElieceCCA2PublicKey) {
            return (McElieceCCA2PublicKey) obj;
        }
        if (obj != null) {
            return new McElieceCCA2PublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public AlgorithmIdentifier getDigest() {
        return this.digest;
    }

    public GF2Matrix getG() {
        return this.f99735g;
    }

    public int getN() {
        return this.f99736n;
    }

    public int getT() {
        return this.f99737t;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f99736n));
        aSN1EncodableVector.add(new ASN1Integer(this.f99737t));
        aSN1EncodableVector.add(new DEROctetString(this.f99735g.getEncoded()));
        aSN1EncodableVector.add(this.digest);
        return new DERSequence(aSN1EncodableVector);
    }

    private McElieceCCA2PublicKey(ASN1Sequence aSN1Sequence) {
        this.f99736n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue().intValue();
        this.f99737t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f99735g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
        this.digest = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
    }
}
