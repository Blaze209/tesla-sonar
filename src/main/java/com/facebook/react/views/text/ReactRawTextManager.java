package com.facebook.react.views.text;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.v0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@xn.a(name = ReactRawTextManager.REACT_CLASS)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/text/ReactRawTextManager;", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/views/text/e;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/views/text/h;", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/facebook/react/views/text/h;", "reactContext", "view", "prepareToRecycleView", "(Lcom/facebook/react/uimanager/v0;Landroid/view/View;)Landroid/view/View;", "", "extraData", "Ljn0/h0;", "updateExtraData", "(Landroid/view/View;Ljava/lang/Object;)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "createShadowNodeInstance", "()Lcom/facebook/react/views/text/e;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactRawTextManager extends ViewManager<View, e> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<e> getShadowNodeClass() {
        return e.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected View prepareToRecycleView(v0 reactContext, View view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        throw new IllegalStateException("Attempt to recycle a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object extraData) {
        s.k(view, "view");
        s.k(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createShadowNodeInstance() {
        return new e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(v0 context) {
        s.k(context, "context");
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
