package com.facebook.react.views.drawer;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.m;
import com.facebook.react.uimanager.y;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \"2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u000eR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/facebook/react/views/drawer/a;", "Lb7/a;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Ljn0/h0;", "V", "()V", Gender.UNKNOWN, "", "newDrawerPosition", "setDrawerPosition$ReactAndroid_release", "(I)V", "setDrawerPosition", "drawerWidthInPx", "setDrawerWidth$ReactAndroid_release", "setDrawerWidth", "setDrawerProperties$ReactAndroid_release", "setDrawerProperties", "Q", "I", "drawerPosition", "R", "drawerWidth", "S", "Z", "dragging", "T", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends b7.a {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private int drawerPosition;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int drawerWidth;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean dragging;

    /* JADX INFO: renamed from: com.facebook.react.views.drawer.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/facebook/react/views/drawer/a$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Ljn0/h0;", "g", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "f", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0457a extends androidx.core.view.a {
        C0457a() {
        }

        @Override // androidx.core.view.a
        public void f(View host, AccessibilityEvent event) {
            s.k(host, "host");
            s.k(event, "event");
            super.f(host, event);
            Object tag = host.getTag(m.f22657g);
            if (tag instanceof y.d) {
                event.setClassName(y.d.getValue((y.d) tag));
            }
        }

        @Override // androidx.core.view.a
        public void g(View host, AccessibilityNodeInfoCompat info) {
            s.k(host, "host");
            s.k(info, "info");
            super.g(host, info);
            y.d dVarFromViewTag = y.d.fromViewTag(host);
            if (dVarFromViewTag != null) {
                info.t0(y.d.getValue(dVarFromViewTag));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.drawerPosition = 8388611;
        this.drawerWidth = -1;
        ViewCompat.p0(this, new C0457a());
    }

    @SuppressLint({"WrongConstant"})
    public final void U() {
        d(this.drawerPosition);
    }

    @SuppressLint({"WrongConstant"})
    public final void V() {
        I(this.drawerPosition);
    }

    @Override // b7.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        s.k(ev2, "ev");
        try {
            if (!super.onInterceptTouchEvent(ev2)) {
                return false;
            }
            com.facebook.react.uimanager.events.m.b(this, ev2);
            this.dragging = true;
            return true;
        } catch (IllegalArgumentException e11) {
            qk.a.J("ReactNative", "Error intercepting touch event.", e11);
            return false;
        }
    }

    @Override // b7.a, android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        s.k(ev2, "ev");
        if (ev2.getActionMasked() == 1 && this.dragging) {
            com.facebook.react.uimanager.events.m.a(this, ev2);
            this.dragging = false;
        }
        return super.onTouchEvent(ev2);
    }

    public final void setDrawerPosition$ReactAndroid_release(int newDrawerPosition) {
        this.drawerPosition = newDrawerPosition;
        setDrawerProperties$ReactAndroid_release();
    }

    public final void setDrawerProperties$ReactAndroid_release() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            s.i(layoutParams, "null cannot be cast to non-null type androidx.drawerlayout.widget.DrawerLayout.LayoutParams");
            b7.a.f fVar = (b7.a.f) layoutParams;
            fVar.f16762a = this.drawerPosition;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.drawerWidth;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    public final void setDrawerWidth$ReactAndroid_release(int drawerWidthInPx) {
        this.drawerWidth = drawerWidthInPx;
        setDrawerProperties$ReactAndroid_release();
    }
}
