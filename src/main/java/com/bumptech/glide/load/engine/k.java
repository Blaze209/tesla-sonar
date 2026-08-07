package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class k<R> implements h.b<R>, yj.a.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final c f20672z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f20673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj.c f20674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.a f20675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u5.f<k<?>> f20676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f20677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f20678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ij.a f20679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij.a f20680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ij.a f20681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ij.a f20682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f20683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private dj.e f20684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private fj.c<?> f20689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    dj.a f20690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    GlideException f20692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    o<?> f20694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h<R> f20695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f20696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f20697y;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.j f20698a;

        a(com.bumptech.glide.request.j jVar) {
            this.f20698a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20698a.h()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f20673a.b(this.f20698a)) {
                            k.this.f(this.f20698a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.j f20700a;

        b(com.bumptech.glide.request.j jVar) {
            this.f20700a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f20700a.h()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f20673a.b(this.f20700a)) {
                            k.this.f20694v.b();
                            k.this.g(this.f20700a);
                            k.this.r(this.f20700a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public <R> o<R> a(fj.c<R> cVar, boolean z11, dj.e eVar, o.a aVar) {
            return new o<>(cVar, z11, true, eVar, aVar);
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.j f20702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f20703b;

        d(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f20702a = jVar;
            this.f20703b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f20702a.equals(((d) obj).f20702a);
            }
            return false;
        }

        public int hashCode() {
            return this.f20702a.hashCode();
        }
    }

    static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f20704a;

        e() {
            this(new ArrayList(2));
        }

        private static d e(com.bumptech.glide.request.j jVar) {
            return new d(jVar, xj.e.a());
        }

        void a(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f20704a.add(new d(jVar, executor));
        }

        boolean b(com.bumptech.glide.request.j jVar) {
            return this.f20704a.contains(e(jVar));
        }

        void clear() {
            this.f20704a.clear();
        }

        e d() {
            return new e(new ArrayList(this.f20704a));
        }

        void f(com.bumptech.glide.request.j jVar) {
            this.f20704a.remove(e(jVar));
        }

        boolean isEmpty() {
            return this.f20704a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f20704a.iterator();
        }

        int size() {
            return this.f20704a.size();
        }

        e(List<d> list) {
            this.f20704a = list;
        }
    }

    k(ij.a aVar, ij.a aVar2, ij.a aVar3, ij.a aVar4, l lVar, o.a aVar5, u5.f<k<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, fVar, f20672z);
    }

    private ij.a j() {
        if (this.f20686n) {
            return this.f20681i;
        }
        return this.f20687o ? this.f20682j : this.f20680h;
    }

    private boolean m() {
        return this.f20693u || this.f20691s || this.f20696x;
    }

    private synchronized void q() {
        if (this.f20684l == null) {
            throw new IllegalArgumentException();
        }
        this.f20673a.clear();
        this.f20684l = null;
        this.f20694v = null;
        this.f20689q = null;
        this.f20693u = false;
        this.f20696x = false;
        this.f20691s = false;
        this.f20697y = false;
        this.f20695w.w(false);
        this.f20695w = null;
        this.f20692t = null;
        this.f20690r = null;
        this.f20676d.a(this);
    }

    synchronized void a(com.bumptech.glide.request.j jVar, Executor executor) {
        try {
            this.f20674b.c();
            this.f20673a.a(jVar, executor);
            if (this.f20691s) {
                k(1);
                executor.execute(new b(jVar));
            } else if (this.f20693u) {
                k(1);
                executor.execute(new a(jVar));
            } else {
                xj.k.a(!this.f20696x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.f20692t = glideException;
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void c(fj.c<R> cVar, dj.a aVar, boolean z11) {
        synchronized (this) {
            this.f20689q = cVar;
            this.f20690r = aVar;
            this.f20697y = z11;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h<?> hVar) {
        j().execute(hVar);
    }

    @Override // yj.a.f
    @NonNull
    public yj.c e() {
        return this.f20674b;
    }

    void f(com.bumptech.glide.request.j jVar) {
        try {
            jVar.b(this.f20692t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(com.bumptech.glide.request.j jVar) {
        try {
            jVar.c(this.f20694v, this.f20690r, this.f20697y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.f20696x = true;
        this.f20695w.b();
        this.f20678f.a(this, this.f20684l);
    }

    void i() {
        o<?> oVar;
        synchronized (this) {
            try {
                this.f20674b.c();
                xj.k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f20683k.decrementAndGet();
                xj.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f20694v;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar != null) {
            oVar.e();
        }
    }

    synchronized void k(int i11) {
        o<?> oVar;
        xj.k.a(m(), "Not yet complete!");
        if (this.f20683k.getAndAdd(i11) == 0 && (oVar = this.f20694v) != null) {
            oVar.b();
        }
    }

    synchronized k<R> l(dj.e eVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f20684l = eVar;
        this.f20685m = z11;
        this.f20686n = z12;
        this.f20687o = z13;
        this.f20688p = z14;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f20674b.c();
                if (this.f20696x) {
                    q();
                    return;
                }
                if (this.f20673a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f20693u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f20693u = true;
                dj.e eVar = this.f20684l;
                e eVarD = this.f20673a.d();
                k(eVarD.size() + 1);
                this.f20678f.c(this, eVar, null);
                for (d dVar : eVarD) {
                    dVar.f20703b.execute(new a(dVar.f20702a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void o() {
        synchronized (this) {
            try {
                this.f20674b.c();
                if (this.f20696x) {
                    this.f20689q.recycle();
                    q();
                    return;
                }
                if (this.f20673a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f20691s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f20694v = this.f20677e.a(this.f20689q, this.f20685m, this.f20684l, this.f20675c);
                this.f20691s = true;
                e eVarD = this.f20673a.d();
                k(eVarD.size() + 1);
                this.f20678f.c(this, this.f20684l, this.f20694v);
                for (d dVar : eVarD) {
                    dVar.f20703b.execute(new b(dVar.f20702a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        return this.f20688p;
    }

    synchronized void r(com.bumptech.glide.request.j jVar) {
        try {
            this.f20674b.c();
            this.f20673a.f(jVar);
            if (this.f20673a.isEmpty()) {
                h();
                if (this.f20691s || this.f20693u) {
                    if (this.f20683k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h<R> hVar) {
        try {
            this.f20695w = hVar;
            (hVar.D() ? this.f20679g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    k(ij.a aVar, ij.a aVar2, ij.a aVar3, ij.a aVar4, l lVar, o.a aVar5, u5.f<k<?>> fVar, c cVar) {
        this.f20673a = new e();
        this.f20674b = yj.c.a();
        this.f20683k = new AtomicInteger();
        this.f20679g = aVar;
        this.f20680h = aVar2;
        this.f20681i = aVar3;
        this.f20682j = aVar4;
        this.f20678f = lVar;
        this.f20675c = aVar5;
        this.f20676d = fVar;
        this.f20677e = cVar;
    }
}
