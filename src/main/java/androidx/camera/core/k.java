package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class k extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Executor f3414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f3415u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    n f3416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b f3417w;

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f3418a;

        a(b bVar) {
            this.f3418a = bVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            this.f3418a.close();
        }
    }

    static class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WeakReference<k> f3420d;

        b(@NonNull n nVar, @NonNull k kVar) {
            super(nVar);
            this.f3420d = new WeakReference<>(kVar);
            c(new e.a() { // from class: androidx.camera.core.l
                @Override // androidx.camera.core.e.a
                public final void e(n nVar2) {
                    k.b.o(this.f3421a, nVar2);
                }
            });
        }

        public static /* synthetic */ void o(b bVar, n nVar) {
            final k kVar = bVar.f3420d.get();
            if (kVar != null) {
                kVar.f3414t.execute(new Runnable() { // from class: androidx.camera.core.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        kVar.x();
                    }
                });
            }
        }
    }

    k(Executor executor) {
        this.f3414t = executor;
    }

    @Override // androidx.camera.core.i
    n d(@NonNull s1 s1Var) {
        return s1Var.d();
    }

    @Override // androidx.camera.core.i
    void g() {
        synchronized (this.f3415u) {
            try {
                n nVar = this.f3416v;
                if (nVar != null) {
                    nVar.close();
                    this.f3416v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.i
    void m(@NonNull n nVar) {
        synchronized (this.f3415u) {
            try {
                if (!this.f3081s) {
                    nVar.close();
                    return;
                }
                if (this.f3417w == null) {
                    b bVar = new b(nVar, this);
                    this.f3417w = bVar;
                    j0.n.j(e(bVar), new a(bVar), i0.c.b());
                } else {
                    if (nVar.z().a() <= this.f3417w.z().a()) {
                        nVar.close();
                    } else {
                        n nVar2 = this.f3416v;
                        if (nVar2 != null) {
                            nVar2.close();
                        }
                        this.f3416v = nVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x() {
        synchronized (this.f3415u) {
            try {
                this.f3417w = null;
                n nVar = this.f3416v;
                if (nVar != null) {
                    this.f3416v = null;
                    m(nVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
