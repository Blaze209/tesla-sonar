package cg;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ag.a> f19292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19294c;

    public o(PointF pointF, boolean z11, List<ag.a> list) {
        this.f19293b = pointF;
        this.f19294c = z11;
        this.f19292a = new ArrayList(list);
    }

    public List<ag.a> a() {
        return this.f19292a;
    }

    public PointF b() {
        return this.f19293b;
    }

    public void c(o oVar, o oVar2, float f11) {
        if (this.f19293b == null) {
            this.f19293b = new PointF();
        }
        this.f19294c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            hg.e.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f19292a.size() < iMin) {
            for (int size = this.f19292a.size(); size < iMin; size++) {
                this.f19292a.add(new ag.a());
            }
        } else if (this.f19292a.size() > iMin) {
            for (int size2 = this.f19292a.size() - 1; size2 >= iMin; size2--) {
                List<ag.a> list = this.f19292a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(hg.j.i(pointFB.x, pointFB2.x, f11), hg.j.i(pointFB.y, pointFB2.y, f11));
        for (int size3 = this.f19292a.size() - 1; size3 >= 0; size3--) {
            ag.a aVar = oVar.a().get(size3);
            ag.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f19292a.get(size3).d(hg.j.i(pointFA.x, pointFA2.x, f11), hg.j.i(pointFA.y, pointFA2.y, f11));
            this.f19292a.get(size3).e(hg.j.i(pointFB3.x, pointFB4.x, f11), hg.j.i(pointFB3.y, pointFB4.y, f11));
            this.f19292a.get(size3).f(hg.j.i(pointFC.x, pointFC2.x, f11), hg.j.i(pointFC.y, pointFC2.y, f11));
        }
    }

    public boolean d() {
        return this.f19294c;
    }

    public void e(boolean z11) {
        this.f19294c = z11;
    }

    public void f(float f11, float f12) {
        if (this.f19293b == null) {
            this.f19293b = new PointF();
        }
        this.f19293b.set(f11, f12);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f19292a.size() + "closed=" + this.f19294c + CoreConstants.CURLY_RIGHT;
    }

    public o() {
        this.f19292a = new ArrayList();
    }
}
