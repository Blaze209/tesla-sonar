package o10;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.q0;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010<\u001a\u0004\u0018\u0001058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u001e¨\u0006C"}, d2 = {"Lo10/f;", "Lcom/facebook/react/views/view/e;", "", "Lcom/facebook/react/uimanager/v0;", "reactContext", "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(II)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "onInterceptHoverEvent", "onHoverEvent", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", "childView", "ev", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/uimanager/v0;", "Lcom/facebook/react/uimanager/k;", "b", "Lcom/facebook/react/uimanager/k;", "jsTouchDispatcher", "Lo10/c;", "c", "Lo10/c;", "jsPointerDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$react_native_keyboard_controller_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "setEventDispatcher$react_native_keyboard_controller_release", "(Lcom/facebook/react/uimanager/events/EventDispatcher;)V", "eventDispatcher", "Lcom/facebook/react/uimanager/u0;", "e", "Lcom/facebook/react/uimanager/u0;", "getStateWrapper$react_native_keyboard_controller_release", "()Lcom/facebook/react/uimanager/u0;", "setStateWrapper$react_native_keyboard_controller_release", "(Lcom/facebook/react/uimanager/u0;)V", "stateWrapper", "f", "Z", "h", "()Z", "setAttached$react_native_keyboard_controller_release", "isAttached", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class f extends com.facebook.react.views.view.e implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k jsTouchDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c jsPointerDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher eventDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u0 stateWrapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v0 reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.jsTouchDispatcher = new k(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new c(this);
        }
    }

    private final void i(int width, int height) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", c10.d.a(width));
        writableNativeMap.putDouble("screenHeight", c10.d.a(height));
        u0 u0Var = this.stateWrapper;
        if (u0Var != null) {
            u0Var.updateState(writableNativeMap);
        }
    }

    @Override // com.facebook.react.uimanager.q0
    public void a(View childView, MotionEvent ev2) {
        s.k(ev2, "ev");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            this.jsTouchDispatcher.g(ev2, eventDispatcher);
            c cVar = this.jsPointerDispatcher;
            if (cVar != null) {
                cVar.p(childView, ev2, eventDispatcher);
            }
        }
    }

    @Override // com.facebook.react.uimanager.q0
    public void d(View childView, MotionEvent ev2) {
        s.k(childView, "childView");
        s.k(ev2, "ev");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            this.jsTouchDispatcher.f(ev2, eventDispatcher);
        }
        c cVar = this.jsPointerDispatcher;
        if (cVar != null) {
            cVar.o();
        }
    }

    /* JADX INFO: renamed from: getEventDispatcher$react_native_keyboard_controller_release, reason: from getter */
    public final EventDispatcher getEventDispatcher() {
        return this.eventDispatcher;
    }

    /* JADX INFO: renamed from: getStateWrapper$react_native_keyboard_controller_release, reason: from getter */
    public final u0 getStateWrapper() {
        return this.stateWrapper;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointB = c10.a.b(this.reactContext);
        i(pointB.x, pointB.y);
        this.isAttached = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i(0, 0);
        this.isAttached = false;
    }

    @Override // com.facebook.react.views.view.e, android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        c cVar;
        s.k(event, "event");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null && (cVar = this.jsPointerDispatcher) != null) {
            cVar.w(event, eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        c cVar;
        s.k(event, "event");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null && (cVar = this.jsPointerDispatcher) != null) {
            cVar.w(event, eventDispatcher, true);
        }
        return super.onInterceptHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.e, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        s.k(event, "event");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            try {
                this.jsTouchDispatcher.c(event, eventDispatcher);
                c cVar = this.jsPointerDispatcher;
                if (cVar != null) {
                    cVar.w(event, eventDispatcher, true);
                    h0 h0Var = h0.f84049a;
                }
            } catch (RuntimeException e11) {
                g10.a.f67023a.c(g.f95711a, "Can not handle touch event", e11);
                h0 h0Var2 = h0.f84049a;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.e, android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        i(width, height);
    }

    @Override // com.facebook.react.views.view.e, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        s.k(event, "event");
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            try {
                this.jsTouchDispatcher.c(event, eventDispatcher);
                c cVar = this.jsPointerDispatcher;
                if (cVar != null) {
                    cVar.w(event, eventDispatcher, false);
                    h0 h0Var = h0.f84049a;
                }
            } catch (RuntimeException e11) {
                g10.a.f67023a.c(g.f95711a, "Can not handle touch event", e11);
                h0 h0Var2 = h0.f84049a;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z11) {
        this.isAttached = z11;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(EventDispatcher eventDispatcher) {
        this.eventDispatcher = eventDispatcher;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(u0 u0Var) {
        this.stateWrapper = u0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}
