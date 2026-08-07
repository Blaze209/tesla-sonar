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
public final class l extends b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Set<String> f84495y;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f84496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final qz.d f84497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c f84498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final yz.c f84499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final yz.c f84500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yz.c f84501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f84502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final yz.c f84503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final yz.c f84504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f84505x;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f84506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f84507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g f84508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f84509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set<String> f84510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private URI f84511f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qz.d f84512g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private URI f84513h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        private yz.c f84514i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private yz.c f84515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<yz.a> f84516k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f84517l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private qz.d f84518m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f84519n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private yz.c f84520o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private yz.c f84521p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private yz.c f84522q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f84523r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private yz.c f84524s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private yz.c f84525t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private String f84526u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Map<String, Object> f84527v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private yz.c f84528w;

        public a(h hVar, d dVar) {
            if (hVar.getName().equals(jz.a.f84432c.getName())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.f84506a = hVar;
            if (dVar == null) {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.f84507b = dVar;
        }

        public a a(yz.c cVar) {
            this.f84520o = cVar;
            return this;
        }

        public a b(yz.c cVar) {
            this.f84521p = cVar;
            return this;
        }

        public a c(yz.c cVar) {
            this.f84525t = cVar;
            return this;
        }

        public l d() {
            return new l(this.f84506a, this.f84507b, this.f84508c, this.f84509d, this.f84510e, this.f84511f, this.f84512g, this.f84513h, this.f84514i, this.f84515j, this.f84516k, this.f84517l, this.f84518m, this.f84519n, this.f84520o, this.f84521p, this.f84522q, this.f84523r, this.f84524s, this.f84525t, this.f84526u, this.f84527v, this.f84528w);
        }

        public a e(c cVar) {
            this.f84519n = cVar;
            return this;
        }

        public a f(String str) {
            this.f84509d = str;
            return this;
        }

        public a g(Set<String> set) {
            this.f84510e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!l.u().contains(str)) {
                if (this.f84527v == null) {
                    this.f84527v = new HashMap();
                }
                this.f84527v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(qz.d dVar) {
            this.f84518m = dVar;
            return this;
        }

        public a j(yz.c cVar) {
            this.f84524s = cVar;
            return this;
        }

        public a k(qz.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f84512g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f84511f = uri;
            return this;
        }

        public a m(String str) {
            this.f84517l = str;
            return this;
        }

        public a n(yz.c cVar) {
            this.f84528w = cVar;
            return this;
        }

        public a o(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.f84523r = i11;
            return this;
        }

        public a p(yz.c cVar) {
            this.f84522q = cVar;
            return this;
        }

        public a q(String str) {
            this.f84526u = str;
            return this;
        }

        public a r(g gVar) {
            this.f84508c = gVar;
            return this;
        }

        public a s(List<yz.a> list) {
            this.f84516k = list;
            return this;
        }

        public a t(yz.c cVar) {
            this.f84515j = cVar;
            return this;
        }

        @Deprecated
        public a u(yz.c cVar) {
            this.f84514i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f84513h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        f84495y = Collections.unmodifiableSet(hashSet);
    }

    public l(jz.a aVar, d dVar, g gVar, String str, Set<String> set, URI uri, qz.d dVar2, URI uri2, yz.c cVar, yz.c cVar2, List<yz.a> list, String str2, qz.d dVar3, c cVar3, yz.c cVar4, yz.c cVar5, yz.c cVar6, int i11, yz.c cVar7, yz.c cVar8, String str3, Map<String, Object> map, yz.c cVar9) {
        super(aVar, gVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.getName().equals(jz.a.f84432c.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (dVar3 != null && dVar3.k()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.f84496o = dVar;
        this.f84497p = dVar3;
        this.f84498q = cVar3;
        this.f84499r = cVar4;
        this.f84500s = cVar5;
        this.f84501t = cVar6;
        this.f84502u = i11;
        this.f84503v = cVar7;
        this.f84504w = cVar8;
        this.f84505x = str3;
    }

    public static Set<String> u() {
        return f84495y;
    }

    public static l v(String str, yz.c cVar) {
        return w(yz.j.n(str, Level.INFO_INT), cVar);
    }

    public static l w(Map<String, Object> map, yz.c cVar) throws ParseException {
        jz.a aVarG = e.g(map);
        if (!(aVarG instanceof h)) {
            throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
        }
        a aVarN = new a((h) aVarG, y(map)).n(cVar);
        for (String str : map.keySet()) {
            if (!"alg".equals(str) && !"enc".equals(str)) {
                if (ClientData.KEY_TYPE.equals(str)) {
                    String strH = yz.j.h(map, str);
                    if (strH != null) {
                        aVarN = aVarN.r(new g(strH));
                    }
                } else if ("cty".equals(str)) {
                    aVarN = aVarN.f(yz.j.h(map, str));
                } else if ("crit".equals(str)) {
                    List<String> listJ = yz.j.j(map, str);
                    if (listJ != null) {
                        aVarN = aVarN.g(new HashSet(listJ));
                    }
                } else if ("jku".equals(str)) {
                    aVarN = aVarN.l(yz.j.k(map, str));
                } else if ("jwk".equals(str)) {
                    aVarN = aVarN.k(b.q(yz.j.f(map, str)));
                } else if ("x5u".equals(str)) {
                    aVarN = aVarN.v(yz.j.k(map, str));
                } else if ("x5t".equals(str)) {
                    aVarN = aVarN.u(yz.c.f(yz.j.h(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    aVarN = aVarN.t(yz.c.f(yz.j.h(map, str)));
                } else if ("x5c".equals(str)) {
                    aVarN = aVarN.s(yz.m.b(yz.j.e(map, str)));
                } else if ("kid".equals(str)) {
                    aVarN = aVarN.m(yz.j.h(map, str));
                } else if ("epk".equals(str)) {
                    aVarN = aVarN.i(qz.d.l(yz.j.f(map, str)));
                } else if ("zip".equals(str)) {
                    String strH2 = yz.j.h(map, str);
                    if (strH2 != null) {
                        aVarN = aVarN.e(new c(strH2));
                    }
                } else if ("apu".equals(str)) {
                    aVarN = aVarN.a(yz.c.f(yz.j.h(map, str)));
                } else if ("apv".equals(str)) {
                    aVarN = aVarN.b(yz.c.f(yz.j.h(map, str)));
                } else if ("p2s".equals(str)) {
                    aVarN = aVarN.p(yz.c.f(yz.j.h(map, str)));
                } else if ("p2c".equals(str)) {
                    aVarN = aVarN.o(yz.j.d(map, str));
                } else if ("iv".equals(str)) {
                    aVarN = aVarN.j(yz.c.f(yz.j.h(map, str)));
                } else if ("tag".equals(str)) {
                    aVarN = aVarN.c(yz.c.f(yz.j.h(map, str)));
                } else {
                    aVarN = "skid".equals(str) ? aVarN.q(yz.j.h(map, str)) : aVarN.h(str, map.get(str));
                }
            }
        }
        return aVarN.d();
    }

    public static l x(yz.c cVar) {
        return v(cVar.c(), cVar);
    }

    private static d y(Map<String, Object> map) {
        return d.c(yz.j.h(map, "enc"));
    }

    @Override // jz.b, jz.e
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        d dVar = this.f84496o;
        if (dVar != null) {
            mapI.put("enc", dVar.toString());
        }
        qz.d dVar2 = this.f84497p;
        if (dVar2 != null) {
            mapI.put("epk", dVar2.m());
        }
        c cVar = this.f84498q;
        if (cVar != null) {
            mapI.put("zip", cVar.toString());
        }
        yz.c cVar2 = this.f84499r;
        if (cVar2 != null) {
            mapI.put("apu", cVar2.toString());
        }
        yz.c cVar3 = this.f84500s;
        if (cVar3 != null) {
            mapI.put("apv", cVar3.toString());
        }
        yz.c cVar4 = this.f84501t;
        if (cVar4 != null) {
            mapI.put("p2s", cVar4.toString());
        }
        int i11 = this.f84502u;
        if (i11 > 0) {
            mapI.put("p2c", Integer.valueOf(i11));
        }
        yz.c cVar5 = this.f84503v;
        if (cVar5 != null) {
            mapI.put("iv", cVar5.toString());
        }
        yz.c cVar6 = this.f84504w;
        if (cVar6 != null) {
            mapI.put("tag", cVar6.toString());
        }
        String str = this.f84505x;
        if (str != null) {
            mapI.put("skid", str);
        }
        return mapI;
    }

    public h r() {
        return (h) super.a();
    }

    public c s() {
        return this.f84498q;
    }

    public d t() {
        return this.f84496o;
    }
}
