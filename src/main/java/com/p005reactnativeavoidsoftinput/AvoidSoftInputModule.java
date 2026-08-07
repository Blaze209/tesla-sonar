package com.p005reactnativeavoidsoftinput;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes6.dex */
@a(name = "AvoidSoftInput")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ\u0019\u0010!\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u001aH\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000bJ\u000f\u0010)\u001a\u00020\tH\u0007¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0007¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0007¢\u0006\u0004\b+\u0010\u000bR\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/reactnativeavoidsoftinput/AvoidSoftInputModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "Ljn0/h0;", "initialize", "()V", "invalidate", "", "shouldMimic", "setShouldMimicIOSBehavior", "(Z)V", "isEnabled", "setEnabled", "", "avoidOffset", "setAvoidOffset", "(F)V", "easing", "setEasing", "(Ljava/lang/String;)V", "", "delay", "setHideAnimationDelay", "(Ljava/lang/Integer;)V", "duration", "setHideAnimationDuration", "setShowAnimationDelay", "setShowAnimationDuration", "eventName", "addListener", "count", "removeListeners", "(I)V", "setAdjustNothing", "setAdjustPan", "setAdjustResize", "setAdjustUnspecified", "setDefaultAppSoftInputMode", "Lcom/reactnativeavoidsoftinput/k;", "moduleImpl", "Lcom/reactnativeavoidsoftinput/k;", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvoidSoftInputModule extends ReactContextBaseJavaModule {
    private k moduleImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvoidSoftInputModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.moduleImpl = new k(reactContext);
    }

    @ReactMethod
    public final void addListener(String eventName) {
        s.k(eventName, "eventName");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AvoidSoftInput";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.moduleImpl.h();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.moduleImpl.i();
        super.invalidate();
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void setAdjustNothing() {
        this.moduleImpl.o();
    }

    @ReactMethod
    public final void setAdjustPan() {
        this.moduleImpl.p();
    }

    @ReactMethod
    public final void setAdjustResize() {
        this.moduleImpl.q();
    }

    @ReactMethod
    public final void setAdjustUnspecified() {
        this.moduleImpl.r();
    }

    @ReactMethod
    public final void setAvoidOffset(float avoidOffset) {
        this.moduleImpl.s(avoidOffset);
    }

    @ReactMethod
    public final void setDefaultAppSoftInputMode() {
        this.moduleImpl.t();
    }

    @ReactMethod
    public final void setEasing(String easing) {
        s.k(easing, "easing");
        this.moduleImpl.u(easing);
    }

    @ReactMethod
    public final void setEnabled(boolean isEnabled) {
        this.moduleImpl.v(isEnabled);
    }

    @ReactMethod
    public final void setHideAnimationDelay(Integer delay) {
        this.moduleImpl.w(delay);
    }

    @ReactMethod
    public final void setHideAnimationDuration(Integer duration) {
        this.moduleImpl.x(duration);
    }

    @ReactMethod
    public final void setShouldMimicIOSBehavior(boolean shouldMimic) {
        this.moduleImpl.y(shouldMimic);
    }

    @ReactMethod
    public final void setShowAnimationDelay(Integer delay) {
        this.moduleImpl.z(delay);
    }

    @ReactMethod
    public final void setShowAnimationDuration(Integer duration) {
        this.moduleImpl.A(duration);
    }
}
