package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends v<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static r f44438a;

    private r() {
    }

    public static synchronized r f() {
        try {
            if (f44438a == null) {
                f44438a = new r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44438a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_session_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.01d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
