package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static float f45417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f45418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f45419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f45420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Path f45421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static ArrayList<i0> f45422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static float f45423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static float f45424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static float f45425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static float f45426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static float f45427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f45428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f45429m;

    private static void A(float f11, float f12, float f13, float f14) {
        float f15 = (f45423g * 2.0f) - f45425i;
        float f16 = (f45424h * 2.0f) - f45426j;
        f45425i = f11;
        f45426j = f12;
        e(f15, f16, f11, f12, f13, f14);
    }

    private static void B(float f11, float f12) {
        C(f11 + f45423g, f12 + f45424h);
    }

    private static void C(float f11, float f12) {
        u((f45423g * 2.0f) - f45425i, (f45424h * 2.0f) - f45426j, f11, f12);
    }

    private static void a(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        b(f11, f12, f13, z11, z12, f14 + f45423g, f15 + f45424h);
    }

    private static void b(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        float f21 = f45423g;
        float f22 = f45424h;
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            f16 = f11 == BitmapDescriptorFactory.HUE_RED ? f15 - f22 : f11;
        } else {
            f16 = f12;
        }
        float fAbs = Math.abs(f16);
        float fAbs2 = Math.abs(f11 == BitmapDescriptorFactory.HUE_RED ? f14 - f21 : f11);
        if (fAbs2 == BitmapDescriptorFactory.HUE_RED || fAbs == BitmapDescriptorFactory.HUE_RED || (f14 == f21 && f15 == f22)) {
            l(f14, f15);
            return;
        }
        float radians = (float) Math.toRadians(f13);
        double d11 = radians;
        float fCos = (float) Math.cos(d11);
        float fSin = (float) Math.sin(d11);
        float f23 = f14 - f21;
        float f24 = f15 - f22;
        float f25 = ((fCos * f23) / 2.0f) + ((fSin * f24) / 2.0f);
        float f26 = -fSin;
        float f27 = ((f26 * f23) / 2.0f) + ((fCos * f24) / 2.0f);
        float f28 = fAbs2 * fAbs2;
        float f29 = f28 * fAbs * fAbs;
        float f31 = fAbs * fAbs * f25 * f25;
        float f32 = f28 * f27 * f27;
        float f33 = (f29 - f32) - f31;
        if (f33 < BitmapDescriptorFactory.HUE_RED) {
            float fSqrt = (float) Math.sqrt(1.0f - (f33 / f29));
            fAbs2 *= fSqrt;
            f19 = fAbs * fSqrt;
            f18 = f23 / 2.0f;
            f17 = f24 / 2.0f;
        } else {
            float fSqrt2 = (float) Math.sqrt(f33 / (f32 + f31));
            if (z11 == z12) {
                fSqrt2 = -fSqrt2;
            }
            float f34 = (((-fSqrt2) * f27) * fAbs2) / fAbs;
            float f35 = ((fSqrt2 * f25) * fAbs) / fAbs2;
            f17 = (f24 / 2.0f) + (f34 * fSin) + (f35 * fCos);
            f18 = ((fCos * f34) - (fSin * f35)) + (f23 / 2.0f);
            f19 = fAbs;
        }
        float f36 = fCos / fAbs2;
        float f37 = fSin / fAbs2;
        float f38 = f26 / f19;
        float f39 = fCos / f19;
        float f41 = -f18;
        float f42 = -f17;
        float f43 = f18;
        float fAtan2 = (float) Math.atan2((f38 * f41) + (f39 * f42), (f41 * f36) + (f37 * f42));
        float f44 = f23 - f43;
        float f45 = f24 - f17;
        float fAtan3 = (float) Math.atan2((f38 * f44) + (f39 * f45), (f36 * f44) + (f37 * f45));
        float f46 = f43 + f21;
        float f47 = f17 + f22;
        float f48 = f23 + f21;
        float f49 = f24 + f22;
        w();
        f45425i = f48;
        f45423g = f48;
        f45426j = f49;
        f45424h = f49;
        if (fAbs2 != f19 || radians != 0) {
            c(f46, f47, fAbs2, f19, fAtan2, fAtan3, z12, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(fAtan2);
        float fAbs3 = Math.abs((degrees - ((float) Math.toDegrees(fAtan3))) % 360.0f);
        if (!z11 ? fAbs3 > 180.0f : fAbs3 < 180.0f) {
            fAbs3 = 360.0f - fAbs3;
        }
        if (!z12) {
            fAbs3 = -fAbs3;
        }
        float f51 = f45417a;
        f45421e.arcTo(new RectF((f46 - fAbs2) * f51, (f47 - fAbs2) * f51, (f46 + fAbs2) * f51, (f47 + fAbs2) * f51), degrees, fAbs3);
        f45422f.add(new i0(g.kCGPathElementAddCurveToPoint, new m0[]{new m0(f48, f49)}));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067 A[LOOP:0: B:12:0x0065->B:13:0x0067, LOOP_END] */
    private static void c(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, float f17) {
        double d11;
        int iCeil;
        float f18;
        float fTan;
        float fCos;
        float fSin;
        int i11;
        float f19 = f15;
        double d12 = f17;
        float fCos2 = (float) Math.cos(d12);
        float fSin2 = (float) Math.sin(d12);
        float f21 = fCos2 * f13;
        float f22 = (-fSin2) * f14;
        float f23 = fSin2 * f13;
        float f24 = fCos2 * f14;
        float f25 = f16 - f19;
        if (f25 >= BitmapDescriptorFactory.HUE_RED || !z11) {
            if (f25 > BitmapDescriptorFactory.HUE_RED && !z11) {
                d11 = ((double) f25) - 6.283185307179586d;
            }
            iCeil = (int) Math.ceil(Math.abs(v(((double) f25) / 1.5707963267948966d)));
            f18 = f25 / iCeil;
            fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
            double d13 = f19;
            fCos = (float) Math.cos(d13);
            fSin = (float) Math.sin(d13);
            i11 = 0;
            while (i11 < iCeil) {
                float f26 = fCos - (fTan * fSin);
                float f27 = fSin + (fCos * fTan);
                float f28 = f19 + f18;
                double d14 = f28;
                float fCos3 = (float) Math.cos(d14);
                float fSin3 = (float) Math.sin(d14);
                float f29 = (fTan * fSin3) + fCos3;
                float f31 = fSin3 - (fTan * fCos3);
                float f32 = f11 + (f21 * f26) + (f22 * f27);
                float f33 = f12 + (f26 * f23) + (f27 * f24);
                float f34 = f11 + (f21 * f29) + (f22 * f31);
                float f35 = f12 + (f29 * f23) + (f31 * f24);
                float f36 = f11 + (f21 * fCos3) + (f22 * fSin3);
                float f37 = f12 + (f23 * fCos3) + (f24 * fSin3);
                Path path = f45421e;
                float f38 = f45417a;
                path.cubicTo(f32 * f38, f33 * f38, f34 * f38, f35 * f38, f36 * f38, f38 * f37);
                float f39 = f18;
                f45422f.add(new i0(g.kCGPathElementAddCurveToPoint, new m0[]{new m0(f32, f33), new m0(f34, f35), new m0(f36, f37)}));
                i11++;
                f19 = f28;
                f24 = f24;
                f18 = f39;
                f23 = f23;
                fSin = fSin3;
                f21 = f21;
                f22 = f22;
                iCeil = iCeil;
                fCos = fCos3;
            }
        }
        d11 = ((double) f25) + 6.283185307179586d;
        f25 = (float) d11;
        iCeil = (int) Math.ceil(Math.abs(v(((double) f25) / 1.5707963267948966d)));
        f18 = f25 / iCeil;
        fTan = (float) (Math.tan(f18 / 4.0f) * 1.3333333333333333d);
        double d15 = f19;
        fCos = (float) Math.cos(d15);
        fSin = (float) Math.sin(d15);
        i11 = 0;
        while (i11 < iCeil) {
            float f210 = fCos - (fTan * fSin);
            float f211 = fSin + (fCos * fTan);
            float f212 = f19 + f18;
            double d16 = f212;
            float fCos4 = (float) Math.cos(d16);
            float fSin4 = (float) Math.sin(d16);
            float f213 = (fTan * fSin4) + fCos4;
            float f310 = fSin4 - (fTan * fCos4);
            float f311 = f11 + (f21 * f210) + (f22 * f211);
            float f312 = f12 + (f210 * f23) + (f211 * f24);
            float f313 = f11 + (f21 * f213) + (f22 * f310);
            float f314 = f12 + (f213 * f23) + (f310 * f24);
            float f315 = f11 + (f21 * fCos4) + (f22 * fSin4);
            float f316 = f12 + (f23 * fCos4) + (f24 * fSin4);
            Path path2 = f45421e;
            float f317 = f45417a;
            path2.cubicTo(f311 * f317, f312 * f317, f313 * f317, f314 * f317, f315 * f317, f317 * f316);
            float f318 = f18;
            f45422f.add(new i0(g.kCGPathElementAddCurveToPoint, new m0[]{new m0(f311, f312), new m0(f313, f314), new m0(f315, f316)}));
            i11++;
            f19 = f212;
            f24 = f24;
            f18 = f318;
            f23 = f23;
            fSin = fSin4;
            f21 = f21;
            f22 = f22;
            iCeil = iCeil;
            fCos = fCos4;
        }
    }

    private static void d() {
        if (f45429m) {
            f45423g = f45427k;
            f45424h = f45428l;
            f45429m = false;
            f45421e.close();
            f45422f.add(new i0(g.kCGPathElementCloseSubpath, new m0[]{new m0(f45423g, f45424h)}));
        }
    }

    private static void e(float f11, float f12, float f13, float f14, float f15, float f16) {
        w();
        f45423g = f15;
        f45424h = f16;
        Path path = f45421e;
        float f17 = f45417a;
        path.cubicTo(f11 * f17, f12 * f17, f13 * f17, f14 * f17, f15 * f17, f17 * f16);
        f45422f.add(new i0(g.kCGPathElementAddCurveToPoint, new m0[]{new m0(f11, f12), new m0(f13, f14), new m0(f15, f16)}));
    }

    private static void f(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f45423g;
        float f18 = f45424h;
        g(f11 + f17, f12 + f18, f13 + f17, f14 + f18, f15 + f17, f16 + f18);
    }

    private static void g(float f11, float f12, float f13, float f14, float f15, float f16) {
        f45425i = f13;
        f45426j = f14;
        e(f11, f12, f13, f14, f15, f16);
    }

    private static boolean h(char c11) {
        return Character.isUpperCase(c11);
    }

    private static boolean i(char c11) {
        switch (c11) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    private static boolean j(char c11) {
        return (c11 >= '0' && c11 <= '9') || c11 == '.' || c11 == '-' || c11 == '+';
    }

    private static void k(float f11, float f12) {
        l(f11 + f45423g, f12 + f45424h);
    }

    private static void l(float f11, float f12) {
        w();
        f45423g = f11;
        f45425i = f11;
        f45424h = f12;
        f45426j = f12;
        Path path = f45421e;
        float f13 = f45417a;
        path.lineTo(f11 * f13, f13 * f12);
        f45422f.add(new i0(g.kCGPathElementAddLineToPoint, new m0[]{new m0(f11, f12)}));
    }

    private static void m(float f11, float f12) {
        n(f11 + f45423g, f12 + f45424h);
    }

    private static void n(float f11, float f12) {
        f45423g = f11;
        f45425i = f11;
        f45427k = f11;
        f45424h = f12;
        f45426j = f12;
        f45428l = f12;
        Path path = f45421e;
        float f13 = f45417a;
        path.moveTo(f11 * f13, f13 * f12);
        f45422f.add(new i0(g.kCGPathElementMoveToPoint, new m0[]{new m0(f11, f12)}));
    }

    static Path o(String str) {
        f45422f = new ArrayList<>();
        Path path = new Path();
        f45421e = path;
        if (str == null) {
            return path;
        }
        f45419c = str.length();
        f45420d = str;
        f45418b = 0;
        f45423g = BitmapDescriptorFactory.HUE_RED;
        f45424h = BitmapDescriptorFactory.HUE_RED;
        f45425i = BitmapDescriptorFactory.HUE_RED;
        f45426j = BitmapDescriptorFactory.HUE_RED;
        f45427k = BitmapDescriptorFactory.HUE_RED;
        f45428l = BitmapDescriptorFactory.HUE_RED;
        f45429m = false;
        char c11 = ' ';
        while (f45418b < f45419c) {
            y();
            int i11 = f45418b;
            if (i11 >= f45419c) {
                return f45421e;
            }
            boolean z11 = true;
            boolean z12 = c11 != ' ';
            char cCharAt = f45420d.charAt(i11);
            if (!z12 && cCharAt != 'M' && cCharAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f45418b), f45420d));
            }
            if (i(cCharAt)) {
                f45418b++;
                z11 = false;
                c11 = cCharAt;
            } else {
                if (!j(cCharAt) || !z12) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f45418b), f45420d));
                }
                if (c11 == 'Z' || c11 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f45420d));
                }
                if (c11 == 'M' || c11 == 'm') {
                    c11 = h(c11) ? 'L' : 'l';
                } else {
                    z11 = false;
                }
            }
            boolean zH = h(c11);
            switch (c11) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f45424h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f45423g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), BitmapDescriptorFactory.HUE_RED);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(BitmapDescriptorFactory.HUE_RED, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c11), f45420d));
            }
            if (z11) {
                c11 = zH ? 'M' : 'm';
            }
        }
        return f45421e;
    }

    private static boolean p() {
        y();
        char cCharAt = f45420d.charAt(f45418b);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f45418b), f45420d));
        }
        int i11 = f45418b + 1;
        f45418b = i11;
        if (i11 < f45419c && f45420d.charAt(i11) == ',') {
            f45418b++;
        }
        y();
        return cCharAt == '1';
    }

    private static float q() {
        if (f45418b == f45419c) {
            throw new Error(String.format("Unexpected end (s=%s)", f45420d));
        }
        float fS = s();
        y();
        r();
        return fS;
    }

    private static void r() {
        int i11 = f45418b;
        if (i11 >= f45419c || f45420d.charAt(i11) != ',') {
            return;
        }
        f45418b++;
    }

    private static float s() {
        char cCharAt;
        y();
        int i11 = f45418b;
        if (i11 == f45419c) {
            throw new Error(String.format("Unexpected end (s=%s)", f45420d));
        }
        char cCharAt2 = f45420d.charAt(i11);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i12 = f45418b + 1;
            f45418b = i12;
            cCharAt2 = f45420d.charAt(i12);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            x();
            int i13 = f45418b;
            if (i13 < f45419c) {
                cCharAt2 = f45420d.charAt(i13);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f45418b), f45420d));
        }
        if (cCharAt2 == '.') {
            f45418b++;
            x();
            int i14 = f45418b;
            if (i14 < f45419c) {
                cCharAt2 = f45420d.charAt(i14);
            }
        }
        if (cCharAt2 == 'e' || cCharAt2 == 'E') {
            int i15 = f45418b;
            if (i15 + 1 < f45419c && (cCharAt = f45420d.charAt(i15 + 1)) != 'm' && cCharAt != 'x') {
                int i16 = f45418b + 1;
                f45418b = i16;
                char cCharAt3 = f45420d.charAt(i16);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    f45418b++;
                    x();
                } else {
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f45418b), f45420d));
                    }
                    x();
                }
            }
        }
        String strSubstring = f45420d.substring(i11, f45418b);
        float f11 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i11), Integer.valueOf(f45418b), f45420d));
        }
        return f11;
    }

    private static void t(float f11, float f12, float f13, float f14) {
        float f15 = f45423g;
        float f16 = f45424h;
        u(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }

    private static void u(float f11, float f12, float f13, float f14) {
        f45425i = f11;
        f45426j = f12;
        float f15 = f11 * 2.0f;
        float f16 = f12 * 2.0f;
        e((f45423g + f15) / 3.0f, (f45424h + f16) / 3.0f, (f13 + f15) / 3.0f, (f14 + f16) / 3.0f, f13, f14);
    }

    private static double v(double d11) {
        double dPow = Math.pow(10.0d, 4.0d);
        return Math.round(d11 * dPow) / dPow;
    }

    private static void w() {
        if (f45429m) {
            return;
        }
        f45427k = f45423g;
        f45428l = f45424h;
        f45429m = true;
    }

    private static void x() {
        while (true) {
            int i11 = f45418b;
            if (i11 >= f45419c || !Character.isDigit(f45420d.charAt(i11))) {
                return;
            } else {
                f45418b++;
            }
        }
    }

    private static void y() {
        while (true) {
            int i11 = f45418b;
            if (i11 >= f45419c || !Character.isWhitespace(f45420d.charAt(i11))) {
                return;
            } else {
                f45418b++;
            }
        }
    }

    private static void z(float f11, float f12, float f13, float f14) {
        float f15 = f45423g;
        float f16 = f45424h;
        A(f11 + f15, f12 + f16, f13 + f15, f14 + f16);
    }
}
