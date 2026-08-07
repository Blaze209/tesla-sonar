package io.sentry.android.core.internal.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements io.sentry.transport.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final io.sentry.transport.p f79523a = new f();

    private f() {
    }

    public static io.sentry.transport.p b() {
        return f79523a;
    }

    @Override // io.sentry.transport.p
    public long a() {
        return SystemClock.uptimeMillis();
    }
}
