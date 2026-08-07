package io.realm.internal.async;

import io.realm.internal.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class BadVersionException extends Exception {
    public BadVersionException(String str) {
        super(str);
    }

    public BadVersionException(String str, Throwable th2) {
        super(str, th2);
    }
}
