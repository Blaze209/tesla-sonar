package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class SharedArray {

    @Keep
    @in.a
    private final HybridData mHybridData;

    @Keep
    @in.a
    private SharedArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, int i11);

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, ByteBuffer byteBuffer);

    @FastNative
    public native ByteBuffer getByteBuffer();

    @FastNative
    public native int getSize();
}
