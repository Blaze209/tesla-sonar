package androidx.camera.core;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class q implements s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s1 f3440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Surface f3441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e.a f3442f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3437a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3438b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3439c = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e.a f3443g = new e.a() { // from class: c0.m1
        @Override // androidx.camera.core.e.a
        public final void e(androidx.camera.core.n nVar) {
            androidx.camera.core.q.h(this.f18369a, nVar);
        }
    };

    public q(@NonNull s1 s1Var) {
        this.f3440d = s1Var;
        this.f3441e = s1Var.getSurface();
    }

    public static /* synthetic */ void e(q qVar, s1.a aVar, s1 s1Var) {
        qVar.getClass();
        aVar.a(qVar);
    }

    public static /* synthetic */ void h(q qVar, n nVar) {
        e.a aVar;
        synchronized (qVar.f3437a) {
            try {
                int i11 = qVar.f3438b - 1;
                qVar.f3438b = i11;
                if (qVar.f3439c && i11 == 0) {
                    qVar.close();
                }
                aVar = qVar.f3442f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.e(nVar);
        }
    }

    private n l(n nVar) {
        if (nVar == null) {
            return null;
        }
        this.f3438b++;
        s sVar = new s(nVar);
        sVar.c(this.f3443g);
        return sVar;
    }

    @Override // androidx.camera.core.impl.s1
    public int a() {
        int iA;
        synchronized (this.f3437a) {
            iA = this.f3440d.a();
        }
        return iA;
    }

    @Override // androidx.camera.core.impl.s1
    public int b() {
        int iB;
        synchronized (this.f3437a) {
            iB = this.f3440d.b();
        }
        return iB;
    }

    @Override // androidx.camera.core.impl.s1
    public n c() {
        n nVarL;
        synchronized (this.f3437a) {
            nVarL = l(this.f3440d.c());
        }
        return nVarL;
    }

    @Override // androidx.camera.core.impl.s1
    public void close() {
        synchronized (this.f3437a) {
            try {
                Surface surface = this.f3441e;
                if (surface != null) {
                    surface.release();
                }
                this.f3440d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.s1
    public n d() {
        n nVarL;
        synchronized (this.f3437a) {
            nVarL = l(this.f3440d.d());
        }
        return nVarL;
    }

    @Override // androidx.camera.core.impl.s1
    public void f() {
        synchronized (this.f3437a) {
            this.f3440d.f();
        }
    }

    @Override // androidx.camera.core.impl.s1
    public void g(@NonNull final s1.a aVar, @NonNull Executor executor) {
        synchronized (this.f3437a) {
            this.f3440d.g(new s1.a() { // from class: c0.l1
                @Override // androidx.camera.core.impl.s1.a
                public final void a(androidx.camera.core.impl.s1 s1Var) {
                    androidx.camera.core.q.e(this.f18363a, aVar, s1Var);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.s1
    public int getHeight() {
        int height;
        synchronized (this.f3437a) {
            height = this.f3440d.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.s1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f3437a) {
            surface = this.f3440d.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.s1
    public int getWidth() {
        int width;
        synchronized (this.f3437a) {
            width = this.f3440d.getWidth();
        }
        return width;
    }

    public int i() {
        int iB;
        synchronized (this.f3437a) {
            iB = this.f3440d.b() - this.f3438b;
        }
        return iB;
    }

    public void j() {
        synchronized (this.f3437a) {
            try {
                this.f3439c = true;
                this.f3440d.f();
                if (this.f3438b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(@NonNull e.a aVar) {
        synchronized (this.f3437a) {
            this.f3442f = aVar;
        }
    }
}
