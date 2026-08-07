package c0;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.n2;
import androidx.camera.core.impl.p3;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x implements k0.k<w> {
    static final androidx.camera.core.impl.x0.a<androidx.camera.core.impl.g0.a> L = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.cameraFactoryProvider", androidx.camera.core.impl.g0.a.class);
    static final androidx.camera.core.impl.x0.a<androidx.camera.core.impl.f0.a> M = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", androidx.camera.core.impl.f0.a.class);
    static final androidx.camera.core.impl.x0.a<p3.c> N = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", p3.c.class);
    static final androidx.camera.core.impl.x0.a<Executor> O = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    static final androidx.camera.core.impl.x0.a<Handler> P = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    static final androidx.camera.core.impl.x0.a<Integer> Q = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);
    static final androidx.camera.core.impl.x0.a<p> R = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.availableCamerasLimiter", p.class);
    static final androidx.camera.core.impl.x0.a<Long> S = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
    static final androidx.camera.core.impl.x0.a<k1> T = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", k1.class);
    static final androidx.camera.core.impl.x0.a<n2> U = androidx.camera.core.impl.x0.a.a("camerax.core.appConfig.quirksSettings", n2.class);
    private final i2 K;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.camera.core.impl.d2 f18466a;

        public a() {
            this(androidx.camera.core.impl.d2.c0());
        }

        @NonNull
        private androidx.camera.core.impl.c2 b() {
            return this.f18466a;
        }

        @NonNull
        public x a() {
            return new x(i2.b0(this.f18466a));
        }

        @NonNull
        public a c(@NonNull androidx.camera.core.impl.g0.a aVar) {
            b().K(x.L, aVar);
            return this;
        }

        @NonNull
        public a d(@NonNull androidx.camera.core.impl.f0.a aVar) {
            b().K(x.M, aVar);
            return this;
        }

        @NonNull
        public a e(@NonNull Class<w> cls) {
            b().K(k0.k.I, cls);
            if (b().d(k0.k.H, null) == null) {
                f(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        @NonNull
        public a f(@NonNull String str) {
            b().K(k0.k.H, str);
            return this;
        }

        @NonNull
        public a g(@NonNull p3.c cVar) {
            b().K(x.N, cVar);
            return this;
        }

        private a(androidx.camera.core.impl.d2 d2Var) {
            this.f18466a = d2Var;
            Class cls = (Class) d2Var.d(k0.k.I, null);
            if (cls == null || cls.equals(w.class)) {
                e(w.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        @NonNull
        x getCameraXConfig();
    }

    x(i2 i2Var) {
        this.K = i2Var;
    }

    public p Z(p pVar) {
        return (p) this.K.d(R, pVar);
    }

    public Executor a0(Executor executor) {
        return (Executor) this.K.d(O, executor);
    }

    public androidx.camera.core.impl.g0.a b0(androidx.camera.core.impl.g0.a aVar) {
        return (androidx.camera.core.impl.g0.a) this.K.d(L, aVar);
    }

    public long c0() {
        return ((Long) this.K.d(S, -1L)).longValue();
    }

    @NonNull
    public k1 d0() {
        k1 k1Var = (k1) this.K.d(T, k1.f18347b);
        Objects.requireNonNull(k1Var);
        return k1Var;
    }

    public androidx.camera.core.impl.f0.a e0(androidx.camera.core.impl.f0.a aVar) {
        return (androidx.camera.core.impl.f0.a) this.K.d(M, aVar);
    }

    public n2 f0() {
        return (n2) this.K.d(U, null);
    }

    public Handler g0(Handler handler) {
        return (Handler) this.K.d(P, handler);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public androidx.camera.core.impl.x0 getConfig() {
        return this.K;
    }

    public p3.c h0(p3.c cVar) {
        return (p3.c) this.K.d(N, cVar);
    }
}
