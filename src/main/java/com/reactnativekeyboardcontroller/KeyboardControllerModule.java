package com.reactnativekeyboardcontroller;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import j10.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b \u0010\u0018J\u0019\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "mReactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "", "mode", "Ljn0/h0;", "setInputMode", "(I)V", "setDefaultMode", "()V", "preload", "", "keepFocus", "animated", "dismiss", "(ZZ)V", "direction", "setFocusTo", "(Ljava/lang/String;)V", "", "viewTag", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "viewPositionInWindow", "(DLcom/facebook/react/bridge/Promise;)V", "eventName", "addListener", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Lj10/g;", "module", "Lj10/g;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardControllerModule extends ReactContextBaseJavaModule {
    private final g module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardControllerModule(ReactApplicationContext mReactContext) {
        super(mReactContext);
        s.k(mReactContext, "mReactContext");
        this.module = new g(mReactContext);
    }

    @ReactMethod
    public final void addListener(String eventName) {
    }

    @ReactMethod
    public final void dismiss(boolean keepFocus, boolean animated) {
        this.module.g(keepFocus, animated);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardController";
    }

    @ReactMethod
    public final void preload() {
        this.module.m();
    }

    @ReactMethod
    public final void removeListeners(Integer count) {
    }

    @ReactMethod
    public final void setDefaultMode() {
        this.module.n();
    }

    @ReactMethod
    public final void setFocusTo(String direction) {
        s.k(direction, "direction");
        this.module.o(direction);
    }

    @ReactMethod
    public final void setInputMode(int mode) {
        this.module.q(mode);
    }

    @ReactMethod
    public final void viewPositionInWindow(double viewTag, Promise promise) {
        s.k(promise, "promise");
        this.module.t(viewTag, promise);
    }
}
