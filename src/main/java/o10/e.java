package o10;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00062\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001fj\b\u0012\u0004\u0012\u00020\t` H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\bJ\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R(\u00108\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lo10/e;", "Lcom/facebook/react/views/view/e;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Ljn0/h0;", "onDetachedFromWindow", "()V", "Landroid/view/View;", "child", "", "index", "addView", "(Landroid/view/View;I)V", "getChildCount", "()I", "getChildAt", "(I)Landroid/view/View;", "removeView", "(Landroid/view/View;)V", "removeViewAt", "(I)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "outChildren", "addChildrenForAccessibility", "(Ljava/util/ArrayList;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dispatchPopulateAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", IntegerTokenConverter.CONVERTER_KEY, "h", "a", "Lcom/facebook/react/uimanager/v0;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "dispatcher", "Landroid/view/WindowManager;", "c", "Landroid/view/WindowManager;", "windowManager", "Lo10/f;", DateTokenConverter.CONVERTER_KEY, "Lo10/f;", "hostView", "Lcom/facebook/react/uimanager/u0;", "stateWrapper", "getStateWrapper", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class e extends com.facebook.react.views.view.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EventDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private WindowManager windowManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f hostView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        EventDispatcher eventDispatcherC = b1.c(reactContext, getId());
        this.dispatcher = eventDispatcherC;
        Object systemService = reactContext.getSystemService("window");
        s.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        f fVar = new f(reactContext);
        this.hostView = fVar;
        fVar.setEventDispatcher$react_native_keyboard_controller_release(eventDispatcherC);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        s.k(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        UiThreadUtil.assertOnUiThread();
        this.hostView.addView(child, index);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        s.k(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int index) {
        return this.hostView.getChildAt(index);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.hostView.getChildCount();
    }

    public final u0 getStateWrapper() {
        return this.hostView.getStateWrapper();
    }

    public final void h() {
        if (this.hostView.getIsAttached()) {
            this.windowManager.removeView(this.hostView);
        }
    }

    public final void i() {
        this.windowManager.addView(this.hostView, new WindowManager.LayoutParams(-1, -1, 1000, 520, -3));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View child) {
        UiThreadUtil.assertOnUiThread();
        if (child != null) {
            this.hostView.removeView(child);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        UiThreadUtil.assertOnUiThread();
        this.hostView.removeView(getChildAt(index));
    }

    public final void setStateWrapper(u0 u0Var) {
        this.hostView.setStateWrapper$react_native_keyboard_controller_release(u0Var);
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
    }
}
