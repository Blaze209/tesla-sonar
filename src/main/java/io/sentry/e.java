package io.sentry;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a2, Comparable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f80487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f80488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f80489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f80491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f80492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f80493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f80494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b7 f80495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f80496j;

    public static final class a implements q1<e> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            Date dateD = l.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strA1 = null;
            String strA2 = null;
            String strA3 = null;
            String strA4 = null;
            b7 b7VarA = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "origin":
                        strA4 = i3Var.a1();
                        break;
                    case "data":
                        Map mapB = io.sentry.util.c.b((Map) i3Var.z3());
                        if (mapB == null) {
                            break;
                        } else {
                            concurrentHashMap = mapB;
                            break;
                        }
                        break;
                    case "type":
                        strA2 = i3Var.a1();
                        break;
                    case "category":
                        strA3 = i3Var.a1();
                        break;
                    case "timestamp":
                        Date dateM0 = i3Var.m0(iLogger);
                        if (dateM0 == null) {
                            break;
                        } else {
                            dateD = dateM0;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            b7VarA = new b7.a().a(i3Var, iLogger);
                            break;
                        } catch (Exception e11) {
                            iLogger.b(b7.ERROR, e11, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strA1 = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap2, strL);
                        break;
                }
            }
            e eVar = new e(dateD);
            eVar.f80490d = strA1;
            eVar.f80491e = strA2;
            eVar.f80492f = concurrentHashMap;
            eVar.f80493g = strA3;
            eVar.f80494h = strA4;
            eVar.f80495i = b7VarA;
            eVar.A(concurrentHashMap2);
            i3Var.j();
            return eVar;
        }
    }

    public e(Date date) {
        this.f80492f = new ConcurrentHashMap();
        this.f80489c = Long.valueOf(System.nanoTime());
        this.f80488b = date;
        this.f80487a = null;
    }

    public static e B(String str, String str2, String str3, String str4, Map<String, Object> map) {
        e eVar = new e();
        eVar.z("user");
        eVar.u("ui." + str);
        if (str2 != null) {
            eVar.v("view.id", str2);
        }
        if (str3 != null) {
            eVar.v("view.class", str3);
        }
        if (str4 != null) {
            eVar.v("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            eVar.l().put(entry.getKey(), entry.getValue());
        }
        eVar.w(b7.INFO);
        return eVar;
    }

    private static boolean g(e eVar, e eVar2) {
        return eVar.p().getTime() == eVar2.p().getTime() && io.sentry.util.y.a(eVar.f80490d, eVar2.f80490d) && io.sentry.util.y.a(eVar.f80491e, eVar2.f80491e) && io.sentry.util.y.a(eVar.f80493g, eVar2.f80493g) && io.sentry.util.y.a(eVar.f80494h, eVar2.f80494h) && eVar.f80495i == eVar2.f80495i;
    }

    private static int h(e eVar) {
        return io.sentry.util.y.b(Long.valueOf(eVar.p().getTime()), eVar.f80490d, eVar.f80491e, eVar.f80493g, eVar.f80494h, eVar.f80495i);
    }

    private static boolean r(e eVar, e eVar2) {
        return g(eVar, eVar2) && io.sentry.util.y.a(eVar.k("status_code"), eVar2.k("status_code")) && io.sentry.util.y.a(eVar.k(ImagesContract.URL), eVar2.k(ImagesContract.URL)) && io.sentry.util.y.a(eVar.k("method"), eVar2.k("method")) && io.sentry.util.y.a(eVar.k("http.fragment"), eVar2.k("http.fragment")) && io.sentry.util.y.a(eVar.k("http.query"), eVar2.k("http.query"));
    }

    private static int s(e eVar) {
        return io.sentry.util.y.b(Long.valueOf(eVar.p().getTime()), eVar.f80490d, eVar.f80491e, eVar.f80493g, eVar.f80494h, eVar.f80495i, eVar.k("status_code"), eVar.k(ImagesContract.URL), eVar.k("method"), eVar.k("http.fragment"), eVar.k("http.query"));
    }

    public void A(Map<String, Object> map) {
        this.f80496j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return "http".equals(this.f80491e) ? r(this, eVar) : g(this, eVar);
    }

    public int hashCode() {
        return "http".equals(this.f80491e) ? s(this) : h(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        return this.f80489c.compareTo(eVar.f80489c);
    }

    public String j() {
        return this.f80493g;
    }

    public Object k(String str) {
        if (str == null) {
            return null;
        }
        return this.f80492f.get(str);
    }

    public Map<String, Object> l() {
        return this.f80492f;
    }

    public b7 m() {
        return this.f80495i;
    }

    public String n() {
        return this.f80490d;
    }

    public String o() {
        return this.f80494h;
    }

    public Date p() {
        Date date = this.f80488b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l11 = this.f80487a;
        if (l11 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = l.e(l11.longValue());
        this.f80488b = dateE;
        return dateE;
    }

    public String q() {
        return this.f80491e;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("timestamp").V(iLogger, p());
        if (this.f80490d != null) {
            j3Var.N("message").w(this.f80490d);
        }
        if (this.f80491e != null) {
            j3Var.N("type").w(this.f80491e);
        }
        j3Var.N("data").V(iLogger, this.f80492f);
        if (this.f80493g != null) {
            j3Var.N("category").w(this.f80493g);
        }
        if (this.f80494h != null) {
            j3Var.N("origin").w(this.f80494h);
        }
        if (this.f80495i != null) {
            j3Var.N("level").V(iLogger, this.f80495i);
        }
        Map<String, Object> map = this.f80496j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80496j.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void t(String str) {
        if (str == null) {
            return;
        }
        this.f80492f.remove(str);
    }

    public void u(String str) {
        this.f80493g = str;
    }

    public void v(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            t(str);
        } else {
            this.f80492f.put(str, obj);
        }
    }

    public void w(b7 b7Var) {
        this.f80495i = b7Var;
    }

    public void x(String str) {
        this.f80490d = str;
    }

    public void y(String str) {
        this.f80494h = str;
    }

    public void z(String str) {
        this.f80491e = str;
    }

    public e(long j11) {
        this.f80492f = new ConcurrentHashMap();
        this.f80489c = Long.valueOf(System.nanoTime());
        this.f80487a = Long.valueOf(j11);
        this.f80488b = null;
    }

    e(e eVar) {
        this.f80492f = new ConcurrentHashMap();
        this.f80489c = Long.valueOf(System.nanoTime());
        this.f80488b = eVar.f80488b;
        this.f80487a = eVar.f80487a;
        this.f80490d = eVar.f80490d;
        this.f80491e = eVar.f80491e;
        this.f80493g = eVar.f80493g;
        this.f80494h = eVar.f80494h;
        Map<String, Object> mapB = io.sentry.util.c.b(eVar.f80492f);
        if (mapB != null) {
            this.f80492f = mapB;
        }
        this.f80496j = io.sentry.util.c.b(eVar.f80496j);
        this.f80495i = eVar.f80495i;
    }

    public e() {
        this(System.currentTimeMillis());
    }
}
