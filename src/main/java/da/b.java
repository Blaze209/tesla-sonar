package da;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements w8.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w8.u f59932d = new w8.u() { // from class: da.a
        @Override // w8.u
        public final w8.p[] d() {
            return b.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f59933a = new c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f59934b = new s7.c0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f59935c;

    public static /* synthetic */ w8.p[] b() {
        return new w8.p[]{new b()};
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f59935c = false;
        this.f59933a.a();
    }

    @Override // w8.p
    public void e(w8.r rVar) {
        this.f59933a.d(rVar, new l0.d(0, 1));
        rVar.j();
        rVar.t(new w8.j0.b(-9223372036854775807L));
    }

    @Override // w8.p
    public int h(w8.q qVar, w8.i0 i0Var) {
        int i11 = qVar.read(this.f59934b.f(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f59934b.b0(0);
        this.f59934b.a0(i11);
        if (!this.f59935c) {
            this.f59933a.c(0L, 4);
            this.f59935c = true;
        }
        this.f59933a.b(this.f59934b);
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
            qVar.e(c0Var.f(), 0, 6);
            c0Var.b0(0);
            if (c0Var.U() != 2935) {
                qVar.g();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                qVar.i(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int iG = w8.b.g(c0Var.f());
                if (iG == -1) {
                    return false;
                }
                qVar.i(iG - 6);
            }
        }
    }

    @Override // w8.p
    public void release() {
    }
}
