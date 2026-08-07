package ea;

import s7.q0;
import w8.j0;
import w8.k0;

/* JADX INFO: loaded from: classes3.dex */
final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f62328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f62330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f62331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f62332e;

    public e(c cVar, int i11, long j11, long j12) {
        this.f62328a = cVar;
        this.f62329b = i11;
        this.f62330c = j11;
        long j13 = (j12 - j11) / ((long) cVar.f62321e);
        this.f62331d = j13;
        this.f62332e = a(j13);
    }

    private long a(long j11) {
        return q0.s1(j11 * ((long) this.f62329b), 1000000L, this.f62328a.f62319c);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        long jS = q0.s((((long) this.f62328a.f62319c) * j11) / (((long) this.f62329b) * 1000000), 0L, this.f62331d - 1);
        long j12 = this.f62330c + (((long) this.f62328a.f62321e) * jS);
        long jA = a(jS);
        k0 k0Var = new k0(jA, j12);
        if (jA >= j11 || jS == this.f62331d - 1) {
            return new j0.a(k0Var);
        }
        long j13 = jS + 1;
        return new j0.a(k0Var, new k0(a(j13), this.f62330c + (((long) this.f62328a.f62321e) * j13)));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // w8.j0
    public long g() {
        return this.f62332e;
    }
}
