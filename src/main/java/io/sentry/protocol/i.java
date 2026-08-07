package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f80966d;

    public static final class a implements q1<i> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            i iVar = new i();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "region":
                        iVar.f80965c = i3Var.a1();
                        break;
                    case "city":
                        iVar.f80963a = i3Var.a1();
                        break;
                    case "country_code":
                        iVar.f80964b = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            iVar.g(concurrentHashMap);
            i3Var.j();
            return iVar;
        }
    }

    public void d(String str) {
        this.f80963a = str;
    }

    public void e(String str) {
        this.f80964b = str;
    }

    public void f(String str) {
        this.f80965c = str;
    }

    public void g(Map<String, Object> map) {
        this.f80966d = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80963a != null) {
            j3Var.N("city").w(this.f80963a);
        }
        if (this.f80964b != null) {
            j3Var.N("country_code").w(this.f80964b);
        }
        if (this.f80965c != null) {
            j3Var.N("region").w(this.f80965c);
        }
        Map<String, Object> map = this.f80966d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80966d.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }
}
