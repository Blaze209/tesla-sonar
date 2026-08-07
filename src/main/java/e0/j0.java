package e0;

import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;
import androidx.camera.core.impl.s1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final s1 f61337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u0 f61338b;

    j0(@NonNull s1 s1Var) {
        this.f61337a = s1Var;
    }

    public static /* synthetic */ void e(j0 j0Var, s1.a aVar, s1 s1Var) {
        j0Var.getClass();
        aVar.a(j0Var);
    }

    private androidx.camera.core.n j(androidx.camera.core.n nVar) {
        if (nVar == null) {
            return null;
        }
        g3 g3VarB = this.f61338b == null ? g3.b() : g3.a(new Pair(this.f61338b.j(), this.f61338b.i().get(0)));
        this.f61338b = null;
        return new androidx.camera.core.r(nVar, new Size(nVar.getWidth(), nVar.getHeight()), new k0.b(new t0.k(g3VarB, nVar.z().a())));
    }

    @Override // androidx.camera.core.impl.s1
    public int a() {
        return this.f61337a.a();
    }

    @Override // androidx.camera.core.impl.s1
    public int b() {
        return this.f61337a.b();
    }

    @Override // androidx.camera.core.impl.s1
    public androidx.camera.core.n c() {
        return j(this.f61337a.c());
    }

    @Override // androidx.camera.core.impl.s1
    public void close() {
        this.f61337a.close();
    }

    @Override // androidx.camera.core.impl.s1
    public androidx.camera.core.n d() {
        return j(this.f61337a.d());
    }

    @Override // androidx.camera.core.impl.s1
    public void f() {
        this.f61337a.f();
    }

    @Override // androidx.camera.core.impl.s1
    public void g(@NonNull final s1.a aVar, @NonNull Executor executor) {
        this.f61337a.g(new s1.a() { // from class: e0.i0
            @Override // androidx.camera.core.impl.s1.a
            public final void a(s1 s1Var) {
                j0.e(this.f61333a, aVar, s1Var);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.s1
    public int getHeight() {
        return this.f61337a.getHeight();
    }

    @Override // androidx.camera.core.impl.s1
    public Surface getSurface() {
        return this.f61337a.getSurface();
    }

    @Override // androidx.camera.core.impl.s1
    public int getWidth() {
        return this.f61337a.getWidth();
    }

    void h(@NonNull u0 u0Var) {
        u5.h.j(this.f61338b == null, "Pending request should be null");
        this.f61338b = u0Var;
    }

    void i() {
        this.f61338b = null;
    }
}
