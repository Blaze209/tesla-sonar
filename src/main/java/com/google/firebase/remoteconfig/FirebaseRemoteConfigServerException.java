package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44593b;

    public FirebaseRemoteConfigServerException(int i11, @NonNull String str) {
        super(str);
        this.f44593b = i11;
    }

    public int a() {
        return this.f44593b;
    }

    public FirebaseRemoteConfigServerException(int i11, @NonNull String str, Throwable th2) {
        super(str, th2);
        this.f44593b = i11;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f44593b = -1;
    }

    public FirebaseRemoteConfigServerException(int i11, @NonNull String str, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f44593b = i11;
    }
}
