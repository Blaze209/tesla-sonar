package wf;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PointF f121759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final PointF f121760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f121761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f121762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected ig.c<Float> f121763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ig.c<Float> f121764n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f121759i = new PointF();
        this.f121760j = new PointF();
        this.f121761k = aVar;
        this.f121762l = aVar2;
        n(f());
    }

    @Override // wf.a
    public void n(float f11) {
        this.f121761k.n(f11);
        this.f121762l.n(f11);
        this.f121759i.set(this.f121761k.h().floatValue(), this.f121762l.h().floatValue());
        for (int i11 = 0; i11 < this.f121717a.size(); i11++) {
            this.f121717a.get(i11).e();
        }
    }

    @Override // wf.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // wf.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(ig.a<PointF> aVar, float f11) {
        Float fB;
        ig.a<Float> aVarB;
        ig.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f121763m == null || (aVarB2 = this.f121761k.b()) == null) {
            fB = null;
        } else {
            Float f12 = aVarB2.f77663h;
            ig.c<Float> cVar = this.f121763m;
            float f13 = aVarB2.f77662g;
            fB = cVar.b(f13, f12 == null ? f13 : f12.floatValue(), aVarB2.f77657b, aVarB2.f77658c, this.f121761k.d(), this.f121761k.e(), this.f121761k.f());
        }
        if (this.f121764n != null && (aVarB = this.f121762l.b()) != null) {
            Float f14 = aVarB.f77663h;
            ig.c<Float> cVar2 = this.f121764n;
            float f15 = aVarB.f77662g;
            fB2 = cVar2.b(f15, f14 == null ? f15 : f14.floatValue(), aVarB.f77657b, aVarB.f77658c, this.f121762l.d(), this.f121762l.e(), this.f121762l.f());
        }
        if (fB == null) {
            this.f121760j.set(this.f121759i.x, BitmapDescriptorFactory.HUE_RED);
        } else {
            this.f121760j.set(fB.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        if (fB2 == null) {
            PointF pointF = this.f121760j;
            pointF.set(pointF.x, this.f121759i.y);
        } else {
            PointF pointF2 = this.f121760j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f121760j;
    }

    public void t(ig.c<Float> cVar) {
        ig.c<Float> cVar2 = this.f121763m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f121763m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(ig.c<Float> cVar) {
        ig.c<Float> cVar2 = this.f121764n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f121764n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
