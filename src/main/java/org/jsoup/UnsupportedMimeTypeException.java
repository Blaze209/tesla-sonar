package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f99338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99339b;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f99338a + ", URL=" + this.f99339b;
    }
}
