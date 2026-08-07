package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import at.f;
import at.i;
import at.j;
import at.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import zs.g;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f43100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f43101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f43102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f43103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f43104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f43105h;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f43106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f43107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f43108c;

        a(boolean z11, View view, View view2) {
            this.f43106a = z11;
            this.f43107b = view;
            this.f43108c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f43106a) {
                return;
            }
            this.f43107b.setVisibility(4);
            this.f43108c.setAlpha(1.0f);
            this.f43108c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f43106a) {
                this.f43107b.setVisibility(0);
                this.f43108c.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f43108c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f43110a;

        b(View view) {
            this.f43110a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f43110a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ft.d f43112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f43113b;

        c(ft.d dVar, Drawable drawable) {
            this.f43112a = dVar;
            this.f43113b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f43112a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f43112a.setCircularRevealOverlayDrawable(this.f43113b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ft.d f43115a;

        d(ft.d dVar) {
            this.f43115a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ft.d.e revealInfo = this.f43115a.getRevealInfo();
            revealInfo.f66573c = Float.MAX_VALUE;
            this.f43115a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i f43117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f43118b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
        this.f43100c = new Rect();
        this.f43101d = new RectF();
        this.f43102e = new RectF();
        this.f43103f = new int[2];
    }

    private ViewGroup O(@NonNull View view) {
        View viewFindViewById = view.findViewById(g.P);
        if (viewFindViewById != null) {
            return j0(viewFindViewById);
        }
        return ((view instanceof xt.b) || (view instanceof xt.a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private void P(@NonNull View view, @NonNull e eVar, @NonNull j jVar, @NonNull j jVar2, float f11, float f12, float f13, float f14, @NonNull RectF rectF) {
        float fW = W(eVar, jVar, f11, f13);
        float fW2 = W(eVar, jVar2, f12, f14);
        Rect rect = this.f43100c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f43101d;
        rectF2.set(rect);
        RectF rectF3 = this.f43102e;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(@NonNull View view, @NonNull RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f43104g, this.f43105h);
    }

    @NonNull
    private Pair<j, j> R(float f11, float f12, boolean z11, @NonNull e eVar) {
        j jVarH;
        j jVarH2;
        if (f11 == BitmapDescriptorFactory.HUE_RED || f12 == BitmapDescriptorFactory.HUE_RED) {
            jVarH = eVar.f43117a.h("translationXLinear");
            jVarH2 = eVar.f43117a.h("translationYLinear");
        } else if ((!z11 || f12 >= BitmapDescriptorFactory.HUE_RED) && (z11 || f12 <= BitmapDescriptorFactory.HUE_RED)) {
            jVarH = eVar.f43117a.h("translationXCurveDownwards");
            jVarH2 = eVar.f43117a.h("translationYCurveDownwards");
        } else {
            jVarH = eVar.f43117a.h("translationXCurveUpwards");
            jVarH2 = eVar.f43117a.h("translationYCurveUpwards");
        }
        return new Pair<>(jVarH, jVarH2);
    }

    private float S(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f43101d;
        RectF rectF2 = this.f43102e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, kVar), BitmapDescriptorFactory.HUE_RED);
        return rectF.centerX() - rectF2.left;
    }

    private float T(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        RectF rectF = this.f43101d;
        RectF rectF2 = this.f43102e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(BitmapDescriptorFactory.HUE_RED, -V(view, view2, kVar));
        return rectF.centerY() - rectF2.top;
    }

    private float U(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float fCenterX;
        float fCenterX2;
        float f11;
        RectF rectF = this.f43101d;
        RectF rectF2 = this.f43102e;
        Q(view, rectF);
        X(view2, rectF2);
        int i11 = kVar.f14992a & 7;
        if (i11 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i11 != 3) {
                if (i11 != 5) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f11 + kVar.f14993b;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f11 = fCenterX - fCenterX2;
        return f11 + kVar.f14993b;
    }

    private float V(@NonNull View view, @NonNull View view2, @NonNull k kVar) {
        float fCenterY;
        float fCenterY2;
        float f11;
        RectF rectF = this.f43101d;
        RectF rectF2 = this.f43102e;
        Q(view, rectF);
        X(view2, rectF2);
        int i11 = kVar.f14992a & 112;
        if (i11 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i11 != 48) {
                if (i11 != 80) {
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f11 + kVar.f14994c;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f11 = fCenterY - fCenterY2;
        return f11 + kVar.f14994c;
    }

    private float W(@NonNull e eVar, @NonNull j jVar, float f11, float f12) {
        long jC = jVar.c();
        long jD = jVar.d();
        j jVarH = eVar.f43117a.h("expansion");
        return at.b.a(f11, f12, jVar.e().getInterpolation((((jVarH.c() + jVarH.d()) + 17) - jC) / jD));
    }

    private void X(@NonNull View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        int[] iArr = this.f43103f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void Y(View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof ft.d) && ft.c.f66557j == 0) || (viewGroupO = O(view2)) == null) {
                return;
            }
            if (z11) {
                if (!z12) {
                    at.e.f14978a.set(viewGroupO, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, at.e.f14978a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, at.e.f14978a, BitmapDescriptorFactory.HUE_RED);
            }
            eVar.f43117a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(@NonNull View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof ft.d) {
            ft.d dVar = (ft.d) view2;
            int iH0 = h0(view);
            int i11 = 16777215 & iH0;
            if (z11) {
                if (!z12) {
                    dVar.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, ft.d.C1354d.f66570a, i11);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, ft.d.C1354d.f66570a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(at.d.b());
            eVar.f43117a.h("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void a0(@NonNull View view, @NonNull View view2, boolean z11, @NonNull e eVar, @NonNull List<Animator> list) {
        float fU = U(view, view2, eVar.f43118b);
        float fV = V(view, view2, eVar.f43118b);
        Pair<j, j> pairR = R(fU, fV, z11, eVar);
        j jVar = (j) pairR.first;
        j jVar2 = (j) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z11) {
            fU = this.f43104g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z11) {
            fV = this.f43105h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        jVar.a(objectAnimatorOfFloat);
        jVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    private void b0(View view, @NonNull View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fV = ViewCompat.v(view2) - ViewCompat.v(view);
        if (z11) {
            if (!z12) {
                view2.setTranslationZ(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, BitmapDescriptorFactory.HUE_RED);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fV);
        }
        eVar.f43117a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(@NonNull View view, View view2, boolean z11, boolean z12, @NonNull e eVar, float f11, float f12, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof ft.d) {
            ft.d dVar = (ft.d) view2;
            float fS = S(view, view2, eVar.f43118b);
            float fT = T(view, view2, eVar.f43118b);
            ((FloatingActionButton) view).i(this.f43100c);
            float fWidth = this.f43100c.width() / 2.0f;
            j jVarH = eVar.f43117a.h("expansion");
            if (z11) {
                if (!z12) {
                    dVar.setRevealInfo(new ft.d.e(fS, fT, fWidth));
                }
                if (z12) {
                    fWidth = dVar.getRevealInfo().f66573c;
                }
                animatorA = ft.a.a(dVar, fS, fT, mt.a.b(fS, fT, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11, f12));
                animatorA.addListener(new d(dVar));
                f0(view2, jVarH.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f13 = dVar.getRevealInfo().f66573c;
                Animator animatorA2 = ft.a.a(dVar, fS, fT, fWidth);
                int i11 = (int) fS;
                int i12 = (int) fT;
                f0(view2, jVarH.c(), i11, i12, f13, list);
                e0(view2, jVarH.c(), jVarH.d(), eVar.f43117a.i(), i11, i12, fWidth, list);
                animatorA = animatorA2;
            }
            jVarH.a(animatorA);
            list.add(animatorA);
            list2.add(ft.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view, View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof ft.d) && (view instanceof ImageView)) {
            ft.d dVar = (ft.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z11) {
                if (!z12) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, f.f14979b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, f.f14979b, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f43117a.h("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    private void e0(View view, long j11, long j12, long j13, int i11, int i12, float f11, @NonNull List<Animator> list) {
        long j14 = j11 + j12;
        if (j14 < j13) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            animatorCreateCircularReveal.setStartDelay(j14);
            animatorCreateCircularReveal.setDuration(j13 - j14);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void f0(View view, long j11, int i11, int i12, float f11, @NonNull List<Animator> list) {
        if (j11 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i11, i12, f11, f11);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j11);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void g0(@NonNull View view, @NonNull View view2, boolean z11, boolean z12, @NonNull e eVar, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        j jVar;
        j jVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.f43118b);
        float fV = V(view, view2, eVar.f43118b);
        Pair<j, j> pairR = R(fU, fV, z11, eVar);
        j jVar3 = (j) pairR.first;
        j jVar4 = (j) pairR.second;
        if (z11) {
            if (!z12) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED);
            jVar = jVar4;
            jVar2 = jVar3;
            P(view2, eVar, jVar2, jVar, -fU, -fV, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, rectF);
        } else {
            jVar = jVar4;
            jVar2 = jVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        jVar2.a(objectAnimatorOfFloat);
        jVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private int h0(@NonNull View view) {
        ColorStateList colorStateListS = ViewCompat.s(view);
        if (colorStateListS != null) {
            return colorStateListS.getColorForState(view.getDrawableState(), colorStateListS.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet N(@NonNull View view, @NonNull View view2, boolean z11, boolean z12) {
        e eVarI0 = i0(view2.getContext(), z11);
        if (z11) {
            this.f43104g = view.getTranslationX();
            this.f43105h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z11, z12, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f43101d;
        g0(view, view2, z11, z12, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z11, eVarI0, arrayList);
        d0(view, view2, z11, z12, eVarI0, arrayList, arrayList2);
        c0(view, view2, z11, z12, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z11, z12, eVarI0, arrayList, arrayList2);
        Y(view, view2, z11, z12, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        at.c.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z11, view2, view));
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            animatorSet.addListener(arrayList2.get(i11));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    protected abstract e i0(Context context, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        if (fVar.f7410h == 0) {
            fVar.f7410h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43100c = new Rect();
        this.f43101d = new RectF();
        this.f43102e = new RectF();
        this.f43103f = new int[2];
    }
}
