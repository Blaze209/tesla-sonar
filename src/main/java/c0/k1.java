package c0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i3;
import androidx.camera.core.impl.w2;

/* JADX INFO: loaded from: classes.dex */
public interface k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final k1 f18346a = new k1() { // from class: c0.j1
        @Override // c0.k1
        public final k1.c e(k1.b bVar) {
            return k1.c.f18351d;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final k1 f18347b = new androidx.camera.core.impl.m0.b(c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final k1 f18348c = new androidx.camera.core.impl.m0(c());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k1 f18349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f18350b;

        public a(@NonNull k1 k1Var) {
            this.f18349a = k1Var;
            this.f18350b = k1Var.a();
        }

        @NonNull
        public k1 a() {
            k1 k1Var = this.f18349a;
            return k1Var instanceof w2 ? ((w2) k1Var).b(this.f18350b) : new i3(this.f18350b, this.f18349a);
        }
    }

    public interface b {
        long a();

        Throwable getCause();

        int getStatus();
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public static final c f18351d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public static final c f18352e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public static final c f18353f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public static c f18354g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f18355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f18356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18357c;

        private c(boolean z11) {
            this(z11, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f18355a;
        }

        public boolean c() {
            return this.f18357c;
        }

        public boolean d() {
            return this.f18356b;
        }

        private c(boolean z11, long j11) {
            this(z11, j11, false);
        }

        private c(boolean z11, long j11, boolean z12) {
            this.f18356b = z11;
            this.f18355a = j11;
            if (z12) {
                u5.h.b(!z11, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f18357c = z12;
        }
    }

    static long c() {
        return 6000L;
    }

    default long a() {
        return 0L;
    }

    @NonNull
    c e(@NonNull b bVar);
}
