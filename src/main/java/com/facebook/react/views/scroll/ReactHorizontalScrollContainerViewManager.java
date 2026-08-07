package com.facebook.react.views.scroll;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.facebook.react.views.view.ReactViewManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "reactTag", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/k0;", "initialProps", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "Lcom/facebook/react/views/view/e;", "createViewInstance", "(ILcom/facebook/react/uimanager/v0;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Lcom/facebook/react/views/view/e;", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/view/e;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactHorizontalScrollContainerViewManager extends ReactViewManager {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";
    private static Integer uiManagerType;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.e createViewInstance(int reactTag, v0 context, k0 initialProps, u0 stateWrapper) {
        s.k(context, "context");
        if (uiManagerType == null) {
            uiManagerType = Integer.valueOf(oo.a.a(reactTag));
            View viewCreateViewInstance = super.createViewInstance(reactTag, context, initialProps, stateWrapper);
            s.j(viewCreateViewInstance, "createViewInstance(...)");
            com.facebook.react.views.view.e eVar = (com.facebook.react.views.view.e) viewCreateViewInstance;
            uiManagerType = null;
            return eVar;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.view.e createViewInstance(v0 context) {
        s.k(context, "context");
        Integer num = uiManagerType;
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (num.intValue() == 2) {
            return new com.facebook.react.views.view.e(context);
        }
        return new e(context);
    }
}
