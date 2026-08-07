package qz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.nimbusds.jose.JOSEException;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set<qz.a> f106216q = Collections.unmodifiableSet(new HashSet(Arrays.asList(qz.a.f106204d, qz.a.f106205e, qz.a.f106207g, qz.a.f106208h)));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final qz.a f106217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final yz.c f106218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yz.c f106219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final yz.c f106220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PrivateKey f106221p;

    public b(qz.a aVar, yz.c cVar, yz.c cVar2, h hVar, Set<f> set, jz.a aVar2, String str, URI uri, yz.c cVar3, yz.c cVar4, List<yz.a> list, KeyStore keyStore) {
        super(g.f106251c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.f106217l = aVar;
        if (cVar == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.f106218m = cVar;
        if (cVar2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.f106219n = cVar2;
        q(aVar, cVar, cVar2);
        p(f());
        this.f106220o = null;
        this.f106221p = null;
    }

    public static yz.c o(int i11, BigInteger bigInteger) {
        byte[] bArrA = yz.d.a(bigInteger);
        int i12 = (i11 + 7) / 8;
        if (bArrA.length >= i12) {
            return yz.c.e(bArrA);
        }
        byte[] bArr = new byte[i12];
        System.arraycopy(bArrA, 0, bArr, i12 - bArrA.length, bArrA.length);
        return yz.c.e(bArr);
    }

    private void p(List<X509Certificate> list) {
        if (list != null && !u(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void q(qz.a aVar, yz.c cVar, yz.c cVar2) {
        if (!f106216q.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        if (oz.b.a(cVar.b(), cVar2.b(), aVar.e())) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
    }

    public static b v(String str) {
        return w(yz.j.m(str));
    }

    public static b w(Map<String, Object> map) throws ParseException {
        if (!g.f106251c.equals(e.d(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            qz.a aVarD = qz.a.d(yz.j.h(map, "crv"));
            yz.c cVarA = yz.j.a(map, "x");
            yz.c cVarA2 = yz.j.a(map, "y");
            yz.c cVarA3 = yz.j.a(map, DateTokenConverter.CONVERTER_KEY);
            try {
                return cVarA3 == null ? new b(aVarD, cVarA, cVarA2, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null) : new b(aVarD, cVarA, cVarA2, cVarA3, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), (KeyStore) null);
            } catch (IllegalArgumentException e11) {
                throw new ParseException(e11.getMessage(), 0);
            }
        } catch (IllegalArgumentException e12) {
            throw new ParseException(e12.getMessage(), 0);
        }
    }

    @Override // qz.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f106217l, bVar.f106217l) && Objects.equals(this.f106218m, bVar.f106218m) && Objects.equals(this.f106219n, bVar.f106219n) && Objects.equals(this.f106220o, bVar.f106220o) && Objects.equals(this.f106221p, bVar.f106221p);
    }

    @Override // qz.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f106217l, this.f106218m, this.f106219n, this.f106220o, this.f106221p);
    }

    @Override // qz.d
    public boolean k() {
        return (this.f106220o == null && this.f106221p == null) ? false : true;
    }

    @Override // qz.d
    public Map<String, Object> m() {
        Map<String, Object> mapM = super.m();
        mapM.put("crv", this.f106217l.toString());
        mapM.put("x", this.f106218m.toString());
        mapM.put("y", this.f106219n.toString());
        yz.c cVar = this.f106220o;
        if (cVar != null) {
            mapM.put(DateTokenConverter.CONVERTER_KEY, cVar.toString());
        }
        return mapM;
    }

    public qz.a r() {
        return this.f106217l;
    }

    public yz.c s() {
        return this.f106218m;
    }

    public yz.c t() {
        return this.f106219n;
    }

    public boolean u(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) f().get(0).getPublicKey();
            if (s().b().equals(eCPublicKey.getW().getAffineX())) {
                return t().b().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public ECPublicKey x() {
        return y(null);
    }

    public ECPublicKey y(Provider provider) throws JOSEException {
        ECParameterSpec eCParameterSpecE = this.f106217l.e();
        if (eCParameterSpecE == null) {
            throw new JOSEException("Couldn't get EC parameter spec for curve " + this.f106217l);
        }
        try {
            return (ECPublicKey) (provider == null ? KeyFactory.getInstance("EC") : KeyFactory.getInstance("EC", provider)).generatePublic(new ECPublicKeySpec(new ECPoint(this.f106218m.b(), this.f106219n.b()), eCParameterSpecE));
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            throw new JOSEException(e.getMessage(), e);
        } catch (InvalidKeySpecException e12) {
            e = e12;
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public b z() {
        return new b(r(), s(), t(), e(), c(), a(), b(), j(), i(), h(), g(), d());
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qz.a f106222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yz.c f106223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yz.c f106224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private yz.c f106225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PrivateKey f106226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h f106227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Set<f> f106228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private jz.a f106229h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f106230i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private URI f106231j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        private yz.c f106232k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private yz.c f106233l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<yz.a> f106234m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private KeyStore f106235n;

        public a(qz.a aVar, yz.c cVar, yz.c cVar2) {
            if (aVar == null) {
                throw new IllegalArgumentException("The curve must not be null");
            }
            this.f106222a = aVar;
            if (cVar == null) {
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            this.f106223b = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            this.f106224c = cVar2;
        }

        public b a() {
            try {
                if (this.f106225d == null && this.f106226e == null) {
                    return new b(this.f106222a, this.f106223b, this.f106224c, this.f106227f, this.f106228g, this.f106229h, this.f106230i, this.f106231j, this.f106232k, this.f106233l, this.f106234m, this.f106235n);
                }
                return this.f106226e != null ? new b(this.f106222a, this.f106223b, this.f106224c, this.f106226e, this.f106227f, this.f106228g, this.f106229h, this.f106230i, this.f106231j, this.f106232k, this.f106233l, this.f106234m, this.f106235n) : new b(this.f106222a, this.f106223b, this.f106224c, this.f106225d, this.f106227f, this.f106228g, this.f106229h, this.f106230i, this.f106231j, this.f106232k, this.f106233l, this.f106234m, this.f106235n);
            } catch (IllegalArgumentException e11) {
                throw new IllegalStateException(e11.getMessage(), e11);
            }
        }

        public a b(String str) {
            this.f106230i = str;
            return this;
        }

        public a c(h hVar) {
            this.f106227f = hVar;
            return this;
        }

        public a(qz.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(qz.a aVar, yz.c cVar, yz.c cVar2, yz.c cVar3, h hVar, Set<f> set, jz.a aVar2, String str, URI uri, yz.c cVar4, yz.c cVar5, List<yz.a> list, KeyStore keyStore) {
        super(g.f106251c, hVar, set, aVar2, str, uri, cVar4, cVar5, list, keyStore);
        if (aVar != null) {
            this.f106217l = aVar;
            if (cVar != null) {
                this.f106218m = cVar;
                if (cVar2 != null) {
                    this.f106219n = cVar2;
                    q(aVar, cVar, cVar2);
                    p(f());
                    if (cVar3 != null) {
                        this.f106220o = cVar3;
                        this.f106221p = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public b(qz.a aVar, yz.c cVar, yz.c cVar2, PrivateKey privateKey, h hVar, Set<f> set, jz.a aVar2, String str, URI uri, yz.c cVar3, yz.c cVar4, List<yz.a> list, KeyStore keyStore) {
        super(g.f106251c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f106217l = aVar;
            if (cVar != null) {
                this.f106218m = cVar;
                if (cVar2 != null) {
                    this.f106219n = cVar2;
                    q(aVar, cVar, cVar2);
                    p(f());
                    this.f106220o = null;
                    this.f106221p = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
