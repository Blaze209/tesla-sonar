package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final CameraControlInternal f3082a = new b();

    public static final class CameraControlException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private r f3083a;

        public CameraControlException(@NonNull r rVar) {
            this.f3083a = rVar;
        }
    }

    class a implements e0.l {
        a() {
        }

        @Override // e0.l
        @NonNull
        public com.google.common.util.concurrent.s<Void> a() {
            return j0.n.p(null);
        }

        @Override // e0.l
        @NonNull
        public com.google.common.util.concurrent.s<Void> b() {
            return j0.n.p(null);
        }
    }

    class b implements CameraControlInternal {
        b() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void a(@NonNull x2.b bVar) {
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public com.google.common.util.concurrent.s<Void> c(boolean z11) {
            return j0.n.p(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public com.google.common.util.concurrent.s<List<Void>> d(@NonNull List<v0> list, int i11, int i12) {
            return j0.n.p(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public com.google.common.util.concurrent.s<Void> e(float f11) {
            return j0.n.p(null);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public com.google.common.util.concurrent.s<c0.f0> g(@NonNull c0.e0 e0Var) {
            return j0.n.p(c0.f0.b());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void i(@NonNull x0 x0Var) {
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public com.google.common.util.concurrent.s<Integer> j(int i11) {
            return j0.n.p(0);
        }

        @Override // androidx.camera.core.CameraControl
        @NonNull
        public com.google.common.util.concurrent.s<Void> k() {
            return j0.n.p(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public Rect l() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void m(int i11) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        @NonNull
        public x0 n() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void p() {
        }
    }

    public interface c {
        void a(@NonNull List<v0> list);

        void b();
    }

    void a(@NonNull x2.b bVar);

    default void b() {
    }

    @NonNull
    com.google.common.util.concurrent.s<List<Void>> d(@NonNull List<v0> list, int i11, int i12);

    default void h() {
    }

    void i(@NonNull x0 x0Var);

    @NonNull
    Rect l();

    void m(int i11);

    @NonNull
    x0 n();

    @NonNull
    default com.google.common.util.concurrent.s<e0.l> o(int i11, int i12) {
        return j0.n.p(new a());
    }

    void p();

    default void f(c0.r0.i iVar) {
    }
}
