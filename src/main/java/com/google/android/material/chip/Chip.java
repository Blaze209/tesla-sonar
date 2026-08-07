package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.e;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import at.i;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.l;
import java.util.List;
import pt.d;
import pt.f;
import st.h;
import st.n;
import zs.k;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class Chip extends e implements com.google.android.material.chip.a.InterfaceC0661a, n, l<Chip> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f41850w = zs.l.f128817z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Rect f41851x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f41852y = {R.attr.state_selected};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f41853z = {R.attr.state_checkable};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.material.chip.a f41854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InsetDrawable f41855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RippleDrawable f41856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f41857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f41858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l.a<Chip> f41859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f41867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    private final c f41868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f41870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f41871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f41872v;

    class a extends f {
        a() {
        }

        @Override // pt.f
        public void a(int i11) {
        }

        @Override // pt.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            Chip chip = Chip.this;
            chip.setText(chip.f41854d.S2() ? Chip.this.f41854d.n1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @NonNull Outline outline) {
            if (Chip.this.f41854d != null) {
                Chip.this.f41854d.getOutline(outline);
            } else {
                outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private class c extends s6.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // s6.a
        protected int B(float f11, float f12) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f11, f12)) ? 1 : 0;
        }

        @Override // s6.a
        protected void C(@NonNull List<Integer> list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f41857g != null) {
                list.add(1);
            }
        }

        @Override // s6.a
        protected boolean J(int i11, int i12, Bundle bundle) {
            if (i12 != 16) {
                return false;
            }
            if (i11 == 0) {
                return Chip.this.performClick();
            }
            if (i11 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // s6.a
        protected void M(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.r0(Chip.this.r());
            accessibilityNodeInfoCompat.u0(Chip.this.isClickable());
            accessibilityNodeInfoCompat.t0(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.d1(Chip.this.getText());
        }

        @Override // s6.a
        protected void N(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i11 != 1) {
                accessibilityNodeInfoCompat.x0("");
                accessibilityNodeInfoCompat.p0(Chip.f41851x);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.x0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                accessibilityNodeInfoCompat.x0(Chip.this.getContext().getString(k.f128788w, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfoCompat.p0(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7746i);
            accessibilityNodeInfoCompat.B0(Chip.this.isEnabled());
        }

        @Override // s6.a
        protected void O(int i11, boolean z11) {
            if (i11 == 1) {
                Chip.this.f41863m = z11;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f41854d) == null) {
            return;
        }
        int iP0 = (int) (aVar.P0() + this.f41854d.p1() + this.f41854d.w0());
        int iU0 = (int) (this.f41854d.U0() + this.f41854d.q1() + this.f41854d.s0());
        if (this.f41855e != null) {
            Rect rect = new Rect();
            this.f41855e.getPadding(rect);
            iU0 += rect.left;
            iP0 += rect.right;
        }
        ViewCompat.F0(this, iU0, getPaddingTop(), iP0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f41872v);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z11) {
        l.a<Chip> aVar = chip.f41859i;
        if (aVar != null) {
            aVar.a(chip, z11);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f41858h;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f41871u.setEmpty();
        if (n() && this.f41857g != null) {
            this.f41854d.e1(this.f41871u);
        }
        return this.f41871u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f41870t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f41870t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.o1();
        }
        return null;
    }

    private void j(@NonNull com.google.android.material.chip.a aVar) {
        aVar.v2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @NonNull
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i11 = IsEnabled;
        if (this.f41863m) {
            i11 = IsEnabled + 1;
        }
        int i12 = i11;
        if (this.f41862l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (this.f41861k) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (isChecked()) {
            i14 = i13 + 1;
        }
        int[] iArr = new int[i14];
        int i15 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i15 = 1;
        }
        if (this.f41863m) {
            iArr[i15] = 16842908;
            i15++;
        }
        if (this.f41862l) {
            iArr[i15] = 16843623;
            i15++;
        }
        if (this.f41861k) {
            iArr[i15] = 16842919;
            i15++;
        }
        if (isChecked()) {
            iArr[i15] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f41855e && this.f41854d.getCallback() == null) {
            this.f41854d.setCallback(this.f41855e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return (aVar == null || aVar.X0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i11) {
        TypedArray typedArrayI = a0.i(context, attributeSet, m.f129012q1, i11, f41850w, new int[0]);
        this.f41864n = typedArrayI.getBoolean(m.W1, false);
        this.f41866p = (int) Math.ceil(typedArrayI.getDimension(m.K1, (float) Math.ceil(d0.h(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i11, int i12, int i13, int i14) {
        this.f41855e = new InsetDrawable((Drawable) this.f41854d, i11, i12, i13, i14);
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.f41862l != z11) {
            this.f41862l = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.f41861k != z11) {
            this.f41861k = z11;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f41855e != null) {
            this.f41855e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.v2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f41857g != null) {
            ViewCompat.p0(this, this.f41868r);
            this.f41869s = true;
        } else {
            ViewCompat.p0(this, null);
            this.f41869s = false;
        }
    }

    private void y() {
        if (qt.b.f106147a) {
            z();
            return;
        }
        this.f41854d.R2(true);
        ViewCompat.t0(this, getBackgroundDrawable());
        A();
        m();
    }

    private void z() {
        this.f41856f = new RippleDrawable(qt.b.d(this.f41854d.l1()), getBackgroundDrawable(), null);
        this.f41854d.R2(false);
        ViewCompat.t0(this, this.f41856f);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0661a
    public void a() {
        l(this.f41866p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.f41869s) {
            return this.f41868r.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f41869s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f41868r.w(keyEvent) || this.f41868r.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f41854d;
        if ((aVar == null || !aVar.v1()) ? false : this.f41854d.r2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f41867q)) {
            return this.f41867q;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof com.google.android.material.chip.b) && ((com.google.android.material.chip.b) parent).i()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f41855e;
        return insetDrawable == null ? this.f41854d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? Math.max(BitmapDescriptorFactory.HUE_RED, aVar.O0()) : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipDrawable() {
        return this.f41854d;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.P0() : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.Q0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.R0() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.S0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.T0() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.U0() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.W0() : BitmapDescriptorFactory.HUE_RED;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.Z0() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.a1() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.b1() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@NonNull Rect rect) {
        if (this.f41869s && (this.f41868r.A() == 1 || this.f41868r.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public i getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.j1() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.k1() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    @NonNull
    public st.k getShapeAppearanceModel() {
        return this.f41854d.E();
    }

    public i getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.p1() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null ? aVar.q1() : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean l(int i11) {
        this.f41866p = i11;
        if (!v()) {
            if (this.f41855e != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i11 - this.f41854d.getIntrinsicHeight());
        int iMax2 = Math.max(0, i11 - this.f41854d.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f41855e != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i12 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i13 = iMax > 0 ? iMax / 2 : 0;
        if (this.f41855e != null) {
            Rect rect = new Rect();
            this.f41855e.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i11) {
            setMinHeight(i11);
        }
        if (getMinWidth() != i11) {
            setMinWidth(i11);
        }
        q(i12, i13, i12, i13);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f41854d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41852y);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41853z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.f41869s) {
            this.f41868r.I(z11, i11, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof com.google.android.material.chip.b) {
            com.google.android.material.chip.b bVar = (com.google.android.material.chip.b) getParent();
            AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo).w0(AccessibilityNodeInfoCompat.e.b(bVar.b(this), 1, bVar.c() ? bVar.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i11) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i11);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f41865o != i11) {
            this.f41865o = i11;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f41861k) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z11 = true;
                }
                z11 = false;
            } else {
                if (this.f41861k) {
                    t();
                    z11 = true;
                }
                setCloseIconPressed(false);
            }
            z11 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null && aVar.u1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f41854d;
        return aVar != null && aVar.w1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f41867q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f41856f) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f41856f) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundResource(int i11) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.D1(z11);
        }
    }

    public void setCheckableResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.E1(i11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar == null) {
            this.f41860j = z11;
        } else if (aVar.u1()) {
            super.setChecked(z11);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.F1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.G1(i11);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.I1(i11);
        }
    }

    public void setCheckedIconVisible(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.J1(i11);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.M1(i11);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.N1(f11);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.O1(i11);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f41854d;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f41854d = aVar;
            aVar.G2(false);
            j(this.f41854d);
            l(this.f41866p);
        }
    }

    public void setChipEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.P1(f11);
        }
    }

    public void setChipEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.Q1(i11);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.R1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.S1(i11);
        }
    }

    public void setChipIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.T1(f11);
        }
    }

    public void setChipIconSizeResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.U1(i11);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.V1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.W1(i11);
        }
    }

    public void setChipIconVisible(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.X1(i11);
        }
    }

    public void setChipMinHeight(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.Z1(f11);
        }
    }

    public void setChipMinHeightResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.a2(i11);
        }
    }

    public void setChipStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.b2(f11);
        }
    }

    public void setChipStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.c2(i11);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.d2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.e2(i11);
        }
    }

    public void setChipStrokeWidth(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.f2(f11);
        }
    }

    public void setChipStrokeWidthResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.g2(i11);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.i2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.j2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.k2(f11);
        }
    }

    public void setCloseIconEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.l2(i11);
        }
    }

    public void setCloseIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.m2(i11);
        }
        x();
    }

    public void setCloseIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.n2(f11);
        }
    }

    public void setCloseIconSizeResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.o2(i11);
        }
    }

    public void setCloseIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.p2(f11);
        }
    }

    public void setCloseIconStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.q2(i11);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.t2(i11);
        }
    }

    public void setCloseIconVisible(int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.a0(f11);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f41854d == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.w2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.f41864n = z11;
        l(this.f41866p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i11);
        }
    }

    public void setHideMotionSpec(i iVar) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.x2(iVar);
        }
    }

    public void setHideMotionSpecResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.y2(i11);
        }
    }

    public void setIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.z2(f11);
        }
    }

    public void setIconEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.A2(i11);
        }
    }

    public void setIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.B2(f11);
        }
    }

    public void setIconStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.C2(i11);
        }
    }

    @Override // com.google.android.material.internal.l
    public void setInternalOnCheckedChangeListener(l.a<Chip> aVar) {
        this.f41859i = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f41854d == null) {
            return;
        }
        super.setLayoutDirection(i11);
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i11);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.D2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i11);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f41858h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f41857g = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.E2(colorStateList);
        }
        if (this.f41854d.s1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.F2(i11);
            if (this.f41854d.s1()) {
                return;
            }
            z();
        }
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull st.k kVar) {
        this.f41854d.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(i iVar) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.H2(iVar);
        }
    }

    public void setShowMotionSpecResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.I2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (!z11) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z11);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.S2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f41854d;
        if (aVar2 != null) {
            aVar2.J2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.K2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.M2(f11);
        }
    }

    public void setTextEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.N2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        super.setTextSize(i11, f11);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.O2(TypedValue.applyDimension(i11, f11, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.P2(f11);
        }
    }

    public void setTextStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.Q2(i11);
        }
    }

    public boolean t() {
        boolean z11 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f41857g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z11 = true;
        }
        if (this.f41869s) {
            this.f41868r.U(1, 1);
        }
        return z11;
    }

    public boolean v() {
        return this.f41864n;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128573j);
    }

    public void setCloseIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.u2(z11);
        }
        x();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41850w;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41870t = new Rect();
        this.f41871u = new RectF();
        this.f41872v = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarB0 = com.google.android.material.chip.a.B0(context2, attributeSet, i11, i12);
        o(context2, attributeSet, i11);
        setChipDrawable(aVarB0);
        aVarB0.a0(ViewCompat.v(this));
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.f129012q1, i11, i12, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(m.f128833b2);
        typedArrayI.recycle();
        this.f41868r = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f41860j);
        setText(aVarB0.n1());
        setEllipsize(aVarB0.h1());
        B();
        if (!this.f41854d.S2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f41866p);
        }
        this.f41865o = ViewCompat.A(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: et.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                Chip.b(this.f63216a, compoundButton, z11);
            }
        });
    }

    public void setCheckedIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.K1(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.Y1(z11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.L2(i11);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        com.google.android.material.chip.a aVar = this.f41854d;
        if (aVar != null) {
            aVar.L2(i11);
        }
        B();
    }
}
