package pr;

import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f103896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f103897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f103898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f103899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f103900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f103901f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f103907l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f103909n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f103911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f103912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f103913r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f103902g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f103903h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f103904i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f103905j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f103906k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f103908m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f103910o = new d0();

    public void a(hr.l lVar) {
        lVar.readFully(this.f103910o.e(), 0, this.f103910o.g());
        this.f103910o.U(0);
        this.f103911p = false;
    }

    public void b(d0 d0Var) {
        d0Var.l(this.f103910o.e(), 0, this.f103910o.g());
        this.f103910o.U(0);
        this.f103911p = false;
    }

    public long c(int i11) {
        return this.f103905j[i11];
    }

    public void d(int i11) {
        this.f103910o.Q(i11);
        this.f103907l = true;
        this.f103911p = true;
    }

    public void e(int i11, int i12) {
        this.f103900e = i11;
        this.f103901f = i12;
        if (this.f103903h.length < i11) {
            this.f103902g = new long[i11];
            this.f103903h = new int[i11];
        }
        if (this.f103904i.length < i12) {
            int i13 = (i12 * 125) / 100;
            this.f103904i = new int[i13];
            this.f103905j = new long[i13];
            this.f103906k = new boolean[i13];
            this.f103908m = new boolean[i13];
        }
    }

    public void f() {
        this.f103900e = 0;
        this.f103912q = 0L;
        this.f103913r = false;
        this.f103907l = false;
        this.f103911p = false;
        this.f103909n = null;
    }

    public boolean g(int i11) {
        return this.f103907l && this.f103908m[i11];
    }
}
