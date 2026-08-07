package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.u0;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@SuppressLint({"MissingNativeLoadLibrary"})
public class StateWrapperImpl extends HybridClassBase implements u0 {
    private static final String TAG = "StateWrapperImpl";

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
        initHybrid();
    }

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private native void initHybrid();

    @Override // com.facebook.react.uimanager.u0
    public void destroyState() {
        if (isValid()) {
            resetNative();
        }
    }

    public ReadableNativeMap getStateData() {
        if (isValid()) {
            return getStateDataImpl();
        }
        qk.a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    @Override // com.facebook.react.uimanager.u0
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (isValid()) {
            return getStateMapBufferDataImpl();
        }
        qk.a.m(TAG, "Race between StateWrapperImpl destruction and getState");
        return null;
    }

    public String toString() {
        if (!isValid()) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        return stateDataImpl == null ? "<unexpected null>" : stateDataImpl.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.u0
    public void updateState(@NonNull WritableMap writableMap) {
        if (isValid()) {
            updateStateImpl((NativeMap) writableMap);
        } else {
            qk.a.m(TAG, "Race between StateWrapperImpl destruction and updateState");
        }
    }

    public native void updateStateImpl(@NonNull NativeMap nativeMap);
}
