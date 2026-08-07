package vf;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class o implements wf.a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f119190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f119191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.p f119192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wf.a<?, PointF> f119193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wf.a<?, PointF> f119194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wf.a<?, Float> f119195h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f119198k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119188a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f119189b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f119196i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private wf.a<Float, Float> f119197j = null;

    public o(com.airbnb.lottie.p pVar, dg.b bVar, cg.l lVar) {
        this.f119190c = lVar.c();
        this.f119191d = lVar.f();
        this.f119192e = pVar;
        wf.a<PointF, PointF> aVarA = lVar.d().a();
        this.f119193f = aVarA;
        wf.a<PointF, PointF> aVarA2 = lVar.e().a();
        this.f119194g = aVarA2;
        wf.d dVarA = lVar.b().a();
        this.f119195h = dVarA;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        bVar.j(dVarA);
        aVarA.a(this);
        aVarA2.a(this);
        dVarA.a(this);
    }

    private void c() {
        this.f119198k = false;
        this.f119192e.invalidateSelf();
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        c();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == cg.t.a.SIMULTANEOUSLY) {
                    this.f119196i.a(uVar);
                    uVar.c(this);
                } else if (cVar instanceof q) {
                    this.f119197j = ((q) cVar).g();
                }
            } else if (cVar instanceof q) {
                this.f119197j = ((q) cVar).g();
            }
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.f113283l) {
            this.f119194g.o(cVar);
        } else if (t11 == d0.f113285n) {
            this.f119193f.o(cVar);
        } else if (t11 == d0.f113284m) {
            this.f119195h.o(cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119190c;
    }

    @Override // vf.m
    public Path getPath() {
        wf.a<Float, Float> aVar;
        if (this.f119198k) {
            return this.f119188a;
        }
        this.f119188a.reset();
        if (this.f119191d) {
            this.f119198k = true;
            return this.f119188a;
        }
        PointF pointFH = this.f119194g.h();
        float f11 = pointFH.x / 2.0f;
        float f12 = pointFH.y / 2.0f;
        wf.a<?, Float> aVar2 = this.f119195h;
        float fR = aVar2 == null ? 0.0f : ((wf.d) aVar2).r();
        if (fR == BitmapDescriptorFactory.HUE_RED && (aVar = this.f119197j) != null) {
            fR = Math.min(aVar.h().floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f119193f.h();
        this.f119188a.moveTo(pointFH2.x + f11, (pointFH2.y - f12) + fR);
        this.f119188a.lineTo(pointFH2.x + f11, (pointFH2.y + f12) - fR);
        if (fR > BitmapDescriptorFactory.HUE_RED) {
            RectF rectF = this.f119189b;
            float f13 = pointFH2.x;
            float f14 = fR * 2.0f;
            float f15 = pointFH2.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f119188a.arcTo(this.f119189b, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        }
        this.f119188a.lineTo((pointFH2.x - f11) + fR, pointFH2.y + f12);
        if (fR > BitmapDescriptorFactory.HUE_RED) {
            RectF rectF2 = this.f119189b;
            float f16 = pointFH2.x;
            float f17 = pointFH2.y;
            float f18 = fR * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f119188a.arcTo(this.f119189b, 90.0f, 90.0f, false);
        }
        this.f119188a.lineTo(pointFH2.x - f11, (pointFH2.y - f12) + fR);
        if (fR > BitmapDescriptorFactory.HUE_RED) {
            RectF rectF3 = this.f119189b;
            float f19 = pointFH2.x;
            float f21 = pointFH2.y;
            float f22 = fR * 2.0f;
            rectF3.set(f19 - f11, f21 - f12, (f19 - f11) + f22, (f21 - f12) + f22);
            this.f119188a.arcTo(this.f119189b, 180.0f, 90.0f, false);
        }
        this.f119188a.lineTo((pointFH2.x + f11) - fR, pointFH2.y - f12);
        if (fR > BitmapDescriptorFactory.HUE_RED) {
            RectF rectF4 = this.f119189b;
            float f23 = pointFH2.x;
            float f24 = fR * 2.0f;
            float f25 = pointFH2.y;
            rectF4.set((f23 + f11) - f24, f25 - f12, f23 + f11, (f25 - f12) + f24);
            this.f119188a.arcTo(this.f119189b, 270.0f, 90.0f, false);
        }
        this.f119188a.close();
        this.f119196i.b(this.f119188a);
        this.f119198k = true;
        return this.f119188a;
    }
}
