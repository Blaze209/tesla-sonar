package e0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class x0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k1 f61418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1.a f61419b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f61422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f61423f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.s<Void> f61426i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f61424g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f61425h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f61420c = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: e0.v0
        @Override // androidx.concurrent.futures.c.InterfaceC0146c
        public final Object a(androidx.concurrent.futures.c.a aVar) {
            return x0.h(this.f61399a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f61421d = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: e0.w0
        @Override // androidx.concurrent.futures.c.InterfaceC0146c
        public final Object a(androidx.concurrent.futures.c.a aVar) {
            return x0.i(this.f61401a, aVar);
        }
    });

    x0(@NonNull k1 k1Var, @NonNull k1.a aVar) {
        this.f61418a = k1Var;
        this.f61419b = aVar;
    }

    public static /* synthetic */ Object h(x0 x0Var, androidx.concurrent.futures.c.a aVar) {
        x0Var.f61422e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object i(x0 x0Var, androidx.concurrent.futures.c.a aVar) {
        x0Var.f61423f = aVar;
        return "RequestCompleteFuture";
    }

    private void j(@NonNull ImageCaptureException imageCaptureException) {
        h0.r.b();
        this.f61424g = true;
        com.google.common.util.concurrent.s<Void> sVar = this.f61426i;
        Objects.requireNonNull(sVar);
        sVar.cancel(true);
        this.f61422e.f(imageCaptureException);
        this.f61423f.c(null);
    }

    private void m() {
        u5.h.j(this.f61420c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void p() {
        if (!this.f61418a.t() || this.f61418a.s()) {
            if (!this.f61418a.t()) {
                u5.h.j(!this.f61421d.isDone(), "The callback can only complete once.");
            }
            this.f61423f.c(null);
        }
    }

    private void q(@NonNull ImageCaptureException imageCaptureException) {
        h0.r.b();
        this.f61418a.x(imageCaptureException);
    }

    @Override // e0.z0
    public void a() {
        h0.r.b();
        if (this.f61424g || this.f61425h) {
            return;
        }
        this.f61425h = true;
        c0.r0.e eVarJ = this.f61418a.j();
        if (eVarJ != null) {
            eVarJ.onCaptureStarted();
        }
        c0.r0.f fVarL = this.f61418a.l();
        if (fVarL != null) {
            fVarL.a();
        }
    }

    @Override // e0.z0
    public void b(@NonNull Bitmap bitmap) {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        this.f61418a.y(bitmap);
    }

    @Override // e0.z0
    public void c(@NonNull ImageCaptureException imageCaptureException) {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        m();
        p();
        q(imageCaptureException);
    }

    @Override // e0.z0
    public void d(@NonNull androidx.camera.core.n nVar) {
        h0.r.b();
        if (this.f61424g) {
            nVar.close();
            return;
        }
        m();
        p();
        this.f61418a.z(nVar);
    }

    @Override // e0.z0
    public void e() {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        if (!this.f61425h) {
            a();
        }
        this.f61422e.c(null);
    }

    @Override // e0.z0
    public void f(@NonNull c0.r0.h hVar) {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        m();
        p();
        this.f61418a.A(hVar);
    }

    @Override // e0.z0
    public void g(@NonNull ImageCaptureException imageCaptureException) {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        boolean zF = this.f61418a.f();
        if (!zF) {
            q(imageCaptureException);
        }
        p();
        this.f61422e.f(imageCaptureException);
        if (zF) {
            this.f61419b.a(this.f61418a);
        }
    }

    @Override // e0.z0
    public boolean isAborted() {
        return this.f61424g;
    }

    void k(@NonNull ImageCaptureException imageCaptureException) {
        h0.r.b();
        if (this.f61421d.isDone()) {
            return;
        }
        j(imageCaptureException);
        q(imageCaptureException);
    }

    void l() {
        h0.r.b();
        if (this.f61421d.isDone()) {
            return;
        }
        j(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.f61419b.a(this.f61418a);
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> n() {
        h0.r.b();
        return this.f61420c;
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> o() {
        h0.r.b();
        return this.f61421d;
    }

    @Override // e0.z0
    public void onCaptureProcessProgressed(int i11) {
        h0.r.b();
        if (this.f61424g) {
            return;
        }
        this.f61418a.w(i11);
    }

    public void r(@NonNull com.google.common.util.concurrent.s<Void> sVar) {
        h0.r.b();
        u5.h.j(this.f61426i == null, "CaptureRequestFuture can only be set once.");
        this.f61426i = sVar;
    }
}
