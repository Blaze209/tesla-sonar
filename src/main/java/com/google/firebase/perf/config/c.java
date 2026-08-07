package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends v<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f44422a;

    private c() {
    }

    protected static synchronized c d() {
        try {
            if (f44422a == null) {
                f44422a = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44422a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_enabled";
    }
}
