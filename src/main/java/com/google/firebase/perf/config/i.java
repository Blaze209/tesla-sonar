package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends v<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f44429a;

    private i() {
    }

    protected static synchronized i f() {
        try {
            if (f44429a == null) {
                f44429a = new i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44429a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
