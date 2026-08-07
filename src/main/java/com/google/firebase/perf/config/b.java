package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends v<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f44421a;

    private b() {
    }

    protected static synchronized b e() {
        try {
            if (f44421a == null) {
                f44421a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44421a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_deactivated";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
