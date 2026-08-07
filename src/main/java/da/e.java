package da;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements w8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w8.u f59970d = new w8.u() { // from class: da.d
        @Override // w8.u
        public final w8.p[] d() {
            return e.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f59971a = new f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59972b = new s7.c0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59973c;

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new e()};
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f59973c = false;
        this.f59971a.a();
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        this.f59971a.d(rVar, new l0.d(0, 1));
        rVar.j();
        rVar.t(new w8.j0.b(-9223372036854775807L));
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) {
        int i11 = qVar.read(this.f59972b.f(), 0, 16384);
        if (i11 == -1) {
            return -1;
        }
        this.f59972b.b0(0);
        this.f59972b.a0(i11);
        if (!this.f59973c) {
            this.f59971a.c(0L, 4);
            this.f59973c = true;
        }
        this.f59971a.b(this.f59972b);
        return 0;
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        s7.c0 c0Var = new s7.c0(10);
        int i11 = 0;
        while (true) {
            qVar.e(c0Var.f(), 0, 10);
            c0Var.b0(0);
            if (c0Var.P() != 4801587) {
                break;
            }
            c0Var.c0(3);
            int iL = c0Var.L();
            i11 += iL + 10;
            qVar.i(iL);
        }
        qVar.g();
        qVar.i(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            qVar.e(c0Var.f(), 0, 7);
            c0Var.b0(0);
            int iU = c0Var.U();
            if (iU == 44096 || iU == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int iH = w8.c.h(c0Var.f(), iU);
                if (iH == -1) {
                    return false;
                }
                qVar.i(iH - 7);
            } else {
                qVar.g();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                qVar.i(i13);
                i12 = 0;
            }
        }
    }

    @Override // w8.p
    public void release() {
    }
}
