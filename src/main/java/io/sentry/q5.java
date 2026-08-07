package io.sentry;

import com.adyen.checkout.components.core.action.SdkAction;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class q5 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f81108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.r f81109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w8 f81110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f81111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f81112e;

    public static final class a implements q1<q5> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q5 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            io.sentry.protocol.x xVar = null;
            io.sentry.protocol.r rVar = null;
            w8 w8Var = null;
            Date dateM0 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "sdk":
                        rVar = (io.sentry.protocol.r) i3Var.v0(iLogger, new io.sentry.protocol.r.a());
                        break;
                    case "trace":
                        w8Var = (w8) i3Var.v0(iLogger, new w8.a());
                        break;
                    case "event_id":
                        xVar = (io.sentry.protocol.x) i3Var.v0(iLogger, new io.sentry.protocol.x.a());
                        break;
                    case "sent_at":
                        dateM0 = i3Var.m0(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            q5 q5Var = new q5(xVar, rVar, w8Var);
            q5Var.d(dateM0);
            q5Var.e(map);
            i3Var.j();
            return q5Var;
        }
    }

    public q5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar) {
        this(xVar, rVar, null);
    }

    public io.sentry.protocol.x a() {
        return this.f81108a;
    }

    public io.sentry.protocol.r b() {
        return this.f81109b;
    }

    public w8 c() {
        return this.f81110c;
    }

    public void d(Date date) {
        this.f81111d = date;
    }

    public void e(Map<String, Object> map) {
        this.f81112e = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81108a != null) {
            j3Var.N("event_id").V(iLogger, this.f81108a);
        }
        if (this.f81109b != null) {
            j3Var.N(SdkAction.ACTION_TYPE).V(iLogger, this.f81109b);
        }
        if (this.f81110c != null) {
            j3Var.N("trace").V(iLogger, this.f81110c);
        }
        if (this.f81111d != null) {
            j3Var.N("sent_at").V(iLogger, l.h(this.f81111d));
        }
        Map<String, Object> map = this.f81112e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81112e.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    public q5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, w8 w8Var) {
        this.f81108a = xVar;
        this.f81109b = rVar;
        this.f81110c = w8Var;
    }

    public q5(io.sentry.protocol.x xVar) {
        this(xVar, null);
    }

    public q5() {
        this(new io.sentry.protocol.x());
    }
}
