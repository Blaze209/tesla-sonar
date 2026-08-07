package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class f5 extends b5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f116986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f116987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<DeferrableSurface> f116988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    com.google.common.util.concurrent.s<List<Void>> f116989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z.i f116990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z.h f116991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final z.t f116992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final z.v f116993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f116994w;

    f5(@NonNull androidx.camera.core.impl.r2 r2Var, @NonNull androidx.camera.core.impl.r2 r2Var2, @NonNull g3 g3Var, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        super(g3Var, executor, scheduledExecutorService, handler);
        this.f116987p = new Object();
        this.f116994w = new AtomicBoolean(false);
        this.f116990s = new z.i(r2Var, r2Var2);
        this.f116992u = new z.t(r2Var.a(CaptureSessionStuckQuirk.class) || r2Var.a(IncorrectCaptureStateQuirk.class));
        this.f116991t = new z.h(r2Var2);
        this.f116993v = new z.v(r2Var2);
        this.f116986o = scheduledExecutorService;
    }

    public static /* synthetic */ com.google.common.util.concurrent.s G(f5 f5Var, CameraDevice cameraDevice, x.p pVar, List list, List list2) {
        if (f5Var.f116993v.a()) {
            f5Var.I();
        }
        f5Var.J("start openCaptureSession");
        return super.l(cameraDevice, pVar, list);
    }

    public static /* synthetic */ void H(f5 f5Var) {
        f5Var.J("Session call super.close()");
        super.close();
    }

    private void I() {
        Iterator<v4> it = this.f116834b.d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    void J(String str) {
        c0.y0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // v.b5, v.v4
    public void close() {
        if (!this.f116994w.compareAndSet(false, true)) {
            J("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f116993v.a()) {
            try {
                J("Call abortCaptures() before closing session.");
                b();
            } catch (Exception e11) {
                J("Exception when calling abortCaptures()" + e11);
            }
        }
        J("Session call close()");
        this.f116992u.e().b(new Runnable() { // from class: v.d5
            @Override // java.lang.Runnable
            public final void run() {
                f5.H(this.f116940a);
            }
        }, c());
    }

    @Override // v.b5, v.v4
    public void e(int i11) {
        super.e(i11);
        if (i11 == 5) {
            synchronized (this.f116987p) {
                try {
                    if (D() && this.f116988q != null) {
                        J("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<DeferrableSurface> it = this.f116988q.iterator();
                        while (it.hasNext()) {
                            it.next().d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // v.b5, v.v4
    public int g(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return super.g(list, this.f116992u.d(captureCallback));
    }

    @Override // v.v4
    @NonNull
    public com.google.common.util.concurrent.s<Void> j() {
        return j0.n.q(1500L, this.f116986o, this.f116992u.e());
    }

    @Override // v.b5, v.v4
    public void k() {
        super.k();
        this.f116992u.g();
    }

    @Override // v.b5, v.v4.a
    @NonNull
    public com.google.common.util.concurrent.s<Void> l(@NonNull final CameraDevice cameraDevice, @NonNull final x.p pVar, @NonNull final List<DeferrableSurface> list) {
        com.google.common.util.concurrent.s<Void> sVarS;
        synchronized (this.f116987p) {
            try {
                List<v4> listD = this.f116834b.d();
                ArrayList arrayList = new ArrayList();
                Iterator<v4> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().j());
                }
                com.google.common.util.concurrent.s<List<Void>> sVarW = j0.n.w(arrayList);
                this.f116989r = sVarW;
                sVarS = j0.n.s(j0.d.a(sVarW).f(new j0.a() { // from class: v.e5
                    @Override // j0.a
                    public final com.google.common.util.concurrent.s apply(Object obj) {
                        return f5.G(this.f116977a, cameraDevice, pVar, list, (List) obj);
                    }
                }, c()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVarS;
    }

    @Override // v.b5, v.v4
    public int m(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return super.m(captureRequest, this.f116992u.d(captureCallback));
    }

    @Override // v.b5, v.v4.a
    @NonNull
    public com.google.common.util.concurrent.s<List<Surface>> n(@NonNull List<DeferrableSurface> list, long j11) {
        com.google.common.util.concurrent.s<List<Surface>> sVarN;
        synchronized (this.f116987p) {
            this.f116988q = list;
            sVarN = super.n(list, j11);
        }
        return sVarN;
    }

    @Override // v.b5, v.v4.c
    public void q(@NonNull v4 v4Var) {
        synchronized (this.f116987p) {
            this.f116990s.a(this.f116988q);
        }
        J("onClosed()");
        super.q(v4Var);
    }

    @Override // v.b5, v.v4.c
    public void s(@NonNull v4 v4Var) {
        J("Session onConfigured()");
        this.f116991t.c(v4Var, this.f116834b.e(), this.f116834b.d(), new z.h.a() { // from class: v.c5
            @Override // z.h.a
            public final void a(v4 v4Var2) {
                super/*v.b5*/.s(v4Var2);
            }
        });
    }

    @Override // v.b5, v.v4.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f116987p) {
            try {
                if (D()) {
                    this.f116990s.a(this.f116988q);
                } else {
                    com.google.common.util.concurrent.s<List<Void>> sVar = this.f116989r;
                    if (sVar != null) {
                        sVar.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zStop;
    }
}
