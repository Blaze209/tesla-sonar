package com.swmansion.rnscreens;

import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = ScreenStackViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u00011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030+H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/m0;", "", "<init>", "()V", "Lcom/swmansion/rnscreens/t;", AnalyticsContext.Screen, "Ljn0/h0;", "prepareOutTransition", "(Lcom/swmansion/rnscreens/t;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/m0;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/m0;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/m0;I)V", "invalidate", "getChildCount", "(Lcom/swmansion/rnscreens/m0;)I", "getChildAt", "(Lcom/swmansion/rnscreens/m0;I)Landroid/view/View;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/m;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/m;", "", "needsCustomLayoutForChildren", "()Z", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackViewManager extends ViewGroupManager<m0> {
    public static final String REACT_CLASS = "RNSScreenStack";
    private final l1<m0> delegate = new vo.j0(this);

    private final void prepareOutTransition(t screen) {
        if (screen != null) {
            screen.startRemovalTransition();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<m0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return p013kotlin.collections.v0.o(jn0.x.a(com.swmansion.rnscreens.events.t.EVENT_NAME, p013kotlin.collections.v0.o(jn0.x.a("registrationName", "onFinishTransitioning"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        o.INSTANCE.clearMapOnInvalidate();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.i
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.m createShadowNodeInstance(ReactApplicationContext context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new e1(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public m0 createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return new m0(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(m0 parent, View child, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        p013kotlin.jvm.internal.s.k(child, "child");
        if (child instanceof t) {
            t tVar = (t) child;
            o.INSTANCE.addScreenToMap(tVar.getId(), tVar);
            parent.addScreen(tVar, index);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type Screen");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(m0 parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getScreenAt(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(m0 parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(m0 parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        t screenAt = parent.getScreenAt(index);
        prepareOutTransition(screenAt);
        parent.removeScreenAt(index);
        o.INSTANCE.removeScreenFromMap(screenAt.getId());
    }
}
