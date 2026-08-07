package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AuthenticationException extends Exception {
    public AuthenticationException() {
    }

    public AuthenticationException(@NonNull String str) {
        super(str);
    }

    public AuthenticationException(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
    }

    public AuthenticationException(@NonNull Throwable th2) {
        super(th2);
    }
}
