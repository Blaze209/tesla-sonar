package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f121390a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f121391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f121392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f121393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f121394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f121395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f121396g;

    public void a(o0 o0Var, o0.a aVar) {
        if (this.f121392c > 0) {
            o0Var.b(this.f121393d, this.f121394e, this.f121395f, this.f121396g, aVar);
            this.f121392c = 0;
        }
    }

    public void b() {
        this.f121391b = false;
        this.f121392c = 0;
    }

    public void c(o0 o0Var, long j11, int i11, int i12, int i13, o0.a aVar) {
        s7.a.i(this.f121396g <= i12 + i13, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f121391b) {
            int i14 = this.f121392c;
            int i15 = i14 + 1;
            this.f121392c = i15;
            if (i14 == 0) {
                this.f121393d = j11;
                this.f121394e = i11;
                this.f121395f = 0;
            }
            this.f121395f += i12;
            this.f121396g = i13;
            if (i15 >= 16) {
                a(o0Var, aVar);
            }
        }
    }

    public void d(q qVar) {
        if (this.f121391b) {
            return;
        }
        qVar.e(this.f121390a, 0, 10);
        qVar.g();
        if (b.j(this.f121390a) == 0) {
            return;
        }
        this.f121391b = true;
    }
}
