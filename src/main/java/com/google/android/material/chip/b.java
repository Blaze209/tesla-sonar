package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.i;
import java.util.List;
import java.util.Set;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class b extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f41903k = l.f128816y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f41906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.material.internal.a<Chip> f41907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final f f41909j;

    class a implements com.google.android.material.internal.a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set<Integer> set) {
            if (b.this.f41906g != null) {
                e eVar = b.this.f41906g;
                b bVar = b.this;
                eVar.a(bVar, bVar.f41907h.j(b.this));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.chip.b$b, reason: collision with other inner class name */
    class C0662b implements e {
        C0662b(d dVar) {
        }

        @Override // com.google.android.material.chip.b.e
        public void a(@NonNull b bVar, @NonNull List<Integer> list) {
            if (b.this.f41907h.l()) {
                b.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i11, int i12) {
            super(i11, i12);
        }
    }

    @Deprecated
    public interface d {
    }

    public interface e {
        void a(@NonNull b bVar, @NonNull List<Integer> list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f41912a;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == b.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.l());
                }
                b.this.f41907h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f41912a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            b bVar = b.this;
            if (view == bVar && (view2 instanceof Chip)) {
                bVar.f41907h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f41912a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(b bVar, a aVar) {
            this();
        }
    }

    public b(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if ((getChildAt(i12) instanceof Chip) && h(i12)) {
                i11++;
            }
        }
        return i11;
    }

    private boolean h(int i11) {
        return getChildAt(i11).getVisibility() == 0;
    }

    @Override // com.google.android.material.internal.i
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt instanceof Chip) && h(i12)) {
                if (((Chip) childAt) == view) {
                    return i11;
                }
                i11++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f41907h.k();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f41907h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f41904e;
    }

    public int getChipSpacingVertical() {
        return this.f41905f;
    }

    public boolean i() {
        return this.f41907h.l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f41908i;
        if (i11 != -1) {
            this.f41907h.f(i11);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo).v0(AccessibilityNodeInfoCompat.d.b(getRowCount(), c() ? getVisibleChipCount() : -1, false, i() ? 1 : 2));
    }

    public void setChipSpacing(int i11) {
        setChipSpacingHorizontal(i11);
        setChipSpacingVertical(i11);
    }

    public void setChipSpacingHorizontal(int i11) {
        if (this.f41904e != i11) {
            this.f41904e = i11;
            setItemSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i11) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingResource(int i11) {
        setChipSpacing(getResources().getDimensionPixelOffset(i11));
    }

    public void setChipSpacingVertical(int i11) {
        if (this.f41905f != i11) {
            this.f41905f = i11;
            setLineSpacing(i11);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i11) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i11));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i11) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C0662b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f41906g = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f41909j.f41912a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z11) {
        this.f41907h.p(z11);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i11) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.i
    public void setSingleLine(boolean z11) {
        super.setSingleLine(z11);
    }

    public void setSingleSelection(boolean z11) {
        this.f41907h.q(z11);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128571i);
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i11) {
        setSingleLine(getResources().getBoolean(i11));
    }

    public void setSingleSelection(int i11) {
        setSingleSelection(getResources().getBoolean(i11));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41903k;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        com.google.android.material.internal.a<Chip> aVar = new com.google.android.material.internal.a<>();
        this.f41907h = aVar;
        f fVar = new f(this, null);
        this.f41909j = fVar;
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, m.f128881f2, i11, i12, new int[0]);
        int dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(m.f128905h2, 0);
        setChipSpacingHorizontal(typedArrayI.getDimensionPixelOffset(m.f128917i2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayI.getDimensionPixelOffset(m.f128929j2, dimensionPixelOffset));
        setSingleLine(typedArrayI.getBoolean(m.f128953l2, false));
        setSingleSelection(typedArrayI.getBoolean(m.f128965m2, false));
        setSelectionRequired(typedArrayI.getBoolean(m.f128941k2, false));
        this.f41908i = typedArrayI.getResourceId(m.f128893g2, -1);
        typedArrayI.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        ViewCompat.z0(this, 1);
    }
}
