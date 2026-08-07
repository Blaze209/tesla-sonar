package cg;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bg.o<PointF, PointF> f19281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bg.o<PointF, PointF> f19282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bg.b f19283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19284e;

    public l(String str, bg.o<PointF, PointF> oVar, bg.o<PointF, PointF> oVar2, bg.b bVar, boolean z11) {
        this.f19280a = str;
        this.f19281b = oVar;
        this.f19282c = oVar2;
        this.f19283d = bVar;
        this.f19284e = z11;
    }

    @Override // cg.c
    public vf.c a(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar) {
        return new vf.o(pVar, bVar, this);
    }

    public bg.b b() {
        return this.f19283d;
    }

    public String c() {
        return this.f19280a;
    }

    public bg.o<PointF, PointF> d() {
        return this.f19281b;
    }

    public bg.o<PointF, PointF> e() {
        return this.f19282c;
    }

    public boolean f() {
        return this.f19284e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f19281b + ", size=" + this.f19282c + CoreConstants.CURLY_RIGHT;
    }
}
