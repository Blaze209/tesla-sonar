package z9;

import android.text.Layout;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f127943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f127944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f127945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f127947e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f127953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f127954l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f127957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f127958p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f127960r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f127962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f127963u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f127948f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f127949g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f127950h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f127951i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f127952j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f127955m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f127956n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f127959q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f127961s = Float.MAX_VALUE;

    private g t(g gVar, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f127945c && gVar.f127945c) {
                z(gVar.f127944b);
            }
            if (this.f127950h == -1) {
                this.f127950h = gVar.f127950h;
            }
            if (this.f127951i == -1) {
                this.f127951i = gVar.f127951i;
            }
            if (this.f127943a == null && (str = gVar.f127943a) != null) {
                this.f127943a = str;
            }
            if (this.f127948f == -1) {
                this.f127948f = gVar.f127948f;
            }
            if (this.f127949g == -1) {
                this.f127949g = gVar.f127949g;
            }
            if (this.f127956n == -1) {
                this.f127956n = gVar.f127956n;
            }
            if (this.f127957o == null && (alignment2 = gVar.f127957o) != null) {
                this.f127957o = alignment2;
            }
            if (this.f127958p == null && (alignment = gVar.f127958p) != null) {
                this.f127958p = alignment;
            }
            if (this.f127959q == -1) {
                this.f127959q = gVar.f127959q;
            }
            if (this.f127952j == -1) {
                this.f127952j = gVar.f127952j;
                this.f127953k = gVar.f127953k;
            }
            if (this.f127960r == null) {
                this.f127960r = gVar.f127960r;
            }
            if (this.f127961s == Float.MAX_VALUE) {
                this.f127961s = gVar.f127961s;
            }
            if (this.f127962t == null) {
                this.f127962t = gVar.f127962t;
            }
            if (this.f127963u == null) {
                this.f127963u = gVar.f127963u;
            }
            if (z11 && !this.f127947e && gVar.f127947e) {
                w(gVar.f127946d);
            }
            if (z11 && this.f127955m == -1 && (i11 = gVar.f127955m) != -1) {
                this.f127955m = i11;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f127943a = str;
        return this;
    }

    public g B(float f11) {
        this.f127953k = f11;
        return this;
    }

    public g C(int i11) {
        this.f127952j = i11;
        return this;
    }

    public g D(String str) {
        this.f127954l = str;
        return this;
    }

    public g E(boolean z11) {
        this.f127951i = z11 ? 1 : 0;
        return this;
    }

    public g F(boolean z11) {
        this.f127948f = z11 ? 1 : 0;
        return this;
    }

    public g G(Layout.Alignment alignment) {
        this.f127958p = alignment;
        return this;
    }

    public g H(String str) {
        this.f127962t = str;
        return this;
    }

    public g I(int i11) {
        this.f127956n = i11;
        return this;
    }

    public g J(int i11) {
        this.f127955m = i11;
        return this;
    }

    public g K(float f11) {
        this.f127961s = f11;
        return this;
    }

    public g L(Layout.Alignment alignment) {
        this.f127957o = alignment;
        return this;
    }

    public g M(boolean z11) {
        this.f127959q = z11 ? 1 : 0;
        return this;
    }

    public g N(b bVar) {
        this.f127960r = bVar;
        return this;
    }

    public g O(boolean z11) {
        this.f127949g = z11 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return t(gVar, true);
    }

    public int b() {
        if (this.f127947e) {
            return this.f127946d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public String c() {
        return this.f127963u;
    }

    public int d() {
        if (this.f127945c) {
            return this.f127944b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String e() {
        return this.f127943a;
    }

    public float f() {
        return this.f127953k;
    }

    public int g() {
        return this.f127952j;
    }

    public String h() {
        return this.f127954l;
    }

    public Layout.Alignment i() {
        return this.f127958p;
    }

    public String j() {
        return this.f127962t;
    }

    public int k() {
        return this.f127956n;
    }

    public int l() {
        return this.f127955m;
    }

    public float m() {
        return this.f127961s;
    }

    public int n() {
        int i11 = this.f127950h;
        if (i11 == -1 && this.f127951i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f127951i == 1 ? 2 : 0);
    }

    public Layout.Alignment o() {
        return this.f127957o;
    }

    public boolean p() {
        return this.f127959q == 1;
    }

    public b q() {
        return this.f127960r;
    }

    public boolean r() {
        return this.f127947e;
    }

    public boolean s() {
        return this.f127945c;
    }

    public boolean u() {
        return this.f127948f == 1;
    }

    public boolean v() {
        return this.f127949g == 1;
    }

    public g w(int i11) {
        this.f127946d = i11;
        this.f127947e = true;
        return this;
    }

    public g x(boolean z11) {
        this.f127950h = z11 ? 1 : 0;
        return this;
    }

    public g y(String str) {
        this.f127963u = str;
        return this;
    }

    public g z(int i11) {
        this.f127944b = i11;
        this.f127945c = true;
        return this;
    }
}
