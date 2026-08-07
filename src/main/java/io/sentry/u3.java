package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.math.ec.Tnaf;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
public final class u3 implements a2 {
    private final Map<String, io.sentry.profilemeasurements.a> A;
    private String B;
    private Map<String, Object> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f81413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable<List<Integer>> f81414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f81416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f81419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f81420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f81421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f81422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f81423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Integer> f81424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f81425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f81426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f81427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<v3> f81428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f81429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f81430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f81431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f81432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f81433u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f81434v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f81435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f81436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f81437y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Date f81438z;

    public static final class b implements q1<u3> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u3 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            u3 u3Var = new u3();
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                byte b11 = -1;
                switch (strL.hashCode()) {
                    case -2133529830:
                        if (strL.equals("device_manufacturer")) {
                            b11 = 0;
                        }
                        break;
                    case -1981468849:
                        if (strL.equals("android_api_level")) {
                            b11 = 1;
                        }
                        break;
                    case -1430655860:
                        if (strL.equals("build_id")) {
                            b11 = 2;
                        }
                        break;
                    case -1172160413:
                        if (strL.equals("device_locale")) {
                            b11 = 3;
                        }
                        break;
                    case -1102636175:
                        if (strL.equals("profile_id")) {
                            b11 = 4;
                        }
                        break;
                    case -716656436:
                        if (strL.equals("device_os_build_number")) {
                            b11 = 5;
                        }
                        break;
                    case -591076352:
                        if (strL.equals("device_model")) {
                            b11 = 6;
                        }
                        break;
                    case -512511455:
                        if (strL.equals("device_is_emulator")) {
                            b11 = 7;
                        }
                        break;
                    case -478065584:
                        if (strL.equals("duration_ns")) {
                            b11 = 8;
                        }
                        break;
                    case -362243017:
                        if (strL.equals("measurements")) {
                            b11 = 9;
                        }
                        break;
                    case -332426004:
                        if (strL.equals("device_physical_memory_bytes")) {
                            b11 = 10;
                        }
                        break;
                    case -212264198:
                        if (strL.equals("device_cpu_frequencies")) {
                            b11 = 11;
                        }
                        break;
                    case -102985484:
                        if (strL.equals("version_code")) {
                            b11 = 12;
                        }
                        break;
                    case -102670958:
                        if (strL.equals("version_name")) {
                            b11 = 13;
                        }
                        break;
                    case -85904877:
                        if (strL.equals(AnalyticsAttribute.Environment)) {
                            b11 = 14;
                        }
                        break;
                    case 55126294:
                        if (strL.equals("timestamp")) {
                            b11 = 15;
                        }
                        break;
                    case 508853068:
                        if (strL.equals("transaction_name")) {
                            b11 = Tnaf.POW_2_WIDTH;
                        }
                        break;
                    case 796476189:
                        if (strL.equals("device_os_name")) {
                            b11 = 17;
                        }
                        break;
                    case 839674195:
                        if (strL.equals("architecture")) {
                            b11 = 18;
                        }
                        break;
                    case 1010584092:
                        if (strL.equals("transaction_id")) {
                            b11 = 19;
                        }
                        break;
                    case 1052553990:
                        if (strL.equals("device_os_version")) {
                            b11 = 20;
                        }
                        break;
                    case 1163928186:
                        if (strL.equals("truncation_reason")) {
                            b11 = 21;
                        }
                        break;
                    case 1270300245:
                        if (strL.equals("trace_id")) {
                            b11 = 22;
                        }
                        break;
                    case 1874684019:
                        if (strL.equals("platform")) {
                            b11 = 23;
                        }
                        break;
                    case 1953158756:
                        if (strL.equals("sampled_profile")) {
                            b11 = 24;
                        }
                        break;
                    case 1954122069:
                        if (strL.equals("transactions")) {
                            b11 = 25;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        String strA1 = i3Var.a1();
                        if (strA1 != null) {
                            u3Var.f81417e = strA1;
                        }
                        break;
                    case 1:
                        Integer numN2 = i3Var.N2();
                        if (numN2 != null) {
                            u3Var.f81415c = numN2.intValue();
                        }
                        break;
                    case 2:
                        String strA2 = i3Var.a1();
                        if (strA2 != null) {
                            u3Var.f81427o = strA2;
                        }
                        break;
                    case 3:
                        String strA3 = i3Var.a1();
                        if (strA3 != null) {
                            u3Var.f81416d = strA3;
                        }
                        break;
                    case 4:
                        String strA4 = i3Var.a1();
                        if (strA4 != null) {
                            u3Var.f81435w = strA4;
                        }
                        break;
                    case 5:
                        String strA5 = i3Var.a1();
                        if (strA5 != null) {
                            u3Var.f81419g = strA5;
                        }
                        break;
                    case 6:
                        String strA6 = i3Var.a1();
                        if (strA6 != null) {
                            u3Var.f81418f = strA6;
                        }
                        break;
                    case 7:
                        Boolean boolO0 = i3Var.o0();
                        if (boolO0 != null) {
                            u3Var.f81422j = boolO0.booleanValue();
                        }
                        break;
                    case 8:
                        String strA7 = i3Var.a1();
                        if (strA7 != null) {
                            u3Var.f81430r = strA7;
                        }
                        break;
                    case 9:
                        Map mapY2 = i3Var.Y2(iLogger, new io.sentry.profilemeasurements.a.C1701a());
                        if (mapY2 != null) {
                            u3Var.A.putAll(mapY2);
                        }
                        break;
                    case 10:
                        String strA8 = i3Var.a1();
                        if (strA8 != null) {
                            u3Var.f81425m = strA8;
                        }
                        break;
                    case 11:
                        List list = (List) i3Var.z3();
                        if (list != null) {
                            u3Var.f81424l = list;
                        }
                        break;
                    case 12:
                        String strA9 = i3Var.a1();
                        if (strA9 != null) {
                            u3Var.f81431s = strA9;
                        }
                        break;
                    case 13:
                        String strA10 = i3Var.a1();
                        if (strA10 != null) {
                            u3Var.f81432t = strA10;
                        }
                        break;
                    case 14:
                        String strA11 = i3Var.a1();
                        if (strA11 != null) {
                            u3Var.f81436x = strA11;
                        }
                        break;
                    case 15:
                        Date dateM0 = i3Var.m0(iLogger);
                        if (dateM0 != null) {
                            u3Var.f81438z = dateM0;
                        }
                        break;
                    case 16:
                        String strA12 = i3Var.a1();
                        if (strA12 != null) {
                            u3Var.f81429q = strA12;
                        }
                        break;
                    case 17:
                        String strA13 = i3Var.a1();
                        if (strA13 != null) {
                            u3Var.f81420h = strA13;
                        }
                        break;
                    case 18:
                        String strA14 = i3Var.a1();
                        if (strA14 != null) {
                            u3Var.f81423k = strA14;
                        }
                        break;
                    case 19:
                        String strA15 = i3Var.a1();
                        if (strA15 != null) {
                            u3Var.f81433u = strA15;
                        }
                        break;
                    case 20:
                        String strA16 = i3Var.a1();
                        if (strA16 != null) {
                            u3Var.f81421i = strA16;
                        }
                        break;
                    case 21:
                        String strA17 = i3Var.a1();
                        if (strA17 != null) {
                            u3Var.f81437y = strA17;
                        }
                        break;
                    case 22:
                        String strA18 = i3Var.a1();
                        if (strA18 != null) {
                            u3Var.f81434v = strA18;
                        }
                        break;
                    case 23:
                        String strA19 = i3Var.a1();
                        if (strA19 != null) {
                            u3Var.f81426n = strA19;
                        }
                        break;
                    case 24:
                        String strA20 = i3Var.a1();
                        if (strA20 != null) {
                            u3Var.B = strA20;
                        }
                        break;
                    case 25:
                        List listG1 = i3Var.G1(iLogger, new v3.a());
                        if (listG1 != null) {
                            u3Var.f81428p.addAll(listG1);
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            u3Var.G(concurrentHashMap);
            i3Var.j();
            return u3Var;
        }
    }

    private boolean D() {
        return this.f81437y.equals("normal") || this.f81437y.equals("timeout") || this.f81437y.equals("backgrounded");
    }

    public static /* synthetic */ List a() {
        return new ArrayList();
    }

    public String B() {
        return this.f81435w;
    }

    public File C() {
        return this.f81413a;
    }

    public void E() {
        try {
            this.f81424l = this.f81414b.call();
        } catch (Throwable unused) {
        }
    }

    public void F(String str) {
        this.B = str;
    }

    public void G(Map<String, Object> map) {
        this.C = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("android_api_level").V(iLogger, Integer.valueOf(this.f81415c));
        j3Var.N("device_locale").V(iLogger, this.f81416d);
        j3Var.N("device_manufacturer").w(this.f81417e);
        j3Var.N("device_model").w(this.f81418f);
        j3Var.N("device_os_build_number").w(this.f81419g);
        j3Var.N("device_os_name").w(this.f81420h);
        j3Var.N("device_os_version").w(this.f81421i);
        j3Var.N("device_is_emulator").K(this.f81422j);
        j3Var.N("architecture").V(iLogger, this.f81423k);
        j3Var.N("device_cpu_frequencies").V(iLogger, this.f81424l);
        j3Var.N("device_physical_memory_bytes").w(this.f81425m);
        j3Var.N("platform").w(this.f81426n);
        j3Var.N("build_id").w(this.f81427o);
        j3Var.N("transaction_name").w(this.f81429q);
        j3Var.N("duration_ns").w(this.f81430r);
        j3Var.N("version_name").w(this.f81432t);
        j3Var.N("version_code").w(this.f81431s);
        if (!this.f81428p.isEmpty()) {
            j3Var.N("transactions").V(iLogger, this.f81428p);
        }
        j3Var.N("transaction_id").w(this.f81433u);
        j3Var.N("trace_id").w(this.f81434v);
        j3Var.N("profile_id").w(this.f81435w);
        j3Var.N(AnalyticsAttribute.Environment).w(this.f81436x);
        j3Var.N("truncation_reason").w(this.f81437y);
        if (this.B != null) {
            j3Var.N("sampled_profile").w(this.B);
        }
        String strO = j3Var.O();
        j3Var.T("");
        j3Var.N("measurements").V(iLogger, this.A);
        j3Var.T(strO);
        j3Var.N("timestamp").V(iLogger, this.f81438z);
        Map<String, Object> map = this.C;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.C.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    private u3() {
        this(new File("dummy"), e3.s());
    }

    public u3(File file, i1 i1Var) {
        this(file, l.d(), new ArrayList(), i1Var.getName(), i1Var.i().toString(), i1Var.e().p().toString(), WebrtcBuildVersion.maint_version, 0, "", new Callable() { // from class: io.sentry.t3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return u3.a();
            }
        }, null, null, null, null, null, null, null, null, "normal", new HashMap());
    }

    public u3(File file, Date date, List<v3> list, String str, String str2, String str3, String str4, int i11, String str5, Callable<List<Integer>> callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map<String, io.sentry.profilemeasurements.a> map) {
        this.f81424l = new ArrayList();
        this.B = null;
        this.f81413a = file;
        this.f81438z = date;
        this.f81423k = str5;
        this.f81414b = callable;
        this.f81415c = i11;
        this.f81416d = Locale.getDefault().toString();
        this.f81417e = str6 == null ? "" : str6;
        this.f81418f = str7 == null ? "" : str7;
        this.f81421i = str8 == null ? "" : str8;
        this.f81422j = bool != null ? bool.booleanValue() : false;
        this.f81425m = str9 != null ? str9 : WebrtcBuildVersion.maint_version;
        this.f81419g = "";
        this.f81420h = "android";
        this.f81426n = "android";
        this.f81427o = str10 != null ? str10 : "";
        this.f81428p = list;
        this.f81429q = str.isEmpty() ? "unknown" : str;
        this.f81430r = str4;
        this.f81431s = "";
        this.f81432t = str11 != null ? str11 : "";
        this.f81433u = str2;
        this.f81434v = str3;
        this.f81435w = d8.a();
        this.f81436x = str12 != null ? str12 : "production";
        this.f81437y = str13;
        if (!D()) {
            this.f81437y = "normal";
        }
        this.A = map;
    }
}
