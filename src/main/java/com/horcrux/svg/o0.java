package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<o0> f45468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f45469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static m0 f45470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static m0 f45471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static m0 f45472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static m0 f45473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f45474j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    p0 f45475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    m0 f45476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    double f45477c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f45479b;

        static {
            int[] iArr = new int[g.values().length];
            f45479b = iArr;
            try {
                iArr[g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45479b[g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45479b[g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45479b[g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45479b[g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[p0.values().length];
            f45478a = iArr2;
            try {
                iArr2[p0.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45478a[p0.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45478a[p0.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private o0(p0 p0Var, m0 m0Var, double d11) {
        this.f45475a = p0Var;
        this.f45476b = m0Var;
        this.f45477c = d11;
    }

    private static double a(double d11, double d12) {
        if (Math.abs(d11 - d12) > 180.0d) {
            d11 += 360.0d;
        }
        return (d11 + d12) / 2.0d;
    }

    private static void b(s0 s0Var, m0 m0Var, m0 m0Var2, m0 m0Var3) {
        s0Var.f45501a = k(m0Var2, m0Var);
        s0Var.f45502b = k(m0Var3, m0Var2);
        if (i(s0Var.f45501a)) {
            s0Var.f45501a = s0Var.f45502b;
        } else if (i(s0Var.f45502b)) {
            s0Var.f45502b = s0Var.f45501a;
        }
    }

    private static double c(p0 p0Var) {
        double dJ = j(f(f45472h));
        double dJ2 = j(f(f45473i));
        int i11 = a.f45478a[p0Var.ordinal()];
        if (i11 == 1) {
            return f45474j ? dJ2 + 180.0d : dJ2;
        }
        if (i11 == 2) {
            return a(dJ, dJ2);
        }
        if (i11 != 3) {
            return 0.0d;
        }
        return dJ;
    }

    private static s0 d(i0 i0Var) {
        s0 s0Var = new s0();
        m0[] m0VarArr = i0Var.f45407b;
        int i11 = a.f45479b[i0Var.f45406a.ordinal()];
        if (i11 == 1) {
            s0Var.f45503c = m0VarArr[2];
            s0Var.f45501a = k(m0VarArr[0], f45470f);
            s0Var.f45502b = k(m0VarArr[2], m0VarArr[1]);
            if (i(s0Var.f45501a)) {
                b(s0Var, m0VarArr[0], m0VarArr[1], m0VarArr[2]);
                return s0Var;
            }
            if (i(s0Var.f45502b)) {
                b(s0Var, f45470f, m0VarArr[0], m0VarArr[1]);
            }
        } else {
            if (i11 == 2) {
                m0 m0Var = m0VarArr[1];
                s0Var.f45503c = m0Var;
                b(s0Var, f45470f, m0VarArr[0], m0Var);
                return s0Var;
            }
            if (i11 == 3 || i11 == 4) {
                m0 m0Var2 = m0VarArr[0];
                s0Var.f45503c = m0Var2;
                s0Var.f45501a = k(m0Var2, f45470f);
                s0Var.f45502b = k(s0Var.f45503c, f45470f);
                return s0Var;
            }
            if (i11 == 5) {
                m0 m0Var3 = f45471g;
                s0Var.f45503c = m0Var3;
                s0Var.f45501a = k(m0Var3, f45470f);
                s0Var.f45502b = k(s0Var.f45503c, f45470f);
                return s0Var;
            }
        }
        return s0Var;
    }

    private static void e() {
        p0 p0Var = p0.kEndMarker;
        f45468d.add(new o0(p0Var, f45470f, c(p0Var)));
    }

    private static double f(m0 m0Var) {
        return Math.atan2(m0Var.f45461b, m0Var.f45460a);
    }

    private static void g(i0 i0Var) {
        s0 s0VarD = d(i0Var);
        f45473i = s0VarD.f45501a;
        int i11 = f45469e;
        if (i11 > 0) {
            p0 p0Var = i11 == 1 ? p0.kStartMarker : p0.kMidMarker;
            f45468d.add(new o0(p0Var, f45470f, c(p0Var)));
        }
        f45472h = s0VarD.f45502b;
        f45470f = s0VarD.f45503c;
        g gVar = i0Var.f45406a;
        if (gVar == g.kCGPathElementMoveToPoint) {
            f45471g = i0Var.f45407b[0];
        } else if (gVar == g.kCGPathElementCloseSubpath) {
            f45471g = new m0(0.0d, 0.0d);
        }
        f45469e++;
    }

    static ArrayList<o0> h(ArrayList<i0> arrayList) {
        f45468d = new ArrayList<>();
        f45469e = 0;
        f45470f = new m0(0.0d, 0.0d);
        f45471g = new m0(0.0d, 0.0d);
        Iterator<i0> it = arrayList.iterator();
        while (it.hasNext()) {
            g(it.next());
        }
        e();
        return f45468d;
    }

    private static boolean i(m0 m0Var) {
        return m0Var.f45460a == 0.0d && m0Var.f45461b == 0.0d;
    }

    private static double j(double d11) {
        return d11 * 57.29577951308232d;
    }

    private static m0 k(m0 m0Var, m0 m0Var2) {
        return new m0(m0Var2.f45460a - m0Var.f45460a, m0Var2.f45461b - m0Var.f45461b);
    }
}
