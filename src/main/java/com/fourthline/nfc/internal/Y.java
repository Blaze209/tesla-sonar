package com.fourthline.nfc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class Y implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f24619b;

    public Y(String mimeType, InputStream imageInputStream) {
        p013kotlin.jvm.internal.s.k(mimeType, "mimeType");
        p013kotlin.jvm.internal.s.k(imageInputStream, "imageInputStream");
        this.f24618a = mimeType;
        this.f24619b = imageInputStream;
    }

    @Override // com.fourthline.nfc.internal.W
    public InputStream getImageInputStream() {
        return this.f24619b;
    }

    @Override // com.fourthline.nfc.internal.W
    public String getMimeType() {
        return this.f24618a;
    }
}
