package z0;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.h3;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.core.util.Consumer;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f126074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f126075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g1.n f126076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g1.k f126077d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f126078e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0.z1 f126079f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f126080g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g1.k.c.a f126081h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f126082i = b.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.common.util.concurrent.s<Void> f126083j = j0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f126084k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.google.common.util.concurrent.s<g1.k> f126085l = j0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<g1.k> f126086m = null;

    /* JADX INFO: Access modifiers changed from: private */
    enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    b2(@NonNull g1.n nVar, @NonNull Executor executor, @NonNull Executor executor2) {
        this.f126074a = executor2;
        this.f126075b = executor;
        this.f126076c = nVar;
    }

    public static /* synthetic */ Object a(b2 b2Var, c0.z1 z1Var, h3 h3Var, b1.i iVar, s sVar, androidx.concurrent.futures.c.a aVar) {
        b2Var.j(z1Var, h3Var, iVar, sVar, aVar);
        return "ConfigureVideoEncoderFuture " + b2Var;
    }

    public static /* synthetic */ Object d(b2 b2Var, androidx.concurrent.futures.c.a aVar) {
        b2Var.f126084k = aVar;
        return "ReleasedFuture " + b2Var;
    }

    public static /* synthetic */ Object f(b2 b2Var, androidx.concurrent.futures.c.a aVar) {
        b2Var.f126086m = aVar;
        return "ReadyToReleaseFuture " + b2Var;
    }

    public static /* synthetic */ void g(final b2 b2Var, androidx.concurrent.futures.c.a aVar, c0.z1 z1Var, final Surface surface) {
        Executor executor;
        int iOrdinal = b2Var.f126082i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (z1Var.t()) {
                    c0.y0.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(z1Var, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    b2Var.h();
                    return;
                }
                b2Var.f126078e = surface;
                c0.y0.a("VideoEncoderSession", "provide surface: " + surface);
                z1Var.u(surface, b2Var.f126075b, new Consumer() { // from class: z0.z1
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.f126382a.o((c0.z1.g) obj);
                    }
                });
                b2Var.f126082i = b.READY;
                aVar.c(b2Var.f126077d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (b2Var.f126081h != null && (executor = b2Var.f126080g) != null) {
                        executor.execute(new Runnable() { // from class: z0.a2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f126069a.f126081h.a(surface);
                            }
                        });
                    }
                    c0.y0.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + b2Var.f126082i + " is not handled");
                }
            }
        }
        c0.y0.a("VideoEncoderSession", "Not provide surface in " + b2Var.f126082i);
        aVar.c(null);
    }

    private void h() {
        int iOrdinal = this.f126082i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            r();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            c0.y0.a("VideoEncoderSession", "closeInternal in " + this.f126082i + " state");
            this.f126082i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            c0.y0.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f126082i + " is not handled");
    }

    private void j(@NonNull final c0.z1 z1Var, @NonNull h3 h3Var, b1.i iVar, @NonNull s sVar, @NonNull final androidx.concurrent.futures.c.a<g1.k> aVar) {
        c0.b0 b0VarN = z1Var.n();
        try {
            g1.k kVarA = this.f126076c.a(this.f126074a, f1.k.c(f1.k.d(sVar, b0VarN, iVar), h3Var, sVar.d(), z1Var.p(), b0VarN, z1Var.o()));
            this.f126077d = kVarA;
            g1.k.b bVarB = kVarA.b();
            if (bVarB instanceof g1.k.c) {
                ((g1.k.c) bVarB).a(this.f126075b, new g1.k.c.a() { // from class: z0.y1
                    @Override // g1.k.c.a
                    public final void a(Surface surface) {
                        b2.g(this.f126375a, aVar, z1Var, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (InvalidConfigException e11) {
            c0.y0.d("VideoEncoderSession", "Unable to initialize video encoder.", e11);
            aVar.f(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(@NonNull c0.z1.g gVar) {
        c0.y0.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface surfaceB = gVar.b();
        if (surfaceB != this.f126078e) {
            surfaceB.release();
            return;
        }
        this.f126078e = null;
        this.f126086m.c(this.f126077d);
        h();
    }

    @NonNull
    com.google.common.util.concurrent.s<g1.k> i(@NonNull final c0.z1 z1Var, @NonNull final h3 h3Var, @NonNull final s sVar, final b1.i iVar) {
        if (this.f126082i.ordinal() != 0) {
            return j0.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f126082i));
        }
        this.f126082i = b.INITIALIZING;
        this.f126079f = z1Var;
        c0.y0.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f126083j = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.v1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return b2.d(this.f126345a, aVar);
            }
        });
        this.f126085l = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.w1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return b2.f(this.f126356a, aVar);
            }
        });
        com.google.common.util.concurrent.s sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: z0.x1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return b2.a(this.f126367a, z1Var, h3Var, iVar, sVar, aVar);
            }
        });
        j0.n.j(sVarA, new a(), this.f126075b);
        return j0.n.s(sVarA);
    }

    Surface k() {
        if (this.f126082i != b.READY) {
            return null;
        }
        return this.f126078e;
    }

    @NonNull
    com.google.common.util.concurrent.s<g1.k> l() {
        return j0.n.s(this.f126085l);
    }

    g1.k m() {
        return this.f126077d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    boolean n(@NonNull c0.z1 z1Var) {
        int iOrdinal = this.f126082i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f126079f == z1Var) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.f126082i + " is not handled");
                    }
                } else if (this.f126079f == z1Var) {
                    return true;
                }
            }
        }
        return false;
    }

    void p(@NonNull Executor executor, @NonNull g1.k.c.a aVar) {
        this.f126080g = executor;
        this.f126081h = aVar;
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> q() {
        h();
        return j0.n.s(this.f126083j);
    }

    void r() {
        int iOrdinal = this.f126082i.ordinal();
        if (iOrdinal == 0) {
            this.f126082i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f126082i + " is not handled");
            }
            c0.y0.a("VideoEncoderSession", "terminateNow in " + this.f126082i + ", No-op");
            return;
        }
        this.f126082i = b.RELEASED;
        this.f126086m.c(this.f126077d);
        this.f126079f = null;
        if (this.f126077d == null) {
            c0.y0.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f126084k.c(null);
            return;
        }
        c0.y0.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f126077d);
        this.f126077d.release();
        this.f126077d.e().b(new Runnable() { // from class: z0.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f126343a.f126084k.c(null);
            }
        }, this.f126075b);
        this.f126077d = null;
    }

    @NonNull
    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f126079f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    class a implements j0.c<g1.k> {
        a() {
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            c0.y0.m("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            b2.this.r();
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(g1.k kVar) {
        }
    }
}
