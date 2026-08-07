package io.sentry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class q6 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f81113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f81114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f81115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f81116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a7 f81117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f81118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Callable<Integer> f81119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f81120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f81121i;

    public static final class a implements q1<q6> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(b7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.q1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q6 a(i3 i3Var, ILogger iLogger) throws Exception {
            i3Var.h();
            HashMap map = null;
            a7 a7Var = null;
            String strA1 = null;
            String strA2 = null;
            String strA3 = null;
            String strA4 = null;
            Integer numN2 = null;
            int iNextInt = 0;
            while (i3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strL = i3Var.L();
                strL.getClass();
                switch (strL) {
                    case "item_count":
                        numN2 = i3Var.N2();
                        break;
                    case "length":
                        iNextInt = i3Var.nextInt();
                        break;
                    case "filename":
                        strA2 = i3Var.a1();
                        break;
                    case "attachment_type":
                        strA3 = i3Var.a1();
                        break;
                    case "type":
                        a7Var = (a7) i3Var.v0(iLogger, new a7.a());
                        break;
                    case "content_type":
                        strA1 = i3Var.a1();
                        break;
                    case "platform":
                        strA4 = i3Var.a1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        i3Var.a3(iLogger, map, strL);
                        break;
                }
            }
            if (a7Var == null) {
                throw c("type", iLogger);
            }
            q6 q6Var = new q6(a7Var, iNextInt, strA1, strA2, strA3, strA4, numN2);
            q6Var.c(map);
            i3Var.j();
            return q6Var;
        }
    }

    public q6(a7 a7Var, int i11, String str, String str2, String str3, String str4, Integer num) {
        this.f81117e = (a7) io.sentry.util.y.c(a7Var, "type is required");
        this.f81113a = str;
        this.f81118f = i11;
        this.f81115c = str2;
        this.f81119g = null;
        this.f81120h = str3;
        this.f81116d = str4;
        this.f81114b = num;
    }

    public int a() {
        Callable<Integer> callable = this.f81119g;
        if (callable == null) {
            return this.f81118f;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public a7 b() {
        return this.f81117e;
    }

    public void c(Map<String, Object> map) {
        this.f81121i = map;
    }

    @Override // io.sentry.a2
    public void serialize(j3 j3Var, ILogger iLogger) {
        j3Var.h();
        if (this.f81113a != null) {
            j3Var.N("content_type").w(this.f81113a);
        }
        if (this.f81115c != null) {
            j3Var.N("filename").w(this.f81115c);
        }
        j3Var.N("type").V(iLogger, this.f81117e);
        if (this.f81120h != null) {
            j3Var.N("attachment_type").w(this.f81120h);
        }
        if (this.f81116d != null) {
            j3Var.N("platform").w(this.f81116d);
        }
        if (this.f81114b != null) {
            j3Var.N("item_count").U(this.f81114b);
        }
        j3Var.N("length").D(a());
        Map<String, Object> map = this.f81121i;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f81121i.get(str);
                j3Var.N(str);
                j3Var.V(iLogger, obj);
            }
        }
        j3Var.j();
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2, String str3) {
        this(a7Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2, String str3, String str4, Integer num) {
        this.f81117e = (a7) io.sentry.util.y.c(a7Var, "type is required");
        this.f81113a = str;
        this.f81118f = -1;
        this.f81115c = str2;
        this.f81119g = callable;
        this.f81120h = str3;
        this.f81116d = str4;
        this.f81114b = num;
    }

    q6(a7 a7Var, Callable<Integer> callable, String str, String str2) {
        this(a7Var, callable, str, str2, null);
    }
}
