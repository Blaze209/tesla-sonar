package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes7.dex */
@in.a
public class EventHandler implements RCTEventEmitter {
    UIManagerModule.d mCustomEventNamesResolver;

    @in.a
    private final HybridData mHybridData;

    @in.a
    private EventHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(this.mCustomEventNamesResolver.a(str), i11, writableMap);
    }

    public native void receiveEvent(String str, int i11, WritableMap writableMap);

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
    }
}
