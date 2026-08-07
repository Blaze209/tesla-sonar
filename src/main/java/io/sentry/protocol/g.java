package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<f> f80952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f80953b;

    public static final class a implements q1<g> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("values")) {
                    arrayList = i3Var.G1(iLogger, new f.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            g gVar = new g(arrayList);
            gVar.b(concurrentHashMap);
            i3Var.j();
            return gVar;
        }
    }

    public g() {
        this.f80952a = new ArrayList();
    }

    public List<f> a() {
        return this.f80952a;
    }

    public void b(Map<String, Object> map) {
        this.f80953b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.y.a(this.f80952a, ((g) obj).f80952a);
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80952a);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("values").V(iLogger, this.f80952a);
        Map<String, Object> map = this.f80953b;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80953b.get(str));
            }
        }
        j3Var.j();
    }

    public g(List<f> list) {
        this.f80952a = list;
    }
}
