package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.a0;
import st.h;
import st.k;
import st.n;
import zs.c;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f41728n = {R.attr.state_checkable};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f41729o = {R.attr.state_checked};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f41730p = {c.f128594t0};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f41731q = l.f128815x;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final b f41732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41735m;

    public interface a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f41732j.k();
        }
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f41732j.l().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f41732j.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f41732j.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f41732j.o();
    }

    public int getCheckedIconGravity() {
        return this.f41732j.p();
    }

    public int getCheckedIconMargin() {
        return this.f41732j.q();
    }

    public int getCheckedIconSize() {
        return this.f41732j.r();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f41732j.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f41732j.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f41732j.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f41732j.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f41732j.C().top;
    }

    public float getProgress() {
        return this.f41732j.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f41732j.u();
    }

    public ColorStateList getRippleColor() {
        return this.f41732j.x();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f41732j.y();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f41732j.z();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f41732j.A();
    }

    public int getStrokeWidth() {
        return this.f41732j.B();
    }

    public boolean h() {
        b bVar = this.f41732j;
        return bVar != null && bVar.F();
    }

    public boolean i() {
        return this.f41735m;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f41734l;
    }

    void j(int i11, int i12, int i13, int i14) {
        super.setContentPadding(i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41732j.f0();
        h.f(this, this.f41732j.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        if (h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41728n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41729o);
        }
        if (i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41730p);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f41732j.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f41733k) {
            if (!this.f41732j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f41732j.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i11) {
        this.f41732j.L(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f11) {
        super.setCardElevation(f11);
        this.f41732j.h0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f41732j.M(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.f41732j.N(z11);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f41734l != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f41732j.Q(drawable);
    }

    public void setCheckedIconGravity(int i11) {
        if (this.f41732j.p() != i11) {
            this.f41732j.R(i11);
        }
    }

    public void setCheckedIconMargin(int i11) {
        this.f41732j.S(i11);
    }

    public void setCheckedIconMarginResource(int i11) {
        if (i11 != -1) {
            this.f41732j.S(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconResource(int i11) {
        this.f41732j.Q(j.a.b(getContext(), i11));
    }

    public void setCheckedIconSize(int i11) {
        this.f41732j.T(i11);
    }

    public void setCheckedIconSizeResource(int i11) {
        if (i11 != 0) {
            this.f41732j.T(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f41732j.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        b bVar = this.f41732j;
        if (bVar != null) {
            bVar.f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f41732j.b0(i11, i12, i13, i14);
    }

    public void setDragged(boolean z11) {
        if (this.f41735m != z11) {
            this.f41735m = z11;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f11) {
        super.setMaxCardElevation(f11);
        this.f41732j.j0();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        this.f41732j.j0();
        this.f41732j.g0();
    }

    public void setProgress(float f11) {
        this.f41732j.W(f11);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f11) {
        super.setRadius(f11);
        this.f41732j.V(f11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f41732j.X(colorStateList);
    }

    public void setRippleColorResource(int i11) {
        this.f41732j.X(j.a.a(getContext(), i11));
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        setClipToOutline(kVar.u(getBoundsAsRectF()));
        this.f41732j.Y(kVar);
    }

    public void setStrokeColor(int i11) {
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setStrokeWidth(int i11) {
        this.f41732j.a0(i11);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        this.f41732j.j0();
        this.f41732j.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (h() && isEnabled()) {
            this.f41734l = !this.f41734l;
            refreshDrawableState();
            g();
            this.f41732j.P(this.f41734l, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.O);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f41732j.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f41732j.Z(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41731q;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41734l = false;
        this.f41735m = false;
        this.f41733k = true;
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, m.X4, i11, i12, new int[0]);
        b bVar = new b(this, attributeSet, i11, i12);
        this.f41732j = bVar;
        bVar.L(super.getCardBackgroundColor());
        bVar.b0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.I(typedArrayI);
        typedArrayI.recycle();
    }
}
