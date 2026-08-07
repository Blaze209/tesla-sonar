package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECCurve f98564c;
    private final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ECPoint f98565p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f98565p == null) {
                this.f98565p = this.f98564c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f98565p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b11;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b11 = octets[0]) == 2 || b11 == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f98564c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z11) {
        this.f98565p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z11));
    }
}
