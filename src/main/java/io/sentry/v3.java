package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class v3 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f81505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f81506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Long f81507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f81508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f81509h;

    public static final class a implements q1<v3> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v3 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            v3 v3Var = new v3();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "relative_start_ns":
                        Long lR2 = i3Var.R2();
                        if (lR2 == null) {
                            break;
                        } else {
                            v3Var.f81505d = lR2;
                            break;
                        }
                        break;
                    case "relative_end_ns":
                        Long lR3 = i3Var.R2();
                        if (lR3 == null) {
                            break;
                        } else {
                            v3Var.f81506e = lR3;
                            break;
                        }
                        break;
                    case "id":
                        String strA1 = i3Var.a1();
                        if (strA1 == null) {
                            break;
                        } else {
                            v3Var.f81502a = strA1;
                            break;
                        }
                        break;
                    case "name":
                        String strA2 = i3Var.a1();
                        if (strA2 == null) {
                            break;
                        } else {
                            v3Var.f81504c = strA2;
                            break;
                        }
                        break;
                    case "trace_id":
                        String strA3 = i3Var.a1();
                        if (strA3 == null) {
                            break;
                        } else {
                            v3Var.f81503b = strA3;
                            break;
                        }
                        break;
                    case "relative_cpu_end_ms":
                        Long lR4 = i3Var.R2();
                        if (lR4 == null) {
                            break;
                        } else {
                            v3Var.f81508g = lR4;
                            break;
                        }
                        break;
                    case "relative_cpu_start_ms":
                        Long lR5 = i3Var.R2();
                        if (lR5 == null) {
                            break;
                        } else {
                            v3Var.f81507f = lR5;
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
            v3Var.l(concurrentHashMap);
            i3Var.j();
            return v3Var;
        }
    }

    public v3() {
        this(e3.s(), 0L, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3.class == obj.getClass()) {
            v3 v3Var = (v3) obj;
            if (this.f81502a.equals(v3Var.f81502a) && this.f81503b.equals(v3Var.f81503b) && this.f81504c.equals(v3Var.f81504c) && this.f81505d.equals(v3Var.f81505d) && this.f81507f.equals(v3Var.f81507f) && io.sentry.util.y.a(this.f81508g, v3Var.f81508g) && io.sentry.util.y.a(this.f81506e, v3Var.f81506e) && io.sentry.util.y.a(this.f81509h, v3Var.f81509h)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f81502a;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81502a, this.f81503b, this.f81504c, this.f81505d, this.f81506e, this.f81507f, this.f81508g, this.f81509h);
    }

    public String i() {
        return this.f81504c;
    }

    public String j() {
        return this.f81503b;
    }

    public void k(Long l11, Long l12, Long l13, Long l14) {
        if (this.f81506e == null) {
            this.f81506e = Long.valueOf(l11.longValue() - l12.longValue());
            this.f81505d = Long.valueOf(this.f81505d.longValue() - l12.longValue());
            this.f81508g = Long.valueOf(l13.longValue() - l14.longValue());
            this.f81507f = Long.valueOf(this.f81507f.longValue() - l14.longValue());
        }
    }

    public void l(Map<String, Object> map) {
        this.f81509h = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("id").V(iLogger, this.f81502a);
        j3Var.N("trace_id").V(iLogger, this.f81503b);
        j3Var.N("name").V(iLogger, this.f81504c);
        j3Var.N("relative_start_ns").V(iLogger, this.f81505d);
        j3Var.N("relative_end_ns").V(iLogger, this.f81506e);
        j3Var.N("relative_cpu_start_ms").V(iLogger, this.f81507f);
        j3Var.N("relative_cpu_end_ms").V(iLogger, this.f81508g);
        Map<String, Object> map = this.f81509h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81509h.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public v3(i1 i1Var, Long l11, Long l12) {
        this.f81502a = i1Var.i().toString();
        this.f81503b = i1Var.e().p().toString();
        this.f81504c = i1Var.getName().isEmpty() ? "unknown" : i1Var.getName();
        this.f81505d = l11;
        this.f81507f = l12;
    }
}
