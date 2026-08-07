package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class u2 extends l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraControlInternal f3309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z2 f3310d;

    public u2(@NonNull CameraControlInternal cameraControlInternal, z2 z2Var) {
        super(cameraControlInternal);
        this.f3309c = cameraControlInternal;
        this.f3310d = z2Var;
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> c(boolean z11) {
        return !h0.p.b(this.f3310d, 6) ? j0.n.n(new IllegalStateException("Torch is not supported")) : this.f3309c.c(z11);
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> e(float f11) {
        return !h0.p.b(this.f3310d, 0) ? j0.n.n(new IllegalStateException("Zoom is not supported")) : this.f3309c.e(f11);
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<c0.f0> g(@NonNull c0.e0 e0Var) {
        c0.e0 e0VarA = h0.p.a(this.f3310d, e0Var);
        return e0VarA == null ? j0.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f3309c.g(e0VarA);
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Integer> j(int i11) {
        return !h0.p.b(this.f3310d, 7) ? j0.n.n(new IllegalStateException("ExposureCompensation is not supported")) : this.f3309c.j(i11);
    }

    @Override // androidx.camera.core.impl.l1, androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> k() {
        return this.f3309c.k();
    }
}
