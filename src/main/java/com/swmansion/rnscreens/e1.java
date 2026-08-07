package com.swmansion.rnscreens;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/e1;", "Lcom/facebook/react/uimanager/m;", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lcom/facebook/react/uimanager/u;", "nativeViewHierarchyOptimizer", "Ljn0/h0;", "onBeforeLayout", "(Lcom/facebook/react/uimanager/u;)V", "Lcom/facebook/react/bridge/ReactContext;", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 extends com.facebook.react.uimanager.m {
    private ReactContext context;

    public e1(ReactContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBeforeLayout$lambda$0(e1 e1Var, com.facebook.react.uimanager.t tVar) {
        if (tVar == null) {
            return;
        }
        View viewResolveView = tVar.resolveView(e1Var.getReactTag());
        if (viewResolveView instanceof v) {
            ((v) viewResolveView).performUpdates();
        }
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void onBeforeLayout(com.facebook.react.uimanager.u nativeViewHierarchyOptimizer) {
        p013kotlin.jvm.internal.s.k(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.context.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new com.facebook.react.uimanager.z0() { // from class: com.swmansion.rnscreens.d1
                @Override // com.facebook.react.uimanager.z0
                public final void execute(com.facebook.react.uimanager.t tVar) {
                    e1.onBeforeLayout$lambda$0(this.f55490a, tVar);
                }
            });
        }
    }
}
