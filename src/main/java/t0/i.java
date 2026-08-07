package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.g2;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.j0;
import c0.a2;
import com.google.common.util.concurrent.s;
import h0.r;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
class i implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final j0 f111981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final o f111982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final p f111983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2.b f111984d;

    i(@NonNull j0 j0Var, @NonNull a2.b bVar, @NonNull f.a aVar) {
        this.f111981a = j0Var;
        this.f111984d = bVar;
        this.f111982b = new o(j0Var.l(), aVar);
        this.f111983c = new p(j0Var.e());
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public g2<j0.a> a() {
        return this.f111981a.a();
    }

    @Override // c0.a2.b
    public void d(@NonNull a2 a2Var) {
        r.b();
        this.f111984d.d(a2Var);
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public i0 e() {
        return this.f111983c;
    }

    @Override // c0.a2.b
    public void f(@NonNull a2 a2Var) {
        r.b();
        this.f111984d.f(a2Var);
    }

    @Override // c0.a2.b
    public void j(@NonNull a2 a2Var) {
        r.b();
        this.f111984d.j(a2Var);
    }

    @Override // c0.a2.b
    public void k(@NonNull a2 a2Var) {
        r.b();
        this.f111984d.k(a2Var);
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public CameraControlInternal l() {
        return this.f111982b;
    }

    @Override // androidx.camera.core.impl.j0
    public void o(@NonNull Collection<a2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.j0
    public void p(@NonNull Collection<a2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.j0
    public boolean q() {
        return false;
    }

    void r(int i11) {
        this.f111983c.A(i11);
    }

    @Override // androidx.camera.core.impl.j0
    @NonNull
    public s<Void> release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
