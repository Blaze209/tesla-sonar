package ns;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f95419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f95420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95422e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f95428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f95429l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f95432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f95433p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f95435r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f95423f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95424g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f95425h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95426i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95427j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f95430m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f95431n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f95434q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f95436s = Float.MAX_VALUE;

    private g r(g gVar, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f95420c && gVar.f95420c) {
                w(gVar.f95419b);
            }
            if (this.f95425h == -1) {
                this.f95425h = gVar.f95425h;
            }
            if (this.f95426i == -1) {
                this.f95426i = gVar.f95426i;
            }
            if (this.f95418a == null && (str = gVar.f95418a) != null) {
                this.f95418a = str;
            }
            if (this.f95423f == -1) {
                this.f95423f = gVar.f95423f;
            }
            if (this.f95424g == -1) {
                this.f95424g = gVar.f95424g;
            }
            if (this.f95431n == -1) {
                this.f95431n = gVar.f95431n;
            }
            if (this.f95432o == null && (alignment2 = gVar.f95432o) != null) {
                this.f95432o = alignment2;
            }
            if (this.f95433p == null && (alignment = gVar.f95433p) != null) {
                this.f95433p = alignment;
            }
            if (this.f95434q == -1) {
                this.f95434q = gVar.f95434q;
            }
            if (this.f95427j == -1) {
                this.f95427j = gVar.f95427j;
                this.f95428k = gVar.f95428k;
            }
            if (this.f95435r == null) {
                this.f95435r = gVar.f95435r;
            }
            if (this.f95436s == Float.MAX_VALUE) {
                this.f95436s = gVar.f95436s;
            }
            if (z11 && !this.f95422e && gVar.f95422e) {
                u(gVar.f95421d);
            }
            if (z11 && this.f95430m == -1 && (i11 = gVar.f95430m) != -1) {
                this.f95430m = i11;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f95429l = str;
        return this;
    }

    public g B(boolean z11) {
        this.f95426i = z11 ? 1 : 0;
        return this;
    }

    public g C(boolean z11) {
        this.f95423f = z11 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f95433p = alignment;
        return this;
    }

    public g E(int i11) {
        this.f95431n = i11;
        return this;
    }

    public g F(int i11) {
        this.f95430m = i11;
        return this;
    }

    public g G(float f11) {
        this.f95436s = f11;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f95432o = alignment;
        return this;
    }

    public g I(boolean z11) {
        this.f95434q = z11 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f95435r = bVar;
        return this;
    }

    public g K(boolean z11) {
        this.f95424g = z11 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f95422e) {
            return this.f95421d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f95420c) {
            return this.f95419b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f95418a;
    }

    public float e() {
        return this.f95428k;
    }

    public int f() {
        return this.f95427j;
    }

    public String g() {
        return this.f95429l;
    }

    public Layout.Alignment h() {
        return this.f95433p;
    }

    public int i() {
        return this.f95431n;
    }

    public int j() {
        return this.f95430m;
    }

    public float k() {
        return this.f95436s;
    }

    public int l() {
        int i11 = this.f95425h;
        if (i11 == -1 && this.f95426i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f95426i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f95432o;
    }

    public boolean n() {
        return this.f95434q == 1;
    }

    public b o() {
        return this.f95435r;
    }

    public boolean p() {
        return this.f95422e;
    }

    public boolean q() {
        return this.f95420c;
    }

    public boolean s() {
        return this.f95423f == 1;
    }

    public boolean t() {
        return this.f95424g == 1;
    }

    public g u(int i11) {
        this.f95421d = i11;
        this.f95422e = true;
        return this;
    }

    public g v(boolean z11) {
        this.f95425h = z11 ? 1 : 0;
        return this;
    }

    public g w(int i11) {
        this.f95419b = i11;
        this.f95420c = true;
        return this;
    }

    public g x(String str) {
        this.f95418a = str;
        return this;
    }

    public g y(float f11) {
        this.f95428k = f11;
        return this;
    }

    public g z(int i11) {
        this.f95427j = i11;
        return this;
    }
}
