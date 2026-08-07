package hk0;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes8.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static /* synthetic */ Class f72984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static /* synthetic */ Class f72985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static /* synthetic */ Class f72986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static /* synthetic */ Class f72987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static /* synthetic */ Class f72988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static /* synthetic */ Class f72989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static /* synthetic */ Class f72990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static /* synthetic */ Class f72991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static /* synthetic */ Class f72992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static /* synthetic */ Class f72993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static /* synthetic */ Class f72994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static /* synthetic */ Class f72995l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static /* synthetic */ Class f72996m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static /* synthetic */ Class f72997n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static /* synthetic */ Class f72998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static /* synthetic */ Class f72999p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static /* synthetic */ Class f73000q;

    static /* synthetic */ Class a(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    static int b(Class cls) throws Throwable {
        Class clsA = f72984a;
        if (clsA == null) {
            clsA = a("java.lang.Object");
            f72984a = clsA;
        }
        if (cls == clsA) {
            return 522240;
        }
        Class clsA2 = f72985b;
        if (clsA2 == null) {
            clsA2 = a("java.lang.String");
            f72985b = clsA2;
        }
        int i11 = PKIFailureInfo.certRevoked;
        if (cls == clsA2) {
            return PKIFailureInfo.certRevoked;
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return 2064;
            }
            if (cls == Long.TYPE) {
                return 2080;
            }
            if (cls == Double.TYPE) {
                return 2176;
            }
            if (cls == Float.TYPE) {
                return 2112;
            }
            if (cls == Byte.TYPE) {
                return 2052;
            }
            if (cls == Short.TYPE) {
                return 2056;
            }
            if (cls == Character.TYPE) {
                return PKIFailureInfo.signerNotTrusted;
            }
            return cls == Boolean.TYPE ? 16384 : 0;
        }
        Class clsA3 = f72986c;
        if (clsA3 == null) {
            clsA3 = a("java.lang.Number");
            f72986c = clsA3;
        }
        if (!clsA3.isAssignableFrom(cls)) {
            if (cls.isArray()) {
                return 262144;
            }
            Class<?> clsA4 = f72985b;
            if (clsA4 == null) {
                clsA4 = a("java.lang.String");
                f72985b = clsA4;
            }
            if (!cls.isAssignableFrom(clsA4)) {
                i11 = 0;
            }
            Class<?> clsA5 = f72995l;
            if (clsA5 == null) {
                clsA5 = a("java.util.Date");
                f72995l = clsA5;
            }
            if (cls.isAssignableFrom(clsA5)) {
                i11 |= 4096;
            }
            Class<?> clsA6 = f72996m;
            if (clsA6 == null) {
                clsA6 = a("java.lang.Boolean");
                f72996m = clsA6;
            }
            if (cls.isAssignableFrom(clsA6)) {
                i11 |= 16384;
            }
            Class<?> clsA7 = f72997n;
            if (clsA7 == null) {
                clsA7 = a("java.util.Map");
                f72997n = clsA7;
            }
            if (cls.isAssignableFrom(clsA7)) {
                i11 |= 32768;
            }
            Class<?> clsA8 = f72998o;
            if (clsA8 == null) {
                clsA8 = a("java.util.List");
                f72998o = clsA8;
            }
            if (cls.isAssignableFrom(clsA8)) {
                i11 |= 65536;
            }
            Class<?> clsA9 = f72999p;
            if (clsA9 == null) {
                clsA9 = a("java.util.Set");
                f72999p = clsA9;
            }
            if (cls.isAssignableFrom(clsA9)) {
                i11 |= 131072;
            }
            Class clsA10 = f73000q;
            if (clsA10 == null) {
                clsA10 = a("java.lang.Character");
                f73000q = clsA10;
            }
            return cls == clsA10 ? i11 | PKIFailureInfo.signerNotTrusted : i11;
        }
        Class clsA11 = f72987d;
        if (clsA11 == null) {
            clsA11 = a("java.lang.Integer");
            f72987d = clsA11;
        }
        if (cls == clsA11) {
            return 2064;
        }
        Class clsA12 = f72988e;
        if (clsA12 == null) {
            clsA12 = a("java.lang.Long");
            f72988e = clsA12;
        }
        if (cls == clsA12) {
            return 2080;
        }
        Class clsA13 = f72989f;
        if (clsA13 == null) {
            clsA13 = a("java.lang.Double");
            f72989f = clsA13;
        }
        if (cls == clsA13) {
            return 2176;
        }
        Class clsA14 = f72990g;
        if (clsA14 == null) {
            clsA14 = a("java.lang.Float");
            f72990g = clsA14;
        }
        if (cls == clsA14) {
            return 2112;
        }
        Class clsA15 = f72991h;
        if (clsA15 == null) {
            clsA15 = a("java.lang.Byte");
            f72991h = clsA15;
        }
        if (cls == clsA15) {
            return 2052;
        }
        Class clsA16 = f72992i;
        if (clsA16 == null) {
            clsA16 = a("java.lang.Short");
            f72992i = clsA16;
        }
        if (cls == clsA16) {
            return 2056;
        }
        Class clsA17 = f72993j;
        if (clsA17 == null) {
            clsA17 = a("java.math.BigDecimal");
            f72993j = clsA17;
        }
        if (clsA17.isAssignableFrom(cls)) {
            return 2560;
        }
        Class clsA18 = f72994k;
        if (clsA18 == null) {
            clsA18 = a("java.math.BigInteger");
            f72994k = clsA18;
        }
        return clsA18.isAssignableFrom(cls) ? 2304 : 3072;
    }
}
