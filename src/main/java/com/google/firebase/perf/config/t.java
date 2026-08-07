package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends v<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static t f44440a;

    private t() {
    }

    public static synchronized t e() {
        try {
            if (f44440a == null) {
                f44440a = new t();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44440a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    protected Long d() {
        return 300L;
    }
}
