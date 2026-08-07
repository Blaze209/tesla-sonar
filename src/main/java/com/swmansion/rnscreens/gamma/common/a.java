package com.swmansion.rnscreens.gamma.common;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/swmansion/rnscreens/gamma/common/a;", "", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "viewTag", "<init>", "(Lcom/facebook/react/bridge/ReactContext;I)V", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "I", "getViewTag", "()I", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "reactEventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getReactEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "getSurfaceId", "surfaceId", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {
    public static final String TAG = "BaseEventEmitter";
    private final ReactContext reactContext;
    private final EventDispatcher reactEventDispatcher;
    private final int viewTag;

    public a(ReactContext reactContext, int i11) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.viewTag = i11;
        EventDispatcher eventDispatcherC = b1.c(reactContext, i11);
        if (eventDispatcherC != null) {
            this.reactEventDispatcher = eventDispatcherC;
            return;
        }
        throw new IllegalStateException(("[RNScreens] Nullish event dispatcher for view with tag: " + i11).toString());
    }

    public final ReactContext getReactContext() {
        return this.reactContext;
    }

    protected final EventDispatcher getReactEventDispatcher() {
        return this.reactEventDispatcher;
    }

    protected final int getSurfaceId() {
        return b1.e(this.reactContext);
    }

    public final int getViewTag() {
        return this.viewTag;
    }
}
