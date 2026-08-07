package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f81049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f81052d;

    public static final class a implements q1<b> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            b bVar = new b();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "thread_id":
                        bVar.f81051c = i3Var.a1();
                        break;
                    case "timestamp":
                        bVar.f81049a = i3Var.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f81050b = i3Var.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            bVar.e(map);
            i3Var.j();
            return bVar;
        }
    }

    private BigDecimal d(Double d11) {
        return BigDecimal.valueOf(d11.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void e(Map<String, Object> map) {
        this.f81052d = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("timestamp").V(iLogger, d(Double.valueOf(this.f81049a)));
        j3Var.N("stack_id").V(iLogger, Integer.valueOf(this.f81050b));
        if (this.f81051c != null) {
            j3Var.N("thread_id").V(iLogger, this.f81051c);
        }
        Map<String, Object> map = this.f81052d;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81052d.get(str));
            }
        }
        j3Var.j();
    }
}
