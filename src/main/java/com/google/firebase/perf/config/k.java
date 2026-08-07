package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends v<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f44431a;

    protected k() {
    }

    protected static synchronized k e() {
        try {
            if (f44431a == null) {
                f44431a = new k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44431a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_disabled_android_versions";
    }

    protected String d() {
        return "";
    }
}
