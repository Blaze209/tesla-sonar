package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.util.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f80833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection<b> f80835c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C1701a implements q1<a> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("values")) {
                    List listG1 = i3Var.G1(iLogger, new b.a());
                    if (listG1 != null) {
                        aVar.f80835c = listG1;
                    }
                } else if (strL.equals("unit")) {
                    String strA1 = i3Var.a1();
                    if (strA1 != null) {
                        aVar.f80834b = strA1;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            aVar.c(concurrentHashMap);
            i3Var.j();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map<String, Object> map) {
        this.f80833a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (y.a(this.f80833a, aVar.f80833a) && this.f80834b.equals(aVar.f80834b) && new ArrayList(this.f80835c).equals(new ArrayList(aVar.f80835c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return y.b(this.f80833a, this.f80834b, this.f80835c);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("unit").V(iLogger, this.f80834b);
        j3Var.N("values").V(iLogger, this.f80835c);
        Map<String, Object> map = this.f80833a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80833a.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public a(String str, Collection<b> collection) {
        this.f80834b = str;
        this.f80835c = collection;
    }
}
