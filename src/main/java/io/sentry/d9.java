package io.sentry;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class d9 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f80482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f80485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f80486e;

    public static final class a implements q1<d9> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d9 a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            io.sentry.protocol.x xVarA = null;
            String strA1 = null;
            String strA2 = null;
            String strA3 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "comments":
                        strA3 = i3Var.a1();
                        break;
                    case "name":
                        strA1 = i3Var.a1();
                        break;
                    case "email":
                        strA2 = i3Var.a1();
                        break;
                    case "event_id":
                        xVarA = new io.sentry.protocol.x.a().a(i3Var, iLogger);
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
            if (xVarA != null) {
                d9 d9Var = new d9(xVarA, strA1, strA2, strA3);
                d9Var.a(map);
                return d9Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.a(b7.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public d9(io.sentry.protocol.x xVar, String str, String str2, String str3) {
        this.f80482a = xVar;
        this.f80483b = str;
        this.f80484c = str2;
        this.f80485d = str3;
    }

    public void a(Map<String, Object> map) {
        this.f80486e = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("event_id");
        this.f80482a.serialize(j3Var, iLogger);
        if (this.f80483b != null) {
            j3Var.N("name").w(this.f80483b);
        }
        if (this.f80484c != null) {
            j3Var.N(Scopes.EMAIL).w(this.f80484c);
        }
        if (this.f80485d != null) {
            j3Var.N("comments").w(this.f80485d);
        }
        Map<String, Object> map = this.f80486e;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80486e.get(str));
            }
        }
        j3Var.j();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f80482a + ", name='" + this.f80483b + CoreConstants.SINGLE_QUOTE_CHAR + ", email='" + this.f80484c + CoreConstants.SINGLE_QUOTE_CHAR + ", comments='" + this.f80485d + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}
