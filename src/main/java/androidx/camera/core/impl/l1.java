package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l1 implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraControlInternal f3219b;

    public l1(@NonNull CameraControlInternal cameraControlInternal) {
        this.f3219b = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(@NonNull x2.b bVar) {
        this.f3219b.a(bVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void b() {
        this.f3219b.b();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> c(boolean z11) {
        return this.f3219b.c(z11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.s<List<Void>> d(@NonNull List<v0> list, int i11, int i12) {
        return this.f3219b.d(list, i11, i12);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> e(float f11) {
        return this.f3219b.e(f11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void f(c0.r0.i iVar) {
        this.f3219b.f(iVar);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<c0.f0> g(@NonNull c0.e0 e0Var) {
        return this.f3219b.g(e0Var);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void h() {
        this.f3219b.h();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i(@NonNull x0 x0Var) {
        this.f3219b.i(x0Var);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Integer> j(int i11) {
        return this.f3219b.j(i11);
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public com.google.common.util.concurrent.s<Void> k() {
        return this.f3219b.k();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public Rect l() {
        return this.f3219b.l();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void m(int i11) {
        this.f3219b.m(i11);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public x0 n() {
        return this.f3219b.n();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public com.google.common.util.concurrent.s<e0.l> o(int i11, int i12) {
        return this.f3219b.o(i11, i12);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void p() {
        this.f3219b.p();
    }
}
