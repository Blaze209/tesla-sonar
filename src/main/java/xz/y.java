package xz;

/* JADX INFO: loaded from: classes6.dex */
final class y extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f124292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f124293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f124294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f124295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f124296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f124297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f124298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f124299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f124300k;

    y(a0 a0Var, String str, String str2, String str3) {
        super(589824);
        this.f124292c = a0Var;
        this.f124293d = a0Var.D(str);
        this.f124294e = a0Var.D(str2);
        if (str3 != null) {
            this.f124295f = a0Var.D(str3);
        }
    }

    @Override // xz.x
    public a a(String str, boolean z11) {
        if (z11) {
            b bVarJ = b.j(this.f124292c, str, this.f124296g);
            this.f124296g = bVarJ;
            return bVarJ;
        }
        b bVarJ2 = b.j(this.f124292c, str, this.f124297h);
        this.f124297h = bVarJ2;
        return bVarJ2;
    }

    @Override // xz.x
    public void b(c cVar) {
        cVar.f124121c = this.f124300k;
        this.f124300k = cVar;
    }

    @Override // xz.x
    public a d(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124292c, i11, c0Var, str, this.f124298i);
            this.f124298i = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124292c, i11, c0Var, str, this.f124299j);
        this.f124299j = bVarI2;
        return bVarI2;
    }

    final void e(c.a aVar) {
        aVar.b(this.f124300k);
    }

    int f() {
        int iB = c.b(this.f124292c, 0, this.f124295f) + 6 + b.g(this.f124296g, this.f124297h, this.f124298i, this.f124299j);
        c cVar = this.f124300k;
        return cVar != null ? iB + cVar.a(this.f124292c) : iB;
    }

    void g(d dVar) {
        dVar.k(this.f124293d).k(this.f124294e);
        int iD = this.f124295f != 0 ? 1 : 0;
        if (this.f124296g != null) {
            iD++;
        }
        if (this.f124297h != null) {
            iD++;
        }
        if (this.f124298i != null) {
            iD++;
        }
        if (this.f124299j != null) {
            iD++;
        }
        c cVar = this.f124300k;
        if (cVar != null) {
            iD += cVar.d();
        }
        dVar.k(iD);
        c.f(this.f124292c, 0, this.f124295f, dVar);
        b.l(this.f124292c, this.f124296g, this.f124297h, this.f124298i, this.f124299j, dVar);
        c cVar2 = this.f124300k;
        if (cVar2 != null) {
            cVar2.g(this.f124292c, dVar);
        }
    }

    @Override // xz.x
    public void c() {
    }
}
