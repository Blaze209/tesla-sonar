package bg;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f17103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f17104b;

    public i(b bVar, b bVar2) {
        this.f17103a = bVar;
        this.f17104b = bVar2;
    }

    @Override // bg.o
    public wf.a<PointF, PointF> a() {
        return new wf.n(this.f17103a.a(), this.f17104b.a());
    }

    @Override // bg.o
    public List<ig.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // bg.o
    public boolean isStatic() {
        return this.f17103a.isStatic() && this.f17104b.isStatic();
    }
}
