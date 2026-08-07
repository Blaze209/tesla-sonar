package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f79531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.p f79532b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f79534d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f79533c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f79535e = new AtomicLong(0);

    public n(io.sentry.transport.p pVar, long j11, int i11) {
        this.f79532b = pVar;
        this.f79531a = j11;
        this.f79534d = i11 <= 0 ? 1 : i11;
    }

    public boolean a() {
        long jA = this.f79532b.a();
        if (this.f79535e.get() == 0 || this.f79535e.get() + this.f79531a <= jA) {
            this.f79533c.set(0);
            this.f79535e.set(jA);
            return false;
        }
        if (this.f79533c.incrementAndGet() < this.f79534d) {
            return false;
        }
        this.f79533c.set(0);
        return true;
    }
}
