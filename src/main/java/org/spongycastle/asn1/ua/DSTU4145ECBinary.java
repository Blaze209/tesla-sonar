package org.spongycastle.asn1.ua;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f99375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1OctetString f99376b;

    /* JADX INFO: renamed from: bp, reason: collision with root package name */
    ASN1OctetString f99377bp;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    DSTU4145BinaryField f99378f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ASN1Integer f99379n;
    BigInteger version;

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        this.version = BigInteger.valueOf(0L);
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            throw new IllegalArgumentException("only binary domain is possible");
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            this.f99378f = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            this.f99378f = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f99375a = new ASN1Integer(curve.getA().toBigInteger());
        this.f99376b = new DEROctetString(curve.getB().getEncoded());
        this.f99379n = new ASN1Integer(eCDomainParameters.getN());
        this.f99377bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
    }

    public static DSTU4145ECBinary getInstance(Object obj) {
        if (obj instanceof DSTU4145ECBinary) {
            return (DSTU4145ECBinary) obj;
        }
        if (obj != null) {
            return new DSTU4145ECBinary(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getA() {
        return this.f99375a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f99376b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f99378f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f99377bp.getOctets());
    }

    public BigInteger getN() {
        return this.f99379n.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version.compareTo(BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f99378f);
        aSN1EncodableVector.add(this.f99375a);
        aSN1EncodableVector.add(this.f99376b);
        aSN1EncodableVector.add(this.f99379n);
        aSN1EncodableVector.add(this.f99377bp);
        return new DERSequence(aSN1EncodableVector);
    }

    private DSTU4145ECBinary(ASN1Sequence aSN1Sequence) {
        this.version = BigInteger.valueOf(0L);
        int i11 = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (aSN1TaggedObject.isExplicit() && aSN1TaggedObject.getTagNo() == 0) {
                this.version = ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
                i11 = 1;
            } else {
                throw new IllegalArgumentException("object parse error");
            }
        }
        this.f99378f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i11));
        this.f99375a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i11 + 1));
        this.f99376b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i11 + 2));
        this.f99379n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i11 + 3));
        this.f99377bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i11 + 4));
    }
}
