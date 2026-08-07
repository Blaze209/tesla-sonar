package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import zs.c;
import zs.i;

/* JADX INFO: loaded from: classes5.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] J;
    private static final int[] K;
    private final AccessibilityManager H;
    private boolean I;

    public static final class SnackbarLayout extends BaseTransientBottomBar.t {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class a extends BaseTransientBottomBar.r<Snackbar> {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i11 = c.f128584o0;
        J = new int[]{i11};
        K = new int[]{i11, c.f128588q0};
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup h0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private SnackbarContentLayout i0() {
        return (SnackbarContentLayout) this.f42723i.getChildAt(0);
    }

    private TextView j0() {
        return i0().getMessageView();
    }

    private static boolean k0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @NonNull
    public static Snackbar l0(@NonNull View view, @NonNull CharSequence charSequence, int i11) {
        return m0(null, view, charSequence, i11);
    }

    @NonNull
    private static Snackbar m0(Context context, @NonNull View view, @NonNull CharSequence charSequence, int i11) {
        ViewGroup viewGroupH0 = h0(view);
        if (viewGroupH0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupH0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(k0(context) ? i.f128761w : i.f128742d, viewGroupH0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupH0, snackbarContentLayout, snackbarContentLayout);
        snackbar.n0(charSequence);
        snackbar.V(i11);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int E() {
        int iE = super.E();
        if (iE == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.H.getRecommendedTimeoutMillis(iE, (this.I ? 4 : 0) | 3);
        }
        if (this.I && this.H.isTouchExplorationEnabled()) {
            return -2;
        }
        return iE;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void Z() {
        super.Z();
    }

    @NonNull
    public Snackbar n0(@NonNull CharSequence charSequence) {
        j0().setText(charSequence);
        return this;
    }

    @NonNull
    public Snackbar o0(int i11) {
        j0().setMaxLines(i11);
        return this;
    }
}
