package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<k0> f80986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f80987c;

    public static final class a implements q1<j0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j0 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strA1 = null;
            List listG1 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("rendering_system")) {
                    strA1 = i3Var.a1();
                } else if (strL.equals("windows")) {
                    listG1 = i3Var.G1(iLogger, new k0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            j0 j0Var = new j0(strA1, listG1);
            j0Var.a(map);
            return j0Var;
        }
    }

    public j0(String str, List<k0> list) {
        this.f80985a = str;
        this.f80986b = list;
    }

    public void a(Map<String, Object> map) {
        this.f80987c = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80985a != null) {
            j3Var.N("rendering_system").w(this.f80985a);
        }
        if (this.f80986b != null) {
            j3Var.N("windows").V(iLogger, this.f80986b);
        }
        Map<String, Object> map = this.f80987c;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80987c.get(str));
            }
        }
        j3Var.j();
    }
}
