package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.c0;
import androidx.transition.z;
import com.google.android.material.internal.y;
import java.util.HashSet;
import nt.i;
import u5.f;
import zs.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends ViewGroup implements k {
    private static final int[] F = {R.attr.state_checked};
    private static final int[] G = {-16842910};
    private st.k A;
    private boolean B;
    private ColorStateList C;
    private d D;
    private androidx.appcompat.view.menu.e E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f42423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final View.OnClickListener f42424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<com.google.android.material.navigation.a> f42425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final SparseArray<View.OnTouchListener> f42426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.material.navigation.a[] f42428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f42430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f42431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f42433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ColorStateList f42434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f42435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f42438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorStateList f42439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    private final SparseArray<bt.a> f42441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f42444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f42445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f42446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f42447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f42448z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g itemData = ((com.google.android.material.navigation.a) view).getItemData();
            if (c.this.E.O(itemData, c.this.D, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public c(@NonNull Context context) {
        super(context);
        this.f42425c = new u5.g(5);
        this.f42426d = new SparseArray<>(5);
        this.f42429g = 0;
        this.f42430h = 0;
        this.f42441s = new SparseArray<>(5);
        this.f42442t = -1;
        this.f42443u = -1;
        this.f42444v = -1;
        this.B = false;
        this.f42434l = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f42423a = null;
        } else {
            androidx.transition.a aVar = new androidx.transition.a();
            this.f42423a = aVar;
            aVar.F0(0);
            aVar.l0(i.f(getContext(), zs.c.f128556a0, getResources().getInteger(h.f128737b)));
            aVar.n0(i.g(getContext(), zs.c.f128574j0, at.b.f14973b));
            aVar.w0(new y());
        }
        this.f42424b = new a();
        ViewCompat.z0(this, 1);
    }

    private Drawable f() {
        if (this.A == null || this.C == null) {
            return null;
        }
        st.g gVar = new st.g(this.A);
        gVar.b0(this.C);
        return gVar;
    }

    private com.google.android.material.navigation.a getNewItem() {
        com.google.android.material.navigation.a aVarB = this.f42425c.b();
        return aVarB == null ? g(getContext()) : aVarB;
    }

    private boolean l(int i11) {
        return i11 != -1;
    }

    private void m() {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            hashSet.add(Integer.valueOf(this.E.getItem(i11).getItemId()));
        }
        for (int i12 = 0; i12 < this.f42441s.size(); i12++) {
            int iKeyAt = this.f42441s.keyAt(i12);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.f42441s.delete(iKeyAt);
            }
        }
    }

    private void q(int i11) {
        if (l(i11)) {
            return;
        }
        throw new IllegalArgumentException(i11 + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@NonNull com.google.android.material.navigation.a aVar) {
        bt.a aVar2;
        int id2 = aVar.getId();
        if (l(id2) && (aVar2 = this.f42441s.get(id2)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(@NonNull androidx.appcompat.view.menu.e eVar) {
        this.E = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void d() {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f42425c.a(aVar);
                    aVar.h();
                }
            }
        }
        if (this.E.size() == 0) {
            this.f42429g = 0;
            this.f42430h = 0;
            this.f42428f = null;
            return;
        }
        m();
        this.f42428f = new com.google.android.material.navigation.a[this.E.size()];
        boolean zK = k(this.f42427e, this.E.G().size());
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            this.D.m(true);
            this.E.getItem(i11).setCheckable(true);
            this.D.m(false);
            com.google.android.material.navigation.a newItem = getNewItem();
            this.f42428f[i11] = newItem;
            newItem.setIconTintList(this.f42431i);
            newItem.setIconSize(this.f42432j);
            newItem.setTextColor(this.f42434l);
            newItem.setTextAppearanceInactive(this.f42435m);
            newItem.setTextAppearanceActive(this.f42436n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f42437o);
            newItem.setTextColor(this.f42433k);
            int i12 = this.f42442t;
            if (i12 != -1) {
                newItem.setItemPaddingTop(i12);
            }
            int i13 = this.f42443u;
            if (i13 != -1) {
                newItem.setItemPaddingBottom(i13);
            }
            int i14 = this.f42444v;
            if (i14 != -1) {
                newItem.setActiveIndicatorLabelPadding(i14);
            }
            newItem.setActiveIndicatorWidth(this.f42446x);
            newItem.setActiveIndicatorHeight(this.f42447y);
            newItem.setActiveIndicatorMarginHorizontal(this.f42448z);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.B);
            newItem.setActiveIndicatorEnabled(this.f42445w);
            Drawable drawable = this.f42438p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f42440r);
            }
            newItem.setItemRippleColor(this.f42439q);
            newItem.setShifting(zK);
            newItem.setLabelVisibilityMode(this.f42427e);
            g gVar = (g) this.E.getItem(i11);
            newItem.d(gVar, 0);
            newItem.setItemPosition(i11);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.f42426d.get(itemId));
            newItem.setOnClickListener(this.f42424b);
            int i15 = this.f42429g;
            if (i15 != 0 && itemId == i15) {
                this.f42430h = i11;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.E.size() - 1, this.f42430h);
        this.f42430h = iMin;
        this.E.getItem(iMin).setChecked(true);
    }

    public ColorStateList e(int i11) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = j.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.f73749z, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = G;
        return new ColorStateList(new int[][]{iArr, F, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i12, defaultColor});
    }

    @NonNull
    protected abstract com.google.android.material.navigation.a g(@NonNull Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.f42444v;
    }

    SparseArray<bt.a> getBadgeDrawables() {
        return this.f42441s;
    }

    public ColorStateList getIconTintList() {
        return this.f42431i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f42445w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f42447y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f42448z;
    }

    public st.k getItemActiveIndicatorShapeAppearance() {
        return this.A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f42446x;
    }

    public Drawable getItemBackground() {
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f42438p : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f42440r;
    }

    public int getItemIconSize() {
        return this.f42432j;
    }

    public int getItemPaddingBottom() {
        return this.f42443u;
    }

    public int getItemPaddingTop() {
        return this.f42442t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f42439q;
    }

    public int getItemTextAppearanceActive() {
        return this.f42436n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f42435m;
    }

    public ColorStateList getItemTextColor() {
        return this.f42433k;
    }

    public int getLabelVisibilityMode() {
        return this.f42427e;
    }

    protected androidx.appcompat.view.menu.e getMenu() {
        return this.E;
    }

    public int getSelectedItemId() {
        return this.f42429g;
    }

    protected int getSelectedItemPosition() {
        return this.f42430h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public com.google.android.material.navigation.a h(int i11) {
        q(i11);
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr == null) {
            return null;
        }
        for (com.google.android.material.navigation.a aVar : aVarArr) {
            if (aVar.getId() == i11) {
                return aVar;
            }
        }
        return null;
    }

    public bt.a i(int i11) {
        return this.f42441s.get(i11);
    }

    bt.a j(int i11) {
        q(i11);
        bt.a aVarF = this.f42441s.get(i11);
        if (aVarF == null) {
            aVarF = bt.a.f(getContext());
            this.f42441s.put(i11, aVarF);
        }
        com.google.android.material.navigation.a aVarH = h(i11);
        if (aVarH != null) {
            aVarH.setBadge(aVarF);
        }
        return aVarF;
    }

    protected boolean k(int i11, int i12) {
        if (i11 == -1) {
            return i12 > 3;
        }
        return i11 == 0;
    }

    void n(SparseArray<bt.a> sparseArray) {
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            if (this.f42441s.indexOfKey(iKeyAt) < 0) {
                this.f42441s.append(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                bt.a aVar2 = this.f42441s.get(aVar.getId());
                if (aVar2 != null) {
                    aVar.setBadge(aVar2);
                }
            }
        }
    }

    void o(int i11) {
        int size = this.E.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.E.getItem(i12);
            if (i11 == item.getItemId()) {
                this.f42429g = i11;
                this.f42430h = i12;
                item.setChecked(true);
                return;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo).v0(AccessibilityNodeInfoCompat.d.b(1, this.E.G().size(), false, 1));
    }

    public void p() {
        c0 c0Var;
        androidx.appcompat.view.menu.e eVar = this.E;
        if (eVar == null || this.f42428f == null) {
            return;
        }
        int size = eVar.size();
        if (size != this.f42428f.length) {
            d();
            return;
        }
        int i11 = this.f42429g;
        for (int i12 = 0; i12 < size; i12++) {
            MenuItem item = this.E.getItem(i12);
            if (item.isChecked()) {
                this.f42429g = item.getItemId();
                this.f42430h = i12;
            }
        }
        if (i11 != this.f42429g && (c0Var = this.f42423a) != null) {
            z.a(this, c0Var);
        }
        boolean zK = k(this.f42427e, this.E.G().size());
        for (int i13 = 0; i13 < size; i13++) {
            this.D.m(true);
            this.f42428f[i13].setLabelVisibilityMode(this.f42427e);
            this.f42428f[i13].setShifting(zK);
            this.f42428f[i13].d((g) this.E.getItem(i13), 0);
            this.D.m(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        this.f42444v = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorLabelPadding(i11);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f42431i = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z11) {
        this.f42445w = z11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z11);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i11) {
        this.f42447y = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i11);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i11) {
        this.f42448z = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i11);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z11) {
        this.B = z11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z11);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(st.k kVar) {
        this.A = kVar;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i11) {
        this.f42446x = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i11);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f42438p = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i11) {
        this.f42440r = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(i11);
            }
        }
    }

    public void setItemIconSize(int i11) {
        this.f42432j = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconSize(i11);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i11, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f42426d.remove(i11);
        } else {
            this.f42426d.put(i11, onTouchListener);
        }
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.getItemData().getItemId() == i11) {
                    aVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i11) {
        this.f42443u = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i11);
            }
        }
    }

    public void setItemPaddingTop(int i11) {
        this.f42442t = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i11);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42439q = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i11) {
        this.f42436n = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i11);
                ColorStateList colorStateList = this.f42433k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z11) {
        this.f42437o = z11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActiveBoldEnabled(z11);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i11) {
        this.f42435m = i11;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i11);
                ColorStateList colorStateList = this.f42433k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f42433k = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f42428f;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i11) {
        this.f42427e = i11;
    }

    public void setPresenter(@NonNull d dVar) {
        this.D = dVar;
    }
}
