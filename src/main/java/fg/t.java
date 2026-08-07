package fg;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.y0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static y0<WeakReference<Interpolator>> f65933b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Interpolator f65932a = new LinearInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static gg.c.a f65934c = gg.c.a.a("t", "s", "e", "o", IntegerTokenConverter.CONVERTER_KEY, "h", "to", "ti");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static gg.c.a f65935d = gg.c.a.a("x", "y");

    t() {
    }

    private static WeakReference<Interpolator> a(int i11) {
        WeakReference<Interpolator> weakReferenceE;
        synchronized (t.class) {
            weakReferenceE = g().e(i11);
        }
        return weakReferenceE;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator interpolatorA;
        pointF.x = hg.j.b(pointF.x, -1.0f, 1.0f);
        pointF.y = hg.j.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = hg.j.b(pointF2.x, -1.0f, 1.0f);
        float fB = hg.j.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        int i11 = hg.l.i(pointF.x, pointF.y, pointF2.x, fB);
        WeakReference<Interpolator> weakReferenceA = tf.e.e() ? null : a(i11);
        Interpolator interpolator = weakReferenceA != null ? weakReferenceA.get() : null;
        if (weakReferenceA != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorA = a6.a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e11) {
            interpolatorA = "The Path cannot loop back on itself.".equals(e11.getMessage()) ? a6.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, BitmapDescriptorFactory.HUE_RED), pointF2.y) : new LinearInterpolator();
        }
        if (!tf.e.e()) {
            try {
                h(i11, new WeakReference(interpolatorA));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorA;
    }

    static <T> ig.a<T> c(gg.c cVar, tf.i iVar, float f11, n0<T> n0Var, boolean z11, boolean z12) {
        if (z11 && z12) {
            return e(iVar, cVar, f11, n0Var);
        }
        return z11 ? d(iVar, cVar, f11, n0Var) : f(cVar, f11, n0Var);
    }

    private static <T> ig.a<T> d(tf.i iVar, gg.c cVar, float f11, n0<T> n0Var) {
        Interpolator interpolatorB;
        T t11;
        cVar.h();
        PointF pointFE = null;
        T tA = null;
        T tA2 = null;
        PointF pointFE2 = null;
        PointF pointFE3 = null;
        float fNextDouble = 0.0f;
        boolean z11 = false;
        PointF pointFE4 = null;
        while (cVar.hasNext()) {
            switch (cVar.t(f65934c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA2 = n0Var.a(cVar, f11);
                    break;
                case 2:
                    tA = n0Var.a(cVar, f11);
                    break;
                case 3:
                    pointFE = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointFE4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    z11 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE2 = s.e(cVar, f11);
                    break;
                case 7:
                    pointFE3 = s.e(cVar, f11);
                    break;
                default:
                    cVar.F();
                    break;
            }
        }
        cVar.j();
        if (z11) {
            interpolatorB = f65932a;
            t11 = tA2;
        } else {
            interpolatorB = (pointFE == null || pointFE4 == null) ? f65932a : b(pointFE, pointFE4);
            t11 = tA;
        }
        ig.a<T> aVar = new ig.a<>(iVar, tA2, t11, interpolatorB, fNextDouble, null);
        aVar.f77670o = pointFE2;
        aVar.f77671p = pointFE3;
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    private static <T> ig.a<T> e(tf.i iVar, gg.c cVar, float f11, n0<T> n0Var) {
        Interpolator interpolatorB;
        Interpolator interpolatorB2;
        Interpolator interpolatorB3;
        T t11;
        Interpolator interpolator;
        PointF pointF;
        ig.a<T> aVar;
        PointF pointF2;
        boolean z11;
        float f12;
        cVar.h();
        boolean z12 = false;
        PointF pointFE = null;
        PointF pointFE2 = null;
        PointF pointF3 = null;
        T tA = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointFE3 = null;
        PointF pointFE4 = null;
        float fNextDouble = BitmapDescriptorFactory.HUE_RED;
        T tA2 = null;
        while (cVar.hasNext()) {
            switch (cVar.t(f65934c)) {
                case 0:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 1:
                    tA = n0Var.a(cVar, f11);
                    break;
                case 2:
                    tA2 = n0Var.a(cVar, f11);
                    break;
                case 3:
                    boolean z13 = z12;
                    if (cVar.o() == gg.c.b.BEGIN_OBJECT) {
                        cVar.h();
                        float fNextDouble2 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble3 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble4 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble5 = BitmapDescriptorFactory.HUE_RED;
                        while (cVar.hasNext()) {
                            int iT = cVar.t(f65935d);
                            if (iT == 0) {
                                pointF2 = pointF5;
                                gg.c.b bVarO = cVar.o();
                                gg.c.b bVar = gg.c.b.NUMBER;
                                if (bVarO == bVar) {
                                    fNextDouble4 = (float) cVar.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    cVar.f();
                                    fNextDouble2 = (float) cVar.nextDouble();
                                    fNextDouble4 = cVar.o() == bVar ? (float) cVar.nextDouble() : fNextDouble2;
                                    cVar.e();
                                }
                            } else if (iT != 1) {
                                cVar.F();
                            } else {
                                gg.c.b bVarO2 = cVar.o();
                                gg.c.b bVar2 = gg.c.b.NUMBER;
                                if (bVarO2 == bVar2) {
                                    pointF2 = pointF5;
                                    fNextDouble5 = (float) cVar.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    pointF2 = pointF5;
                                    cVar.f();
                                    fNextDouble3 = (float) cVar.nextDouble();
                                    fNextDouble5 = cVar.o() == bVar2 ? (float) cVar.nextDouble() : fNextDouble3;
                                    cVar.e();
                                }
                            }
                            pointF5 = pointF2;
                        }
                        pointF3 = new PointF(fNextDouble2, fNextDouble3);
                        pointF4 = new PointF(fNextDouble4, fNextDouble5);
                        cVar.j();
                    } else {
                        pointFE = s.e(cVar, f11);
                    }
                    z12 = z13;
                    break;
                case 4:
                    if (cVar.o() != gg.c.b.BEGIN_OBJECT) {
                        pointFE2 = s.e(cVar, f11);
                    } else {
                        cVar.h();
                        float f13 = BitmapDescriptorFactory.HUE_RED;
                        float f14 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble6 = BitmapDescriptorFactory.HUE_RED;
                        float fNextDouble7 = BitmapDescriptorFactory.HUE_RED;
                        while (cVar.hasNext()) {
                            int iT2 = cVar.t(f65935d);
                            if (iT2 != 0) {
                                z11 = z12;
                                if (iT2 != 1) {
                                    cVar.F();
                                } else {
                                    gg.c.b bVarO3 = cVar.o();
                                    gg.c.b bVar3 = gg.c.b.NUMBER;
                                    if (bVarO3 == bVar3) {
                                        fNextDouble7 = (float) cVar.nextDouble();
                                        f14 = fNextDouble7;
                                    } else {
                                        cVar.f();
                                        PointF pointF7 = pointFE3;
                                        float fNextDouble8 = (float) cVar.nextDouble();
                                        fNextDouble7 = cVar.o() == bVar3 ? (float) cVar.nextDouble() : fNextDouble8;
                                        cVar.e();
                                        pointFE3 = pointF7;
                                        f14 = fNextDouble8;
                                    }
                                }
                            } else {
                                z11 = z12;
                                PointF pointF8 = pointFE3;
                                gg.c.b bVarO4 = cVar.o();
                                gg.c.b bVar4 = gg.c.b.NUMBER;
                                if (bVarO4 == bVar4) {
                                    pointFE3 = pointF8;
                                    fNextDouble6 = (float) cVar.nextDouble();
                                    f13 = fNextDouble6;
                                } else {
                                    pointFE3 = pointF8;
                                    cVar.f();
                                    float fNextDouble9 = (float) cVar.nextDouble();
                                    if (cVar.o() == bVar4) {
                                        f12 = fNextDouble9;
                                        fNextDouble6 = (float) cVar.nextDouble();
                                    } else {
                                        f12 = fNextDouble9;
                                        fNextDouble6 = f12;
                                    }
                                    cVar.e();
                                    f13 = f12;
                                }
                            }
                            z12 = z11;
                        }
                        PointF pointF9 = new PointF(f13, f14);
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        cVar.j();
                        pointF6 = pointF10;
                        pointF5 = pointF9;
                    }
                    break;
                case 5:
                    z12 = cVar.nextInt() == 1;
                    break;
                case 6:
                    pointFE3 = s.e(cVar, f11);
                    break;
                case 7:
                    pointFE4 = s.e(cVar, f11);
                    break;
                default:
                    cVar.F();
                    break;
            }
        }
        boolean z14 = z12;
        PointF pointF11 = pointF5;
        cVar.j();
        if (z14) {
            interpolator = f65932a;
            t11 = tA;
        } else {
            if (pointFE == null || pointFE2 == null) {
                if (pointF3 == null || pointF4 == null || pointF11 == null || pointF6 == null) {
                    interpolatorB = f65932a;
                } else {
                    interpolatorB2 = b(pointF3, pointF11);
                    interpolatorB3 = b(pointF4, pointF6);
                    t11 = tA2;
                    interpolator = null;
                }
                if (interpolatorB2 != null || interpolatorB3 == null) {
                    pointF = pointFE4;
                    aVar = new ig.a<>(iVar, tA, t11, interpolator, fNextDouble, null);
                } else {
                    pointF = pointFE4;
                    aVar = new ig.a<>(iVar, tA, t11, interpolatorB2, interpolatorB3, fNextDouble, null);
                }
                aVar.f77670o = pointFE3;
                aVar.f77671p = pointF;
                return aVar;
            }
            interpolatorB = b(pointFE, pointFE2);
            interpolator = interpolatorB;
            t11 = tA2;
        }
        interpolatorB2 = null;
        interpolatorB3 = null;
        if (interpolatorB2 != null) {
            pointF = pointFE4;
            aVar = new ig.a<>(iVar, tA, t11, interpolator, fNextDouble, null);
        } else {
            pointF = pointFE4;
            aVar = new ig.a<>(iVar, tA, t11, interpolator, fNextDouble, null);
        }
        aVar.f77670o = pointFE3;
        aVar.f77671p = pointF;
        return aVar;
    }

    private static <T> ig.a<T> f(gg.c cVar, float f11, n0<T> n0Var) {
        return new ig.a<>(n0Var.a(cVar, f11));
    }

    private static y0<WeakReference<Interpolator>> g() {
        if (f65933b == null) {
            f65933b = new y0<>();
        }
        return f65933b;
    }

    private static void h(int i11, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f65933b.i(i11, weakReference);
        }
    }
}
