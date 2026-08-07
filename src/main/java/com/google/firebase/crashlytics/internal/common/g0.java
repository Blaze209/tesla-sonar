package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public enum g0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f43972id;

    g0(int i11) {
        this.f43972id = i11;
    }

    public static g0 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f43972id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f43972id);
    }
}
