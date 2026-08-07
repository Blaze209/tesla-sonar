package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    public static final class a implements z {
        @NonNull
        public static z l() {
            return new a();
        }

        @Override // androidx.camera.core.impl.z
        public long a() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public g3 c() {
            return g3.b();
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public v d() {
            return v.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public x e() {
            return x.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public u f() {
            return u.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public t g() {
            return t.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public y h() {
            return y.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public w i() {
            return w.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.z
        public CaptureResult j() {
            return null;
        }

        @Override // androidx.camera.core.impl.z
        @NonNull
        public s k() {
            return s.UNKNOWN;
        }
    }

    long a();

    default void b(@NonNull h0.i.b bVar) {
        bVar.g(h());
    }

    @NonNull
    g3 c();

    @NonNull
    v d();

    @NonNull
    x e();

    @NonNull
    u f();

    @NonNull
    t g();

    @NonNull
    y h();

    @NonNull
    w i();

    default CaptureResult j() {
        return null;
    }

    @NonNull
    s k();
}
