package org.spongycastle.asn1.x9;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECCurve f99406c;
    private final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ECPoint f99407p;

    public X9ECPoint(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f99407p == null) {
                this.f99407p = this.f99406c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f99407p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b11;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b11 = octets[0]) == 2 || b11 == 3);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECPoint eCPoint, boolean z11) {
        this.f99407p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z11));
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f99406c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }
}
