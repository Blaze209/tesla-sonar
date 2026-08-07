package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f44436a;

    private p() {
    }

    public static synchronized p e() {
        try {
            if (f44436a == null) {
                f44436a = new p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44436a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
