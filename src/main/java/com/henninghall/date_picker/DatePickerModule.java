package com.henninghall.date_picker;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes6.dex */
public class DatePickerModule extends ReactContextBaseJavaModule {
    private final b module;

    DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.module = new b(reactApplicationContext);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void closePicker() {
        this.module.a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDatePicker";
    }

    @ReactMethod
    public void openPicker(ReadableMap readableMap) {
        this.module.e(readableMap);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
