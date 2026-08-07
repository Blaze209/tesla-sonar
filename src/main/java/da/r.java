package da;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60252a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w8.o0 f60254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60255d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60258g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.c0 f60253b = new s7.c0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f60256e = -9223372036854775807L;

    public r(String str) {
        this.f60252a = str;
    }

    @Override // da.m
    public void a() {
        this.f60255d = false;
        this.f60256e = -9223372036854775807L;
    }

    @Override // da.m
    public void b(s7.c0 c0Var) {
        s7.a.j(this.f60254c);
        if (this.f60255d) {
            int iA = c0Var.a();
            int i11 = this.f60258g;
            if (i11 < 10) {
                int iMin = Math.min(iA, 10 - i11);
                System.arraycopy(c0Var.f(), c0Var.g(), this.f60253b.f(), this.f60258g, iMin);
                if (this.f60258g + iMin == 10) {
                    this.f60253b.b0(0);
                    if (73 != this.f60253b.M() || 68 != this.f60253b.M() || 51 != this.f60253b.M()) {
                        s7.t.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f60255d = false;
                        return;
                    } else {
                        this.f60253b.c0(3);
                        this.f60257f = this.f60253b.L() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f60257f - this.f60258g);
            this.f60254c.f(c0Var, iMin2);
            this.f60258g += iMin2;
        }
    }

    @Override // da.m
    public void c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f60255d = true;
        this.f60256e = j11;
        this.f60257f = 0;
        this.f60258g = 0;
    }

    @Override // da.m
    public void d(w8.r rVar, l0.d dVar) {
        dVar.a();
        w8.o0 o0VarB = rVar.b(dVar.c(), 5);
        this.f60254c = o0VarB;
        o0VarB.g(new p7.u.b().j0(dVar.b()).W(this.f60252a).y0("application/id3").P());
    }

    @Override // da.m
    public void e(boolean z11) {
        int i11;
        s7.a.j(this.f60254c);
        if (this.f60255d && (i11 = this.f60257f) != 0 && this.f60258g == i11) {
            s7.a.h(this.f60256e != -9223372036854775807L);
            this.f60254c.b(this.f60256e, 1, this.f60257f, 0, null);
            this.f60255d = false;
        }
    }
}
