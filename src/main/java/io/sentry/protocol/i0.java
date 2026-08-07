package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    private String f80971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f80972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f80973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, Object> f80974h;

    public static final class a implements q1<i0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            i0 i0Var = new i0();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "username":
                        i0Var.f80969c = i3Var.a1();
                        break;
                    case "id":
                        i0Var.f80968b = i3Var.a1();
                        break;
                    case "geo":
                        i0Var.f80972f = new i.a().a(i3Var, iLogger);
                        break;
                    case "data":
                        i0Var.f80973g = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "name":
                        i0Var.f80971e = i3Var.a1();
                        break;
                    case "email":
                        i0Var.f80967a = i3Var.a1();
                        break;
                    case "ip_address":
                        i0Var.f80970d = i3Var.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            i0Var.q(concurrentHashMap);
            i3Var.j();
            return i0Var;
        }
    }

    public i0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (io.sentry.util.y.a(this.f80967a, i0Var.f80967a) && io.sentry.util.y.a(this.f80968b, i0Var.f80968b) && io.sentry.util.y.a(this.f80969c, i0Var.f80969c) && io.sentry.util.y.a(this.f80970d, i0Var.f80970d)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        return this.f80967a;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80967a, this.f80968b, this.f80969c, this.f80970d);
    }

    public String i() {
        return this.f80968b;
    }

    public String j() {
        return this.f80970d;
    }

    public String k() {
        return this.f80969c;
    }

    public void l(Map<String, String> map) {
        this.f80973g = io.sentry.util.c.b(map);
    }

    public void m(String str) {
        this.f80967a = str;
    }

    public void n(i iVar) {
        this.f80972f = iVar;
    }

    public void o(String str) {
        this.f80968b = str;
    }

    public void p(String str) {
        this.f80970d = str;
    }

    public void q(Map<String, Object> map) {
        this.f80974h = map;
    }

    public void r(String str) {
        this.f80969c = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80967a != null) {
            j3Var.N(Scopes.EMAIL).w(this.f80967a);
        }
        if (this.f80968b != null) {
            j3Var.N("id").w(this.f80968b);
        }
        if (this.f80969c != null) {
            j3Var.N("username").w(this.f80969c);
        }
        if (this.f80970d != null) {
            j3Var.N("ip_address").w(this.f80970d);
        }
        if (this.f80971e != null) {
            j3Var.N("name").w(this.f80971e);
        }
        if (this.f80972f != null) {
            j3Var.N("geo");
            this.f80972f.serialize(j3Var, iLogger);
        }
        if (this.f80973g != null) {
            j3Var.N("data").V(iLogger, this.f80973g);
        }
        Map<String, Object> map = this.f80974h;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80974h.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public i0(i0 i0Var) {
        this.f80967a = i0Var.f80967a;
        this.f80969c = i0Var.f80969c;
        this.f80968b = i0Var.f80968b;
        this.f80970d = i0Var.f80970d;
        this.f80971e = i0Var.f80971e;
        this.f80972f = i0Var.f80972f;
        this.f80973g = io.sentry.util.c.b(i0Var.f80973g);
        this.f80974h = io.sentry.util.c.b(i0Var.f80974h);
    }
}
