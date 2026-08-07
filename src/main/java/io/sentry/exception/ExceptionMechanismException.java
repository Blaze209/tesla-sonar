package io.sentry.exception;

import io.sentry.protocol.l;
import io.sentry.util.y;

/* JADX INFO: loaded from: classes9.dex */
public final class ExceptionMechanismException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f80531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f80532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f80533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f80534d;

    public ExceptionMechanismException(l lVar, Throwable th2, Thread thread, boolean z11) {
        this.f80531a = (l) y.c(lVar, "Mechanism is required.");
        this.f80532b = (Throwable) y.c(th2, "Throwable is required.");
        this.f80533c = (Thread) y.c(thread, "Thread is required.");
        this.f80534d = z11;
    }

    public l a() {
        return this.f80531a;
    }

    public Thread b() {
        return this.f80533c;
    }

    public Throwable c() {
        return this.f80532b;
    }

    public boolean d() {
        return this.f80534d;
    }

    public ExceptionMechanismException(l lVar, Throwable th2, Thread thread) {
        this(lVar, th2, thread, false);
    }
}
