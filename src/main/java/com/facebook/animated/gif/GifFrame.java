package com.facebook.animated.gif;

import android.graphics.Bitmap;
import hm.d;

/* JADX INFO: loaded from: classes3.dex */
public class GifFrame implements d {

    @pk.d
    private long mNativeContext;

    @pk.d
    GifFrame(long j11) {
        this.mNativeContext = j11;
    }

    @pk.d
    private native void nativeDispose();

    @pk.d
    private native void nativeFinalize();

    @pk.d
    private native int nativeGetDisposalMode();

    @pk.d
    private native int nativeGetDurationMs();

    @pk.d
    private native int nativeGetHeight();

    @pk.d
    private native int nativeGetTransparentPixelColor();

    @pk.d
    private native int nativeGetWidth();

    @pk.d
    private native int nativeGetXOffset();

    @pk.d
    private native int nativeGetYOffset();

    @pk.d
    private native boolean nativeHasTransparency();

    @pk.d
    private native void nativeRenderFrame(int i11, int i12, Bitmap bitmap);

    @Override // hm.d
    public void a(int i11, int i12, Bitmap bitmap) {
        nativeRenderFrame(i11, i12, bitmap);
    }

    @Override // hm.d
    public int b() {
        return nativeGetXOffset();
    }

    @Override // hm.d
    public int c() {
        return nativeGetYOffset();
    }

    public int d() {
        return nativeGetDisposalMode();
    }

    @Override // hm.d
    public void dispose() {
        nativeDispose();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // hm.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // hm.d
    public int getWidth() {
        return nativeGetWidth();
    }
}
