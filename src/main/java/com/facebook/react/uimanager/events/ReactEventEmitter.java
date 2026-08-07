package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ'\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\u001e\u0010\"JI\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/facebook/react/uimanager/events/ReactEventEmitter;", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "ensureDefaultEventEmitter", "()Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "", "uiManagerType", "eventEmitter", "Ljn0/h0;", "register", "(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "unregister", "(I)V", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "surfaceId", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "Lcom/facebook/react/uimanager/events/q;", "event", "(Lcom/facebook/react/uimanager/events/q;)V", "", "canCoalesceEvent", "customCoalesceKey", "category", "(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "fabricEventEmitter", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "defaultEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactEventEmitter implements RCTModernEventEmitter {
    private static final String TAG = "ReactEventEmitter";
    private RCTEventEmitter defaultEventEmitter;
    private RCTModernEventEmitter fabricEventEmitter;
    private final ReactApplicationContext reactContext;

    public ReactEventEmitter(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final RCTEventEmitter ensureDefaultEventEmitter() {
        if (this.defaultEventEmitter == null) {
            if (this.reactContext.hasActiveReactInstance()) {
                this.defaultEventEmitter = (RCTEventEmitter) this.reactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.defaultEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @jn0.e
    public void receiveEvent(int targetTag, String eventName, WritableMap params) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        receiveEvent(-1, targetTag, eventName, params);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    @jn0.e
    public void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices) {
        RCTEventEmitter rCTEventEmitterEnsureDefaultEventEmitter;
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(touches, "touches");
        p013kotlin.jvm.internal.s.k(changedIndices, "changedIndices");
        if (touches.size() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        ReadableMap map = touches.getMap(0);
        if (oo.a.a(map != null ? map.getInt(t.TARGET_KEY) : 0) != 1 || (rCTEventEmitterEnsureDefaultEventEmitter = ensureDefaultEventEmitter()) == null) {
            return;
        }
        rCTEventEmitterEnsureDefaultEventEmitter.receiveTouches(eventName, touches, changedIndices);
    }

    public final void register(int uiManagerType, RCTModernEventEmitter eventEmitter) {
        if (uiManagerType != 2) {
            throw new IllegalStateException("Check failed.");
        }
        this.fabricEventEmitter = eventEmitter;
    }

    public final void unregister(int uiManagerType) {
        if (uiManagerType == 1) {
            this.defaultEventEmitter = null;
        } else {
            this.fabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, WritableMap params) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        receiveEvent(surfaceId, targetTag, eventName, false, 0, params, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int surfaceId, int targetTag, String eventName, boolean canCoalesceEvent, int customCoalesceKey, WritableMap params, int category) {
        RCTModernEventEmitter rCTModernEventEmitter;
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        int iB = oo.a.b(targetTag, surfaceId);
        if (iB != 1) {
            if (iB == 2 && (rCTModernEventEmitter = this.fabricEventEmitter) != null) {
                rCTModernEventEmitter.receiveEvent(surfaceId, targetTag, eventName, canCoalesceEvent, customCoalesceKey, params, category);
                return;
            }
            return;
        }
        RCTEventEmitter rCTEventEmitterEnsureDefaultEventEmitter = ensureDefaultEventEmitter();
        if (rCTEventEmitterEnsureDefaultEventEmitter != null) {
            rCTEventEmitterEnsureDefaultEventEmitter.receiveEvent(targetTag, eventName, params);
        }
    }

    public final void register(int uiManagerType, RCTEventEmitter eventEmitter) {
        if (uiManagerType == 1) {
            this.defaultEventEmitter = eventEmitter;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    @jn0.e
    public void receiveTouches(q event) {
        RCTModernEventEmitter rCTModernEventEmitter;
        p013kotlin.jvm.internal.s.k(event, "event");
        int iB = oo.a.b(event.getViewTag(), event.getSurfaceId());
        if (iB != 1) {
            if (iB == 2 && (rCTModernEventEmitter = this.fabricEventEmitter) != null) {
                t.c(rCTModernEventEmitter, event);
                return;
            }
            return;
        }
        RCTEventEmitter rCTEventEmitterEnsureDefaultEventEmitter = ensureDefaultEventEmitter();
        if (rCTEventEmitterEnsureDefaultEventEmitter != null) {
            t.d(rCTEventEmitterEnsureDefaultEventEmitter, event);
        }
    }
}
