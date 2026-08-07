package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f44435a;

    private o() {
    }

    public static synchronized o e() {
        try {
            if (f44435a == null) {
                f44435a = new o();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44435a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_max_duration_min";
    }

    protected Long d() {
        return 240L;
    }
}
