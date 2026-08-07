package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final a f44149a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(@NonNull a aVar) {
        this.f44149a = aVar;
    }

    public FirebaseInstallationsException(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f44149a = aVar;
    }
}
