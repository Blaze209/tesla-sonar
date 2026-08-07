package com.worklets;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/* JADX INFO: loaded from: classes8.dex */
abstract class WorkletsSpec extends ReactContextBaseJavaModule {
    WorkletsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public abstract boolean install();
}
