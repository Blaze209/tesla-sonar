package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f80955b;

    public static final class a implements q1<g0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g0 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strA1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("source")) {
                    strA1 = i3Var.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            g0 g0Var = new g0(strA1);
            g0Var.a(concurrentHashMap);
            i3Var.j();
            return g0Var;
        }
    }

    public g0(String str) {
        this.f80954a = str;
    }

    public void a(Map<String, Object> map) {
        this.f80955b = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80954a != null) {
            j3Var.N("source").V(iLogger, this.f80954a);
        }
        Map<String, Object> map = this.f80955b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80955b.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }
}
