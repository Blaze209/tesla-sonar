package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f2404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f2405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f2406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f2407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f2408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f2409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f2410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f2411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2415t;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMode f2416a;

        a(ActionMode actionMode) {
            this.f2416a = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f2416a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f2409n == null) {
            LayoutInflater.from(getContext()).inflate(i.g.f73826a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2409n = linearLayout;
            this.f2410o = (TextView) linearLayout.findViewById(i.f.f73805f);
            this.f2411p = (TextView) this.f2409n.findViewById(i.f.f73804e);
            if (this.f2412q != 0) {
                this.f2410o.setTextAppearance(getContext(), this.f2412q);
            }
            if (this.f2413r != 0) {
                this.f2411p.setTextAppearance(getContext(), this.f2413r);
            }
        }
        this.f2410o.setText(this.f2404i);
        this.f2411p.setText(this.f2405j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f2404i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f2405j);
        this.f2411p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f2409n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f2409n.getParent() == null) {
            addView(this.f2409n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat f(int i11, long j11) {
        return super.f(i11, j11);
    }

    public void g() {
        if (this.f2406k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2405j;
    }

    public CharSequence getTitle() {
        return this.f2404i;
    }

    public void h(ActionMode actionMode) {
        View view = this.f2406k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f2415t, (ViewGroup) this, false);
            this.f2406k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f2406k);
        }
        View viewFindViewById = this.f2406k.findViewById(i.f.f73809j);
        this.f2407l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(actionMode));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMode.e();
        c cVar = this.f2559d;
        if (cVar != null) {
            cVar.A();
        }
        c cVar2 = new c(getContext());
        this.f2559d = cVar2;
        cVar2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f2559d, this.f2557b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f2559d.q(this);
        this.f2558c = actionMenuView;
        ViewCompat.t0(actionMenuView, null);
        addView(this.f2558c, layoutParams);
    }

    public boolean j() {
        return this.f2414s;
    }

    public void k() {
        removeAllViews();
        this.f2408m = null;
        this.f2558c = null;
        this.f2559d = null;
        View view = this.f2407l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f2559d;
        if (cVar != null) {
            return cVar.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f2559d;
        if (cVar != null) {
            cVar.D();
            this.f2559d.E();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f2404i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean zB = h1.b(this);
        int paddingRight = zB ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2406k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2406k.getLayoutParams();
            int i15 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i16 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i15, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f2406k, iD, paddingTop, paddingTop2, zB), i16, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f2409n;
        if (linearLayout != null && this.f2408m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f2409n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f2408m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2558c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i12) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = this.f2560e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i12);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2406k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2406k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2558c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f2558c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2409n;
        if (linearLayout != null && this.f2408m == null) {
            if (this.f2414s) {
                this.f2409n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2409n.getMeasuredWidth();
                boolean z11 = measuredWidth <= paddingLeft;
                if (z11) {
                    paddingLeft -= measuredWidth;
                }
                this.f2409n.setVisibility(z11 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f2408m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                iMin = Math.min(i15, iMin);
            }
            this.f2408m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(iMin, i16));
        }
        if (this.f2560e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i11) {
        this.f2560e = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2408m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2408m = view;
        if (view != null && (linearLayout = this.f2409n) != null) {
            removeView(linearLayout);
            this.f2409n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2405j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2404i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.f2414s) {
            requestLayout();
        }
        this.f2414s = z11;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f73734k);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        b1 b1VarV = b1.v(context, attributeSet, i.j.f73990y, i11, 0);
        ViewCompat.t0(this, b1VarV.g(i.j.f73995z));
        this.f2412q = b1VarV.n(i.j.D, 0);
        this.f2413r = b1VarV.n(i.j.C, 0);
        this.f2560e = b1VarV.m(i.j.B, 0);
        this.f2415t = b1VarV.n(i.j.A, i.g.f73829d);
        b1VarV.w();
    }
}
