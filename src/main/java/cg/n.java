package cg;

/* JADX INFO: loaded from: classes3.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.o<Float, Float> f19291b;

    public n(String str, bg.o<Float, Float> oVar) {
        this.f19290a = str;
        this.f19291b = oVar;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.q(pVar, bVar, this);
    }

    public bg.o<Float, Float> b() {
        return this.f19291b;
    }

    public String c() {
        return this.f19290a;
    }
}
