package com.content;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import no.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/reactnativestripesdk/GooglePayButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/j0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "view", "Ljn0/h0;", "onAfterUpdateTransaction", "(Lcom/reactnativestripesdk/j0;)V", "", "buttonType", "type", "(Lcom/reactnativestripesdk/j0;I)V", "appearance", Snapshot.BORDER_RADIUS, "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativestripesdk/j0;", "Companion", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GooglePayButtonManager extends SimpleViewManager<j0> {
    public static final String REACT_CLASS = "GooglePayButton";

    @a(name = "appearance")
    public final void appearance(j0 view, int appearance) {
        s.k(view, "view");
        view.setAppearance(appearance);
    }

    @a(name = Snapshot.BORDER_RADIUS)
    public final void borderRadius(j0 view, int borderRadius) {
        s.k(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @a(name = "type")
    public final void type(j0 view, int buttonType) {
        s.k(view, "view");
        view.setType(buttonType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public j0 createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new j0(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(j0 view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.g();
    }
}
