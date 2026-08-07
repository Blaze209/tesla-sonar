package expo.modules.kotlin.views;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.l0;
import com.facebook.react.uimanager.u0;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0017J\u001d\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010\u001fJ'\u0010(\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lexpo/modules/kotlin/views/GroupViewManagerWrapper;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Landroid/view/ViewGroup;", "Lexpo/modules/kotlin/views/ViewWrapperDelegateHolder;", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "viewWrapperDelegate", "<init>", "(Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Landroid/view/ViewGroup;", "viewToUpdate", "Lcom/facebook/react/uimanager/k0;", "props", "Ljn0/h0;", "updateProperties", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/k0;)V", "view", "onAfterUpdateTransaction", "(Landroid/view/ViewGroup;)V", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "", "updateState", "(Landroid/view/ViewGroup;Lcom/facebook/react/uimanager/k0;Lcom/facebook/react/uimanager/u0;)Ljava/lang/Object;", "", "getNativeProps", "()Ljava/util/Map;", "onDropViewInstance", "", "getExportedCustomDirectEventTypeConstants", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "getChildCount", "(Landroid/view/ViewGroup;)I", "getChildAt", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "removeViewAt", "(Landroid/view/ViewGroup;I)V", "removeView", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "getViewWrapperDelegate", "()Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupViewManagerWrapper extends ViewGroupManager<ViewGroup> implements ViewWrapperDelegateHolder {
    private final ViewManagerWrapperDelegate viewWrapperDelegate;

    public GroupViewManagerWrapper(ViewManagerWrapperDelegate viewWrapperDelegate) {
        s.k(viewWrapperDelegate, "viewWrapperDelegate");
        this.viewWrapperDelegate = viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapR;
        Map<String, Object> exportedCustomDirectEventTypeConstants = getViewWrapperDelegate().getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = v0.i();
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants2 = super.getExportedCustomDirectEventTypeConstants();
        return (exportedCustomDirectEventTypeConstants2 == null || (mapR = v0.r(exportedCustomDirectEventTypeConstants2, exportedCustomDirectEventTypeConstants)) == null) ? exportedCustomDirectEventTypeConstants : mapR;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ViewManagerAdapter_" + getViewWrapperDelegate().getName();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, String> getNativeProps() {
        Map<String, String> nativeProps = super.getNativeProps();
        for (Map.Entry<String, AnyViewProp> entry : getViewWrapperDelegate().getProps().entrySet()) {
            String key = entry.getKey();
            AnyViewProp value = entry.getValue();
            s.h(nativeProps);
            nativeProps.put(key, String.valueOf(value.getType().getKType().getClassifier()));
        }
        s.h(nativeProps);
        return nativeProps;
    }

    @Override // expo.modules.kotlin.views.ViewWrapperDelegateHolder
    public ViewManagerWrapperDelegate getViewWrapperDelegate() {
        return this.viewWrapperDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(ViewGroup parent, View view) {
        h0 h0Var;
        p<ViewGroup, View, h0> removeViewAction;
        s.k(parent, "parent");
        s.k(view, "view");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (removeViewAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAction()) == null) {
            h0Var = null;
        } else {
            removeViewAction.invoke(parent, view);
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            super.removeView(parent, view);
            h0 h0Var2 = h0.f84049a;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void addView(ViewGroup parent, View child, int index) {
        h0 h0Var;
        q<ViewGroup, View, Integer, h0> addViewAction;
        s.k(parent, "parent");
        s.k(child, "child");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (addViewAction = viewGroupDefinition$expo_modules_core_release.getAddViewAction()) == null) {
            h0Var = null;
        } else {
            addViewAction.invoke(parent, child, Integer.valueOf(index));
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            super.addView(parent, child, index);
            h0 h0Var2 = h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewGroup createViewInstance(com.facebook.react.uimanager.v0 reactContext) {
        s.k(reactContext, "reactContext");
        View viewCreateView = getViewWrapperDelegate().createView(reactContext);
        s.i(viewCreateView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) viewCreateView;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public View getChildAt(ViewGroup parent, int index) {
        p<ViewGroup, Integer, View> getChildAtAction;
        s.k(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        return (viewGroupDefinition$expo_modules_core_release == null || (getChildAtAction = viewGroupDefinition$expo_modules_core_release.getGetChildAtAction()) == null) ? super.getChildAt(parent, index) : getChildAtAction.invoke(parent, Integer.valueOf(index));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public int getChildCount(ViewGroup parent) {
        l<ViewGroup, Integer> getChildCountAction;
        s.k(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        Integer numInvoke = (viewGroupDefinition$expo_modules_core_release == null || (getChildCountAction = viewGroupDefinition$expo_modules_core_release.getGetChildCountAction()) == null) ? null : getChildCountAction.invoke(parent);
        if (numInvoke == null) {
            numInvoke = Integer.valueOf(super.getChildCount(parent));
        }
        return numInvoke.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ViewGroup view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        getViewWrapperDelegate().onViewDidUpdateProps(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ViewGroup view) {
        s.k(view, "view");
        super.onDropViewInstance(view);
        getViewWrapperDelegate().onDestroy(view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public void removeViewAt(ViewGroup parent, int index) {
        h0 h0Var;
        p<ViewGroup, Integer, h0> removeViewAtAction;
        s.k(parent, "parent");
        ViewGroupDefinition viewGroupDefinition$expo_modules_core_release = getViewWrapperDelegate().getViewGroupDefinition$expo_modules_core_release();
        if (viewGroupDefinition$expo_modules_core_release == null || (removeViewAtAction = viewGroupDefinition$expo_modules_core_release.getRemoveViewAtAction()) == null) {
            h0Var = null;
        } else {
            removeViewAtAction.invoke(parent, Integer.valueOf(index));
            h0Var = h0.f84049a;
        }
        if (h0Var == null) {
            super.removeViewAt(parent, index);
            h0 h0Var2 = h0.f84049a;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateProperties(ViewGroup viewToUpdate, k0 props) {
        s.k(viewToUpdate, "viewToUpdate");
        s.k(props, "props");
        ReadableMap readableMapA = l0.a(props);
        super.updateProperties(viewToUpdate, new k0(new FilteredReadableMap(readableMapA, getViewWrapperDelegate().updateProperties(viewToUpdate, readableMapA))));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ViewGroup view, k0 props, u0 stateWrapper) {
        s.k(view, "view");
        ExpoView expoView = view instanceof ExpoView ? (ExpoView) view : null;
        if (expoView == null) {
            return null;
        }
        expoView.setStateWrapper(stateWrapper);
        return super.updateState(expoView, props, stateWrapper);
    }
}
