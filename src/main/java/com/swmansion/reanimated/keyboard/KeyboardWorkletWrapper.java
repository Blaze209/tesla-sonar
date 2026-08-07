package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes7.dex */
@in.a
public class KeyboardWorkletWrapper {

    @in.a
    private final HybridData mHybridData;

    @in.a
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i11, int i12);
}
