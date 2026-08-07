package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
class p extends s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f42889s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f42893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f42894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f42895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z5.c.a f42896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f42900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f42901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f42902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f42903r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f42903r.start();
        }
    }

    p(@NonNull r rVar) {
        super(rVar);
        this.f42894i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42885a.J();
            }
        };
        this.f42895j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                p.y(this.f42886a, view, z11);
            }
        };
        this.f42896k = new z5.c.a() { // from class: com.google.android.material.textfield.n
            @Override // z5.c.a
            public final void onTouchExplorationStateChanged(boolean z11) {
                p.w(this.f42887a, z11);
            }
        };
        this.f42900o = Long.MAX_VALUE;
        this.f42891f = nt.i.f(rVar.getContext(), zs.c.f128562d0, 67);
        this.f42890e = nt.i.f(rVar.getContext(), zs.c.f128562d0, 50);
        this.f42892g = nt.i.g(rVar.getContext(), zs.c.f128572i0, at.b.f14972a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    @NonNull
    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i11, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42892g);
        valueAnimatorOfFloat.setDuration(i11);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f42882a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f42903r = E(this.f42891f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f42890e, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f42902q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f42900o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private void H(boolean z11) {
        if (this.f42899n != z11) {
            this.f42899n = z11;
            this.f42903r.cancel();
            this.f42902q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        this.f42893h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f42883a, view, motionEvent);
            }
        });
        if (f42889s) {
            this.f42893h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f42884a);
                }
            });
        }
        this.f42893h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f42893h == null) {
            return;
        }
        if (G()) {
            this.f42898m = false;
        }
        if (this.f42898m) {
            this.f42898m = false;
            return;
        }
        if (f42889s) {
            H(!this.f42899n);
        } else {
            this.f42899n = !this.f42899n;
            r();
        }
        if (!this.f42899n) {
            this.f42893h.dismissDropDown();
        } else {
            this.f42893h.requestFocus();
            this.f42893h.showDropDown();
        }
    }

    private void K() {
        this.f42898m = true;
        this.f42900o = System.currentTimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f42893h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f42898m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z11) {
        AutoCompleteTextView autoCompleteTextView = pVar.f42893h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        ViewCompat.z0(pVar.f42938d, z11 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f42938d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z11) {
        pVar.f42897l = z11;
        pVar.r();
        if (z11) {
            return;
        }
        pVar.H(false);
        pVar.f42898m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f42898m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f42901p.isTouchExplorationEnabled() && q.a(this.f42893h) && !this.f42938d.hasFocus()) {
            this.f42893h.dismissDropDown();
        }
        this.f42893h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f42888a);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return zs.k.f128772g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f42889s ? zs.f.f128679j : zs.f.f128680k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f42895j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f42894i;
    }

    @Override // com.google.android.material.textfield.s
    public z5.c.a h() {
        return this.f42896k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i11) {
        return i11 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f42897l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f42899n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f42893h = D(editText);
        I();
        this.f42935a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f42901p.isTouchExplorationEnabled()) {
            ViewCompat.z0(this.f42938d, 2);
        }
        this.f42935a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!q.a(this.f42893h)) {
            accessibilityNodeInfoCompat.t0(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.c0()) {
            accessibilityNodeInfoCompat.H0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f42901p.isEnabled() || q.a(this.f42893h)) {
            return;
        }
        boolean z11 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f42899n && !this.f42893h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z11) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f42901p = (AccessibilityManager) this.f42937c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f42893h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f42889s) {
                this.f42893h.setOnDismissListener(null);
            }
        }
    }
}
