package cg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.o<PointF, PointF> f19233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.f f19234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19236e;

    public b(String str, bg.o<PointF, PointF> oVar, bg.f fVar, boolean z11, boolean z12) {
        this.f19232a = str;
        this.f19233b = oVar;
        this.f19234c = fVar;
        this.f19235d = z11;
        this.f19236e = z12;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.f(pVar, bVar, this);
    }

    public String b() {
        return this.f19232a;
    }

    public bg.o<PointF, PointF> c() {
        return this.f19233b;
    }

    public bg.f d() {
        return this.f19234c;
    }

    public boolean e() {
        return this.f19236e;
    }

    public boolean f() {
        return this.f19235d;
    }
}
