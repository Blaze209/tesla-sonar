package wf;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i extends ig.a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f121745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ig.a<PointF> f121746r;

    public i(tf.i iVar, ig.a<PointF> aVar) {
        super(iVar, aVar.f77657b, aVar.f77658c, aVar.f77659d, aVar.f77660e, aVar.f77661f, aVar.f77662g, aVar.f77663h);
        this.f121746r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t11;
        T t12;
        T t13 = this.f77658c;
        boolean z11 = (t13 == 0 || (t12 = this.f77657b) == 0 || !((PointF) t12).equals(((PointF) t13).x, ((PointF) t13).y)) ? false : true;
        T t14 = this.f77657b;
        if (t14 == 0 || (t11 = this.f77658c) == 0 || z11) {
            return;
        }
        ig.a<PointF> aVar = this.f121746r;
        this.f121745q = hg.l.d((PointF) t14, (PointF) t11, aVar.f77670o, aVar.f77671p);
    }

    Path k() {
        return this.f121745q;
    }
}
