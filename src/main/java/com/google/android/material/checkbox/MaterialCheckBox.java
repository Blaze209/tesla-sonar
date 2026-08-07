package com.google.android.material.checkbox;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.e;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import zs.f;
import zs.g;
import zs.k;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialCheckBox extends e {
    private static final int[][] A;

    @SuppressLint({"DiscouragedApi"})
    private static final int B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f41825x = l.B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int[] f41826y = {zs.c.f128598v0};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f41827z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<c> f41828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final LinkedHashSet<b> f41829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f41830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f41832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f41834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f41835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f41836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f41838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ColorStateList f41839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private PorterDuff.Mode f41840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f41842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f41844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f41845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.c f41846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f41847w;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f41838n;
            if (colorStateList != null) {
                l5.a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f41838n;
            if (colorStateList != null) {
                l5.a.n(drawable, colorStateList.getColorForState(materialCheckBox.f41842r, MaterialCheckBox.this.f41838n.getDefaultColor()));
            }
        }
    }

    public interface b {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i11);
    }

    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z11);
    }

    static class d extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41849a;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* synthetic */ d(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        private String a() {
            int i11 = this.f41849a;
            if (i11 != 1) {
                return i11 != 2 ? "unchecked" : ReactProgressBarViewManager.PROP_INDETERMINATE;
            }
            return "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Integer.valueOf(this.f41849a));
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f41849a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i11 = zs.c.f128596u0;
        f41827z = new int[]{i11};
        A = new int[][]{new int[]{R.attr.state_enabled, i11}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private boolean d(b1 b1Var) {
        return b1Var.n(m.f128932j5, 0) == B && b1Var.n(m.f128944k5, 0) == 0;
    }

    private void f() {
        this.f41835k = com.google.android.material.drawable.c.d(this.f41835k, this.f41838n, androidx.core.widget.c.c(this));
        this.f41836l = com.google.android.material.drawable.c.d(this.f41836l, this.f41839o, this.f41840p);
        h();
        i();
        super.setButtonDrawable(com.google.android.material.drawable.c.a(this.f41835k, this.f41836l));
        refreshDrawableState();
    }

    private void g() {
        if (Build.VERSION.SDK_INT < 30 || this.f41844t != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @NonNull
    private String getButtonStateDescription() {
        int i11 = this.f41841q;
        if (i11 == 1) {
            return getResources().getString(k.f128785t);
        }
        return i11 == 0 ? getResources().getString(k.f128787v) : getResources().getString(k.f128786u);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41830f == null) {
            int[][] iArr = A;
            int[] iArr2 = new int[iArr.length];
            int iD = ht.a.d(this, zs.c.f128577l);
            int iD2 = ht.a.d(this, zs.c.f128581n);
            int iD3 = ht.a.d(this, zs.c.f128599w);
            int iD4 = ht.a.d(this, zs.c.f128587q);
            iArr2[0] = ht.a.j(iD3, iD2, 1.0f);
            iArr2[1] = ht.a.j(iD3, iD, 1.0f);
            iArr2[2] = ht.a.j(iD3, iD4, 0.54f);
            iArr2[3] = ht.a.j(iD3, iD4, 0.38f);
            iArr2[4] = ht.a.j(iD3, iD4, 0.38f);
            this.f41830f = new ColorStateList(iArr, iArr2);
        }
        return this.f41830f;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f41838n;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f41837m) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.f41846v;
            if (cVar2 != null) {
                cVar2.f(this.f41847w);
                this.f41846v.b(this.f41847w);
            }
            Drawable drawable = this.f41835k;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f41846v) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(g.f128686b, g.C0, cVar, false);
            ((AnimatedStateListDrawable) this.f41835k).addTransition(g.f128704k, g.C0, this.f41846v, false);
        }
    }

    private void i() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f41835k;
        if (drawable != null && (colorStateList2 = this.f41838n) != null) {
            l5.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f41836l;
        if (drawable2 == null || (colorStateList = this.f41839o) == null) {
            return;
        }
        l5.a.o(drawable2, colorStateList);
    }

    private void j() {
    }

    public void c(@NonNull b bVar) {
        this.f41829e.add(bVar);
    }

    public boolean e() {
        return this.f41833i;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f41835k;
    }

    public Drawable getButtonIconDrawable() {
        return this.f41836l;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f41839o;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f41840p;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f41838n;
    }

    public int getCheckedState() {
        return this.f41841q;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f41834j;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f41841q == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41831g && this.f41838n == null && this.f41839o == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41826y);
        }
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f41827z);
        }
        this.f41842r = com.google.android.material.drawable.c.f(iArrOnCreateDrawableState);
        j();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f41832h || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (d0.m(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            l5.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && e()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f41834j));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f41849a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f41849a = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton
    public void setButtonDrawable(int i11) {
        setButtonDrawable(j.a.b(getContext(), i11));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f41836l = drawable;
        f();
    }

    public void setButtonIconDrawableResource(int i11) {
        setButtonIconDrawable(j.a.b(getContext(), i11));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f41839o == colorStateList) {
            return;
        }
        this.f41839o = colorStateList;
        f();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f41840p == mode) {
            return;
        }
        this.f41840p = mode;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f41838n == colorStateList) {
            return;
        }
        this.f41838n = colorStateList;
        f();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        f();
    }

    public void setCenterIfNoTextEnabled(boolean z11) {
        this.f41832h = z11;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedState(z11 ? 1 : 0);
    }

    public void setCheckedState(int i11) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f41841q != i11) {
            this.f41841q = i11;
            super.setChecked(i11 == 1);
            refreshDrawableState();
            g();
            if (this.f41843s) {
                return;
            }
            this.f41843s = true;
            LinkedHashSet<b> linkedHashSet = this.f41829e;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f41841q);
                }
            }
            if (this.f41841q != 2 && (onCheckedChangeListener = this.f41845u) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = e3.b.a(getContext().getSystemService(e3.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f41843s = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        j();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f41834j = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i11) {
        setErrorAccessibilityLabel(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setErrorShown(boolean z11) {
        if (this.f41833i == z11) {
            return;
        }
        this.f41833i = z11;
        refreshDrawableState();
        Iterator<c> it = this.f41828d.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f41833i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f41845u = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f41844t = charSequence;
        if (charSequence == null) {
            g();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f41831g = z11;
        if (z11) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128569h);
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f41835k = drawable;
        this.f41837m = false;
        f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41825x;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41828d = new LinkedHashSet<>();
        this.f41829e = new LinkedHashSet<>();
        this.f41846v = androidx.vectordrawable.graphics.drawable.c.a(getContext(), f.f128677h);
        this.f41847w = new a();
        Context context2 = getContext();
        this.f41835k = androidx.core.widget.c.a(this);
        this.f41838n = getSuperButtonTintList();
        setSupportButtonTintList(null);
        b1 b1VarJ = a0.j(context2, attributeSet, m.f128920i5, i11, i12, new int[0]);
        this.f41836l = b1VarJ.g(m.f128956l5);
        if (this.f41835k != null && a0.g(context2) && d(b1VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f41835k = j.a.b(context2, f.f128676g);
            this.f41837m = true;
            if (this.f41836l == null) {
                this.f41836l = j.a.b(context2, f.f128678i);
            }
        }
        this.f41839o = pt.c.b(context2, b1VarJ, m.f128968m5);
        this.f41840p = d0.n(b1VarJ.k(m.f128980n5, -1), PorterDuff.Mode.SRC_IN);
        this.f41831g = b1VarJ.a(m.f129040s5, false);
        this.f41832h = b1VarJ.a(m.f128992o5, true);
        this.f41833i = b1VarJ.a(m.f129028r5, false);
        this.f41834j = b1VarJ.p(m.f129016q5);
        if (b1VarJ.s(m.f129004p5)) {
            setCheckedState(b1VarJ.k(m.f129004p5, 0));
        }
        b1VarJ.w();
        f();
    }
}
