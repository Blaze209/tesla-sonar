package com.ReactNativeBlobUtil;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeBlobUtil extends ReactContextBaseJavaModule {
    private final d delegate;

    public ReactNativeBlobUtil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new d(reactApplicationContext);
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, String str3, Promise promise) {
        this.delegate.c(str, str2, str3, promise);
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        this.delegate.d(readableMap, promise);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        this.delegate.e(str, callback);
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        this.delegate.f(str, callback);
    }

    @ReactMethod
    public void copyToInternal(String str, String str2, Promise promise) {
        this.delegate.g(str, str2, promise);
    }

    @ReactMethod
    public void copyToMediaStore(ReadableMap readableMap, String str, String str2, Promise promise) {
        this.delegate.h(readableMap, str, str2, promise);
    }

    @ReactMethod
    public void cp(String str, String str2, Callback callback) {
        this.delegate.i(str, str2, callback);
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        this.delegate.j(str, str2, str3, promise);
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        this.delegate.k(str, readableArray, promise);
    }

    @ReactMethod
    public void createMediaFile(ReadableMap readableMap, String str, Promise promise) {
        this.delegate.l(readableMap, str, promise);
    }

    @ReactMethod
    public void df(Callback callback) {
        this.delegate.m(callback);
    }

    @ReactMethod
    public void enableProgressReport(String str, int i11, int i12) {
        this.delegate.n(str, i11, i12);
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i11, int i12) {
        this.delegate.o(str, i11, i12);
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        this.delegate.p(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        this.delegate.q(readableMap, str, str2, str3, readableMap2, str4, callback);
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        this.delegate.r(readableMap, str, str2, str3, readableMap2, readableArray, callback);
    }

    @ReactMethod
    public void getBlob(String str, String str2, Promise promise) {
        this.delegate.s(str, str2, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.putAll(c.m(getReactApplicationContext()));
        map.putAll(c.j(getReactApplicationContext()));
        return map;
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        this.delegate.t(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "ReactNativeBlobUtil";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        this.delegate.u(promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        this.delegate.v(promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        this.delegate.w(str, str2, promise);
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        this.delegate.x(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        this.delegate.y(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        this.delegate.z(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        this.delegate.A(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, boolean z11, Promise promise) {
        this.delegate.B(str, str2, z11, promise);
    }

    @ReactMethod
    public void readStream(String str, String str2, int i11, int i12, String str3) {
        this.delegate.C(str, str2, i11, i12, str3);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        this.delegate.D(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        this.delegate.E(readableArray, callback);
    }

    @ReactMethod
    public void slice(String str, String str2, double d11, double d12, Promise promise) {
        this.delegate.F(str, str2, (long) d11, (long) d12, promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        this.delegate.G(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        this.delegate.H(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        this.delegate.I(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        this.delegate.J(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z11, boolean z12, Promise promise) {
        this.delegate.K(str, str2, str3, z11, z12, promise);
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z11, Promise promise) {
        this.delegate.L(str, readableArray, z11, promise);
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z11, Callback callback) {
        this.delegate.M(str, str2, z11, callback);
    }

    @ReactMethod
    public void writeToMediaFile(String str, String str2, boolean z11, Promise promise) {
        this.delegate.N(str, str2, z11, promise);
    }
}
