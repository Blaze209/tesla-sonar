package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 K2\u00020\u0001:\u0001\u001dB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001bH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u000eH\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0011\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010J\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lcom/facebook/react/runtime/h1;", "Lcom/facebook/react/x0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/react/runtime/g1;", "surface", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/g1;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Ljn0/h0;", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/View;", "childView", "Landroid/view/MotionEvent;", "ev", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", DateTokenConverter.CONVERTER_KEY, "", "t", "h", "(Ljava/lang/Throwable;)V", "isFabric", "setIsFabric", "getUIManagerType", "()I", "", "getJSModuleName", "()Ljava/lang/String;", "event", "g", "(Landroid/view/MotionEvent;)V", "isCapture", "f", "(Landroid/view/MotionEvent;Z)V", IntegerTokenConverter.CONVERTER_KEY, "()Z", "j", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "o", "Lcom/facebook/react/runtime/g1;", "Lcom/facebook/react/uimanager/k;", "u", "Lcom/facebook/react/uimanager/k;", "jsTouchDispatcher", "Lcom/facebook/react/uimanager/j;", "v", "Lcom/facebook/react/uimanager/j;", "jsPointerDispatcher", "w", "Z", "wasMeasured", "x", "I", "y", "Landroid/graphics/Point;", "getViewportOffset", "()Landroid/graphics/Point;", "viewportOffset", "z", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h1 extends com.facebook.react.x0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final a f23015z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final g1 surface;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.react.uimanager.k jsTouchDispatcher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private com.facebook.react.uimanager.j jsPointerDispatcher;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean wasMeasured;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int widthMeasureSpec;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int heightMeasureSpec;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/runtime/h1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, g1 surface) {
        super(context);
        p013kotlin.jvm.internal.s.k(surface, "surface");
        this.surface = surface;
        this.jsTouchDispatcher = new com.facebook.react.uimanager.k(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new com.facebook.react.uimanager.j(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.x0, com.facebook.react.uimanager.q0
    public void a(View childView, MotionEvent ev2) {
        com.facebook.react.uimanager.j jVar;
        p013kotlin.jvm.internal.s.k(ev2, "ev");
        EventDispatcher eventDispatcherH = this.surface.h();
        if (eventDispatcherH == null) {
            return;
        }
        this.jsTouchDispatcher.g(ev2, eventDispatcherH);
        if (childView == null || (jVar = this.jsPointerDispatcher) == null) {
            return;
        }
        jVar.p(childView, ev2, eventDispatcherH);
    }

    @Override // com.facebook.react.x0, com.facebook.react.uimanager.q0
    public void d(View childView, MotionEvent ev2) {
        p013kotlin.jvm.internal.s.k(childView, "childView");
        p013kotlin.jvm.internal.s.k(ev2, "ev");
        EventDispatcher eventDispatcherH = this.surface.h();
        if (eventDispatcherH == null) {
            return;
        }
        this.jsTouchDispatcher.f(ev2, eventDispatcherH);
        com.facebook.react.uimanager.j jVar = this.jsPointerDispatcher;
        if (jVar != null) {
            jVar.o();
        }
    }

    @Override // com.facebook.react.x0
    protected void f(MotionEvent event, boolean isCapture) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (this.jsPointerDispatcher == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                qk.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcherH = this.surface.h();
        if (eventDispatcherH == null) {
            qk.a.I("ReactSurfaceView", "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        com.facebook.react.uimanager.j jVar = this.jsPointerDispatcher;
        if (jVar != null) {
            jVar.k(event, eventDispatcherH, isCapture);
        }
    }

    @Override // com.facebook.react.x0
    protected void g(MotionEvent event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        EventDispatcher eventDispatcherH = this.surface.h();
        if (eventDispatcherH != null) {
            this.jsTouchDispatcher.d(event, eventDispatcherH, this.surface.k().h());
        } else {
            qk.a.I("ReactSurfaceView", "Unable to dispatch touch events to JS as the React instance has not been attached");
        }
    }

    @Override // com.facebook.react.x0
    public ReactContext getCurrentReactContext() {
        if (this.surface.n()) {
            return this.surface.k().h();
        }
        return null;
    }

    @Override // com.facebook.react.x0, com.facebook.react.uimanager.g0
    public String getJSModuleName() {
        String strI = this.surface.i();
        p013kotlin.jvm.internal.s.j(strI, "<get-moduleName>(...)");
        return strI;
    }

    @Override // com.facebook.react.x0, com.facebook.react.uimanager.g0
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.x0
    public void h(Throwable t11) {
        p013kotlin.jvm.internal.s.k(t11, "t");
        ReactHostImpl reactHostImplK = this.surface.k();
        p013kotlin.jvm.internal.s.j(reactHostImplK, "getReactHost(...)");
        String string = Objects.toString(t11.getMessage(), "");
        p013kotlin.jvm.internal.s.h(string);
        reactHostImplK.E0(new IllegalViewOperationException(string, this, t11));
    }

    @Override // com.facebook.react.x0
    public boolean i() {
        return this.surface.n() && this.surface.k().h() != null;
    }

    @Override // com.facebook.react.x0
    public boolean j() {
        return this.surface.n() && this.surface.k().G0();
    }

    @Override // com.facebook.react.x0
    public boolean o() {
        return this.surface.n();
    }

    @Override // com.facebook.react.x0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.wasMeasured && changed) {
            Point viewportOffset = getViewportOffset();
            this.surface.r(this.widthMeasureSpec, this.heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.x0, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int size2;
        ep.a.c(0L, "ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = getChildAt(i12);
                iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(size, size2);
        this.wasMeasured = true;
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
        Point viewportOffset = getViewportOffset();
        this.surface.r(widthMeasureSpec, heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        ep.a.i(0L);
    }

    @Override // com.facebook.react.x0, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override // com.facebook.react.x0
    public void setIsFabric(boolean isFabric) {
        super.setIsFabric(true);
    }
}
