package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/views/scroll/h;", "Landroidx/core/view/a;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Ljn0/h0;", "n", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "o", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "host", "f", "g", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "TAG", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends androidx.core.view.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    public h() {
        String simpleName = h.class.getSimpleName();
        s.j(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(View view, AccessibilityEvent event) {
        Object tag = view.getTag(com.facebook.react.m.f22652b);
        Integer numValueOf = null;
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap == null) {
            return;
        }
        event.setItemCount(readableMap.getInt("itemCount"));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 == null) {
            return;
        }
        int childCount = viewGroup2.getChildCount();
        Integer numValueOf2 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = viewGroup2.getChildAt(i11);
            if (!(view instanceof d)) {
                return;
            }
            s.h(childAt2);
            boolean zC = ((d) view).c(childAt2);
            Object tag2 = childAt2.getTag(com.facebook.react.m.f22653c);
            s.i(tag2, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
            ReadableMap readableMap2 = (ReadableMap) tag2;
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) childAt2).getChildCount();
            if (zC) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap2.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap2.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                event.setFromIndex(numValueOf.intValue());
                event.setToIndex(numValueOf2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(View view, AccessibilityNodeInfoCompat info) {
        y.d dVarFromViewTag = y.d.fromViewTag(view);
        if (dVarFromViewTag != null) {
            y.j0(info, dVarFromViewTag, view.getContext());
        }
        Object tag = view.getTag(com.facebook.react.m.f22652b);
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap != null) {
            info.v0(AccessibilityNodeInfoCompat.d.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof d) {
            info.X0(((d) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.a
    public void f(View host, AccessibilityEvent event) {
        s.k(host, "host");
        s.k(event, "event");
        super.f(host, event);
        if (host instanceof d) {
            n(host, event);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.a
    public void g(View host, AccessibilityNodeInfoCompat info) {
        s.k(host, "host");
        s.k(info, "info");
        super.g(host, info);
        if (host instanceof d) {
            o(host, info);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: " + host.getClass().getSimpleName()));
    }
}
