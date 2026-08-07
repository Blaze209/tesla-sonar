package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f20215a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f20216b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20217c = n.class.getName();

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final boolean f20218c = n.f20216b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0411a> f20219a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20220b = false;

        /* JADX INFO: renamed from: com.android.volley.n$a$a, reason: collision with other inner class name */
        private static class C0411a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f20221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f20222b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f20223c;

            public C0411a(String str, long j11, long j12) {
                this.f20221a = str;
                this.f20222b = j11;
                this.f20223c = j12;
            }
        }

        a() {
        }

        private long c() {
            if (this.f20219a.size() == 0) {
                return 0L;
            }
            long j11 = this.f20219a.get(0).f20223c;
            List<C0411a> list = this.f20219a;
            return list.get(list.size() - 1).f20223c - j11;
        }

        public synchronized void a(String str, long j11) {
            if (this.f20220b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f20219a.add(new C0411a(str, j11, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f20220b = true;
            long jC = c();
            if (jC <= 0) {
                return;
            }
            long j11 = this.f20219a.get(0).f20223c;
            n.b("(%-4d ms) %s", Long.valueOf(jC), str);
            for (C0411a c0411a : this.f20219a) {
                long j12 = c0411a.f20223c;
                n.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(c0411a.f20222b), c0411a.f20221a);
                j11 = j12;
            }
        }

        protected void finalize() {
            if (this.f20220b) {
                return;
            }
            b("Request on the loose");
            n.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i11 = 2; i11 < stackTrace.length; i11++) {
            if (!stackTrace[i11].getClassName().equals(f20217c)) {
                String className = stackTrace[i11].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i11].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f20215a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f20215a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f20215a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f20216b) {
            Log.v(f20215a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f20215a, a(str, objArr));
    }
}
