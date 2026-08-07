package io.sentry.android.core;

/* JADX INFO: loaded from: classes9.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f79283a;

    ApplicationNotResponding(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) io.sentry.util.y.c(thread, "Thread must be provided.");
        this.f79283a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f79283a;
    }
}
