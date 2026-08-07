package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static n f44434a;

    private n() {
    }

    public static synchronized n f() {
        try {
            if (f44434a == null) {
                f44434a = new n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44434a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    protected Long d() {
        return 100L;
    }

    protected Long e() {
        return Long.valueOf(d().longValue() * 3);
    }
}
