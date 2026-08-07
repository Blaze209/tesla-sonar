package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class f<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<s8> f11649d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<T, t7.g> f11647b = new androidx.collection.a<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a<t7.g, b<T>> f11648c = new androidx.collection.a<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11646a = new Object();

    public interface a {
        com.google.common.util.concurrent.s<Void> run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f11650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final re f11651b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public te f11653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p7.j0.b f11654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p7.j0.b f11655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f11656g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public PlaybackException f11658i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ne f11659j;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Deque<a> f11652c = new ArrayDeque();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p7.j0.b f11657h = p7.j0.b.f101382b;

        public b(T t11, re reVar, te teVar, p7.j0.b bVar) {
            this.f11650a = t11;
            this.f11651b = reVar;
            this.f11653d = teVar;
            this.f11654e = bVar;
        }
    }

    public f(s8 s8Var) {
        this.f11649d = new WeakReference<>(s8Var);
    }

    public static /* synthetic */ void a(f fVar, AtomicBoolean atomicBoolean, b bVar, AtomicBoolean atomicBoolean2) {
        synchronized (fVar.f11646a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    fVar.g(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void b(final f fVar, a aVar, final AtomicBoolean atomicBoolean, final b bVar, final AtomicBoolean atomicBoolean2) {
        fVar.getClass();
        aVar.run().b(new Runnable() { // from class: androidx.media3.session.e
            @Override // java.lang.Runnable
            public final void run() {
                f.a(this.f11618a, atomicBoolean, bVar, atomicBoolean2);
            }
        }, com.google.common.util.concurrent.w.b());
    }

    public static /* synthetic */ com.google.common.util.concurrent.s c(f fVar, t7.g gVar, p7.j0.b bVar) {
        s8 s8Var = fVar.f11649d.get();
        if (s8Var != null) {
            s8Var.G0(gVar, bVar);
        }
        return com.google.common.util.concurrent.m.e();
    }

    public static /* synthetic */ void d(s8 s8Var, t7.g gVar) {
        if (s8Var.u0()) {
            return;
        }
        s8Var.B0(gVar);
    }

    private void g(b<T> bVar) {
        s8 s8Var = this.f11649d.get();
        if (s8Var == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final a aVarPoll = bVar.f11652c.poll();
            if (aVarPoll == null) {
                bVar.f11656g = false;
                return;
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            final b<T> bVar2 = bVar;
            s7.q0.m1(s8Var.X(), s8Var.K(k(bVar.f11650a), new Runnable() { // from class: androidx.media3.session.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.b(this.f11589a, aVarPoll, atomicBoolean2, bVar2, atomicBoolean);
                }
            }));
            atomicBoolean2.set(false);
            bVar = bVar2;
        }
    }

    public void e(T t11, t7.g gVar, te teVar, p7.j0.b bVar) {
        synchronized (this.f11646a) {
            try {
                t7.g gVarK = k(t11);
                if (gVarK == null) {
                    this.f11647b.put(t11, gVar);
                    this.f11648c.put(gVar, new b<>(t11, new re(), teVar, bVar));
                } else {
                    b bVar2 = (b) s7.a.j(this.f11648c.get(gVarK));
                    bVar2.f11653d = teVar;
                    bVar2.f11654e = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(t7.g gVar, int i11, a aVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar != null) {
                    bVar.f11657h = bVar.f11657h.b().a(i11).f();
                    bVar.f11652c.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(final t7.g gVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar == null) {
                    return;
                }
                final p7.j0.b bVar2 = bVar.f11657h;
                bVar.f11657h = p7.j0.b.f101382b;
                bVar.f11652c.add(new a() { // from class: androidx.media3.session.b
                    @Override // androidx.media3.session.f.a
                    public final com.google.common.util.concurrent.s run() {
                        return f.c(this.f11506a, gVar, bVar2);
                    }
                });
                if (bVar.f11656g) {
                    return;
                }
                bVar.f11656g = true;
                g(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p7.j0.b i(t7.g gVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f11654e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.common.collect.x<t7.g> j() {
        com.google.common.collect.x<t7.g> xVarN;
        synchronized (this.f11646a) {
            xVarN = com.google.common.collect.x.n(this.f11647b.values());
        }
        return xVarN;
    }

    public t7.g k(T t11) {
        t7.g gVar;
        synchronized (this.f11646a) {
            gVar = this.f11647b.get(t11);
        }
        return gVar;
    }

    public PlaybackException l(t7.g gVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f11658i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ne m(t7.g gVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar == null) {
                    return null;
                }
                return bVar.f11659j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public re n(t7.g gVar) {
        b<T> bVar;
        synchronized (this.f11646a) {
            bVar = this.f11648c.get(gVar);
        }
        if (bVar != null) {
            return bVar.f11651b;
        }
        return null;
    }

    public re o(T t11) {
        b<T> bVar;
        synchronized (this.f11646a) {
            try {
                t7.g gVarK = k(t11);
                bVar = gVarK != null ? this.f11648c.get(gVarK) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar != null) {
            return bVar.f11651b;
        }
        return null;
    }

    public boolean p(t7.g gVar) {
        boolean z11;
        synchronized (this.f11646a) {
            z11 = this.f11648c.get(gVar) != null;
        }
        return z11;
    }

    public boolean q(t7.g gVar, int i11) {
        b<T> bVar;
        synchronized (this.f11646a) {
            bVar = this.f11648c.get(gVar);
        }
        s8 s8Var = this.f11649d.get();
        return bVar != null && bVar.f11654e.c(i11) && s8Var != null && s8Var.k0().N().c(i11);
    }

    public boolean r(t7.g gVar, int i11) {
        b<T> bVar;
        synchronized (this.f11646a) {
            bVar = this.f11648c.get(gVar);
        }
        return bVar != null && bVar.f11653d.b(i11);
    }

    public boolean s(t7.g gVar, se seVar) {
        b<T> bVar;
        synchronized (this.f11646a) {
            bVar = this.f11648c.get(gVar);
        }
        return bVar != null && bVar.f11653d.c(seVar);
    }

    public void t(final t7.g gVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVarRemove = this.f11648c.remove(gVar);
                if (bVarRemove == null) {
                    return;
                }
                this.f11647b.remove(bVarRemove.f11650a);
                bVarRemove.f11651b.d();
                final s8 s8Var = this.f11649d.get();
                if (s8Var == null || s8Var.u0()) {
                    return;
                }
                s7.q0.m1(s8Var.X(), new Runnable() { // from class: androidx.media3.session.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.d(s8Var, gVar);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(T t11) {
        t7.g gVarK = k(t11);
        if (gVarK != null) {
            t(gVarK);
        }
    }

    public void v(t7.g gVar, PlaybackException playbackException, p7.j0.b bVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar2 = this.f11648c.get(gVar);
                if (bVar2 != null) {
                    bVar2.f11658i = playbackException;
                    bVar2.f11655f = bVar;
                    bVar2.f11659j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(t7.g gVar, ne neVar) {
        synchronized (this.f11646a) {
            try {
                b<T> bVar = this.f11648c.get(gVar);
                if (bVar != null) {
                    s7.a.j(bVar.f11658i);
                    bVar.f11659j = neVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
