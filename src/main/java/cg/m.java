package cg;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.b f19286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.b f19287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.n f19288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19289e;

    public m(String str, bg.b bVar, bg.b bVar2, bg.n nVar, boolean z11) {
        this.f19285a = str;
        this.f19286b = bVar;
        this.f19287c = bVar2;
        this.f19288d = nVar;
        this.f19289e = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.p(pVar, bVar, this);
    }

    public bg.b b() {
        return this.f19286b;
    }

    public String c() {
        return this.f19285a;
    }

    public bg.b d() {
        return this.f19287c;
    }

    public bg.n e() {
        return this.f19288d;
    }

    public boolean f() {
        return this.f19289e;
    }
}
