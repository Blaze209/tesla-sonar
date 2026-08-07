package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static q f44437a;

    private q() {
    }

    public static synchronized q f() {
        try {
            if (f44437a == null) {
                f44437a = new q();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44437a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    protected Long d() {
        return 100L;
    }

    protected Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
