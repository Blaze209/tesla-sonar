package net.time4j;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("iso8601")
public final class h0 extends net.time4j.engine.i0<w, h0> implements net.time4j.base.g, net.time4j.format.h {
    public static final k0<Integer, h0> A;
    public static final k0<Integer, h0> B;
    public static final k0<Integer, h0> C;
    public static final k0<Integer, h0> D;
    public static final k0<Long, h0> E;
    public static final k0<Long, h0> F;
    public static final c1<BigDecimal> G;
    public static final c1<BigDecimal> H;
    public static final c1<BigDecimal> I;
    public static final net.time4j.engine.p<net.time4j.h> J;
    private static final Map<String, Object> K;
    private static final net.time4j.engine.y<h0, BigDecimal> L;
    private static final net.time4j.engine.y<h0, BigDecimal> M;
    private static final net.time4j.engine.y<h0, BigDecimal> N;
    private static final net.time4j.engine.f0<w, h0> O;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final char f94514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BigDecimal f94515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigDecimal f94516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final BigDecimal f94517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final BigDecimal f94518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final BigDecimal f94519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final BigDecimal f94520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h0[] f94521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final h0 f94522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final h0 f94523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final net.time4j.engine.p<h0> f94524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u0 f94525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c1<a0> f94526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final net.time4j.c<Integer, h0> f94527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final net.time4j.c<Integer, h0> f94528s;
    private static final long serialVersionUID = 2780881537313863339L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k0<Integer, h0> f94529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k0<Integer, h0> f94530u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k0<Integer, h0> f94531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k0<Integer, h0> f94532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k0<Integer, h0> f94533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k0<Integer, h0> f94534y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k0<Integer, h0> f94535z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient byte f94536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient byte f94537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient byte f94538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f94539d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94540a;

        static {
            int[] iArr = new int[net.time4j.h.values().length];
            f94540a = iArr;
            try {
                iArr[net.time4j.h.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94540a[net.time4j.h.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94540a[net.time4j.h.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94540a[net.time4j.h.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94540a[net.time4j.h.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94540a[net.time4j.h.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static class b implements net.time4j.engine.y<h0, BigDecimal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<BigDecimal> f94541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BigDecimal f94542b;

        b(net.time4j.engine.p<BigDecimal> pVar, BigDecimal bigDecimal) {
            this.f94541a = pVar;
            this.f94542b = bigDecimal;
        }

        private static BigDecimal c(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        private static int j(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal getMaximum(h0 h0Var) {
            net.time4j.engine.p<BigDecimal> pVar;
            return (h0Var.f94536a == 24 && ((pVar = this.f94541a) == h0.H || pVar == h0.I)) ? BigDecimal.ZERO : this.f94542b;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigDecimal getMinimum(h0 h0Var) {
            return BigDecimal.ZERO;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public BigDecimal getValue(h0 h0Var) {
            BigDecimal bigDecimalAdd;
            net.time4j.engine.p<BigDecimal> pVar = this.f94541a;
            if (pVar == h0.G) {
                if (h0Var.equals(h0.f94522m)) {
                    return BigDecimal.ZERO;
                }
                if (h0Var.f94536a == 24) {
                    return h0.f94518i;
                }
                bigDecimalAdd = BigDecimal.valueOf(h0Var.f94536a).add(c(BigDecimal.valueOf(h0Var.f94537b), h0.f94515f)).add(c(BigDecimal.valueOf(h0Var.f94538c), h0.f94516g)).add(c(BigDecimal.valueOf(h0Var.f94539d), h0.f94516g.multiply(h0.f94517h)));
            } else if (pVar == h0.H) {
                if (h0Var.y0()) {
                    return BigDecimal.ZERO;
                }
                bigDecimalAdd = BigDecimal.valueOf(h0Var.f94537b).add(c(BigDecimal.valueOf(h0Var.f94538c), h0.f94515f)).add(c(BigDecimal.valueOf(h0Var.f94539d), h0.f94515f.multiply(h0.f94517h)));
            } else {
                if (pVar != h0.I) {
                    throw new UnsupportedOperationException(this.f94541a.name());
                }
                if (h0Var.z0()) {
                    return BigDecimal.ZERO;
                }
                bigDecimalAdd = BigDecimal.valueOf(h0Var.f94538c).add(c(BigDecimal.valueOf(h0Var.f94539d), h0.f94517h));
            }
            return com.google.android.gms.internal.measurement.a.a(bigDecimalAdd.setScale(15, RoundingMode.FLOOR));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, BigDecimal bigDecimal) {
            net.time4j.engine.p<BigDecimal> pVar;
            if (bigDecimal == null) {
                return false;
            }
            if (h0Var.f94536a == 24 && ((pVar = this.f94541a) == h0.H || pVar == h0.I)) {
                return BigDecimal.ZERO.compareTo(bigDecimal) == 0;
            }
            return BigDecimal.ZERO.compareTo(bigDecimal) <= 0 && this.f94542b.compareTo(bigDecimal) >= 0;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, BigDecimal bigDecimal, boolean z11) {
            int iD;
            int iIntValue;
            long jLongValueExact;
            int iIntValue2;
            int iJ;
            int iD2;
            int iD3;
            if (bigDecimal == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            net.time4j.engine.p<BigDecimal> pVar = this.f94541a;
            if (pVar == h0.G) {
                RoundingMode roundingMode = RoundingMode.FLOOR;
                BigDecimal scale = bigDecimal.setScale(0, roundingMode);
                BigDecimal bigDecimalMultiply = bigDecimal.subtract(scale).multiply(h0.f94515f);
                BigDecimal scale2 = bigDecimalMultiply.setScale(0, roundingMode);
                BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.subtract(scale2).multiply(h0.f94515f);
                BigDecimal scale3 = bigDecimalMultiply2.setScale(0, roundingMode);
                jLongValueExact = scale.longValueExact();
                iIntValue2 = scale2.intValue();
                iIntValue = scale3.intValue();
                iJ = j(bigDecimalMultiply2.subtract(scale3));
            } else if (pVar == h0.H) {
                RoundingMode roundingMode2 = RoundingMode.FLOOR;
                BigDecimal scale4 = bigDecimal.setScale(0, roundingMode2);
                BigDecimal bigDecimalMultiply3 = bigDecimal.subtract(scale4).multiply(h0.f94515f);
                BigDecimal scale5 = bigDecimalMultiply3.setScale(0, roundingMode2);
                iIntValue = scale5.intValue();
                int iJ2 = j(bigDecimalMultiply3.subtract(scale5));
                long jLongValueExact2 = scale4.longValueExact();
                long jB = h0Var.f94536a;
                if (z11) {
                    jB += net.time4j.base.c.b(jLongValueExact2, 60);
                    iD2 = net.time4j.base.c.d(jLongValueExact2, 60);
                } else {
                    h0.i0(jLongValueExact2);
                    iD2 = (int) jLongValueExact2;
                }
                jLongValueExact = jB;
                iIntValue2 = iD2;
                iJ = iJ2;
            } else {
                if (pVar != h0.I) {
                    throw new UnsupportedOperationException(this.f94541a.name());
                }
                BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                int iJ3 = j(bigDecimal.subtract(scale6));
                long jLongValueExact3 = scale6.longValueExact();
                long jB2 = h0Var.f94536a;
                int iD4 = h0Var.f94537b;
                if (z11) {
                    iD = net.time4j.base.c.d(jLongValueExact3, 60);
                    long jB3 = ((long) iD4) + net.time4j.base.c.b(jLongValueExact3, 60);
                    jB2 += net.time4j.base.c.b(jB3, 60);
                    iD4 = net.time4j.base.c.d(jB3, 60);
                } else {
                    h0.k0(jLongValueExact3);
                    iD = (int) jLongValueExact3;
                }
                iIntValue = iD;
                jLongValueExact = jB2;
                iIntValue2 = iD4;
                iJ = iJ3;
            }
            if (z11) {
                iD3 = net.time4j.base.c.d(jLongValueExact, 24);
                if (jLongValueExact > 0 && (iD3 | iIntValue2 | iIntValue | iJ) == 0) {
                    return h0.f94523n;
                }
            } else {
                if (jLongValueExact < 0 || jLongValueExact > 24) {
                    throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                }
                iD3 = (int) jLongValueExact;
            }
            return h0.J0(iD3, iIntValue2, iIntValue, iJ);
        }
    }

    private static class c implements net.time4j.engine.k0<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.h f94543a;

        /* synthetic */ c(net.time4j.h hVar, a aVar) {
            this(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static k e(h0 h0Var, long j11, net.time4j.h hVar) {
            return (j11 != 0 || h0Var.f94536a >= 24) ? (k) g(k.class, hVar, h0Var, j11) : new k(0L, h0Var);
        }

        private static <R> R g(Class<R> cls, net.time4j.h hVar, h0 h0Var, long j11) {
            long jF;
            h0 h0VarJ0;
            int iD = h0Var.f94537b;
            int iD2 = h0Var.f94538c;
            int i11 = h0Var.f94539d;
            switch (a.f94540a[hVar.ordinal()]) {
                case 1:
                    jF = net.time4j.base.c.f(h0Var.f94536a, j11);
                    break;
                case 2:
                    long jF2 = net.time4j.base.c.f(h0Var.f94537b, j11);
                    jF = net.time4j.base.c.f(h0Var.f94536a, net.time4j.base.c.b(jF2, 60));
                    iD = net.time4j.base.c.d(jF2, 60);
                    break;
                case 3:
                    long jF3 = net.time4j.base.c.f(h0Var.f94538c, j11);
                    long jF4 = net.time4j.base.c.f(h0Var.f94537b, net.time4j.base.c.b(jF3, 60));
                    jF = net.time4j.base.c.f(h0Var.f94536a, net.time4j.base.c.b(jF4, 60));
                    int iD3 = net.time4j.base.c.d(jF4, 60);
                    iD2 = net.time4j.base.c.d(jF3, 60);
                    iD = iD3;
                    break;
                case 4:
                    return (R) g(cls, net.time4j.h.NANOS, h0Var, net.time4j.base.c.i(j11, 1000000L));
                case 5:
                    return (R) g(cls, net.time4j.h.NANOS, h0Var, net.time4j.base.c.i(j11, 1000L));
                case 6:
                    long jF5 = net.time4j.base.c.f(h0Var.f94539d, j11);
                    long jF6 = net.time4j.base.c.f(h0Var.f94538c, net.time4j.base.c.b(jF5, Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
                    long jF7 = net.time4j.base.c.f(h0Var.f94537b, net.time4j.base.c.b(jF6, 60));
                    jF = net.time4j.base.c.f(h0Var.f94536a, net.time4j.base.c.b(jF7, 60));
                    int iD4 = net.time4j.base.c.d(jF7, 60);
                    int iD5 = net.time4j.base.c.d(jF6, 60);
                    int iD6 = net.time4j.base.c.d(jF5, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                    iD = iD4;
                    iD2 = iD5;
                    i11 = iD6;
                    break;
                default:
                    throw new UnsupportedOperationException(hVar.name());
            }
            int iD7 = net.time4j.base.c.d(jF, 24);
            if ((iD7 | iD | iD2 | i11) == 0) {
                h0VarJ0 = (j11 <= 0 || cls != h0.class) ? h0.f94522m : h0.f94523n;
            } else {
                h0VarJ0 = h0.J0(iD7, iD, iD2, i11);
            }
            return cls == h0.class ? cls.cast(h0VarJ0) : cls.cast(new k(net.time4j.base.c.b(jF, 24), h0VarJ0));
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h0 b(h0 h0Var, long j11) {
            return j11 == 0 ? h0Var : (h0) g(h0.class, this.f94543a, h0Var, j11);
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public long a(h0 h0Var, h0 h0Var2) {
            long j11;
            long jU0 = h0Var2.u0() - h0Var.u0();
            switch (a.f94540a[this.f94543a.ordinal()]) {
                case 1:
                    j11 = 3600000000000L;
                    break;
                case 2:
                    j11 = 60000000000L;
                    break;
                case 3:
                    j11 = 1000000000;
                    break;
                case 4:
                    j11 = 1000000;
                    break;
                case 5:
                    j11 = 1000;
                    break;
                case 6:
                    j11 = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f94543a.name());
            }
            return jU0 / j11;
        }

        private c(net.time4j.h hVar) {
            this.f94543a = hVar;
        }
    }

    private static class d implements net.time4j.engine.y<h0, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<Integer> f94544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f94545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f94546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f94547d;

        d(net.time4j.engine.p<Integer> pVar, int i11, int i12) {
            this.f94544a = pVar;
            if (pVar instanceof u) {
                this.f94545b = ((u) pVar).t();
            } else {
                this.f94545b = -1;
            }
            this.f94546c = i11;
            this.f94547d = i12;
        }

        private net.time4j.engine.p<?> c(h0 h0Var) {
            switch (this.f94545b) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return h0.f94532w;
                case 6:
                case 7:
                    return h0.f94534y;
                case 8:
                case 9:
                    return h0.C;
                default:
                    return null;
            }
        }

        private static boolean i(h0 h0Var) {
            return h0Var.f94536a < 12 || h0Var.f94536a == 24;
        }

        private h0 l(h0 h0Var, int i11) {
            net.time4j.engine.p<Integer> pVar = this.f94544a;
            if (pVar == h0.f94531v || pVar == h0.f94530u || pVar == h0.f94529t) {
                return h0Var.H(net.time4j.base.c.l(i11, ((Integer) h0Var.s(pVar)).intValue()), net.time4j.h.HOURS);
            }
            if (pVar == h0.f94532w) {
                return h0Var.H(net.time4j.base.c.l(i11, h0Var.f94537b), net.time4j.h.MINUTES);
            }
            if (pVar == h0.f94534y) {
                return h0Var.H(net.time4j.base.c.l(i11, h0Var.f94538c), net.time4j.h.SECONDS);
            }
            k0<Integer, h0> k0Var = h0.A;
            if (pVar == k0Var) {
                return h0Var.H(net.time4j.base.c.l(i11, ((Integer) h0Var.s(k0Var)).intValue()), net.time4j.h.MILLIS);
            }
            k0<Integer, h0> k0Var2 = h0.B;
            if (pVar == k0Var2) {
                return h0Var.H(net.time4j.base.c.l(i11, ((Integer) h0Var.s(k0Var2)).intValue()), net.time4j.h.MICROS);
            }
            if (pVar == h0.C) {
                return h0Var.H(net.time4j.base.c.l(i11, h0Var.f94539d), net.time4j.h.NANOS);
            }
            if (pVar == h0.D) {
                int iC = net.time4j.base.c.c(i11, 86400000);
                int i12 = h0Var.f94539d % 1000000;
                if (iC == 0 && i12 == 0) {
                    return i11 > 0 ? h0.f94523n : h0.f94522m;
                }
                return h0.n0(iC, i12);
            }
            if (pVar == h0.f94533x) {
                int iC2 = net.time4j.base.c.c(i11, 1440);
                if (iC2 == 0 && h0Var.z0()) {
                    return i11 > 0 ? h0.f94523n : h0.f94522m;
                }
                return withValue(h0Var, Integer.valueOf(iC2), false);
            }
            if (pVar != h0.f94535z) {
                throw new UnsupportedOperationException(this.f94544a.name());
            }
            int iC3 = net.time4j.base.c.c(i11, Strategy.TTL_SECONDS_MAX);
            if (iC3 == 0 && h0Var.f94539d == 0) {
                return i11 > 0 ? h0.f94523n : h0.f94522m;
            }
            return withValue(h0Var, Integer.valueOf(iC3), false);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return c(h0Var);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return c(h0Var);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(h0 h0Var) {
            if (h0Var.f94536a == 24) {
                switch (this.f94545b) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            return h0Var.v0(this.f94544a) ? Integer.valueOf(this.f94547d - 1) : Integer.valueOf(this.f94547d);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(h0 h0Var) {
            return Integer.valueOf(this.f94546c);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(h0 h0Var) {
            int i11;
            byte b11;
            int iU0 = 12;
            switch (this.f94545b) {
                case 1:
                    int i12 = h0Var.f94536a % 12;
                    if (i12 != 0) {
                        iU0 = i12;
                    }
                    return Integer.valueOf(iU0);
                case 2:
                    iU0 = h0Var.f94536a % 24;
                    if (iU0 == 0) {
                        iU0 = 24;
                    }
                    return Integer.valueOf(iU0);
                case 3:
                    iU0 = h0Var.f94536a % 12;
                    return Integer.valueOf(iU0);
                case 4:
                    iU0 = h0Var.f94536a % 24;
                    return Integer.valueOf(iU0);
                case 5:
                    iU0 = h0Var.f94536a;
                    return Integer.valueOf(iU0);
                case 6:
                    iU0 = h0Var.f94537b;
                    return Integer.valueOf(iU0);
                case 7:
                    i11 = h0Var.f94536a * 60;
                    b11 = h0Var.f94537b;
                    iU0 = i11 + b11;
                    return Integer.valueOf(iU0);
                case 8:
                    iU0 = h0Var.f94538c;
                    return Integer.valueOf(iU0);
                case 9:
                    i11 = (h0Var.f94536a * Tnaf.POW_2_WIDTH) + (h0Var.f94537b * 60);
                    b11 = h0Var.f94538c;
                    iU0 = i11 + b11;
                    return Integer.valueOf(iU0);
                case 10:
                    iU0 = h0Var.f94539d / 1000000;
                    return Integer.valueOf(iU0);
                case 11:
                    iU0 = h0Var.f94539d / 1000;
                    return Integer.valueOf(iU0);
                case 12:
                    iU0 = h0Var.f94539d;
                    return Integer.valueOf(iU0);
                case 13:
                    iU0 = (int) (h0Var.u0() / 1000000);
                    return Integer.valueOf(iU0);
                default:
                    throw new UnsupportedOperationException(this.f94544a.name());
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, Integer num) {
            int iIntValue;
            int i11;
            if (num == null || (iIntValue = num.intValue()) < this.f94546c || iIntValue > (i11 = this.f94547d)) {
                return false;
            }
            if (iIntValue == i11) {
                int i12 = this.f94545b;
                if (i12 == 5) {
                    return h0Var.y0();
                }
                if (i12 == 7) {
                    return h0Var.z0();
                }
                if (i12 == 9) {
                    return h0Var.f94539d == 0;
                }
                if (i12 == 13) {
                    return h0Var.f94539d % 1000000 == 0;
                }
            }
            if (h0Var.f94536a == 24) {
                switch (this.f94545b) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return iIntValue == 0;
                }
            }
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:22:0x006c A[PHI: r8
          0x006c: PHI (r8v8 int) = (r8v3 int), (r8v4 int), (r8v3 int), (r8v7 int), (r8v3 int) binds: [B:9:0x002d, B:34:0x0087, B:28:0x007a, B:26:0x0075, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x0075 A[PHI: r8
          0x0075: PHI (r8v6 int) = (r8v4 int), (r8v3 int) binds: [B:34:0x0087, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, Integer num, boolean z11) {
            int i11;
            int i12;
            if (num == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (z11) {
                return l(h0Var, num.intValue());
            }
            if (!isValid(h0Var, num)) {
                throw new IllegalArgumentException("Value out of range: " + num);
            }
            int i13 = h0Var.f94536a;
            int i14 = h0Var.f94537b;
            int i15 = h0Var.f94538c;
            int i16 = h0Var.f94539d;
            int iIntValue = num.intValue();
            switch (this.f94545b) {
                case 1:
                    if (iIntValue == 12) {
                        iIntValue = 0;
                    }
                    if (!i(h0Var)) {
                        iIntValue += 12;
                    }
                    i13 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 2:
                    if (iIntValue == 24) {
                        i13 = 0;
                    } else {
                        i13 = iIntValue;
                    }
                    return h0.J0(i13, i14, i15, i16);
                case 3:
                    if (!i(h0Var)) {
                        iIntValue += 12;
                    }
                    i13 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 4:
                case 5:
                    i13 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 6:
                    i14 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 7:
                    i13 = iIntValue / 60;
                    i14 = iIntValue % 60;
                    return h0.J0(i13, i14, i15, i16);
                case 8:
                    i15 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 9:
                    i13 = iIntValue / 3600;
                    int i17 = iIntValue % 3600;
                    i14 = i17 / 60;
                    i15 = i17 % 60;
                    return h0.J0(i13, i14, i15, i16);
                case 10:
                    i11 = iIntValue * 1000000;
                    i12 = h0Var.f94539d % 1000000;
                    i16 = i11 + i12;
                    return h0.J0(i13, i14, i15, i16);
                case 11:
                    i11 = iIntValue * 1000;
                    i12 = h0Var.f94539d % 1000;
                    i16 = i11 + i12;
                    return h0.J0(i13, i14, i15, i16);
                case 12:
                    i16 = iIntValue;
                    return h0.J0(i13, i14, i15, i16);
                case 13:
                    return h0.n0(iIntValue, h0Var.f94539d % 1000000);
                default:
                    throw new UnsupportedOperationException(this.f94544a.name());
            }
        }
    }

    private static class e implements net.time4j.engine.y<h0, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final net.time4j.engine.p<Long> f94548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f94549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f94550c;

        e(net.time4j.engine.p<Long> pVar, long j11, long j12) {
            this.f94548a = pVar;
            this.f94549b = j11;
            this.f94550c = j12;
        }

        private h0 j(h0 h0Var, long j11) {
            if (this.f94548a != h0.E) {
                long jR0 = h0.r0(j11, 86400000000000L);
                return (jR0 != 0 || j11 <= 0) ? h0.o0(jR0) : h0.f94523n;
            }
            long jR1 = h0.r0(j11, 86400000000L);
            int i11 = h0Var.f94539d % 1000;
            return (jR1 == 0 && i11 == 0 && j11 > 0) ? h0.f94523n : h0.m0(jR1, i11);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Long getMaximum(h0 h0Var) {
            return (this.f94548a != h0.E || h0Var.f94539d % 1000 == 0) ? Long.valueOf(this.f94550c) : Long.valueOf(this.f94550c - 1);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long getMinimum(h0 h0Var) {
            return Long.valueOf(this.f94549b);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long getValue(h0 h0Var) {
            return Long.valueOf(this.f94548a == h0.E ? h0Var.u0() / 1000 : h0Var.u0());
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, Long l11) {
            if (l11 == null) {
                return false;
            }
            if (this.f94548a == h0.E && l11.longValue() == this.f94550c) {
                return h0Var.f94539d % 1000 == 0;
            }
            return this.f94549b <= l11.longValue() && l11.longValue() <= this.f94550c;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, Long l11, boolean z11) {
            if (l11 == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (z11) {
                return j(h0Var, l11.longValue());
            }
            if (isValid(h0Var, l11)) {
                long jLongValue = l11.longValue();
                return this.f94548a == h0.E ? h0.m0(jLongValue, h0Var.f94539d % 1000) : h0.o0(jLongValue);
            }
            throw new IllegalArgumentException("Value out of range: " + l11);
        }
    }

    private static class f implements net.time4j.engine.t<h0> {
        private f() {
        }

        private static void e(net.time4j.engine.q<?> qVar, String str) {
            net.time4j.engine.l0 l0Var = net.time4j.engine.l0.ERROR_MESSAGE;
            if (qVar.y(l0Var, str)) {
                qVar.B(l0Var, str);
            }
        }

        private static int i(net.time4j.engine.q<?> qVar) {
            int iP = qVar.p(h0.f94530u);
            if (iP != Integer.MIN_VALUE) {
                return iP;
            }
            int iP2 = qVar.p(h0.f94528s);
            if (iP2 == 0) {
                return -1;
            }
            if (iP2 == 24) {
                return 0;
            }
            if (iP2 != Integer.MIN_VALUE) {
                return iP2;
            }
            c1<a0> c1Var = h0.f94526q;
            if (qVar.n(c1Var)) {
                a0 a0Var = (a0) qVar.s(c1Var);
                int iP3 = qVar.p(h0.f94527r);
                if (iP3 != Integer.MIN_VALUE) {
                    if (iP3 == 0) {
                        return a0Var == a0.AM ? -1 : -2;
                    }
                    int i11 = iP3 != 12 ? iP3 : 0;
                    return a0Var == a0.AM ? i11 : i11 + 12;
                }
                int iP4 = qVar.p(h0.f94529t);
                if (iP4 != Integer.MIN_VALUE) {
                    return a0Var == a0.AM ? iP4 : iP4 + 12;
                }
            }
            return Integer.MIN_VALUE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static h0 k(net.time4j.engine.q<?> qVar) {
            int iIntValue;
            int iIntValue2;
            k0<Long, h0> k0Var = h0.F;
            if (qVar.n(k0Var)) {
                long jLongValue = ((Long) qVar.s(k0Var)).longValue();
                if (jLongValue >= 0 && jLongValue <= 86400000000000L) {
                    return h0.o0(jLongValue);
                }
                e(qVar, "NANO_OF_DAY out of range: " + jLongValue);
                return null;
            }
            k0<Long, h0> k0Var2 = h0.E;
            int i11 = 0;
            if (qVar.n(k0Var2)) {
                k0<Integer, h0> k0Var3 = h0.C;
                return h0.m0(((Long) qVar.s(k0Var2)).longValue(), qVar.n(k0Var3) ? ((Integer) qVar.s(k0Var3)).intValue() % 1000 : 0);
            }
            k0<Integer, h0> k0Var4 = h0.D;
            if (!qVar.n(k0Var4)) {
                k0<Integer, h0> k0Var5 = h0.f94535z;
                if (qVar.n(k0Var5)) {
                    k0<Integer, h0> k0Var6 = h0.C;
                    if (qVar.n(k0Var6)) {
                        iIntValue2 = ((Integer) qVar.s(k0Var6)).intValue();
                    } else {
                        k0<Integer, h0> k0Var7 = h0.B;
                        if (qVar.n(k0Var7)) {
                            iIntValue2 = ((Integer) qVar.s(k0Var7)).intValue() * 1000;
                        } else {
                            k0<Integer, h0> k0Var8 = h0.A;
                            iIntValue2 = qVar.n(k0Var8) ? ((Integer) qVar.s(k0Var8)).intValue() * 1000000 : 0;
                        }
                    }
                    return (h0) h0.J0(0, 0, 0, iIntValue2).B(k0Var5, qVar.s(k0Var5));
                }
                k0<Integer, h0> k0Var9 = h0.f94533x;
                if (!qVar.n(k0Var9)) {
                    return null;
                }
                k0<Integer, h0> k0Var10 = h0.C;
                if (qVar.n(k0Var10)) {
                    iIntValue = ((Integer) qVar.s(k0Var10)).intValue();
                } else {
                    k0<Integer, h0> k0Var11 = h0.B;
                    if (qVar.n(k0Var11)) {
                        iIntValue = ((Integer) qVar.s(k0Var11)).intValue() * 1000;
                    } else {
                        k0<Integer, h0> k0Var12 = h0.A;
                        iIntValue = qVar.n(k0Var12) ? ((Integer) qVar.s(k0Var12)).intValue() * 1000000 : 0;
                    }
                }
                k0<Integer, h0> k0Var13 = h0.f94534y;
                return (h0) h0.J0(0, 0, qVar.n(k0Var13) ? ((Integer) qVar.s(k0Var13)).intValue() : 0, iIntValue).B(k0Var9, qVar.s(k0Var9));
            }
            k0<Integer, h0> k0Var14 = h0.C;
            if (qVar.n(k0Var14)) {
                int iIntValue3 = ((Integer) qVar.s(k0Var14)).intValue();
                if (iIntValue3 < 0 || iIntValue3 >= 1000000000) {
                    e(qVar, "NANO_OF_SECOND out of range: " + iIntValue3);
                    return null;
                }
                i11 = iIntValue3 % 1000000;
            } else {
                k0<Integer, h0> k0Var15 = h0.B;
                if (qVar.n(k0Var15)) {
                    int iIntValue4 = ((Integer) qVar.s(k0Var15)).intValue();
                    if (iIntValue4 < 0 || iIntValue4 >= 1000000) {
                        e(qVar, "MICRO_OF_SECOND out of range: " + iIntValue4);
                        return null;
                    }
                    i11 = iIntValue4 % 1000;
                }
            }
            int iIntValue5 = ((Integer) qVar.s(k0Var4)).intValue();
            if (iIntValue5 >= 0 && iIntValue5 <= 86400000) {
                return h0.n0(iIntValue5, i11);
            }
            e(qVar, "MILLI_OF_DAY out of range: " + iIntValue5);
            return null;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> a() {
            return null;
        }

        @Override // net.time4j.engine.t
        public int c() {
            return g0.q0().c();
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h0 b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            if (qVar instanceof net.time4j.base.f) {
                return ((i0) i0.P().b(qVar, dVar, z11, z12)).U();
            }
            net.time4j.engine.p<?> pVar = h0.f94524o;
            if (qVar.n(pVar)) {
                return (h0) qVar.s(pVar);
            }
            c1<BigDecimal> c1Var = h0.G;
            if (qVar.n(c1Var)) {
                return h0.M0((BigDecimal) qVar.s(c1Var));
            }
            int iP = qVar.p(h0.f94531v);
            if (iP == Integer.MIN_VALUE) {
                iP = i(qVar);
                if (iP == Integer.MIN_VALUE) {
                    return k(qVar);
                }
                if (iP == -1 || iP == -2) {
                    if (!z11) {
                        e(qVar, "Clock hour cannot be zero.");
                        return null;
                    }
                    iP = iP == -1 ? 0 : 12;
                } else if (iP == 24 && !z11) {
                    e(qVar, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.");
                    return null;
                }
            }
            c1<BigDecimal> c1Var2 = h0.H;
            if (qVar.n(c1Var2)) {
                return (h0) h0.M.withValue(h0.F0(iP), qVar.s(c1Var2), false);
            }
            int iP2 = qVar.p(h0.f94532w);
            if (iP2 == Integer.MIN_VALUE) {
                iP2 = 0;
            }
            c1<BigDecimal> c1Var3 = h0.I;
            if (qVar.n(c1Var3)) {
                return (h0) h0.N.withValue(h0.G0(iP, iP2), qVar.s(c1Var3), false);
            }
            int iP3 = qVar.p(h0.f94534y);
            if (iP3 == Integer.MIN_VALUE) {
                iP3 = 0;
            }
            int iP4 = qVar.p(h0.C);
            if (iP4 == Integer.MIN_VALUE) {
                int iP5 = qVar.p(h0.B);
                if (iP5 == Integer.MIN_VALUE) {
                    int iP6 = qVar.p(h0.A);
                    iP4 = iP6 == Integer.MIN_VALUE ? 0 : net.time4j.base.c.h(iP6, 1000000);
                } else {
                    iP4 = net.time4j.base.c.h(iP5, 1000);
                }
            }
            if (z11) {
                long jF = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.f(net.time4j.base.c.f(net.time4j.base.c.i(iP, 3600L), net.time4j.base.c.i(iP2, 60L)), iP3), 1000000000L), iP4);
                long jR0 = h0.r0(jF, 86400000000000L);
                long jQ0 = h0.q0(jF, 86400000000000L);
                if (jQ0 != 0) {
                    net.time4j.engine.p<Long> pVar2 = y.f94832g;
                    if (qVar.x(pVar2, jQ0)) {
                        qVar.A(pVar2, jQ0);
                    }
                }
                return (jR0 != 0 || jQ0 <= 0) ? h0.o0(jR0) : h0.f94523n;
            }
            if ((iP >= 0 && iP2 >= 0 && iP3 >= 0 && iP4 >= 0 && iP == 24 && (iP2 | iP3 | iP4) == 0) || (iP < 24 && iP2 <= 59 && iP3 <= 59 && iP4 <= 1000000000)) {
                return h0.L0(iP, iP2, iP3, iP4, false);
            }
            e(qVar, "Time component out of range.");
            return null;
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.o f(h0 h0Var, net.time4j.engine.d dVar) {
            return h0Var;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 h() {
            return net.time4j.engine.d0.f94117a;
        }

        @Override // net.time4j.engine.t
        public String j(net.time4j.engine.x xVar, Locale locale) {
            return net.time4j.format.b.t(net.time4j.format.e.ofStyle(xVar.getStyleValue()), locale);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g implements net.time4j.engine.y<h0, a0> {
        private g() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return h0.f94529t;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return h0.f94529t;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a0 getMaximum(h0 h0Var) {
            return a0.PM;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a0 getMinimum(h0 h0Var) {
            return a0.AM;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a0 getValue(h0 h0Var) {
            return a0.ofHour(h0Var.f94536a);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, a0 a0Var) {
            return a0Var != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, a0 a0Var, boolean z11) {
            int i11 = h0Var.f94536a == 24 ? 0 : h0Var.f94536a;
            if (a0Var == null) {
                throw new IllegalArgumentException("Missing am/pm-value.");
            }
            if (a0Var == a0.AM) {
                if (i11 >= 12) {
                    i11 -= 12;
                }
            } else if (a0Var == a0.PM && i11 < 12) {
                i11 += 12;
            }
            return h0.J0(i11, h0Var.f94537b, h0Var.f94538c, h0Var.f94539d);
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static class h implements net.time4j.engine.y<h0, net.time4j.h> {
        private h() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.h getMaximum(h0 h0Var) {
            return net.time4j.h.NANOS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.h getMinimum(h0 h0Var) {
            return net.time4j.h.HOURS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.h getValue(h0 h0Var) {
            if (h0Var.f94539d != 0) {
                if (h0Var.f94539d % 1000000 == 0) {
                    return net.time4j.h.MILLIS;
                }
                return h0Var.f94539d % 1000 == 0 ? net.time4j.h.MICROS : net.time4j.h.NANOS;
            }
            if (h0Var.f94538c != 0) {
                return net.time4j.h.SECONDS;
            }
            return h0Var.f94537b != 0 ? net.time4j.h.MINUTES : net.time4j.h.HOURS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, net.time4j.h hVar) {
            return hVar != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, net.time4j.h hVar, boolean z11) {
            if (hVar == null) {
                throw new IllegalArgumentException("Missing precision value.");
            }
            if (hVar.ordinal() < getValue(h0Var).ordinal()) {
                switch (a.f94540a[hVar.ordinal()]) {
                    case 1:
                        return h0.F0(h0Var.f94536a);
                    case 2:
                        return h0.G0(h0Var.f94536a, h0Var.f94537b);
                    case 3:
                        return h0.I0(h0Var.f94536a, h0Var.f94537b, h0Var.f94538c);
                    case 4:
                        return h0.J0(h0Var.f94536a, h0Var.f94537b, h0Var.f94538c, (h0Var.f94539d / 1000000) * 1000000);
                    case 5:
                        return h0.J0(h0Var.f94536a, h0Var.f94537b, h0Var.f94538c, (h0Var.f94539d / 1000) * 1000);
                    case 6:
                        break;
                    default:
                        throw new UnsupportedOperationException(hVar.name());
                }
            }
            return h0Var;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static class i implements net.time4j.engine.y<h0, h0> {
        private i() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(h0 h0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public h0 getMaximum(h0 h0Var) {
            return h0.f94523n;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h0 getMinimum(h0 h0Var) {
            return h0.f94522m;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h0 getValue(h0 h0Var) {
            return h0Var;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(h0 h0Var, h0 h0Var2) {
            return h0Var2 != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public h0 withValue(h0 h0Var, h0 h0Var2, boolean z11) {
            if (h0Var2 != null) {
                return h0Var2;
            }
            throw new IllegalArgumentException("Missing time value.");
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    static {
        f94514e = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? CoreConstants.DOT : CoreConstants.COMMA_CHAR;
        f94515f = new BigDecimal(60);
        f94516g = new BigDecimal(3600);
        f94517h = new BigDecimal(Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        f94518i = new BigDecimal("24");
        f94519j = new BigDecimal("23.999999999999999");
        f94520k = new BigDecimal("59.999999999999999");
        f94521l = new h0[25];
        for (int i11 = 0; i11 <= 24; i11++) {
            f94521l[i11] = new h0(i11, 0, 0, 0, false);
        }
        h0[] h0VarArr = f94521l;
        h0 h0Var = h0VarArr[0];
        f94522m = h0Var;
        h0 h0Var2 = h0VarArr[24];
        f94523n = h0Var2;
        q0 q0Var = q0.f94715a;
        f94524o = q0Var;
        f94525p = q0Var;
        net.time4j.d dVar = net.time4j.d.AM_PM_OF_DAY;
        f94526q = dVar;
        u uVarP = u.p("CLOCK_HOUR_OF_AMPM", false);
        f94527r = uVarP;
        u uVarP2 = u.p("CLOCK_HOUR_OF_DAY", true);
        f94528s = uVarP2;
        u uVarQ = u.q("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
        f94529t = uVarQ;
        u uVarQ2 = u.q("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
        f94530u = uVarQ2;
        u uVarQ3 = u.q("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
        f94531v = uVarQ3;
        u uVarQ4 = u.q("MINUTE_OF_HOUR", 6, 0, 59, 'm');
        f94532w = uVarQ4;
        u uVarQ5 = u.q("MINUTE_OF_DAY", 7, 0, 1439, (char) 0);
        f94533x = uVarQ5;
        u uVarQ6 = u.q("SECOND_OF_MINUTE", 8, 0, 59, 's');
        f94534y = uVarQ6;
        u uVarQ7 = u.q("SECOND_OF_DAY", 9, 0, 86399, (char) 0);
        f94535z = uVarQ7;
        u uVarQ8 = u.q("MILLI_OF_SECOND", 10, 0, 999, (char) 0);
        A = uVarQ8;
        u uVarQ9 = u.q("MICRO_OF_SECOND", 11, 0, 999999, (char) 0);
        B = uVarQ9;
        u uVarQ10 = u.q("NANO_OF_SECOND", 12, 0, 999999999, 'S');
        C = uVarQ10;
        u uVarQ11 = u.q("MILLI_OF_DAY", 13, 0, 86399999, 'A');
        D = uVarQ11;
        y yVarP = y.p("MICRO_OF_DAY", 0L, 86399999999L);
        E = yVarP;
        y yVarP2 = y.p("NANO_OF_DAY", 0L, 86399999999999L);
        F = yVarP2;
        m mVar = new m("DECIMAL_HOUR", f94519j);
        G = mVar;
        BigDecimal bigDecimal = f94520k;
        m mVar2 = new m("DECIMAL_MINUTE", bigDecimal);
        H = mVar2;
        m mVar3 = new m("DECIMAL_SECOND", bigDecimal);
        I = mVar3;
        net.time4j.engine.p<net.time4j.h> pVar = j0.f94662d;
        J = pVar;
        HashMap map = new HashMap();
        p0(map, q0Var);
        p0(map, dVar);
        p0(map, uVarP);
        p0(map, uVarP2);
        p0(map, uVarQ);
        p0(map, uVarQ2);
        p0(map, uVarQ3);
        p0(map, uVarQ4);
        p0(map, uVarQ5);
        p0(map, uVarQ6);
        p0(map, uVarQ7);
        p0(map, uVarQ8);
        p0(map, uVarQ9);
        p0(map, uVarQ10);
        p0(map, uVarQ11);
        p0(map, yVarP);
        p0(map, yVarP2);
        p0(map, mVar);
        p0(map, mVar2);
        p0(map, mVar3);
        K = Collections.unmodifiableMap(map);
        b bVar = new b(mVar, f94518i);
        L = bVar;
        b bVar2 = new b(mVar2, bigDecimal);
        M = bVar2;
        b bVar3 = new b(mVar3, bigDecimal);
        N = bVar3;
        net.time4j.engine.f0.b bVarK = net.time4j.engine.f0.b.k(w.class, h0.class, new f(null), h0Var, h0Var2);
        a aVar = null;
        net.time4j.engine.f0.b bVarD = bVarK.d(q0Var, new i(aVar)).d(dVar, new g(aVar));
        d dVar2 = new d(uVarP, 1, 12);
        net.time4j.h hVar = net.time4j.h.HOURS;
        net.time4j.engine.f0.b bVarE = bVarD.e(uVarP, dVar2, hVar).e(uVarP2, new d(uVarP2, 1, 24), hVar).e(uVarQ, new d(uVarQ, 0, 11), hVar).e(uVarQ2, new d(uVarQ2, 0, 23), hVar).e(uVarQ3, new d(uVarQ3, 0, 24), hVar);
        d dVar3 = new d(uVarQ4, 0, 59);
        net.time4j.h hVar2 = net.time4j.h.MINUTES;
        net.time4j.engine.f0.b bVarE2 = bVarE.e(uVarQ4, dVar3, hVar2).e(uVarQ5, new d(uVarQ5, 0, 1440), hVar2);
        d dVar4 = new d(uVarQ6, 0, 59);
        net.time4j.h hVar3 = net.time4j.h.SECONDS;
        net.time4j.engine.f0.b bVarE3 = bVarE2.e(uVarQ6, dVar4, hVar3).e(uVarQ7, new d(uVarQ7, 0, Strategy.TTL_SECONDS_MAX), hVar3);
        d dVar5 = new d(uVarQ8, 0, 999);
        net.time4j.h hVar4 = net.time4j.h.MILLIS;
        net.time4j.engine.f0.b bVarE4 = bVarE3.e(uVarQ8, dVar5, hVar4);
        d dVar6 = new d(uVarQ9, 0, 999999);
        net.time4j.h hVar5 = net.time4j.h.MICROS;
        net.time4j.engine.f0.b bVarE5 = bVarE4.e(uVarQ9, dVar6, hVar5);
        d dVar7 = new d(uVarQ10, 0, 999999999);
        net.time4j.h hVar6 = net.time4j.h.NANOS;
        net.time4j.engine.f0.b bVarD2 = bVarE5.e(uVarQ10, dVar7, hVar6).e(uVarQ11, new d(uVarQ11, 0, 86400000), hVar4).e(yVarP, new e(yVarP, 0L, 86400000000L), hVar5).e(yVarP2, new e(yVarP2, 0L, 86400000000000L), hVar6).d(mVar, bVar).d(mVar2, bVar2).d(mVar3, bVar3).d(pVar, new h(null));
        O0(bVarD2);
        P0(bVarD2);
        O = bVarD2.h();
    }

    private h0(int i11, int i12, int i13, int i14, boolean z11) {
        if (z11) {
            h0(i11);
            i0(i12);
            k0(i13);
            j0(i14);
            if (i11 == 24 && (i12 | i13 | i14) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f94536a = (byte) i11;
        this.f94537b = (byte) i12;
        this.f94538c = (byte) i13;
        this.f94539d = i14;
    }

    static Object C0(String str) {
        return K.get(str);
    }

    public static h0 D0() {
        return f94523n;
    }

    public static h0 E0() {
        return f94522m;
    }

    public static h0 F0(int i11) {
        h0(i11);
        return f94521l[i11];
    }

    public static h0 G0(int i11, int i12) {
        return i12 == 0 ? F0(i11) : new h0(i11, i12, 0, 0, true);
    }

    public static h0 I0(int i11, int i12, int i13) {
        return (i12 | i13) == 0 ? F0(i11) : new h0(i11, i12, i13, 0, true);
    }

    public static h0 J0(int i11, int i12, int i13, int i14) {
        return L0(i11, i12, i13, i14, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 L0(int i11, int i12, int i13, int i14, boolean z11) {
        if ((i12 | i13 | i14) == 0) {
            return z11 ? F0(i11) : f94521l[i11];
        }
        return new h0(i11, i12, i13, i14, z11);
    }

    public static h0 M0(BigDecimal bigDecimal) {
        return L.withValue(null, bigDecimal, false);
    }

    static void N0(StringBuilder sb2, int i11) {
        sb2.append(f94514e);
        String string = Integer.toString(i11);
        int i12 = i11 % 1000000 == 0 ? 3 : i11 % 1000 == 0 ? 6 : 9;
        for (int length = string.length(); length < 9; length++) {
            sb2.append('0');
        }
        int length2 = (i12 + string.length()) - 9;
        for (int i13 = 0; i13 < length2; i13++) {
            sb2.append(string.charAt(i13));
        }
    }

    private static void O0(net.time4j.engine.f0.b<w, h0> bVar) {
        for (net.time4j.engine.r rVar : net.time4j.base.d.c().g(net.time4j.engine.r.class)) {
            if (rVar.c(h0.class)) {
                bVar.f(rVar);
            }
        }
        bVar.f(new l.c());
    }

    private static void P0(net.time4j.engine.f0.b<w, h0> bVar) {
        Set<? extends w> setAllOf = EnumSet.allOf(net.time4j.h.class);
        for (net.time4j.h hVar : net.time4j.h.values()) {
            bVar.g(hVar, new c(hVar, null), hVar.getLength(), setAllOf);
        }
    }

    private static void f0(int i11, StringBuilder sb2) {
        if (i11 < 10) {
            sb2.append('0');
        }
        sb2.append(i11);
    }

    public static net.time4j.engine.f0<w, h0> g0() {
        return O;
    }

    private static void h0(long j11) {
        if (j11 < 0 || j11 > 24) {
            throw new IllegalArgumentException("HOUR_OF_DAY out of range: " + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i0(long j11) {
        if (j11 < 0 || j11 > 59) {
            throw new IllegalArgumentException("MINUTE_OF_HOUR out of range: " + j11);
        }
    }

    private static void j0(int i11) {
        if (i11 < 0 || i11 >= 1000000000) {
            throw new IllegalArgumentException("NANO_OF_SECOND out of range: " + i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k0(long j11) {
        if (j11 < 0 || j11 > 59) {
            throw new IllegalArgumentException("SECOND_OF_MINUTE out of range: " + j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 m0(long j11, int i11) {
        int i12 = (((int) (j11 % 1000000)) * 1000) + i11;
        int i13 = (int) (j11 / 1000000);
        int i14 = i13 % 60;
        int i15 = i13 / 60;
        return J0(i15 / 60, i15 % 60, i14, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 n0(int i11, int i12) {
        int i13 = ((i11 % 1000) * 1000000) + i12;
        int i14 = i11 / 1000;
        int i15 = i14 % 60;
        int i16 = i14 / 60;
        return J0(i16 / 60, i16 % 60, i15, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h0 o0(long j11) {
        int i11 = (int) (j11 % 1000000000);
        int i12 = (int) (j11 / 1000000000);
        int i13 = i12 % 60;
        int i14 = i12 / 60;
        return J0(i14 / 60, i14 % 60, i13, i11);
    }

    private static void p0(Map<String, Object> map, net.time4j.engine.p<?> pVar) {
        map.put(pVar.name(), pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long q0(long j11, long j12) {
        return j11 >= 0 ? j11 / j12 : ((j11 + 1) / j12) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long r0(long j11, long j12) {
        return j11 - (j12 * (j11 >= 0 ? j11 / j12 : ((j11 + 1) / j12) - 1));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long u0() {
        return ((long) this.f94539d) + (((long) this.f94538c) * 1000000000) + (((long) this.f94537b) * 60000000000L) + (((long) this.f94536a) * 3600000000000L);
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y0() {
        return ((this.f94537b | this.f94538c) | this.f94539d) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z0() {
        return (this.f94538c | this.f94539d) == 0;
    }

    public boolean A0() {
        return y0() && this.f94536a % 24 == 0;
    }

    public boolean B0(h0 h0Var) {
        return compareTo(h0Var) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* JADX INFO: renamed from: E */
    public net.time4j.engine.f0<w, h0> t() {
        return O;
    }

    public k Q0(long j11, net.time4j.h hVar) {
        return c.e(this, j11, hVar);
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f94539d;
    }

    @Override // net.time4j.base.g
    public int c() {
        return this.f94536a;
    }

    @Override // net.time4j.base.g
    public int d() {
        return this.f94538c;
    }

    @Override // net.time4j.base.g
    public int e() {
        return this.f94537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (this.f94536a == h0Var.f94536a && this.f94537b == h0Var.f94537b && this.f94538c == h0Var.f94538c && this.f94539d == h0Var.f94539d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f94536a + (this.f94537b * 60) + (this.f94538c * Tnaf.POW_2_WIDTH) + (this.f94539d * 37);
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public int compareTo(h0 h0Var) {
        int i11 = this.f94536a - h0Var.f94536a;
        if (i11 == 0 && (i11 = this.f94537b - h0Var.f94537b) == 0 && (i11 = this.f94538c - h0Var.f94538c) == 0) {
            i11 = this.f94539d - h0Var.f94539d;
        }
        if (i11 < 0) {
            return -1;
        }
        return i11 == 0 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public h0 u() {
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        f0(this.f94536a, sb2);
        if ((this.f94537b | this.f94538c | this.f94539d) != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            f0(this.f94537b, sb2);
            if ((this.f94538c | this.f94539d) != 0) {
                sb2.append(CoreConstants.COLON_CHAR);
                f0(this.f94538c, sb2);
                int i11 = this.f94539d;
                if (i11 != 0) {
                    N0(sb2, i11);
                }
            }
        }
        return sb2.toString();
    }

    boolean v0(net.time4j.engine.p<?> pVar) {
        if (pVar == D && this.f94539d % 1000000 != 0) {
            return true;
        }
        if (pVar == f94531v && !y0()) {
            return true;
        }
        if (pVar == f94533x && !z0()) {
            return true;
        }
        if (pVar != f94535z || this.f94539d == 0) {
            return pVar == E && this.f94539d % 1000 != 0;
        }
        return true;
    }

    public boolean w0(h0 h0Var) {
        return compareTo(h0Var) > 0;
    }

    public boolean x0(h0 h0Var) {
        return compareTo(h0Var) < 0;
    }
}
