package xz;

/* JADX INFO: loaded from: classes6.dex */
final class v extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f124266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f124267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f124268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f124269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f124271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f124272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f124273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f124274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f124275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f124276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f124277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f124278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d f124279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f124280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f124281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f124282s;

    v(a0 a0Var, int i11, int i12, int i13) {
        super(589824);
        this.f124266c = a0Var;
        this.f124267d = i11;
        this.f124268e = i12;
        this.f124269f = i13;
        this.f124271h = new d();
        this.f124273j = new d();
        this.f124275l = new d();
        this.f124277n = new d();
        this.f124279p = new d();
        this.f124281r = new d();
    }

    @Override // xz.u
    public void b(String str, int i11, String... strArr) {
        this.f124273j.k(this.f124266c.B(str).f124301a).k(i11);
        if (strArr == null) {
            this.f124273j.k(0);
        } else {
            this.f124273j.k(strArr.length);
            for (String str2 : strArr) {
                this.f124273j.k(this.f124266c.y(str2).f124301a);
            }
        }
        this.f124272i++;
    }

    @Override // xz.u
    public void c(String str) {
        this.f124282s = this.f124266c.e(str).f124301a;
    }

    @Override // xz.u
    public void d(String str, int i11, String... strArr) {
        this.f124275l.k(this.f124266c.B(str).f124301a).k(i11);
        if (strArr == null) {
            this.f124275l.k(0);
        } else {
            this.f124275l.k(strArr.length);
            for (String str2 : strArr) {
                this.f124275l.k(this.f124266c.y(str2).f124301a);
            }
        }
        this.f124274k++;
    }

    @Override // xz.u
    public void e(String str) {
        this.f124281r.k(this.f124266c.B(str).f124301a);
        this.f124280q++;
    }

    @Override // xz.u
    public void f(String str, String... strArr) {
        this.f124279p.k(this.f124266c.e(str).f124301a);
        this.f124279p.k(strArr.length);
        for (String str2 : strArr) {
            this.f124279p.k(this.f124266c.e(str2).f124301a);
        }
        this.f124278o++;
    }

    @Override // xz.u
    public void g(String str, int i11, String str2) {
        this.f124271h.k(this.f124266c.y(str).f124301a).k(i11).k(str2 == null ? 0 : this.f124266c.D(str2));
        this.f124270g++;
    }

    @Override // xz.u
    public void h(String str) {
        this.f124277n.k(this.f124266c.e(str).f124301a);
        this.f124276m++;
    }

    int i() {
        this.f124266c.D("Module");
        int i11 = this.f124271h.f124127b + 22 + this.f124273j.f124127b + this.f124275l.f124127b + this.f124277n.f124127b + this.f124279p.f124127b;
        if (this.f124280q > 0) {
            this.f124266c.D("ModulePackages");
            i11 += this.f124281r.f124127b + 8;
        }
        if (this.f124282s <= 0) {
            return i11;
        }
        this.f124266c.D("ModuleMainClass");
        return i11 + 8;
    }

    int j() {
        return (this.f124280q > 0 ? 1 : 0) + 1 + (this.f124282s > 0 ? 1 : 0);
    }

    void k(d dVar) {
        d dVarK = dVar.k(this.f124266c.D("Module")).i(this.f124271h.f124127b + 16 + this.f124273j.f124127b + this.f124275l.f124127b + this.f124277n.f124127b + this.f124279p.f124127b).k(this.f124267d).k(this.f124268e).k(this.f124269f).k(this.f124270g);
        d dVar2 = this.f124271h;
        d dVarK2 = dVarK.h(dVar2.f124126a, 0, dVar2.f124127b).k(this.f124272i);
        d dVar3 = this.f124273j;
        d dVarK3 = dVarK2.h(dVar3.f124126a, 0, dVar3.f124127b).k(this.f124274k);
        d dVar4 = this.f124275l;
        d dVarK4 = dVarK3.h(dVar4.f124126a, 0, dVar4.f124127b).k(this.f124276m);
        d dVar5 = this.f124277n;
        d dVarK5 = dVarK4.h(dVar5.f124126a, 0, dVar5.f124127b).k(this.f124278o);
        d dVar6 = this.f124279p;
        dVarK5.h(dVar6.f124126a, 0, dVar6.f124127b);
        if (this.f124280q > 0) {
            d dVarK6 = dVar.k(this.f124266c.D("ModulePackages")).i(this.f124281r.f124127b + 2).k(this.f124280q);
            d dVar7 = this.f124281r;
            dVarK6.h(dVar7.f124126a, 0, dVar7.f124127b);
        }
        if (this.f124282s > 0) {
            dVar.k(this.f124266c.D("ModuleMainClass")).i(2).k(this.f124282s);
        }
    }

    @Override // xz.u
    public void a() {
    }
}
