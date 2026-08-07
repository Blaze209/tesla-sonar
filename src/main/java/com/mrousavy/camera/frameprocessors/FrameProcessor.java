package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;

/* JADX INFO: loaded from: classes6.dex */
public final class FrameProcessor {

    @Keep
    @in.a
    private final HybridData mHybridData;

    @Keep
    @in.a
    public FrameProcessor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @FastNative
    public native void call(Frame frame);
}
