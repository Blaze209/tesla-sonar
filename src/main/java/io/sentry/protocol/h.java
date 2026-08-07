package io.sentry.protocol;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ImagesContract;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f80956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f80957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f80958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x f80959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f80960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f80961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, Object> f80962g;

    public static final class a implements q1<h> {
        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(i3 i3Var, ILogger iLogger) {
            i3Var.h();
            String strA1 = null;
            String strA2 = null;
            String strA3 = null;
            x xVarA = null;
            x xVarA2 = null;
            String strA4 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "associated_event_id":
                        xVarA = new x.a().a(i3Var, iLogger);
                        break;
                    case "replay_id":
                        xVarA2 = new x.a().a(i3Var, iLogger);
                        break;
                    case "url":
                        strA4 = i3Var.a1();
                        break;
                    case "name":
                        strA3 = i3Var.a1();
                        break;
                    case "contact_email":
                        strA2 = i3Var.a1();
                        break;
                    case "message":
                        strA1 = i3Var.a1();
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
            if (strA1 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.a(b7.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            h hVar = new h(strA1);
            hVar.f80957b = strA2;
            hVar.f80958c = strA3;
            hVar.f80959d = xVarA;
            hVar.f80960e = xVarA2;
            hVar.f80961f = strA4;
            hVar.f80962g = map;
            return hVar;
        }
    }

    public h(String str) {
        g(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return io.sentry.util.y.a(this.f80956a, hVar.f80956a) && io.sentry.util.y.a(this.f80957b, hVar.f80957b) && io.sentry.util.y.a(this.f80958c, hVar.f80958c) && io.sentry.util.y.a(this.f80959d, hVar.f80959d) && io.sentry.util.y.a(this.f80960e, hVar.f80960e) && io.sentry.util.y.a(this.f80961f, hVar.f80961f) && io.sentry.util.y.a(this.f80962g, hVar.f80962g);
    }

    public void g(String str) {
        if (str.length() > 4096) {
            this.f80956a = str.substring(0, 4096);
        } else {
            this.f80956a = str;
        }
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f80956a, this.f80957b, this.f80958c, this.f80959d, this.f80960e, this.f80961f, this.f80962g);
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("message").w(this.f80956a);
        if (this.f80957b != null) {
            j3Var.N("contact_email").w(this.f80957b);
        }
        if (this.f80958c != null) {
            j3Var.N("name").w(this.f80958c);
        }
        if (this.f80959d != null) {
            j3Var.N("associated_event_id");
            this.f80959d.serialize(j3Var, iLogger);
        }
        if (this.f80960e != null) {
            j3Var.N("replay_id");
            this.f80960e.serialize(j3Var, iLogger);
        }
        if (this.f80961f != null) {
            j3Var.N(ImagesContract.URL).w(this.f80961f);
        }
        Map<String, Object> map = this.f80962g;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80962g.get(str));
            }
        }
        j3Var.j();
    }

    public String toString() {
        return "Feedback{message='" + this.f80956a + CoreConstants.SINGLE_QUOTE_CHAR + ", contactEmail='" + this.f80957b + CoreConstants.SINGLE_QUOTE_CHAR + ", name='" + this.f80958c + CoreConstants.SINGLE_QUOTE_CHAR + ", associatedEventId=" + this.f80959d + ", replayId=" + this.f80960e + ", url='" + this.f80961f + CoreConstants.SINGLE_QUOTE_CHAR + ", unknown=" + this.f80962g + CoreConstants.CURLY_RIGHT;
    }

    public h(h hVar) {
        this.f80956a = hVar.f80956a;
        this.f80957b = hVar.f80957b;
        this.f80958c = hVar.f80958c;
        this.f80959d = hVar.f80959d;
        this.f80960e = hVar.f80960e;
        this.f80961f = hVar.f80961f;
        this.f80962g = io.sentry.util.c.b(hVar.f80962g);
    }
}
