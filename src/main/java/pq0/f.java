package pq0;

import sq0.w;

/* JADX INFO: loaded from: classes10.dex */
public class f implements vq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f103656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f103657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f103659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f103660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f103661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f103662g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f103663h = 1;

    public f(w wVar, char c11, boolean z11, boolean z12, f fVar) {
        this.f103656a = wVar;
        this.f103657b = c11;
        this.f103658c = z11;
        this.f103659d = z12;
        this.f103660e = fVar;
    }

    @Override // vq0.b
    public boolean a() {
        return this.f103659d;
    }

    @Override // vq0.b
    public int b() {
        return this.f103663h;
    }

    @Override // vq0.b
    public boolean c() {
        return this.f103658c;
    }

    @Override // vq0.b
    public int length() {
        return this.f103662g;
    }
}
