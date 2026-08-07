package io.sentry;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Integer f80432i = Integer.valueOf(PKIFailureInfo.certRevoked);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Integer f80433j = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c f80434k = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f80435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f80436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Double f80437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Double f80438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f80439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f80441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final ILogger f80442h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List<String> f80443a = Arrays.asList("sentry-trace_id", "sentry-public_key", "sentry-release", "sentry-user_id", "sentry-environment", "sentry-transaction", "sentry-sample_rate", "sentry-sample_rand", "sentry-sampled", "sentry-replay_id");
    }

    private static class c extends ThreadLocal<DecimalFormat> {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public d(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    public static d c(i5 i5Var, String str, q7 q7Var) {
        d dVar = new d(q7Var.getLogger());
        k8 k8VarJ = i5Var.C().j();
        dVar.E(k8VarJ != null ? k8VarJ.p().toString() : null);
        dVar.y(q7Var.retrieveParsedDsn().a());
        dVar.z(i5Var.J());
        dVar.x(i5Var.F());
        dVar.F(str);
        dVar.C(null);
        dVar.D(null);
        dVar.B(null);
        Object objC = i5Var.C().c("replay_id");
        if (objC != null && !objC.toString().equals(io.sentry.protocol.x.f81078b.toString())) {
            dVar.A(objC.toString());
            i5Var.C().n("replay_id");
        }
        dVar.b();
        return dVar;
    }

    private static boolean p(io.sentry.protocol.h0 h0Var) {
        return (h0Var == null || io.sentry.protocol.h0.URL.equals(h0Var)) ? false : true;
    }

    private static Double s(y8 y8Var) {
        if (y8Var == null) {
            return null;
        }
        return y8Var.c();
    }

    private static Double t(y8 y8Var) {
        if (y8Var == null) {
            return null;
        }
        return y8Var.d();
    }

    private static String u(Double d11) {
        if (io.sentry.util.c0.h(d11, false)) {
            return f80434k.get().format(d11);
        }
        return null;
    }

    private static Boolean v(y8 y8Var) {
        if (y8Var == null) {
            return null;
        }
        return y8Var.e();
    }

    public void A(String str) {
        w("sentry-replay_id", str);
    }

    public void B(Double d11) {
        if (q()) {
            this.f80438d = d11;
        }
    }

    public void C(Double d11) {
        if (q()) {
            this.f80437c = d11;
        }
    }

    public void D(String str) {
        w("sentry-sampled", str);
    }

    public void E(String str) {
        w("sentry-trace_id", str);
    }

    public void F(String str) {
        w("sentry-transaction", str);
    }

    public void G(y8 y8Var) {
        if (y8Var == null) {
            return;
        }
        D(io.sentry.util.f0.g(v(y8Var)));
        if (y8Var.c() != null) {
            B(s(y8Var));
        }
        if (y8Var.d() != null) {
            a(t(y8Var));
        }
    }

    public void H(x0 x0Var, q7 q7Var) {
        w3 w3VarK = x0Var.K();
        io.sentry.protocol.x xVarY = x0Var.y();
        E(w3VarK.e().toString());
        y(q7Var.retrieveParsedDsn().a());
        z(q7Var.getRelease());
        x(q7Var.getEnvironment());
        if (!io.sentry.protocol.x.f81078b.equals(xVarY)) {
            A(xVarY.toString());
        }
        F(null);
        C(null);
        D(null);
    }

    public void I(io.sentry.protocol.x xVar, io.sentry.protocol.x xVar2, q7 q7Var, y8 y8Var, String str, io.sentry.protocol.h0 h0Var) {
        E(xVar.toString());
        y(q7Var.retrieveParsedDsn().a());
        z(q7Var.getRelease());
        x(q7Var.getEnvironment());
        if (!p(h0Var)) {
            str = null;
        }
        F(str);
        if (xVar2 != null && !io.sentry.protocol.x.f81078b.equals(xVar2)) {
            A(xVar2.toString());
        }
        C(t(y8Var));
        D(io.sentry.util.f0.g(v(y8Var)));
        B(s(y8Var));
    }

    public w8 J() {
        String strL = l();
        String strH = h();
        String strF = f();
        if (strL == null || strF == null) {
            return null;
        }
        io.sentry.protocol.x xVar = new io.sentry.protocol.x(strL);
        io.sentry.protocol.x xVar2 = null;
        String strG = g();
        String strE = e();
        String strO = o();
        String strM = m();
        String strU = u(j());
        String strK = k();
        if (strH != null) {
            xVar2 = new io.sentry.protocol.x(strH);
        }
        w8 w8Var = new w8(xVar, strF, strG, strE, strO, strM, strU, strK, xVar2, u(i()));
        w8Var.c(n());
        return w8Var;
    }

    public void a(Double d11) {
        this.f80437c = d11;
    }

    public void b() {
        this.f80440f = false;
    }

    public String d(String str) {
        if (str == null) {
            return null;
        }
        return this.f80435a.get(str);
    }

    public String e() {
        return d("sentry-environment");
    }

    public String f() {
        return d("sentry-public_key");
    }

    public String g() {
        return d("sentry-release");
    }

    public String h() {
        return d("sentry-replay_id");
    }

    public Double i() {
        return this.f80438d;
    }

    public Double j() {
        return this.f80437c;
    }

    public String k() {
        return d("sentry-sampled");
    }

    public String l() {
        return d("sentry-trace_id");
    }

    public String m() {
        return d("sentry-transaction");
    }

    public Map<String, Object> n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        d1 d1VarA = this.f80436b.a();
        try {
            for (Map.Entry<String, String> entry : this.f80435a.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!b.f80443a.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst("sentry-", ""), value);
                }
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            return concurrentHashMap;
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String o() {
        return d("sentry-user_id");
    }

    public boolean q() {
        return this.f80440f;
    }

    public boolean r() {
        return this.f80441g;
    }

    public void w(String str, String str2) {
        if (this.f80440f) {
            if (str2 == null) {
                this.f80435a.remove(str);
            } else {
                this.f80435a.put(str, str2);
            }
        }
    }

    public void x(String str) {
        w("sentry-environment", str);
    }

    public void y(String str) {
        w("sentry-public_key", str);
    }

    public void z(String str) {
        w("sentry-release", str);
    }

    public d(ConcurrentHashMap<String, String> concurrentHashMap, Double d11, Double d12, String str, boolean z11, boolean z12, ILogger iLogger) {
        this.f80436b = new io.sentry.util.a();
        this.f80435a = concurrentHashMap;
        this.f80437c = d11;
        this.f80438d = d12;
        this.f80442h = iLogger;
        this.f80439e = str;
        this.f80440f = z11;
        this.f80441g = z12;
    }
}
