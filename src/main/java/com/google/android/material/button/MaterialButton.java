package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.core.widget.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import st.h;
import st.k;
import st.n;
import zs.l;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialButton extends AppCompatButton implements Checkable, n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f41669q = {R.attr.state_checkable};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f41670r = {R.attr.state_checked};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f41671s = l.f128814w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.button.a f41672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<a> f41673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f41674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f41675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f41676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f41677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f41678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41685p;

    public interface a {
        void a(MaterialButton materialButton, boolean z11);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z11);
    }

    static class c extends r6.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f41686c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel) {
            this.f41686c = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f41686c ? 1 : 0);
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private boolean b() {
        int i11 = this.f41685p;
        return i11 == 3 || i11 == 4;
    }

    private boolean c() {
        int i11 = this.f41685p;
        return i11 == 1 || i11 == 2;
    }

    private boolean d() {
        int i11 = this.f41685p;
        return i11 == 16 || i11 == 32;
    }

    private boolean e() {
        return ViewCompat.A(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f41672c;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            m.m(this, this.f41677h, null, null, null);
        } else if (b()) {
            m.m(this, null, null, this.f41677h, null);
        } else if (d()) {
            m.m(this, null, this.f41677h, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < lineCount; i11++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i11));
        }
        return (int) Math.ceil(fMax);
    }

    private void h(boolean z11) {
        Drawable drawable = this.f41677h;
        if (drawable != null) {
            Drawable drawableMutate = l5.a.r(drawable).mutate();
            this.f41677h = drawableMutate;
            l5.a.o(drawableMutate, this.f41676g);
            PorterDuff.Mode mode = this.f41675f;
            if (mode != null) {
                l5.a.p(this.f41677h, mode);
            }
            int intrinsicWidth = this.f41679j;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f41677h.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f41679j;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f41677h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f41677h;
            int i11 = this.f41680k;
            int i12 = this.f41681l;
            drawable2.setBounds(i11, i12, intrinsicWidth + i11, intrinsicHeight + i12);
            this.f41677h.setVisible(true, z11);
        }
        if (z11) {
            g();
            return;
        }
        Drawable[] drawableArrD = m.d(this);
        Drawable drawable3 = drawableArrD[0];
        Drawable drawable4 = drawableArrD[1];
        Drawable drawable5 = drawableArrD[2];
        if ((!c() || drawable3 == this.f41677h) && ((!b() || drawable5 == this.f41677h) && (!d() || drawable4 == this.f41677h))) {
            return;
        }
        g();
    }

    private void i(int i11, int i12) {
        if (this.f41677h == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f41680k = 0;
                if (this.f41685p == 16) {
                    this.f41681l = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f41679j;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f41677h.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i12 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f41682m) - getPaddingBottom()) / 2);
                if (this.f41681l != iMax) {
                    this.f41681l = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f41681l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f41685p;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f41680k = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f41679j;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f41677h.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i11 - getTextLayoutWidth()) - ViewCompat.E(this)) - intrinsicWidth) - this.f41682m) - ViewCompat.F(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f41685p == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f41680k != textLayoutWidth) {
            this.f41680k = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f41672c;
        return aVar != null && aVar.p();
    }

    @NonNull
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f41678i)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f41678i;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f41672c.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f41677h;
    }

    public int getIconGravity() {
        return this.f41685p;
    }

    public int getIconPadding() {
        return this.f41682m;
    }

    public int getIconSize() {
        return this.f41679j;
    }

    public ColorStateList getIconTint() {
        return this.f41676g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f41675f;
    }

    public int getInsetBottom() {
        return this.f41672c.c();
    }

    public int getInsetTop() {
        return this.f41672c.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f41672c.h();
        }
        return null;
    }

    @NonNull
    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f41672c.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f41672c.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f41672c.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f41672c.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f41672c.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f41683n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f41672c.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41669q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41670r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f41686c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f41686c = this.f41683n;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f41672c.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f41677h != null) {
            if (this.f41677h.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f41678i = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (f()) {
            this.f41672c.s(i11);
        } else {
            super.setBackgroundColor(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f41672c.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i11) {
        setBackgroundDrawable(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (f()) {
            this.f41672c.u(z11);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (a() && isEnabled() && this.f41683n != z11) {
            this.f41683n = z11;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).n(this, this.f41683n);
            }
            if (this.f41684o) {
                return;
            }
            this.f41684o = true;
            Iterator<a> it = this.f41673d.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f41683n);
            }
            this.f41684o = false;
        }
    }

    public void setCornerRadius(int i11) {
        if (f()) {
            this.f41672c.v(i11);
        }
    }

    public void setCornerRadiusResource(int i11) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        if (f()) {
            this.f41672c.f().a0(f11);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f41677h != drawable) {
            this.f41677h = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.f41685p != i11) {
            this.f41685p = i11;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i11) {
        if (this.f41682m != i11) {
            this.f41682m = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(int i11) {
        setIcon(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    public void setIconSize(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f41679j != i11) {
            this.f41679j = i11;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f41676g != colorStateList) {
            this.f41676g = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f41675f != mode) {
            this.f41675f = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i11) {
        setIconTint(j.a.a(getContext(), i11));
    }

    public void setInsetBottom(int i11) {
        this.f41672c.w(i11);
    }

    public void setInsetTop(int i11) {
        this.f41672c.x(i11);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f41674e = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        b bVar = this.f41674e;
        if (bVar != null) {
            bVar.a(this, z11);
        }
        super.setPressed(z11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f41672c.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i11) {
        if (f()) {
            setRippleColor(j.a.a(getContext(), i11));
        }
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f41672c.z(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (f()) {
            this.f41672c.A(z11);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f41672c.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i11) {
        if (f()) {
            setStrokeColor(j.a.a(getContext(), i11));
        }
    }

    public void setStrokeWidth(int i11) {
        if (f()) {
            this.f41672c.C(i11);
        }
    }

    public void setStrokeWidthResource(int i11) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f41672c.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f41672c.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i11) {
        super.setTextAlignment(i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z11) {
        this.f41672c.F(z11);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f41683n);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41671s;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41673d = new LinkedHashSet<>();
        this.f41683n = false;
        this.f41684o = false;
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, zs.m.f128847c4, i11, i12, new int[0]);
        this.f41682m = typedArrayI.getDimensionPixelSize(zs.m.f129003p4, 0);
        this.f41675f = d0.n(typedArrayI.getInt(zs.m.f129039s4, -1), PorterDuff.Mode.SRC_IN);
        this.f41676g = pt.c.a(getContext(), typedArrayI, zs.m.f129027r4);
        this.f41677h = pt.c.e(getContext(), typedArrayI, zs.m.f128979n4);
        this.f41685p = typedArrayI.getInteger(zs.m.f128991o4, 1);
        this.f41679j = typedArrayI.getDimensionPixelSize(zs.m.f129015q4, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, k.e(context2, attributeSet, i11, i12).m());
        this.f41672c = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f41682m);
        h(this.f41677h != null);
    }
}
