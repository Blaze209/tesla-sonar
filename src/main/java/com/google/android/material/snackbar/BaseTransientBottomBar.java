package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.f0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.plaid.internal.EnumC4419g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f42718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f42719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f42720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final ViewGroup f42721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f42722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    protected final t f42723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.snackbar.a f42724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private q f42727m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42734t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f42735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f42736v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<r<B>> f42737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Behavior f42738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f42739y;
    private static final TimeInterpolator A = at.b.f14973b;
    private static final TimeInterpolator B = at.b.f14972a;
    private static final TimeInterpolator C = at.b.f14975d;
    private static final boolean E = false;
    private static final int[] F = {zs.c.f128586p0};
    private static final String G = BaseTransientBottomBar.class.getSimpleName();

    @NonNull
    static final Handler D = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42728n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f42729o = new i();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    com.google.android.material.snackbar.b.InterfaceC0671b f42740z = new l();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        private final s f42741l = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f42741l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f42741l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.f42741l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42742a;

        a(int i11) {
            this.f42742a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f42742a);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f42723i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f42723i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f42723i.setScaleY(fFloatValue);
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f42724j.a(BaseTransientBottomBar.this.f42717c - BaseTransientBottomBar.this.f42715a, BaseTransientBottomBar.this.f42715a);
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42748b;

        e(int i11) {
            this.f42748b = i11;
            this.f42747a = i11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                ViewCompat.a0(BaseTransientBottomBar.this.f42723i, iIntValue - this.f42747a);
            } else {
                BaseTransientBottomBar.this.f42723i.setTranslationY(iIntValue);
            }
            this.f42747a = iIntValue;
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42750a;

        f(int i11) {
            this.f42750a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.R(this.f42750a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f42724j.b(0, BaseTransientBottomBar.this.f42716b);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42752a = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.E) {
                ViewCompat.a0(BaseTransientBottomBar.this.f42723i, iIntValue - this.f42752a);
            } else {
                BaseTransientBottomBar.this.f42723i.setTranslationY(iIntValue);
            }
            this.f42752a = iIntValue;
        }
    }

    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                ((BaseTransientBottomBar) message.obj).a0();
                return true;
            }
            if (i11 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).L(message.arg1);
            return true;
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f42723i == null || baseTransientBottomBar.f42722h == null) {
                return;
            }
            int iHeight = (f0.a(BaseTransientBottomBar.this.f42722h).height() - BaseTransientBottomBar.this.J()) + ((int) BaseTransientBottomBar.this.f42723i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f42734t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f42735u = baseTransientBottomBar2.f42734t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f42723i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.G, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f42735u = baseTransientBottomBar3.f42734t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f42734t - iHeight;
            BaseTransientBottomBar.this.f42723i.requestLayout();
        }
    }

    class j implements a0 {
        j() {
        }

        @Override // androidx.core.view.a0
        @NonNull
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.f42730p = windowInsetsCompat.j();
            BaseTransientBottomBar.this.f42731q = windowInsetsCompat.k();
            BaseTransientBottomBar.this.f42732r = windowInsetsCompat.l();
            BaseTransientBottomBar.this.g0();
            return windowInsetsCompat;
        }
    }

    class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.a(PKIFailureInfo.badCertTemplate);
            accessibilityNodeInfoCompat.z0(true);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (i11 != 1048576) {
                return super.j(view, i11, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    class l implements com.google.android.material.snackbar.b.InterfaceC0671b {
        l() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0671b
        public void a(int i11) {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(1, i11, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0671b
        public void show() {
            Handler handler = BaseTransientBottomBar.D;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.R(3);
        }
    }

    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@NonNull View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i11) {
            if (i11 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f42740z);
            } else if (i11 == 1 || i11 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f42740z);
            }
        }
    }

    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t tVar = BaseTransientBottomBar.this.f42723i;
            if (tVar == null) {
                return;
            }
            if (tVar.getParent() != null) {
                BaseTransientBottomBar.this.f42723i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f42723i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.c0();
            } else {
                BaseTransientBottomBar.this.e0();
            }
        }
    }

    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.S();
        }
    }

    static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<BaseTransientBottomBar> f42762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final WeakReference<View> f42763b;

        private q(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.f42762a = new WeakReference<>(baseTransientBottomBar);
            this.f42763b = new WeakReference<>(view);
        }

        static q a(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (ViewCompat.S(view)) {
                d0.b(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f42762a.get() != null) {
                return false;
            }
            c();
            return true;
        }

        View b() {
            return this.f42763b.get();
        }

        void c() {
            if (this.f42763b.get() != null) {
                this.f42763b.get().removeOnAttachStateChangeListener(this);
                d0.o(this.f42763b.get(), this);
            }
            this.f42763b.clear();
            this.f42762a.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f42762a.get().f42728n) {
                return;
            }
            this.f42762a.get().T();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            d0.b(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            d0.o(view, this);
        }
    }

    public static abstract class r<B> {
        public void a(B b11, int i11) {
        }

        public void b(B b11) {
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.b.InterfaceC0671b f42764a;

        public s(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof t;
        }

        public void b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f42764a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f42764a);
            }
        }

        public void c(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f42764a = baseTransientBottomBar.f42740z;
        }
    }

    protected static class t extends FrameLayout {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final View.OnTouchListener f42765l = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar<?> f42766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        st.k f42767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f42768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f42769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f42770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f42771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f42772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f42773h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PorterDuff.Mode f42774i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Rect f42775j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f42776k;

        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected t(@NonNull Context context) {
            this(context, null);
        }

        @NonNull
        private Drawable d() {
            int iK = ht.a.k(this, zs.c.f128599w, zs.c.f128587q, getBackgroundOverlayColorAlpha());
            st.k kVar = this.f42767b;
            Drawable drawableZ = kVar != null ? BaseTransientBottomBar.z(iK, kVar) : BaseTransientBottomBar.y(iK, getResources());
            if (this.f42773h == null) {
                return l5.a.r(drawableZ);
            }
            Drawable drawableR = l5.a.r(drawableZ);
            l5.a.o(drawableR, this.f42773h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f42775j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f42766a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f42776k = true;
            viewGroup.addView(this);
            this.f42776k = false;
        }

        float getActionTextColorAlpha() {
            return this.f42770e;
        }

        int getAnimationMode() {
            return this.f42768c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f42769d;
        }

        int getMaxInlineActionWidth() {
            return this.f42772g;
        }

        int getMaxWidth() {
            return this.f42771f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f42766a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.O();
            }
            ViewCompat.m0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f42766a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.P();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f42766a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.Q();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (this.f42771f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f42771f;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        void setAnimationMode(int i11) {
            this.f42768c = i11;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f42773h != null) {
                drawable = l5.a.r(drawable.mutate());
                l5.a.o(drawable, this.f42773h);
                l5.a.p(drawable, this.f42774i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f42773h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = l5.a.r(getBackground().mutate());
                l5.a.o(drawableR, colorStateList);
                l5.a.p(drawableR, this.f42774i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f42774i = mode;
            if (getBackground() != null) {
                Drawable drawableR = l5.a.r(getBackground().mutate());
                l5.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f42776k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f42766a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.g0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f42765l);
            super.setOnClickListener(onClickListener);
        }

        protected t(@NonNull Context context, AttributeSet attributeSet) {
            super(wt.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, zs.m.f128887f8);
            if (typedArrayObtainStyledAttributes.hasValue(zs.m.f128971m8)) {
                ViewCompat.x0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f128971m8, 0));
            }
            this.f42768c = typedArrayObtainStyledAttributes.getInt(zs.m.f128923i8, 0);
            if (typedArrayObtainStyledAttributes.hasValue(zs.m.f128995o8) || typedArrayObtainStyledAttributes.hasValue(zs.m.f129007p8)) {
                this.f42767b = st.k.e(context2, attributeSet, 0, 0).m();
            }
            this.f42769d = typedArrayObtainStyledAttributes.getFloat(zs.m.f128935j8, 1.0f);
            setBackgroundTintList(pt.c.a(context2, typedArrayObtainStyledAttributes, zs.m.f128947k8));
            setBackgroundTintMode(d0.n(typedArrayObtainStyledAttributes.getInt(zs.m.f128959l8, -1), PorterDuff.Mode.SRC_IN));
            this.f42770e = typedArrayObtainStyledAttributes.getFloat(zs.m.f128911h8, 1.0f);
            this.f42771f = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f128899g8, -1);
            this.f42772g = typedArrayObtainStyledAttributes.getDimensionPixelSize(zs.m.f128983n8, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f42765l);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.t0(this, d());
            }
        }
    }

    protected BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f42721g = viewGroup;
        this.f42724j = aVar;
        this.f42722h = context;
        com.google.android.material.internal.a0.a(context);
        t tVar = (t) LayoutInflater.from(context).inflate(H(), viewGroup, false);
        this.f42723i = tVar;
        tVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(tVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(tVar.getMaxInlineActionWidth());
        }
        tVar.addView(view);
        ViewCompat.r0(tVar, 1);
        ViewCompat.z0(tVar, 1);
        ViewCompat.y0(tVar, true);
        ViewCompat.E0(tVar, new j());
        ViewCompat.p0(tVar, new k());
        this.f42739y = (AccessibilityManager) context.getSystemService("accessibility");
        this.f42717c = nt.i.f(context, zs.c.X, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        this.f42715a = nt.i.f(context, zs.c.X, 150);
        this.f42716b = nt.i.f(context, zs.c.Y, 75);
        this.f42718d = nt.i.g(context, zs.c.f128570h0, B);
        this.f42720f = nt.i.g(context, zs.c.f128570h0, C);
        this.f42719e = nt.i.g(context, zs.c.f128570h0, A);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42718d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator G(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42720f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int I() {
        int height = this.f42723i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f42723i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J() {
        int[] iArr = new int[2];
        this.f42723i.getLocationInWindow(iArr);
        return iArr[1] + this.f42723i.getHeight();
    }

    private boolean N() {
        ViewGroup.LayoutParams layoutParams = this.f42723i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f42733s = x();
        g0();
    }

    private void W(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorF = this.f42738x;
        if (swipeDismissBehaviorF == null) {
            swipeDismissBehaviorF = F();
        }
        if (swipeDismissBehaviorF instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorF).U(this);
        }
        swipeDismissBehaviorF.P(new n());
        fVar.o(swipeDismissBehaviorF);
        if (D() == null) {
            fVar.f7409g = 80;
        }
    }

    private boolean Y() {
        return this.f42734t > 0 && !this.f42726l && N();
    }

    private void b0() {
        if (X()) {
            v();
            return;
        }
        if (this.f42723i.getParent() != null) {
            this.f42723i.setVisibility(0);
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        ValueAnimator valueAnimatorC = C(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimatorG = G(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorG);
        animatorSet.setDuration(this.f42715a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void d0(int i11) {
        ValueAnimator valueAnimatorC = C(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorC.setDuration(this.f42716b);
        valueAnimatorC.addListener(new a(i11));
        valueAnimatorC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        int I = I();
        if (E) {
            ViewCompat.a0(this.f42723i, I);
        } else {
            this.f42723i.setTranslationY(I);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(I, 0);
        valueAnimator.setInterpolator(this.f42719e);
        valueAnimator.setDuration(this.f42717c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(I));
        valueAnimator.start();
    }

    private void f0(int i11) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, I());
        valueAnimator.setInterpolator(this.f42719e);
        valueAnimator.setDuration(this.f42717c);
        valueAnimator.addListener(new f(i11));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        ViewGroup.LayoutParams layoutParams = this.f42723i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(G, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f42723i.f42775j == null) {
            Log.w(G, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f42723i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.f42723i.f42775j.bottom + (D() != null ? this.f42733s : this.f42730p);
        int i12 = this.f42723i.f42775j.left + this.f42731q;
        int i13 = this.f42723i.f42775j.right + this.f42732r;
        int i14 = this.f42723i.f42775j.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            this.f42723i.requestLayout();
        }
        if ((z11 || this.f42735u != this.f42734t) && Build.VERSION.SDK_INT >= 29 && Y()) {
            this.f42723i.removeCallbacks(this.f42729o);
            this.f42723i.post(this.f42729o);
        }
    }

    private void w(int i11) {
        if (this.f42723i.getAnimationMode() == 1) {
            d0(i11);
        } else {
            f0(i11);
        }
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        this.f42721g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f42721g.getHeight()) - i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static GradientDrawable y(int i11, @NonNull Resources resources) {
        float dimension = resources.getDimension(zs.e.C0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i11);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static st.g z(int i11, @NonNull st.k kVar) {
        st.g gVar = new st.g(kVar);
        gVar.b0(ColorStateList.valueOf(i11));
        return gVar;
    }

    public void A() {
        B(3);
    }

    protected void B(int i11) {
        com.google.android.material.snackbar.b.c().b(this.f42740z, i11);
    }

    public View D() {
        q qVar = this.f42727m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f42725k;
    }

    @NonNull
    protected SwipeDismissBehavior<? extends View> F() {
        return new Behavior();
    }

    protected int H() {
        return K() ? zs.i.f128760v : zs.i.f128741c;
    }

    protected boolean K() {
        TypedArray typedArrayObtainStyledAttributes = this.f42722h.obtainStyledAttributes(F);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void L(int i11) {
        if (X() && this.f42723i.getVisibility() == 0) {
            w(i11);
        } else {
            R(i11);
        }
    }

    public boolean M() {
        return com.google.android.material.snackbar.b.c().e(this.f42740z);
    }

    void O() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f42723i.getRootWindowInsets()) == null) {
            return;
        }
        this.f42734t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        g0();
    }

    void P() {
        if (M()) {
            D.post(new m());
        }
    }

    void Q() {
        if (this.f42736v) {
            b0();
            this.f42736v = false;
        }
    }

    void R(int i11) {
        com.google.android.material.snackbar.b.c().h(this.f42740z);
        List<r<B>> list = this.f42737w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f42737w.get(size).a(this, i11);
            }
        }
        ViewParent parent = this.f42723i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f42723i);
        }
    }

    void S() {
        com.google.android.material.snackbar.b.c().i(this.f42740z);
        List<r<B>> list = this.f42737w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f42737w.get(size).b(this);
            }
        }
    }

    @NonNull
    public B U(View view) {
        q qVar = this.f42727m;
        if (qVar != null) {
            qVar.c();
        }
        this.f42727m = view == null ? null : q.a(this, view);
        return this;
    }

    @NonNull
    public B V(int i11) {
        this.f42725k = i11;
        return this;
    }

    boolean X() {
        AccessibilityManager accessibilityManager = this.f42739y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void Z() {
        com.google.android.material.snackbar.b.c().m(E(), this.f42740z);
    }

    final void a0() {
        if (this.f42723i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f42723i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                W((CoordinatorLayout.f) layoutParams);
            }
            this.f42723i.c(this.f42721g);
            T();
            this.f42723i.setVisibility(4);
        }
        if (ViewCompat.U(this.f42723i)) {
            b0();
        } else {
            this.f42736v = true;
        }
    }

    @NonNull
    public B u(r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f42737w == null) {
            this.f42737w = new ArrayList();
        }
        this.f42737w.add(rVar);
        return this;
    }

    void v() {
        this.f42723i.post(new o());
    }
}
