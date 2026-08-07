package net.time4j;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.ChronoException;
import okhttp3.internal.http2.Http2Connection;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
@net.time4j.format.c("iso8601")
public final class b0 extends net.time4j.engine.i0<TimeUnit, b0> implements fp0.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f93952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f93953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b0 f93954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b0 f93955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b0 f93956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<net.time4j.engine.p<?>> f93957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<net.time4j.engine.p<?>, Integer> f93958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<TimeUnit, Double> f93959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final net.time4j.engine.f0<TimeUnit, b0> f93960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b0 f93961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final net.time4j.engine.p<Long> f93962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final net.time4j.engine.p<Integer> f93963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final net.time4j.engine.p<TimeUnit> f93964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final net.time4j.engine.u<b0> f93965p;
    private static final long serialVersionUID = -3192884724477742274L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient long f93966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f93967b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f93969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f93970c;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f93970c = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93970c[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93970c[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93970c[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93970c[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93970c[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93970c[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[n0.values().length];
            f93969b = iArr2;
            try {
                iArr2[n0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f93969b[n0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[fp0.f.values().length];
            f93968a = iArr3;
            try {
                iArr3[fp0.f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f93968a[fp0.f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f93968a[fp0.f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f93968a[fp0.f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f93968a[fp0.f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f93968a[fp0.f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    private static class b implements net.time4j.engine.g0<b0> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b0 b0Var, b0 b0Var2) {
            return b0Var.compareTo(b0Var2);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private enum c implements net.time4j.engine.p<Integer>, net.time4j.engine.y<b0, Integer> {
        FRACTION;

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return null;
        }

        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.p
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            return ((Integer) oVar.s(this)).compareTo((Integer) oVar2.s(this));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: getDefaultMaximum */
        public Integer s() {
            return 999999999;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: getDefaultMinimum */
        public Integer t() {
            return 0;
        }

        @Override // net.time4j.engine.y
        public Integer getMaximum(b0 b0Var) {
            return s();
        }

        @Override // net.time4j.engine.y
        public Integer getMinimum(b0 b0Var) {
            return t();
        }

        @Override // net.time4j.engine.y
        public Integer getValue(b0 b0Var) {
            return Integer.valueOf(b0Var.a());
        }

        @Override // net.time4j.engine.y
        public boolean isValid(b0 b0Var, Integer num) {
            int iIntValue;
            return num != null && (iIntValue = num.intValue()) >= 0 && iIntValue < 1000000000;
        }

        @Override // net.time4j.engine.y
        public b0 withValue(b0 b0Var, Integer num, boolean z11) {
            if (num == null) {
                throw new IllegalArgumentException("Missing fraction value.");
            }
            if (!fp0.d.n().r()) {
                return b0.k0(b0Var.l(), num.intValue(), fp0.f.POSIX);
            }
            fp0.f fVar = fp0.f.UTC;
            return b0.k0(b0Var.i(fVar), num.intValue(), fVar);
        }
    }

    private enum d implements net.time4j.engine.p<Long>, net.time4j.engine.y<b0, Long> {
        POSIX_TIME;

        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.p
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.p
        public Class<Long> getType() {
            return Long.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
            return ((Long) oVar.s(this)).compareTo((Long) oVar2.s(this));
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return c.FRACTION;
        }

        @Override // net.time4j.engine.y
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return c.FRACTION;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: getDefaultMaximum */
        public Long s() {
            return Long.valueOf(b0.f93953d);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: getDefaultMinimum */
        public Long t() {
            return Long.valueOf(b0.f93952c);
        }

        @Override // net.time4j.engine.y
        public Long getMaximum(b0 b0Var) {
            return Long.valueOf(b0.f93953d);
        }

        @Override // net.time4j.engine.y
        public Long getMinimum(b0 b0Var) {
            return Long.valueOf(b0.f93952c);
        }

        @Override // net.time4j.engine.y
        public Long getValue(b0 b0Var) {
            return Long.valueOf(b0Var.l());
        }

        @Override // net.time4j.engine.y
        public boolean isValid(b0 b0Var, Long l11) {
            if (l11 == null) {
                return false;
            }
            long jLongValue = l11.longValue();
            return jLongValue >= b0.f93952c && jLongValue <= b0.f93953d;
        }

        @Override // net.time4j.engine.y
        public b0 withValue(b0 b0Var, Long l11, boolean z11) {
            if (l11 != null) {
                return b0.k0(l11.longValue(), b0Var.a(), fp0.f.POSIX);
            }
            throw new IllegalArgumentException("Missing elapsed seconds.");
        }
    }

    private static class e implements net.time4j.engine.t<b0> {
        private e() {
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.w<?> a() {
            return i0.P();
        }

        @Override // net.time4j.engine.t
        public int c() {
            return g0.q0().c();
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b0 b(net.time4j.engine.q<?> qVar, net.time4j.engine.d dVar, boolean z11, boolean z12) {
            net.time4j.tz.k kVarG;
            b0 b0VarV;
            fp0.f fVar = (fp0.f) dVar.b(net.time4j.format.a.f94192w, fp0.f.UTC);
            if (qVar instanceof net.time4j.base.f) {
                return b0.X((net.time4j.base.f) net.time4j.base.f.class.cast(qVar)).u0(fVar);
            }
            d dVar2 = d.POSIX_TIME;
            int i11 = 0;
            if (qVar.n(dVar2)) {
                long jLongValue = ((Long) qVar.s(dVar2)).longValue();
                c cVar = c.FRACTION;
                return b0.k0(jLongValue, qVar.n(cVar) ? ((Integer) qVar.s(cVar)).intValue() : 0, fp0.f.POSIX).u0(fVar);
            }
            if (qVar.n(net.time4j.engine.a0.LEAP_SECOND)) {
                qVar.z(h0.f94534y, 60);
                i11 = 1;
            }
            net.time4j.engine.p<?> pVarD = i0.P().D();
            i0 i0Var = qVar.n(pVarD) ? (i0) qVar.s(pVarD) : (i0) i0.P().b(qVar, dVar, z11, z12);
            a aVar = null;
            if (i0Var == null) {
                return null;
            }
            if (qVar.j()) {
                kVarG = qVar.g();
            } else {
                net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f94173d;
                kVarG = dVar.c(cVar2) ? (net.time4j.tz.k) dVar.a(cVar2) : null;
            }
            if (kVarG != null) {
                net.time4j.engine.a0 a0Var = net.time4j.engine.a0.DAYLIGHT_SAVING;
                if (qVar.n(a0Var)) {
                    b0VarV = i0Var.V(net.time4j.tz.l.N(kVarG).Q(((net.time4j.tz.o) dVar.b(net.time4j.format.a.f94174e, net.time4j.tz.l.f94761d)).b(((Boolean) qVar.s(a0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)));
                } else {
                    net.time4j.engine.c<net.time4j.tz.o> cVar3 = net.time4j.format.a.f94174e;
                    b0VarV = dVar.c(cVar3) ? i0Var.V(net.time4j.tz.l.N(kVarG).Q((net.time4j.tz.o) dVar.a(cVar3))) : i0Var.W(kVarG);
                }
            } else {
                b0VarV = null;
            }
            if (b0VarV == null) {
                return null;
            }
            if (i11 != 0) {
                net.time4j.tz.p pVarB = kVarG instanceof net.time4j.tz.p ? (net.time4j.tz.p) kVarG : net.time4j.tz.l.N(kVarG).B(b0VarV);
                if (pVarB.i() != 0 || pVarB.h() % 60 != 0) {
                    throw new IllegalArgumentException("Leap second is only allowed  with timezone-offset in full minutes: " + pVarB);
                }
                b0 b0VarM0 = b0VarV.Z().b() >= 1972 ? b0VarV.m0(1L, n0.SECONDS) : new b0(b0VarV.a(), b0VarV.l() + 1, aVar);
                if (z11) {
                    b0VarV = b0VarM0;
                } else if (fp0.d.n().r()) {
                    if (!b0VarM0.j0()) {
                        throw new IllegalArgumentException("SECOND_OF_MINUTE parsed as invalid leapsecond before " + b0VarM0);
                    }
                    b0VarV = b0VarM0;
                }
            }
            return b0VarV.u0(fVar);
        }

        @Override // net.time4j.engine.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.o f(b0 b0Var, net.time4j.engine.d dVar) {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f94173d;
            if (!dVar.c(cVar)) {
                throw new IllegalArgumentException("Cannot print moment without timezone.");
            }
            return b0Var.v0((fp0.f) dVar.b(net.time4j.format.a.f94192w, fp0.f.UTC)).f0((net.time4j.tz.k) dVar.a(cVar));
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.d0 h() {
            return net.time4j.engine.d0.f94117a;
        }

        @Override // net.time4j.engine.t
        public String j(net.time4j.engine.x xVar, Locale locale) {
            net.time4j.format.e eVarOfStyle = net.time4j.format.e.ofStyle(xVar.getStyleValue());
            return net.time4j.format.b.s(eVarOfStyle, eVarOfStyle, locale);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static class f implements net.time4j.engine.u<b0> {
        private f() {
        }

        @Override // net.time4j.engine.u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 apply(b0 b0Var) {
            fp0.b bVarO;
            fp0.d dVarN = fp0.d.n();
            if (!dVarN.r() || (bVarO = dVarN.o(b0Var.i(fp0.f.UTC))) == null) {
                return null;
            }
            return g0.w0(bVarO.getDate()).p0(23, 59, 59).O().m0(bVarO.a(), n0.SECONDS);
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static class g implements net.time4j.engine.y<b0, TimeUnit> {
        private g() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(b0 b0Var) {
            return null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TimeUnit getMaximum(b0 b0Var) {
            return TimeUnit.NANOSECONDS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public TimeUnit getMinimum(b0 b0Var) {
            return TimeUnit.DAYS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public TimeUnit getValue(b0 b0Var) {
            int iA = b0Var.a();
            if (iA != 0) {
                if (iA % 1000000 == 0) {
                    return TimeUnit.MILLISECONDS;
                }
                return iA % 1000 == 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
            }
            long j11 = b0Var.f93966a;
            if (net.time4j.base.c.d(j11, Strategy.TTL_SECONDS_MAX) == 0) {
                return TimeUnit.DAYS;
            }
            if (net.time4j.base.c.d(j11, 3600) == 0) {
                return TimeUnit.HOURS;
            }
            return net.time4j.base.c.d(j11, 60) == 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(b0 b0Var, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b0 withValue(b0 b0Var, TimeUnit timeUnit, boolean z11) {
            b0 b0VarK0;
            if (timeUnit == null) {
                throw new IllegalArgumentException("Missing precision.");
            }
            switch (a.f93970c[timeUnit.ordinal()]) {
                case 1:
                    return b0.l0(net.time4j.base.c.b(b0Var.f93966a, Strategy.TTL_SECONDS_MAX) * 86400, fp0.f.POSIX);
                case 2:
                    return b0.l0(net.time4j.base.c.b(b0Var.f93966a, 3600) * 3600, fp0.f.POSIX);
                case 3:
                    return b0.l0(net.time4j.base.c.b(b0Var.f93966a, 60) * 60, fp0.f.POSIX);
                case 4:
                    b0VarK0 = b0.k0(b0Var.f93966a, 0, fp0.f.POSIX);
                    break;
                case 5:
                    b0VarK0 = b0.k0(b0Var.f93966a, (b0Var.a() / 1000000) * 1000000, fp0.f.POSIX);
                    break;
                case 6:
                    b0VarK0 = b0.k0(b0Var.f93966a, (b0Var.a() / 1000) * 1000, fp0.f.POSIX);
                    break;
                case 7:
                    return b0Var;
                default:
                    throw new UnsupportedOperationException(timeUnit.name());
            }
            return (b0Var.i0() && fp0.d.n().r()) ? b0VarK0.m0(1L, n0.SECONDS) : b0VarK0;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static class h implements net.time4j.engine.k0<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TimeUnit f93971a;

        h(TimeUnit timeUnit) {
            this.f93971a = timeUnit;
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b0 b(b0 b0Var, long j11) {
            if (this.f93971a.compareTo(TimeUnit.SECONDS) >= 0) {
                return b0.k0(net.time4j.base.c.f(b0Var.l(), net.time4j.base.c.i(j11, this.f93971a.toSeconds(1L))), b0Var.a(), fp0.f.POSIX);
            }
            long jF = net.time4j.base.c.f(b0Var.a(), net.time4j.base.c.i(j11, this.f93971a.toNanos(1L)));
            return b0.k0(net.time4j.base.c.f(b0Var.l(), net.time4j.base.c.b(jF, Http2Connection.DEGRADED_PONG_TIMEOUT_NS)), net.time4j.base.c.d(jF, Http2Connection.DEGRADED_PONG_TIMEOUT_NS), fp0.f.POSIX);
        }

        @Override // net.time4j.engine.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(b0 b0Var, b0 b0Var2) {
            long jF;
            if (this.f93971a.compareTo(TimeUnit.SECONDS) >= 0) {
                jF = b0Var2.l() - b0Var.l();
                if (jF < 0) {
                    if (b0Var2.a() > b0Var.a()) {
                        jF++;
                    }
                } else if (jF > 0 && b0Var2.a() < b0Var.a()) {
                    jF--;
                }
            } else {
                jF = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(b0Var2.l(), b0Var.l()), 1000000000L), b0Var2.a() - b0Var.a());
            }
            switch (a.f93970c[this.f93971a.ordinal()]) {
                case 1:
                    return jF / 86400;
                case 2:
                    return jF / 3600;
                case 3:
                    return jF / 60;
                case 4:
                case 7:
                    return jF;
                case 5:
                    return jF / 1000000;
                case 6:
                    return jF / 1000;
                default:
                    throw new UnsupportedOperationException(this.f93971a.name());
            }
        }
    }

    static {
        long j11 = net.time4j.base.b.j(-999999999, 1, 1);
        long j12 = net.time4j.base.b.j(999999999, 12, 31);
        net.time4j.engine.z zVar = net.time4j.engine.z.UNIX;
        net.time4j.engine.z zVar2 = net.time4j.engine.z.MODIFIED_JULIAN_DATE;
        long jTransform = zVar.transform(j11, zVar2) * 86400;
        f93952c = jTransform;
        long jTransform2 = (zVar.transform(j12, zVar2) * 86400) + 86399;
        f93953d = jTransform2;
        fp0.f fVar = fp0.f.POSIX;
        b0 b0Var = new b0(jTransform, 0, fVar);
        f93954e = b0Var;
        b0 b0Var2 = new b0(jTransform2, 999999999, fVar);
        f93955f = b0Var2;
        f93956g = new b0(63158400L, 0, fVar);
        HashSet hashSet = new HashSet();
        hashSet.add(h0.f94531v);
        hashSet.add(h0.f94530u);
        hashSet.add(h0.f94529t);
        hashSet.add(h0.f94528s);
        hashSet.add(h0.f94527r);
        hashSet.add(h0.f94526q);
        hashSet.add(h0.f94532w);
        hashSet.add(h0.f94533x);
        f93957h = Collections.unmodifiableSet(hashSet);
        HashMap map = new HashMap();
        map.put(h0.f94534y, 1);
        map.put(h0.f94535z, 1);
        map.put(h0.A, 1000);
        map.put(h0.D, 1000);
        map.put(h0.B, 1000000);
        map.put(h0.E, 1000000);
        k0<Integer, h0> k0Var = h0.C;
        Integer numValueOf = Integer.valueOf(Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        map.put(k0Var, numValueOf);
        map.put(h0.F, numValueOf);
        f93958i = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put(TimeUnit.DAYS, Double.valueOf(86400.0d));
        enumMap.put(TimeUnit.HOURS, Double.valueOf(3600.0d));
        enumMap.put(TimeUnit.MINUTES, Double.valueOf(60.0d));
        enumMap.put(TimeUnit.SECONDS, Double.valueOf(1.0d));
        enumMap.put(TimeUnit.MILLISECONDS, Double.valueOf(0.001d));
        enumMap.put(TimeUnit.MICROSECONDS, Double.valueOf(1.0E-6d));
        enumMap.put(TimeUnit.NANOSECONDS, Double.valueOf(1.0E-9d));
        f93959j = Collections.unmodifiableMap(enumMap);
        a aVar = null;
        net.time4j.engine.f0.b bVarK = net.time4j.engine.f0.b.k(TimeUnit.class, b0.class, new e(aVar), b0Var, b0Var2);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            h hVar = new h(timeUnit);
            Map<TimeUnit, Double> map2 = f93959j;
            bVarK.g(timeUnit, hVar, map2.get(timeUnit).doubleValue(), map2.keySet());
        }
        d dVar = d.POSIX_TIME;
        bVarK.e(dVar, dVar, TimeUnit.SECONDS);
        c cVar = c.FRACTION;
        bVarK.e(cVar, cVar, TimeUnit.NANOSECONDS);
        net.time4j.engine.p<TimeUnit> pVar = j0.f94663e;
        bVarK.d(pVar, new g(aVar));
        f93960k = bVarK.l(new b(aVar)).h();
        f93961l = new b0(0L, 0, fp0.f.POSIX);
        f93962m = dVar;
        f93963n = cVar;
        f93964o = pVar;
        f93965p = new f(aVar);
    }

    /* synthetic */ b0(int i11, long j11, a aVar) {
        this(i11, j11);
    }

    public static net.time4j.engine.f0<TimeUnit, b0> Q() {
        return f93960k;
    }

    static void R(b0 b0Var) {
        if (b0Var.f93966a < 63072000) {
            throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
        }
    }

    private static void S(int i11) {
        if (i11 >= 1000000000 || i11 < 0) {
            throw new IllegalArgumentException("Nanosecond out of range: " + i11);
        }
    }

    static void T(long j11, i0 i0Var) {
        fp0.d dVarN = fp0.d.n();
        if (!dVarN.u() || dVarN.t(dVarN.f(j11)) <= j11) {
            return;
        }
        throw new ChronoException("Illegal local timestamp due to negative leap second: " + i0Var);
    }

    private static void U(long j11) {
        if (j11 > f93953d || j11 < f93952c) {
            throw new IllegalArgumentException("UNIX time (UT) out of supported range: " + j11);
        }
    }

    private static void W(int i11, int i12, StringBuilder sb2) {
        int i13 = 1;
        for (int i14 = 0; i14 < i12 - 1; i14++) {
            i13 *= 10;
        }
        while (i11 < i13 && i13 >= 10) {
            sb2.append('0');
            i13 /= 10;
        }
        sb2.append(String.valueOf(i11));
    }

    public static b0 X(net.time4j.base.f fVar) {
        if (fVar instanceof b0) {
            return (b0) b0.class.cast(fVar);
        }
        if (!(fVar instanceof fp0.g) || !fp0.d.n().r()) {
            return k0(fVar.l(), fVar.a(), fp0.f.POSIX);
        }
        fp0.g gVar = (fp0.g) fp0.g.class.cast(fVar);
        fp0.f fVar2 = fp0.f.UTC;
        return k0(gVar.i(fVar2), gVar.m(fVar2), fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g0 Z() {
        return g0.O0(net.time4j.base.c.b(this.f93966a, Strategy.TTL_SECONDS_MAX), net.time4j.engine.z.UNIX);
    }

    private long a0() {
        if (!fp0.d.n().r()) {
            return this.f93966a - 63072000;
        }
        long jF = fp0.d.n().f(this.f93966a);
        return j0() ? jF + 1 : jF;
    }

    private double b0() {
        double dA0 = ((a0() + 42.184d) + (((double) a()) / 1.0E9d)) - fp0.f.deltaT(Z());
        long jFloor = (long) Math.floor(dA0);
        return Double.compare(1.0E9d - ((dA0 - ((double) jFloor)) * 1.0E9d), 1.0d) < 0 ? jFloor + 1 : dA0;
    }

    private static int d0(b0 b0Var) {
        return net.time4j.base.c.d(b0Var.f93966a, Strategy.TTL_SECONDS_MAX);
    }

    private i0 e0(net.time4j.tz.l lVar) {
        return i0.R(this, lVar.B(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return (this.f93967b >>> 30) != 0;
    }

    public static b0 k0(long j11, int i11, fp0.f fVar) {
        return (j11 == 0 && i11 == 0 && fVar == fp0.f.POSIX) ? f93961l : new b0(j11, i11, fVar);
    }

    public static b0 l0(long j11, fp0.f fVar) {
        return k0(j11, 0, fVar);
    }

    static b0 n0(DataInput dataInput, boolean z11, boolean z12) throws IOException {
        long j11 = dataInput.readLong();
        int i11 = z12 ? dataInput.readInt() : 0;
        if (j11 == 0) {
            if (z11) {
                throw new InvalidObjectException("UTC epoch is no leap second.");
            }
            if (i11 == 0) {
                return f93961l;
            }
        }
        if (j11 == f93952c && i11 == 0) {
            if (z11) {
                throw new InvalidObjectException("Minimum is no leap second.");
            }
            return f93954e;
        }
        if (j11 == f93953d && i11 == 999999999) {
            if (z11) {
                throw new InvalidObjectException("Maximum is no leap second.");
            }
            return f93955f;
        }
        S(i11);
        if (z11) {
            fp0.d dVarN = fp0.d.n();
            if (dVarN.r() && !dVarN.s(dVarN.f(j11) + 1)) {
                long jL = net.time4j.base.b.l(j11);
                int iH = net.time4j.base.b.h(jL);
                int iG = net.time4j.base.b.g(jL);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not registered as leap second event: ");
                sb2.append(net.time4j.base.b.i(jL));
                sb2.append("-");
                sb2.append(iH < 10 ? WebrtcBuildVersion.maint_version : "");
                sb2.append(iH);
                sb2.append(iG < 10 ? WebrtcBuildVersion.maint_version : "");
                sb2.append(iG);
                sb2.append(" [Please check leap second configurations ");
                sb2.append("either of emitter vm or this target vm]");
                throw new InvalidObjectException(sb2.toString());
            }
            i11 |= 1073741824;
        }
        return new b0(i11, j11);
    }

    private static int q0(double d11, long j11) {
        try {
            return (int) ((d11 * 1.0E9d) - net.time4j.base.c.i(j11, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d11 - j11) * 1.0E9d);
        }
    }

    private String r0(boolean z11) {
        g0 g0VarZ = Z();
        int iD0 = d0(this);
        int i11 = iD0 / 60;
        int i12 = i11 / 60;
        int i13 = i11 % 60;
        int iP = (iD0 % 60) + fp0.d.n().p(a0());
        int iA = a();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(g0VarZ);
        sb2.append('T');
        W(i12, 2, sb2);
        if (z11 || (i13 | iP | iA) != 0) {
            sb2.append(CoreConstants.COLON_CHAR);
            W(i13, 2, sb2);
            if (z11 || (iP | iA) != 0) {
                sb2.append(CoreConstants.COLON_CHAR);
                W(iP, 2, sb2);
                if (iA > 0) {
                    sb2.append(CoreConstants.COMMA_CHAR);
                    W(iA, 9, sb2);
                }
            }
        }
        sb2.append('Z');
        return sb2.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 u0(fp0.f fVar) {
        if (fVar != fp0.f.UTC) {
            if (i0()) {
                throw new IllegalArgumentException("Leap seconds do not exist on continuous time scale: " + fVar);
            }
            int i11 = a.f93968a[fVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 3) {
                    return new b0(net.time4j.base.c.m(this.f93966a, -378691200L), a(), fVar);
                }
                if (i11 == 4) {
                    return new b0(net.time4j.base.c.m(this.f93966a, 315964800L), a(), fVar);
                }
                if (i11 == 5 || i11 == 6) {
                    return new b0(net.time4j.base.c.m(this.f93966a, 63072000L), a(), fVar);
                }
                throw new UnsupportedOperationException(fVar.name());
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 v0(fp0.f fVar) {
        switch (a.f93968a[fVar.ordinal()]) {
            case 1:
                if (i0()) {
                    return new b0(a(), this.f93966a);
                }
            case 2:
                return this;
            case 3:
                return new b0(m(fVar), net.time4j.base.c.f(i(fVar), -378691200L));
            case 4:
                return new b0(a(), net.time4j.base.c.f(i(fp0.f.GPS), 315964800L));
            case 5:
            case 6:
                return new b0(m(fVar), net.time4j.base.c.f(i(fVar), 63072000L));
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.i0, net.time4j.engine.q
    /* JADX INFO: renamed from: E */
    public net.time4j.engine.f0<TimeUnit, b0> t() {
        return f93960k;
    }

    @Override // net.time4j.engine.i0, java.lang.Comparable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public int compareTo(b0 b0Var) {
        int iA;
        long jA0 = a0();
        long jA1 = b0Var.a0();
        if (jA0 < jA1) {
            return -1;
        }
        if (jA0 <= jA1 && (iA = a() - b0Var.a()) <= 0) {
            return iA < 0 ? -1 : 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b0 u() {
        return this;
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f93967b & (-1073741825);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f93966a != b0Var.f93966a) {
                return false;
            }
            if (fp0.d.n().r()) {
                return this.f93967b == b0Var.f93967b;
            }
            if (a() == b0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public b1 f0(net.time4j.tz.k kVar) {
        return b1.d(this, net.time4j.tz.l.N(kVar));
    }

    public boolean g0(fp0.g gVar) {
        return compareTo(X(gVar)) > 0;
    }

    public boolean h0(fp0.g gVar) {
        return compareTo(X(gVar)) < 0;
    }

    public int hashCode() {
        long j11 = this.f93966a;
        return (((int) (j11 ^ (j11 >>> 32))) * 19) + (a() * 37);
    }

    @Override // fp0.g
    public long i(fp0.f fVar) {
        long jA0;
        int iQ0;
        switch (a.f93968a[fVar.ordinal()]) {
            case 1:
                return this.f93966a;
            case 2:
                return a0();
            case 3:
                if (a0() < 0) {
                    double dDeltaT = fp0.f.deltaT(Z()) + (this.f93966a - 63072000) + (((double) a()) / 1.0E9d);
                    long jFloor = (long) Math.floor(dDeltaT);
                    if (Double.compare(1.0E9d - ((dDeltaT - jFloor) * 1.0E9d), 1.0d) < 0) {
                        jFloor++;
                        iQ0 = 0;
                    } else {
                        iQ0 = q0(dDeltaT, jFloor);
                    }
                    jA0 = jFloor - (-441763168);
                    if (iQ0 - 184000000 < 0) {
                        jA0 = jFloor - (-441763167);
                    }
                } else {
                    jA0 = a0() + 441763210;
                }
                if (jA0 >= 0) {
                    return jA0;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                long jA1 = a0();
                if (fp0.d.n().t(jA1) >= 315964800) {
                    if (!fp0.d.n().r()) {
                        jA1 += 9;
                    }
                    return jA1 - 252892809;
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f93966a >= 63072000) {
                    long jA2 = a0();
                    return a() + 184000000 >= 1000000000 ? jA2 + 43 : 42 + jA2;
                }
                double dDeltaT2 = fp0.f.deltaT(Z()) + (this.f93966a - 63072000) + (((double) a()) / 1.0E9d);
                long jFloor2 = (long) Math.floor(dDeltaT2);
                return Double.compare(1.0E9d - ((dDeltaT2 - ((double) jFloor2)) * 1.0E9d), 1.0d) < 0 ? jFloor2 + 1 : jFloor2;
            case 6:
                long j11 = this.f93966a;
                return j11 < 63072000 ? j11 - 63072000 : (long) Math.floor(b0());
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    public boolean i0() {
        return j0() && fp0.d.n().r();
    }

    @Override // net.time4j.base.f
    public long l() {
        return this.f93966a;
    }

    @Override // fp0.g
    public int m(fp0.f fVar) {
        long jA0;
        int iA;
        int iQ0 = 0;
        switch (a.f93968a[fVar.ordinal()]) {
            case 1:
            case 2:
                return a();
            case 3:
                if (a0() < 0) {
                    double dDeltaT = fp0.f.deltaT(Z()) + (this.f93966a - 63072000) + (((double) a()) / 1.0E9d);
                    long jFloor = (long) Math.floor(dDeltaT);
                    if (Double.compare(1.0E9d - ((dDeltaT - jFloor) * 1.0E9d), 1.0d) < 0) {
                        jFloor++;
                    } else {
                        iQ0 = q0(dDeltaT, jFloor);
                    }
                    jA0 = jFloor - (-441763168);
                    iA = iQ0 - 184000000;
                    if (iA < 0) {
                        jA0 = jFloor - (-441763167);
                        iA = iQ0 - (-816000000);
                    }
                } else {
                    jA0 = a0() + 441763200;
                    iA = a();
                }
                if (jA0 >= 0) {
                    return iA;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                if (fp0.d.n().t(a0()) >= 315964800) {
                    return a();
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f93966a >= 63072000) {
                    int iA2 = a();
                    int i11 = 184000000 + iA2;
                    return i11 >= 1000000000 ? iA2 - 816000000 : i11;
                }
                double dDeltaT2 = fp0.f.deltaT(Z()) + (this.f93966a - 63072000) + (((double) a()) / 1.0E9d);
                long jFloor2 = (long) Math.floor(dDeltaT2);
                if (Double.compare(1.0E9d - ((dDeltaT2 - jFloor2) * 1.0E9d), 1.0d) < 0) {
                    return 0;
                }
                return q0(dDeltaT2, jFloor2);
            case 6:
                if (this.f93966a < 63072000) {
                    return a();
                }
                double dB0 = b0();
                return q0(dB0, (long) Math.floor(dB0));
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + fVar);
        }
    }

    public b0 m0(long j11, n0 n0Var) {
        b0 b0Var;
        R(this);
        if (j11 == 0) {
            return this;
        }
        try {
            int i11 = a.f93969b[n0Var.ordinal()];
            if (i11 == 1) {
                b0Var = fp0.d.n().r() ? new b0(net.time4j.base.c.f(a0(), j11), a(), fp0.f.UTC) : k0(net.time4j.base.c.f(this.f93966a, j11), a(), fp0.f.POSIX);
            } else {
                if (i11 != 2) {
                    throw new UnsupportedOperationException();
                }
                long jF = net.time4j.base.c.f(a(), j11);
                int iD = net.time4j.base.c.d(jF, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                long jB = net.time4j.base.c.b(jF, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                b0Var = fp0.d.n().r() ? new b0(net.time4j.base.c.f(a0(), jB), iD, fp0.f.UTC) : k0(net.time4j.base.c.f(this.f93966a, jB), iD, fp0.f.POSIX);
            }
            if (j11 < 0) {
                R(b0Var);
            }
            return b0Var;
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public <C extends net.time4j.engine.l<C>> s<C> o0(net.time4j.engine.j<C> jVar, String str, net.time4j.tz.k kVar, net.time4j.engine.d0 d0Var) {
        i0 i0VarT0 = t0(kVar);
        return s.b(i0VarT0.G(d0Var.b(i0VarT0.S(), kVar), net.time4j.h.SECONDS).S().Q(jVar.p(), str), i0VarT0.U());
    }

    public <C extends net.time4j.engine.m<?, C>> s<C> p0(net.time4j.engine.w<C> wVar, net.time4j.tz.k kVar, net.time4j.engine.d0 d0Var) {
        i0 i0VarT0 = t0(kVar);
        return s.c(i0VarT0.G(d0Var.b(i0VarT0.S(), kVar), net.time4j.h.SECONDS).S().R(wVar.p()), i0VarT0.U());
    }

    public i0 t0(net.time4j.tz.k kVar) {
        return e0(net.time4j.tz.l.N(kVar));
    }

    public String toString() {
        return r0(true);
    }

    void w0(DataOutput dataOutput) {
        int i11 = j0() ? 65 : 64;
        int iA = a();
        if (iA > 0) {
            i11 |= 2;
        }
        dataOutput.writeByte(i11);
        dataOutput.writeLong(this.f93966a);
        if (iA > 0) {
            dataOutput.writeInt(iA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    private b0(long j11, int i11, fp0.f fVar) {
        long j12;
        long jFloor;
        int iQ0;
        long jF;
        long jM = j11;
        int iL = i11;
        if (fVar == fp0.f.POSIX) {
            this.f93966a = jM;
            this.f93967b = iL;
        } else {
            fp0.d dVarN = fp0.d.n();
            if (!dVarN.r()) {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
            if (fVar == fp0.f.UTC) {
                j12 = 0;
            } else {
                j12 = 0;
                if (fVar == fp0.f.TAI) {
                    if (jM < 0) {
                        throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + jM);
                    }
                    if (jM < 441763200) {
                        long jF2 = net.time4j.base.c.f(jM, -441763168L);
                        int iE = net.time4j.base.c.e(iL, 184000000);
                        if (iE >= 1000000000) {
                            jF2 = net.time4j.base.c.f(jF2, 1L);
                            iE = net.time4j.base.c.l(iE, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                        }
                        double d11 = jF2 + (((double) iE) / 1.0E9d);
                        double dDeltaT = d11 - fp0.f.deltaT(g0.O0(net.time4j.base.c.b((long) (d11 - 42.184d), Strategy.TTL_SECONDS_MAX), net.time4j.engine.z.UTC));
                        jFloor = (long) Math.floor(dDeltaT);
                        iQ0 = q0(dDeltaT, jFloor);
                    } else {
                        iQ0 = iL;
                        jFloor = net.time4j.base.c.m(jM, 441763210L);
                    }
                } else if (fVar == fp0.f.GPS) {
                    long jF3 = net.time4j.base.c.f(jM, 252892809L);
                    if (jF3 < 252892809) {
                        throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + jM);
                    }
                    iQ0 = iL;
                    jFloor = jF3;
                } else if (fVar == fp0.f.TT) {
                    if (jM < 42 || (jM == 42 && iL < 184000000)) {
                        double d12 = jM + (((double) iL) / 1.0E9d);
                        double dDeltaT2 = d12 - fp0.f.deltaT(g0.O0(net.time4j.base.c.b((long) (d12 - 42.184d), Strategy.TTL_SECONDS_MAX), net.time4j.engine.z.UTC));
                        jFloor = (long) Math.floor(dDeltaT2);
                        iQ0 = q0(dDeltaT2, jFloor);
                    } else {
                        jM = net.time4j.base.c.m(jM, 42L);
                        iL = net.time4j.base.c.l(iL, 184000000);
                        if (iL < 0) {
                            jM = net.time4j.base.c.m(jM, 1L);
                            iL = net.time4j.base.c.e(iL, Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                        }
                    }
                } else {
                    if (fVar != fp0.f.UT) {
                        throw new UnsupportedOperationException("Not yet implemented: " + fVar.name());
                    }
                    if (jM >= 0) {
                        double dDeltaT3 = ((jM + (((double) iL) / 1.0E9d)) + fp0.f.deltaT(g0.O0(net.time4j.base.c.b(jM, Strategy.TTL_SECONDS_MAX), net.time4j.engine.z.UTC))) - 42.184d;
                        jFloor = (long) Math.floor(dDeltaT3);
                        iQ0 = q0(dDeltaT3, jFloor);
                    }
                }
                long jT = dVarN.t(jFloor);
                jF = jFloor - dVarN.f(jT);
                this.f93966a = jT;
                if (jF != j12 || jT == f93953d) {
                    this.f93967b = iQ0;
                } else {
                    if (jF != 1) {
                        throw new IllegalStateException("Cannot handle leap shift of " + jM + ".");
                    }
                    this.f93967b = 1073741824 | iQ0;
                }
                iL = iQ0;
            }
            iQ0 = iL;
            jFloor = jM;
            long jT2 = dVarN.t(jFloor);
            jF = jFloor - dVarN.f(jT2);
            this.f93966a = jT2;
            if (jF != j12) {
                this.f93967b = iQ0;
            } else {
                this.f93967b = iQ0;
            }
            iL = iQ0;
        }
        U(this.f93966a);
        S(iL);
    }

    private b0(int i11, long j11) {
        U(j11);
        this.f93966a = j11;
        this.f93967b = i11;
    }
}
