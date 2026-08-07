package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(@NonNull String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, Throwable th2) {
        super(str, th2);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
    }

    public FirebaseRemoteConfigClientException(@NonNull String str, Throwable th2, @NonNull FirebaseRemoteConfigException.a aVar) {
        super(str, th2, aVar);
    }
}
