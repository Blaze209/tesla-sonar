package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class w {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.ui.d f12945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f12946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f12947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f12948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f12949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f12950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f12951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f12952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f12953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f12954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f12955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f12956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f12957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f12958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f12959o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f12960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f12961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f12962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f12963s = new Runnable() { // from class: androidx.media3.ui.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f12932a.Y();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f12964t = new Runnable() { // from class: androidx.media3.ui.p
        @Override // java.lang.Runnable
        public final void run() {
            this.f12938a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f12965u = new Runnable() { // from class: androidx.media3.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f12939a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f12966v = new Runnable() { // from class: androidx.media3.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f12940a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f12967w = new Runnable() { // from class: androidx.media3.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f12941a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f12968x = new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.t
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f12942a.N(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f12970z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<View> f12969y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f12946b != null) {
                w.this.f12946b.setVisibility(4);
            }
            if (w.this.f12947c != null) {
                w.this.f12947c.setVisibility(4);
            }
            if (w.this.f12949e != null) {
                w.this.f12949e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(w.this.f12954j instanceof DefaultTimeBar) || w.this.A) {
                return;
            }
            ((DefaultTimeBar) w.this.f12954j).g(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f12946b != null) {
                w.this.f12946b.setVisibility(0);
            }
            if (w.this.f12947c != null) {
                w.this.f12947c.setVisibility(0);
            }
            if (w.this.f12949e != null) {
                w.this.f12949e.setVisibility(w.this.A ? 0 : 4);
            }
            if (!(w.this.f12954j instanceof DefaultTimeBar) || w.this.A) {
                return;
            }
            ((DefaultTimeBar) w.this.f12954j).r(250L);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f12973a;

        c(androidx.media3.ui.d dVar) {
            this.f12973a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(1);
            if (w.this.B) {
                this.f12973a.post(w.this.f12963s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f12975a;

        d(androidx.media3.ui.d dVar) {
            this.f12975a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.f12975a.post(w.this.f12963s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.ui.d f12977a;

        e(androidx.media3.ui.d dVar) {
            this.f12977a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(2);
            if (w.this.B) {
                this.f12977a.post(w.this.f12963s);
                w.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            w.this.V(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f12950f != null) {
                w.this.f12950f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f12952h != null) {
                w.this.f12952h.setVisibility(0);
                w.this.f12952h.setTranslationX(w.this.f12952h.getWidth());
                w.this.f12952h.scrollTo(w.this.f12952h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (w.this.f12952h != null) {
                w.this.f12952h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (w.this.f12950f != null) {
                w.this.f12950f.setVisibility(0);
            }
        }
    }

    public w(androidx.media3.ui.d dVar) {
        this.f12945a = dVar;
        this.f12946b = dVar.findViewById(ia.t.f77241l);
        this.f12947c = (ViewGroup) dVar.findViewById(ia.t.f77236g);
        this.f12949e = (ViewGroup) dVar.findViewById(ia.t.f77252w);
        ViewGroup viewGroup = (ViewGroup) dVar.findViewById(ia.t.f77234e);
        this.f12948d = viewGroup;
        this.f12953i = (ViewGroup) dVar.findViewById(ia.t.U);
        View viewFindViewById = dVar.findViewById(ia.t.I);
        this.f12954j = viewFindViewById;
        this.f12950f = (ViewGroup) dVar.findViewById(ia.t.f77233d);
        this.f12951g = (ViewGroup) dVar.findViewById(ia.t.f77244o);
        this.f12952h = (ViewGroup) dVar.findViewById(ia.t.f77245p);
        View viewFindViewById2 = dVar.findViewById(ia.t.A);
        this.f12955k = viewFindViewById2;
        View viewFindViewById3 = dVar.findViewById(ia.t.f77255z);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12943a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12943a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.d(this.f12944a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.f(this.f12933a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = dVar.getResources();
        float dimension = resources.getDimension(ia.q.f77200b) - resources.getDimension(ia.q.f77201c);
        float dimension2 = resources.getDimension(ia.q.f77200b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12956l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(dVar));
        animatorSet.play(valueAnimatorOfFloat).with(J(BitmapDescriptorFactory.HUE_RED, dimension, viewFindViewById)).with(J(BitmapDescriptorFactory.HUE_RED, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f12957m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(dVar));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f12958n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(dVar));
        animatorSet3.play(valueAnimatorOfFloat).with(J(BitmapDescriptorFactory.HUE_RED, dimension2, viewFindViewById)).with(J(BitmapDescriptorFactory.HUE_RED, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f12959o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(J(dimension, BitmapDescriptorFactory.HUE_RED, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f12960p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(J(dimension2, BitmapDescriptorFactory.HUE_RED, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f12961q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.a(this.f12936a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f12962r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.l(this.f12937a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f12958n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f12956l.start();
        Q(this.f12965u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f12957m.start();
    }

    private static ObjectAnimator J(float f11, float f12, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zA0 = a0();
        if (this.A != zA0) {
            this.A = zA0;
            view.post(new Runnable() { // from class: androidx.media3.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12934a.Z();
                }
            });
        }
        boolean z11 = i13 - i11 != i17 - i15;
        if (this.A || !z11) {
            return;
        }
        view.post(new Runnable() { // from class: androidx.media3.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f12935a.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i11;
        if (this.f12950f == null || this.f12951g == null) {
            return;
        }
        int width = (this.f12945a.getWidth() - this.f12945a.getPaddingLeft()) - this.f12945a.getPaddingRight();
        while (true) {
            if (this.f12951g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f12951g.getChildCount() - 2;
            View childAt = this.f12951g.getChildAt(childCount);
            this.f12951g.removeViewAt(childCount);
            this.f12950f.addView(childAt, 0);
        }
        View view = this.f12955k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f12953i);
        int childCount2 = this.f12950f.getChildCount() - 1;
        for (int i12 = 0; i12 < childCount2; i12++) {
            iB += B(this.f12950f.getChildAt(i12));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f12952h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f12962r.isStarted()) {
                return;
            }
            this.f12961q.cancel();
            this.f12962r.start();
            return;
        }
        View view2 = this.f12955k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f12955k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = this.f12950f.getChildAt(i13);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f12950f.removeViews(0, arrayList.size());
        for (i11 = 0; i11 < arrayList.size(); i11++) {
            this.f12951g.addView((View) arrayList.get(i11), this.f12951g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == ia.t.A) {
            this.f12961q.start();
        } else if (view.getId() == ia.t.f77255z) {
            this.f12962r.start();
        }
    }

    private void Q(Runnable runnable, long j11) {
        if (j11 >= 0) {
            this.f12945a.postDelayed(runnable, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i11) {
        int i12 = this.f12970z;
        this.f12970z = i11;
        if (i11 == 2) {
            this.f12945a.setVisibility(8);
        } else if (i12 == 2) {
            this.f12945a.setVisibility(0);
        }
        if (i12 != i11) {
            this.f12945a.o0();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        return id2 == ia.t.f77234e || id2 == ia.t.H || id2 == ia.t.f77254y || id2 == ia.t.L || id2 == ia.t.M || id2 == ia.t.f77246q || id2 == ia.t.f77247r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.C) {
            V(0);
            S();
            return;
        }
        int i11 = this.f12970z;
        if (i11 == 1) {
            this.f12959o.start();
        } else if (i11 == 2) {
            this.f12960p.start();
        } else if (i11 == 3) {
            this.B = true;
        } else if (i11 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup viewGroup = this.f12949e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f12954j != null) {
            int dimensionPixelSize = this.f12945a.getResources().getDimensionPixelSize(ia.q.f77202d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12954j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f12954j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f12954j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.A) {
                    defaultTimeBar.h(true);
                } else {
                    int i11 = this.f12970z;
                    if (i11 == 1) {
                        defaultTimeBar.h(false);
                    } else if (i11 != 3) {
                        defaultTimeBar.q();
                    }
                }
            }
        }
        for (View view2 : this.f12969y) {
            view2.setVisibility((this.A && W(view2)) ? 4 : 0);
        }
    }

    public static /* synthetic */ void a(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private boolean a0() {
        int width = (this.f12945a.getWidth() - this.f12945a.getPaddingLeft()) - this.f12945a.getPaddingRight();
        int height = (this.f12945a.getHeight() - this.f12945a.getPaddingBottom()) - this.f12945a.getPaddingTop();
        int iB = B(this.f12947c);
        ViewGroup viewGroup = this.f12947c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f12947c.getPaddingRight() : 0);
        int iZ = z(this.f12947c);
        ViewGroup viewGroup2 = this.f12947c;
        return width <= Math.max(paddingLeft, B(this.f12953i) + B(this.f12955k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f12947c.getPaddingBottom() : 0)) + (z(this.f12948d) * 2);
    }

    public static /* synthetic */ void d(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f12946b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f12947c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f12949e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void f(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = wVar.f12946b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = wVar.f12947c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = wVar.f12949e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void l(w wVar, ValueAnimator valueAnimator) {
        wVar.getClass();
        wVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f11) {
        ViewGroup viewGroup = this.f12952h;
        if (viewGroup != null) {
            this.f12952h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f11)));
        }
        ViewGroup viewGroup2 = this.f12953i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f11);
        }
        ViewGroup viewGroup3 = this.f12950f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f11);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f12969y.contains(view);
    }

    public void C() {
        int i11 = this.f12970z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        R();
        if (!this.C) {
            E();
        } else if (this.f12970z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i11 = this.f12970z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f12970z == 0 && this.f12945a.n0();
    }

    public void K() {
        this.f12945a.addOnLayoutChangeListener(this.f12968x);
    }

    public void L() {
        this.f12945a.removeOnLayoutChangeListener(this.f12968x);
    }

    public void M(boolean z11, int i11, int i12, int i13, int i14) {
        View view = this.f12946b;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    public void R() {
        this.f12945a.removeCallbacks(this.f12967w);
        this.f12945a.removeCallbacks(this.f12964t);
        this.f12945a.removeCallbacks(this.f12966v);
        this.f12945a.removeCallbacks(this.f12965u);
    }

    public void S() {
        if (this.f12970z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f12945a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                Q(this.f12967w, showTimeoutMs);
            } else if (this.f12970z == 1) {
                Q(this.f12965u, 2000L);
            } else {
                Q(this.f12966v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z11) {
        this.C = z11;
    }

    public void U(View view, boolean z11) {
        if (view == null) {
            return;
        }
        if (!z11) {
            view.setVisibility(8);
            this.f12969y.remove(view);
            return;
        }
        if (this.A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f12969y.add(view);
    }

    public void X() {
        if (!this.f12945a.n0()) {
            this.f12945a.setVisibility(0);
            this.f12945a.w0();
            this.f12945a.t0();
        }
        Y();
    }
}
