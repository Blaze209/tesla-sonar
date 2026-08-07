package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
class f extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f42872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f42873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f42874j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f42875k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f42876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f42877m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f42936b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f42936b.a0(false);
        }
    }

    f(@NonNull r rVar) {
        super(rVar);
        this.f42874j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f42864a, view);
            }
        };
        this.f42875k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                f fVar = this.f42865a;
                fVar.A(fVar.E());
            }
        };
        this.f42869e = nt.i.f(rVar.getContext(), zs.c.f128562d0, 100);
        this.f42870f = nt.i.f(rVar.getContext(), zs.c.f128562d0, 150);
        this.f42871g = nt.i.g(rVar.getContext(), zs.c.f128572i0, at.b.f14972a);
        this.f42872h = nt.i.g(rVar.getContext(), zs.c.f128570h0, at.b.f14975d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z11) {
        boolean z12 = this.f42936b.F() == z11;
        if (z11 && !this.f42876l.isRunning()) {
            this.f42877m.cancel();
            this.f42876l.start();
            if (z12) {
                this.f42876l.end();
                return;
            }
            return;
        }
        if (z11) {
            return;
        }
        this.f42876l.cancel();
        this.f42877m.start();
        if (z12) {
            this.f42877m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f42871g);
        valueAnimatorOfFloat.setDuration(this.f42869e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f42866a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f42872h);
        valueAnimatorOfFloat.setDuration(this.f42870f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f42868a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42876l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f42876l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f42877m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f42873i;
        if (editText != null) {
            return (editText.hasFocus() || this.f42938d.hasFocus()) && this.f42873i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f42873i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f42938d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f42938d.setScaleX(fFloatValue);
        fVar.f42938d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(@NonNull Editable editable) {
        if (this.f42936b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return zs.k.f128770e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return zs.f.f128681l;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f42875k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f42874j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f42875k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f42873i = editText;
        this.f42935a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z11) {
        if (this.f42936b.w() == null) {
            return;
        }
        A(z11);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f42873i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42867a.A(true);
                }
            });
        }
    }
}
