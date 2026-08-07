package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2809a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2810b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2811c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2812d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2813e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2814f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2815g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2816h = false;

    t0() {
    }

    public int a() {
        return this.f2815g ? this.f2809a : this.f2810b;
    }

    public int b() {
        return this.f2809a;
    }

    public int c() {
        return this.f2810b;
    }

    public int d() {
        return this.f2815g ? this.f2810b : this.f2809a;
    }

    public void e(int i11, int i12) {
        this.f2816h = false;
        if (i11 != Integer.MIN_VALUE) {
            this.f2813e = i11;
            this.f2809a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2814f = i12;
            this.f2810b = i12;
        }
    }

    public void f(boolean z11) {
        if (z11 == this.f2815g) {
            return;
        }
        this.f2815g = z11;
        if (!this.f2816h) {
            this.f2809a = this.f2813e;
            this.f2810b = this.f2814f;
            return;
        }
        if (z11) {
            int i11 = this.f2812d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f2813e;
            }
            this.f2809a = i11;
            int i12 = this.f2811c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f2814f;
            }
            this.f2810b = i12;
            return;
        }
        int i13 = this.f2811c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f2813e;
        }
        this.f2809a = i13;
        int i14 = this.f2812d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = this.f2814f;
        }
        this.f2810b = i14;
    }

    public void g(int i11, int i12) {
        this.f2811c = i11;
        this.f2812d = i12;
        this.f2816h = true;
        if (this.f2815g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f2809a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f2810b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f2809a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f2810b = i12;
        }
    }
}
