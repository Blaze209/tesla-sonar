package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3794s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C3751r0) {
            return;
        }
        C3751r0 c3751r0 = new C3751r0(defaultUncaughtExceptionHandler, null, 2, 0 == true ? 1 : 0);
        Thread.setDefaultUncaughtExceptionHandler(c3751r0);
        c3751r0.a().track(new C4108zC.a.b(defaultUncaughtExceptionHandler != null));
    }

    public static final void b() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof C3751r0) {
            C3751r0 c3751r0 = (C3751r0) defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(c3751r0.b());
            c3751r0.a().track(C4108zC.a.c.f37240a);
        }
    }
}
