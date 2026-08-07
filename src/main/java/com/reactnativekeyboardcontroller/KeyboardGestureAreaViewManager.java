package com.reactnativekeyboardcontroller;

import com.facebook.react.uimanager.v0;
import com.facebook.react.views.view.ReactViewManager;
import m10.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lm10/g;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lm10/g;", "view", "", "offset", "Ljn0/h0;", "setInterpolator", "(Lm10/g;D)V", "interpolator", "(Lm10/g;Ljava/lang/String;)V", "", "value", "setScrollKeyboardOnScreenWhenNotVisible", "(Lm10/g;Z)V", "setScrollKeyboardOffScreenWhenVisible", "setTextInputNativeID", "Lh10/d;", "manager", "Lh10/d;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardGestureAreaViewManager extends ReactViewManager {
    private final h10.d manager = new h10.d();

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardGestureArea";
    }

    @no.a(name = "offset")
    public final void setInterpolator(g view, double offset) {
        s.k(view, "view");
        this.manager.c(view, offset);
    }

    @no.a(name = "enableSwipeToDismiss")
    public final void setScrollKeyboardOffScreenWhenVisible(g view, boolean value) {
        s.k(view, "view");
        this.manager.d(view, value);
    }

    @no.a(name = "showOnSwipeUp")
    public final void setScrollKeyboardOnScreenWhenNotVisible(g view, boolean value) {
        s.k(view, "view");
        this.manager.e(view, value);
    }

    @no.a(name = "textInputNativeID")
    public final void setTextInputNativeID(g view, String value) {
        s.k(view, "view");
        s.k(value, "value");
    }

    @no.a(name = "interpolator")
    public final void setInterpolator(g view, String interpolator) {
        s.k(view, "view");
        s.k(interpolator, "interpolator");
        this.manager.b(view, interpolator);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public g createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return this.manager.a(reactContext);
    }
}
