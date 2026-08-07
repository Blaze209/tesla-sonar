package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f81017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f81018d;

    public static final class a implements q1<m> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "params":
                        List list = (List) i3Var.z3();
                        if (list == null) {
                            break;
                        } else {
                            mVar.f81017c = list;
                            break;
                        }
                        break;
                    case "message":
                        mVar.f81016b = i3Var.a1();
                        break;
                    case "formatted":
                        mVar.f81015a = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            mVar.g(concurrentHashMap);
            i3Var.j();
            return mVar;
        }
    }

    public String d() {
        return this.f81015a;
    }

    public String e() {
        return this.f81016b;
    }

    public void f(String str) {
        this.f81015a = str;
    }

    public void g(Map<String, Object> map) {
        this.f81018d = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81015a != null) {
            j3Var.N("formatted").w(this.f81015a);
        }
        if (this.f81016b != null) {
            j3Var.N("message").w(this.f81016b);
        }
        List<String> list = this.f81017c;
        if (list != null && !list.isEmpty()) {
            j3Var.N("params").V(iLogger, this.f81017c);
        }
        Map<String, Object> map = this.f81018d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81018d.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }
}
