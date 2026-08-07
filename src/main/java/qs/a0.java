package qs;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.z1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f105956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ss.d f105957b;

    protected final ss.d b() {
        return (ss.d) ts.a.i(this.f105957b);
    }

    public y c() {
        return y.A;
    }

    public a2.a d() {
        return null;
    }

    public void e(a aVar, ss.d dVar) {
        this.f105956a = aVar;
        this.f105957b = dVar;
    }

    protected final void f() {
        a aVar = this.f105956a;
        if (aVar != null) {
            aVar.b();
        }
    }

    protected final void g(z1 z1Var) {
        a aVar = this.f105956a;
        if (aVar != null) {
            aVar.a(z1Var);
        }
    }

    public boolean h() {
        return false;
    }

    public abstract void i(Object obj);

    public void j() {
        this.f105956a = null;
        this.f105957b = null;
    }

    public abstract b0 k(a2[] a2VarArr, es.w wVar, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var);

    public interface a {
        void b();

        default void a(z1 z1Var) {
        }
    }

    public void l(com.google.android.exoplayer2.audio.a aVar) {
    }

    public void m(y yVar) {
    }
}
