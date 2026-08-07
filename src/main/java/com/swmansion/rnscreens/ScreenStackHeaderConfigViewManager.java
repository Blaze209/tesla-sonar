package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.l1;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@xn.a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b1\u0010&J!\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0019H\u0017¢\u0006\u0004\b9\u0010)J!\u0010;\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u00105J!\u0010=\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b@\u0010>J\u001f\u0010B\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010A\u001a\u00020.H\u0017¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010D\u001a\u00020.H\u0017¢\u0006\u0004\bE\u0010CJ\u001f\u0010G\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010F\u001a\u00020.H\u0017¢\u0006\u0004\bG\u0010CJ!\u0010I\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bI\u0010>J\u001f\u0010K\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010J\u001a\u00020.H\u0017¢\u0006\u0004\bK\u0010CJ\u001f\u0010M\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010L\u001a\u00020.H\u0017¢\u0006\u0004\bM\u0010CJ\u001f\u0010O\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010N\u001a\u00020.H\u0017¢\u0006\u0004\bO\u0010CJ!\u0010Q\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bQ\u00105J\u001b\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0RH\u0016¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00020UH\u0014¢\u0006\u0004\bV\u0010WJ#\u0010Y\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u00105J#\u0010Z\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u00105J!\u0010[\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010)J!\u0010\\\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010CJ!\u0010]\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\b]\u0010CJ#\u0010^\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b^\u00105J!\u0010_\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020\u0019H\u0016¢\u0006\u0004\b_\u0010)J#\u0010`\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b`\u00105J#\u0010a\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\ba\u0010>J!\u0010b\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bb\u0010CJ#\u0010c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bc\u0010>J!\u0010d\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020.H\u0016¢\u0006\u0004\bd\u0010CJ#\u0010e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\be\u00105J#\u0010f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bf\u00105J#\u0010h\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bh\u0010iJ#\u0010j\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010gH\u0016¢\u0006\u0004\bj\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/w0;", "Lvo/g0;", "<init>", "()V", "", "propName", "Ljn0/h0;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/swmansion/rnscreens/w0;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/uimanager/m;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/m;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/w0;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/k0;", "props", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/w0;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/w0;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/w0;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/w0;)I", "getChildAt", "(Lcom/swmansion/rnscreens/w0;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", "title", "setTitle", "(Lcom/swmansion/rnscreens/w0;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/w0;Ljava/lang/Integer;)V", "backgroundColor", "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/w0;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/l1;", "getDelegate", "()Lcom/facebook/react/uimanager/l1;", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "Lcom/facebook/react/bridge/ReadableArray;", "setHeaderLeftBarButtonItems", "(Lcom/swmansion/rnscreens/w0;Lcom/facebook/react/bridge/ReadableArray;)V", "setHeaderRightBarButtonItems", "delegate", "Lcom/facebook/react/uimanager/l1;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<w0> implements vo.g0<w0> {
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final l1<w0> delegate = new vo.f0(this);

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected l1<w0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return p013kotlin.collections.v0.k(jn0.x.a(com.swmansion.rnscreens.events.a.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onAttached"))), jn0.x.a(com.swmansion.rnscreens.events.c.EVENT_NAME, p013kotlin.collections.v0.k(jn0.x.a("registrationName", "onDetached"))));
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
        return new x0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public w0 createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return new w0(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(w0 parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        super.onAfterUpdateTransaction(parent);
        parent.onUpdate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(w0 view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.destroy();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void removeAllViews(w0 parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        parent.removeAllConfigSubviews();
    }

    @Override // vo.g0
    public void setBackButtonDisplayMode(w0 view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // vo.g0
    @no.a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(w0 config, boolean backButtonInCustomView) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // vo.g0
    public void setBackTitle(w0 view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // vo.g0
    public void setBackTitleFontFamily(w0 view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // vo.g0
    public void setBackTitleFontSize(w0 view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // vo.g0
    public void setBackTitleVisible(w0 view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // vo.g0
    @no.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(w0 config, Integer backgroundColor) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // vo.g0
    public void setBlurEffect(w0 view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // vo.g0
    @no.a(customType = "Color", name = "color")
    public void setColor(w0 config, Integer color) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // vo.g0
    @no.a(name = "direction")
    public void setDirection(w0 config, String direction) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setDirection(direction);
    }

    @Override // vo.g0
    public void setDisableBackButtonMenu(w0 view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // vo.g0
    public void setHeaderLeftBarButtonItems(w0 view, ReadableArray value) {
        logNotAvailable("headerLeftBarButtonItems");
    }

    @Override // vo.g0
    public void setHeaderRightBarButtonItems(w0 view, ReadableArray value) {
        logNotAvailable("headerRightBarButtonItems");
    }

    @Override // vo.g0
    @no.a(name = "hidden")
    public void setHidden(w0 config, boolean hidden) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setHidden(hidden);
    }

    @Override // vo.g0
    @no.a(name = "hideBackButton")
    public void setHideBackButton(w0 config, boolean hideBackButton) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // vo.g0
    @no.a(name = "hideShadow")
    public void setHideShadow(w0 config, boolean hideShadow) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // vo.g0
    public void setLargeTitle(w0 view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // vo.g0
    public void setLargeTitleBackgroundColor(w0 view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // vo.g0
    public void setLargeTitleColor(w0 view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // vo.g0
    public void setLargeTitleFontFamily(w0 view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // vo.g0
    public void setLargeTitleFontSize(w0 view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // vo.g0
    public void setLargeTitleFontWeight(w0 view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // vo.g0
    public void setLargeTitleHideShadow(w0 view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // vo.g0
    @no.a(name = "title")
    public void setTitle(w0 config, String title) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTitle(title);
    }

    @Override // vo.g0
    @no.a(customType = "Color", name = "titleColor")
    public void setTitleColor(w0 config, Integer titleColor) {
        p013kotlin.jvm.internal.s.k(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // vo.g0
    @no.a(name = "titleFontFamily")
    public void setTitleFontFamily(w0 config, String titleFontFamily) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // vo.g0
    @no.a(name = "titleFontSize")
    public void setTitleFontSize(w0 config, int titleFontSize) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // vo.g0
    @no.a(name = "titleFontWeight")
    public void setTitleFontWeight(w0 config, String titleFontWeight) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // vo.g0
    @no.a(name = "topInsetEnabled")
    public void setTopInsetEnabled(w0 config, boolean topInsetEnabled) {
        p013kotlin.jvm.internal.s.k(config, "config");
        logNotAvailable("topInsetEnabled");
    }

    @Override // vo.g0
    @no.a(name = "translucent")
    public void setTranslucent(w0 config, boolean translucent) {
        p013kotlin.jvm.internal.s.k(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(w0 view, com.facebook.react.uimanager.k0 props, com.facebook.react.uimanager.u0 stateWrapper) {
        p013kotlin.jvm.internal.s.k(view, "view");
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(w0 parent, View child, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        p013kotlin.jvm.internal.s.k(child, "child");
        if (child instanceof y0) {
            parent.addConfigSubview((y0) child, index);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(w0 parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getConfigSubview(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(w0 parent) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(w0 parent, int index) {
        p013kotlin.jvm.internal.s.k(parent, "parent");
        parent.removeConfigSubview(index);
    }
}
