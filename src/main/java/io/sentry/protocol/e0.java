package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.c8;
import io.sentry.i3;
import io.sentry.i5;
import io.sentry.j3;
import io.sentry.j8;
import io.sentry.k8;
import io.sentry.q1;
import io.sentry.y8;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends i5 implements a2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f80939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Double f80940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Double f80941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<a0> f80942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f80943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map<String, k> f80944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private g0 f80945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, Object> f80946w;

    public static final class a implements q1<e0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            e0 e0Var = new e0("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new g0(h0.CUSTOM.apiName()));
            i5.a aVar = new i5.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "start_timestamp":
                        try {
                            Double dJ2 = i3Var.j2();
                            if (dJ2 != null) {
                                e0Var.f80940q = dJ2;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateM0 = i3Var.m0(iLogger);
                            if (dateM0 != null) {
                                e0Var.f80940q = Double.valueOf(io.sentry.l.b(dateM0));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapY2 = i3Var.Y2(iLogger, new k.a());
                        if (mapY2 != null) {
                            e0Var.f80944u.putAll(mapY2);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        i3Var.O();
                        break;
                    case "timestamp":
                        try {
                            Double dJ3 = i3Var.j2();
                            if (dJ3 != null) {
                                e0Var.f80941r = dJ3;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateM1 = i3Var.m0(iLogger);
                            if (dateM1 != null) {
                                e0Var.f80941r = Double.valueOf(io.sentry.l.b(dateM1));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listG1 = i3Var.G1(iLogger, new a0.a());
                        if (listG1 != null) {
                            e0Var.f80942s.addAll(listG1);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        e0Var.f80945v = new g0.a().a(i3Var, iLogger);
                        break;
                    case "transaction":
                        e0Var.f80939p = i3Var.a1();
                        break;
                    default:
                        if (aVar.a(e0Var, strL, i3Var, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            i3Var.a3(iLogger, concurrentHashMap, strL);
                            break;
                        }
                        break;
                }
            }
            e0Var.s0(concurrentHashMap);
            i3Var.j();
            return e0Var;
        }
    }

    public e0(c8 c8Var) {
        super(c8Var.i());
        this.f80942s = new ArrayList();
        this.f80943t = "transaction";
        this.f80944u = new HashMap();
        io.sentry.util.y.c(c8Var, "sentryTracer is required");
        this.f80940q = Double.valueOf(io.sentry.l.m(c8Var.r().f()));
        this.f80941r = Double.valueOf(io.sentry.l.m(c8Var.r().e(c8Var.q())));
        this.f80939p = c8Var.getName();
        for (j8 j8Var : c8Var.F()) {
            if (Boolean.TRUE.equals(j8Var.b())) {
                this.f80942s.add(new a0(j8Var));
            }
        }
        c cVarC = C();
        cVarC.m(c8Var.G());
        k8 k8VarE = c8Var.e();
        Map<String, Object> mapH = c8Var.H();
        k8 k8Var = new k8(k8VarE.p(), k8VarE.m(), k8VarE.h(), k8VarE.f(), k8VarE.c(), k8VarE.l(), k8VarE.n(), k8VarE.g());
        for (Map.Entry<String, String> entry : k8VarE.o().entrySet()) {
            d0(entry.getKey(), entry.getValue());
        }
        if (mapH != null) {
            for (Map.Entry<String, Object> entry2 : mapH.entrySet()) {
                k8Var.q(entry2.getKey(), entry2.getValue());
            }
        }
        g gVarG = k8VarE.d().g();
        if (gVarG != null) {
            for (f fVar : gVarG.a()) {
                k8Var.q("flag.evaluation." + fVar.a(), fVar.b());
            }
        }
        cVarC.z(k8Var);
        this.f80945v = new g0(c8Var.M().apiName());
    }

    public Map<String, k> m0() {
        return this.f80944u;
    }

    public y8 n0() {
        k8 k8VarJ = C().j();
        if (k8VarJ == null) {
            return null;
        }
        return k8VarJ.l();
    }

    public List<a0> o0() {
        return this.f80942s;
    }

    public String p0() {
        return this.f80939p;
    }

    public boolean q0() {
        return this.f80941r != null;
    }

    public boolean r0() {
        y8 y8VarN0 = n0();
        if (y8VarN0 == null) {
            return false;
        }
        return y8VarN0.e().booleanValue();
    }

    public void s0(Map<String, Object> map) {
        this.f80946w = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80939p != null) {
            j3Var.N("transaction").w(this.f80939p);
        }
        j3Var.N("start_timestamp").V(iLogger, io.sentry.l.c(this.f80940q));
        if (this.f80941r != null) {
            j3Var.N("timestamp").V(iLogger, io.sentry.l.c(this.f80941r));
        }
        if (!this.f80942s.isEmpty()) {
            j3Var.N("spans").V(iLogger, this.f80942s);
        }
        j3Var.N("type").w("transaction");
        if (!this.f80944u.isEmpty()) {
            j3Var.N("measurements").V(iLogger, this.f80944u);
        }
        j3Var.N("transaction_info").V(iLogger, this.f80945v);
        new i5.b().a(this, j3Var, iLogger);
        Map<String, Object> map = this.f80946w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80946w.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public e0(String str, Double d11, Double d12, List<a0> list, Map<String, k> map, g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        this.f80942s = arrayList;
        this.f80943t = "transaction";
        HashMap map2 = new HashMap();
        this.f80944u = map2;
        this.f80939p = str;
        this.f80940q = d11;
        this.f80941r = d12;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator<a0> it = list.iterator();
        while (it.hasNext()) {
            this.f80944u.putAll(it.next().c());
        }
        this.f80945v = g0Var;
    }
}
