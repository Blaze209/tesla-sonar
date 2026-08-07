package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80869c;

    public static final class a implements q1<b> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            b bVar = new b();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("name")) {
                    bVar.f80867a = i3Var.a1();
                } else if (strL.equals("version")) {
                    bVar.f80868b = i3Var.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            bVar.c(concurrentHashMap);
            i3Var.j();
            return bVar;
        }
    }

    public b() {
    }

    public void c(Map<String, Object> map) {
        this.f80869c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (io.sentry.util.y.a(this.f80867a, bVar.f80867a) && io.sentry.util.y.a(this.f80868b, bVar.f80868b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80867a, this.f80868b);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80867a != null) {
            j3Var.N("name").w(this.f80867a);
        }
        if (this.f80868b != null) {
            j3Var.N("version").w(this.f80868b);
        }
        Map<String, Object> map = this.f80869c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80869c.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    b(b bVar) {
        this.f80867a = bVar.f80867a;
        this.f80868b = bVar.f80868b;
        this.f80869c = io.sentry.util.c.b(bVar.f80869c);
    }
}
