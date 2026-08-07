package com.p005reactnativeavoidsoftinput;

import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.e;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes6.dex */
@a(name = "AvoidSoftInputView")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b!\u0010\u001fJ!\u0010\"\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\"\u0010\u001fJ!\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b#\u0010\u001fJ\u001b\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/reactnativeavoidsoftinput/AvoidSoftInputViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lcom/reactnativeavoidsoftinput/q;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativeavoidsoftinput/q;", "Lcom/facebook/react/views/view/e;", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/view/e;)Lcom/facebook/react/views/view/e;", "", "avoidOffset", "Ljn0/h0;", "setAvoidOffset", "(Lcom/reactnativeavoidsoftinput/q;F)V", "easing", "setEasing", "(Lcom/reactnativeavoidsoftinput/q;Ljava/lang/String;)V", "", "enabled", "setEnabled", "(Lcom/reactnativeavoidsoftinput/q;Z)V", "", "delay", "setHideAnimationDelay", "(Lcom/reactnativeavoidsoftinput/q;Ljava/lang/Integer;)V", "duration", "setHideAnimationDuration", "setShowAnimationDelay", "setShowAnimationDuration", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvoidSoftInputViewManager extends ReactViewManager {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return v0.k(x.a("topSoftInputAppliedOffsetChange", v0.k(x.a("registrationName", "onSoftInputAppliedOffsetChange"))), x.a("topSoftInputHeightChange", v0.k(x.a("registrationName", "onSoftInputHeightChange"))), x.a("topSoftInputHidden", v0.k(x.a("registrationName", "onSoftInputHidden"))), x.a("topSoftInputShown", v0.k(x.a("registrationName", "onSoftInputShown"))));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AvoidSoftInputView";
    }

    @no.a(name = "avoidOffset")
    public final void setAvoidOffset(q view, float avoidOffset) {
        s.k(view, "view");
        view.setAvoidOffset(avoidOffset);
    }

    @no.a(name = "easing")
    public final void setEasing(q view, String easing) {
        s.k(view, "view");
        view.setEasing(easing);
    }

    @no.a(defaultBoolean = true, name = "enabled")
    public final void setEnabled(q view, boolean enabled) {
        s.k(view, "view");
        view.setIsEnabled(enabled);
    }

    @no.a(name = "hideAnimationDelay")
    public final void setHideAnimationDelay(q view, Integer delay) {
        s.k(view, "view");
        view.setHideAnimationDelay(delay);
    }

    @no.a(name = "hideAnimationDuration")
    public final void setHideAnimationDuration(q view, Integer duration) {
        s.k(view, "view");
        view.setHideAnimationDuration(duration);
    }

    @no.a(name = "showAnimationDelay")
    public final void setShowAnimationDelay(q view, Integer delay) {
        s.k(view, "view");
        view.setShowAnimationDelay(delay);
    }

    @no.a(name = "showAnimationDuration")
    public final void setShowAnimationDuration(q view, Integer duration) {
        s.k(view, "view");
        view.setShowAnimationDuration(duration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public e prepareToRecycleView(com.facebook.react.uimanager.v0 reactContext, e view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        ((q) view).j();
        super.prepareToRecycleView(reactContext, view);
        return view;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public q createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new q(reactContext);
    }
}
