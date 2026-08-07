package io.sentry.clientreport;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f80419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f80420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f80421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f80422d;

    public static final class a implements q1<g> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(i3 i3Var, ILogger iLogger) throws Exception {
            i3Var.h();
            String strA1 = null;
            String strA2 = null;
            Long lR2 = null;
            HashMap map = null;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "quantity":
                        lR2 = i3Var.R2();
                        break;
                    case "reason":
                        strA1 = i3Var.a1();
                        break;
                    case "category":
                        strA2 = i3Var.a1();
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
                throw c(AnalyticsAttribute.Reason, iLogger);
            }
            if (strA2 == null) {
                throw c("category", iLogger);
            }
            if (lR2 == null) {
                throw c("quantity", iLogger);
            }
            g gVar = new g(strA1, strA2, lR2);
            gVar.d(map);
            return gVar;
        }
    }

    public g(String str, String str2, Long l11) {
        this.f80419a = str;
        this.f80420b = str2;
        this.f80421c = l11;
    }

    public String a() {
        return this.f80420b;
    }

    public Long b() {
        return this.f80421c;
    }

    public String c() {
        return this.f80419a;
    }

    public void d(Map<String, Object> map) {
        this.f80422d = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N(AnalyticsAttribute.Reason).w(this.f80419a);
        j3Var.N("category").w(this.f80420b);
        j3Var.N("quantity").U(this.f80421c);
        Map<String, Object> map = this.f80422d;
        if (map != null) {
            for (String str : map.keySet()) {
                j3Var.N(str).V(iLogger, this.f80422d.get(str));
            }
        }
        j3Var.j();
    }

    public String toString() {
        return "DiscardedEvent{reason='" + this.f80419a + CoreConstants.SINGLE_QUOTE_CHAR + ", category='" + this.f80420b + CoreConstants.SINGLE_QUOTE_CHAR + ", quantity=" + this.f80421c + CoreConstants.CURLY_RIGHT;
    }
}
