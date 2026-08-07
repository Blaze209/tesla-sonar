package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.u f121292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.u f121293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f121294c;

    public e0(long[] jArr, long[] jArr2, long j11) {
        s7.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f121292a = new s7.u(length);
            this.f121293b = new s7.u(length);
        } else {
            int i11 = length + 1;
            s7.u uVar = new s7.u(i11);
            this.f121292a = uVar;
            s7.u uVar2 = new s7.u(i11);
            this.f121293b = uVar2;
            uVar.a(0L);
            uVar2.a(0L);
        }
        this.f121292a.b(jArr);
        this.f121293b.b(jArr2);
        this.f121294c = j11;
    }

    public void a(long j11, long j12) {
        if (this.f121293b.d() == 0 && j11 > 0) {
            this.f121292a.a(0L);
            this.f121293b.a(0L);
        }
        this.f121292a.a(j12);
        this.f121293b.a(j11);
    }

    public long b(long j11) {
        if (this.f121293b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f121293b.c(s7.q0.i(this.f121292a, j11, true, true));
    }

    @Override // w8.j0
    public j0.a c(long j11) {
        if (this.f121293b.d() == 0) {
            return new j0.a(k0.f121335c);
        }
        int i11 = s7.q0.i(this.f121293b, j11, true, true);
        k0 k0Var = new k0(this.f121293b.c(i11), this.f121292a.c(i11));
        if (k0Var.f121336a == j11 || i11 == this.f121293b.d() - 1) {
            return new j0.a(k0Var);
        }
        int i12 = i11 + 1;
        return new j0.a(k0Var, new k0(this.f121293b.c(i12), this.f121292a.c(i12)));
    }

    @Override // w8.j0
    public boolean d() {
        return this.f121293b.d() > 0;
    }

    public boolean e(long j11, long j12) {
        if (this.f121293b.d() == 0) {
            return false;
        }
        s7.u uVar = this.f121293b;
        return j11 - uVar.c(uVar.d() - 1) < j12;
    }

    @Override // w8.j0
    public long g() {
        return this.f121294c;
    }

    public void h(long j11) {
        this.f121294c = j11;
    }
}
