package rr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e implements hr.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hr.p f108749d = new hr.p() { // from class: rr.d
        @Override // hr.p
        public final hr.k[] d() {
            return e.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f108750a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts.d0 f108751b = new ts.d0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f108752c;

    public static /* synthetic */ hr.k[] b() {
        return new hr.k[]{new e()};
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f108752c = false;
        this.f108750a.a();
    }

    @Override // hr.k
    public void e(hr.m mVar) {
        this.f108750a.d(mVar, new i0.d(0, 1));
        mVar.j();
        mVar.p(new hr.z.b(-9223372036854775807L));
    }

    @Override // hr.k
    public boolean h(hr.l lVar) {
        ts.d0 d0Var = new ts.d0(10);
        int i11 = 0;
        while (true) {
            lVar.e(d0Var.e(), 0, 10);
            d0Var.U(0);
            if (d0Var.K() != 4801587) {
                break;
            }
            d0Var.V(3);
            int iG = d0Var.G();
            i11 += iG + 10;
            lVar.i(iG);
        }
        lVar.g();
        lVar.i(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            lVar.e(d0Var.e(), 0, 7);
            d0Var.U(0);
            int iN = d0Var.N();
            if (iN == 44096 || iN == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int iE = dr.c.e(d0Var.e(), iN);
                if (iE == -1) {
                    return false;
                }
                lVar.i(iE - 7);
            } else {
                lVar.g();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                lVar.i(i13);
                i12 = 0;
            }
        }
    }

    @Override // hr.k
    public int i(hr.l lVar, hr.y yVar) {
        int i11 = lVar.read(this.f108751b.e(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f108751b.U(0);
        this.f108751b.T(i11);
        if (!this.f108752c) {
            this.f108750a.c(0L, 4);
            this.f108752c = true;
        }
        this.f108750a.b(this.f108751b);
        return 0;
    }

    @Override // hr.k
    public void release() {
    }
}
