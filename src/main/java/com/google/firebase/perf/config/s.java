package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f44439a;

    private s() {
    }

    public static synchronized s e() {
        try {
            if (f44439a == null) {
                f44439a = new s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44439a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long d() {
        return 30L;
    }
}
