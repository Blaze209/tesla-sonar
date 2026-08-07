package com.google.android.exoplayer2.ui;

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

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class z {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.g f40979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f40980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f40981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f40982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f40983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f40984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f40985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f40986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f40987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f40988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f40989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f40990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f40991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f40992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f40993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f40994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f40995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f40996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f40997s = new Runnable() { // from class: com.google.android.exoplayer2.ui.m
        @Override // java.lang.Runnable
        public final void run() {
            this.f40966a.Y();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f40998t = new Runnable() { // from class: com.google.android.exoplayer2.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f40972a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f40999u = new Runnable() { // from class: com.google.android.exoplayer2.ui.t
        @Override // java.lang.Runnable
        public final void run() {
            this.f40973a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f41000v = new Runnable() { // from class: com.google.android.exoplayer2.ui.u
        @Override // java.lang.Runnable
        public final void run() {
            this.f40974a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f41001w = new Runnable() { // from class: com.google.android.exoplayer2.ui.v
        @Override // java.lang.Runnable
        public final void run() {
            this.f40975a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f41002x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.w
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f40976a.N(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f41004z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<View> f41003y = new ArrayList();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (z.this.f40980b != null) {
                z.this.f40980b.setVisibility(4);
            }
            if (z.this.f40981c != null) {
                z.this.f40981c.setVisibility(4);
            }
            if (z.this.f40983e != null) {
                z.this.f40983e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(z.this.f40988j instanceof com.google.android.exoplayer2.ui.b) || z.this.A) {
                return;
            }
            ((com.google.android.exoplayer2.ui.b) z.this.f40988j).g(250L);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (z.this.f40980b != null) {
                z.this.f40980b.setVisibility(0);
            }
            if (z.this.f40981c != null) {
                z.this.f40981c.setVisibility(0);
            }
            if (z.this.f40983e != null) {
                z.this.f40983e.setVisibility(z.this.A ? 0 : 4);
            }
            if (!(z.this.f40988j instanceof com.google.android.exoplayer2.ui.b) || z.this.A) {
                return;
            }
            ((com.google.android.exoplayer2.ui.b) z.this.f40988j).r(250L);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.ui.g f41007a;

        c(com.google.android.exoplayer2.ui.g gVar) {
            this.f41007a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.V(1);
            if (z.this.B) {
                this.f41007a.post(z.this.f40997s);
                z.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.V(3);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.ui.g f41009a;

        d(com.google.android.exoplayer2.ui.g gVar) {
            this.f41009a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.V(2);
            if (z.this.B) {
                this.f41009a.post(z.this.f40997s);
                z.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.V(3);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.ui.g f41011a;

        e(com.google.android.exoplayer2.ui.g gVar) {
            this.f41011a = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.V(2);
            if (z.this.B) {
                this.f41011a.post(z.this.f40997s);
                z.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.V(3);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.V(4);
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            z.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            z.this.V(4);
        }
    }

    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (z.this.f40984f != null) {
                z.this.f40984f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (z.this.f40986h != null) {
                z.this.f40986h.setVisibility(0);
                z.this.f40986h.setTranslationX(z.this.f40986h.getWidth());
                z.this.f40986h.scrollTo(z.this.f40986h.getWidth(), 0);
            }
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (z.this.f40986h != null) {
                z.this.f40986h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (z.this.f40984f != null) {
                z.this.f40984f.setVisibility(0);
            }
        }
    }

    public z(com.google.android.exoplayer2.ui.g gVar) {
        this.f40979a = gVar;
        this.f40980b = gVar.findViewById(rs.k.f109116l);
        this.f40981c = (ViewGroup) gVar.findViewById(rs.k.f109111g);
        this.f40983e = (ViewGroup) gVar.findViewById(rs.k.f109126v);
        ViewGroup viewGroup = (ViewGroup) gVar.findViewById(rs.k.f109109e);
        this.f40982d = viewGroup;
        this.f40987i = (ViewGroup) gVar.findViewById(rs.k.R);
        View viewFindViewById = gVar.findViewById(rs.k.F);
        this.f40988j = viewFindViewById;
        this.f40984f = (ViewGroup) gVar.findViewById(rs.k.f109108d);
        this.f40985g = (ViewGroup) gVar.findViewById(rs.k.f109119o);
        this.f40986h = (ViewGroup) gVar.findViewById(rs.k.f109120p);
        View viewFindViewById2 = gVar.findViewById(rs.k.f109130z);
        this.f40989k = viewFindViewById2;
        View viewFindViewById3 = gVar.findViewById(rs.k.f109129y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f40977a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f40977a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.y
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                z.d(this.f40978a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                z.g(this.f40967a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = gVar.getResources();
        float dimension = resources.getDimension(rs.h.f109087b) - resources.getDimension(rs.h.f109088c);
        float dimension2 = resources.getDimension(rs.h.f109087b);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f40990l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(gVar));
        animatorSet.play(valueAnimatorOfFloat).with(J(BitmapDescriptorFactory.HUE_RED, dimension, viewFindViewById)).with(J(BitmapDescriptorFactory.HUE_RED, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f40991m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(gVar));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f40992n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(gVar));
        animatorSet3.play(valueAnimatorOfFloat).with(J(BitmapDescriptorFactory.HUE_RED, dimension2, viewFindViewById)).with(J(BitmapDescriptorFactory.HUE_RED, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f40993o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(J(dimension, BitmapDescriptorFactory.HUE_RED, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f40994p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, BitmapDescriptorFactory.HUE_RED, viewFindViewById)).with(J(dimension2, BitmapDescriptorFactory.HUE_RED, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f40995q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                z.b(this.f40970a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f40996r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                z.m(this.f40971a, valueAnimator);
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
        this.f40992n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f40990l.start();
        Q(this.f40999u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f40991m.start();
    }

    private static ObjectAnimator J(float f11, float f12, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zA0 = a0();
        if (this.A != zA0) {
            this.A = zA0;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40968a.Z();
                }
            });
        }
        boolean z11 = i13 - i11 != i17 - i15;
        if (this.A || !z11) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f40969a.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i11;
        if (this.f40984f == null || this.f40985g == null) {
            return;
        }
        int width = (this.f40979a.getWidth() - this.f40979a.getPaddingLeft()) - this.f40979a.getPaddingRight();
        while (true) {
            if (this.f40985g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f40985g.getChildCount() - 2;
            View childAt = this.f40985g.getChildAt(childCount);
            this.f40985g.removeViewAt(childCount);
            this.f40984f.addView(childAt, 0);
        }
        View view = this.f40989k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f40987i);
        int childCount2 = this.f40984f.getChildCount() - 1;
        for (int i12 = 0; i12 < childCount2; i12++) {
            iB += B(this.f40984f.getChildAt(i12));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f40986h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f40996r.isStarted()) {
                return;
            }
            this.f40995q.cancel();
            this.f40996r.start();
            return;
        }
        View view2 = this.f40989k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f40989k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = this.f40984f.getChildAt(i13);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f40984f.removeViews(0, arrayList.size());
        for (i11 = 0; i11 < arrayList.size(); i11++) {
            this.f40985g.addView((View) arrayList.get(i11), this.f40985g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == rs.k.f109130z) {
            this.f40995q.start();
        } else if (view.getId() == rs.k.f109129y) {
            this.f40996r.start();
        }
    }

    private void Q(Runnable runnable, long j11) {
        if (j11 >= 0) {
            this.f40979a.postDelayed(runnable, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i11) {
        int i12 = this.f41004z;
        this.f41004z = i11;
        if (i11 == 2) {
            this.f40979a.setVisibility(8);
        } else if (i12 == 2) {
            this.f40979a.setVisibility(0);
        }
        if (i12 != i11) {
            this.f40979a.e0();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        return id2 == rs.k.f109109e || id2 == rs.k.E || id2 == rs.k.f109128x || id2 == rs.k.I || id2 == rs.k.J || id2 == rs.k.f109121q || id2 == rs.k.f109122r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.C) {
            V(0);
            S();
            return;
        }
        int i11 = this.f41004z;
        if (i11 == 1) {
            this.f40993o.start();
        } else if (i11 == 2) {
            this.f40994p.start();
        } else if (i11 == 3) {
            this.B = true;
        } else if (i11 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup viewGroup = this.f40983e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f40988j != null) {
            int dimensionPixelSize = this.f40979a.getResources().getDimensionPixelSize(rs.h.f109089d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40988j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f40988j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f40988j;
            if (view instanceof com.google.android.exoplayer2.ui.b) {
                com.google.android.exoplayer2.ui.b bVar = (com.google.android.exoplayer2.ui.b) view;
                if (this.A) {
                    bVar.h(true);
                } else {
                    int i11 = this.f41004z;
                    if (i11 == 1) {
                        bVar.h(false);
                    } else if (i11 != 3) {
                        bVar.q();
                    }
                }
            }
        }
        for (View view2 : this.f41003y) {
            view2.setVisibility((this.A && W(view2)) ? 4 : 0);
        }
    }

    private boolean a0() {
        int width = (this.f40979a.getWidth() - this.f40979a.getPaddingLeft()) - this.f40979a.getPaddingRight();
        int height = (this.f40979a.getHeight() - this.f40979a.getPaddingBottom()) - this.f40979a.getPaddingTop();
        int iB = B(this.f40981c);
        ViewGroup viewGroup = this.f40981c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f40981c.getPaddingRight() : 0);
        int iZ = z(this.f40981c);
        ViewGroup viewGroup2 = this.f40981c;
        return width <= Math.max(paddingLeft, B(this.f40987i) + B(this.f40989k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f40981c.getPaddingBottom() : 0)) + (z(this.f40982d) * 2);
    }

    public static /* synthetic */ void b(z zVar, ValueAnimator valueAnimator) {
        zVar.getClass();
        zVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void d(z zVar, ValueAnimator valueAnimator) {
        zVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = zVar.f40980b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = zVar.f40981c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = zVar.f40983e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void g(z zVar, ValueAnimator valueAnimator) {
        zVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = zVar.f40980b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = zVar.f40981c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = zVar.f40983e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void m(z zVar, ValueAnimator valueAnimator) {
        zVar.getClass();
        zVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f11) {
        ViewGroup viewGroup = this.f40986h;
        if (viewGroup != null) {
            this.f40986h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f11)));
        }
        ViewGroup viewGroup2 = this.f40987i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f11);
        }
        ViewGroup viewGroup3 = this.f40984f;
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
        return view != null && this.f41003y.contains(view);
    }

    public void C() {
        int i11 = this.f41004z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        R();
        if (!this.C) {
            E();
        } else if (this.f41004z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i11 = this.f41004z;
        if (i11 == 3 || i11 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f41004z == 0 && this.f40979a.d0();
    }

    public void K() {
        this.f40979a.addOnLayoutChangeListener(this.f41002x);
    }

    public void L() {
        this.f40979a.removeOnLayoutChangeListener(this.f41002x);
    }

    public void M(boolean z11, int i11, int i12, int i13, int i14) {
        View view = this.f40980b;
        if (view != null) {
            view.layout(0, 0, i13 - i11, i14 - i12);
        }
    }

    public void R() {
        this.f40979a.removeCallbacks(this.f41001w);
        this.f40979a.removeCallbacks(this.f40998t);
        this.f40979a.removeCallbacks(this.f41000v);
        this.f40979a.removeCallbacks(this.f40999u);
    }

    public void S() {
        if (this.f41004z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f40979a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                Q(this.f41001w, showTimeoutMs);
            } else if (this.f41004z == 1) {
                Q(this.f40999u, 2000L);
            } else {
                Q(this.f41000v, showTimeoutMs);
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
            this.f41003y.remove(view);
            return;
        }
        if (this.A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f41003y.add(view);
    }

    public void X() {
        if (!this.f40979a.d0()) {
            this.f40979a.setVisibility(0);
            this.f40979a.n0();
            this.f40979a.j0();
        }
        Y();
    }
}
