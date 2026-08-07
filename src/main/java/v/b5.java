package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
class b5 extends v4.c implements v4, v4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final g3 f116834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Handler f116835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final Executor f116836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final ScheduledExecutorService f116837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    v4.c f116838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    w.f f116839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.s<Void> f116840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    androidx.concurrent.futures.c.a<Void> f116841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.s<List<Surface>> f116842j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f116833a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<DeferrableSurface> f116843k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f116844l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f116845m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f116846n = false;

    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
            b5.this.B(cameraCaptureSession);
            b5 b5Var = b5.this;
            b5Var.o(b5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
            b5.this.B(cameraCaptureSession);
            b5 b5Var = b5.this;
            b5Var.p(b5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
            b5.this.B(cameraCaptureSession);
            b5 b5Var = b5.this;
            b5Var.q(b5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            androidx.concurrent.futures.c.a<Void> aVar;
            try {
                b5.this.B(cameraCaptureSession);
                b5 b5Var = b5.this;
                b5Var.r(b5Var);
                synchronized (b5.this.f116833a) {
                    u5.h.h(b5.this.f116841i, "OpenCaptureSession completer should not null");
                    b5 b5Var2 = b5.this;
                    aVar = b5Var2.f116841i;
                    b5Var2.f116841i = null;
                }
            } finally {
                synchronized (b5.this.f116833a) {
                    u5.h.h(b5.this.f116841i, "OpenCaptureSession completer should not null");
                    b5 b5Var3 = b5.this;
                    aVar = b5Var3.f116841i;
                    b5Var3.f116841i = null;
                    aVar.f(new IllegalStateException("onConfigureFailed"));
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            androidx.concurrent.futures.c.a<Void> aVar;
            try {
                b5.this.B(cameraCaptureSession);
                b5 b5Var = b5.this;
                b5Var.s(b5Var);
                synchronized (b5.this.f116833a) {
                    u5.h.h(b5.this.f116841i, "OpenCaptureSession completer should not null");
                    b5 b5Var2 = b5.this;
                    aVar = b5Var2.f116841i;
                    b5Var2.f116841i = null;
                }
            } finally {
                synchronized (b5.this.f116833a) {
                    u5.h.h(b5.this.f116841i, "OpenCaptureSession completer should not null");
                    b5 b5Var3 = b5.this;
                    aVar = b5Var3.f116841i;
                    b5Var3.f116841i = null;
                    aVar.c(null);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
            b5.this.B(cameraCaptureSession);
            b5 b5Var = b5.this;
            b5Var.t(b5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
            b5.this.B(cameraCaptureSession);
            b5 b5Var = b5.this;
            b5Var.v(b5Var, surface);
        }
    }

    b5(@NonNull g3 g3Var, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        this.f116834b = g3Var;
        this.f116835c = handler;
        this.f116836d = executor;
        this.f116837e = scheduledExecutorService;
    }

    public static /* synthetic */ void w(b5 b5Var, v4 v4Var) {
        b5Var.f116834b.g(b5Var);
        b5Var.A(v4Var);
        if (b5Var.f116839g != null) {
            Objects.requireNonNull(b5Var.f116838f);
            b5Var.f116838f.q(v4Var);
            return;
        }
        c0.y0.l("SyncCaptureSessionBase", "[" + b5Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object x(b5 b5Var, List list, w.a0 a0Var, x.p pVar, androidx.concurrent.futures.c.a aVar) {
        String str;
        synchronized (b5Var.f116833a) {
            b5Var.C(list);
            u5.h.j(b5Var.f116841i == null, "The openCaptureSessionCompleter can only set once!");
            b5Var.f116841i = aVar;
            a0Var.a(pVar);
            str = "openCaptureSession[session=" + b5Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void y(b5 b5Var, v4 v4Var) {
        Objects.requireNonNull(b5Var.f116838f);
        b5Var.f116838f.A(v4Var);
    }

    public static /* synthetic */ com.google.common.util.concurrent.s z(b5 b5Var, List list, List list2) {
        b5Var.getClass();
        c0.y0.a("SyncCaptureSessionBase", "[" + b5Var + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return j0.n.n(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list2.contains(null) ? j0.n.n(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null)))) : j0.n.p(list2);
    }

    void B(@NonNull CameraCaptureSession cameraCaptureSession) {
        if (this.f116839g == null) {
            this.f116839g = w.f.d(cameraCaptureSession, this.f116835c);
        }
    }

    void C(@NonNull List<DeferrableSurface> list) {
        synchronized (this.f116833a) {
            E();
            androidx.camera.core.impl.g1.d(list);
            this.f116843k = list;
        }
    }

    boolean D() {
        boolean z11;
        synchronized (this.f116833a) {
            z11 = this.f116840h != null;
        }
        return z11;
    }

    void E() {
        synchronized (this.f116833a) {
            try {
                List<DeferrableSurface> list = this.f116843k;
                if (list != null) {
                    androidx.camera.core.impl.g1.c(list);
                    this.f116843k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.v4
    public void a() throws CameraAccessException {
        u5.h.h(this.f116839g, "Need to call openCaptureSession before using this API.");
        this.f116839g.c().stopRepeating();
    }

    @Override // v.v4
    public void b() {
        u5.h.h(this.f116839g, "Need to call openCaptureSession before using this API.");
        this.f116839g.c().abortCaptures();
    }

    @Override // v.v4.a
    @NonNull
    public Executor c() {
        return this.f116836d;
    }

    @Override // v.v4
    public void close() {
        u5.h.h(this.f116839g, "Need to call openCaptureSession before using this API.");
        this.f116834b.h(this);
        this.f116839g.c().close();
        c().execute(new Runnable() { // from class: v.z4
            @Override // java.lang.Runnable
            public final void run() {
                b5 b5Var = this.f117426a;
                b5Var.A(b5Var);
            }
        });
    }

    @Override // v.v4
    @NonNull
    public CameraDevice f() {
        u5.h.g(this.f116839g);
        return this.f116839g.c().getDevice();
    }

    @Override // v.v4
    public int g(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        u5.h.h(this.f116839g, "Need to call openCaptureSession before using this API.");
        return this.f116839g.a(list, c(), captureCallback);
    }

    @Override // v.v4
    @NonNull
    public w.f h() {
        u5.h.g(this.f116839g);
        return this.f116839g;
    }

    @Override // v.v4.a
    @NonNull
    public x.p i(int i11, @NonNull List<x.j> list, @NonNull v4.c cVar) {
        this.f116838f = cVar;
        return new x.p(i11, list, c(), new b());
    }

    @Override // v.v4
    public void k() {
        E();
    }

    @Override // v.v4.a
    @NonNull
    public com.google.common.util.concurrent.s<Void> l(@NonNull CameraDevice cameraDevice, @NonNull final x.p pVar, @NonNull final List<DeferrableSurface> list) {
        synchronized (this.f116833a) {
            try {
                if (this.f116845m) {
                    return j0.n.n(new CancellationException("Opener is disabled"));
                }
                this.f116834b.k(this);
                final w.a0 a0VarB = w.a0.b(cameraDevice, this.f116835c);
                com.google.common.util.concurrent.s<Void> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: v.a5
                    @Override // androidx.concurrent.futures.c.InterfaceC0146c
                    public final Object a(androidx.concurrent.futures.c.a aVar) {
                        return b5.x(this.f116821a, list, a0VarB, pVar, aVar);
                    }
                });
                this.f116840h = sVarA;
                j0.n.j(sVarA, new a(), i0.c.b());
                return j0.n.s(this.f116840h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.v4
    public int m(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        u5.h.h(this.f116839g, "Need to call openCaptureSession before using this API.");
        return this.f116839g.b(captureRequest, c(), captureCallback);
    }

    @Override // v.v4.a
    @NonNull
    public com.google.common.util.concurrent.s<List<Surface>> n(@NonNull final List<DeferrableSurface> list, long j11) {
        synchronized (this.f116833a) {
            try {
                if (this.f116845m) {
                    return j0.n.n(new CancellationException("Opener is disabled"));
                }
                j0.d dVarF = j0.d.a(androidx.camera.core.impl.g1.e(list, false, j11, c(), this.f116837e)).f(new j0.a() { // from class: v.x4
                    @Override // j0.a
                    public final com.google.common.util.concurrent.s apply(Object obj) {
                        return b5.z(this.f117394a, list, (List) obj);
                    }
                }, c());
                this.f116842j = dVarF;
                return j0.n.s(dVarF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v.v4.c
    public void o(@NonNull v4 v4Var) {
        Objects.requireNonNull(this.f116838f);
        this.f116838f.o(v4Var);
    }

    @Override // v.v4.c
    public void p(@NonNull v4 v4Var) {
        Objects.requireNonNull(this.f116838f);
        this.f116838f.p(v4Var);
    }

    @Override // v.v4.c
    public void q(@NonNull final v4 v4Var) {
        com.google.common.util.concurrent.s<Void> sVar;
        synchronized (this.f116833a) {
            try {
                if (this.f116844l) {
                    sVar = null;
                } else {
                    this.f116844l = true;
                    u5.h.h(this.f116840h, "Need to call openCaptureSession before using this API.");
                    sVar = this.f116840h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k();
        if (sVar != null) {
            sVar.b(new Runnable() { // from class: v.w4
                @Override // java.lang.Runnable
                public final void run() {
                    b5.w(this.f117364a, v4Var);
                }
            }, i0.c.b());
        }
    }

    @Override // v.v4.c
    public void r(@NonNull v4 v4Var) {
        Objects.requireNonNull(this.f116838f);
        k();
        this.f116834b.i(this);
        this.f116838f.r(v4Var);
    }

    @Override // v.v4.c
    public void s(@NonNull v4 v4Var) {
        Objects.requireNonNull(this.f116838f);
        this.f116834b.j(this);
        this.f116838f.s(v4Var);
    }

    @Override // v.v4.a
    public boolean stop() {
        boolean z11;
        com.google.common.util.concurrent.s<List<Surface>> sVar = null;
        try {
            synchronized (this.f116833a) {
                try {
                    if (!this.f116845m) {
                        com.google.common.util.concurrent.s<List<Surface>> sVar2 = this.f116842j;
                        sVar = sVar2 != null ? sVar2 : null;
                        this.f116845m = true;
                    }
                    z11 = !D();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (sVar != null) {
                sVar.cancel(true);
            }
            return z11;
        } catch (Throwable th3) {
            if (sVar != null) {
                sVar.cancel(true);
            }
            throw th3;
        }
    }

    @Override // v.v4.c
    public void t(@NonNull v4 v4Var) {
        Objects.requireNonNull(this.f116838f);
        this.f116838f.t(v4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // v.v4.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void A(@NonNull final v4 v4Var) {
        com.google.common.util.concurrent.s<Void> sVar;
        synchronized (this.f116833a) {
            try {
                if (this.f116846n) {
                    sVar = null;
                } else {
                    this.f116846n = true;
                    u5.h.h(this.f116840h, "Need to call openCaptureSession before using this API.");
                    sVar = this.f116840h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar != null) {
            sVar.b(new Runnable() { // from class: v.y4
                @Override // java.lang.Runnable
                public final void run() {
                    b5.y(this.f117405a, v4Var);
                }
            }, i0.c.b());
        }
    }

    @Override // v.v4.c
    public void v(@NonNull v4 v4Var, @NonNull Surface surface) {
        Objects.requireNonNull(this.f116838f);
        this.f116838f.v(v4Var, surface);
    }

    @Override // v.v4
    @NonNull
    public v4.c d() {
        return this;
    }

    class a implements j0.c<Void> {
        a() {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            b5.this.k();
            b5 b5Var = b5.this;
            b5Var.f116834b.i(b5Var);
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
        }
    }

    @Override // v.v4
    public void e(int i11) {
    }
}
