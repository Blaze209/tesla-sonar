package io.realm.exceptions;

import io.realm.internal.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class RealmException extends RuntimeException {
    public RealmException(String str) {
        super(str);
    }

    public RealmException(String str, Throwable th2) {
        super(str, th2);
    }
}
