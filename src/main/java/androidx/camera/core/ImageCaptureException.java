package androidx.camera.core;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3019a;

    public ImageCaptureException(int i11, @NonNull String str, Throwable th2) {
        super(str, th2);
        this.f3019a = i11;
    }
}
