package bg;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ig.a<PointF>> f17102a;

    public e(List<ig.a<PointF>> list) {
        this.f17102a = list;
    }

    @Override // bg.o
    public wf.a<PointF, PointF> a() {
        return this.f17102a.get(0).i() ? new wf.k(this.f17102a) : new wf.j(this.f17102a);
    }

    @Override // bg.o
    public List<ig.a<PointF>> b() {
        return this.f17102a;
    }

    @Override // bg.o
    public boolean isStatic() {
        return this.f17102a.size() == 1 && this.f17102a.get(0).i();
    }
}
