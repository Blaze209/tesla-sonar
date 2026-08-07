package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d1;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.e0;
import androidx.core.widget.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import nt.i;
import zs.f;
import zs.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends FrameLayout implements k.a {
    private static final int[] G = {R.attr.state_checked};
    private static final d H;
    private static final d I;
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private bt.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f42393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f42394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f42398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f42403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f42404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f42405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ViewGroup f42406o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final TextView f42407p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f42408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g f42411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f42412u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f42413v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f42414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ValueAnimator f42415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f42416y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f42417z;

    /* JADX INFO: renamed from: com.google.android.material.navigation.a$a, reason: collision with other inner class name */
    class ViewOnLayoutChangeListenerC0667a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC0667a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (a.this.f42405n.getVisibility() == 0) {
                a aVar = a.this;
                aVar.w(aVar.f42405n);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42419a;

        b(int i11) {
            this.f42419a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.x(this.f42419a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f42421a;

        c(float f11) {
            this.f42421a = f11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f42421a);
        }
    }

    private static class d {
        private d() {
        }

        protected float a(float f11, float f12) {
            return at.b.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f12 == BitmapDescriptorFactory.HUE_RED ? 0.8f : 0.0f, f12 == BitmapDescriptorFactory.HUE_RED ? 1.0f : 0.2f, f11);
        }

        protected float b(float f11, float f12) {
            return at.b.a(0.4f, 1.0f, f11);
        }

        protected float c(float f11, float f12) {
            return 1.0f;
        }

        public void d(float f11, float f12, @NonNull View view) {
            view.setScaleX(b(f11, f12));
            view.setScaleY(c(f11, f12));
            view.setAlpha(a(f11, f12));
        }

        /* synthetic */ d(ViewOnLayoutChangeListenerC0667a viewOnLayoutChangeListenerC0667a) {
            this();
        }
    }

    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.a.d
        protected float c(float f11, float f12) {
            return b(f11, f12);
        }

        /* synthetic */ e(ViewOnLayoutChangeListenerC0667a viewOnLayoutChangeListenerC0667a) {
            this();
        }
    }

    static {
        ViewOnLayoutChangeListenerC0667a viewOnLayoutChangeListenerC0667a = null;
        H = new d(viewOnLayoutChangeListenerC0667a);
        I = new e(viewOnLayoutChangeListenerC0667a);
    }

    public a(@NonNull Context context) {
        super(context);
        this.f42392a = false;
        this.f42409r = -1;
        this.f42410s = 0;
        this.f42416y = H;
        this.f42417z = BitmapDescriptorFactory.HUE_RED;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f42403l = (FrameLayout) findViewById(zs.g.W);
        this.f42404m = findViewById(zs.g.V);
        ImageView imageView = (ImageView) findViewById(zs.g.X);
        this.f42405n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(zs.g.Y);
        this.f42406o = viewGroup;
        TextView textView = (TextView) findViewById(zs.g.f128685a0);
        this.f42407p = textView;
        TextView textView2 = (TextView) findViewById(zs.g.Z);
        this.f42408q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f42395d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f42396e = viewGroup.getPaddingBottom();
        this.f42397f = getResources().getDimensionPixelSize(zs.e.F);
        ViewCompat.z0(textView, 2);
        ViewCompat.z0(textView2, 2);
        setFocusable(true);
        g(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0667a());
        }
    }

    private void g(float f11, float f12) {
        this.f42398g = f11 - f12;
        this.f42399h = (f12 * 1.0f) / f11;
        this.f42400i = (f11 * 1.0f) / f12;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f42403l;
        return frameLayout != null ? frameLayout : this.f42405n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < iIndexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        bt.a aVar = this.F;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.F.n();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f42405n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable i(@NonNull ColorStateList colorStateList) {
        return new RippleDrawable(qt.b.a(colorStateList), null, null);
    }

    private FrameLayout j(View view) {
        ImageView imageView = this.f42405n;
        if (view == imageView && bt.c.f18107a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean k() {
        return this.F != null;
    }

    private boolean l() {
        return this.D && this.f42401j == 2;
    }

    private void m(float f11) {
        if (!this.A || !this.f42392a || !ViewCompat.S(this)) {
            q(f11, f11);
            return;
        }
        ValueAnimator valueAnimator = this.f42415x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42415x = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f42417z, f11);
        this.f42415x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f11));
        this.f42415x.setInterpolator(i.g(getContext(), zs.c.f128570h0, at.b.f14973b));
        this.f42415x.setDuration(i.f(getContext(), zs.c.X, getResources().getInteger(h.f128737b)));
        this.f42415x.start();
    }

    private void n() {
        g gVar = this.f42411t;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void o() {
        Drawable drawableI = this.f42394c;
        RippleDrawable rippleDrawable = null;
        boolean z11 = true;
        if (this.f42393b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.A && getActiveIndicatorDrawable() != null && this.f42403l != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(qt.b.d(this.f42393b), null, activeIndicatorDrawable);
                z11 = false;
            } else if (drawableI == null) {
                drawableI = i(this.f42393b);
            }
        }
        FrameLayout frameLayout = this.f42403l;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f42403l.setForeground(rippleDrawable);
        }
        ViewCompat.t0(this, drawableI);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(float f11, float f12) {
        View view = this.f42404m;
        if (view != null) {
            this.f42416y.d(f11, f12, view);
        }
        this.f42417z = f11;
    }

    private static void r(TextView textView, int i11) {
        m.r(textView, i11);
        int i12 = pt.c.i(textView.getContext(), i11, 0);
        if (i12 != 0) {
            textView.setTextSize(0, i12);
        }
    }

    private static void s(@NonNull View view, float f11, float f12, int i11) {
        view.setScaleX(f11);
        view.setScaleY(f12);
        view.setVisibility(i11);
    }

    private static void t(@NonNull View view, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.bottomMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    private void u(View view) {
        if (k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            bt.c.a(this.F, view, j(view));
        }
    }

    private void v(View view) {
        if (k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                bt.c.d(this.F, view);
            }
            this.F = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (k()) {
            bt.c.e(this.F, view, j(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i11) {
        if (this.f42404m == null || i11 <= 0) {
            return;
        }
        int iMin = Math.min(this.B, i11 - (this.E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42404m.getLayoutParams();
        layoutParams.height = l() ? iMin : this.C;
        layoutParams.width = iMin;
        this.f42404m.setLayoutParams(layoutParams);
    }

    private void y() {
        if (l()) {
            this.f42416y = I;
        } else {
            this.f42416y = H;
        }
    }

    private static void z(@NonNull View view, int i11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(@NonNull g gVar, int i11) {
        this.f42411t = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        d1.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f42392a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f42403l;
        if (frameLayout != null && this.A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f42404m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public bt.a getBadge() {
        return this.F;
    }

    protected int getItemBackgroundResId() {
        return f.f128682m;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f42411t;
    }

    protected int getItemDefaultMarginResId() {
        return zs.e.f128665x0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f42409r;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42406o.getLayoutParams();
        return getSuggestedIconHeight() + (this.f42406o.getVisibility() == 0 ? this.f42397f : 0) + layoutParams.topMargin + this.f42406o.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42406o.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f42406o.getMeasuredWidth() + layoutParams.rightMargin);
    }

    void h() {
        p();
        this.f42411t = null;
        this.f42417z = BitmapDescriptorFactory.HUE_RED;
        this.f42392a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NonNull
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        g gVar = this.f42411t;
        if (gVar != null && gVar.isCheckable() && this.f42411t.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bt.a aVar = this.F;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f42411t.getTitle();
            if (!TextUtils.isEmpty(this.f42411t.getContentDescription())) {
                title = this.f42411t.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.F.k()));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatN1 = AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo);
        accessibilityNodeInfoCompatN1.w0(AccessibilityNodeInfoCompat.e.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatN1.u0(false);
            accessibilityNodeInfoCompatN1.k0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7746i);
        }
        accessibilityNodeInfoCompatN1.V0(getResources().getString(zs.k.f128773h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        post(new b(i11));
    }

    void p() {
        v(this.f42405n);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f42404m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        o();
    }

    public void setActiveIndicatorEnabled(boolean z11) {
        this.A = z11;
        o();
        View view = this.f42404m;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i11) {
        this.C = i11;
        x(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i11) {
        if (this.f42397f != i11) {
            this.f42397f = i11;
            n();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i11) {
        this.E = i11;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z11) {
        this.D = z11;
    }

    public void setActiveIndicatorWidth(int i11) {
        this.B = i11;
        x(getWidth());
    }

    void setBadge(@NonNull bt.a aVar) {
        if (this.F == aVar) {
            return;
        }
        if (k() && this.f42405n != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            v(this.f42405n);
        }
        this.F = aVar;
        ImageView imageView = this.f42405n;
        if (imageView != null) {
            u(imageView);
        }
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    public void setChecked(boolean z11) {
        TextView textView = this.f42408q;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f42408q;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f42407p;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f42407p;
        textView4.setPivotY(textView4.getBaseline());
        m(z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        int i11 = this.f42401j;
        if (i11 != -1) {
            if (i11 == 0) {
                if (z11) {
                    t(getIconOrContainer(), this.f42395d, 49);
                    z(this.f42406o, this.f42396e);
                    this.f42408q.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.f42395d, 17);
                    z(this.f42406o, 0);
                    this.f42408q.setVisibility(4);
                }
                this.f42407p.setVisibility(4);
            } else if (i11 == 1) {
                z(this.f42406o, this.f42396e);
                if (z11) {
                    t(getIconOrContainer(), (int) (this.f42395d + this.f42398g), 49);
                    s(this.f42408q, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f42407p;
                    float f11 = this.f42399h;
                    s(textView5, f11, f11, 4);
                } else {
                    t(getIconOrContainer(), this.f42395d, 49);
                    TextView textView6 = this.f42408q;
                    float f12 = this.f42400i;
                    s(textView6, f12, f12, 4);
                    s(this.f42407p, 1.0f, 1.0f, 0);
                }
            } else if (i11 == 2) {
                t(getIconOrContainer(), this.f42395d, 17);
                this.f42408q.setVisibility(8);
                this.f42407p.setVisibility(8);
            }
        } else if (this.f42402k) {
            if (z11) {
                t(getIconOrContainer(), this.f42395d, 49);
                z(this.f42406o, this.f42396e);
                this.f42408q.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.f42395d, 17);
                z(this.f42406o, 0);
                this.f42408q.setVisibility(4);
            }
            this.f42407p.setVisibility(4);
        } else {
            z(this.f42406o, this.f42396e);
            if (z11) {
                t(getIconOrContainer(), (int) (this.f42395d + this.f42398g), 49);
                s(this.f42408q, 1.0f, 1.0f, 0);
                TextView textView7 = this.f42407p;
                float f13 = this.f42399h;
                s(textView7, f13, f13, 4);
            } else {
                t(getIconOrContainer(), this.f42395d, 49);
                TextView textView8 = this.f42408q;
                float f14 = this.f42400i;
                s(textView8, f14, f14, 4);
                s(this.f42407p, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f42407p.setEnabled(z11);
        this.f42408q.setEnabled(z11);
        this.f42405n.setEnabled(z11);
        if (z11) {
            ViewCompat.G0(this, e0.b(getContext(), 1002));
        } else {
            ViewCompat.G0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f42413v) {
            return;
        }
        this.f42413v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = l5.a.r(drawable).mutate();
            this.f42414w = drawable;
            ColorStateList colorStateList = this.f42412u;
            if (colorStateList != null) {
                l5.a.o(drawable, colorStateList);
            }
        }
        this.f42405n.setImageDrawable(drawable);
    }

    public void setIconSize(int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42405n.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        this.f42405n.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f42412u = colorStateList;
        if (this.f42411t == null || (drawable = this.f42414w) == null) {
            return;
        }
        l5.a.o(drawable, colorStateList);
        this.f42414w.invalidateSelf();
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : androidx.core.content.b.getDrawable(getContext(), i11));
    }

    public void setItemPaddingBottom(int i11) {
        if (this.f42396e != i11) {
            this.f42396e = i11;
            n();
        }
    }

    public void setItemPaddingTop(int i11) {
        if (this.f42395d != i11) {
            this.f42395d = i11;
            n();
        }
    }

    public void setItemPosition(int i11) {
        this.f42409r = i11;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f42393b = colorStateList;
        o();
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f42401j != i11) {
            this.f42401j = i11;
            y();
            x(getWidth());
            n();
        }
    }

    public void setShifting(boolean z11) {
        if (this.f42402k != z11) {
            this.f42402k = z11;
            n();
        }
    }

    public void setShortcut(boolean z11, char c11) {
    }

    public void setTextAppearanceActive(int i11) {
        this.f42410s = i11;
        r(this.f42408q, i11);
        g(this.f42407p.getTextSize(), this.f42408q.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z11) {
        setTextAppearanceActive(this.f42410s);
        TextView textView = this.f42408q;
        textView.setTypeface(textView.getTypeface(), z11 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i11) {
        r(this.f42407p, i11);
        g(this.f42407p.getTextSize(), this.f42408q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f42407p.setTextColor(colorStateList);
            this.f42408q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f42407p.setText(charSequence);
        this.f42408q.setText(charSequence);
        g gVar = this.f42411t;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.f42411t;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f42411t.getTooltipText();
        }
        d1.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f42394c = drawable;
        o();
    }
}
