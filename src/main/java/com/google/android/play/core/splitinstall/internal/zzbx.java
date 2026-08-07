package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbx extends RuntimeException {
    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }
}
