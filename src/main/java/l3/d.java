package l3;

import androidx.collection.c0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001aO\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a?\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0014\u0010 \u001a\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b(\u0010'\u001a\u001f\u0010!\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010'\u001a'\u0010\u0018\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\u0018\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Ll3/c;", "source", "destination", "Ll3/n;", AnalyticsAttribute.Intent, "Ll3/h;", "j", "(Ll3/c;Ll3/c;I)Ll3/h;", "h", "Ll3/z;", "whitePoint", "Ll3/a;", "adaptation", "c", "(Ll3/c;Ll3/z;Ll3/a;)Ll3/c;", "", "x", "a", "b", DateTokenConverter.CONVERTER_KEY, "g", "o", "(DDDDDD)D", "q", "e", "f", "p", "(DDDDDDDD)D", "r", "", "(Ll3/z;Ll3/z;)Z", "", "([F[F)Z", "m", "k", "([F)[F", "lhs", "rhs", "l", "([F[F)[F", "n", "matrix", "srcWhitePoint", "dstWhitePoint", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final double a(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(o(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    public static final double b(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(q(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    public static final c c(c cVar, WhitePoint whitePoint, a aVar) {
        if (b.e(cVar.getModel(), b.INSTANCE.b())) {
            p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) cVar;
            if (!f(xVar.getWhitePoint(), whitePoint)) {
                return new x(xVar, l(e(aVar.getTransform(), xVar.getWhitePoint().c(), whitePoint.c()), xVar.getTransform()), whitePoint);
            }
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, WhitePoint whitePoint, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = a.INSTANCE.a();
        }
        return c(cVar, whitePoint, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrN = n(fArr, fArr2);
        float[] fArrN2 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{fArrN2[0] / fArrN[0], fArrN2[1] / fArrN[1], fArrN2[2] / fArrN[2]}, fArr));
    }

    public static final boolean f(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (Float.compare(fArr[i11], fArr2[i11]) != 0 && Math.abs(fArr[i11] - fArr2[i11]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final h h(c cVar, c cVar2, int i11) {
        int iD = cVar.getId();
        int iD2 = cVar2.getId();
        if ((iD | iD2) < 0) {
            return j(cVar, cVar2, i11);
        }
        c0<h> c0VarA = i.a();
        int i12 = iD | (iD2 << 6) | (i11 << 12);
        h hVarC = c0VarA.c(i12);
        if (hVarC == null) {
            hVarC = j(cVar, cVar2, i11);
            c0VarA.t(i12, hVarC);
        }
        return hVarC;
    }

    public static /* synthetic */ h i(c cVar, c cVar2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar2 = g.f89510a.w();
        }
        if ((i12 & 2) != 0) {
            i11 = n.INSTANCE.b();
        }
        return h(cVar, cVar2, i11);
    }

    private static final h j(c cVar, c cVar2, int i11) {
        if (cVar == cVar2) {
            return h.INSTANCE.c(cVar);
        }
        long jG = cVar.getModel();
        b.Companion companion = b.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!b.e(jG, companion.b()) || !b.e(cVar2.getModel(), companion.b())) {
            return new h(cVar, cVar2, i11, defaultConstructorMarker);
        }
        p013kotlin.jvm.internal.s.i(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        p013kotlin.jvm.internal.s.i(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new h.b((x) cVar, (x) cVar2, i11, defaultConstructorMarker);
    }

    public static final float[] k(float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[3];
        float f13 = fArr[6];
        float f14 = fArr[1];
        float f15 = fArr[4];
        float f16 = fArr[7];
        float f17 = fArr[2];
        float f18 = fArr[5];
        float f19 = fArr[8];
        float f21 = (f15 * f19) - (f16 * f18);
        float f22 = (f16 * f17) - (f14 * f19);
        float f23 = (f14 * f18) - (f15 * f17);
        float f24 = (f11 * f21) + (f12 * f22) + (f13 * f23);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f21 / f24;
        fArr2[1] = f22 / f24;
        fArr2[2] = f23 / f24;
        fArr2[3] = ((f13 * f18) - (f12 * f19)) / f24;
        fArr2[4] = ((f19 * f11) - (f13 * f17)) / f24;
        fArr2[5] = ((f17 * f12) - (f18 * f11)) / f24;
        fArr2[6] = ((f12 * f16) - (f13 * f15)) / f24;
        fArr2[7] = ((f13 * f14) - (f16 * f11)) / f24;
        fArr2[8] = ((f11 * f15) - (f12 * f14)) / f24;
        return fArr2;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = fArr2[0];
        float f13 = fArr[3];
        float f14 = fArr2[1];
        float f15 = fArr[6];
        float f16 = fArr2[2];
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = fArr[1];
        float f19 = fArr[4];
        float f21 = fArr[7];
        float f22 = (f18 * f12) + (f19 * f14) + (f21 * f16);
        float f23 = fArr[2];
        float f24 = fArr[5];
        float f25 = fArr[8];
        float f26 = (f12 * f23) + (f14 * f24) + (f16 * f25);
        float f27 = fArr2[3];
        float f28 = fArr2[4];
        float f29 = fArr2[5];
        float f31 = (f11 * f27) + (f13 * f28) + (f15 * f29);
        float f32 = (f18 * f27) + (f19 * f28) + (f21 * f29);
        float f33 = (f27 * f23) + (f28 * f24) + (f29 * f25);
        float f34 = fArr2[6];
        float f35 = fArr2[7];
        float f36 = (f11 * f34) + (f13 * f35);
        float f37 = fArr2[8];
        return new float[]{f17, f22, f26, f31, f32, f33, f36 + (f15 * f37), (f18 * f34) + (f19 * f35) + (f21 * f37), (f23 * f34) + (f24 * f35) + (f25 * f37)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = fArr2[0] * f11;
        float f13 = fArr[1];
        float f14 = fArr2[1] * f13;
        float f15 = fArr[2];
        return new float[]{f12, f14, fArr2[2] * f15, fArr2[3] * f11, fArr2[4] * f13, fArr2[5] * f15, f11 * fArr2[6], f13 * fArr2[7], f15 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f11 = fArr2[0];
        float f12 = fArr2[1];
        float f13 = fArr2[2];
        fArr2[0] = (fArr[0] * f11) + (fArr[3] * f12) + (fArr[6] * f13);
        fArr2[1] = (fArr[1] * f11) + (fArr[4] * f12) + (fArr[7] * f13);
        fArr2[2] = (fArr[2] * f11) + (fArr[5] * f12) + (fArr[8] * f13);
        return fArr2;
    }

    public static final double o(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 * d14 ? (Math.pow(d11, 1.0d / d16) - d13) / d12 : d11 / d14;
    }

    public static final double p(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 * d14 ? (Math.pow(d11 - d16, 1.0d / d18) - d13) / d12 : (d11 - d17) / d14;
    }

    public static final double q(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d16) : d14 * d11;
    }

    public static final double r(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d18) + d16 : (d14 * d11) + d17;
    }
}
