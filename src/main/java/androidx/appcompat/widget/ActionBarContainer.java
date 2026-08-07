package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f2395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f2396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f2397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f2398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f2399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f2400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f2401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f2402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2403j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2398e;
        if (drawable != null && drawable.isStateful()) {
            this.f2398e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2399f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2399f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2400g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2400g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2395b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2398e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2399f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2400g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2396c = findViewById(i.f.f73800a);
        this.f2397d = findViewById(i.f.f73806g);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2394a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f2395b;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i15 = layoutParams.bottomMargin;
            view.layout(i11, measuredHeight2 - i15, i13, measuredHeight - i15);
        }
        if (this.f2401h) {
            Drawable drawable2 = this.f2400g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = z13;
            }
        } else {
            if (this.f2398e != null) {
                if (this.f2396c.getVisibility() == 0) {
                    this.f2398e.setBounds(this.f2396c.getLeft(), this.f2396c.getTop(), this.f2396c.getRight(), this.f2396c.getBottom());
                } else {
                    View view2 = this.f2397d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2398e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2398e.setBounds(this.f2397d.getLeft(), this.f2397d.getTop(), this.f2397d.getRight(), this.f2397d.getBottom());
                    }
                }
                z13 = true;
            }
            this.f2402i = z14;
            if (!z14 || (drawable = this.f2399f) == null) {
                z12 = z13;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int iA;
        int i13;
        if (this.f2396c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.f2403j) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f2396c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        View view = this.f2395b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f2396c)) {
            iA = !b(this.f2397d) ? a(this.f2397d) : 0;
        } else {
            iA = a(this.f2396c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f2395b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2398e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2398e);
        }
        this.f2398e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2396c;
            if (view != null) {
                this.f2398e.setBounds(view.getLeft(), this.f2396c.getTop(), this.f2396c.getRight(), this.f2396c.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f2401h ? !(this.f2398e != null || this.f2399f != null) : this.f2400g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2400g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2400g);
        }
        this.f2400g = drawable;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2401h && (drawable2 = this.f2400g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2401h ? !(this.f2398e != null || this.f2399f != null) : this.f2400g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2399f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2399f);
        }
        this.f2399f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2402i && (drawable2 = this.f2399f) != null) {
                drawable2.setBounds(this.f2395b.getLeft(), this.f2395b.getTop(), this.f2395b.getRight(), this.f2395b.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f2401h ? !(this.f2398e != null || this.f2399f != null) : this.f2400g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(u0 u0Var) {
        View view = this.f2395b;
        if (view != null) {
            removeView(view);
        }
        this.f2395b = u0Var;
        if (u0Var != null) {
            addView(u0Var);
            ViewGroup.LayoutParams layoutParams = u0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            u0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f2394a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f2398e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f2399f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f2400g;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f2398e && !this.f2401h) {
            return true;
        }
        if (drawable == this.f2399f && this.f2402i) {
            return true;
        }
        return (drawable == this.f2400g && this.f2401h) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.t0(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f73865a);
        this.f2398e = typedArrayObtainStyledAttributes.getDrawable(i.j.f73871b);
        this.f2399f = typedArrayObtainStyledAttributes.getDrawable(i.j.f73883d);
        this.f2403j = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f73915j, -1);
        boolean z11 = true;
        if (getId() == i.f.I) {
            this.f2401h = true;
            this.f2400g = typedArrayObtainStyledAttributes.getDrawable(i.j.f73877c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2401h ? this.f2398e != null || this.f2399f != null : this.f2400g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }
}
