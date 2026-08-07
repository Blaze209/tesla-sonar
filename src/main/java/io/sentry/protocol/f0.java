package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f80950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f80951b;

    public static final class a implements q1<f0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            f0 f0Var = new f0();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("active_profiles")) {
                    List list = (List) i3Var.z3();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        f0Var.f80950a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    i3Var.a3(iLogger, concurrentHashMap, strL);
                }
            }
            f0Var.b(concurrentHashMap);
            i3Var.j();
            return f0Var;
        }
    }

    public f0() {
    }

    public void b(Map<String, Object> map) {
        this.f80951b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f80950a, ((f0) obj).f80950a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f80950a);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80950a != null) {
            j3Var.N("active_profiles").V(iLogger, this.f80950a);
        }
        Map<String, Object> map = this.f80951b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80951b.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public f0(f0 f0Var) {
        this.f80950a = f0Var.f80950a;
        this.f80951b = io.sentry.util.c.b(f0Var.f80951b);
    }
}
