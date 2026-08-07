package com.reactnativekeyboardcontroller;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.e;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J)\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/views/view/e;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/view/e;", "Ljn0/h0;", "invalidate", "view", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/view/e;)V", "Lm10/d;", "", "enabled", "setEnabled", "(Lm10/d;Z)V", "isStatusBarTranslucent", "setStatusBarTranslucent", "isNavigationBarTranslucent", "setNavigationBarTranslucent", "isPreservingEdgeToEdge", "setPreserveEdgeToEdge", "root", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/view/e;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lh10/c;", "manager", "Lh10/c;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyboardControllerViewManager extends ReactViewManager {
    private final h10.c manager = new h10.c();

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.manager.b();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardControllerView";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.manager.c();
    }

    @no.a(name = "enabled")
    public final void setEnabled(m10.d view, boolean enabled) {
        s.k(view, "view");
        this.manager.e(view, enabled);
    }

    @no.a(name = "navigationBarTranslucent")
    public final void setNavigationBarTranslucent(m10.d view, boolean isNavigationBarTranslucent) {
        s.k(view, "view");
        this.manager.f(view, isNavigationBarTranslucent);
    }

    @no.a(name = "preserveEdgeToEdge")
    public final void setPreserveEdgeToEdge(m10.d view, boolean isPreservingEdgeToEdge) {
        s.k(view, "view");
        this.manager.g(view, isPreservingEdgeToEdge);
    }

    @no.a(name = "statusBarTranslucent")
    public final void setStatusBarTranslucent(m10.d view, boolean isStatusBarTranslucent) {
        s.k(view, "view");
        this.manager.h(view, isStatusBarTranslucent);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public e createViewInstance(v0 context) {
        s.k(context, "context");
        return this.manager.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(e view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        this.manager.d((m10.d) view);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e root, String commandId, ReadableArray args) {
        s.k(root, "root");
        s.k(commandId, "commandId");
        if (s.f(commandId, "synchronizeFocusedInputLayout")) {
            this.manager.i((m10.d) root);
        } else {
            super.receiveCommand(root, commandId, args);
        }
    }
}
