package com.facebook.react.modules.core;

import co.c;
import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pn.e;

/* JADX INFO: loaded from: classes3.dex */
@xn.a(name = "Timing")
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/facebook/react/modules/core/TimingModule;", "Lcom/facebook/fbreact/specs/NativeTimingSpec;", "Lco/c;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lpn/e;", "devSupportManager", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lpn/e;)V", "", "callbackIDDouble", "durationDouble", "jsSchedulingTime", "", "repeat", "Ljn0/h0;", "createTimer", "(DDDZ)V", "timerIdDouble", "deleteTimer", "(D)V", "sendIdleEvents", "setSendIdleEvents", "(Z)V", "Lcom/facebook/react/bridge/WritableArray;", "timerIDs", "callTimers", "(Lcom/facebook/react/bridge/WritableArray;)V", "frameTime", "callIdleCallbacks", "", "warningMessage", "emitTimeDriftWarning", "(Ljava/lang/String;)V", "invalidate", "()V", "", "rangeMs", "hasActiveTimersInRange", "(J)Z", "Lcom/facebook/react/modules/core/JavaTimerManager;", "javaTimerManager", "Lcom/facebook/react/modules/core/JavaTimerManager;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimingModule extends NativeTimingSpec implements c {
    public static final String NAME = "Timing";
    private final JavaTimerManager javaTimerManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimingModule(ReactApplicationContext reactContext, e devSupportManager) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        s.k(devSupportManager, "devSupportManager");
        this.javaTimerManager = new JavaTimerManager(reactContext, this, b.INSTANCE.a(), devSupportManager);
    }

    @Override // co.c
    public void callIdleCallbacks(double frameTime) {
        JSTimers jSTimers;
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callIdleCallbacks(frameTime);
    }

    @Override // co.c
    public void callTimers(WritableArray timerIDs) {
        JSTimers jSTimers;
        s.k(timerIDs, "timerIDs");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.callTimers(timerIDs);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double callbackIDDouble, double durationDouble, double jsSchedulingTime, boolean repeat) {
        this.javaTimerManager.t((int) callbackIDDouble, (int) durationDouble, jsSchedulingTime, repeat);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double timerIdDouble) {
        this.javaTimerManager.deleteTimer((int) timerIdDouble);
    }

    @Override // co.c
    public void emitTimeDriftWarning(String warningMessage) {
        JSTimers jSTimers;
        s.k(warningMessage, "warningMessage");
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || (jSTimers = (JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)) == null) {
            return;
        }
        jSTimers.emitTimeDriftWarning(warningMessage);
    }

    public final boolean hasActiveTimersInRange(long rangeMs) {
        return this.javaTimerManager.u(rangeMs);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.javaTimerManager.x();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean sendIdleEvents) {
        this.javaTimerManager.setSendIdleEvents(sendIdleEvents);
    }
}
