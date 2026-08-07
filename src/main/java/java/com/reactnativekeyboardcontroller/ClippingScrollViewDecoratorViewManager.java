package java.com.reactnativekeyboardcontroller;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;
import m10.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljava/com/reactnativekeyboardcontroller/ClippingScrollViewDecoratorViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lm10/a;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lm10/a;", "view", "", "value", "Ljn0/h0;", "setContentInsetBottom", "(Lm10/a;D)V", "setContentInsetTop", "", "setApplyWorkaroundForContentInsetHitTestBug", "(Lm10/a;Z)V", "Lh10/a;", "manager", "Lh10/a;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClippingScrollViewDecoratorViewManager extends ViewGroupManager<a> {
    private final h10.a manager = new h10.a();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ClippingScrollViewDecoratorView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = "applyWorkaroundForContentInsetHitTestBug")
    public final void setApplyWorkaroundForContentInsetHitTestBug(a view, boolean value) {
        s.k(view, "view");
        view.setApplyWorkaroundForContentInsetHitTestBug(value);
    }

    @no.a(name = "contentInsetBottom")
    public final void setContentInsetBottom(a view, double value) {
        s.k(view, "view");
        view.setContentInsetBottom(value);
    }

    @no.a(name = "contentInsetTop")
    public final void setContentInsetTop(a view, double value) {
        s.k(view, "view");
        view.setContentInsetTop(value);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return this.manager.a(reactContext);
    }
}
