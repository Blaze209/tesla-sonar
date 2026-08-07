package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class r3 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.sentry.protocol.x f81150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f81151b;

    public static final class a implements q1<r3> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r3 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            r3 r3Var = new r3();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("profiler_id")) {
                    io.sentry.protocol.x xVar = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                    if (xVar != null) {
                        r3Var.f81150a = xVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            r3Var.b(concurrentHashMap);
            i3Var.j();
            return r3Var;
        }
    }

    public r3() {
        this(io.sentry.protocol.x.f81078b);
    }

    public void b(Map<String, Object> map) {
        this.f81151b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r3) {
            return this.f81150a.equals(((r3) obj).f81150a);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f81150a);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("profiler_id").V(iLogger, this.f81150a);
        Map<String, Object> map = this.f81151b;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81151b.get(str));
            }
        }
        j3Var.j();
    }

    public r3(io.sentry.protocol.x xVar) {
        this.f81150a = xVar;
    }

    public r3(r3 r3Var) {
        this.f81150a = r3Var.f81150a;
        Map<String, Object> mapB = io.sentry.util.c.b(r3Var.f81151b);
        if (mapB != null) {
            this.f81151b = mapB;
        }
    }
}
