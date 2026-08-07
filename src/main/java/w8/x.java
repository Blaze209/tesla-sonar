package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f121421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f121422b;

    public x(y yVar, long j11) {
        this.f121421a = yVar;
        this.f121422b = j11;
    }

    private k0 a(long j11, long j12) {
        return new k0((j11 * 1000000) / ((long) this.f121421a.f121427e), this.f121422b + j12);
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        s7.a.j(this.f121421a.f121433k);
        y yVar = this.f121421a;
        y.a aVar = yVar.f121433k;
        long[] jArr = aVar.f121435a;
        long[] jArr2 = aVar.f121436b;
        int iK = s7.q0.k(jArr, yVar.i(j11), true, false);
        k0 k0VarA = a(iK == -1 ? 0L : jArr[iK], iK != -1 ? jArr2[iK] : 0L);
        if (k0VarA.f121336a == j11 || iK == jArr.length - 1) {
            return new j0.a(k0VarA);
        }
        int i11 = iK + 1;
        return new j0.a(k0VarA, a(jArr[i11], jArr2[i11]));
    }

    @Override // w8.j0
    public boolean d() {
        return true;
    }

    @Override // w8.j0
    public long g() {
        return this.f121421a.f();
    }
}
