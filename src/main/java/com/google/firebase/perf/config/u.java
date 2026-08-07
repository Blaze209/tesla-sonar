package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends v<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static u f44441a;

    private u() {
    }

    protected static synchronized u f() {
        try {
            if (f44441a == null) {
                f44441a = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44441a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
