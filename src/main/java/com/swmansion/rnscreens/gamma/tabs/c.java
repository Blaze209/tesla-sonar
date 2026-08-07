package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/c;", "Lcom/swmansion/rnscreens/gamma/common/a;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "viewTag", "<init>", "(Lcom/facebook/react/bridge/ReactContext;I)V", "Ljn0/h0;", "emitOnWillAppear", "()V", "emitOnDidAppear", "emitOnWillDisappear", "emitOnDidDisappear", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.swmansion.rnscreens.gamma.common.a {
    public static final String TAG = "TabScreenEventEmitter";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReactContext reactContext, int i11) {
        super(reactContext, i11);
        s.k(reactContext, "reactContext");
    }

    public final void emitOnDidAppear() {
        d.logEventDispatch(getViewTag(), com.swmansion.rnscreens.gamma.tabs.event.a.EVENT_REGISTRATION_NAME);
        getReactEventDispatcher().h(new com.swmansion.rnscreens.gamma.tabs.event.a(getSurfaceId(), getViewTag()));
    }

    public final void emitOnDidDisappear() {
        d.logEventDispatch(getViewTag(), com.swmansion.rnscreens.gamma.tabs.event.b.EVENT_REGISTRATION_NAME);
        getReactEventDispatcher().h(new com.swmansion.rnscreens.gamma.tabs.event.b(getSurfaceId(), getViewTag()));
    }

    public final void emitOnWillAppear() {
        d.logEventDispatch(getViewTag(), com.swmansion.rnscreens.gamma.tabs.event.c.EVENT_REGISTRATION_NAME);
        getReactEventDispatcher().h(new com.swmansion.rnscreens.gamma.tabs.event.c(getSurfaceId(), getViewTag()));
    }

    public final void emitOnWillDisappear() {
        d.logEventDispatch(getViewTag(), com.swmansion.rnscreens.gamma.tabs.event.d.EVENT_REGISTRATION_NAME);
        getReactEventDispatcher().h(new com.swmansion.rnscreens.gamma.tabs.event.d(getSurfaceId(), getViewTag()));
    }
}
