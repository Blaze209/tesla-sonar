package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;

/* JADX INFO: loaded from: classes4.dex */
public class p0 extends a1 {
    public p0(ReactApplicationContext reactApplicationContext, p1 p1Var, EventDispatcher eventDispatcher, int i11) {
        super(reactApplicationContext, p1Var, new h1(reactApplicationContext, new ReanimatedNativeHierarchyManager(p1Var, reactApplicationContext), i11), eventDispatcher);
    }

    @Override // com.facebook.react.uimanager.a1
    public void u(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.u(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}
