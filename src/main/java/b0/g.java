package b0;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.x0;
import com.google.common.util.concurrent.s;
import j0.n;
import java.util.concurrent.Executor;
import v.v;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f15237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Executor f15238d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f15241g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15235a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15236b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f15239e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u.a.C2464a f15240f = new u.a.C2464a();

    public g(@NonNull v vVar, @NonNull Executor executor) {
        this.f15237c = vVar;
        this.f15238d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final androidx.concurrent.futures.c.a aVar) {
        gVar.f15238d.execute(new Runnable() { // from class: b0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f15233a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final androidx.concurrent.futures.c.a aVar) {
        gVar.f15238d.execute(new Runnable() { // from class: b0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15230a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void h(@NonNull k kVar) {
        synchronized (this.f15239e) {
            this.f15240f.c(kVar);
        }
    }

    private void k() {
        synchronized (this.f15239e) {
            this.f15240f = new u.a.C2464a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        androidx.concurrent.futures.c.a<Void> aVar = this.f15241g;
        if (aVar != null) {
            aVar.c(null);
            this.f15241g = null;
        }
    }

    private void m(Exception exc) {
        androidx.concurrent.futures.c.a<Void> aVar = this.f15241g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f15241g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z11) {
        if (this.f15235a == z11) {
            return;
        }
        this.f15235a = z11;
        if (!z11) {
            m(new CameraControl.OperationCanceledException("The camera control has became inactive."));
        } else if (this.f15236b) {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(@NonNull androidx.concurrent.futures.c.a<Void> aVar) {
        this.f15236b = true;
        m(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.f15241g = aVar;
        if (this.f15235a) {
            r();
        }
    }

    private void r() {
        this.f15237c.k0().b(new Runnable() { // from class: b0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f15232a.l();
            }
        }, this.f15238d);
        this.f15236b = false;
    }

    @NonNull
    public s<Void> g(@NonNull k kVar) {
        h(kVar);
        return n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: b0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return g.a(this.f15226a, aVar);
            }
        }));
    }

    public void i(@NonNull u.a.C2464a c2464a) {
        synchronized (this.f15239e) {
            c2464a.e(this.f15240f.b(), x0.c.ALWAYS_OVERRIDE);
        }
    }

    @NonNull
    public s<Void> j() {
        k();
        return n.s(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: b0.c
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return g.b(this.f15229a, aVar);
            }
        }));
    }

    @NonNull
    public u.a n() {
        u.a aVarA;
        synchronized (this.f15239e) {
            aVarA = this.f15240f.a();
        }
        return aVarA;
    }

    public void o(final boolean z11) {
        this.f15238d.execute(new Runnable() { // from class: b0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f15227a.p(z11);
            }
        });
    }
}
