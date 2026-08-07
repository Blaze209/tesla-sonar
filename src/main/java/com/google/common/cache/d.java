package com.google.common.cache;

import java.util.logging.Level;
import java.util.logging.Logger;
import ou.a0;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class d<K, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final x<? extends com.google.common.cache.b> f43349q = y.b(new a());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final com.google.common.cache.e f43350r = new com.google.common.cache.e(0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final x<com.google.common.cache.b> f43351s = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final a0 f43352t = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    r<? super K, ? super V> f43358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g.r f43359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g.r f43360h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ou.f<Object> f43364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ou.f<Object> f43365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    o<? super K, ? super V> f43366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    a0 f43367o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f43353a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f43354b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f43355c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f43356d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f43357e = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f43361i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f43362j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f43363k = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    x<? extends com.google.common.cache.b> f43368p = f43349q;

    class a implements com.google.common.cache.b {
        a() {
        }

        @Override // com.google.common.cache.b
        public void a(int i11) {
        }

        @Override // com.google.common.cache.b
        public void b() {
        }

        @Override // com.google.common.cache.b
        public void c(long j11) {
        }

        @Override // com.google.common.cache.b
        public void d(int i11) {
        }

        @Override // com.google.common.cache.b
        public void e(long j11) {
        }
    }

    class b implements x<com.google.common.cache.b> {
        b() {
        }

        @Override // ou.x
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.b get() {
            return new com.google.common.cache.a();
        }
    }

    class c extends a0 {
        c() {
        }

        @Override // ou.a0
        public long a() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    private static final class C0678d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Logger f43369a = Logger.getLogger(d.class.getName());
    }

    enum e implements o<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.o
        public void onRemoval(p<Object, Object> pVar) {
        }
    }

    enum f implements r<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.r
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    private d() {
    }

    private void c() {
        ou.p.s(this.f43363k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void d() {
        if (this.f43358f == null) {
            ou.p.s(this.f43357e == -1, "maximumWeight requires weigher");
        } else if (this.f43353a) {
            ou.p.s(this.f43357e != -1, "weigher requires maximumWeight");
        } else if (this.f43357e == -1) {
            C0678d.f43369a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public static d<Object, Object> t() {
        return new d<>();
    }

    public <K1 extends K, V1 extends V> com.google.common.cache.c<K1, V1> a() {
        d();
        c();
        return new g.n(this);
    }

    public <K1 extends K, V1 extends V> com.google.common.cache.f<K1, V1> b(CacheLoader<? super K1, V1> cacheLoader) {
        d();
        return new g.m(this, cacheLoader);
    }

    int e() {
        int i11 = this.f43355c;
        if (i11 == -1) {
            return 4;
        }
        return i11;
    }

    long f() {
        long j11 = this.f43362j;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    long g() {
        long j11 = this.f43361i;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    int h() {
        int i11 = this.f43354b;
        if (i11 == -1) {
            return 16;
        }
        return i11;
    }

    ou.f<Object> i() {
        return (ou.f) ou.j.a(this.f43364l, j().defaultEquivalence());
    }

    g.r j() {
        return (g.r) ou.j.a(this.f43359g, g.r.STRONG);
    }

    long k() {
        if (this.f43361i == 0 || this.f43362j == 0) {
            return 0L;
        }
        return this.f43358f == null ? this.f43356d : this.f43357e;
    }

    long l() {
        long j11 = this.f43363k;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    <K1 extends K, V1 extends V> o<K1, V1> m() {
        return (o) ou.j.a(this.f43366n, e.INSTANCE);
    }

    x<? extends com.google.common.cache.b> n() {
        return this.f43368p;
    }

    a0 o(boolean z11) {
        a0 a0Var = this.f43367o;
        if (a0Var != null) {
            return a0Var;
        }
        return z11 ? a0.b() : f43352t;
    }

    ou.f<Object> p() {
        return (ou.f) ou.j.a(this.f43365m, q().defaultEquivalence());
    }

    g.r q() {
        return (g.r) ou.j.a(this.f43360h, g.r.STRONG);
    }

    <K1 extends K, V1 extends V> r<K1, V1> r() {
        return (r) ou.j.a(this.f43358f, f.INSTANCE);
    }

    public d<K, V> s(long j11) {
        long j12 = this.f43356d;
        ou.p.t(j12 == -1, "maximum size was already set to %s", j12);
        long j13 = this.f43357e;
        ou.p.t(j13 == -1, "maximum weight was already set to %s", j13);
        ou.p.s(this.f43358f == null, "maximum size can not be combined with weigher");
        ou.p.e(j11 >= 0, "maximum size must not be negative");
        this.f43356d = j11;
        return this;
    }

    public String toString() {
        ou.j.b bVarB = ou.j.b(this);
        int i11 = this.f43354b;
        if (i11 != -1) {
            bVarB.a("initialCapacity", i11);
        }
        int i12 = this.f43355c;
        if (i12 != -1) {
            bVarB.a("concurrencyLevel", i12);
        }
        long j11 = this.f43356d;
        if (j11 != -1) {
            bVarB.b("maximumSize", j11);
        }
        long j12 = this.f43357e;
        if (j12 != -1) {
            bVarB.b("maximumWeight", j12);
        }
        if (this.f43361i != -1) {
            bVarB.c("expireAfterWrite", this.f43361i + "ns");
        }
        if (this.f43362j != -1) {
            bVarB.c("expireAfterAccess", this.f43362j + "ns");
        }
        g.r rVar = this.f43359g;
        if (rVar != null) {
            bVarB.c("keyStrength", ou.c.e(rVar.toString()));
        }
        g.r rVar2 = this.f43360h;
        if (rVar2 != null) {
            bVarB.c("valueStrength", ou.c.e(rVar2.toString()));
        }
        if (this.f43364l != null) {
            bVarB.i("keyEquivalence");
        }
        if (this.f43365m != null) {
            bVarB.i("valueEquivalence");
        }
        if (this.f43366n != null) {
            bVarB.i("removalListener");
        }
        return bVarB.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> d<K1, V1> u(o<? super K1, ? super V1> oVar) {
        ou.p.r(this.f43366n == null);
        this.f43366n = (o) ou.p.m(oVar);
        return this;
    }
}
