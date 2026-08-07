package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class l extends i<ObjectAnimator> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property<l, Float> f42552i = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f42553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i7.b f42554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f42555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42558h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f42556f = (lVar.f42556f + 1) % l.this.f42555e.f42486c.length;
            l.this.f42557g = true;
        }
    }

    class b extends Property<l, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(l lVar) {
            return Float.valueOf(lVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(l lVar, Float f11) {
            lVar.r(f11.floatValue());
        }
    }

    public l(@NonNull n nVar) {
        super(3);
        this.f42556f = 1;
        this.f42555e = nVar;
        this.f42554d = new i7.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f42558h;
    }

    private void o() {
        if (this.f42553c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f42552i, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f42553c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f42553c.setInterpolator(null);
            this.f42553c.setRepeatCount(-1);
            this.f42553c.addListener(new a());
        }
    }

    private void p() {
        if (!this.f42557g || this.f42543b.get(1).f42539b >= 1.0f) {
            return;
        }
        this.f42543b.get(2).f42540c = this.f42543b.get(1).f42540c;
        this.f42543b.get(1).f42540c = this.f42543b.get(0).f42540c;
        this.f42543b.get(0).f42540c = this.f42555e.f42486c[this.f42556f];
        this.f42557g = false;
    }

    private void s(int i11) {
        this.f42543b.get(0).f42538a = BitmapDescriptorFactory.HUE_RED;
        float fB = b(i11, 0, 667);
        h.a aVar = this.f42543b.get(0);
        h.a aVar2 = this.f42543b.get(1);
        float interpolation = this.f42554d.getInterpolation(fB);
        aVar2.f42538a = interpolation;
        aVar.f42539b = interpolation;
        h.a aVar3 = this.f42543b.get(1);
        h.a aVar4 = this.f42543b.get(2);
        float interpolation2 = this.f42554d.getInterpolation(fB + 0.49925038f);
        aVar4.f42538a = interpolation2;
        aVar3.f42539b = interpolation2;
        this.f42543b.get(2).f42539b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f42553c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f42553c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
    }

    void q() {
        this.f42557g = true;
        this.f42556f = 1;
        for (h.a aVar : this.f42543b) {
            com.google.android.material.progressindicator.b bVar = this.f42555e;
            aVar.f42540c = bVar.f42486c[0];
            aVar.f42541d = bVar.f42490g / 2;
        }
    }

    void r(float f11) {
        this.f42558h = f11;
        s((int) (f11 * 333.0f));
        p();
        this.f42542a.invalidateSelf();
    }
}
