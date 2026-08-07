package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f44430a;

    private j() {
    }

    public static synchronized j e() {
        try {
            if (f44430a == null) {
                f44430a = new j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44430a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long d() {
        return 600L;
    }
}
