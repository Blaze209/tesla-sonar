package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/q;", "Lcom/swmansion/rnscreens/gamma/common/a;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "viewTag", "<init>", "(Lcom/facebook/react/bridge/ReactContext;I)V", "", "tabKey", "Ljn0/h0;", "emitOnNativeFocusChange", "(Ljava/lang/String;)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends com.swmansion.rnscreens.gamma.common.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ReactContext reactContext, int i11) {
        super(reactContext, i11);
        s.k(reactContext, "reactContext");
    }

    public final void emitOnNativeFocusChange(String tabKey) {
        s.k(tabKey, "tabKey");
        getReactEventDispatcher().h(new com.swmansion.rnscreens.gamma.tabs.event.e(getSurfaceId(), getViewTag(), tabKey));
    }
}
