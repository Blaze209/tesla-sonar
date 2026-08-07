package hr;

import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f73378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73379b;

    public s(t tVar, long j11) {
        this.f73378a = tVar;
        this.f73379b = j11;
    }

    private a0 a(long j11, long j12) {
        return new a0((j11 * 1000000) / ((long) this.f73378a.f73384e), this.f73379b + j12);
    }

    @Override // hr.z
    public z.a c(long j11) {
        ts.a.i(this.f73378a.f73390k);
        t tVar = this.f73378a;
        t.a aVar = tVar.f73390k;
        long[] jArr = aVar.f73392a;
        long[] jArr2 = aVar.f73393b;
        int i11 = p0.i(jArr, tVar.i(j11), true, false);
        a0 a0VarA = a(i11 == -1 ? 0L : jArr[i11], i11 != -1 ? jArr2[i11] : 0L);
        if (a0VarA.f73301a == j11 || i11 == jArr.length - 1) {
            return new z.a(a0VarA);
        }
        int i12 = i11 + 1;
        return new z.a(a0VarA, a(jArr[i12], jArr2[i12]));
    }

    @Override // hr.z
    public boolean d() {
        return true;
    }

    @Override // hr.z
    public long g() {
        return this.f73378a.f();
    }
}
