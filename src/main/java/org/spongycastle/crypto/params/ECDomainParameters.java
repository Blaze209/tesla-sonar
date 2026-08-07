package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECConstants;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ECDomainParameters implements ECConstants {
    private ECPoint G;
    private ECCurve curve;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f99577h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f99578n;
    private byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ECDomainParameters) {
            ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
            if (this.curve.equals(eCDomainParameters.curve) && this.G.equals(eCDomainParameters.G) && this.f99578n.equals(eCDomainParameters.f99578n) && this.f99577h.equals(eCDomainParameters.f99577h)) {
                return true;
            }
        }
        return false;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.f99577h;
    }

    public BigInteger getN() {
        return this.f99578n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return (((((this.curve.hashCode() * 37) ^ this.G.hashCode()) * 37) ^ this.f99578n.hashCode()) * 37) ^ this.f99577h.hashCode();
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.G = eCPoint.normalize();
        this.f99578n = bigInteger;
        this.f99577h = bigInteger2;
        this.seed = bArr;
    }
}
