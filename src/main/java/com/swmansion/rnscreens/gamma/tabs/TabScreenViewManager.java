package com.swmansion.rnscreens.gamma.tabs;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import com.facebook.react.uimanager.v0;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vo.w;
import vo.x;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = TabScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010!J#\u0010&\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010$J#\u0010'\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010!J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010!J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b,\u0010!J!\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010!J!\u0010.\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b.\u0010$J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b/\u0010*J#\u00100\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b0\u0010!J#\u00101\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010!J#\u00102\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010!J#\u00103\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010!J!\u00104\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b4\u0010\u001fJ!\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010!J!\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u0010!J!\u00107\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b7\u0010!J!\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b8\u0010$R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "Lvo/x;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/gamma/tabs/a;", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "Ljn0/h0;", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "setStandardAppearance", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/facebook/react/bridge/Dynamic;)V", "setScrollEdgeAppearance", "", "setTabBarItemBadgeBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Ljava/lang/Integer;)V", "setIconType", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setIconImageSource", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/facebook/react/bridge/ReadableMap;)V", "setIconSfSymbolName", "setSelectedIconImageSource", "setSelectedIconSfSymbolName", "", "setIsFocused", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V", "setTabKey", "setBadgeValue", "setTitle", "setSpecialEffects", "setOverrideScrollViewContentInsetAdjustmentBehavior", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setTabBarItemBadgeTextColor", "setDrawableIconResourceName", "setOrientation", "setSystemItem", "setImageIconResource", "delegate", "Lcom/facebook/react/uimanager/l1;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/v0;", "getContext", "()Lcom/facebook/react/uimanager/v0;", "setContext", "(Lcom/facebook/react/uimanager/v0;)V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TabScreenViewManager extends ViewGroupManager<a> implements x<a> {
    public static final String REACT_CLASS = "RNSBottomTabsScreen";
    private v0 context;
    private final l1<a> delegate = new w(this);

    public final v0 getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return p013kotlin.collections.v0.o(ba0.a.makeEventRegistrationInfo(com.swmansion.rnscreens.gamma.tabs.event.c.INSTANCE), ba0.a.makeEventRegistrationInfo(com.swmansion.rnscreens.gamma.tabs.event.a.INSTANCE), ba0.a.makeEventRegistrationInfo(com.swmansion.rnscreens.gamma.tabs.event.d.INSTANCE), ba0.a.makeEventRegistrationInfo(com.swmansion.rnscreens.gamma.tabs.event.b.INSTANCE));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // vo.x
    public void setBottomScrollEdgeEffect(a view, String value) {
    }

    public final void setContext(v0 v0Var) {
        this.context = v0Var;
    }

    @Override // vo.x
    public void setIconImageSource(a view, ReadableMap value) {
    }

    @Override // vo.x
    public void setIconSfSymbolName(a view, String value) {
    }

    @Override // vo.x
    public void setIconType(a view, String value) {
    }

    @Override // vo.x
    public void setLeftScrollEdgeEffect(a view, String value) {
    }

    @Override // vo.x
    public void setOrientation(a view, String value) {
        s.k(view, "view");
    }

    @Override // vo.x
    public void setOverrideScrollViewContentInsetAdjustmentBehavior(a view, boolean value) {
        s.k(view, "view");
    }

    @Override // vo.x
    public void setRightScrollEdgeEffect(a view, String value) {
    }

    @Override // vo.x
    public void setScrollEdgeAppearance(a view, Dynamic value) {
        s.k(view, "view");
        s.k(value, "value");
    }

    @Override // vo.x
    public void setSelectedIconImageSource(a view, ReadableMap value) {
    }

    @Override // vo.x
    public void setSelectedIconSfSymbolName(a view, String value) {
    }

    @Override // vo.x
    public void setSpecialEffects(a view, ReadableMap value) {
        s.k(view, "view");
    }

    @Override // vo.x
    public void setStandardAppearance(a view, Dynamic value) {
        s.k(view, "view");
        s.k(value, "value");
    }

    @Override // vo.x
    public void setSystemItem(a view, String value) {
        s.k(view, "view");
    }

    @Override // vo.x
    public void setTopScrollEdgeEffect(a view, String value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(v0 reactContext, a view) {
        s.k(reactContext, "reactContext");
        s.k(view, "view");
        super.addEventEmitters(reactContext, view);
        view.onViewManagerAddEventEmitters$react_native_screens_release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        com.swmansion.rnscreens.utils.g.INSTANCE.d(REACT_CLASS, "createViewInstance");
        return new a(reactContext);
    }

    @Override // vo.x
    @no.a(name = "badgeValue")
    public void setBadgeValue(a view, String value) {
        s.k(view, "view");
        view.setBadgeValue(value);
    }

    @Override // vo.x
    @no.a(name = "drawableIconResourceName")
    public void setDrawableIconResourceName(a view, String value) {
        s.k(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // vo.x
    @no.a(name = "imageIconResource")
    public void setImageIconResource(a view, ReadableMap value) {
        s.k(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            s.j(context, "getContext(...)");
            com.swmansion.rnscreens.gamma.tabs.image.d.loadTabImage(context, string, view);
        }
    }

    @Override // vo.x
    @no.a(name = "isFocused")
    public void setIsFocused(a view, boolean value) {
        s.k(view, "view");
        com.swmansion.rnscreens.utils.g.INSTANCE.d(REACT_CLASS, "TabScreen [" + view.getId() + "] setIsFocused " + value);
        view.setFocusedTab(value);
    }

    @Override // vo.x
    @no.a(customType = "Color", name = "tabBarItemBadgeBackgroundColor")
    public void setTabBarItemBadgeBackgroundColor(a view, Integer value) {
        s.k(view, "view");
        view.setTabBarItemBadgeBackgroundColor(value);
    }

    @Override // vo.x
    @no.a(customType = "Color", name = "tabBarItemBadgeTextColor")
    public void setTabBarItemBadgeTextColor(a view, Integer value) {
        s.k(view, "view");
        view.setTabBarItemBadgeTextColor(value);
    }

    @Override // vo.x
    @no.a(name = "tabKey")
    public void setTabKey(a view, String value) {
        s.k(view, "view");
        view.setTabKey(value);
    }

    @Override // vo.x
    @no.a(name = "title")
    public void setTitle(a view, String value) {
        s.k(view, "view");
        view.setTabTitle(value);
    }
}
