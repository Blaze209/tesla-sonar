package xz;

/* JADX INFO: loaded from: classes6.dex */
final class n extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f124190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f124191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f124192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f124193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f124196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f124197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f124198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f124199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f124200m;

    n(a0 a0Var, int i11, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f124190c = a0Var;
        this.f124191d = i11;
        this.f124192e = a0Var.D(str);
        this.f124193f = a0Var.D(str2);
        if (str3 != null) {
            this.f124194g = a0Var.D(str3);
        }
        if (obj != null) {
            this.f124195h = a0Var.d(obj).f124301a;
        }
    }

    @Override // xz.m
    public a a(String str, boolean z11) {
        if (z11) {
            b bVarJ = b.j(this.f124190c, str, this.f124196i);
            this.f124196i = bVarJ;
            return bVarJ;
        }
        b bVarJ2 = b.j(this.f124190c, str, this.f124197j);
        this.f124197j = bVarJ2;
        return bVarJ2;
    }

    @Override // xz.m
    public void b(c cVar) {
        cVar.f124121c = this.f124200m;
        this.f124200m = cVar;
    }

    @Override // xz.m
    public a d(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b bVarI = b.i(this.f124190c, i11, c0Var, str, this.f124198k);
            this.f124198k = bVarI;
            return bVarI;
        }
        b bVarI2 = b.i(this.f124190c, i11, c0Var, str, this.f124199l);
        this.f124199l = bVarI2;
        return bVarI2;
    }

    final void e(c.a aVar) {
        aVar.b(this.f124200m);
    }

    int f() {
        int i11;
        if (this.f124195h != 0) {
            this.f124190c.D("ConstantValue");
            i11 = 16;
        } else {
            i11 = 8;
        }
        int iB = i11 + c.b(this.f124190c, this.f124191d, this.f124194g) + b.g(this.f124196i, this.f124197j, this.f124198k, this.f124199l);
        c cVar = this.f124200m;
        return cVar != null ? iB + cVar.a(this.f124190c) : iB;
    }

    void g(d dVar) {
        boolean z11 = this.f124190c.R() < 49;
        dVar.k((~(z11 ? 4096 : 0)) & this.f124191d).k(this.f124192e).k(this.f124193f);
        int iD = this.f124195h != 0 ? 1 : 0;
        int i11 = this.f124191d;
        if ((i11 & 4096) != 0 && z11) {
            iD++;
        }
        if (this.f124194g != 0) {
            iD++;
        }
        if ((131072 & i11) != 0) {
            iD++;
        }
        if (this.f124196i != null) {
            iD++;
        }
        if (this.f124197j != null) {
            iD++;
        }
        if (this.f124198k != null) {
            iD++;
        }
        if (this.f124199l != null) {
            iD++;
        }
        c cVar = this.f124200m;
        if (cVar != null) {
            iD += cVar.d();
        }
        dVar.k(iD);
        if (this.f124195h != 0) {
            dVar.k(this.f124190c.D("ConstantValue")).i(2).k(this.f124195h);
        }
        c.f(this.f124190c, this.f124191d, this.f124194g, dVar);
        b.l(this.f124190c, this.f124196i, this.f124197j, this.f124198k, this.f124199l, dVar);
        c cVar2 = this.f124200m;
        if (cVar2 != null) {
            cVar2.g(this.f124190c, dVar);
        }
    }

    @Override // xz.m
    public void c() {
    }
}
