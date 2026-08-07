package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo.k;
import vo.l;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactModalHostManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001=B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001f\u0010\u0017J!\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b!\u0010\u0013J\u001f\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0014H\u0017¢\u0006\u0004\b\"\u0010\u0017J!\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010 \u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b0\u0010\u0010J)\u00105\u001a\u0004\u0018\u00010-2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/facebook/react/views/modal/ReactModalHostManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/modal/ReactModalHostView;", "Lvo/l;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/modal/ReactModalHostView;", "view", "Ljn0/h0;", "onDropViewInstance", "(Lcom/facebook/react/views/modal/ReactModalHostView;)V", "animationType", "setAnimationType", "(Lcom/facebook/react/views/modal/ReactModalHostView;Ljava/lang/String;)V", "", "transparent", "setTransparent", "(Lcom/facebook/react/views/modal/ReactModalHostView;Z)V", "statusBarTranslucent", "setStatusBarTranslucent", "navigationBarTranslucent", "setNavigationBarTranslucent", "hardwareAccelerated", "setHardwareAccelerated", "visible", "setVisible", "value", "setPresentationStyle", "setAnimated", "Lcom/facebook/react/bridge/ReadableArray;", "setSupportedOrientations", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lcom/facebook/react/bridge/ReadableArray;)V", "", "setIdentifier", "(Lcom/facebook/react/views/modal/ReactModalHostView;I)V", "setTestId", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/facebook/react/views/modal/ReactModalHostView;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/k0;", "props", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/modal/ReactModalHostView;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements l<ReactModalHostView> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final l1<ReactModalHostView> delegate = new k(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$0(EventDispatcher eventDispatcher, v0 v0Var, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.h(new c(b1.e(v0Var), reactModalHostView.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addEventEmitters$lambda$1(EventDispatcher eventDispatcher, v0 v0Var, ReactModalHostView reactModalHostView, DialogInterface dialogInterface) {
        eventDispatcher.h(new d(b1.e(v0Var), reactModalHostView.getId()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public l1<ReactModalHostView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topRequestClose", p013kotlin.collections.v0.f(x.a("registrationName", "onRequestClose")));
        exportedCustomDirectEventTypeConstants.put("topShow", p013kotlin.collections.v0.f(x.a("registrationName", "onShow")));
        exportedCustomDirectEventTypeConstants.put("topDismiss", p013kotlin.collections.v0.f(x.a("registrationName", "onDismiss")));
        exportedCustomDirectEventTypeConstants.put("topOrientationChange", p013kotlin.collections.v0.f(x.a("registrationName", "onOrientationChange")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // vo.l
    @no.a(name = "animated")
    public void setAnimated(ReactModalHostView view, boolean value) {
        s.k(view, "view");
    }

    @Override // vo.l
    @no.a(name = "identifier")
    public void setIdentifier(ReactModalHostView view, int value) {
        s.k(view, "view");
    }

    @Override // vo.l
    @no.a(name = "presentationStyle")
    public void setPresentationStyle(ReactModalHostView view, String value) {
        s.k(view, "view");
    }

    @Override // vo.l
    @no.a(name = "supportedOrientations")
    public void setSupportedOrientations(ReactModalHostView view, ReadableArray value) {
        s.k(view, "view");
    }

    @Override // vo.l
    @no.a(name = "visible")
    public void setVisible(ReactModalHostView view, boolean visible) {
        s.k(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final v0 reactContext, final ReactModalHostView view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        final EventDispatcher eventDispatcherC = b1.c(reactContext, view.getId());
        if (eventDispatcherC != null) {
            view.setOnRequestCloseListener(new ReactModalHostView.c() { // from class: com.facebook.react.views.modal.a
                @Override // com.facebook.react.views.modal.ReactModalHostView.c
                public final void a(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$0(eventDispatcherC, reactContext, view, dialogInterface);
                }
            });
            view.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.b
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    ReactModalHostManager.addEventEmitters$lambda$1(eventDispatcherC, reactContext, view, dialogInterface);
                }
            });
            view.setEventDispatcher(eventDispatcherC);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new ReactModalHostView(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactModalHostView view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactModalHostView view) {
        s.k(view, "view");
        super.onDropViewInstance(view);
        view.e();
    }

    @Override // vo.l
    @no.a(name = "animationType")
    public void setAnimationType(ReactModalHostView view, String animationType) {
        s.k(view, "view");
        if (animationType != null) {
            view.setAnimationType(animationType);
        }
    }

    @Override // vo.l
    @no.a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView view, boolean hardwareAccelerated) {
        s.k(view, "view");
        view.setHardwareAccelerated(hardwareAccelerated);
    }

    @Override // vo.l
    @no.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(ReactModalHostView view, boolean navigationBarTranslucent) {
        s.k(view, "view");
        view.setNavigationBarTranslucent(navigationBarTranslucent);
    }

    @Override // vo.l
    @no.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(ReactModalHostView view, boolean statusBarTranslucent) {
        s.k(view, "view");
        view.setStatusBarTranslucent(statusBarTranslucent);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTestId(ReactModalHostView view, String value) {
        s.k(view, "view");
        super.setTestId(view, value);
        view.setDialogRootViewGroupTestId(value);
    }

    @Override // vo.l
    @no.a(name = "transparent")
    public void setTransparent(ReactModalHostView view, boolean transparent) {
        s.k(view, "view");
        view.setTransparent(transparent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactModalHostView view, k0 props, u0 stateWrapper) {
        s.k(view, "view");
        s.k(props, "props");
        s.k(stateWrapper, "stateWrapper");
        view.setStateWrapper(stateWrapper);
        return null;
    }
}
