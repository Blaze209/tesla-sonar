package net.time4j;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.ChronoException;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("iso8601")
public final class g0 extends net.time4j.engine.m<v, g0> implements net.time4j.base.a, net.time4j.engine.c0<net.time4j.f>, net.time4j.format.h {
    private static final net.time4j.engine.k<g0> A;
    private static final net.time4j.engine.f0<v, g0> B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g0 f94477d = new g0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final g0 f94478e = new g0(999999999, 12, 31);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Integer f94479f = -999999999;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Integer f94480g = 999999999;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Integer f94481h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Integer f94482i = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Integer f94483j = 365;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Integer f94484k = 366;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f94485l = {31, 59, 90, 120, 151, 181, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, 334, 365};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f94486m = {31, 60, 91, 121, 152, 182, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 335, 366};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final net.time4j.engine.p<g0> f94487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final net.time4j.e f94488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final net.time4j.c<Integer, g0> f94489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final net.time4j.c<Integer, g0> f94490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d0<m0> f94491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d0<c0> f94492s;
    private static final long serialVersionUID = -6698431452072325688L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k0<Integer, g0> f94493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k0<Integer, g0> f94494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d0<x0> f94495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k0<Integer, g0> f94496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k0<Integer, g0> f94497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e0 f94498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Map<String, Object> f94499z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f94500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient byte f94501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient byte f94502c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f94504b;

        static {
            int[] iArr = new int[m0.values().length];
            f94504b = iArr;
            try {
                iArr[m0.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94504b[m0.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[net.time4j.f.values().length];
            f94503a = iArr2;
            try {
                iArr2[net.time4j.f.MILLENNIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94503a[net.time4j.f.CENTURIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94503a[net.time4j.f.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94503a[net.time4j.f.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94503a[net.time4j.f.QUARTERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f94503a[net.time4j.f.MONTHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f94503a[net.time4j.f.WEEKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f94503a[net.time4j.f.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static class b implements net.time4j.engine.y<g0, g0> {
        private b() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g0 getMaximum(g0 g0Var) {
            return g0.f94478e;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public g0 getMinimum(g0 g0Var) {
            return g0.f94477d;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public g0 getValue(g0 g0Var) {
            return g0Var;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(g0 g0Var, g0 g0Var2) {
            return g0Var2 != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public g0 withValue(g0 g0Var, g0 g0Var2, boolean z11) {
            if (g0Var2 != null) {
                return g0Var2;
            }
            throw new IllegalArgumentException("Missing date value.");
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static class c<V extends Enum<V>> implements net.time4j.engine.y<g0, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f94505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<V> f94506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final V f94507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final V f94508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f94509e;

        c(String str, Class<V> cls, V v11, V v12, int i11) {
            this.f94505a = str;
            this.f94506b = cls;
            this.f94507c = v11;
            this.f94508d = v12;
            this.f94509e = i11;
        }

        private net.time4j.engine.p<?> c() {
            switch (this.f94509e) {
                case 101:
                    return g0.f94494u;
                case 102:
                    return null;
                case 103:
                    return g0.f94497x;
                default:
                    throw new UnsupportedOperationException(this.f94505a);
            }
        }

        static <V extends Enum<V>> c<V> j(net.time4j.engine.p<V> pVar) {
            return new c<>(pVar.name(), pVar.getType(), pVar.t(), pVar.s(), ((q) pVar).s());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public V getMaximum(g0 g0Var) {
            return (this.f94509e == 102 && g0Var.f94500a == 999999999 && g0Var.f94501b == 12 && g0Var.f94502c >= 27) ? this.f94506b.cast(x0.FRIDAY) : this.f94508d;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMinimum(g0 g0Var) {
            return this.f94507c;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getValue(g0 g0Var) {
            Object objValueOf;
            switch (this.f94509e) {
                case 101:
                    objValueOf = c0.valueOf(g0Var.f94501b);
                    break;
                case 102:
                    objValueOf = g0Var.A0();
                    break;
                case 103:
                    objValueOf = m0.valueOf(((g0Var.f94501b - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f94505a);
            }
            return this.f94506b.cast(objValueOf);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(g0 g0Var, V v11) {
            if (v11 == null) {
                return false;
            }
            if (this.f94509e != 102 || g0Var.f94500a != 999999999) {
                return true;
            }
            try {
                withValue(g0Var, v11, false);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public g0 withValue(g0 g0Var, V v11, boolean z11) {
            if (v11 == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            switch (this.f94509e) {
                case 101:
                    return g0Var.W0(((c0) c0.class.cast(v11)).getValue());
                case 102:
                    return g0Var.S0((x0) x0.class.cast(v11));
                case 103:
                    return (g0) g0Var.H(((m0) m0.class.cast(v11)).getValue() - (((g0Var.f94501b - 1) / 3) + 1), net.time4j.f.QUARTERS);
                default:
                    throw new UnsupportedOperationException(this.f94505a);
            }
        }
    }

    private static class d implements net.time4j.engine.b0<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<?> f94510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f94511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f94512c;

        d(net.time4j.engine.p<Integer> pVar) {
            this(((t) pVar).s(), pVar);
        }

        private net.time4j.engine.p<?> c() {
            switch (this.f94512c) {
                case 14:
                    return g0.f94493t;
                case 15:
                    return g0.f94494u;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        private static int h(g0 g0Var) {
            int i11 = ((g0Var.f94501b - 1) / 3) + 1;
            if (i11 == 1) {
                return net.time4j.base.b.e(g0Var.f94500a) ? 91 : 90;
            }
            return i11 == 2 ? 91 : 92;
        }

        private int i(g0 g0Var) {
            int iD = net.time4j.base.b.d(g0Var.f94500a, g0Var.f94501b);
            byte b11 = g0Var.f94502c;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if ((i12 * 7) + b11 > iD) {
                    return (((b11 + (i11 * 7)) - 1) / 7) + 1;
                }
                i11 = i12;
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(g0 g0Var) {
            return c();
        }

        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int b(g0 g0Var) {
            switch (this.f94512c) {
                case 14:
                    return g0Var.f94500a;
                case 15:
                    return g0Var.f94501b;
                case 16:
                    return g0Var.f94502c;
                case 17:
                    return g0Var.B0();
                case 18:
                    return g0Var.z0();
                case 19:
                    return ((g0Var.f94502c - 1) / 7) + 1;
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(g0 g0Var) {
            switch (this.f94512c) {
                case 14:
                    return g0.f94480g;
                case 15:
                    return g0.f94482i;
                case 16:
                    return Integer.valueOf(net.time4j.base.b.d(g0Var.f94500a, g0Var.f94501b));
                case 17:
                    return net.time4j.base.b.e(g0Var.f94500a) ? g0.f94484k : g0.f94483j;
                case 18:
                    return Integer.valueOf(h(g0Var));
                case 19:
                    return Integer.valueOf(i(g0Var));
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(g0 g0Var) {
            switch (this.f94512c) {
                case 14:
                    return g0.f94479f;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return g0.f94481h;
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(g0 g0Var) {
            return Integer.valueOf(b(g0Var));
        }

        public boolean l(g0 g0Var, int i11) {
            switch (this.f94512c) {
                case 14:
                    return i11 >= -999999999 && i11 <= 999999999;
                case 15:
                    return i11 >= 1 && i11 <= 12;
                case 16:
                    return i11 >= 1 && i11 <= net.time4j.base.b.d(g0Var.f94500a, g0Var.f94501b);
                case 17:
                    if (i11 >= 1) {
                        if (i11 <= (net.time4j.base.b.e(g0Var.f94500a) ? 366 : 365)) {
                            return true;
                        }
                    }
                    return false;
                case 18:
                    return i11 >= 1 && i11 <= h(g0Var);
                case 19:
                    return i11 >= 1 && i11 <= i(g0Var);
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean isValid(g0 g0Var, Integer num) {
            return num != null && l(g0Var, num.intValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.b0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public g0 a(g0 g0Var, int i11, boolean z11) {
            if (z11) {
                return (g0) g0Var.H(net.time4j.base.c.l(i11, b(g0Var)), (v) g0.B.E(this.f94510a));
            }
            switch (this.f94512c) {
                case 14:
                    return g0Var.X0(i11);
                case 15:
                    return g0Var.W0(i11);
                case 16:
                    return g0Var.R0(i11);
                case 17:
                    return g0Var.U0(i11);
                case 18:
                    if (i11 >= 1 && i11 <= h(g0Var)) {
                        return (g0) g0Var.H(i11 - g0Var.z0(), net.time4j.f.DAYS);
                    }
                    throw new IllegalArgumentException("Out of range: " + i11);
                case 19:
                    if (z11 || (i11 >= 1 && i11 <= i(g0Var))) {
                        return (g0) g0Var.H(i11 - (((g0Var.f94502c - 1) / 7) + 1), net.time4j.f.WEEKS);
                    }
                    throw new IllegalArgumentException("Out of range: " + i11);
                default:
                    throw new UnsupportedOperationException(this.f94511b);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public g0 withValue(g0 g0Var, Integer num, boolean z11) {
            if (num != null) {
                return a(g0Var, num.intValue(), z11);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        d(int i11, net.time4j.engine.p<?> pVar) {
            this.f94510a = pVar;
            this.f94511b = pVar.name();
            this.f94512c = i11;
        }
    }

    private static class e implements net.time4j.engine.t<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f94513a = net.time4j.base.b.i(net.time4j.base.b.l(net.time4j.engine.z.MODIFIED_JULIAN_DATE.transform(net.time4j.base.c.b(System.currentTimeMillis(), 86400000), net.time4j.engine.z.UNIX))) + 20;

        private e() {
        }

        private static void e(net.time4j.engine.q<?> qVar, String str) {
            net.time4j.engine.l0 l0Var = net.time4j.engine.l0.ERROR_MESSAGE;
            if (qVar.y(l0Var, str)) {
                qVar.B(l0Var, str);
            }
        }

        private static boolean i(net.time4j.engine.q<?> qVar, int i11, int i12, int i13) {
            if (i13 >= 1 && (i13 <= 28 || i13 <= net.time4j.base.b.d(i11, i12))) {
                return true;
            }
            e(qVar, "DAY_OF_MONTH out of range: " + i13);
            return false;
        }

        private static boolean k(net.time4j.engine.q<?> qVar, boolean z11, m0 m0Var, int i11) {
            int i12 = a.f94504b[m0Var.ordinal()];
            int i13 = 91;
            if (i12 != 1) {
                if (i12 != 2) {
                    i13 = 92;
                }
            } else if (!z11) {
                i13 = 90;
            }
            if (i11 >= 1 && i11 <= i13) {
                return true;
            }
            e(qVar, "DAY_OF_QUARTER out of range: " + i11);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        
            if (r4 > (net.time4j.base.b.e(r3) ? 366 : 365)) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean l(net.time4j.engine.q<?> r2, int r3, int r4) {
            /*
                r0 = 1
                if (r4 < r0) goto L13
                r1 = 365(0x16d, float:5.11E-43)
                if (r4 <= r1) goto L12
                boolean r3 = net.time4j.base.b.e(r3)
                if (r3 == 0) goto Lf
                r1 = 366(0x16e, float:5.13E-43)
            Lf:
                if (r4 <= r1) goto L12
                goto L13
            L12:
                return r0
            L13:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "DAY_OF_YEAR out of range: "
                r3.append(r0)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                e(r2, r3)
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.g0.e.l(net.time4j.engine.q, int, int):boolean");
        }

        private static boolean m(net.time4j.engine.q<?> qVar, int i11) {
            if (i11 >= 1 && i11 <= 12) {
                return true;
            }
            e(qVar, "MONTH_OF_YEAR out of range: " + i11);
            return false;
        }

        private static boolean n(net.time4j.engine.q<?> qVar, int i11) {
            if (i11 >= -999999999 && i11 <= 999999999) {
                return true;
            }
            e(qVar, "YEAR out of range: " + i11);
            return false;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> a() {
            return null;
        }

        @Override // net.time4j.engine.t
        public int c() {
            return f94513a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g0 b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            x0 x0Var;
            k0<Integer, g0> k0Var;
            int iP;
            net.time4j.engine.p<g0> pVar = g0.f94487n;
            if (qVar.n(pVar)) {
                return (g0) qVar.s(pVar);
            }
            int iP2 = qVar.p(g0.f94489p);
            if (iP2 != Integer.MIN_VALUE) {
                k0<Integer, g0> k0Var2 = g0.f94493t;
                int iP3 = qVar.p(k0Var2);
                if (iP3 == Integer.MIN_VALUE) {
                    d0<c0> d0Var = g0.f94492s;
                    if (qVar.n(d0Var)) {
                        iP3 = ((c0) qVar.s(d0Var)).getValue();
                    }
                }
                if (iP3 != Integer.MIN_VALUE && (iP = qVar.p((k0Var = g0.f94494u))) != Integer.MIN_VALUE) {
                    if (z11) {
                        return (g0) ((g0) g0.I0(iP2, 1, 1).C(k0Var2.g(Integer.valueOf(iP3)))).C(k0Var.g(Integer.valueOf(iP)));
                    }
                    if (n(qVar, iP2) && m(qVar, iP3) && i(qVar, iP2, iP3, iP)) {
                        return g0.J0(iP2, iP3, iP, false);
                    }
                    return null;
                }
                k0<Integer, g0> k0Var3 = g0.f94496w;
                int iP4 = qVar.p(k0Var3);
                if (iP4 != Integer.MIN_VALUE) {
                    if (z11) {
                        return (g0) g0.G0(iP2, 1).C(k0Var3.g(Integer.valueOf(iP4)));
                    }
                    if (n(qVar, iP2) && l(qVar, iP2, iP4)) {
                        return g0.G0(iP2, iP4);
                    }
                    return null;
                }
                int iP5 = qVar.p(g0.f94497x);
                if (iP5 != Integer.MIN_VALUE) {
                    d0<m0> d0Var2 = g0.f94491r;
                    if (qVar.n(d0Var2)) {
                        m0 m0Var = (m0) qVar.s(d0Var2);
                        boolean zE = net.time4j.base.b.e(iP2);
                        int i11 = (zE ? 91 : 90) + iP5;
                        if (m0Var == m0.Q1) {
                            i11 = iP5;
                        } else if (m0Var == m0.Q3) {
                            i11 += 91;
                        } else if (m0Var == m0.Q4) {
                            i11 += 183;
                        }
                        if (z11) {
                            return (g0) g0.G0(iP2, 1).C(k0Var3.g(Integer.valueOf(i11)));
                        }
                        if (n(qVar, iP2) && k(qVar, zE, m0Var, iP5)) {
                            return g0.G0(iP2, i11);
                        }
                        return null;
                    }
                }
            }
            int iP6 = qVar.p(g0.f94490q);
            if (iP6 != Integer.MIN_VALUE) {
                z0 z0Var = z0.f94846m;
                if (qVar.n(z0Var.n())) {
                    int iIntValue = ((Integer) qVar.s(z0Var.n())).intValue();
                    d0<x0> d0Var3 = g0.f94495v;
                    if (!qVar.n(d0Var3)) {
                        if (qVar.n(z0Var.i())) {
                            x0Var = (x0) qVar.s(z0Var.i());
                        }
                        return null;
                    }
                    x0Var = (x0) qVar.s(d0Var3);
                    if (iP6 < -999999999 || iP6 > 999999999) {
                        e(qVar, g0.a1(iP6));
                        return null;
                    }
                    g0 g0VarM0 = g0.M0(iP6, iIntValue, x0Var, false);
                    if (g0VarM0 == null) {
                        e(qVar, g0.Z0(iIntValue));
                    }
                    return g0VarM0;
                }
            }
            net.time4j.engine.z zVar = net.time4j.engine.z.MODIFIED_JULIAN_DATE;
            if (qVar.n(zVar)) {
                return (g0) g0.A.b(net.time4j.engine.z.UTC.transform(((Long) qVar.s(zVar)).longValue(), zVar));
            }
            if (qVar instanceof net.time4j.base.f) {
                return ((i0) i0.P().b(qVar, dVar, z11, z12)).S();
            }
            return null;
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.o f(g0 g0Var, net.time4j.engine.d dVar) {
            return g0Var;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 h() {
            return net.time4j.engine.d0.f94117a;
        }

        @Override // net.time4j.engine.t
        public String j(net.time4j.engine.x xVar, Locale locale) {
            return net.time4j.format.b.r(net.time4j.format.e.ofStyle(xVar.getStyleValue()), locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static class f implements net.time4j.engine.k<g0> {
        private f() {
        }

        @Override // net.time4j.engine.k
        public long a() {
            return 365241779741L;
        }

        @Override // net.time4j.engine.k
        public long c() {
            return -365243219892L;
        }

        @Override // net.time4j.engine.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long transform(g0 g0Var) {
            return net.time4j.engine.z.UTC.transform(net.time4j.base.b.k(g0Var), net.time4j.engine.z.MODIFIED_JULIAN_DATE);
        }

        @Override // net.time4j.engine.k
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g0 b(long j11) {
            if (j11 == -365243219892L) {
                return g0.f94477d;
            }
            if (j11 == 365241779741L) {
                return g0.f94478e;
            }
            long jL = net.time4j.base.b.l(net.time4j.engine.z.MODIFIED_JULIAN_DATE.transform(j11, net.time4j.engine.z.UTC));
            return g0.I0(net.time4j.base.b.i(jL), net.time4j.base.b.h(jL), net.time4j.base.b.g(jL));
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    static {
        i iVar = i.f94615a;
        f94487n = iVar;
        f94488o = iVar;
        t tVarP = t.p("YEAR", 14, -999999999, 999999999, 'u');
        f94489p = tVarP;
        a1 a1Var = a1.f93924g;
        f94490q = a1Var;
        q qVar = new q("QUARTER_OF_YEAR", m0.class, m0.Q1, m0.Q4, 103, 'Q');
        f94491r = qVar;
        q qVar2 = new q("MONTH_OF_YEAR", c0.class, c0.JANUARY, c0.DECEMBER, 101, 'M');
        f94492s = qVar2;
        t tVarP2 = t.p("MONTH_AS_NUMBER", 15, 1, 12, 'M');
        f94493t = tVarP2;
        t tVarP3 = t.p("DAY_OF_MONTH", 16, 1, 31, 'd');
        f94494u = tVarP3;
        q qVar3 = new q("DAY_OF_WEEK", x0.class, x0.MONDAY, x0.SUNDAY, 102, 'E');
        f94495v = qVar3;
        t tVarP4 = t.p("DAY_OF_YEAR", 17, 1, 365, 'D');
        f94496w = tVarP4;
        t tVarP5 = t.p("DAY_OF_QUARTER", 18, 1, 92, (char) 0);
        f94497x = tVarP5;
        y0 y0Var = y0.f94836d;
        f94498y = y0Var;
        HashMap map = new HashMap();
        t0(map, iVar);
        t0(map, tVarP);
        t0(map, a1Var);
        t0(map, qVar);
        t0(map, qVar2);
        t0(map, tVarP2);
        t0(map, tVarP3);
        t0(map, qVar3);
        t0(map, tVarP4);
        t0(map, tVarP5);
        t0(map, y0Var);
        f94499z = Collections.unmodifiableMap(map);
        a aVar = null;
        f fVar = new f(aVar);
        A = fVar;
        net.time4j.engine.f0.b bVarJ = net.time4j.engine.f0.b.j(v.class, g0.class, new e(aVar), fVar);
        b bVar = new b(aVar);
        net.time4j.f fVar2 = net.time4j.f.DAYS;
        net.time4j.engine.f0.b bVarE = bVarJ.e(iVar, bVar, fVar2).e(tVarP, new d(tVarP), net.time4j.f.YEARS).e(a1Var, a1.t(g0.class), w0.f94831a).e(qVar, c.j(qVar), net.time4j.f.QUARTERS);
        c cVarJ = c.j(qVar2);
        net.time4j.f fVar3 = net.time4j.f.MONTHS;
        net.time4j.engine.f0.b bVarE2 = bVarE.e(qVar2, cVarJ, fVar3).e(tVarP2, new d(tVarP2), fVar3).e(tVarP3, new d(tVarP3), fVar2).e(qVar3, c.j(qVar3), fVar2).e(tVarP4, new d(tVarP4), fVar2).e(tVarP5, new d(tVarP5), fVar2).e(y0Var, new d(19, y0Var), net.time4j.f.WEEKS);
        Q0(bVarE2);
        P0(bVarE2);
        B = bVarE2.h();
    }

    private g0(int i11, int i12, int i13) {
        this.f94500a = i11;
        this.f94501b = (byte) i12;
        this.f94502c = (byte) i13;
    }

    static Object F0(String str) {
        return f94499z.get(str);
    }

    public static g0 G0(int i11, int i12) {
        if (i12 < 1) {
            throw new IllegalArgumentException("Day of year out of range: " + i12);
        }
        if (i12 <= 31) {
            return I0(i11, 1, i12);
        }
        int[] iArr = net.time4j.base.b.e(i11) ? f94486m : f94485l;
        for (int i13 = i12 > iArr[6] ? 7 : 1; i13 < 12; i13++) {
            if (i12 <= iArr[i13]) {
                return J0(i11, i13 + 1, i12 - iArr[i13 - 1], false);
            }
        }
        throw new IllegalArgumentException("Day of year out of range: " + i12);
    }

    public static g0 I0(int i11, int i12, int i13) {
        return J0(i11, i12, i13, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 J0(int i11, int i12, int i13, boolean z11) {
        if (z11) {
            net.time4j.base.b.a(i11, i12, i13);
        }
        return new g0(i11, i12, i13);
    }

    public static g0 L0(int i11, int i12, x0 x0Var) {
        return M0(i11, i12, x0Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 M0(int i11, int i12, x0 x0Var, boolean z11) {
        if (i12 < 1 || i12 > 53) {
            if (z11) {
                throw new IllegalArgumentException(Z0(i12));
            }
            return null;
        }
        if (z11 && (i11 < f94479f.intValue() || i11 > f94480g.intValue())) {
            throw new IllegalArgumentException(a1(i11));
        }
        int value = x0.valueOf(net.time4j.base.b.c(i11, 1, 1)).getValue();
        int value2 = (((value <= 4 ? 2 - value : 9 - value) + ((i12 - 1) * 7)) + x0Var.getValue()) - 1;
        if (value2 <= 0) {
            i11--;
            value2 += net.time4j.base.b.e(i11) ? 366 : 365;
        } else {
            int i13 = net.time4j.base.b.e(i11) ? 366 : 365;
            if (value2 > i13) {
                value2 -= i13;
                i11++;
            }
        }
        g0 g0VarG0 = G0(i11, value2);
        if (i12 != 53 || g0VarG0.E0() == 53) {
            return g0VarG0;
        }
        if (z11) {
            throw new IllegalArgumentException(Z0(i12));
        }
        return null;
    }

    public static g0 N0(int i11, c0 c0Var, int i12) {
        return J0(i11, c0Var.getValue(), i12, true);
    }

    public static g0 O0(long j11, net.time4j.engine.z zVar) {
        return A.b(net.time4j.engine.z.UTC.transform(j11, zVar));
    }

    private static void P0(net.time4j.engine.f0.b<v, g0> bVar) {
        for (net.time4j.engine.r rVar : net.time4j.base.d.c().g(net.time4j.engine.r.class)) {
            if (rVar.c(g0.class)) {
                bVar.f(rVar);
            }
        }
        bVar.f(new v0());
    }

    private static void Q0(net.time4j.engine.f0.b<v, g0> bVar) {
        EnumSet enumSetRange = EnumSet.range(net.time4j.f.MILLENNIA, net.time4j.f.MONTHS);
        EnumSet enumSetRange2 = EnumSet.range(net.time4j.f.WEEKS, net.time4j.f.DAYS);
        net.time4j.f[] fVarArrValues = net.time4j.f.values();
        int length = fVarArrValues.length;
        int i11 = 0;
        while (i11 < length) {
            net.time4j.f fVar = fVarArrValues[i11];
            net.time4j.engine.f0.b<v, g0> bVar2 = bVar;
            bVar2.g(fVar, new net.time4j.f.j(fVar), fVar.getLength(), fVar.compareTo(net.time4j.f.WEEKS) < 0 ? enumSetRange : enumSetRange2);
            i11++;
            bVar = bVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 R0(int i11) {
        return this.f94502c == i11 ? this : I0(this.f94500a, this.f94501b, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 S0(x0 x0Var) {
        x0 x0VarA0 = A0();
        return x0VarA0 == x0Var ? this : A.b(net.time4j.base.c.f(C0(), x0Var.getValue() - x0VarA0.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 U0(int i11) {
        return B0() == i11 ? this : G0(this.f94500a, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 W0(int i11) {
        if (this.f94501b == i11) {
            return this;
        }
        return I0(this.f94500a, i11, Math.min(net.time4j.base.b.d(this.f94500a, i11), (int) this.f94502c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 X0(int i11) {
        if (this.f94500a == i11) {
            return this;
        }
        return I0(i11, this.f94501b, Math.min(net.time4j.base.b.d(i11, this.f94501b), (int) this.f94502c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String Z0(int i11) {
        return "WEEK_OF_YEAR (ISO) out of range: " + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a1(int i11) {
        return "YEAR_OF_WEEKDATE (ISO) out of range: " + i11;
    }

    private static g0 m0(g0 g0Var, long j11) {
        long jF = net.time4j.base.c.f(g0Var.f94502c, j11);
        if (jF >= 1 && jF <= 28) {
            return I0(g0Var.f94500a, g0Var.f94501b, (int) jF);
        }
        long jF2 = net.time4j.base.c.f(g0Var.B0(), j11);
        if (jF2 >= 1 && jF2 <= 365) {
            return G0(g0Var.f94500a, (int) jF2);
        }
        return A.b(net.time4j.base.c.f(g0Var.C0(), j11));
    }

    public static net.time4j.engine.f0<v, g0> q0() {
        return B;
    }

    static g0 r0(net.time4j.f fVar, g0 g0Var, long j11, int i11) {
        switch (a.f94503a[fVar.ordinal()]) {
            case 1:
                return r0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 12000L), i11);
            case 2:
                return r0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 1200L), i11);
            case 3:
                return r0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 120L), i11);
            case 4:
                return r0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 12L), i11);
            case 5:
                return r0(net.time4j.f.MONTHS, g0Var, net.time4j.base.c.i(j11, 3L), i11);
            case 6:
                return x0(g0Var, net.time4j.base.c.f(g0Var.D0(), j11), g0Var.f94502c, i11);
            case 7:
                return r0(net.time4j.f.DAYS, g0Var, net.time4j.base.c.i(j11, 7L), i11);
            case 8:
                return m0(g0Var, j11);
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private static void t0(Map<String, Object> map, net.time4j.engine.p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    private static void u0(StringBuilder sb2, int i11) {
        sb2.append(CoreConstants.DASH_CHAR);
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    private static void v0(StringBuilder sb2, int i11) {
        int iJ;
        if (i11 < 0) {
            sb2.append(CoreConstants.DASH_CHAR);
            iJ = net.time4j.base.c.j(i11);
        } else {
            iJ = i11;
        }
        if (iJ >= 10000) {
            if (i11 > 0) {
                sb2.append('+');
            }
        } else if (iJ < 1000) {
            sb2.append('0');
            if (iJ < 100) {
                sb2.append('0');
                if (iJ < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(iJ);
    }

    public static g0 w0(net.time4j.base.a aVar) {
        return aVar instanceof g0 ? (g0) aVar : I0(aVar.b(), aVar.r(), aVar.f());
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    private static g0 x0(g0 g0Var, long j11, int i11, int i12) {
        if (i12 == 5 && g0Var.f94502c == g0Var.lengthOfMonth()) {
            i12 = 2;
        }
        int iG = net.time4j.base.c.g(net.time4j.base.c.f(net.time4j.base.c.b(j11, 12), 1970L));
        int iD = net.time4j.base.c.d(j11, 12) + 1;
        int iD2 = net.time4j.base.b.d(iG, iD);
        if (i11 <= iD2) {
            if (i11 < iD2 && i12 == 2) {
            }
            return I0(iG, iD, i11);
        }
        switch (i12) {
            case 0:
            case 2:
            case 5:
            case 6:
                break;
            case 1:
                return x0(g0Var, net.time4j.base.c.f(j11, 1L), 1, i12);
            case 3:
                return x0(g0Var, net.time4j.base.c.f(j11, 1L), i11 - iD2, i12);
            case 4:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Day of month out of range: ");
                v0(sb2, iG);
                u0(sb2, iD);
                u0(sb2, i11);
                throw new ChronoException(sb2.toString());
            default:
                throw new UnsupportedOperationException("Overflow policy not implemented: " + i12);
        }
        return I0(iG, iD, i11);
        i11 = iD2;
        return I0(iG, iD, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z0() {
        switch (this.f94501b) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f94502c;
            case 2:
            case 8:
            case 11:
                return this.f94502c + 31;
            case 3:
                return (net.time4j.base.b.e(this.f94500a) ? (byte) 60 : (byte) 59) + this.f94502c;
            case 5:
                return this.f94502c + 30;
            case 6:
            case 12:
                return this.f94502c + 61;
            case 9:
                return this.f94502c + 62;
            default:
                throw new AssertionError("Unknown month: " + ((int) this.f94501b));
        }
    }

    public x0 A0() {
        return x0.valueOf(net.time4j.base.b.c(this.f94500a, this.f94501b, this.f94502c));
    }

    public int B0() {
        byte b11 = this.f94501b;
        if (b11 != 1) {
            return b11 != 2 ? f94485l[b11 - 2] + this.f94502c + (net.time4j.base.b.e(this.f94500a) ? 1 : 0) : this.f94502c + 31;
        }
        return this.f94502c;
    }

    long C0() {
        return A.transform(this);
    }

    long D0() {
        return ((((long) (this.f94500a - 1970)) * 12) + ((long) this.f94501b)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* JADX INFO: renamed from: E */
    public net.time4j.engine.f0<v, g0> t() {
        return B;
    }

    int E0() {
        return ((Integer) s(z0.f94846m.n())).intValue();
    }

    @Override // net.time4j.engine.m
    protected int J(net.time4j.engine.g gVar) {
        if (!(gVar instanceof g0)) {
            return super.J(gVar);
        }
        g0 g0Var = (g0) gVar;
        int i11 = this.f94500a - g0Var.f94500a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f94501b - g0Var.f94501b;
        return i12 == 0 ? this.f94502c - g0Var.f94502c : i12;
    }

    g0 V0(long j11) {
        return A.b(j11);
    }

    @Override // net.time4j.base.a
    public int b() {
        return this.f94500a;
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f94502c == g0Var.f94502c && this.f94501b == g0Var.f94501b && this.f94500a == g0Var.f94500a) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.base.a
    public int f() {
        return this.f94502c;
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        int i11 = this.f94500a;
        return (((i11 << 11) + (this.f94501b << 6)) + this.f94502c) ^ (i11 & (-2048));
    }

    public int lengthOfMonth() {
        return net.time4j.base.b.d(this.f94500a, this.f94501b);
    }

    public i0 n0(h0 h0Var) {
        return i0.Y(this, h0Var);
    }

    public i0 o0() {
        return n0(h0.f94522m);
    }

    public i0 p0(int i11, int i12, int i13) {
        return n0(h0.I0(i11, i12, i13));
    }

    @Override // net.time4j.base.a
    public int r() {
        return this.f94501b;
    }

    @Override // net.time4j.base.a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        v0(sb2, this.f94500a);
        u0(sb2, this.f94501b);
        u0(sb2, this.f94502c);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public g0 u() {
        return this;
    }
}
