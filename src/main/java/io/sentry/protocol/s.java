package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f81066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f81067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f81068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f81069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c0 f81070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f81071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f81072g;

    public static final class a implements q1<s> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(i3 i3Var, ILogger iLogger) {
            s sVar = new s();
            i3Var.h();
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "thread_id":
                        sVar.f81069d = i3Var.R2();
                        break;
                    case "module":
                        sVar.f81068c = i3Var.a1();
                        break;
                    case "type":
                        sVar.f81066a = i3Var.a1();
                        break;
                    case "value":
                        sVar.f81067b = i3Var.a1();
                        break;
                    case "mechanism":
                        sVar.f81071f = (l) i3Var.v0(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.f81070e = (c0) i3Var.v0(iLogger, new c0.a());
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
            sVar.q(map);
            return sVar;
        }
    }

    public l g() {
        return this.f81071f;
    }

    public String h() {
        return this.f81068c;
    }

    public c0 i() {
        return this.f81070e;
    }

    public Long j() {
        return this.f81069d;
    }

    public String k() {
        return this.f81066a;
    }

    public void l(l lVar) {
        this.f81071f = lVar;
    }

    public void m(String str) {
        this.f81068c = str;
    }

    public void n(c0 c0Var) {
        this.f81070e = c0Var;
    }

    public void o(Long l11) {
        this.f81069d = l11;
    }

    public void p(String str) {
        this.f81066a = str;
    }

    public void q(Map<String, Object> map) {
        this.f81072g = map;
    }

    public void r(String str) {
        this.f81067b = str;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81066a != null) {
            j3Var.N("type").w(this.f81066a);
        }
        if (this.f81067b != null) {
            j3Var.N("value").w(this.f81067b);
        }
        if (this.f81068c != null) {
            j3Var.N("module").w(this.f81068c);
        }
        if (this.f81069d != null) {
            j3Var.N("thread_id").U(this.f81069d);
        }
        if (this.f81070e != null) {
            j3Var.N("stacktrace").V(iLogger, this.f81070e);
        }
        if (this.f81071f != null) {
            j3Var.N("mechanism").V(iLogger, this.f81071f);
        }
        Map<String, Object> map = this.f81072g;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f81072g.get(str));
            }
        }
        j3Var.j();
    }
}
