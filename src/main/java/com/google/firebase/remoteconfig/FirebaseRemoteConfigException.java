package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44591a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i11) {
            this.value = i11;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(@NonNull String str) {
        super(str);
        this.f44591a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, Throwable th2) {
        super(str, th2);
        this.f44591a = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f44591a = aVar;
    }

    public FirebaseRemoteConfigException(@NonNull String str, Throwable th2, @NonNull a aVar) {
        super(str, th2);
        this.f44591a = aVar;
    }
}
