package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends v<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f44432a;

    protected l() {
    }

    protected static synchronized l e() {
        try {
            if (f44432a == null) {
                f44432a = new l();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44432a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_enabled";
    }

    protected Boolean d() {
        return Boolean.TRUE;
    }
}
