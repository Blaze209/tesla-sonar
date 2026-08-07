package or;

import hr.a0;
import hr.z;
import ts.p0;
import ts.v;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f98463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f98464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f98465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f98466d;

    public b(long j11, long j12, long j13) {
        this.f98466d = j11;
        this.f98463a = j13;
        v vVar = new v();
        this.f98464b = vVar;
        v vVar2 = new v();
        this.f98465c = vVar2;
        vVar.a(0L);
        vVar2.a(j12);
    }

    public boolean a(long j11) {
        v vVar = this.f98464b;
        return j11 - vVar.b(vVar.c() - 1) < 100000;
    }

    @Override // or.g
    public long b(long j11) {
        return this.f98464b.b(p0.g(this.f98465c, j11, true, true));
    }

    @Override // hr.z
    public z.a c(long j11) {
        int iG = p0.g(this.f98464b, j11, true, true);
        a0 a0Var = new a0(this.f98464b.b(iG), this.f98465c.b(iG));
        if (a0Var.f73301a == j11 || iG == this.f98464b.c() - 1) {
            return new z.a(a0Var);
        }
        int i11 = iG + 1;
        return new z.a(a0Var, new a0(this.f98464b.b(i11), this.f98465c.b(i11)));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    public void e(long j11, long j12) {
        if (a(j11)) {
            return;
        }
        this.f98464b.a(j11);
        this.f98465c.a(j12);
    }

    @Override // or.g
    public long f() {
        return this.f98463a;
    }

    @Override // hr.z
    public long g() {
        return this.f98466d;
    }

    void h(long j11) {
        this.f98466d = j11;
    }
}
