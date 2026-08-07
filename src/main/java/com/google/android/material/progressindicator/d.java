package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class d extends i<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f42496k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f42497l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f42498m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property<d, Float> f42499n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property<d, Float> f42500o = new C0670d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f42501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f42502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i7.b f42503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f42504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f42506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42507i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f42508j;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f42505g = (dVar.f42505g + 4) % d.this.f42504f.f42486c.length;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f42508j;
            if (bVar != null) {
                bVar.b(dVar.f42542a);
            }
        }
    }

    class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f11) {
            dVar.t(f11.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$d, reason: collision with other inner class name */
    class C0670d extends Property<d, Float> {
        C0670d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f11) {
            dVar.u(f11.floatValue());
        }
    }

    public d(@NonNull e eVar) {
        super(1);
        this.f42505g = 0;
        this.f42508j = null;
        this.f42504f = eVar;
        this.f42503e = new i7.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f42506h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f42507i;
    }

    private void q() {
        if (this.f42501c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f42499n, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f42501c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f42501c.setInterpolator(null);
            this.f42501c.setRepeatCount(-1);
            this.f42501c.addListener(new a());
        }
        if (this.f42502d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f42500o, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f42502d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f42502d.setInterpolator(this.f42503e);
            this.f42502d.addListener(new b());
        }
    }

    private void r(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            float fB = b(i11, f42498m[i12], 333);
            if (fB >= BitmapDescriptorFactory.HUE_RED && fB <= 1.0f) {
                int i13 = i12 + this.f42505g;
                int[] iArr = this.f42504f.f42486c;
                int length = i13 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i14 = iArr[length];
                int i15 = iArr[length2];
                this.f42543b.get(0).f42540c = at.d.b().evaluate(this.f42503e.getInterpolation(fB), Integer.valueOf(i14), Integer.valueOf(i15)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f11) {
        this.f42507i = f11;
    }

    private void v(int i11) {
        h.a aVar = this.f42543b.get(0);
        float f11 = this.f42506h;
        aVar.f42538a = (f11 * 1520.0f) - 20.0f;
        aVar.f42539b = f11 * 1520.0f;
        for (int i12 = 0; i12 < 4; i12++) {
            aVar.f42539b += this.f42503e.getInterpolation(b(i11, f42496k[i12], 667)) * 250.0f;
            aVar.f42538a += this.f42503e.getInterpolation(b(i11, f42497l[i12], 667)) * 250.0f;
        }
        float f12 = aVar.f42538a;
        float f13 = aVar.f42539b;
        aVar.f42538a = (f12 + ((f13 - f12) * this.f42507i)) / 360.0f;
        aVar.f42539b = f13 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f42501c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f42508j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f42502d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f42542a.isVisible()) {
            this.f42502d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f42501c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f42508j = null;
    }

    void s() {
        this.f42505g = 0;
        this.f42543b.get(0).f42540c = this.f42504f.f42486c[0];
        this.f42507i = BitmapDescriptorFactory.HUE_RED;
    }

    void t(float f11) {
        this.f42506h = f11;
        int i11 = (int) (f11 * 5400.0f);
        v(i11);
        r(i11);
        this.f42542a.invalidateSelf();
    }
}
