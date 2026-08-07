package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends v<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f44423a;

    private d() {
    }

    protected static synchronized d e() {
        try {
            if (f44423a == null) {
                f44423a = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44423a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_experiment_app_start_ttid";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
