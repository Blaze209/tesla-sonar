package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Number f80988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80990c;

    public static final class a implements q1<k> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            Number number = null;
            String strA1 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("unit")) {
                    strA1 = i3Var.a1();
                } else if (strL.equals("value")) {
                    number = (Number) i3Var.z3();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            i3Var.j();
            if (number != null) {
                k kVar = new k(number, strA1);
                kVar.a(concurrentHashMap);
                return kVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(b7.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public k(Number number, String str) {
        this.f80988a = number;
        this.f80989b = str;
    }

    public void a(Map<String, Object> map) {
        this.f80990c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("value").U(this.f80988a);
        if (this.f80989b != null) {
            j3Var.N("unit").w(this.f80989b);
        }
        Map<String, Object> map = this.f80990c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80990c.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }
}
