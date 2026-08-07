package io.sentry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class f7 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<d7> f80556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f80557b;

    public static final class a implements q1<f7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f7 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            List listG1 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                if (strL.equals("items")) {
                    listG1 = i3Var.G1(iLogger, new d7.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    i3Var.a3(iLogger, map, strL);
                }
            }
            i3Var.j();
            if (listG1 != null) {
                f7 f7Var = new f7(listG1);
                f7Var.b(map);
                return f7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.a(b7.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public f7(List<d7> list) {
        this.f80556a = list;
    }

    public List<d7> a() {
        return this.f80556a;
    }

    public void b(Map<String, Object> map) {
        this.f80557b = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("items").V(iLogger, this.f80556a);
        Map<String, Object> map = this.f80557b;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80557b.get(str));
            }
        }
        j3Var.j();
    }
}
