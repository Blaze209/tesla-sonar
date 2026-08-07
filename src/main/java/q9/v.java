package q9;

import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f105092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f105093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f105095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105097f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f105103l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f105105n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f105107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f105108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f105109r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f105098g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f105099h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f105100i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f105101j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f105102k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f105104m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0 f105106o = new c0();

    public void a(c0 c0Var) {
        c0Var.q(this.f105106o.f(), 0, this.f105106o.j());
        this.f105106o.b0(0);
        this.f105107p = false;
    }

    public void b(w8.q qVar) {
        qVar.readFully(this.f105106o.f(), 0, this.f105106o.j());
        this.f105106o.b0(0);
        this.f105107p = false;
    }

    public long c(int i11) {
        return this.f105101j[i11];
    }

    public void d(int i11) {
        this.f105106o.X(i11);
        this.f105103l = true;
        this.f105107p = true;
    }

    public void e(int i11, int i12) {
        this.f105096e = i11;
        this.f105097f = i12;
        if (this.f105099h.length < i11) {
            this.f105098g = new long[i11];
            this.f105099h = new int[i11];
        }
        if (this.f105100i.length < i12) {
            int i13 = (i12 * 125) / 100;
            this.f105100i = new int[i13];
            this.f105101j = new long[i13];
            this.f105102k = new boolean[i13];
            this.f105104m = new boolean[i13];
        }
    }

    public void f() {
        this.f105096e = 0;
        this.f105108q = 0L;
        this.f105109r = false;
        this.f105103l = false;
        this.f105107p = false;
        this.f105105n = null;
    }

    public boolean g(int i11) {
        return this.f105103l && this.f105104m[i11];
    }
}
