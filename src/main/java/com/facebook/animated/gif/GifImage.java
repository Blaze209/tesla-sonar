package com.facebook.animated.gif;

import android.graphics.Bitmap;
import bp.a;
import hm.b;
import hm.c;
import java.nio.ByteBuffer;
import pk.d;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@d
public class GifImage implements c, im.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f21527b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap.Config f21528a = null;

    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    public static GifImage f(ByteBuffer byteBuffer, om.c cVar) {
        h();
        byteBuffer.rewind();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, cVar.f98024b, cVar.f98029g);
        gifImageNativeCreateFromDirectByteBuffer.f21528a = cVar.f98031i;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage g(long j11, int i11, om.c cVar) {
        h();
        k.b(Boolean.valueOf(j11 != 0));
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j11, i11, cVar.f98024b, cVar.f98029g);
        gifImageNativeCreateFromNativeMemory.f21528a = cVar.f98031i;
        return gifImageNativeCreateFromNativeMemory;
    }

    private static synchronized void h() {
        if (!f21527b) {
            f21527b = true;
            a.d("gifimage");
        }
    }

    private static b.EnumC1538b i(int i11) {
        if (i11 == 0) {
            return b.EnumC1538b.DISPOSE_DO_NOT;
        }
        if (i11 == 1) {
            return b.EnumC1538b.DISPOSE_DO_NOT;
        }
        if (i11 == 2) {
            return b.EnumC1538b.DISPOSE_TO_BACKGROUND;
        }
        return i11 == 3 ? b.EnumC1538b.DISPOSE_TO_PREVIOUS : b.EnumC1538b.DISPOSE_DO_NOT;
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i11, boolean z11);

    @d
    private static native GifImage nativeCreateFromFileDescriptor(int i11, int i12, boolean z11);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j11, int i11, int i12, boolean z11);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i11);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    @d
    private native boolean nativeIsAnimated();

    @Override // hm.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // hm.c
    public int b() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // hm.c
    public b c(int i11) {
        GifFrame gifFrameX = x(i11);
        try {
            return new b(i11, gifFrameX.b(), gifFrameX.c(), gifFrameX.getWidth(), gifFrameX.getHeight(), b.a.BLEND_WITH_PREVIOUS, i(gifFrameX.d()));
        } finally {
            gifFrameX.dispose();
        }
    }

    @Override // im.c
    public c d(long j11, int i11, om.c cVar) {
        return g(j11, i11, cVar);
    }

    @Override // im.c
    public c e(ByteBuffer byteBuffer, om.c cVar) {
        return f(byteBuffer, cVar);
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // hm.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // hm.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // hm.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public GifFrame x(int i11) {
        return nativeGetFrame(i11);
    }

    @Override // hm.c
    public int v() {
        return nativeGetSizeInBytes();
    }

    @Override // hm.c
    public boolean w() {
        return false;
    }

    @Override // hm.c
    public Bitmap.Config y() {
        return this.f21528a;
    }

    @Override // hm.c
    public int[] z() {
        return nativeGetFrameDurations();
    }

    @d
    GifImage(long j11) {
        this.mNativeContext = j11;
    }
}
