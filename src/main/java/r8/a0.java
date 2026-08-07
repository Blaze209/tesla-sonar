package r8;

import androidx.media3.exoplayer.l2;
import androidx.media3.exoplayer.m2;
import p7.r0;
import p7.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f107152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s8.d f107153b;

    protected final s8.d a() {
        return (s8.d) s7.a.j(this.f107153b);
    }

    public w0 b() {
        return w0.F;
    }

    public m2.a c() {
        return null;
    }

    public void e(a aVar, s8.d dVar) {
        s7.a.h(this.f107152a == null);
        this.f107152a = aVar;
        this.f107153b = dVar;
    }

    protected final void f() {
        a aVar = this.f107152a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(l2 l2Var) {
        a aVar = this.f107152a;
        if (aVar != null) {
            aVar.d(l2Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f107152a = null;
        this.f107153b = null;
    }

    public abstract b0 k(m2[] m2VarArr, n8.y yVar, androidx.media3.exoplayer.source.r.b bVar, r0 r0Var);

    public interface a {
        void b();

        default void d(l2 l2Var) {
        }
    }

    public void l(p7.d dVar) {
    }

    public void m(w0 w0Var) {
    }
}
