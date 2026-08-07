package vf;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements m, wf.a.b, k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f119173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.p f119174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cg.k.a f119175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f119176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f119177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wf.a<?, Float> f119178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wf.a<?, PointF> f119179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wf.a<?, Float> f119180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wf.a<?, Float> f119181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wf.a<?, Float> f119182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final wf.a<?, Float> f119183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final wf.a<?, Float> f119184p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f119186r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119169a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f119170b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PathMeasure f119171c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f119172d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f119185q = new b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f119187a;

        static {
            int[] iArr = new int[cg.k.a.values().length];
            f119187a = iArr;
            try {
                iArr[cg.k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f119187a[cg.k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.p pVar, dg.b bVar, cg.k kVar) {
        this.f119174f = pVar;
        this.f119173e = kVar.d();
        cg.k.a aVarJ = kVar.j();
        this.f119175g = aVarJ;
        this.f119176h = kVar.k();
        this.f119177i = kVar.l();
        wf.d dVarA = kVar.g().a();
        this.f119178j = dVarA;
        wf.a<PointF, PointF> aVarA = kVar.h().a();
        this.f119179k = aVarA;
        wf.d dVarA2 = kVar.i().a();
        this.f119180l = dVarA2;
        wf.d dVarA3 = kVar.e().a();
        this.f119182n = dVarA3;
        wf.d dVarA4 = kVar.f().a();
        this.f119184p = dVarA4;
        cg.k.a aVar = cg.k.a.STAR;
        if (aVarJ == aVar) {
            this.f119181m = kVar.b().a();
            this.f119183o = kVar.c().a();
        } else {
            this.f119181m = null;
            this.f119183o = null;
        }
        bVar.j(dVarA);
        bVar.j(aVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        bVar.j(dVarA4);
        if (aVarJ == aVar) {
            bVar.j(this.f119181m);
            bVar.j(this.f119183o);
        }
        dVarA.a(this);
        aVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
        dVarA4.a(this);
        if (aVarJ == aVar) {
            this.f119181m.a(this);
            this.f119183o.a(this);
        }
    }

    private void c() {
        double d11;
        float f11;
        float f12;
        float f13;
        int iFloor = (int) Math.floor(this.f119178j.h().floatValue());
        wf.a<?, Float> aVar = this.f119180l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d12 = iFloor;
        float fFloatValue = this.f119184p.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f119182n.h().floatValue();
        double d13 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d13);
        float fSin = (float) (Math.sin(radians) * d13);
        this.f119169a.moveTo(fCos, fSin);
        double d14 = (float) (6.283185307179586d / d12);
        double dCeil = Math.ceil(d12);
        double d15 = radians + d14;
        int i11 = 0;
        while (true) {
            double d16 = i11;
            if (d16 >= dCeil) {
                PointF pointFH = this.f119179k.h();
                this.f119169a.offset(pointFH.x, pointFH.y);
                this.f119169a.close();
                return;
            }
            float fCos2 = (float) (d13 * Math.cos(d15));
            float fSin2 = (float) (Math.sin(d15) * d13);
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                d11 = dCeil;
                f11 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f14 = fFloatValue2 * f11 * 0.25f;
                float f15 = f14 * fCos3;
                float f16 = f14 * fSin3;
                float fCos4 = ((float) Math.cos(dAtan3)) * f14;
                float fSin4 = f14 * ((float) Math.sin(dAtan3));
                if (d16 == d11 - 1.0d) {
                    this.f119170b.reset();
                    this.f119170b.moveTo(fCos, fSin);
                    float f17 = fCos - f15;
                    float f18 = fSin - f16;
                    float f19 = fCos2 + fCos4;
                    float f21 = fSin2 + fSin4;
                    f12 = fCos2;
                    f13 = fSin2;
                    this.f119170b.cubicTo(f17, f18, f19, f21, f12, f13);
                    this.f119171c.setPath(this.f119170b, false);
                    PathMeasure pathMeasure = this.f119171c;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.f119172d, null);
                    Path path = this.f119169a;
                    float[] fArr = this.f119172d;
                    path.cubicTo(f17, f18, f19, f21, fArr[0], fArr[1]);
                } else {
                    f12 = fCos2;
                    f13 = fSin2;
                    this.f119169a.cubicTo(fCos - f15, fSin - f16, f12 + fCos4, f13 + fSin4, f12, f13);
                }
                fCos = f12;
                fSin = f13;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d11 = dCeil;
                f11 = fFloatValue;
                if (d16 != d11 - 1.0d) {
                    this.f119169a.lineTo(fCos, fSin);
                }
                i11++;
                dCeil = d11;
                fFloatValue = f11;
            }
            d15 += d14;
            i11++;
            dCeil = d11;
            fFloatValue = f11;
        }
    }

    private void j() {
        float f11;
        float f12;
        float fCos;
        float fSin;
        float f13;
        double d11;
        float f14;
        float f15;
        float f16;
        float fFloatValue = this.f119178j.h().floatValue();
        wf.a<?, Float> aVar = this.f119180l;
        double radians = Math.toRadians((aVar == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d12 = fFloatValue;
        float f17 = (float) (6.283185307179586d / d12);
        if (this.f119177i) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = fFloatValue - ((int) fFloatValue);
        if (f19 != BitmapDescriptorFactory.HUE_RED) {
            radians += (double) ((1.0f - f19) * f18);
        }
        float fFloatValue2 = this.f119182n.h().floatValue();
        float fFloatValue3 = this.f119181m.h().floatValue();
        wf.a<?, Float> aVar2 = this.f119183o;
        float fFloatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        wf.a<?, Float> aVar3 = this.f119184p;
        float fFloatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (f19 != BitmapDescriptorFactory.HUE_RED) {
            f14 = ((fFloatValue2 - fFloatValue3) * f19) + fFloatValue3;
            f12 = 0.0f;
            double d13 = f14;
            f11 = 2.0f;
            float fCos2 = (float) (d13 * Math.cos(radians));
            fSin = (float) (d13 * Math.sin(radians));
            this.f119169a.moveTo(fCos2, fSin);
            d11 = radians + ((double) ((f17 * f19) / 2.0f));
            fCos = fCos2;
            f13 = f18;
        } else {
            f11 = 2.0f;
            f12 = 0.0f;
            double d14 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d14);
            fSin = (float) (d14 * Math.sin(radians));
            this.f119169a.moveTo(fCos, fSin);
            f13 = f18;
            d11 = radians + ((double) f13);
            f14 = 0.0f;
        }
        double dCeil = Math.ceil(d12) * 2.0d;
        int i11 = 0;
        boolean z11 = false;
        double d15 = d11;
        float f21 = fSin;
        float f22 = fCos;
        double d16 = d15;
        while (true) {
            double d17 = i11;
            if (d17 >= dCeil) {
                PointF pointFH = this.f119179k.h();
                this.f119169a.offset(pointFH.x, pointFH.y);
                this.f119169a.close();
                return;
            }
            float f23 = z11 ? fFloatValue2 : fFloatValue3;
            float f24 = (f14 == f12 || d17 != dCeil - 2.0d) ? f13 : (f17 * f19) / f11;
            double d18 = (f14 == f12 || d17 != dCeil - 1.0d) ? f23 : f14;
            float fCos3 = (float) (d18 * Math.cos(d16));
            float f25 = f17;
            float fSin2 = (float) (d18 * Math.sin(d16));
            if (fFloatValue4 == f12 && fFloatValue5 == f12) {
                this.f119169a.lineTo(fCos3, fSin2);
                f16 = fCos3;
                f15 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f21, f22) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f26 = f22;
                float f27 = f21;
                f15 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f28 = z11 ? fFloatValue4 : fFloatValue5;
                float f29 = z11 ? fFloatValue5 : fFloatValue4;
                float f31 = (z11 ? fFloatValue3 : fFloatValue2) * f28 * 0.47829f;
                float f32 = fCos4 * f31;
                float f33 = f31 * fSin3;
                float f34 = (z11 ? fFloatValue2 : fFloatValue3) * f29 * 0.47829f;
                float f35 = fCos5 * f34;
                float f36 = f34 * fSin4;
                if (f19 != BitmapDescriptorFactory.HUE_RED) {
                    if (i11 == 0) {
                        f32 *= f19;
                        f33 *= f19;
                    } else if (d17 == dCeil - 1.0d) {
                        f35 *= f19;
                        f36 *= f19;
                    }
                }
                f16 = fCos3;
                this.f119169a.cubicTo(f26 - f32, f27 - f33, fCos3 + f35, f15 + f36, f16, f15);
            }
            d16 += (double) f24;
            z11 = !z11;
            i11++;
            f13 = f13;
            f22 = f16;
            f21 = f15;
            f17 = f25;
        }
    }

    private void k() {
        this.f119186r = false;
        this.f119174f.invalidateSelf();
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        k();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == cg.t.a.SIMULTANEOUSLY) {
                    this.f119185q.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        wf.a<?, Float> aVar;
        wf.a<?, Float> aVar2;
        if (t11 == d0.f113294w) {
            this.f119178j.o(cVar);
            return;
        }
        if (t11 == d0.f113295x) {
            this.f119180l.o(cVar);
            return;
        }
        if (t11 == d0.f113285n) {
            this.f119179k.o(cVar);
            return;
        }
        if (t11 == d0.f113296y && (aVar2 = this.f119181m) != null) {
            aVar2.o(cVar);
            return;
        }
        if (t11 == d0.f113297z) {
            this.f119182n.o(cVar);
            return;
        }
        if (t11 == d0.A && (aVar = this.f119183o) != null) {
            aVar.o(cVar);
        } else if (t11 == d0.B) {
            this.f119184p.o(cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119173e;
    }

    @Override // vf.m
    public Path getPath() {
        if (this.f119186r) {
            return this.f119169a;
        }
        this.f119169a.reset();
        if (this.f119176h) {
            this.f119186r = true;
            return this.f119169a;
        }
        int i11 = a.f119187a[this.f119175g.ordinal()];
        if (i11 == 1) {
            j();
        } else if (i11 == 2) {
            c();
        }
        this.f119169a.close();
        this.f119185q.b(this.f119169a);
        this.f119186r = true;
        return this.f119169a;
    }
}
