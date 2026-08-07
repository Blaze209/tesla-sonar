package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b1;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.a0;
import st.g;
import st.h;
import st.k;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.navigation.b f42456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.navigation.c f42457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.navigation.d f42458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MenuInflater f42459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f42460e;

    class a implements androidx.appcompat.view.menu.e.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            e.a(e.this);
            return (e.this.f42460e == null || e.this.f42460e.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(@NonNull MenuItem menuItem);
    }

    static class d extends r6.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Bundle f42462c;

        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@NonNull Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel, ClassLoader classLoader) {
            this.f42462c = parcel.readBundle(classLoader);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeBundle(this.f42462c);
        }

        public d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public e(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        com.google.android.material.navigation.d dVar = new com.google.android.material.navigation.d();
        this.f42458c = dVar;
        Context context2 = getContext();
        b1 b1VarJ = a0.j(context2, attributeSet, m.f129065u6, i11, i12, m.H6, m.F6);
        com.google.android.material.navigation.b bVar = new com.google.android.material.navigation.b(context2, getClass(), getMaxItemCount());
        this.f42456a = bVar;
        com.google.android.material.navigation.c cVarC = c(context2);
        this.f42457b = cVarC;
        dVar.j(cVarC);
        dVar.a(1);
        cVarC.setPresenter(dVar);
        bVar.b(dVar);
        dVar.h(getContext(), bVar);
        if (b1VarJ.s(m.B6)) {
            cVarC.setIconTintList(b1VarJ.c(m.B6));
        } else {
            cVarC.setIconTintList(cVarC.e(R.attr.textColorSecondary));
        }
        setItemIconSize(b1VarJ.f(m.A6, getResources().getDimensionPixelSize(zs.e.f128663w0)));
        if (b1VarJ.s(m.H6)) {
            setItemTextAppearanceInactive(b1VarJ.n(m.H6, 0));
        }
        if (b1VarJ.s(m.F6)) {
            setItemTextAppearanceActive(b1VarJ.n(m.F6, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(b1VarJ.a(m.G6, true));
        if (b1VarJ.s(m.I6)) {
            setItemTextColor(b1VarJ.c(m.I6));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(background);
        if (background == null || colorStateListG != null) {
            g gVar = new g(k.e(context2, attributeSet, i11, i12).m());
            if (colorStateListG != null) {
                gVar.b0(colorStateListG);
            }
            gVar.Q(context2);
            ViewCompat.t0(this, gVar);
        }
        if (b1VarJ.s(m.D6)) {
            setItemPaddingTop(b1VarJ.f(m.D6, 0));
        }
        if (b1VarJ.s(m.C6)) {
            setItemPaddingBottom(b1VarJ.f(m.C6, 0));
        }
        if (b1VarJ.s(m.f129077v6)) {
            setActiveIndicatorLabelPadding(b1VarJ.f(m.f129077v6, 0));
        }
        if (b1VarJ.s(m.f129101x6)) {
            setElevation(b1VarJ.f(m.f129101x6, 0));
        }
        l5.a.o(getBackground().mutate(), pt.c.b(context2, b1VarJ, m.f129089w6));
        setLabelVisibilityMode(b1VarJ.l(m.J6, -1));
        int iN = b1VarJ.n(m.f129123z6, 0);
        if (iN != 0) {
            cVarC.setItemBackgroundRes(iN);
        } else {
            setItemRippleColor(pt.c.b(context2, b1VarJ, m.E6));
        }
        int iN2 = b1VarJ.n(m.f129112y6, 0);
        if (iN2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iN2, m.f128993o6);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f129017q6, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f129005p6, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(m.f129041s6, 0));
            setItemActiveIndicatorColor(pt.c.a(context2, typedArrayObtainStyledAttributes, m.f129029r6));
            setItemActiveIndicatorShapeAppearance(k.b(context2, typedArrayObtainStyledAttributes.getResourceId(m.f129053t6, 0), 0).m());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (b1VarJ.s(m.K6)) {
            f(b1VarJ.n(m.K6, 0));
        }
        b1VarJ.w();
        addView(cVarC);
        bVar.V(new a());
    }

    static /* synthetic */ b a(e eVar) {
        eVar.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f42459d == null) {
            this.f42459d = new n.d(getContext());
        }
        return this.f42459d;
    }

    @NonNull
    protected abstract com.google.android.material.navigation.c c(@NonNull Context context);

    public bt.a d(int i11) {
        return this.f42457b.i(i11);
    }

    @NonNull
    public bt.a e(int i11) {
        return this.f42457b.j(i11);
    }

    public void f(int i11) {
        this.f42458c.m(true);
        getMenuInflater().inflate(i11, this.f42456a);
        this.f42458c.m(false);
        this.f42458c.e(true);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f42457b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f42457b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f42457b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f42457b.getItemActiveIndicatorMarginHorizontal();
    }

    public k getItemActiveIndicatorShapeAppearance() {
        return this.f42457b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f42457b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f42457b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f42457b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f42457b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f42457b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f42457b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f42457b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f42457b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f42457b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f42457b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f42457b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f42457b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f42456a;
    }

    @NonNull
    public androidx.appcompat.view.menu.k getMenuView() {
        return this.f42457b;
    }

    @NonNull
    public com.google.android.material.navigation.d getPresenter() {
        return this.f42458c;
    }

    public int getSelectedItemId() {
        return this.f42457b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f42456a.S(dVar.f42462c);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f42462c = bundle;
        this.f42456a.U(bundle);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f42457b.setActiveIndicatorLabelPadding(i11);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h.d(this, f11);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f42457b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f42457b.setItemActiveIndicatorEnabled(z11);
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.f42457b.setItemActiveIndicatorHeight(i11);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.f42457b.setItemActiveIndicatorMarginHorizontal(i11);
    }

    public void setItemActiveIndicatorShapeAppearance(k kVar) {
        this.f42457b.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.f42457b.setItemActiveIndicatorWidth(i11);
    }

    public void setItemBackground(Drawable drawable) {
        this.f42457b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i11) {
        this.f42457b.setItemBackgroundRes(i11);
    }

    public void setItemIconSize(int i11) {
        this.f42457b.setItemIconSize(i11);
    }

    public void setItemIconSizeRes(int i11) {
        setItemIconSize(getResources().getDimensionPixelSize(i11));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f42457b.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        this.f42457b.setItemOnTouchListener(i11, onTouchListener);
    }

    public void setItemPaddingBottom(int i11) {
        this.f42457b.setItemPaddingBottom(i11);
    }

    public void setItemPaddingTop(int i11) {
        this.f42457b.setItemPaddingTop(i11);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42457b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f42457b.setItemTextAppearanceActive(i11);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f42457b.setItemTextAppearanceActiveBoldEnabled(z11);
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f42457b.setItemTextAppearanceInactive(i11);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f42457b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f42457b.getLabelVisibilityMode() != i11) {
            this.f42457b.setLabelVisibilityMode(i11);
            this.f42458c.e(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f42460e = cVar;
    }

    public void setSelectedItemId(int i11) {
        MenuItem menuItemFindItem = this.f42456a.findItem(i11);
        if (menuItemFindItem == null || this.f42456a.O(menuItemFindItem, this.f42458c, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
