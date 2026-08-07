package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f73313a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f73314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f73316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f73319g;

    public void a(b0 b0Var, b0.a aVar) {
        if (this.f73315c > 0) {
            b0Var.e(this.f73316d, this.f73317e, this.f73318f, this.f73319g, aVar);
            this.f73315c = 0;
        }
    }

    public void b() {
        this.f73314b = false;
        this.f73315c = 0;
    }

    public void c(b0 b0Var, long j11, int i11, int i12, int i13, b0.a aVar) {
        ts.a.h(this.f73319g <= i12 + i13, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f73314b) {
            int i14 = this.f73315c;
            int i15 = i14 + 1;
            this.f73315c = i15;
            if (i14 == 0) {
                this.f73316d = j11;
                this.f73317e = i11;
                this.f73318f = 0;
            }
            this.f73318f += i12;
            this.f73319g = i13;
            if (i15 >= 16) {
                a(b0Var, aVar);
            }
        }
    }

    public void d(l lVar) {
        if (this.f73314b) {
            return;
        }
        lVar.e(this.f73313a, 0, 10);
        lVar.g();
        if (dr.b.j(this.f73313a) == 0) {
            return;
        }
        this.f73314b = true;
    }
}
