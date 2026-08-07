package com.swmansion.rnscreens;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/v;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/v;", "parent", "Landroid/view/View;", "child", "", "index", "Ljn0/h0;", "addView", "(Lcom/swmansion/rnscreens/v;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/v;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/v;)V", "getChildCount", "(Lcom/swmansion/rnscreens/v;)I", "getChildAt", "(Lcom/swmansion/rnscreens/v;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/m;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/m;", "", "needsCustomLayoutForChildren", "()Z", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenContainerViewManager extends ViewGroupManager<v> {
    public static final String REACT_CLASS = "RNSScreenContainer";
    private final l1<v> delegate = new vo.a0(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<v> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance(ReactApplicationContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new e1(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public v createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return new v(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void removeAllViews(v parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        parent.removeAllScreens();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(v parent, View child, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        p013kotlin.jvm.internal.s.k(child, "child");
        if (child instanceof t) {
            parent.addScreen((t) child, index);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(v parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getScreenAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(v parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(v parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        parent.removeScreenAt(index);
    }
}
