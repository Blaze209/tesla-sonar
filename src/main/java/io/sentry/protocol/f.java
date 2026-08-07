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
public final class f implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f80948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80949c;

    public static final class a implements q1<f> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strA1 = null;
            Boolean boolO0 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("result")) {
                    boolO0 = i3Var.o0();
                } else if (strL.equals("flag")) {
                    strA1 = i3Var.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            if (strA1 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.a(b7.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolO0 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.a(b7.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            f fVar = new f(strA1, boolO0.booleanValue());
            fVar.c(concurrentHashMap);
            i3Var.j();
            return fVar;
        }
    }

    public f(String str, boolean z11) {
        this.f80947a = str;
        this.f80948b = z11;
    }

    public String a() {
        return this.f80947a;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f80948b);
    }

    public void c(Map<String, Object> map) {
        this.f80949c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (io.sentry.util.y.a(this.f80947a, fVar.f80947a) && io.sentry.util.y.a(Boolean.valueOf(this.f80948b), Boolean.valueOf(fVar.f80948b))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80947a, Boolean.valueOf(this.f80948b));
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("flag").w(this.f80947a);
        j3Var.N("result").K(this.f80948b);
        Map<String, Object> map = this.f80949c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80949c.get(str));
            }
        }
        j3Var.j();
    }
}
