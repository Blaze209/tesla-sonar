package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/view/View;", "rootView", "Lcom/th3rdwave/safeareacontext/a;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/a;", "c", "b", "view", "e", "Landroid/view/ViewGroup;", "Lcom/th3rdwave/safeareacontext/c;", "a", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/th3rdwave/safeareacontext/c;", "react-native-safe-area-context_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final Rect a(ViewGroup rootView, View view) {
        s.k(rootView, "rootView");
        s.k(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static final EdgeInsets b(View view) {
        return Build.VERSION.SDK_INT >= 30 ? d(view) : c(view);
    }

    private static final EdgeInsets c(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new EdgeInsets(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    private static final EdgeInsets d(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar())) == null) {
            return null;
        }
        return new EdgeInsets(insets.top, insets.right, insets.bottom, insets.left);
    }

    public static final EdgeInsets e(View view) {
        s.k(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        s.h(rootView);
        EdgeInsets edgeInsetsB = b(rootView);
        if (edgeInsetsB == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new EdgeInsets(Math.max(edgeInsetsB.getTop() - rect.top, BitmapDescriptorFactory.HUE_RED), Math.max(Math.min((rect.left + view.getWidth()) - width, BitmapDescriptorFactory.HUE_RED) + edgeInsetsB.getRight(), BitmapDescriptorFactory.HUE_RED), Math.max(Math.min((rect.top + view.getHeight()) - height, BitmapDescriptorFactory.HUE_RED) + edgeInsetsB.getBottom(), BitmapDescriptorFactory.HUE_RED), Math.max(edgeInsetsB.getLeft() - rect.left, BitmapDescriptorFactory.HUE_RED));
    }
}
