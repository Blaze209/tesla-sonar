package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class j implements l, hj.h.a, o.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final boolean f20646i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f20647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f20648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hj.h f20649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f20650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f20651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f20652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f20653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f20654h;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f20655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final u5.f<h<?>> f20656b = yj.a.d(150, new C0419a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20657c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C0419a implements yj.a.d<h<?>> {
            C0419a() {
            }

            @Override // yj.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h<?> create() {
                a aVar = a.this;
                return new h<>(aVar.f20655a, aVar.f20656b);
            }
        }

        a(h.e eVar) {
            this.f20655a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.e eVar, Object obj, m mVar, dj.e eVar2, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, fj.a aVar, Map<Class<?>, dj.l<?>> map, boolean z11, boolean z12, boolean z13, dj.h hVar2, h.b<R> bVar) {
            h hVar3 = (h) xj.k.d(this.f20656b.b());
            int i13 = this.f20657c;
            this.f20657c = i13 + 1;
            return hVar3.n(eVar, obj, mVar, eVar2, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, z13, hVar2, bVar, i13);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ij.a f20659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ij.a f20660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ij.a f20661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ij.a f20662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final l f20663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final o.a f20664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final u5.f<k<?>> f20665g = yj.a.d(150, new a());

        class a implements yj.a.d<k<?>> {
            a() {
            }

            @Override // yj.a.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k<?> create() {
                b bVar = b.this;
                return new k<>(bVar.f20659a, bVar.f20660b, bVar.f20661c, bVar.f20662d, bVar.f20663e, bVar.f20664f, bVar.f20665g);
            }
        }

        b(ij.a aVar, ij.a aVar2, ij.a aVar3, ij.a aVar4, l lVar, o.a aVar5) {
            this.f20659a = aVar;
            this.f20660b = aVar2;
            this.f20661c = aVar3;
            this.f20662d = aVar4;
            this.f20663e = lVar;
            this.f20664f = aVar5;
        }

        <R> k<R> a(dj.e eVar, boolean z11, boolean z12, boolean z13, boolean z14) {
            return ((k) xj.k.d(this.f20665g.b())).l(eVar, z11, z12, z13, z14);
        }

        void b() {
            xj.e.c(this.f20659a);
            xj.e.c(this.f20660b);
            xj.e.c(this.f20661c);
            xj.e.c(this.f20662d);
        }
    }

    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hj.a.InterfaceC1535a f20667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile hj.a f20668b;

        c(hj.a.InterfaceC1535a interfaceC1535a) {
            this.f20667a = interfaceC1535a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public hj.a a() {
            if (this.f20668b == null) {
                synchronized (this) {
                    try {
                        if (this.f20668b == null) {
                            this.f20668b = this.f20667a.build();
                        }
                        if (this.f20668b == null) {
                            this.f20668b = new hj.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f20668b;
        }

        synchronized void b() {
            if (this.f20668b == null) {
                return;
            }
            this.f20668b.clear();
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k<?> f20669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.j f20670b;

        d(com.bumptech.glide.request.j jVar, k<?> kVar) {
            this.f20670b = jVar;
            this.f20669a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f20669a.r(this.f20670b);
            }
        }
    }

    public j(hj.h hVar, hj.a.InterfaceC1535a interfaceC1535a, ij.a aVar, ij.a aVar2, ij.a aVar3, ij.a aVar4, boolean z11) {
        this(hVar, interfaceC1535a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z11);
    }

    private o<?> f(dj.e eVar) {
        fj.c<?> cVarC = this.f20649c.c(eVar);
        if (cVarC == null) {
            return null;
        }
        return cVarC instanceof o ? (o) cVarC : new o<>(cVarC, true, true, eVar, this);
    }

    private o<?> h(dj.e eVar) {
        o<?> oVarE = this.f20654h.e(eVar);
        if (oVarE != null) {
            oVarE.b();
        }
        return oVarE;
    }

    private o<?> i(dj.e eVar) {
        o<?> oVarF = f(eVar);
        if (oVarF != null) {
            oVarF.b();
            this.f20654h.a(eVar, oVarF);
        }
        return oVarF;
    }

    private o<?> j(m mVar, boolean z11, long j11) {
        if (!z11) {
            return null;
        }
        o<?> oVarH = h(mVar);
        if (oVarH != null) {
            if (f20646i) {
                k("Loaded resource from active resources", j11, mVar);
            }
            return oVarH;
        }
        o<?> oVarI = i(mVar);
        if (oVarI == null) {
            return null;
        }
        if (f20646i) {
            k("Loaded resource from cache", j11, mVar);
        }
        return oVarI;
    }

    private static void k(String str, long j11, dj.e eVar) {
        Log.v("Engine", str + " in " + xj.g.a(j11) + "ms, key: " + eVar);
    }

    private <R> d n(com.bumptech.glide.e eVar, Object obj, dj.e eVar2, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, fj.a aVar, Map<Class<?>, dj.l<?>> map, boolean z11, boolean z12, dj.h hVar2, boolean z13, boolean z14, boolean z15, boolean z16, com.bumptech.glide.request.j jVar, Executor executor, m mVar, long j11) {
        k<?> kVarA = this.f20647a.a(mVar, z16);
        if (kVarA != null) {
            kVarA.a(jVar, executor);
            if (f20646i) {
                k("Added to existing load", j11, mVar);
            }
            return new d(jVar, kVarA);
        }
        k<R> kVarA2 = this.f20650d.a(mVar, z13, z14, z15, z16);
        h<R> hVarA = this.f20653g.a(eVar, obj, mVar, eVar2, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, z16, hVar2, kVarA2);
        this.f20647a.c(mVar, kVarA2);
        kVarA2.a(jVar, executor);
        kVarA2.s(hVarA);
        if (f20646i) {
            k("Started new load", j11, mVar);
        }
        return new d(jVar, kVarA2);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void a(k<?> kVar, dj.e eVar) {
        this.f20647a.d(eVar, kVar);
    }

    @Override // hj.h.a
    public void b(@NonNull fj.c<?> cVar) {
        this.f20651e.a(cVar, true);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void c(k<?> kVar, dj.e eVar, o<?> oVar) {
        if (oVar != null) {
            try {
                if (oVar.d()) {
                    this.f20654h.a(eVar, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f20647a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void d(dj.e eVar, o<?> oVar) {
        this.f20654h.d(eVar);
        if (oVar.d()) {
            this.f20649c.d(eVar, oVar);
        } else {
            this.f20651e.a(oVar, false);
        }
    }

    public void e() {
        this.f20652f.a().clear();
    }

    public <R> d g(com.bumptech.glide.e eVar, Object obj, dj.e eVar2, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, fj.a aVar, Map<Class<?>, dj.l<?>> map, boolean z11, boolean z12, dj.h hVar2, boolean z13, boolean z14, boolean z15, boolean z16, com.bumptech.glide.request.j jVar, Executor executor) {
        long jB = f20646i ? xj.g.b() : 0L;
        m mVarA = this.f20648b.a(obj, eVar2, i11, i12, map, cls, cls2, hVar2);
        synchronized (this) {
            try {
                o<?> oVarJ = j(mVarA, z13, jB);
                if (oVarJ == null) {
                    return n(eVar, obj, eVar2, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, hVar2, z13, z14, z15, z16, jVar, executor, mVarA, jB);
                }
                jVar.c(oVarJ, dj.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(fj.c<?> cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).e();
    }

    public void m() {
        this.f20650d.b();
        this.f20652f.b();
        this.f20654h.g();
    }

    j(hj.h hVar, hj.a.InterfaceC1535a interfaceC1535a, ij.a aVar, ij.a aVar2, ij.a aVar3, ij.a aVar4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, u uVar, boolean z11) {
        this.f20649c = hVar;
        c cVar = new c(interfaceC1535a);
        this.f20652f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z11) : aVar5;
        this.f20654h = aVar7;
        aVar7.f(this);
        this.f20648b = nVar == null ? new n() : nVar;
        this.f20647a = pVar == null ? new p() : pVar;
        this.f20650d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f20653g = aVar6 == null ? new a(cVar) : aVar6;
        this.f20651e = uVar == null ? new u() : uVar;
        hVar.e(this);
    }
}
