package pq0;

/* JADX INFO: loaded from: classes10.dex */
public class d extends uq0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uq0.d[] f103645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103646b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103647c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103648d = false;

    public d(uq0.d... dVarArr) {
        this.f103645a = dVarArr;
    }

    @Override // uq0.f
    public uq0.f a(int i11) {
        this.f103647c = i11;
        return this;
    }

    @Override // uq0.f
    public uq0.f b(int i11) {
        this.f103646b = i11;
        return this;
    }

    @Override // uq0.f
    public uq0.f e() {
        this.f103648d = true;
        return this;
    }

    public uq0.d[] f() {
        return this.f103645a;
    }

    public int g() {
        return this.f103647c;
    }

    public int h() {
        return this.f103646b;
    }

    public boolean i() {
        return this.f103648d;
    }
}
