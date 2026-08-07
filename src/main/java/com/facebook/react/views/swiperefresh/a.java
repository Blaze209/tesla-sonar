package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.m;
import com.facebook.react.uimanager.w;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\u0018\u0000 12\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\nR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\"R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\"¨\u00063"}, d2 = {"Lcom/facebook/react/views/swiperefresh/a;", "Landroidx/swiperefreshlayout/widget/c;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Landroid/view/MotionEvent;", "ev", "", "u", "(Landroid/view/MotionEvent;)Z", "refreshing", "Ljn0/h0;", "setRefreshing", "(Z)V", "", "offset", "setProgressViewOffset", "(F)V", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "c", "()Z", "disallowIntercept", "requestDisallowInterceptTouchEvent", "onInterceptTouchEvent", "onTouchEvent", "R", "Z", "didLayout", "S", "T", Gender.FEMALE, "progressViewOffset", Gender.UNKNOWN, "I", "touchSlop", "V", "prevTouchX", "W", "intercepted", "a0", "nativeGestureStarted", "b0", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends androidx.swiperefreshlayout.widget.c {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final C0462a f23647b0 = new C0462a(null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private boolean didLayout;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean refreshing;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private float progressViewOffset;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final int touchSlop;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private float prevTouchX;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private boolean intercepted;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private boolean nativeGestureStarted;

    /* JADX INFO: renamed from: com.facebook.react.views.swiperefresh.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/views/swiperefresh/a$a;", "", "<init>", "()V", "", "DEFAULT_CIRCLE_TARGET", Gender.FEMALE, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C0462a {
        public /* synthetic */ C0462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0462a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.touchSlop = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean u(MotionEvent ev2) {
        int action = ev2.getAction();
        if (action == 0) {
            this.prevTouchX = ev2.getX();
            this.intercepted = false;
        } else if (action == 2) {
            float fAbs = Math.abs(ev2.getX() - this.prevTouchX);
            if (this.intercepted || fAbs > this.touchSlop) {
                this.intercepted = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean c() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.c();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        s.k(ev2, "ev");
        if (!u(ev2) || !super.onInterceptTouchEvent(ev2)) {
            return false;
        }
        m.b(this, ev2);
        this.nativeGestureStarted = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.didLayout) {
            return;
        }
        this.didLayout = true;
        setProgressViewOffset(this.progressViewOffset);
        setRefreshing(this.refreshing);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        s.k(ev2, "ev");
        if (ev2.getActionMasked() == 1 && this.nativeGestureStarted) {
            m.a(this, ev2);
            this.nativeGestureStarted = false;
        }
        return super.onTouchEvent(ev2);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    public final void setProgressViewOffset(float offset) {
        this.progressViewOffset = offset;
        if (this.didLayout) {
            int progressCircleDiameter = getProgressCircleDiameter();
            setProgressViewOffset(false, Math.round(w.h(offset)) - progressCircleDiameter, Math.round(w.h(offset + 64.0f)) - progressCircleDiameter);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean refreshing) {
        this.refreshing = refreshing;
        if (this.didLayout) {
            super.setRefreshing(refreshing);
        }
    }
}
