package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.c7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Long f80902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f80903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f80906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f80907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f80908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f80909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c0 f80910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, c7> f80911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f80912k;

    public static final class a implements q1<d0> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 a(i3 i3Var, ILogger iLogger) {
            d0 d0Var = new d0();
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "daemon":
                        d0Var.f80908g = i3Var.o0();
                        break;
                    case "priority":
                        d0Var.f80903b = i3Var.N2();
                        break;
                    case "held_locks":
                        Map mapY2 = i3Var.Y2(iLogger, new c7.a());
                        if (mapY2 == null) {
                            break;
                        } else {
                            d0Var.f80911j = new HashMap(mapY2);
                            break;
                        }
                        break;
                    case "id":
                        d0Var.f80902a = i3Var.R2();
                        break;
                    case "main":
                        d0Var.f80909h = i3Var.o0();
                        break;
                    case "name":
                        d0Var.f80904c = i3Var.a1();
                        break;
                    case "state":
                        d0Var.f80905d = i3Var.a1();
                        break;
                    case "crashed":
                        d0Var.f80906e = i3Var.o0();
                        break;
                    case "current":
                        d0Var.f80907f = i3Var.o0();
                        break;
                    case "stacktrace":
                        d0Var.f80910i = (c0) i3Var.v0(iLogger, new c0.a());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        break;
                }
            }
            d0Var.A(concurrentHashMap);
            i3Var.j();
            return d0Var;
        }
    }

    public void A(Map<String, Object> map) {
        this.f80912k = map;
    }

    public Map<String, c7> k() {
        return this.f80911j;
    }

    public Long l() {
        return this.f80902a;
    }

    public String m() {
        return this.f80904c;
    }

    public c0 n() {
        return this.f80910i;
    }

    public Boolean o() {
        return this.f80907f;
    }

    public Boolean p() {
        return this.f80909h;
    }

    public void q(Boolean bool) {
        this.f80906e = bool;
    }

    public void r(Boolean bool) {
        this.f80907f = bool;
    }

    public void s(Boolean bool) {
        this.f80908g = bool;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f80902a != null) {
            j3Var.N("id").U(this.f80902a);
        }
        if (this.f80903b != null) {
            j3Var.N("priority").U(this.f80903b);
        }
        if (this.f80904c != null) {
            j3Var.N("name").w(this.f80904c);
        }
        if (this.f80905d != null) {
            j3Var.N("state").w(this.f80905d);
        }
        if (this.f80906e != null) {
            j3Var.N("crashed").W(this.f80906e);
        }
        if (this.f80907f != null) {
            j3Var.N("current").W(this.f80907f);
        }
        if (this.f80908g != null) {
            j3Var.N("daemon").W(this.f80908g);
        }
        if (this.f80909h != null) {
            j3Var.N("main").W(this.f80909h);
        }
        if (this.f80910i != null) {
            j3Var.N("stacktrace").V(iLogger, this.f80910i);
        }
        if (this.f80911j != null) {
            j3Var.N("held_locks").V(iLogger, this.f80911j);
        }
        Map<String, Object> map = this.f80912k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f80912k.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public void t(Map<String, c7> map) {
        this.f80911j = map;
    }

    public void u(Long l11) {
        this.f80902a = l11;
    }

    public void v(Boolean bool) {
        this.f80909h = bool;
    }

    public void w(String str) {
        this.f80904c = str;
    }

    public void x(Integer num) {
        this.f80903b = num;
    }

    public void y(c0 c0Var) {
        this.f80910i = c0Var;
    }

    public void z(String str) {
        this.f80905d = str;
    }
}
