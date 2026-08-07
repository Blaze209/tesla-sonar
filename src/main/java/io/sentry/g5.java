package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class g5 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f80592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Double f80593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f80594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Double f80595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f80596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f80597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f80598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f80599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f80600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f80601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f80602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    s3 f80603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f80604m;

    public static final class a implements q1<g5> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g5 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            g5 g5Var = new g5();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "is_enable_app_start_profiling":
                        Boolean boolO0 = i3Var.o0();
                        if (boolO0 != null) {
                            g5Var.f80601j = boolO0.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolO1 = i3Var.o0();
                        if (boolO1 != null) {
                            g5Var.f80594c = boolO1.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strA1 = i3Var.a1();
                        if (strA1 != null) {
                            g5Var.f80596e = strA1;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolO2 = i3Var.o0();
                        if (boolO2 != null) {
                            g5Var.f80598g = boolO2.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolO3 = i3Var.o0();
                        if (boolO3 != null) {
                            g5Var.f80597f = boolO3.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolO4 = i3Var.o0();
                        if (boolO4 != null) {
                            g5Var.f80602k = boolO4.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolO5 = i3Var.o0();
                        if (boolO5 != null) {
                            g5Var.f80592a = boolO5.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strA2 = i3Var.a1();
                        if (strA2 != null) {
                            try {
                                g5Var.f80603l = s3.valueOf(strA2);
                            } catch (IllegalArgumentException unused) {
                                iLogger.c(b7.ERROR, "Error when deserializing ProfileLifecycle: " + strA2, new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolO6 = i3Var.o0();
                        if (boolO6 != null) {
                            g5Var.f80600i = boolO6.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numN2 = i3Var.N2();
                        if (numN2 != null) {
                            g5Var.f80599h = numN2.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dJ2 = i3Var.j2();
                        if (dJ2 != null) {
                            g5Var.f80595d = dJ2;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dJ3 = i3Var.j2();
                        if (dJ3 != null) {
                            g5Var.f80593b = dJ3;
                            break;
                        } else {
                            break;
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
            g5Var.m(concurrentHashMap);
            i3Var.j();
            return g5Var;
        }
    }

    public g5() {
        this.f80594c = false;
        this.f80595d = null;
        this.f80592a = false;
        this.f80593b = null;
        this.f80600i = false;
        this.f80596e = null;
        this.f80597f = false;
        this.f80598g = false;
        this.f80603l = s3.MANUAL;
        this.f80599h = 0;
        this.f80601j = true;
        this.f80602k = false;
    }

    public s3 a() {
        return this.f80603l;
    }

    public Double b() {
        return this.f80593b;
    }

    public String c() {
        return this.f80596e;
    }

    public int d() {
        return this.f80599h;
    }

    public Double e() {
        return this.f80595d;
    }

    public boolean f() {
        return this.f80600i;
    }

    public boolean g() {
        return this.f80598g;
    }

    public boolean h() {
        return this.f80601j;
    }

    public boolean i() {
        return this.f80592a;
    }

    public boolean j() {
        return this.f80597f;
    }

    public boolean k() {
        return this.f80602k;
    }

    public boolean l() {
        return this.f80594c;
    }

    public void m(Map<String, Object> map) {
        this.f80604m = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("profile_sampled").V(iLogger, Boolean.valueOf(this.f80592a));
        j3Var.N("profile_sample_rate").V(iLogger, this.f80593b);
        j3Var.N("continuous_profile_sampled").V(iLogger, Boolean.valueOf(this.f80600i));
        j3Var.N("trace_sampled").V(iLogger, Boolean.valueOf(this.f80594c));
        j3Var.N("trace_sample_rate").V(iLogger, this.f80595d);
        j3Var.N("profiling_traces_dir_path").V(iLogger, this.f80596e);
        j3Var.N("is_profiling_enabled").V(iLogger, Boolean.valueOf(this.f80597f));
        j3Var.N("is_continuous_profiling_enabled").V(iLogger, Boolean.valueOf(this.f80598g));
        j3Var.N("profile_lifecycle").V(iLogger, this.f80603l.name());
        j3Var.N("profiling_traces_hz").V(iLogger, Integer.valueOf(this.f80599h));
        j3Var.N("is_enable_app_start_profiling").V(iLogger, Boolean.valueOf(this.f80601j));
        j3Var.N("is_start_profiler_on_app_start").V(iLogger, Boolean.valueOf(this.f80602k));
        Map<String, Object> map = this.f80604m;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80604m.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    g5(q7 q7Var, y8 y8Var) {
        this.f80594c = y8Var.e().booleanValue();
        this.f80595d = y8Var.d();
        this.f80592a = y8Var.b().booleanValue();
        this.f80593b = y8Var.a();
        this.f80600i = q7Var.getInternalTracesSampler().c(io.sentry.util.d0.a().c());
        this.f80596e = q7Var.getProfilingTracesDirPath();
        this.f80597f = q7Var.isProfilingEnabled();
        this.f80598g = q7Var.isContinuousProfilingEnabled();
        this.f80603l = q7Var.getProfileLifecycle();
        this.f80599h = q7Var.getProfilingTracesHz();
        this.f80601j = q7Var.isEnableAppStartProfiling();
        this.f80602k = q7Var.isStartProfilerOnAppStart();
    }
}
