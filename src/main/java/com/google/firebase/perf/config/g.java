package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f44427a;

    private g() {
    }

    public static synchronized g e() {
        try {
            if (f44427a == null) {
                f44427a = new g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44427a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_bg";
    }

    protected Long d() {
        return 70L;
    }
}
