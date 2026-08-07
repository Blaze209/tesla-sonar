package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.p3;
import androidx.camera.core.impl.x0;
import androidx.camera.core.impl.z2;

/* JADX INFO: loaded from: classes.dex */
class b implements b0 {
    public static final x0.a<Integer> L = x0.a.a("camerax.extensions.extensionMode", Integer.TYPE);
    private final x0 K;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d2 f3458a = d2.c0();

        a() {
        }

        b a() {
            return new b(this.f3458a);
        }

        @NonNull
        public a b(boolean z11) {
            this.f3458a.K(b0.f3128g, Boolean.valueOf(z11));
            return this;
        }

        @NonNull
        public a c(@NonNull n1 n1Var) {
            this.f3458a.K(b0.f3123b, n1Var);
            return this;
        }

        public a d(int i11) {
            this.f3458a.K(b.L, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public a e(boolean z11) {
            this.f3458a.K(b0.f3127f, Boolean.valueOf(z11));
            return this;
        }

        @NonNull
        public a f(@NonNull z2 z2Var) {
            this.f3458a.K(b0.f3125d, z2Var);
            return this;
        }

        @NonNull
        public a g(int i11) {
            this.f3458a.K(b0.f3124c, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public a h(@NonNull p3 p3Var) {
            this.f3458a.K(b0.f3122a, p3Var);
            return this;
        }

        @NonNull
        public a i(boolean z11) {
            this.f3458a.K(b0.f3126e, Boolean.valueOf(z11));
            return this;
        }
    }

    b(x0 x0Var) {
        this.K = x0Var;
    }

    @Override // androidx.camera.core.impl.b0
    @NonNull
    public n1 E() {
        return (n1) a(b0.f3123b);
    }

    @Override // androidx.camera.core.impl.s2
    @NonNull
    public x0 getConfig() {
        return this.K;
    }
}
