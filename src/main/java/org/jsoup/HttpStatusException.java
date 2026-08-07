package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class HttpStatusException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99337b;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Status=" + this.f99336a + ", URL=" + this.f99337b;
    }
}
