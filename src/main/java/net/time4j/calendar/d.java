package net.time4j.calendar;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import net.time4j.b0;
import net.time4j.calendar.f;
import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
abstract class d<D extends f<?, D>> implements net.time4j.engine.k<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f94045a = g0.I0(1645, 1, 28).h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f94046b = g0.I0(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 1, 27).h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f94047c = g0.I0(-2636, 2, 15).h();

    d() {
    }

    private long e(int i11, int i12, h hVar) {
        long jO = o(p(i11, i12) + ((long) ((hVar.getNumber() - 1) * 29)));
        return hVar.equals(b(jO).Z()) ? jO : o(jO + 1);
    }

    private boolean i(long j11, long j12) {
        if (j12 >= j11) {
            return j(j12) || i(j11, n(j12));
        }
        return false;
    }

    private static long l(long j11, long j12) {
        return Math.round((j12 - j11) / 29.530588861d);
    }

    private long n(long j11) {
        return net.time4j.calendar.astro.d.NEW_MOON.before(m(j11)).t0(h(j11)).d0().h();
    }

    private long q(long j11) {
        long jV = v(j11);
        long jV2 = v(370 + jV);
        long jO = o(jV + 1);
        long jO2 = o(jO + 1);
        return (l(jO, n(jV2 + 1)) == 12 && (j(jO) || j(jO2))) ? o(jO2 + 1) : jO2;
    }

    private long r(long j11) {
        long jQ = q(j11);
        return j11 >= jQ ? jQ : q(j11 - 180);
    }

    private long v(long j11) {
        net.time4j.tz.p pVarH = h(j11);
        g0 g0VarO0 = g0.O0(j11, z.UTC);
        int iB = (g0VarO0.r() <= 11 || g0VarO0.f() <= 15) ? g0VarO0.b() - 1 : g0VarO0.b();
        net.time4j.calendar.astro.b bVar = net.time4j.calendar.astro.b.WINTER_SOLSTICE;
        g0 g0VarS = bVar.inYear(iB).t0(pVarH).S();
        if (g0VarS.M(g0VarO0)) {
            g0VarS = bVar.inYear(iB - 1).t0(pVarH).S();
        }
        return g0VarS.h();
    }

    @Override // net.time4j.engine.k
    public final long a() {
        return f94046b;
    }

    @Override // net.time4j.engine.k
    public long c() {
        return f94045a;
    }

    abstract D d(int i11, int i12, h hVar, int i13, long j11);

    final int f(int i11, int i12) {
        int[] iArrG = g();
        int i13 = (((i11 - 1) * 60) + i12) - 1;
        int iMax = ((i13 - iArrG[0]) / 3) * 2;
        while (iMax < iArrG.length) {
            int i14 = iArrG[iMax];
            if (i14 >= i13) {
                if (i14 > i13) {
                    break;
                }
                return iArrG[iMax + 1];
            }
            iMax += Math.max(((i13 - i14) / 3) * 2, 2);
        }
        return 0;
    }

    abstract int[] g();

    abstract net.time4j.tz.p h(long j11);

    final boolean j(long j11) {
        return (((int) Math.floor(p.solarLongitude(net.time4j.calendar.astro.c.h(m(j11)).d()) / 30.0d)) + 2) % 12 == (((int) Math.floor(p.solarLongitude(net.time4j.calendar.astro.c.h(m(o(j11 + 1))).d()) / 30.0d)) + 2) % 12;
    }

    boolean k(int i11, int i12, h hVar, int i13) {
        if (i11 < 72 || i11 > 94 || i12 < 1 || i12 > 60 || ((i11 == 72 && i12 < 22) || ((i11 == 94 && i12 > 56) || i13 < 1 || i13 > 30 || hVar == null || (hVar.c() && hVar.getNumber() != f(i11, i12))))) {
            return false;
        }
        if (i13 != 30) {
            return true;
        }
        long jE = e(i11, i12, hVar);
        return o(1 + jE) - jE == 30;
    }

    b0 m(long j11) {
        return g0.O0(j11, z.UTC).o0().N(h(j11));
    }

    final long o(long j11) {
        return net.time4j.calendar.astro.d.NEW_MOON.atOrAfter(m(j11)).t0(h(j11)).d0().h();
    }

    final long p(int i11, int i12) {
        return r((long) Math.floor(f94047c + ((((double) (((i11 - 1) * 60) + i12)) - 0.5d) * 365.242189d)));
    }

    final long s(int i11, int i12, h hVar, int i13) {
        if (k(i11, i12, hVar, i13)) {
            return (e(i11, i12, hVar) + ((long) i13)) - 1;
        }
        throw new IllegalArgumentException("Invalid date.");
    }

    @Override // net.time4j.engine.k
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long transform(D d11) {
        return s(d11.T(), d11.e0().getNumber(), d11.Z(), d11.f());
    }

    @Override // net.time4j.engine.k
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final D b(long j11) {
        long jV = v(j11);
        long jV2 = v(370 + jV);
        long jO = o(jV + 1);
        long jN = n(jV2 + 1);
        long jN2 = n(j11 + 1);
        boolean z11 = l(jO, jN) == 12;
        long jL = l(jO, jN2);
        if (z11 && i(jO, jN2)) {
            jL--;
        }
        int iD = net.time4j.base.c.d(jL, 12);
        int i11 = iD != 0 ? iD : 12;
        long jFloor = (long) Math.floor((1.5d - (((double) i11) / 12.0d)) + ((j11 - f94047c) / 365.242189d));
        int iB = ((int) net.time4j.base.c.b(jFloor - 1, 60)) + 1;
        int iD2 = net.time4j.base.c.d(jFloor, 60);
        int i12 = iD2 != 0 ? iD2 : 60;
        int i13 = (int) ((j11 - jN2) + 1);
        h hVarD = h.d(i11);
        if (z11 && j(jN2) && !i(jO, n(jN2))) {
            hVarD = hVarD.e();
        }
        return (D) d(iB, i12, hVarD, i13, j11);
    }
}
