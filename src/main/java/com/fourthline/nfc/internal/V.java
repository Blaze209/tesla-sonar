package com.fourthline.nfc.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class V {
    public static final String a(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        Throwable cause = th2.getCause();
        if (cause == null) {
            return th2.getMessage();
        }
        return cause.getClass().getSimpleName() + " - " + cause.getMessage();
    }
}
