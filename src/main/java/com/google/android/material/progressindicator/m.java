package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class m extends i<ObjectAnimator> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f42560k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f42561l = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Property<m, Float> f42562m = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f42563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f42564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Interpolator[] f42565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f42566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f42569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f42570j;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f42567g = (mVar.f42567g + 1) % m.this.f42566f.f42486c.length;
            m.this.f42568h = true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            m.this.a();
            m mVar = m.this;
            androidx.vectordrawable.graphics.drawable.b bVar = mVar.f42570j;
            if (bVar != null) {
                bVar.b(mVar.f42542a);
            }
        }
    }

    class c extends Property<m, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(m mVar) {
            return Float.valueOf(mVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(m mVar, Float f11) {
            mVar.r(f11.floatValue());
        }
    }

    public m(@NonNull Context context, @NonNull n nVar) {
        super(2);
        this.f42567g = 0;
        this.f42570j = null;
        this.f42566f = nVar;
        this.f42565e = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.a(context, zs.a.f128543a), androidx.vectordrawable.graphics.drawable.d.a(context, zs.a.f128544b), androidx.vectordrawable.graphics.drawable.d.a(context, zs.a.f128545c), androidx.vectordrawable.graphics.drawable.d.a(context, zs.a.f128546d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f42569i;
    }

    private void o() {
        if (this.f42563c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f42562m, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f42563c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f42563c.setInterpolator(null);
            this.f42563c.setRepeatCount(-1);
            this.f42563c.addListener(new a());
        }
        if (this.f42564d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f42562m, 1.0f);
            this.f42564d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f42564d.setInterpolator(null);
            this.f42564d.addListener(new b());
        }
    }

    private void p() {
        if (this.f42568h) {
            Iterator<h.a> it = this.f42543b.iterator();
            while (it.hasNext()) {
                it.next().f42540c = this.f42566f.f42486c[this.f42567g];
            }
            this.f42568h = false;
        }
    }

    private void s(int i11) {
        for (int i12 = 0; i12 < this.f42543b.size(); i12++) {
            h.a aVar = this.f42543b.get(i12);
            int[] iArr = f42561l;
            int i13 = i12 * 2;
            int i14 = iArr[i13];
            int[] iArr2 = f42560k;
            aVar.f42538a = o5.a.a(this.f42565e[i13].getInterpolation(b(i11, i14, iArr2[i13])), BitmapDescriptorFactory.HUE_RED, 1.0f);
            int i15 = i13 + 1;
            aVar.f42539b = o5.a.a(this.f42565e[i15].getInterpolation(b(i11, iArr[i15], iArr2[i15])), BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f42563c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(@NonNull androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f42570j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
        ObjectAnimator objectAnimator = this.f42564d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f42542a.isVisible()) {
            this.f42564d.setFloatValues(this.f42569i, 1.0f);
            this.f42564d.setDuration((long) ((1.0f - this.f42569i) * 1800.0f));
            this.f42564d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f42563c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f42570j = null;
    }

    void q() {
        this.f42567g = 0;
        Iterator<h.a> it = this.f42543b.iterator();
        while (it.hasNext()) {
            it.next().f42540c = this.f42566f.f42486c[0];
        }
    }

    void r(float f11) {
        this.f42569i = f11;
        s((int) (f11 * 1800.0f));
        p();
        this.f42542a.invalidateSelf();
    }
}
