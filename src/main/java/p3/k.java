package p3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import k3.t3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "Lp3/h;", "Lk3/t3;", "target", "c", "(Ljava/util/List;Lk3/t3;)Lk3/t3;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Ljn0/h0;", "(Lk3/t3;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Lk3/t3;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f101010a = new float[0];

    private static final void a(t3 t3Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        double d21 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d19 * d21) / 3.141592653589793d));
        double dCos = Math.cos(d17);
        double dSin = Math.sin(d17);
        double dCos2 = Math.cos(d18);
        double dSin2 = Math.sin(d18);
        double d22 = -d13;
        double d23 = d22 * dCos;
        double d24 = d14 * dSin;
        double d25 = (d23 * dSin2) - (d24 * dCos2);
        double d26 = d22 * dSin;
        double d27 = d14 * dCos;
        double d28 = (dSin2 * d26) + (dCos2 * d27);
        double d29 = d19 / ((double) iCeil);
        double d31 = d28;
        double d32 = d25;
        int i11 = 0;
        double d33 = d15;
        double d34 = d16;
        double d35 = d18;
        while (i11 < iCeil) {
            double d36 = d35 + d29;
            double dSin3 = Math.sin(d36);
            double dCos3 = Math.cos(d36);
            int i12 = i11;
            double d37 = (d11 + ((d13 * dCos) * dCos3)) - (d24 * dSin3);
            double d38 = d21;
            double d39 = d12 + (d13 * dSin * dCos3) + (d27 * dSin3);
            double d41 = (d23 * dSin3) - (d24 * dCos3);
            double d42 = (dSin3 * d26) + (dCos3 * d27);
            double d43 = d36 - d35;
            int i13 = iCeil;
            double dTan = Math.tan(d43 / ((double) 2));
            double dSin4 = (Math.sin(d43) * (Math.sqrt(d38 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            t3Var.cubicTo((float) (d33 + (d32 * dSin4)), (float) (d34 + (d31 * dSin4)), (float) (d37 - (dSin4 * d41)), (float) (d39 - (dSin4 * d42)), (float) d37, (float) d39);
            dSin = dSin;
            d29 = d29;
            d33 = d37;
            d34 = d39;
            i11 = i12 + 1;
            d35 = d36;
            d31 = d42;
            iCeil = i13;
            d32 = d41;
            dCos = dCos;
            d21 = d38;
        }
    }

    private static final void b(t3 t3Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z11, boolean z12) {
        double d18;
        double d19;
        double d21 = (d17 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d21);
        double dSin = Math.sin(d21);
        double d22 = ((d11 * dCos) + (d12 * dSin)) / d15;
        double d23 = (((-d11) * dSin) + (d12 * dCos)) / d16;
        double d24 = ((d13 * dCos) + (d14 * dSin)) / d15;
        double d25 = (((-d13) * dSin) + (d14 * dCos)) / d16;
        double d26 = d22 - d24;
        double d27 = d23 - d25;
        double d28 = 2;
        double d29 = (d22 + d24) / d28;
        double d31 = (d23 + d25) / d28;
        double d32 = (d26 * d26) + (d27 * d27);
        if (d32 == 0.0d) {
            return;
        }
        double d33 = (1.0d / d32) - 0.25d;
        if (d33 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d32) / 1.99999d);
            b(t3Var, d11, d12, d13, d14, d15 * dSqrt, d16 * dSqrt, d17, z11, z12);
            return;
        }
        double dSqrt2 = Math.sqrt(d33);
        double d34 = d26 * dSqrt2;
        double d35 = dSqrt2 * d27;
        if (z11 == z12) {
            d18 = d29 - d35;
            d19 = d31 + d34;
        } else {
            d18 = d29 + d35;
            d19 = d31 - d34;
        }
        double dAtan2 = Math.atan2(d23 - d19, d22 - d18);
        double dAtan3 = Math.atan2(d25 - d19, d24 - d18) - dAtan2;
        if (z12 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d36 = d18 * d15;
        double d37 = d19 * d16;
        a(t3Var, (d36 * dCos) - (d37 * dSin), (d36 * dSin) + (d37 * dCos), d15, d16, d11, d12, d21, dAtan2, dAtan3);
    }

    public static final t3 c(List<? extends h> list, t3 t3Var) {
        float f11;
        float f12;
        float x11;
        float x12;
        float y11;
        float dy2;
        float f13;
        float f14;
        float dx1;
        float dy1;
        float dy3;
        List<? extends h> list2 = list;
        t3 t3Var2 = t3Var;
        int iK = t3Var2.k();
        t3Var2.m();
        t3Var2.p(iK);
        h hVar = list2.isEmpty() ? h.b.f100957c : list2.get(0);
        int size = list2.size();
        float f15 = BitmapDescriptorFactory.HUE_RED;
        int i11 = 0;
        float arcStartX = 0.0f;
        float arcStartY = 0.0f;
        float x13 = 0.0f;
        float y12 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i11 < size) {
            h hVar2 = list2.get(i11);
            if (hVar2 instanceof h.b) {
                t3Var2.close();
                size = size;
                f15 = f15;
                i11 = i11;
                hVar2 = hVar2;
                arcStartX = f16;
                x13 = arcStartX;
                arcStartY = f17;
            } else {
                if (hVar2 instanceof h.RelativeMoveTo) {
                    h.RelativeMoveTo relativeMoveTo = (h.RelativeMoveTo) hVar2;
                    x13 += relativeMoveTo.getDx();
                    y12 += relativeMoveTo.getDy();
                    t3Var2.a(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f16 = x13;
                    f17 = y12;
                } else if (hVar2 instanceof h.MoveTo) {
                    h.MoveTo moveTo = (h.MoveTo) hVar2;
                    float x14 = moveTo.getX();
                    float y13 = moveTo.getY();
                    t3Var2.moveTo(moveTo.getX(), moveTo.getY());
                    x13 = x14;
                    f16 = x13;
                    y12 = y13;
                    f17 = y12;
                } else {
                    if (hVar2 instanceof h.RelativeLineTo) {
                        h.RelativeLineTo relativeLineTo = (h.RelativeLineTo) hVar2;
                        t3Var2.t(relativeLineTo.getDx(), relativeLineTo.getDy());
                        x13 += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (hVar2 instanceof h.LineTo) {
                            h.LineTo lineTo = (h.LineTo) hVar2;
                            t3Var2.lineTo(lineTo.getX(), lineTo.getY());
                            x12 = lineTo.getX();
                            y11 = lineTo.getY();
                        } else if (hVar2 instanceof h.RelativeHorizontalTo) {
                            h.RelativeHorizontalTo relativeHorizontalTo = (h.RelativeHorizontalTo) hVar2;
                            t3Var2.t(relativeHorizontalTo.getDx(), f15);
                            x13 += relativeHorizontalTo.getDx();
                        } else if (hVar2 instanceof h.HorizontalTo) {
                            h.HorizontalTo horizontalTo = (h.HorizontalTo) hVar2;
                            t3Var2.lineTo(horizontalTo.getX(), y12);
                            x13 = horizontalTo.getX();
                        } else if (hVar2 instanceof h.RelativeVerticalTo) {
                            h.RelativeVerticalTo relativeVerticalTo = (h.RelativeVerticalTo) hVar2;
                            t3Var2.t(f15, relativeVerticalTo.getDy());
                            dy2 = relativeVerticalTo.getDy();
                        } else if (hVar2 instanceof h.VerticalTo) {
                            h.VerticalTo verticalTo = (h.VerticalTo) hVar2;
                            t3Var2.lineTo(x13, verticalTo.getY());
                            y12 = verticalTo.getY();
                        } else {
                            if (hVar2 instanceof h.RelativeCurveTo) {
                                h.RelativeCurveTo relativeCurveTo = (h.RelativeCurveTo) hVar2;
                                t3Var2.b(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                dx1 = relativeCurveTo.getDx2() + x13;
                                dy1 = relativeCurveTo.getDy2() + y12;
                                x13 += relativeCurveTo.getDx3();
                                dy3 = relativeCurveTo.getDy3();
                            } else {
                                if (hVar2 instanceof h.CurveTo) {
                                    h.CurveTo curveTo = (h.CurveTo) hVar2;
                                    t3Var.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                    float x15 = curveTo.getX2();
                                    float y14 = curveTo.getY2();
                                    float x16 = curveTo.getX3();
                                    float y15 = curveTo.getY3();
                                    x13 = x16;
                                    y12 = y15;
                                    size = size;
                                    f15 = f15;
                                    i11 = i11;
                                    hVar2 = hVar2;
                                    arcStartX = x15;
                                    arcStartY = y14;
                                } else if (hVar2 instanceof h.RelativeReflectiveCurveTo) {
                                    if (hVar.getIsCurve()) {
                                        float f18 = x13 - arcStartX;
                                        f14 = y12 - arcStartY;
                                        f13 = f18;
                                    } else {
                                        f13 = f15;
                                        f14 = f13;
                                    }
                                    h.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (h.RelativeReflectiveCurveTo) hVar2;
                                    t3Var.b(f13, f14, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                    dx1 = relativeReflectiveCurveTo.getDx1() + x13;
                                    dy1 = relativeReflectiveCurveTo.getDy1() + y12;
                                    x13 += relativeReflectiveCurveTo.getDx2();
                                    dy3 = relativeReflectiveCurveTo.getDy2();
                                } else {
                                    if (hVar2 instanceof h.ReflectiveCurveTo) {
                                        if (hVar.getIsCurve()) {
                                            float f19 = 2;
                                            x13 = (x13 * f19) - arcStartX;
                                            y12 = (f19 * y12) - arcStartY;
                                        }
                                        h.ReflectiveCurveTo reflectiveCurveTo = (h.ReflectiveCurveTo) hVar2;
                                        t3Var.cubicTo(x13, y12, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                        x11 = reflectiveCurveTo.getX1();
                                        float y16 = reflectiveCurveTo.getY1();
                                        float x17 = reflectiveCurveTo.getX2();
                                        float y17 = reflectiveCurveTo.getY2();
                                        x13 = x17;
                                        y12 = y17;
                                        arcStartY = y16;
                                    } else if (hVar2 instanceof h.RelativeQuadTo) {
                                        h.RelativeQuadTo relativeQuadTo = (h.RelativeQuadTo) hVar2;
                                        t3Var.g(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                        arcStartX = relativeQuadTo.getDx1() + x13;
                                        arcStartY = relativeQuadTo.getDy1() + y12;
                                        x13 += relativeQuadTo.getDx2();
                                        dy2 = relativeQuadTo.getDy2();
                                    } else if (hVar2 instanceof h.QuadTo) {
                                        h.QuadTo quadTo = (h.QuadTo) hVar2;
                                        t3Var.q(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        arcStartX = quadTo.getX1();
                                        arcStartY = quadTo.getY1();
                                        x12 = quadTo.getX2();
                                        y11 = quadTo.getY2();
                                    } else if (hVar2 instanceof h.RelativeReflectiveQuadTo) {
                                        if (hVar.getIsQuad()) {
                                            f11 = x13 - arcStartX;
                                            f12 = y12 - arcStartY;
                                        } else {
                                            f11 = f15;
                                            f12 = f11;
                                        }
                                        h.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (h.RelativeReflectiveQuadTo) hVar2;
                                        t3Var.g(f11, f12, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        x11 = f11 + x13;
                                        float f21 = f12 + y12;
                                        x13 += relativeReflectiveQuadTo.getDx();
                                        y12 += relativeReflectiveQuadTo.getDy();
                                        arcStartY = f21;
                                    } else if (hVar2 instanceof h.ReflectiveQuadTo) {
                                        if (hVar.getIsQuad()) {
                                            float f22 = 2;
                                            x13 = (x13 * f22) - arcStartX;
                                            y12 = (f22 * y12) - arcStartY;
                                        }
                                        h.ReflectiveQuadTo reflectiveQuadTo = (h.ReflectiveQuadTo) hVar2;
                                        t3Var.q(x13, y12, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        float f23 = x13;
                                        x13 = reflectiveQuadTo.getX();
                                        arcStartX = f23;
                                        size = size;
                                        f15 = f15;
                                        i11 = i11;
                                        arcStartY = y12;
                                        hVar2 = hVar2;
                                        y12 = reflectiveQuadTo.getY();
                                    } else if (hVar2 instanceof h.RelativeArcTo) {
                                        h.RelativeArcTo relativeArcTo = (h.RelativeArcTo) hVar2;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + x13;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + y12;
                                        f15 = f15;
                                        hVar2 = hVar2;
                                        size = size;
                                        i11 = i11;
                                        b(t3Var, x13, y12, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                        arcStartX = arcStartDx;
                                        x13 = arcStartX;
                                        arcStartY = arcStartDy;
                                    } else {
                                        size = size;
                                        f15 = f15;
                                        i11 = i11;
                                        hVar2 = hVar2;
                                        if (hVar2 instanceof h.ArcTo) {
                                            h.ArcTo arcTo = (h.ArcTo) hVar2;
                                            b(t3Var, x13, y12, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                            arcStartX = arcTo.getArcStartX();
                                            x13 = arcStartX;
                                            arcStartY = arcTo.getArcStartY();
                                        }
                                    }
                                    arcStartX = x11;
                                }
                                i11++;
                                t3Var2 = t3Var;
                                hVar = hVar2;
                                size = size;
                                f15 = f15;
                                list2 = list;
                            }
                            y12 += dy3;
                            arcStartX = dx1;
                            arcStartY = dy1;
                        }
                        y12 = y11;
                        x13 = x12;
                    }
                    y12 += dy2;
                }
                hVar2 = hVar2;
                i11++;
                t3Var2 = t3Var;
                hVar = hVar2;
                size = size;
                f15 = f15;
                list2 = list;
            }
            y12 = arcStartY;
            i11++;
            t3Var2 = t3Var;
            hVar = hVar2;
            size = size;
            f15 = f15;
            list2 = list;
        }
        return t3Var;
    }
}
