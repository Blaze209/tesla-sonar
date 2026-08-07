package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.l;
import io.sentry.q1;
import io.sentry.util.y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f80836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f80837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f80839d;

    public static final class a implements q1<b> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(i3 i3Var, ILogger iLogger) {
            Double dValueOf;
            i3Var.h();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "elapsed_since_start_ns":
                        String strA1 = i3Var.a1();
                        if (strA1 == null) {
                            break;
                        } else {
                            bVar.f80838c = strA1;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = i3Var.j2();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateM0 = i3Var.m0(iLogger);
                            dValueOf = dateM0 != null ? Double.valueOf(l.b(dateM0)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            bVar.f80837b = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dJ2 = i3Var.j2();
                        if (dJ2 == null) {
                            break;
                        } else {
                            bVar.f80839d = dJ2.doubleValue();
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
            bVar.e(concurrentHashMap);
            i3Var.j();
            return bVar;
        }
    }

    public b() {
        this(0L, 0, 0L);
    }

    private BigDecimal d(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map<String, Object> map) {
        this.f80836a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (y.a(this.f80836a, bVar.f80836a) && this.f80838c.equals(bVar.f80838c) && this.f80839d == bVar.f80839d && this.f80837b == bVar.f80837b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return y.b(this.f80836a, this.f80838c, Double.valueOf(this.f80839d));
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("value").V(iLogger, Double.valueOf(this.f80839d));
        j3Var.N("elapsed_since_start_ns").V(iLogger, this.f80838c);
        j3Var.N("timestamp").V(iLogger, d(Double.valueOf(this.f80837b)));
        Map<String, Object> map = this.f80836a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80836a.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public b(Long l11, Number number, long j11) {
        this.f80838c = l11.toString();
        this.f80839d = number.doubleValue();
        this.f80837b = l.m(j11);
    }
}
