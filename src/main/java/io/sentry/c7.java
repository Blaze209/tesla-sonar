package io.sentry;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class c7 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f80316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f80320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f80321f;

    public static final class a implements q1<c7> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c7 a(i3 i3Var, ILogger iLogger) {
            c7 c7Var = new c7();
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "package_name":
                        c7Var.f80318c = i3Var.a1();
                        break;
                    case "thread_id":
                        c7Var.f80320e = i3Var.R2();
                        break;
                    case "address":
                        c7Var.f80317b = i3Var.a1();
                        break;
                    case "class_name":
                        c7Var.f80319d = i3Var.a1();
                        break;
                    case "type":
                        c7Var.f80316a = i3Var.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            c7Var.m(concurrentHashMap);
            i3Var.j();
            return c7Var;
        }
    }

    public c7() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c7.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.y.a(this.f80317b, ((c7) obj).f80317b);
    }

    public String f() {
        return this.f80317b;
    }

    public int g() {
        return this.f80316a;
    }

    public void h(String str) {
        this.f80317b = str;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80317b);
    }

    public void i(String str) {
        this.f80319d = str;
    }

    public void j(String str) {
        this.f80318c = str;
    }

    public void k(Long l11) {
        this.f80320e = l11;
    }

    public void l(int i11) {
        this.f80316a = i11;
    }

    public void m(Map<String, Object> map) {
        this.f80321f = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("type").D(this.f80316a);
        if (this.f80317b != null) {
            j3Var.N(PlaceTypes.ADDRESS).w(this.f80317b);
        }
        if (this.f80318c != null) {
            j3Var.N("package_name").w(this.f80318c);
        }
        if (this.f80319d != null) {
            j3Var.N("class_name").w(this.f80319d);
        }
        if (this.f80320e != null) {
            j3Var.N("thread_id").U(this.f80320e);
        }
        Map<String, Object> map = this.f80321f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80321f.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public c7(c7 c7Var) {
        this.f80316a = c7Var.f80316a;
        this.f80317b = c7Var.f80317b;
        this.f80318c = c7Var.f80318c;
        this.f80319d = c7Var.f80319d;
        this.f80320e = c7Var.f80320e;
        this.f80321f = io.sentry.util.c.b(c7Var.f80321f);
    }
}
