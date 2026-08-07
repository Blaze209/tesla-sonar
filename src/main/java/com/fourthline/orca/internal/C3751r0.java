package com.fourthline.orca.internal;

import java.util.Objects;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3751r0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f34951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f34952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34953c;

    public C3751r0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f34951a = uncaughtExceptionHandler;
        this.f34952b = analytics;
        this.f34953c = "javaClass";
    }

    public final InterfaceC3354ho a() {
        return this.f34952b;
    }

    public final Thread.UncaughtExceptionHandler b() {
        return this.f34951a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable error) {
        p013kotlin.jvm.internal.s.k(thread, "thread");
        p013kotlin.jvm.internal.s.k(error, "error");
        Objects.toString(thread);
        Objects.toString(error);
        if (a(error)) {
            this.f34952b.track(new C4108zC.a.d(error, thread));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f34951a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, error);
        }
    }

    private final boolean a(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            p013kotlin.jvm.internal.s.j(className, "getClassName(...)");
            if (p013kotlin.text.t.b0(className, "com.fourthline", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ C3751r0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC3354ho interfaceC3354ho, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler, (i11 & 2) != 0 ? new C4108zC() : interfaceC3354ho);
    }
}
