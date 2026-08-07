package com.zoontek.rnpermissions;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import co.g;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;
import xn.a;

/* JADX INFO: loaded from: classes8.dex */
@a(name = "RNPermissions")
public class RNPermissionsModule extends ReactContextBaseJavaModule implements g {
    private final SparseArray<Callback> mCallbacks;

    public RNPermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCallbacks = new SparseArray<>();
    }

    @ReactMethod
    public void check(String str, Promise promise) {
        nj0.a.a(getReactApplicationContext(), str, promise);
    }

    @ReactMethod
    public void checkLocationAccuracy(Promise promise) {
        nj0.a.b(promise);
    }

    @ReactMethod
    public void checkMultiple(ReadableArray readableArray, Promise promise) {
        nj0.a.c(getReactApplicationContext(), readableArray, promise);
    }

    @ReactMethod
    public void checkNotifications(Promise promise) {
        nj0.a.d(getReactApplicationContext(), promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return nj0.a.e();
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNPermissions";
    }

    @Override // co.g
    public boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        return nj0.a.i(getReactApplicationContext(), this.mCallbacks, i11, iArr);
    }

    @ReactMethod
    public void openPhotoPicker(Promise promise) {
        nj0.a.j(promise);
    }

    @ReactMethod
    public void openSettings(Promise promise) {
        nj0.a.k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void request(String str, Promise promise) {
        nj0.a.l(getReactApplicationContext(), this, this.mCallbacks, str, promise);
    }

    @ReactMethod
    public void requestLocationAccuracy(String str, Promise promise) {
        nj0.a.m(promise);
    }

    @ReactMethod
    public void requestMultiple(ReadableArray readableArray, Promise promise) {
        nj0.a.n(getReactApplicationContext(), this, this.mCallbacks, readableArray, promise);
    }

    @ReactMethod
    public void requestNotifications(ReadableArray readableArray, Promise promise) {
        nj0.a.o(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void shouldShowRequestRationale(String str, Promise promise) {
        nj0.a.p(getReactApplicationContext(), str, promise);
    }
}
