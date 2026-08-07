package qz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final yz.c f106268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final yz.c f106269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yz.c f106270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final yz.c f106271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final yz.c f106272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final yz.c f106273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final yz.c f106274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final yz.c f106275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<a> f106276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final PrivateKey f106277u;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yz.c f106278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yz.c f106279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yz.c f106280c;

        public a(yz.c cVar, yz.c cVar2, yz.c cVar3) {
            if (cVar == null) {
                throw new IllegalArgumentException("The prime factor must not be null");
            }
            this.f106278a = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            this.f106279b = cVar2;
            if (cVar3 == null) {
                throw new IllegalArgumentException("The factor CRT coefficient must not be null");
            }
            this.f106280c = cVar3;
        }
    }

    public l(yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4, yz.c cVar5, yz.c cVar6, yz.c cVar7, yz.c cVar8, List<a> list, PrivateKey privateKey, h hVar, Set<f> set, jz.a aVar, String str, URI uri, yz.c cVar9, yz.c cVar10, List<yz.a> list2, KeyStore keyStore) {
        super(g.f106252d, hVar, set, aVar, str, uri, cVar9, cVar10, list2, keyStore);
        if (cVar == null) {
            throw new IllegalArgumentException("The modulus value must not be null");
        }
        this.f106268l = cVar;
        if (cVar2 == null) {
            throw new IllegalArgumentException("The public exponent value must not be null");
        }
        this.f106269m = cVar2;
        if (f() != null && !o(f().get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
        this.f106270n = cVar3;
        if (cVar4 != null && cVar5 != null && cVar6 != null && cVar7 != null && cVar8 != null) {
            this.f106271o = cVar4;
            this.f106272p = cVar5;
            this.f106273q = cVar6;
            this.f106274r = cVar7;
            this.f106275s = cVar8;
            if (list != null) {
                this.f106276t = Collections.unmodifiableList(list);
            } else {
                this.f106276t = Collections.EMPTY_LIST;
            }
        } else if (cVar4 == null && cVar5 == null && cVar6 == null && cVar7 == null && cVar8 == null && list == null) {
            this.f106271o = null;
            this.f106272p = null;
            this.f106273q = null;
            this.f106274r = null;
            this.f106275s = null;
            this.f106276t = Collections.EMPTY_LIST;
        } else {
            if (cVar4 != null || cVar5 != null || cVar6 != null || cVar7 != null || cVar8 != null) {
                if (cVar4 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first prime factor must not be null");
                }
                if (cVar5 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second prime factor must not be null");
                }
                if (cVar6 == null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first factor CRT exponent must not be null");
                }
                if (cVar7 != null) {
                    throw new IllegalArgumentException("Incomplete second private (CRT) representation: The first CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("Incomplete second private (CRT) representation: The second factor CRT exponent must not be null");
            }
            this.f106271o = null;
            this.f106272p = null;
            this.f106273q = null;
            this.f106274r = null;
            this.f106275s = null;
            this.f106276t = Collections.EMPTY_LIST;
        }
        this.f106277u = privateKey;
    }

    public static l p(Map<String, Object> map) throws ParseException {
        ArrayList arrayList;
        List<Object> listE;
        if (!g.f106252d.equals(e.d(map))) {
            throw new ParseException("The key type \"kty\" must be RSA", 0);
        }
        yz.c cVarA = yz.j.a(map, "n");
        yz.c cVarA2 = yz.j.a(map, "e");
        yz.c cVarA3 = yz.j.a(map, DateTokenConverter.CONVERTER_KEY);
        yz.c cVarA4 = yz.j.a(map, "p");
        yz.c cVarA5 = yz.j.a(map, "q");
        yz.c cVarA6 = yz.j.a(map, "dp");
        yz.c cVarA7 = yz.j.a(map, "dq");
        yz.c cVarA8 = yz.j.a(map, "qi");
        if (!map.containsKey("oth") || (listE = yz.j.e(map, "oth")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(listE.size());
            for (Object obj : listE) {
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    try {
                        arrayList.add(new a(yz.j.a(map2, "r"), yz.j.a(map2, "dq"), yz.j.a(map2, "t")));
                    } catch (IllegalArgumentException e11) {
                        throw new ParseException(e11.getMessage(), 0);
                    }
                }
            }
        }
        try {
            return new l(cVarA, cVarA2, cVarA3, cVarA4, cVarA5, cVarA6, cVarA7, cVarA8, arrayList, null, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
        } catch (IllegalArgumentException e12) {
            throw new ParseException(e12.getMessage(), 0);
        }
    }

    @Override // qz.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f106268l, lVar.f106268l) && Objects.equals(this.f106269m, lVar.f106269m) && Objects.equals(this.f106270n, lVar.f106270n) && Objects.equals(this.f106271o, lVar.f106271o) && Objects.equals(this.f106272p, lVar.f106272p) && Objects.equals(this.f106273q, lVar.f106273q) && Objects.equals(this.f106274r, lVar.f106274r) && Objects.equals(this.f106275s, lVar.f106275s) && Objects.equals(this.f106276t, lVar.f106276t) && Objects.equals(this.f106277u, lVar.f106277u);
    }

    @Override // qz.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f106268l, this.f106269m, this.f106270n, this.f106271o, this.f106272p, this.f106273q, this.f106274r, this.f106275s, this.f106276t, this.f106277u);
    }

    @Override // qz.d
    public boolean k() {
        return (this.f106270n == null && this.f106271o == null && this.f106277u == null) ? false : true;
    }

    @Override // qz.d
    public Map<String, Object> m() {
        Map<String, Object> mapM = super.m();
        mapM.put("n", this.f106268l.toString());
        mapM.put("e", this.f106269m.toString());
        yz.c cVar = this.f106270n;
        if (cVar != null) {
            mapM.put(DateTokenConverter.CONVERTER_KEY, cVar.toString());
        }
        yz.c cVar2 = this.f106271o;
        if (cVar2 != null) {
            mapM.put("p", cVar2.toString());
        }
        yz.c cVar3 = this.f106272p;
        if (cVar3 != null) {
            mapM.put("q", cVar3.toString());
        }
        yz.c cVar4 = this.f106273q;
        if (cVar4 != null) {
            mapM.put("dp", cVar4.toString());
        }
        yz.c cVar5 = this.f106274r;
        if (cVar5 != null) {
            mapM.put("dq", cVar5.toString());
        }
        yz.c cVar6 = this.f106275s;
        if (cVar6 != null) {
            mapM.put("qi", cVar6.toString());
        }
        List<a> list = this.f106276t;
        if (list != null && !list.isEmpty()) {
            List<Object> listA = yz.i.a();
            for (a aVar : this.f106276t) {
                Map<String, Object> mapL = yz.j.l();
                mapL.put("r", aVar.f106278a.toString());
                mapL.put(DateTokenConverter.CONVERTER_KEY, aVar.f106279b.toString());
                mapL.put("t", aVar.f106280c.toString());
                listA.add(mapL);
            }
            mapM.put("oth", listA);
        }
        return mapM;
    }

    public boolean o(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) f().get(0).getPublicKey();
            if (this.f106269m.b().equals(rSAPublicKey.getPublicExponent())) {
                return this.f106268l.b().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
