package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends n0 implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f2447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.appcompat.widget.c f2451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f2452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f2453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    e f2458l;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements androidx.appcompat.view.menu.j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z11) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends n0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f2464f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f2459a = cVar.f2459a;
        }

        public c(int i11, int i12) {
            super(i11, i12);
            this.f2459a = false;
        }
    }

    private class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f2458l;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f2453g;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int o(View view, int i11, int i12, int i13, int i14) {
        int i15;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z11 = false;
        boolean z12 = actionMenuItemView != null && actionMenuItemView.f();
        if (i12 > 0) {
            i15 = 2;
            if (!z12 || i12 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i16 = measuredWidth / i11;
                if (measuredWidth % i11 != 0) {
                    i16++;
                }
                if (!z12 || i16 >= 2) {
                    i15 = i16;
                }
            } else {
                i15 = 0;
            }
        } else {
            i15 = 0;
        }
        if (!cVar.f2459a && z12) {
            z11 = true;
        }
        cVar.f2462d = z11;
        cVar.f2460b = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), iMakeMeasureSpec);
        return i15;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void p(int i11, int i12) {
        long j11;
        int i13;
        boolean z11;
        ?? r11;
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f2456j;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i21 = 0;
        boolean z12 = false;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        long j12 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            int i24 = size2;
            if (childAt.getVisibility() == 8) {
                i14 = i19;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    int i25 = this.f2457k;
                    r11 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    r11 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f2464f = r11;
                cVar.f2461c = r11;
                cVar.f2460b = r11;
                cVar.f2462d = r11;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r11;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r11;
                cVar.f2463e = z13 && ((ActionMenuItemView) childAt).f();
                int iO = o(childAt, i19, cVar.f2459a ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iO);
                i14 = i19;
                if (cVar.f2462d) {
                    i23++;
                }
                if (cVar.f2459a) {
                    z12 = true;
                }
                i17 -= iO;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iO == 1) {
                    j12 |= (long) (1 << i21);
                }
            }
            i21++;
            size2 = i24;
            i19 = i14;
        }
        int i26 = size2;
        int i27 = i19;
        char c11 = 2;
        boolean z14 = z12 && i22 == 2;
        boolean z15 = false;
        while (true) {
            if (i23 <= 0 || i17 <= 0) {
                j11 = 1;
                break;
            }
            int i28 = Integer.MAX_VALUE;
            long j13 = 0;
            char c12 = c11;
            int i29 = 0;
            int i31 = 0;
            j11 = 1;
            while (i31 < childCount) {
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                boolean z16 = z14;
                if (cVar2.f2462d) {
                    int i32 = cVar2.f2460b;
                    if (i32 < i28) {
                        j13 = 1 << i31;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j13 |= 1 << i31;
                        i29++;
                    }
                }
                i31++;
                z14 = z16;
            }
            boolean z17 = z14;
            j12 |= j13;
            if (i29 > i17) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j14 = 1 << i34;
                if ((j13 & j14) == 0) {
                    if (cVar3.f2460b == i33) {
                        j12 |= j14;
                    }
                    i34 = i34;
                } else {
                    if (!z17 || !cVar3.f2463e) {
                        z11 = true;
                    } else if (i17 == 1) {
                        int i35 = this.f2457k;
                        z11 = true;
                        childAt2.setPadding(i35 + i27, 0, i35, 0);
                    } else {
                        z11 = true;
                    }
                    cVar3.f2460b++;
                    cVar3.f2464f = z11;
                    i17--;
                }
                i34++;
            }
            c11 = c12;
            z14 = z17;
            z15 = true;
        }
        boolean z18 = !z12 && i22 == 1;
        if (i17 <= 0 || j12 == 0 || (i17 >= i22 - 1 && !z18 && iMax2 <= 1)) {
            i13 = 0;
        } else {
            float fBitCount = Long.bitCount(j12);
            if (z18) {
                i13 = 0;
            } else {
                if ((j12 & j11) != 0) {
                    i13 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f2463e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i13 = 0;
                }
                int i36 = childCount - 1;
                if ((j12 & ((long) (1 << i36))) != 0 && !((c) getChildAt(i36).getLayoutParams()).f2463e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > BitmapDescriptorFactory.HUE_RED ? (int) ((i17 * i27) / fBitCount) : i13;
            boolean z19 = z15;
            for (int i38 = i13; i38 < childCount; i38++) {
                if ((j12 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f2461c = i37;
                        cVar4.f2464f = true;
                        if (i38 == 0 && !cVar4.f2463e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i37) / 2;
                        }
                        z19 = true;
                    } else if (cVar4.f2459a) {
                        cVar4.f2461c = i37;
                        cVar4.f2464f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i37) / 2;
                        z19 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i39 = i13; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f2464f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f2460b * i27) + cVar5.f2461c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i15, mode != 1073741824 ? iMax : i26);
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f2447a = eVar;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(androidx.appcompat.view.menu.g gVar) {
        return this.f2447a.N(gVar, 0);
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void e() {
        androidx.appcompat.widget.c cVar = this.f2451e;
        if (cVar != null) {
            cVar.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f2447a == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f2447a = eVar;
            eVar.V(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f2451e = cVar;
            cVar.L(true);
            androidx.appcompat.widget.c cVar2 = this.f2451e;
            androidx.appcompat.view.menu.j.a bVar = this.f2452f;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.i(bVar);
            this.f2447a.c(this.f2451e, this.f2448b);
            this.f2451e.J(this);
        }
        return this.f2447a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2451e.C();
    }

    public int getPopupTheme() {
        return this.f2449c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c i() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f2459a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean j(int i11) {
        boolean zA = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i11 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean k() {
        androidx.appcompat.widget.c cVar = this.f2451e;
        return cVar != null && cVar.D();
    }

    public boolean l() {
        androidx.appcompat.widget.c cVar = this.f2451e;
        return cVar != null && cVar.F();
    }

    public boolean m() {
        androidx.appcompat.widget.c cVar = this.f2451e;
        return cVar != null && cVar.G();
    }

    public boolean n() {
        return this.f2450d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f2451e;
        if (cVar != null) {
            cVar.e(false);
            if (this.f2451e.G()) {
                this.f2451e.D();
                this.f2451e.M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int paddingLeft;
        if (!this.f2454h) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i13 - i11;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean zB = h1.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f2459a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i21 = i15 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    j(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i16 / 2) - (measuredWidth2 / 2);
            int i23 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i18 - (i17 ^ 1);
        int iMax = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2459a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2459a) {
                int i29 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i29, i31, i29 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft2 = i29 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.n0, android.view.View
    protected void onMeasure(int i11, int i12) {
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = this.f2454h;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.f2454h = z12;
        if (z11 != z12) {
            this.f2455i = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.f2454h && (eVar = this.f2447a) != null && size != this.f2455i) {
            this.f2455i = size;
            eVar.M(true);
        }
        int childCount = getChildCount();
        if (this.f2454h && childCount > 0) {
            p(i11, i12);
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            c cVar = (c) getChildAt(i13).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i11, i12);
    }

    public androidx.appcompat.view.menu.e q() {
        return this.f2447a;
    }

    public boolean r() {
        androidx.appcompat.widget.c cVar = this.f2451e;
        return cVar != null && cVar.M();
    }

    public void setExpandedActionViewsExclusive(boolean z11) {
        this.f2451e.I(z11);
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f2452f = aVar;
        this.f2453g = aVar2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f2458l = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2451e.K(drawable);
    }

    public void setOverflowReserved(boolean z11) {
        this.f2450d = z11;
    }

    public void setPopupTheme(int i11) {
        if (this.f2449c != i11) {
            this.f2449c = i11;
            if (i11 == 0) {
                this.f2448b = getContext();
            } else {
                this.f2448b = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f2451e = cVar;
        cVar.J(this);
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f2456j = (int) (56.0f * f11);
        this.f2457k = (int) (f11 * 4.0f);
        this.f2448b = context;
        this.f2449c = 0;
    }
}
