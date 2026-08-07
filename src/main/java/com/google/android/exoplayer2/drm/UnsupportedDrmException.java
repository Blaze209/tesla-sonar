package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39808a;

    public UnsupportedDrmException(int i11) {
        this.f39808a = i11;
    }

    public UnsupportedDrmException(int i11, Exception exc) {
        super(exc);
        this.f39808a = i11;
    }
}
