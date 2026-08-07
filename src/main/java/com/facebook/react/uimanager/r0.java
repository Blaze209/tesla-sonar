package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/r0;", "", "<init>", "()V", "Landroid/view/View;", "reactView", "Lcom/facebook/react/uimanager/q0;", "a", "(Landroid/view/View;)Lcom/facebook/react/uimanager/q0;", "v", "Landroid/graphics/Point;", "b", "(Landroid/view/View;)Landroid/graphics/Point;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f23364a = new r0();

    private r0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q0 a(View reactView) {
        p013kotlin.jvm.internal.s.k(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof q0)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            gn.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (q0) view;
    }

    public static final Point b(View v11) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        int[] iArr = new int[2];
        v11.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v11.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
