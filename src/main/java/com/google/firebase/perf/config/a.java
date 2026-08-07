package com.google.firebase.perf.config;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kw.a f44416d = kw.a.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f44417e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RemoteConfigManager f44418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.firebase.perf.util.f f44419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x f44420c;

    public a(RemoteConfigManager remoteConfigManager, com.google.firebase.perf.util.f fVar, x xVar) {
        this.f44418a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f44419b = fVar == null ? new com.google.firebase.perf.util.f() : fVar;
        this.f44420c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j11) {
        return j11 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(hw.a.f73660b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j11) {
        return j11 >= 0;
    }

    private boolean L(double d11) {
        return 0.0d <= d11 && d11 <= 1.0d;
    }

    private boolean M(long j11) {
        return j11 > 0;
    }

    private boolean N(long j11) {
        return j11 > 0;
    }

    private com.google.firebase.perf.util.g<Boolean> b(v<Boolean> vVar) {
        return this.f44420c.c(vVar.a());
    }

    private com.google.firebase.perf.util.g<Double> c(v<Double> vVar) {
        return this.f44420c.d(vVar.a());
    }

    private com.google.firebase.perf.util.g<Long> d(v<Long> vVar) {
        return this.f44420c.g(vVar.a());
    }

    private com.google.firebase.perf.util.g<String> e(v<String> vVar) {
        return this.f44420c.h(vVar.a());
    }

    public static synchronized a g() {
        try {
            if (f44417e == null) {
                f44417e = new a(null, null, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44417e;
    }

    private boolean k() {
        l lVarE = l.e();
        com.google.firebase.perf.util.g<Boolean> gVarB = b(lVarE);
        com.google.firebase.perf.util.g<Boolean> gVarU = u(lVarE);
        if (!gVarU.d()) {
            return gVarB.d() ? gVarB.c().booleanValue() : lVarE.d().booleanValue();
        }
        if (this.f44418a.isLastFetchFailed()) {
            return false;
        }
        Boolean boolC = gVarU.c();
        if (gVarB == null || !gVarB.d() || gVarB.c() != boolC) {
            this.f44420c.m(lVarE.a(), boolC.booleanValue());
        }
        return boolC.booleanValue();
    }

    private boolean l() {
        k kVarE = k.e();
        com.google.firebase.perf.util.g<String> gVarE = e(kVarE);
        com.google.firebase.perf.util.g<String> gVarX = x(kVarE);
        if (!gVarX.d()) {
            return gVarE.d() ? I(gVarE.c()) : I(kVarE.d());
        }
        String strC = gVarX.c();
        if (gVarE == null || !gVarE.d() || !gVarE.c().equals(strC)) {
            this.f44420c.l(kVarE.a(), strC);
        }
        return I(strC);
    }

    private com.google.firebase.perf.util.g<Boolean> n(v<Boolean> vVar) {
        return this.f44419b.b(vVar.b());
    }

    private com.google.firebase.perf.util.g<Double> o(v<Double> vVar) {
        return this.f44419b.c(vVar.b());
    }

    private com.google.firebase.perf.util.g<Long> p(v<Long> vVar) {
        return this.f44419b.e(vVar.b());
    }

    private com.google.firebase.perf.util.g<Boolean> u(v<Boolean> vVar) {
        return this.f44418a.getBoolean(vVar.c());
    }

    private com.google.firebase.perf.util.g<Double> v(v<Double> vVar) {
        return this.f44418a.getDouble(vVar.c());
    }

    private com.google.firebase.perf.util.g<Long> w(v<Long> vVar) {
        return this.f44418a.getLong(vVar.c());
    }

    private com.google.firebase.perf.util.g<String> x(v<String> vVar) {
        return this.f44418a.getString(vVar.c());
    }

    public long A() {
        o oVarE = o.e();
        com.google.firebase.perf.util.g<Long> gVarP = p(oVarE);
        if (gVarP.d() && M(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarW = w(oVarE);
        if (gVarW.d() && M(gVarW.c().longValue())) {
            this.f44420c.k(oVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(oVarE);
        return (gVarD.d() && M(gVarD.c().longValue())) ? gVarD.c().longValue() : oVarE.d().longValue();
    }

    public long B() {
        p pVarE = p.e();
        com.google.firebase.perf.util.g<Long> gVarP = p(pVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarW = w(pVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f44420c.k(pVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(pVarE);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : pVarE.d().longValue();
    }

    public long C() {
        q qVarF = q.f();
        com.google.firebase.perf.util.g<Long> gVarP = p(qVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarW = w(qVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f44420c.k(qVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(qVarF);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return this.f44418a.isLastFetchFailed() ? qVarF.e().longValue() : qVarF.d().longValue();
    }

    public double D() {
        r rVarF = r.f();
        com.google.firebase.perf.util.g<Double> gVarO = o(rVarF);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.g<Double> gVarV = v(rVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f44420c.j(rVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        com.google.firebase.perf.util.g<Double> gVarC = c(rVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        return this.f44418a.isLastFetchFailed() ? rVarF.e().doubleValue() : rVarF.d().doubleValue();
    }

    public long E() {
        s sVarE = s.e();
        com.google.firebase.perf.util.g<Long> gVarW = w(sVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f44420c.k(sVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(sVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : sVarE.d().longValue();
    }

    public long F() {
        t tVarE = t.e();
        com.google.firebase.perf.util.g<Long> gVarW = w(tVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f44420c.k(tVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(tVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : tVarE.d().longValue();
    }

    public double G() {
        u uVarF = u.f();
        com.google.firebase.perf.util.g<Double> gVarV = v(uVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f44420c.j(uVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        com.google.firebase.perf.util.g<Double> gVarC = c(uVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        return this.f44418a.isLastFetchFailed() ? uVarF.e().doubleValue() : uVarF.d().doubleValue();
    }

    public boolean K() {
        Boolean boolJ = j();
        return (boolJ == null || boolJ.booleanValue()) && m();
    }

    public void O(Context context) {
        f44416d.i(com.google.firebase.perf.util.o.b(context));
        this.f44420c.i(context);
    }

    public void P(Boolean bool) {
        String strA;
        if (i().booleanValue() || (strA = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f44420c.m(strA, Boolean.TRUE.equals(bool));
        } else {
            this.f44420c.b(strA);
        }
    }

    public void Q(com.google.firebase.perf.util.f fVar) {
        this.f44419b = fVar;
    }

    public String a() {
        String strF;
        f fVarE = f.e();
        if (hw.a.f73659a.booleanValue()) {
            return fVarE.d();
        }
        String strC = fVarE.c();
        long jLongValue = strC != null ? ((Long) this.f44418a.getRemoteConfigValueOrDefault(strC, -1L)).longValue() : -1L;
        String strA = fVarE.a();
        if (!f.g(jLongValue) || (strF = f.f(jLongValue)) == null) {
            com.google.firebase.perf.util.g<String> gVarE = e(fVarE);
            return gVarE.d() ? gVarE.c() : fVarE.d();
        }
        this.f44420c.l(strA, strF);
        return strF;
    }

    public double f() {
        e eVarE = e.e();
        com.google.firebase.perf.util.g<Double> gVarO = o(eVarE);
        if (gVarO.d()) {
            double dDoubleValue = gVarO.c().doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.g<Double> gVarV = v(eVarE);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f44420c.j(eVarE.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        com.google.firebase.perf.util.g<Double> gVarC = c(eVarE);
        return (gVarC.d() && L(gVarC.c().doubleValue())) ? gVarC.c().doubleValue() : eVarE.d().doubleValue();
    }

    public boolean h() {
        d dVarE = d.e();
        com.google.firebase.perf.util.g<Boolean> gVarN = n(dVarE);
        if (gVarN.d()) {
            return gVarN.c().booleanValue();
        }
        com.google.firebase.perf.util.g<Boolean> gVarU = u(dVarE);
        if (gVarU.d()) {
            this.f44420c.m(dVarE.a(), gVarU.c().booleanValue());
            return gVarU.c().booleanValue();
        }
        com.google.firebase.perf.util.g<Boolean> gVarB = b(dVarE);
        return gVarB.d() ? gVarB.c().booleanValue() : dVarE.d().booleanValue();
    }

    public Boolean i() {
        b bVarE = b.e();
        com.google.firebase.perf.util.g<Boolean> gVarN = n(bVarE);
        return gVarN.d() ? gVarN.c() : bVarE.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarD = c.d();
        com.google.firebase.perf.util.g<Boolean> gVarB = b(cVarD);
        if (gVarB.d()) {
            return gVarB.c();
        }
        com.google.firebase.perf.util.g<Boolean> gVarN = n(cVarD);
        if (gVarN.d()) {
            return gVarN.c();
        }
        return null;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        g gVarE = g.e();
        com.google.firebase.perf.util.g<Long> gVarW = w(gVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f44420c.k(gVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(gVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : gVarE.d().longValue();
    }

    public long r() {
        h hVarE = h.e();
        com.google.firebase.perf.util.g<Long> gVarW = w(hVarE);
        if (gVarW.d() && H(gVarW.c().longValue())) {
            this.f44420c.k(hVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(hVarE);
        return (gVarD.d() && H(gVarD.c().longValue())) ? gVarD.c().longValue() : hVarE.d().longValue();
    }

    public double s() {
        i iVarF = i.f();
        com.google.firebase.perf.util.g<Double> gVarV = v(iVarF);
        if (gVarV.d() && L(gVarV.c().doubleValue())) {
            this.f44420c.j(iVarF.a(), gVarV.c().doubleValue());
            return gVarV.c().doubleValue();
        }
        com.google.firebase.perf.util.g<Double> gVarC = c(iVarF);
        if (gVarC.d() && L(gVarC.c().doubleValue())) {
            return gVarC.c().doubleValue();
        }
        return this.f44418a.isLastFetchFailed() ? iVarF.e().doubleValue() : iVarF.d().doubleValue();
    }

    public long t() {
        j jVarE = j.e();
        com.google.firebase.perf.util.g<Long> gVarW = w(jVarE);
        if (gVarW.d() && N(gVarW.c().longValue())) {
            this.f44420c.k(jVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(jVarE);
        return (gVarD.d() && N(gVarD.c().longValue())) ? gVarD.c().longValue() : jVarE.d().longValue();
    }

    public long y() {
        m mVarE = m.e();
        com.google.firebase.perf.util.g<Long> gVarP = p(mVarE);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarW = w(mVarE);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f44420c.k(mVarE.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(mVarE);
        return (gVarD.d() && J(gVarD.c().longValue())) ? gVarD.c().longValue() : mVarE.d().longValue();
    }

    public long z() {
        n nVarF = n.f();
        com.google.firebase.perf.util.g<Long> gVarP = p(nVarF);
        if (gVarP.d() && J(gVarP.c().longValue())) {
            return gVarP.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarW = w(nVarF);
        if (gVarW.d() && J(gVarW.c().longValue())) {
            this.f44420c.k(nVarF.a(), gVarW.c().longValue());
            return gVarW.c().longValue();
        }
        com.google.firebase.perf.util.g<Long> gVarD = d(nVarF);
        if (gVarD.d() && J(gVarD.c().longValue())) {
            return gVarD.c().longValue();
        }
        return this.f44418a.isLastFetchFailed() ? nVarF.e().longValue() : nVarF.d().longValue();
    }
}
