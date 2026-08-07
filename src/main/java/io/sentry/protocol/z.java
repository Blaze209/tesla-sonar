package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f81086d;

    public static final class a implements q1<z> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            z zVar = new z();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "raw_description":
                        zVar.f81085c = i3Var.a1();
                        break;
                    case "name":
                        zVar.f81083a = i3Var.a1();
                        break;
                    case "version":
                        zVar.f81084b = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            zVar.g(concurrentHashMap);
            i3Var.j();
            return zVar;
        }
    }

    public z() {
    }

    public String d() {
        return this.f81083a;
    }

    public String e() {
        return this.f81084b;
    }

    public void f(String str) {
        this.f81083a = str;
    }

    public void g(Map<String, Object> map) {
        this.f81086d = map;
    }

    public void h(String str) {
        this.f81084b = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81083a != null) {
            j3Var.N("name").w(this.f81083a);
        }
        if (this.f81084b != null) {
            j3Var.N("version").w(this.f81084b);
        }
        if (this.f81085c != null) {
            j3Var.N("raw_description").w(this.f81085c);
        }
        Map<String, Object> map = this.f81086d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81086d.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    z(z zVar) {
        this.f81083a = zVar.f81083a;
        this.f81084b = zVar.f81084b;
        this.f81085c = zVar.f81085c;
        this.f81086d = io.sentry.util.c.b(zVar.f81086d);
    }
}
