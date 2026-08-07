package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Thread f81003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f81006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f81007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f81008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f81009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f81010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f81011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f81012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f81013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Object> f81014l;

    public static final class a implements q1<l> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(i3 i3Var, ILogger iLogger) {
            l lVar = new l();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "description":
                        lVar.f81005c = i3Var.a1();
                        break;
                    case "exception_id":
                        lVar.f81011i = i3Var.N2();
                        break;
                    case "data":
                        lVar.f81009g = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "meta":
                        lVar.f81008f = io.sentry.util.c.b((Map) i3Var.z3());
                        break;
                    case "type":
                        lVar.f81004b = i3Var.a1();
                        break;
                    case "handled":
                        lVar.f81007e = i3Var.o0();
                        break;
                    case "synthetic":
                        lVar.f81010h = i3Var.o0();
                        break;
                    case "is_exception_group":
                        lVar.f81013k = i3Var.o0();
                        break;
                    case "help_link":
                        lVar.f81006d = i3Var.a1();
                        break;
                    case "parent_id":
                        lVar.f81012j = i3Var.N2();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            i3Var.j();
            lVar.q(map);
            return lVar;
        }
    }

    public l() {
        this(null);
    }

    public String k() {
        return this.f81004b;
    }

    public Boolean l() {
        return this.f81007e;
    }

    public void m(Integer num) {
        this.f81011i = num;
    }

    public void n(Boolean bool) {
        this.f81007e = bool;
    }

    public void o(Integer num) {
        this.f81012j = num;
    }

    public void p(String str) {
        this.f81004b = str;
    }

    public void q(Map<String, Object> map) {
        this.f81014l = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81004b != null) {
            j3Var.N("type").w(this.f81004b);
        }
        if (this.f81005c != null) {
            j3Var.N("description").w(this.f81005c);
        }
        if (this.f81006d != null) {
            j3Var.N("help_link").w(this.f81006d);
        }
        if (this.f81007e != null) {
            j3Var.N("handled").W(this.f81007e);
        }
        if (this.f81008f != null) {
            j3Var.N("meta").V(iLogger, this.f81008f);
        }
        if (this.f81009g != null) {
            j3Var.N("data").V(iLogger, this.f81009g);
        }
        if (this.f81010h != null) {
            j3Var.N("synthetic").W(this.f81010h);
        }
        if (this.f81011i != null) {
            j3Var.N("exception_id").V(iLogger, this.f81011i);
        }
        if (this.f81012j != null) {
            j3Var.N("parent_id").V(iLogger, this.f81012j);
        }
        if (this.f81013k != null) {
            j3Var.N("is_exception_group").W(this.f81013k);
        }
        Map<String, Object> map = this.f81014l;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81014l.get(str));
            }
        }
        j3Var.j();
    }

    public l(Thread thread) {
        this.f81003a = thread;
    }
}
