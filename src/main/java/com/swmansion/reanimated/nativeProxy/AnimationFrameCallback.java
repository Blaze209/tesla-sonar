package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;

/* JADX INFO: loaded from: classes7.dex */
@in.a
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @in.a
    private final HybridData mHybridData;

    @in.a
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d11);
}
