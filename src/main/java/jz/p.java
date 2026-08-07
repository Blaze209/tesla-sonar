package jz;

import ch.qos.logback.classic.Level;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Set<String> f84549p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f84550o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add(ClientData.KEY_TYPE);
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f84549p = Collections.unmodifiableSet(hashSet);
    }

    public p(o oVar, g gVar, String str, Set<String> set, URI uri, qz.d dVar, URI uri2, yz.c cVar, yz.c cVar2, List<yz.a> list, String str2, boolean z11, Map<String, Object> map, yz.c cVar3) {
        super(oVar, gVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (oVar.getName().equals(jz.a.f84432c.getName())) {
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
        this.f84550o = z11;
    }

    public static Set<String> s() {
        return f84549p;
    }

    public static p u(String str, yz.c cVar) {
        return v(yz.j.n(str, Level.INFO_INT), cVar);
    }

    public static p v(Map<String, Object> map, yz.c cVar) throws ParseException {
        jz.a aVarG = e.g(map);
        if (!(aVarG instanceof o)) {
            throw new ParseException("Not a JWS header", 0);
        }
        a aVarI = new a((o) aVarG).i(cVar);
        for (String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if (ClientData.KEY_TYPE.equals(str)) {
                    String strH = yz.j.h(map, str);
                    if (strH != null) {
                        aVarI = aVarI.j(new g(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarI = aVarI.c(yz.j.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = yz.j.j(map, str);
                    if (listJ != null) {
                        aVarI = aVarI.d(new HashSet(listJ));
                    }
                } else if ("jku".equals(str)) {
                    aVarI = aVarI.g(yz.j.k(map, str));
                } else if ("jwk".equals(str)) {
                    aVarI = aVarI.f(b.q(yz.j.f(map, str)));
                } else if ("x5u".equals(str)) {
                    aVarI = aVarI.n(yz.j.k(map, str));
                } else if ("x5t".equals(str)) {
                    aVarI = aVarI.m(yz.c.f(yz.j.h(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    aVarI = aVarI.l(yz.c.f(yz.j.h(map, str)));
                } else if ("x5c".equals(str)) {
                    aVarI = aVarI.k(yz.m.b(yz.j.e(map, str)));
                } else if ("kid".equals(str)) {
                    aVarI = aVarI.h(yz.j.h(map, str));
                } else {
                    aVarI = "b64".equals(str) ? aVarI.a(yz.j.b(map, str)) : aVarI.e(str, map.get(str));
                }
            }
        }
        return aVarI.b();
    }

    public static p w(yz.c cVar) {
        return u(cVar.c(), cVar);
    }

    @Override // jz.b, jz.e
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        if (!t()) {
            mapI.put("b64", Boolean.FALSE);
        }
        return mapI;
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ qz.d j() {
        return super.j();
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ URI k() {
        return super.k();
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ List m() {
        return super.m();
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ yz.c n() {
        return super.n();
    }

    @Override // jz.b
    @Deprecated
    public /* bridge */ /* synthetic */ yz.c o() {
        return super.o();
    }

    @Override // jz.b
    public /* bridge */ /* synthetic */ URI p() {
        return super.p();
    }

    public o r() {
        return (o) super.a();
    }

    public boolean t() {
        return this.f84550o;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f84551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f84552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f84553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Set<String> f84554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private URI f84555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qz.d f84556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private URI f84557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Deprecated
        private yz.c f84558h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private yz.c f84559i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<yz.a> f84560j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f84561k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f84562l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map<String, Object> f84563m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private yz.c f84564n;

        public a(o oVar) {
            this.f84562l = true;
            if (oVar.getName().equals(jz.a.f84432c.getName())) {
                throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }
            this.f84551a = oVar;
        }

        public a a(boolean z11) {
            this.f84562l = z11;
            return this;
        }

        public p b() {
            return new p(this.f84551a, this.f84552b, this.f84553c, this.f84554d, this.f84555e, this.f84556f, this.f84557g, this.f84558h, this.f84559i, this.f84560j, this.f84561k, this.f84562l, this.f84563m, this.f84564n);
        }

        public a c(String str) {
            this.f84553c = str;
            return this;
        }

        public a d(Set<String> set) {
            this.f84554d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!p.s().contains(str)) {
                if (this.f84563m == null) {
                    this.f84563m = new HashMap();
                }
                this.f84563m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(qz.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f84556f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f84555e = uri;
            return this;
        }

        public a h(String str) {
            this.f84561k = str;
            return this;
        }

        public a i(yz.c cVar) {
            this.f84564n = cVar;
            return this;
        }

        public a j(g gVar) {
            this.f84552b = gVar;
            return this;
        }

        public a k(List<yz.a> list) {
            this.f84560j = list;
            return this;
        }

        public a l(yz.c cVar) {
            this.f84559i = cVar;
            return this;
        }

        @Deprecated
        public a m(yz.c cVar) {
            this.f84558h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f84557g = uri;
            return this;
        }

        public a(p pVar) {
            this(pVar.r());
            this.f84552b = pVar.f();
            this.f84553c = pVar.b();
            this.f84554d = pVar.c();
            this.f84555e = pVar.k();
            this.f84556f = pVar.j();
            this.f84557g = pVar.p();
            this.f84558h = pVar.o();
            this.f84559i = pVar.n();
            this.f84560j = pVar.m();
            this.f84561k = pVar.l();
            this.f84562l = pVar.t();
            this.f84563m = pVar.e();
        }
    }
}
