package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f44433a;

    private m() {
    }

    public static synchronized m e() {
        try {
            if (f44433a == null) {
                f44433a = new m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44433a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
