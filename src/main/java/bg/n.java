package bg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class n implements cg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<PointF, PointF> f17117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f17118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f17119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f17120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f17121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f17122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f17123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f17124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17125j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return null;
    }

    public wf.p b() {
        return new wf.p(this);
    }

    public e c() {
        return this.f17116a;
    }

    public b d() {
        return this.f17124i;
    }

    public d e() {
        return this.f17120e;
    }

    public o<PointF, PointF> f() {
        return this.f17117b;
    }

    public b g() {
        return this.f17119d;
    }

    public g h() {
        return this.f17118c;
    }

    public b i() {
        return this.f17121f;
    }

    public b j() {
        return this.f17122g;
    }

    public b k() {
        return this.f17123h;
    }

    public boolean l() {
        return this.f17125j;
    }

    public void m(boolean z11) {
        this.f17125j = z11;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f17125j = false;
        this.f17116a = eVar;
        this.f17117b = oVar;
        this.f17118c = gVar;
        this.f17119d = bVar;
        this.f17120e = dVar;
        this.f17123h = bVar2;
        this.f17124i = bVar3;
        this.f17121f = bVar4;
        this.f17122g = bVar5;
    }
}
