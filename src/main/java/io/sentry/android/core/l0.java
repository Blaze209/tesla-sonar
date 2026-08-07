package io.sentry.android.core;

import android.net.TrafficStats;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 implements io.sentry.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l0 f79603a = new l0();

    private l0() {
    }

    public static l0 c() {
        return f79603a;
    }

    @Override // io.sentry.f1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.f1
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }
}
