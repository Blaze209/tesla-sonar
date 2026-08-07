package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.u;
import java.util.ArrayList;
import java.util.Iterator;
import st.n;

/* JADX INFO: loaded from: classes5.dex */
class d {
    static final TimeInterpolator D = at.b.f14974c;
    private static final int E = zs.c.X;
    private static final int F = zs.c.f128570h0;
    private static final int G = zs.c.Y;
    private static final int H = zs.c.f128566f0;
    static final int[] I = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] J = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] K = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] L = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] M = {R.attr.state_enabled};
    static final int[] N = new int[0];
    private ViewTreeObserver.OnPreDrawListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    st.k f42163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    st.g f42164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f42165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.c f42166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f42167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f42168f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f42170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f42171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f42172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f42173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private final u f42174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animator f42175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private at.i f42176n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private at.i f42177o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f42178p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42180r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f42182t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f42183u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<j> f42184v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final FloatingActionButton f42185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final rt.b f42186x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f42169g = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f42179q = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42181s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Rect f42187y = new Rect();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f42188z = new RectF();
    private final RectF A = new RectF();
    private final Matrix B = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f42190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f42191c;

        a(boolean z11, k kVar) {
            this.f42190b = z11;
            this.f42191c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f42189a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f42181s = 0;
            d.this.f42175m = null;
            if (this.f42189a) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f42185w;
            boolean z11 = this.f42190b;
            floatingActionButton.b(z11 ? 8 : 4, z11);
            k kVar = this.f42191c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f42185w.b(0, this.f42190b);
            d.this.f42181s = 1;
            d.this.f42175m = animator;
            this.f42189a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f42194b;

        b(boolean z11, k kVar) {
            this.f42193a = z11;
            this.f42194b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f42181s = 0;
            d.this.f42175m = null;
            k kVar = this.f42194b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f42185w.b(0, this.f42193a);
            d.this.f42181s = 2;
            d.this.f42175m = animator;
        }
    }

    class c extends at.h {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f11, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            d.this.f42179q = f11;
            return super.evaluate(f11, matrix, matrix2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0665d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f42197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f42198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f42199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f42200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f42201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f42202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f42203g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Matrix f42204h;

        C0665d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, Matrix matrix) {
            this.f42197a = f11;
            this.f42198b = f12;
            this.f42199c = f13;
            this.f42200d = f14;
            this.f42201e = f15;
            this.f42202f = f16;
            this.f42203g = f17;
            this.f42204h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f42185w.setAlpha(at.b.b(this.f42197a, this.f42198b, BitmapDescriptorFactory.HUE_RED, 0.2f, fFloatValue));
            d.this.f42185w.setScaleX(at.b.a(this.f42199c, this.f42200d, fFloatValue));
            d.this.f42185w.setScaleY(at.b.a(this.f42201e, this.f42200d, fFloatValue));
            d.this.f42179q = at.b.a(this.f42202f, this.f42203g, fFloatValue);
            d.this.h(at.b.a(this.f42202f, this.f42203g, fFloatValue), this.f42204h);
            d.this.f42185w.setImageMatrix(this.f42204h);
        }
    }

    class e implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        FloatEvaluator f42206a = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f11, Float f12, Float f13) {
            float fFloatValue = this.f42206a.evaluate(f11, (Number) f12, (Number) f13).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = BitmapDescriptorFactory.HUE_RED;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.H();
            return true;
        }
    }

    private class g extends m {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    private class h extends m {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f42170h + dVar.f42171i;
        }
    }

    private class i extends m {
        i() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            d dVar = d.this;
            return dVar.f42170h + dVar.f42172j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    private class l extends m {
        l() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        protected float a() {
            return d.this.f42170h;
        }
    }

    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f42214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f42215c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.g0((int) this.f42215c);
            this.f42213a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f42213a) {
                st.g gVar = d.this.f42164b;
                this.f42214b = gVar == null ? BitmapDescriptorFactory.HUE_RED : gVar.w();
                this.f42215c = a();
                this.f42213a = true;
            }
            d dVar = d.this;
            float f11 = this.f42214b;
            dVar.g0((int) (f11 + ((this.f42215c - f11) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, rt.b bVar) {
        this.f42185w = floatingActionButton;
        this.f42186x = bVar;
        u uVar = new u();
        this.f42174l = uVar;
        uVar.a(I, k(new i()));
        uVar.a(J, k(new h()));
        uVar.a(K, k(new h()));
        uVar.a(L, k(new h()));
        uVar.a(M, k(new l()));
        uVar.a(N, k(new g()));
        this.f42178p = floatingActionButton.getRotation();
    }

    private boolean a0() {
        return ViewCompat.U(this.f42185w) && !this.f42185w.isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f11, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f42185w.getDrawable();
        if (drawable == null || this.f42180r == 0) {
            return;
        }
        RectF rectF = this.f42188z;
        RectF rectF2 = this.A;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i11 = this.f42180r;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, i11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i12 = this.f42180r;
        matrix.postScale(f11, f11, i12 / 2.0f, i12 / 2.0f);
    }

    private void h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    @NonNull
    private AnimatorSet i(@NonNull at.i iVar, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f42185w, (Property<FloatingActionButton, Float>) View.ALPHA, f11);
        iVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f42185w, (Property<FloatingActionButton, Float>) View.SCALE_X, f12);
        iVar.h("scale").a(objectAnimatorOfFloat2);
        h0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f42185w, (Property<FloatingActionButton, Float>) View.SCALE_Y, f12);
        iVar.h("scale").a(objectAnimatorOfFloat3);
        h0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f13, this.B);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f42185w, new at.g(), new c(), new Matrix(this.B));
        iVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        at.c.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f11, float f12, float f13, int i11, int i12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0665d(this.f42185w.getAlpha(), f11, this.f42185w.getScaleX(), f12, this.f42185w.getScaleY(), this.f42179q, f13, new Matrix(this.B)));
        arrayList.add(valueAnimatorOfFloat);
        at.c.a(animatorSet, arrayList);
        animatorSet.setDuration(nt.i.f(this.f42185w.getContext(), i11, this.f42185w.getContext().getResources().getInteger(zs.h.f128737b)));
        animatorSet.setInterpolator(nt.i.g(this.f42185w.getContext(), i12, at.b.f14973b));
        return animatorSet;
    }

    @NonNull
    private ValueAnimator k(@NonNull m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        return valueAnimator;
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.C == null) {
            this.C = new f();
        }
        return this.C;
    }

    void A() {
        throw null;
    }

    void B() {
        st.g gVar = this.f42164b;
        if (gVar != null) {
            st.h.f(this.f42185w, gVar);
        }
        if (K()) {
            this.f42185w.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }

    void C() {
        throw null;
    }

    void D() {
        ViewTreeObserver viewTreeObserver = this.f42185w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.C;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.C = null;
        }
    }

    void E(int[] iArr) {
        throw null;
    }

    void F(float f11, float f12, float f13) {
        throw null;
    }

    void G(@NonNull Rect rect) {
        u5.h.h(this.f42167e, "Didn't initialize content background");
        if (!Z()) {
            this.f42186x.b(this.f42167e);
        } else {
            this.f42186x.b(new InsetDrawable(this.f42167e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void H() {
        float rotation = this.f42185w.getRotation();
        if (this.f42178p != rotation) {
            this.f42178p = rotation;
            d0();
        }
    }

    void I() {
        ArrayList<j> arrayList = this.f42184v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void J() {
        ArrayList<j> arrayList = this.f42184v;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    boolean K() {
        throw null;
    }

    void L(ColorStateList colorStateList) {
        st.g gVar = this.f42164b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f42166d;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    void M(PorterDuff.Mode mode) {
        st.g gVar = this.f42164b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void N(float f11) {
        if (this.f42170h != f11) {
            this.f42170h = f11;
            F(f11, this.f42171i, this.f42172j);
        }
    }

    void O(boolean z11) {
        this.f42168f = z11;
    }

    final void P(at.i iVar) {
        this.f42177o = iVar;
    }

    final void Q(float f11) {
        if (this.f42171i != f11) {
            this.f42171i = f11;
            F(this.f42170h, f11, this.f42172j);
        }
    }

    final void R(float f11) {
        this.f42179q = f11;
        Matrix matrix = this.B;
        h(f11, matrix);
        this.f42185w.setImageMatrix(matrix);
    }

    final void S(int i11) {
        if (this.f42180r != i11) {
            this.f42180r = i11;
            e0();
        }
    }

    void T(int i11) {
        this.f42173k = i11;
    }

    final void U(float f11) {
        if (this.f42172j != f11) {
            this.f42172j = f11;
            F(this.f42170h, this.f42171i, f11);
        }
    }

    void V(ColorStateList colorStateList) {
        Drawable drawable = this.f42165c;
        if (drawable != null) {
            l5.a.o(drawable, qt.b.d(colorStateList));
        }
    }

    void W(boolean z11) {
        this.f42169g = z11;
        f0();
    }

    final void X(@NonNull st.k kVar) {
        this.f42163a = kVar;
        st.g gVar = this.f42164b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f42165c;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f42166d;
        if (cVar != null) {
            cVar.f(kVar);
        }
    }

    final void Y(at.i iVar) {
        this.f42176n = iVar;
    }

    boolean Z() {
        throw null;
    }

    final boolean b0() {
        return !this.f42168f || this.f42185w.getSizeDimension() >= this.f42173k;
    }

    void c0(k kVar, boolean z11) {
        AnimatorSet animatorSetJ;
        d dVar;
        if (z()) {
            return;
        }
        Animator animator = this.f42175m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z12 = this.f42176n == null;
        if (!a0()) {
            this.f42185w.b(0, z11);
            this.f42185w.setAlpha(1.0f);
            this.f42185w.setScaleY(1.0f);
            this.f42185w.setScaleX(1.0f);
            R(1.0f);
            if (kVar != null) {
                kVar.a();
                return;
            }
            return;
        }
        if (this.f42185w.getVisibility() != 0) {
            FloatingActionButton floatingActionButton = this.f42185w;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            floatingActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f42185w.setScaleY(z12 ? 0.4f : 0.0f);
            this.f42185w.setScaleX(z12 ? 0.4f : 0.0f);
            if (z12) {
                f11 = 0.4f;
            }
            R(f11);
        }
        at.i iVar = this.f42176n;
        if (iVar != null) {
            animatorSetJ = i(iVar, 1.0f, 1.0f, 1.0f);
            dVar = this;
        } else {
            animatorSetJ = j(1.0f, 1.0f, 1.0f, E, F);
            dVar = this;
        }
        animatorSetJ.addListener(new b(z11, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = dVar.f42182t;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener(it.next());
            }
        }
        animatorSetJ.start();
    }

    void d0() {
        throw null;
    }

    public void e(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f42183u == null) {
            this.f42183u = new ArrayList<>();
        }
        this.f42183u.add(animatorListener);
    }

    final void e0() {
        R(this.f42179q);
    }

    void f(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.f42182t == null) {
            this.f42182t = new ArrayList<>();
        }
        this.f42182t.add(animatorListener);
    }

    final void f0() {
        Rect rect = this.f42187y;
        r(rect);
        G(rect);
        this.f42186x.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void g(@NonNull j jVar) {
        if (this.f42184v == null) {
            this.f42184v = new ArrayList<>();
        }
        this.f42184v.add(jVar);
    }

    void g0(float f11) {
        st.g gVar = this.f42164b;
        if (gVar != null) {
            gVar.a0(f11);
        }
    }

    final Drawable l() {
        return this.f42167e;
    }

    float m() {
        throw null;
    }

    boolean n() {
        return this.f42168f;
    }

    final at.i o() {
        return this.f42177o;
    }

    float p() {
        return this.f42171i;
    }

    void r(@NonNull Rect rect) {
        int iV = v();
        float fM = this.f42169g ? m() + this.f42172j : BitmapDescriptorFactory.HUE_RED;
        int iMax = Math.max(iV, (int) Math.ceil(fM));
        int iMax2 = Math.max(iV, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float s() {
        return this.f42172j;
    }

    final st.k t() {
        return this.f42163a;
    }

    final at.i u() {
        return this.f42176n;
    }

    int v() {
        if (this.f42168f) {
            return Math.max((this.f42173k - this.f42185w.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void w(k kVar, boolean z11) {
        d dVar;
        AnimatorSet animatorSetJ;
        if (y()) {
            return;
        }
        Animator animator = this.f42175m;
        if (animator != null) {
            animator.cancel();
        }
        if (!a0()) {
            this.f42185w.b(z11 ? 8 : 4, z11);
            if (kVar != null) {
                kVar.b();
                return;
            }
            return;
        }
        at.i iVar = this.f42177o;
        if (iVar != null) {
            animatorSetJ = i(iVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            dVar = this;
        } else {
            dVar = this;
            animatorSetJ = dVar.j(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f, G, H);
        }
        animatorSetJ.addListener(new a(z11, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = dVar.f42183u;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetJ.addListener(it.next());
            }
        }
        animatorSetJ.start();
    }

    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i11) {
        throw null;
    }

    boolean y() {
        if (this.f42185w.getVisibility() == 0) {
            return this.f42181s == 1;
        }
        return this.f42181s != 2;
    }

    boolean z() {
        if (this.f42185w.getVisibility() != 0) {
            return this.f42181s == 2;
        }
        return this.f42181s != 1;
    }
}
