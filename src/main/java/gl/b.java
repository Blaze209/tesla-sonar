package gl;

import bm.e;
import bm.i;
import bm.j;
import bm.n;
import java.io.Closeable;
import ll.i0;
import um.m;

/* JADX INFO: loaded from: classes3.dex */
public class b extends bm.a<m> implements Closeable, i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wk.b f69173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f69174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f69175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f69176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f69177g;

    public b(wk.b bVar, j jVar, i iVar) {
        this(bVar, jVar, iVar, true);
    }

    private void J(j jVar, long j11) {
        jVar.R(false);
        jVar.L(j11);
        e0(jVar, n.INVISIBLE);
    }

    private void c0(j jVar, e eVar) {
        jVar.H(eVar);
        this.f69175e.a(jVar, eVar);
        i iVar = this.f69176f;
        if (iVar != null) {
            iVar.a(jVar, eVar);
        }
    }

    private void e0(j jVar, n nVar) {
        this.f69175e.b(jVar, nVar);
        i iVar = this.f69176f;
        if (iVar != null) {
            iVar.b(jVar, nVar);
        }
    }

    @Override // bm.a, bm.b
    public void B(String str, Throwable th2, bm.b.a aVar) {
        long jNow = this.f69173c.now();
        j jVar = this.f69174d;
        jVar.F(aVar);
        jVar.z(jNow);
        jVar.B(str);
        jVar.E(th2);
        c0(jVar, e.ERROR);
        J(jVar, jNow);
    }

    @Override // bm.a, bm.b
    public void C(String str, Object obj, bm.b.a aVar) {
        long jNow = this.f69173c.now();
        j jVar = this.f69174d;
        jVar.x();
        jVar.D(jNow);
        jVar.B(str);
        jVar.y(obj);
        jVar.F(aVar);
        c0(jVar, e.REQUESTED);
        if (this.f69177g) {
            T(jVar, jNow);
        }
    }

    @Override // bm.a, bm.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(String str, m mVar, bm.b.a aVar) {
        long jNow = this.f69173c.now();
        j jVar = this.f69174d;
        jVar.F(aVar);
        jVar.A(jNow);
        jVar.J(jNow);
        jVar.B(str);
        jVar.G(mVar);
        c0(jVar, e.SUCCESS);
    }

    @Override // bm.a, bm.b
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void c(String str, m mVar) {
        long jNow = this.f69173c.now();
        j jVar = this.f69174d;
        jVar.C(jNow);
        jVar.B(str);
        jVar.G(mVar);
        c0(jVar, e.INTERMEDIATE_AVAILABLE);
    }

    public void T(j jVar, long j11) {
        jVar.R(true);
        jVar.Q(j11);
        e0(jVar, n.VISIBLE);
    }

    public void b0() {
        this.f69174d.w();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0();
    }

    @Override // ll.i0
    public void o(boolean z11) {
        if (z11) {
            T(this.f69174d, this.f69173c.now());
        } else {
            J(this.f69174d, this.f69173c.now());
        }
    }

    @Override // bm.a, bm.b
    public void t(String str, bm.b.a aVar) {
        long jNow = this.f69173c.now();
        j jVar = this.f69174d;
        jVar.F(aVar);
        jVar.B(str);
        c0(jVar, e.RELEASED);
        if (this.f69177g) {
            J(jVar, jNow);
        }
    }

    public b(wk.b bVar, j jVar, i iVar, boolean z11) {
        this.f69176f = null;
        this.f69173c = bVar;
        this.f69174d = jVar;
        this.f69175e = iVar;
        this.f69177g = z11;
    }

    @Override // ll.i0
    public void onDraw() {
    }
}
