package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
abstract class g extends Drawable implements Animatable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property<g, Float> f42520o = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f42521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f42522b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueAnimator f42524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f42525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f42529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f42530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f42532l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42534n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Paint f42533m = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ot.a f42523c = new ot.a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f11) {
            gVar.n(f11.floatValue());
        }
    }

    g(@NonNull Context context, @NonNull com.google.android.material.progressindicator.b bVar) {
        this.f42521a = context;
        this.f42522b = bVar;
        setAlpha(255);
    }

    private void d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f42531k;
        this.f42531k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f42531k = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f42530j;
        if (bVar != null) {
            bVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f42529i;
        if (list == null || this.f42531k) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f42530j;
        if (bVar != null) {
            bVar.c(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f42529i;
        if (list == null || this.f42531k) {
            return;
        }
        Iterator<androidx.vectordrawable.graphics.drawable.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    private void g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f42531k;
        this.f42531k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f42531k = z11;
    }

    private void l() {
        if (this.f42524d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f42520o, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f42524d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f42524d.setInterpolator(at.b.f14973b);
            p(this.f42524d);
        }
        if (this.f42525e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f42520o, 1.0f, BitmapDescriptorFactory.HUE_RED);
            this.f42525e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f42525e.setInterpolator(at.b.f14973b);
            o(this.f42525e);
        }
    }

    private void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f42525e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f42525e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void p(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f42524d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f42524d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f42534n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f42522b.b() || this.f42522b.a()) {
            return (this.f42527g || this.f42526f) ? this.f42528h : this.f42532l;
        }
        return 1.0f;
    }

    public boolean i() {
        return q(false, false, false);
    }

    public boolean isRunning() {
        return k() || j();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f42525e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f42527g;
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f42524d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f42526f;
    }

    public void m(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f42529i == null) {
            this.f42529i = new ArrayList();
        }
        if (this.f42529i.contains(bVar)) {
            return;
        }
        this.f42529i.add(bVar);
    }

    void n(float f11) {
        if (this.f42532l != f11) {
            this.f42532l = f11;
            invalidateSelf();
        }
    }

    public boolean q(boolean z11, boolean z12, boolean z13) {
        return r(z11, z12, z13 && this.f42523c.a(this.f42521a.getContentResolver()) > BitmapDescriptorFactory.HUE_RED);
    }

    boolean r(boolean z11, boolean z12, boolean z13) {
        l();
        if (!isVisible() && !z11) {
            return false;
        }
        ValueAnimator valueAnimator = z11 ? this.f42524d : this.f42525e;
        ValueAnimator valueAnimator2 = z11 ? this.f42525e : this.f42524d;
        if (!z13) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z11, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z14 = !z11 || super.setVisible(z11, false);
        if (!(z11 ? this.f42522b.b() : this.f42522b.a())) {
            g(valueAnimator);
            return z14;
        }
        if (z12 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z14;
        }
        valueAnimator.resume();
        return z14;
    }

    public boolean s(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f42529i;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f42529i.remove(bVar);
        if (!this.f42529i.isEmpty()) {
            return true;
        }
        this.f42529i = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f42534n = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f42533m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return q(z11, z12, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }
}
