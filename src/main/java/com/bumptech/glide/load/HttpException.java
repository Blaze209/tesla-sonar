package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20509a;

    public HttpException(int i11) {
        this("Http request failed", i11);
    }

    public HttpException(String str, int i11) {
        this(str, i11, null);
    }

    public HttpException(String str, int i11, Throwable th2) {
        super(str + ", status code: " + i11, th2);
        this.f20509a = i11;
    }
}
