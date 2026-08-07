package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class f8 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f80558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f80559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f80560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f80561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f80562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f80563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f80564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f80565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Double f80566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f80567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f80568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f80569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f80570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f80571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final io.sentry.util.a f80572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, Object> f80573p;

    public static final class a implements q1<f8> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f8 a(i3 i3Var, ILogger iLogger) throws Exception {
            i3Var.h();
            Integer numN2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVarValueOf = null;
            Date dateM0 = null;
            Date dateM1 = null;
            String strA1 = null;
            String str = null;
            Boolean boolO0 = null;
            Long lR2 = null;
            Double dJ2 = null;
            String strA2 = null;
            String strA3 = null;
            String strA4 = null;
            String strA5 = null;
            String strA6 = null;
            while (true) {
                Integer num = numN2;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar = bVarValueOf;
                Date date = dateM0;
                Date date2 = dateM1;
                if (i3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar == null) {
                        throw c(PermissionsResponse.STATUS_KEY, iLogger);
                    }
                    if (date == null) {
                        throw c("started", iLogger);
                    }
                    if (num == null) {
                        throw c("errors", iLogger);
                    }
                    if (strA5 == null) {
                        throw c("release", iLogger);
                    }
                    f8 f8Var = new f8(bVar, date, date2, num.intValue(), strA1, str, boolO0, lR2, dJ2, strA2, strA3, strA4, strA5, strA6);
                    f8Var.o(concurrentHashMap2);
                    i3Var.j();
                    return f8Var;
                }
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "duration":
                        dJ2 = i3Var.j2();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "started":
                        dateM0 = i3Var.m0(iLogger);
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM1 = date2;
                        break;
                    case "errors":
                        numN2 = i3Var.N2();
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "status":
                        String strC = io.sentry.util.f0.c(i3Var.a1());
                        if (strC != null) {
                            bVarValueOf = b.valueOf(strC);
                            numN2 = num;
                            concurrentHashMap = concurrentHashMap2;
                        } else {
                            numN2 = num;
                            concurrentHashMap = concurrentHashMap2;
                            bVarValueOf = bVar;
                        }
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "did":
                        strA1 = i3Var.a1();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "seq":
                        lR2 = i3Var.R2();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "sid":
                        String strA7 = i3Var.a1();
                        if (strA7 == null || !(strA7.length() == 36 || strA7.length() == 32)) {
                            iLogger.c(b7.ERROR, "%s sid is not valid.", strA7);
                        } else {
                            str = strA7;
                        }
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "init":
                        boolO0 = i3Var.o0();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "timestamp":
                        dateM1 = i3Var.m0(iLogger);
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        break;
                    case "attrs":
                        i3Var.h();
                        while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strL2 = i3Var.L();
                            strL2.getClass();
                            switch (strL2) {
                                case "environment":
                                    strA4 = i3Var.a1();
                                    break;
                                case "release":
                                    strA5 = i3Var.a1();
                                    break;
                                case "ip_address":
                                    strA2 = i3Var.a1();
                                    break;
                                case "user_agent":
                                    strA3 = i3Var.a1();
                                    break;
                                default:
                                    i3Var.F();
                                    break;
                            }
                        }
                        i3Var.j();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    case "abnormal_mechanism":
                        strA6 = i3Var.a1();
                        numN2 = num;
                        concurrentHashMap = concurrentHashMap2;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        numN2 = num;
                        bVarValueOf = bVar;
                        dateM0 = date;
                        dateM1 = date2;
                        break;
                }
            }
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public f8(b bVar, Date date, Date date2, int i11, String str, String str2, Boolean bool, Long l11, Double d11, String str3, String str4, String str5, String str6, String str7) {
        this.f80572o = new io.sentry.util.a();
        this.f80564g = bVar;
        this.f80558a = date;
        this.f80559b = date2;
        this.f80560c = new AtomicInteger(i11);
        this.f80561d = str;
        this.f80562e = str2;
        this.f80563f = bool;
        this.f80565h = l11;
        this.f80566i = d11;
        this.f80567j = str3;
        this.f80568k = str4;
        this.f80569l = str5;
        this.f80570m = str6;
        this.f80571n = str7;
    }

    private double a(Date date) {
        return Math.abs(date.getTime() - this.f80558a.getTime()) / 1000.0d;
    }

    private long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f8 clone() {
        return new f8(this.f80564g, this.f80558a, this.f80559b, this.f80560c.get(), this.f80561d, this.f80562e, this.f80563f, this.f80565h, this.f80566i, this.f80567j, this.f80568k, this.f80569l, this.f80570m, this.f80571n);
    }

    public void c() {
        d(l.d());
    }

    public void d(Date date) {
        d1 d1VarA = this.f80572o.a();
        try {
            this.f80563f = null;
            if (this.f80564g == b.Ok) {
                this.f80564g = b.Exited;
            }
            if (date != null) {
                this.f80559b = date;
            } else {
                this.f80559b = l.d();
            }
            Date date2 = this.f80559b;
            if (date2 != null) {
                this.f80566i = Double.valueOf(a(date2));
                this.f80565h = Long.valueOf(i(this.f80559b));
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
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

    public int e() {
        return this.f80560c.get();
    }

    public String f() {
        return this.f80571n;
    }

    public Boolean g() {
        return this.f80563f;
    }

    public String h() {
        return this.f80570m;
    }

    public String j() {
        return this.f80562e;
    }

    public Date k() {
        Date date = this.f80558a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public b l() {
        return this.f80564g;
    }

    public boolean m() {
        return this.f80564g != b.Ok;
    }

    public void n() {
        this.f80563f = Boolean.TRUE;
    }

    public void o(Map<String, Object> map) {
        this.f80573p = map;
    }

    public boolean p(b bVar, String str, boolean z11) {
        return q(bVar, str, z11, null);
    }

    public boolean q(b bVar, String str, boolean z11, String str2) {
        boolean z12;
        d1 d1VarA = this.f80572o.a();
        boolean z13 = true;
        if (bVar != null) {
            try {
                this.f80564g = bVar;
                z12 = true;
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
        } else {
            z12 = false;
        }
        if (str != null) {
            this.f80568k = str;
            z12 = true;
        }
        if (z11) {
            this.f80560c.addAndGet(1);
            z12 = true;
        }
        if (str2 != null) {
            this.f80571n = str2;
        } else {
            z13 = z12;
        }
        if (z13) {
            this.f80563f = null;
            Date dateD = l.d();
            this.f80559b = dateD;
            if (dateD != null) {
                this.f80565h = Long.valueOf(i(dateD));
            }
        }
        if (d1VarA != null) {
            d1VarA.close();
        }
        return z13;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80562e != null) {
            j3Var.N("sid").w(this.f80562e);
        }
        if (this.f80561d != null) {
            j3Var.N("did").w(this.f80561d);
        }
        if (this.f80563f != null) {
            j3Var.N("init").W(this.f80563f);
        }
        j3Var.N("started").V(iLogger, this.f80558a);
        j3Var.N(PermissionsResponse.STATUS_KEY).V(iLogger, this.f80564g.name().toLowerCase(Locale.ROOT));
        if (this.f80565h != null) {
            j3Var.N("seq").U(this.f80565h);
        }
        j3Var.N("errors").D(this.f80560c.intValue());
        if (this.f80566i != null) {
            j3Var.N("duration").U(this.f80566i);
        }
        if (this.f80559b != null) {
            j3Var.N("timestamp").V(iLogger, this.f80559b);
        }
        if (this.f80571n != null) {
            j3Var.N("abnormal_mechanism").V(iLogger, this.f80571n);
        }
        j3Var.N("attrs");
        j3Var.h();
        j3Var.N("release").V(iLogger, this.f80570m);
        if (this.f80569l != null) {
            j3Var.N(AnalyticsAttribute.Environment).V(iLogger, this.f80569l);
        }
        if (this.f80567j != null) {
            j3Var.N("ip_address").V(iLogger, this.f80567j);
        }
        if (this.f80568k != null) {
            j3Var.N("user_agent").V(iLogger, this.f80568k);
        }
        j3Var.j();
        Map<String, Object> map = this.f80573p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80573p.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public f8(String str, io.sentry.protocol.i0 i0Var, String str2, String str3) {
        this(b.Ok, l.d(), l.d(), 0, str, d8.a(), Boolean.TRUE, null, null, i0Var != null ? i0Var.j() : null, null, str2, str3, null);
    }
}
