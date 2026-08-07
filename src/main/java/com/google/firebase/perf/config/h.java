package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f44428a;

    private h() {
    }

    public static synchronized h e() {
        try {
            if (f44428a == null) {
                f44428a = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44428a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long d() {
        return 700L;
    }
}
