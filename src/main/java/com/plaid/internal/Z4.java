package com.plaid.internal;

import com.plaid.BuildConfig;
import com.plaid.internal.Z4;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* JADX INFO: loaded from: classes6.dex */
public final class Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4350b0 f46849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4456k0 f46850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M2 f46851c;

    public Z4(C4350b0 crashReportFactory, C4456k0 crashWorkManager, M2 interceptor) {
        p013kotlin.jvm.internal.s.k(crashReportFactory, "crashReportFactory");
        p013kotlin.jvm.internal.s.k(crashWorkManager, "crashWorkManager");
        p013kotlin.jvm.internal.s.k(interceptor, "interceptor");
        this.f46849a = crashReportFactory;
        this.f46850b = crashWorkManager;
        this.f46851c = interceptor;
    }

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: g00.k
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                Z4.a(this.f66826a, defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb A[LOOP:1: B:11:0x0066->B:30:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be A[SYNTHETIC] */
    public static final void a(Z4 this$0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread paramThread, Throwable paramThrowable) {
        StackTraceElement[] stackTrace;
        int length;
        int i11;
        String lowerCase;
        int i12;
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        p013kotlin.jvm.internal.s.h(paramThread);
        p013kotlin.jvm.internal.s.h(paramThrowable);
        this$0.getClass();
        p013kotlin.jvm.internal.s.k(paramThread, "paramThread");
        p013kotlin.jvm.internal.s.k(paramThrowable, "paramThrowable");
        Throwable cause = paramThrowable.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            p013kotlin.jvm.internal.s.j(stackTrace2, "getStackTrace(...)");
            int length2 = stackTrace2.length;
            while (true) {
                if (i12 < length2) {
                    String className = stackTrace2[i12].getClassName();
                    p013kotlin.jvm.internal.s.j(className, "getClassName(...)");
                    Locale US = Locale.US;
                    p013kotlin.jvm.internal.s.j(US, "US");
                    String lowerCase2 = className.toLowerCase(US);
                    p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
                    i12 = p013kotlin.text.t.h0(lowerCase2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null) ? 0 : i12 + 1;
                } else {
                    stackTrace = paramThrowable.getStackTrace();
                    p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
                    length = stackTrace.length;
                    i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
                                return;
                            } else {
                                System.exit(2);
                                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                            }
                        }
                        String className2 = stackTrace[i11].getClassName();
                        p013kotlin.jvm.internal.s.j(className2, "getClassName(...)");
                        Locale US2 = Locale.US;
                        p013kotlin.jvm.internal.s.j(US2, "US");
                        lowerCase = className2.toLowerCase(US2);
                        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                        if (!p013kotlin.text.t.h0(lowerCase, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        } else {
            stackTrace = paramThrowable.getStackTrace();
            p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
            length = stackTrace.length;
            i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
                        return;
                    } else {
                        System.exit(2);
                        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                    }
                }
                String className3 = stackTrace[i11].getClassName();
                p013kotlin.jvm.internal.s.j(className3, "getClassName(...)");
                Locale US3 = Locale.US;
                p013kotlin.jvm.internal.s.j(US3, "US");
                lowerCase = className3.toLowerCase(US3);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                if (!p013kotlin.text.t.h0(lowerCase, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null)) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new Y4(this$0, paramThrowable, null), 1, null);
            if (this$0.f46851c.a(paramThrowable)) {
                return;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        } catch (Exception e11) {
            X5.a.a(X5.f46812a, e11);
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(paramThread, paramThrowable);
            } else {
                System.exit(2);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }
    }
}
