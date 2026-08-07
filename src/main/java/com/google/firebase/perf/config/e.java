package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends v<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f44424a;

    private e() {
    }

    protected static synchronized e e() {
        try {
            if (f44424a == null) {
                f44424a = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44424a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.0d);
    }
}
