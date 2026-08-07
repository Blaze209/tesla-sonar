package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes5.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f43126a;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f43126a;
    }
}
