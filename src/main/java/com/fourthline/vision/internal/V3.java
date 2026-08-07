package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class V3 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f38024a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V3(Context context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void applyPosition(View view, Rect rect) {
        view.setLayoutParams(generatePreviewLayoutParams(rect));
    }

    private final ViewGroup.LayoutParams generatePreviewLayoutParams(Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect != null ? rect.width() : -1, rect != null ? rect.height() : -1);
        layoutParams.gravity = 136;
        if (rect != null) {
            int measuredWidth = (getMeasuredWidth() - rect.width()) / 2;
            int measuredHeight = (getMeasuredHeight() - rect.height()) / 2;
            if (measuredWidth < measuredHeight) {
                layoutParams.topMargin = measuredHeight;
                return layoutParams;
            }
            layoutParams.setMarginStart(measuredWidth);
        }
        return layoutParams;
    }

    static /* synthetic */ ViewGroup.LayoutParams generatePreviewLayoutParams$default(V3 v11, Rect rect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rect = null;
        }
        return v11.generatePreviewLayoutParams(rect);
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        p013kotlin.jvm.internal.s.k(child, "child");
        Rect rect = this.f38024a;
        if (rect != null) {
            applyPosition(child, rect);
        }
        super.addView(child);
    }

    public final Rect getScreenRect() {
        return this.f38024a;
    }

    public final void setScreenRect(Rect rect) {
        this.f38024a = rect;
        if (rect == null || getChildCount() <= 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            p013kotlin.jvm.internal.s.j(childAt, "getChildAt(...)");
            applyPosition(childAt, rect);
        }
    }
}
