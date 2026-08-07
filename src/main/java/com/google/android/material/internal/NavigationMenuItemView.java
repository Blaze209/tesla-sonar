package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.n0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes5.dex */
public class NavigationMenuItemView extends j implements androidx.appcompat.view.menu.k.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f42247r = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f42250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f42251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CheckedTextView f42252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private FrameLayout f42253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f42254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f42255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f42257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.core.view.a f42258q;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.r0(NavigationMenuItemView.this.f42250i);
        }
    }

    public NavigationMenuItemView(@NonNull Context context) {
        this(context, null);
    }

    private void e() {
        if (g()) {
            this.f42252k.setVisibility(8);
            FrameLayout frameLayout = this.f42253l;
            if (frameLayout != null) {
                n0.a aVar = (n0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f42253l.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f42252k.setVisibility(0);
        FrameLayout frameLayout2 = this.f42253l;
        if (frameLayout2 != null) {
            n0.a aVar2 = (n0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f42253l.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable f() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i.a.f73746w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f42247r, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean g() {
        return this.f42254m.getTitle() == null && this.f42254m.getIcon() == null && this.f42254m.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f42253l == null) {
                this.f42253l = (FrameLayout) ((ViewStub) findViewById(zs.g.f128696g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f42253l.removeAllViews();
            this.f42253l.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(@NonNull androidx.appcompat.view.menu.g gVar, int i11) {
        this.f42254m = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.t0(this, f());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        d1.a(this, gVar.getTooltipText());
        e();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f42254m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        androidx.appcompat.view.menu.g gVar = this.f42254m;
        if (gVar != null && gVar.isCheckable() && this.f42254m.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f42247r);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.f42250i != z11) {
            this.f42250i = z11;
            this.f42258q.l(this.f42252k, 2048);
        }
    }

    public void setChecked(boolean z11) {
        refreshDrawableState();
        this.f42252k.setChecked(z11);
        CheckedTextView checkedTextView = this.f42252k;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z11 && this.f42251j) ? 1 : 0);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, getPaddingTop(), i11, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f42256o) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = l5.a.r(drawable).mutate();
                l5.a.o(drawable, this.f42255n);
            }
            int i11 = this.f42248g;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.f42249h) {
            if (this.f42257p == null) {
                Drawable drawableF = j5.h.f(getResources(), zs.f.f128683n, getContext().getTheme());
                this.f42257p = drawableF;
                if (drawableF != null) {
                    int i12 = this.f42248g;
                    drawableF.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.f42257p;
        }
        androidx.core.widget.m.m(this.f42252k, drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.f42252k.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(int i11) {
        this.f42248g = i11;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f42255n = colorStateList;
        this.f42256o = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f42254m;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.f42252k.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.f42249h = z11;
    }

    public void setShortcut(boolean z11, char c11) {
    }

    public void setTextAppearance(int i11) {
        androidx.core.widget.m.r(this.f42252k, i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f42252k.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f42252k.setText(charSequence);
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42251j = true;
        a aVar = new a();
        this.f42258q = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(zs.i.f128743e, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(zs.e.f128640l));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(zs.g.f128698h);
        this.f42252k = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.p0(checkedTextView, aVar);
    }
}
