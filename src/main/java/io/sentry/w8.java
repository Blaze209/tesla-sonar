package io.sentry;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class w8 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f81592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f81594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f81595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f81596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f81597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f81598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f81599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f81600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.protocol.x f81601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f81602k;

    public static final class a implements q1<w8> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w8 a(i3 i3Var, ILogger iLogger) throws Exception {
            i3Var.h();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.x xVarA = null;
            String strO = null;
            String strA1 = null;
            String strA2 = null;
            String strA3 = null;
            String strA4 = null;
            String strA5 = null;
            String strA6 = null;
            io.sentry.protocol.x xVarA2 = null;
            String strA7 = null;
            while (true) {
                io.sentry.protocol.x xVar = xVarA;
                String str = strO;
                if (i3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (xVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw c("public_key", iLogger);
                    }
                    w8 w8Var = new w8(xVar, str, strA1, strA2, strA3, strA4, strA5, strA6, xVarA2, strA7);
                    w8Var.c(concurrentHashMap);
                    i3Var.j();
                    return w8Var;
                }
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "replay_id":
                        xVarA2 = new io.sentry.protocol.x.a().a(i3Var, iLogger);
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "user_id":
                        strA3 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "environment":
                        strA2 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "sample_rand":
                        strA7 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "sample_rate":
                        strA5 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "release":
                        strA1 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "trace_id":
                        xVarA = new io.sentry.protocol.x.a().a(i3Var, iLogger);
                        strO = str;
                        break;
                    case "sampled":
                        strA6 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    case "public_key":
                        strO = i3Var.O();
                        xVarA = xVar;
                        break;
                    case "transaction":
                        strA4 = i3Var.a1();
                        xVarA = xVar;
                        strO = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        i3Var.a3(iLogger, concurrentHashMap, strL);
                        xVarA = xVar;
                        strO = str;
                        break;
                }
            }
        }
    }

    w8(io.sentry.protocol.x xVar, String str) {
        this(xVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f81599h;
    }

    public String b() {
        return this.f81598g;
    }

    public void c(Map<String, Object> map) {
        this.f81602k = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        j3Var.N("trace_id").V(iLogger, this.f81592a);
        j3Var.N("public_key").w(this.f81593b);
        if (this.f81594c != null) {
            j3Var.N("release").w(this.f81594c);
        }
        if (this.f81595d != null) {
            j3Var.N(AnalyticsAttribute.Environment).w(this.f81595d);
        }
        if (this.f81596e != null) {
            j3Var.N("user_id").w(this.f81596e);
        }
        if (this.f81597f != null) {
            j3Var.N("transaction").w(this.f81597f);
        }
        if (this.f81598g != null) {
            j3Var.N("sample_rate").w(this.f81598g);
        }
        if (this.f81599h != null) {
            j3Var.N("sample_rand").w(this.f81599h);
        }
        if (this.f81600i != null) {
            j3Var.N("sampled").w(this.f81600i);
        }
        if (this.f81601j != null) {
            j3Var.N("replay_id").V(iLogger, this.f81601j);
        }
        Map<String, Object> map = this.f81602k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81602k.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    @Deprecated
    w8(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2) {
        this(xVar, str, str2, str3, str4, str5, str6, str7, xVar2, null);
    }

    w8(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2, String str8) {
        this.f81592a = xVar;
        this.f81593b = str;
        this.f81594c = str2;
        this.f81595d = str3;
        this.f81596e = str4;
        this.f81597f = str5;
        this.f81598g = str6;
        this.f81600i = str7;
        this.f81601j = xVar2;
        this.f81599h = str8;
    }
}
