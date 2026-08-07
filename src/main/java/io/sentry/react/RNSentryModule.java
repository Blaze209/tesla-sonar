package io.sentry.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes9.dex */
public class RNSentryModule extends ReactContextBaseJavaModule {
    private final n impl;

    RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new n(reactApplicationContext);
    }

    @ReactMethod
    public void addBreadcrumb(ReadableMap readableMap) {
        this.impl.l(readableMap);
    }

    @ReactMethod
    public void addListener(String str) {
        this.impl.m(str);
    }

    @ReactMethod
    public void captureEnvelope(String str, ReadableMap readableMap, Promise promise) {
        this.impl.o(str, readableMap, promise);
    }

    @ReactMethod
    public void captureReplay(boolean z11, Promise promise) {
        this.impl.p(z11, promise);
    }

    @ReactMethod
    public void captureScreenshot(Promise promise) {
        this.impl.q(promise);
    }

    @ReactMethod
    public void clearBreadcrumbs() {
        this.impl.s();
    }

    @ReactMethod
    public void closeNativeSdk(Promise promise) {
        this.impl.t(promise);
    }

    @ReactMethod
    public void crash() {
        this.impl.u();
    }

    @ReactMethod
    public void crashedLastRun(Promise promise) {
        this.impl.v(promise);
    }

    @ReactMethod
    public void disableNativeFramesTracking() {
        this.impl.x();
    }

    @ReactMethod
    public void enableNativeFramesTracking() {
        this.impl.y();
    }

    @ReactMethod
    public void encodeToBase64(ReadableArray readableArray, Promise promise) {
        this.impl.z(readableArray, promise);
    }

    @ReactMethod
    public void fetchModules(Promise promise) {
        this.impl.A(promise);
    }

    @ReactMethod
    public void fetchNativeAppStart(Promise promise) {
        this.impl.B(promise);
    }

    @ReactMethod
    public void fetchNativeDeviceContexts(Promise promise) {
        this.impl.D(promise);
    }

    @ReactMethod
    public void fetchNativeFrames(Promise promise) {
        this.impl.F(promise);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String fetchNativePackageName() {
        return this.impl.G();
    }

    @ReactMethod
    public void fetchNativeRelease(Promise promise) {
        this.impl.H(promise);
    }

    @ReactMethod
    public void fetchNativeSdkInfo(Promise promise) {
        this.impl.I(promise);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap fetchNativeStackFramesBy(ReadableArray readableArray) {
        return null;
    }

    @ReactMethod
    public void fetchViewHierarchy(Promise promise) {
        this.impl.J(promise);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getCurrentReplayId() {
        return this.impl.M();
    }

    @ReactMethod
    public void getDataFromUri(String str, Promise promise) {
        this.impl.N(str, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentry";
    }

    @ReactMethod
    public void getNewScreenTimeToDisplay(Promise promise) {
        this.impl.O(promise);
    }

    @ReactMethod
    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        this.impl.Y(promise);
    }

    @ReactMethod
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        this.impl.Z(readableMap, promise);
    }

    @ReactMethod
    public void popTimeToDisplayFor(String str, Promise promise) {
        this.impl.i0(str, promise);
    }

    @ReactMethod
    public void removeListeners(double d11) {
        this.impl.k0(d11);
    }

    @ReactMethod
    public boolean setActiveSpanId(String str) {
        return this.impl.l0(str);
    }

    @ReactMethod
    public void setContext(String str, ReadableMap readableMap) {
        this.impl.m0(str, readableMap);
    }

    @ReactMethod
    public void setExtra(String str, String str2) {
        this.impl.p0(str, str2);
    }

    @ReactMethod
    public void setTag(String str, String str2) {
        this.impl.q0(str, str2);
    }

    @ReactMethod
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        this.impl.r0(readableMap, readableMap2);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap startProfiling(boolean z11) {
        return this.impl.s0(z11);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap stopProfiling() {
        return this.impl.t0();
    }
}
