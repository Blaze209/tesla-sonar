package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;

/* JADX INFO: loaded from: classes7.dex */
@in.a
public class SensorSetter {

    @in.a
    private final HybridData mHybridData;

    @in.a
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i11);
}
