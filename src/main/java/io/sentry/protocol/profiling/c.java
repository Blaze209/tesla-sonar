package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f81055c;

    public static final class a implements q1<c> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            c cVar = new c();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("priority")) {
                    cVar.f81054b = i3Var.nextInt();
                } else if (strL.equals("name")) {
                    cVar.f81053a = i3Var.a1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            cVar.c(map);
            i3Var.j();
            return cVar;
        }
    }

    public void c(Map<String, Object> map) {
        this.f81055c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81053a != null) {
            j3Var.N("name").V(iLogger, this.f81053a);
        }
        j3Var.N("priority").V(iLogger, Integer.valueOf(this.f81054b));
        Map<String, Object> map = this.f81055c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81055c.get(str));
            }
        }
        j3Var.j();
    }
}
