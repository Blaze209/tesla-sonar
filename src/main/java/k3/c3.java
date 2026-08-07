package k3;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import l3.TransferParameters;
import l3.WhitePoint;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk3/c3;", "", "<init>", "()V", "Ll3/c;", "Landroid/graphics/ColorSpace;", "e", "(Ll3/c;)Landroid/graphics/ColorSpace;", "h", "(Landroid/graphics/ColorSpace;)Ll3/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c3 f84750a = new c3();

    private c3() {
    }

    public static final ColorSpace e(l3.c cVar) {
        ColorSpace.Rgb.TransferParameters transferParametersA;
        l3.g gVar = l3.g.f89510a;
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.w())) {
            ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            w2.a(colorSpace);
            return colorSpace;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.e())) {
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.ACES);
            w2.a(colorSpace2);
            return colorSpace2;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.f())) {
            ColorSpace colorSpace3 = ColorSpace.get(ColorSpace.Named.ACESCG);
            w2.a(colorSpace3);
            return colorSpace3;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.g())) {
            ColorSpace colorSpace4 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            w2.a(colorSpace4);
            return colorSpace4;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.h())) {
            ColorSpace colorSpace5 = ColorSpace.get(ColorSpace.Named.BT2020);
            w2.a(colorSpace5);
            return colorSpace5;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.i())) {
            ColorSpace colorSpace6 = ColorSpace.get(ColorSpace.Named.BT709);
            w2.a(colorSpace6);
            return colorSpace6;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.j())) {
            ColorSpace colorSpace7 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
            w2.a(colorSpace7);
            return colorSpace7;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.k())) {
            ColorSpace colorSpace8 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            w2.a(colorSpace8);
            return colorSpace8;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.m())) {
            ColorSpace colorSpace9 = ColorSpace.get(ColorSpace.Named.DCI_P3);
            w2.a(colorSpace9);
            return colorSpace9;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.n())) {
            ColorSpace colorSpace10 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            w2.a(colorSpace10);
            return colorSpace10;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.o())) {
            ColorSpace colorSpace11 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            w2.a(colorSpace11);
            return colorSpace11;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.p())) {
            ColorSpace colorSpace12 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            w2.a(colorSpace12);
            return colorSpace12;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.q())) {
            ColorSpace colorSpace13 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            w2.a(colorSpace13);
            return colorSpace13;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.r())) {
            ColorSpace colorSpace14 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
            w2.a(colorSpace14);
            return colorSpace14;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.u())) {
            ColorSpace colorSpace15 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            w2.a(colorSpace15);
            return colorSpace15;
        }
        if (p013kotlin.jvm.internal.s.f(cVar, gVar.v())) {
            ColorSpace colorSpace16 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
            w2.a(colorSpace16);
            return colorSpace16;
        }
        if (!(cVar instanceof l3.x)) {
            ColorSpace colorSpace17 = ColorSpace.get(ColorSpace.Named.SRGB);
            w2.a(colorSpace17);
            return colorSpace17;
        }
        l3.x xVar = (l3.x) cVar;
        float[] fArrC = xVar.getWhitePoint().c();
        TransferParameters transferParameters = xVar.getTransferParameters();
        if (transferParameters != null) {
            r2.a();
            transferParametersA = t1.a(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        } else {
            transferParametersA = null;
        }
        if (transferParametersA != null) {
            s2.a();
            return w2.a(e2.a(cVar.getName(), xVar.getPrimaries(), fArrC, transferParametersA));
        }
        s2.a();
        String name = cVar.getName();
        float[] primaries = xVar.getPrimaries();
        final wn0.l<Double, Double> lVarL = xVar.L();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: k3.y2
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d11) {
                return c3.f(lVarL, d11);
            }
        };
        final wn0.l<Double, Double> lVarH = xVar.H();
        return w2.a(p2.a(name, primaries, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: k3.z2
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d11) {
                return c3.g(lVarH, d11);
            }
        }, cVar.f(0), cVar.e(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(wn0.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(wn0.l lVar, double d11) {
        return ((Number) lVar.invoke(Double.valueOf(d11))).doubleValue();
    }

    public static final l3.c h(final ColorSpace colorSpace) {
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return l3.g.f89510a.w();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return l3.g.f89510a.e();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return l3.g.f89510a.f();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return l3.g.f89510a.g();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return l3.g.f89510a.h();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return l3.g.f89510a.i();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return l3.g.f89510a.j();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return l3.g.f89510a.k();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return l3.g.f89510a.m();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return l3.g.f89510a.n();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return l3.g.f89510a.o();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return l3.g.f89510a.p();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return l3.g.f89510a.q();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return l3.g.f89510a.r();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return l3.g.f89510a.u();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return l3.g.f89510a.v();
        }
        if (!i2.a(colorSpace)) {
            return l3.g.f89510a.w();
        }
        ColorSpace.Rgb rgbA = t2.a(colorSpace);
        ColorSpace.Rgb.TransferParameters transferParameters = rgbA.getTransferParameters();
        return new l3.x(rgbA.getName(), rgbA.getPrimaries(), rgbA.getWhitePoint().length == 3 ? new WhitePoint(rgbA.getWhitePoint()[0], rgbA.getWhitePoint()[1], rgbA.getWhitePoint()[2]) : new WhitePoint(rgbA.getWhitePoint()[0], rgbA.getWhitePoint()[1]), rgbA.getTransform(), new l3.j() { // from class: k3.a3
            @Override // l3.j
            public final double a(double d11) {
                return c3.i(colorSpace, d11);
            }
        }, new l3.j() { // from class: k3.b3
            @Override // l3.j
            public final double a(double d11) {
                return c3.j(colorSpace, d11);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgbA.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d11) {
        return t2.a(colorSpace).getOetf().applyAsDouble(d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d11) {
        return t2.a(colorSpace).getEotf().applyAsDouble(d11);
    }
}
