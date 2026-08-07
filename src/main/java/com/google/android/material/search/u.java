package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.d0;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SearchView f42659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f42660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClippableRoundedCornerLayout f42661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FrameLayout f42662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f42663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Toolbar f42664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Toolbar f42665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextView f42666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EditText f42667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageButton f42668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f42669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TouchObserverFrameLayout f42670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final nt.g f42671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AnimatorSet f42672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SearchBar f42673o;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f42661c.setVisibility(8);
            if (!u.this.f42659a.s()) {
                u.this.f42659a.p();
            }
            u.this.f42659a.setTransitionState(SearchView.d.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u.this.f42659a.setTransitionState(SearchView.d.HIDING);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f42661c.setVisibility(8);
            if (!u.this.f42659a.s()) {
                u.this.f42659a.p();
            }
            u.this.f42659a.setTransitionState(SearchView.d.HIDDEN);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u.this.f42659a.setTransitionState(SearchView.d.HIDING);
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42676a;

        c(boolean z11) {
            this.f42676a = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.P(this.f42676a ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            u.this.f42661c.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u.this.P(this.f42676a ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        }
    }

    u(SearchView searchView) {
        this.f42659a = searchView;
        this.f42660b = searchView.f42600a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f42601b;
        this.f42661c = clippableRoundedCornerLayout;
        this.f42662d = searchView.f42604e;
        this.f42663e = searchView.f42605f;
        this.f42664f = searchView.f42606g;
        this.f42665g = searchView.f42607h;
        this.f42666h = searchView.f42608i;
        this.f42667i = searchView.f42609j;
        this.f42668j = searchView.f42610k;
        this.f42669k = searchView.f42611l;
        this.f42670l = searchView.f42612m;
        this.f42671m = new nt.g(clippableRoundedCornerLayout);
    }

    private Animator A(boolean z11) {
        return K(z11, true, this.f42667i);
    }

    private AnimatorSet B(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f42672n == null) {
            animatorSet.playTogether(s(z11), t(z11));
        }
        animatorSet.playTogether(H(z11), G(z11), u(z11), w(z11), F(z11), z(z11), q(z11), A(z11), I(z11));
        animatorSet.addListener(new c(z11));
        return animatorSet;
    }

    private int C(View view) {
        int iA = androidx.core.view.n.a((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        return d0.m(this.f42673o) ? this.f42673o.getLeft() - iA : (this.f42673o.getRight() - this.f42659a.getWidth()) + iA;
    }

    private int D(View view) {
        int iB = androidx.core.view.n.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        int iF = ViewCompat.F(this.f42673o);
        return d0.m(this.f42673o) ? ((this.f42673o.getWidth() - this.f42673o.getRight()) + iB) - iF : (this.f42673o.getLeft() - iB) + iF;
    }

    private int E() {
        return ((this.f42673o.getTop() + this.f42673o.getBottom()) / 2) - ((this.f42663e.getTop() + this.f42663e.getBottom()) / 2);
    }

    private Animator F(boolean z11) {
        return K(z11, false, this.f42662d);
    }

    private Animator G(boolean z11) {
        Rect rectM = this.f42671m.m();
        Rect rectL = this.f42671m.l();
        if (rectM == null) {
            rectM = d0.d(this.f42659a);
        }
        if (rectL == null) {
            rectL = d0.c(this.f42661c, this.f42673o);
        }
        final Rect rect = new Rect(rectL);
        final float cornerSize = this.f42673o.getCornerSize();
        final float fMax = Math.max(this.f42661c.getCornerRadius(), this.f42671m.k());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.s(rect), rectL, rectM);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                u.b(this.f42649a, cornerSize, fMax, rect, valueAnimator);
            }
        });
        valueAnimatorOfObject.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        return valueAnimatorOfObject;
    }

    private Animator H(boolean z11) {
        TimeInterpolator timeInterpolator = z11 ? at.b.f14972a : at.b.f14973b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f42660b));
        return valueAnimatorOfFloat;
    }

    private Animator I(boolean z11) {
        return K(z11, true, this.f42666h);
    }

    private AnimatorSet J(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(L());
        k(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        animatorSet.setDuration(z11 ? 350L : 300L);
        return animatorSet;
    }

    private Animator K(boolean z11, boolean z12, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z12 ? D(view) : C(view), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        return animatorSet;
    }

    private Animator L() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f42661c.getHeight(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.l(this.f42661c));
        return valueAnimatorOfFloat;
    }

    private void O(float f11) {
        ActionMenuView actionMenuViewA;
        if (!this.f42659a.v() || (actionMenuViewA = b0.a(this.f42664f)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(float f11) {
        this.f42668j.setAlpha(f11);
        this.f42669k.setAlpha(f11);
        this.f42670l.setAlpha(f11);
        O(f11);
    }

    private void Q(Drawable drawable) {
        if (drawable instanceof k.b) {
            ((k.b) drawable).e(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawable).a(1.0f);
        }
    }

    private void R(Toolbar toolbar) {
        ActionMenuView actionMenuViewA = b0.a(toolbar);
        if (actionMenuViewA != null) {
            for (int i11 = 0; i11 < actionMenuViewA.getChildCount(); i11++) {
                View childAt = actionMenuViewA.getChildAt(i11);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    private void T() {
        Menu menu = this.f42665g.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (this.f42673o.getMenuResId() == -1 || !this.f42659a.v()) {
            this.f42665g.setVisibility(8);
            return;
        }
        this.f42665g.inflateMenu(this.f42673o.getMenuResId());
        R(this.f42665g);
        this.f42665g.setVisibility(0);
    }

    private AnimatorSet W() {
        if (this.f42659a.s()) {
            this.f42659a.p();
        }
        AnimatorSet animatorSetB = B(false);
        animatorSetB.addListener(new a());
        animatorSetB.start();
        return animatorSetB;
    }

    private AnimatorSet X() {
        if (this.f42659a.s()) {
            this.f42659a.p();
        }
        AnimatorSet animatorSetJ = J(false);
        animatorSetJ.addListener(new b());
        animatorSetJ.start();
        return animatorSetJ;
    }

    private void Y() {
        if (this.f42659a.s()) {
            this.f42659a.z();
        }
        this.f42659a.setTransitionState(SearchView.d.SHOWING);
        T();
        this.f42667i.setText(this.f42673o.getText());
        EditText editText = this.f42667i;
        editText.setSelection(editText.getText().length());
        this.f42661c.setVisibility(4);
        this.f42661c.post(new Runnable() { // from class: com.google.android.material.search.q
            @Override // java.lang.Runnable
            public final void run() {
                u.d(this.f42655a);
            }
        });
    }

    private void Z() {
        if (this.f42659a.s()) {
            final SearchView searchView = this.f42659a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.r
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.z();
                }
            }, 150L);
        }
        this.f42661c.setVisibility(4);
        this.f42661c.post(new Runnable() { // from class: com.google.android.material.search.s
            @Override // java.lang.Runnable
            public final void run() {
                u.a(this.f42657a);
            }
        });
    }

    public static /* synthetic */ void a(u uVar) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = uVar.f42661c;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet animatorSetJ = uVar.J(true);
        animatorSetJ.addListener(new v(uVar));
        animatorSetJ.start();
    }

    public static /* synthetic */ void b(u uVar, float f11, float f12, Rect rect, ValueAnimator valueAnimator) {
        uVar.getClass();
        uVar.f42661c.c(rect, at.b.a(f11, f12, valueAnimator.getAnimatedFraction()));
    }

    public static /* synthetic */ void d(u uVar) {
        AnimatorSet animatorSetB = uVar.B(true);
        animatorSetB.addListener(new t(uVar));
        animatorSetB.start();
    }

    private void j(AnimatorSet animatorSet) {
        ActionMenuView actionMenuViewA = b0.a(this.f42664f);
        if (actionMenuViewA == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(C(actionMenuViewA), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(actionMenuViewA));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(actionMenuViewA));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void k(AnimatorSet animatorSet) {
        ImageButton imageButtonD = b0.d(this.f42664f);
        if (imageButtonD == null) {
            return;
        }
        Drawable drawableQ = l5.a.q(imageButtonD.getDrawable());
        if (!this.f42659a.t()) {
            Q(drawableQ);
        } else {
            m(animatorSet, drawableQ);
            n(animatorSet, drawableQ);
        }
    }

    private void l(AnimatorSet animatorSet) {
        ImageButton imageButtonD = b0.d(this.f42664f);
        if (imageButtonD == null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(D(imageButtonD), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.k(imageButtonD));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(E(), BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.q.l(imageButtonD));
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
    }

    private void m(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof k.b) {
            final k.b bVar = (k.b) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.o
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bVar.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void n(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.f) {
            final com.google.android.material.internal.f fVar = (com.google.android.material.internal.f) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private Animator q(boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        if (this.f42659a.v()) {
            valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.g(b0.a(this.f42665g), b0.a(this.f42664f)));
        }
        return valueAnimatorOfFloat;
    }

    private AnimatorSet s(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        k(animatorSet);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        return animatorSet;
    }

    private AnimatorSet t(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        l(animatorSet);
        j(animatorSet);
        animatorSet.setDuration(z11 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        return animatorSet;
    }

    private Animator u(boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z11 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14972a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f42668j));
        return valueAnimatorOfFloat;
    }

    private Animator v(boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 150L : 83L);
        valueAnimatorOfFloat.setStartDelay(z11 ? 75L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14972a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.e(this.f42669k, this.f42670l));
        return valueAnimatorOfFloat;
    }

    private Animator w(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(v(z11), y(z11), x(z11));
        return animatorSet;
    }

    private Animator x(boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.f(this.f42670l));
        return valueAnimatorOfFloat;
    }

    private Animator y(boolean z11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((this.f42670l.getHeight() * 0.050000012f) / 2.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.setDuration(z11 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.t.a(z11, at.b.f14973b));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.q.l(this.f42669k));
        return valueAnimatorOfFloat;
    }

    private Animator z(boolean z11) {
        return K(z11, false, this.f42665g);
    }

    AnimatorSet M() {
        return this.f42673o != null ? W() : X();
    }

    public androidx.p002activity.b N() {
        return this.f42671m.c();
    }

    void S(SearchBar searchBar) {
        this.f42673o = searchBar;
    }

    void U() {
        if (this.f42673o != null) {
            Y();
        } else {
            Z();
        }
    }

    void V(@NonNull androidx.p002activity.b bVar) {
        this.f42671m.s(bVar, this.f42673o);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a0(@NonNull androidx.p002activity.b bVar) {
        if (bVar.getProgress() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        nt.g gVar = this.f42671m;
        SearchBar searchBar = this.f42673o;
        gVar.u(bVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f42672n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (bVar.getProgress() * this.f42672n.getDuration()));
            return;
        }
        if (this.f42659a.s()) {
            this.f42659a.p();
        }
        if (this.f42659a.t()) {
            AnimatorSet animatorSetS = s(false);
            this.f42672n = animatorSetS;
            animatorSetS.start();
            this.f42672n.pause();
        }
    }

    public void o() {
        this.f42671m.g(this.f42673o);
        AnimatorSet animatorSet = this.f42672n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f42672n = null;
    }

    public void p() {
        this.f42671m.j(M().getTotalDuration(), this.f42673o);
        if (this.f42672n != null) {
            t(false).start();
            this.f42672n.resume();
        }
        this.f42672n = null;
    }

    nt.g r() {
        return this.f42671m;
    }
}
