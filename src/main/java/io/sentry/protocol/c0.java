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
public final class c0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<b0> f80895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f80896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f80897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f80898d;

    public static final class a implements q1<c0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a(i3 i3Var, ILogger iLogger) {
            c0 c0Var = new c0();
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "frames":
                        c0Var.f80895a = i3Var.G1(iLogger, new b0.a());
                        break;
                    case "registers":
                        c0Var.f80896b = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "snapshot":
                        c0Var.f80897c = i3Var.o0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            c0Var.g(concurrentHashMap);
            i3Var.j();
            return c0Var;
        }
    }

    public c0() {
    }

    public List<b0> d() {
        return this.f80895a;
    }

    public void e(List<b0> list) {
        this.f80895a = list;
    }

    public void f(Boolean bool) {
        this.f80897c = bool;
    }

    public void g(Map<String, Object> map) {
        this.f80898d = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80895a != null) {
            j3Var.N("frames").V(iLogger, this.f80895a);
        }
        if (this.f80896b != null) {
            j3Var.N("registers").V(iLogger, this.f80896b);
        }
        if (this.f80897c != null) {
            j3Var.N("snapshot").W(this.f80897c);
        }
        Map<String, Object> map = this.f80898d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80898d.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public c0(List<b0> list) {
        this.f80895a = list;
    }
}
