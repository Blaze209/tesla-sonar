package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int A = l.f128813v;
    private static final int B = zs.c.X;
    private static final int C = zs.c.f128570h0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f41527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final st.g f41528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Animator f41529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f41530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f41534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f41537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f41539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f41540n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f41541o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f41542p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<j> f41543q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f41544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Behavior f41547u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f41548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f41549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f41550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    AnimatorListenerAdapter f41551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    at.l<FloatingActionButton> f41552z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.f41545s) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.X(bottomAppBar.f41531e, BottomAppBar.this.f41546t);
        }
    }

    class b implements at.l<FloatingActionButton> {
        b() {
        }

        @Override // at.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f41528b.c0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f41533g == 1) ? floatingActionButton.getScaleY() : BitmapDescriptorFactory.HUE_RED);
        }

        @Override // at.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@NonNull FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f41533g != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().h() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().n(translationX);
                BottomAppBar.this.f41528b.invalidateSelf();
            }
            float f11 = -floatingActionButton.getTranslationY();
            float scaleY = BitmapDescriptorFactory.HUE_RED;
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f11);
            if (BottomAppBar.this.getTopEdgeTreatment().c() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().i(fMax);
                BottomAppBar.this.f41528b.invalidateSelf();
            }
            st.g gVar = BottomAppBar.this.f41528b;
            if (floatingActionButton.getVisibility() == 0) {
                scaleY = floatingActionButton.getScaleY();
            }
            gVar.c0(scaleY);
        }
    }

    class c implements d0.d {
        c() {
        }

        @Override // com.google.android.material.internal.d0.d
        @NonNull
        public WindowInsetsCompat a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull d0.e eVar) {
            boolean z11;
            if (BottomAppBar.this.f41539m) {
                BottomAppBar.this.f41548v = windowInsetsCompat.j();
            }
            boolean z12 = false;
            if (BottomAppBar.this.f41540n) {
                z11 = BottomAppBar.this.f41550x != windowInsetsCompat.k();
                BottomAppBar.this.f41550x = windowInsetsCompat.k();
            } else {
                z11 = false;
            }
            if (BottomAppBar.this.f41541o) {
                boolean z13 = BottomAppBar.this.f41549w != windowInsetsCompat.l();
                BottomAppBar.this.f41549w = windowInsetsCompat.l();
                z12 = z13;
            }
            if (!z11 && !z12) {
                return windowInsetsCompat;
            }
            BottomAppBar.this.M();
            BottomAppBar.this.c0();
            BottomAppBar.this.b0();
            return windowInsetsCompat;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Q();
            BottomAppBar.this.f41529c = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R();
        }
    }

    class e extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f41562a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.Q();
            }
        }

        e(int i11) {
            this.f41562a = i11;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@NonNull FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.V(this.f41562a));
            floatingActionButton.s(new a());
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.Q();
            BottomAppBar.this.f41545s = false;
            BottomAppBar.this.f41530d = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R();
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f41566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f41567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f41569d;

        g(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f41567b = actionMenuView;
            this.f41568c = i11;
            this.f41569d = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f41566a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f41566a) {
                return;
            }
            boolean z11 = BottomAppBar.this.f41544r != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.a0(bottomAppBar.f41544r);
            BottomAppBar.this.f0(this.f41567b, this.f41568c, this.f41569d, z11);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f41571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f41573c;

        h(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f41571a = actionMenuView;
            this.f41572b = i11;
            this.f41573c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f41571a;
            actionMenuView.setTranslationX(BottomAppBar.this.U(actionMenuView, this.f41572b, this.f41573c));
        }
    }

    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f41551y.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonS = BottomAppBar.this.S();
            if (floatingActionButtonS != null) {
                floatingActionButtonS.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class k extends r6.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f41577d;

        class a implements Parcelable.ClassLoaderCreator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(@NonNull Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i11) {
                return new k[i11];
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f41576c);
            parcel.writeInt(this.f41577d ? 1 : 0);
        }

        public k(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f41576c = parcel.readInt();
            this.f41577d = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f41551y);
        floatingActionButton.f(new i());
        floatingActionButton.g(this.f41552z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        Animator animator = this.f41530d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f41529c;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void O(int i11, @NonNull List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(S(), "translationX", V(i11));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void P(int i11, boolean z11, @NonNull List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - U(actionMenuView, i11, z11)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", BitmapDescriptorFactory.HUE_RED);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new g(actionMenuView, i11, z11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        ArrayList<j> arrayList;
        int i11 = this.f41542p - 1;
        this.f41542p = i11;
        if (i11 != 0 || (arrayList = this.f41543q) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        ArrayList<j> arrayList;
        int i11 = this.f41542p;
        this.f41542p = i11 + 1;
        if (i11 != 0 || (arrayList = this.f41543q) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton S() {
        View viewT = T();
        if (viewT instanceof FloatingActionButton) {
            return (FloatingActionButton) viewT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View T() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float V(int i11) {
        boolean zM = d0.m(this);
        if (i11 != 1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View viewT = T();
        return ((getMeasuredWidth() / 2) - ((zM ? this.f41550x : this.f41549w) + ((this.f41535i == -1 || viewT == null) ? this.f41534h : (viewT.getMeasuredWidth() / 2) + this.f41535i))) * (zM ? -1 : 1);
    }

    private boolean W() {
        FloatingActionButton floatingActionButtonS = S();
        return floatingActionButtonS != null && floatingActionButtonS.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(int i11, boolean z11) {
        if (!ViewCompat.U(this)) {
            this.f41545s = false;
            a0(this.f41544r);
            return;
        }
        Animator animator = this.f41530d;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!W()) {
            i11 = 0;
            z11 = false;
        }
        P(i11, z11, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f41530d = animatorSet;
        animatorSet.addListener(new f());
        this.f41530d.start();
    }

    private void Y(int i11) {
        if (this.f41531e == i11 || !ViewCompat.U(this)) {
            return;
        }
        Animator animator = this.f41529c;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f41532f == 1) {
            O(i11, arrayList);
        } else {
            N(i11, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(nt.i.g(getContext(), C, at.b.f14972a));
        this.f41529c = animatorSet;
        animatorSet.addListener(new d());
        this.f41529c.start();
    }

    private Drawable Z(Drawable drawable) {
        if (drawable == null || this.f41527a == null) {
            return drawable;
        }
        Drawable drawableR = l5.a.r(drawable.mutate());
        l5.a.n(drawableR, this.f41527a.intValue());
        return drawableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f41530d != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (W()) {
            e0(actionMenuView, this.f41531e, this.f41546t);
        } else {
            e0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        getTopEdgeTreatment().n(getFabTranslationX());
        this.f41528b.c0((this.f41546t && W() && this.f41533g == 1) ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        View viewT = T();
        if (viewT != null) {
            viewT.setTranslationY(getFabTranslationY());
            viewT.setTranslationX(getFabTranslationX());
        }
    }

    private void e0(@NonNull ActionMenuView actionMenuView, int i11, boolean z11) {
        f0(actionMenuView, i11, z11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(@NonNull ActionMenuView actionMenuView, int i11, boolean z11, boolean z12) {
        h hVar = new h(actionMenuView, i11, z11);
        if (z12) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g0(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f7406d = 17;
        int i11 = bottomAppBar.f41533g;
        if (i11 == 1) {
            fVar.f7406d = 17 | 48;
        }
        if (i11 == 0) {
            fVar.f7406d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f41548v;
    }

    private int getFabAlignmentAnimationDuration() {
        return nt.i.f(getContext(), B, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return V(this.f41531e);
    }

    private float getFabTranslationY() {
        if (this.f41533g == 1) {
            return -getTopEdgeTreatment().c();
        }
        View viewT = T();
        return viewT != null ? (-((getMeasuredHeight() + getBottomInset()) - viewT.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f41550x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f41549w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.f41528b.E().p();
    }

    protected void N(int i11, List<Animator> list) {
        FloatingActionButton floatingActionButtonS = S();
        if (floatingActionButtonS == null || floatingActionButtonS.o()) {
            return;
        }
        R();
        floatingActionButtonS.m(new e(i11));
    }

    protected int U(@NonNull ActionMenuView actionMenuView, int i11, boolean z11) {
        int dimensionPixelOffset = 0;
        if (this.f41536j != 1 && (i11 != 1 || !z11)) {
            return 0;
        }
        boolean zM = d0.m(this);
        int measuredWidth = zM ? getMeasuredWidth() : 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f1961a & 8388615) == 8388611) {
                measuredWidth = zM ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zM ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i13 = zM ? this.f41549w : -this.f41550x;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(zs.e.f128668z);
            if (!zM) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i13) + dimensionPixelOffset);
    }

    public void a0(int i11) {
        if (i11 != 0) {
            this.f41544r = 0;
            getMenu().clear();
            inflateMenu(i11);
        }
    }

    boolean d0(int i11) {
        float f11 = i11;
        if (f11 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().m(f11);
        this.f41528b.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f41528b.I();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f41531e;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f41535i;
    }

    public int getFabAnchorMode() {
        return this.f41533g;
    }

    public int getFabAnimationMode() {
        return this.f41532f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.f41538l;
    }

    public int getMenuAlignmentMode() {
        return this.f41536j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        st.h.f(this, this.f41528b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            M();
            c0();
            final View viewT = T();
            if (viewT != null && ViewCompat.U(viewT)) {
                viewT.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewT.requestLayout();
                    }
                });
            }
        }
        b0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a());
        this.f41531e = kVar.f41576c;
        this.f41546t = kVar.f41577d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f41576c = this.f41531e;
        kVar.f41577d = this.f41546t;
        return kVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        l5.a.o(this.f41528b, colorStateList);
    }

    public void setCradleVerticalOffset(float f11) {
        if (f11 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().i(f11);
            this.f41528b.invalidateSelf();
            c0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        this.f41528b.a0(f11);
        getBehavior().M(this, this.f41528b.D() - this.f41528b.C());
    }

    public void setFabAlignmentMode(int i11) {
        setFabAlignmentModeAndReplaceMenu(i11, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i11, int i12) {
        this.f41544r = i12;
        this.f41545s = true;
        X(i11, this.f41546t);
        Y(i11);
        this.f41531e = i11;
    }

    public void setFabAlignmentModeEndMargin(int i11) {
        if (this.f41535i != i11) {
            this.f41535i = i11;
            c0();
        }
    }

    public void setFabAnchorMode(int i11) {
        this.f41533g = i11;
        c0();
        View viewT = T();
        if (viewT != null) {
            g0(this, viewT);
            viewT.requestLayout();
            this.f41528b.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i11) {
        this.f41532f = i11;
    }

    void setFabCornerSize(float f11) {
        if (f11 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().j(f11);
            this.f41528b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f11) {
        if (f11 != getFabCradleMargin()) {
            getTopEdgeTreatment().k(f11);
            this.f41528b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f11) {
        if (f11 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().l(f11);
            this.f41528b.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.f41538l = z11;
    }

    public void setMenuAlignmentMode(int i11) {
        if (this.f41536j != i11) {
            this.f41536j = i11;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                e0(actionMenuView, this.f41531e, W());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Z(drawable));
    }

    public void setNavigationIconTint(int i11) {
        this.f41527a = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128561d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public Behavior getBehavior() {
        if (this.f41547u == null) {
            this.f41547u = new Behavior();
        }
        return this.f41547u;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NonNull
        private final Rect f41553m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private WeakReference<BottomAppBar> f41554n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f41555o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final View.OnLayoutChangeListener f41556p;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f41554n.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f41553m);
                    int iHeight = Behavior.this.f41553m.height();
                    bottomAppBar.d0(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f41553m)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f41555o == 0) {
                    if (bottomAppBar.f41533g == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(zs.e.f128631g0) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (d0.m(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f41534h;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f41534h;
                    }
                }
                bottomAppBar.c0();
            }
        }

        public Behavior() {
            this.f41556p = new a();
            this.f41553m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, int i11) {
            this.f41554n = new WeakReference<>(bottomAppBar);
            View viewT = bottomAppBar.T();
            if (viewT != null && !ViewCompat.U(viewT)) {
                BottomAppBar.g0(bottomAppBar, viewT);
                this.f41555o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewT.getLayoutParams())).bottomMargin;
                if (viewT instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewT;
                    if (bottomAppBar.f41533g == 0 && bottomAppBar.f41537k) {
                        ViewCompat.x0(floatingActionButton, BitmapDescriptorFactory.HUE_RED);
                        floatingActionButton.setCompatElevation(BitmapDescriptorFactory.HUE_RED);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(zs.b.f128552f);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(zs.b.f128551e);
                    }
                    bottomAppBar.L(floatingActionButton);
                }
                viewT.addOnLayoutChangeListener(this.f41556p);
                bottomAppBar.c0();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i11);
            return super.p(coordinatorLayout, bottomAppBar, i11);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BottomAppBar bottomAppBar, @NonNull View view, @NonNull View view2, int i11, int i12) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i11, i12);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41556p = new a();
            this.f41553m = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = A;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        st.g gVar = new st.g();
        this.f41528b = gVar;
        this.f41542p = 0;
        this.f41544r = 0;
        this.f41545s = false;
        this.f41546t = true;
        this.f41551y = new a();
        this.f41552z = new b();
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.f129011q0, i11, i12, new int[0]);
        ColorStateList colorStateListA = pt.c.a(context2, typedArrayI, m.f129035s0);
        if (typedArrayI.hasValue(m.D0)) {
            setNavigationIconTint(typedArrayI.getColor(m.D0, -1));
        }
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.f129047t0, 0);
        float dimensionPixelOffset = typedArrayI.getDimensionPixelOffset(m.f129106y0, 0);
        float dimensionPixelOffset2 = typedArrayI.getDimensionPixelOffset(m.f129117z0, 0);
        float dimensionPixelOffset3 = typedArrayI.getDimensionPixelOffset(m.A0, 0);
        this.f41531e = typedArrayI.getInt(m.f129059u0, 0);
        this.f41532f = typedArrayI.getInt(m.f129095x0, 0);
        this.f41533g = typedArrayI.getInt(m.f129083w0, 1);
        this.f41537k = typedArrayI.getBoolean(m.H0, true);
        this.f41536j = typedArrayI.getInt(m.C0, 0);
        this.f41538l = typedArrayI.getBoolean(m.B0, false);
        this.f41539m = typedArrayI.getBoolean(m.E0, false);
        this.f41540n = typedArrayI.getBoolean(m.F0, false);
        this.f41541o = typedArrayI.getBoolean(m.G0, false);
        this.f41535i = typedArrayI.getDimensionPixelOffset(m.f129071v0, -1);
        boolean z11 = typedArrayI.getBoolean(m.f129023r0, true);
        typedArrayI.recycle();
        this.f41534h = getResources().getDimensionPixelOffset(zs.e.f128629f0);
        gVar.setShapeAppearanceModel(st.k.a().A(new com.google.android.material.bottomappbar.b(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        if (z11) {
            gVar.i0(2);
        } else {
            gVar.i0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        gVar.e0(Paint.Style.FILL);
        gVar.Q(context2);
        setElevation(dimensionPixelSize);
        l5.a.o(gVar, colorStateListA);
        ViewCompat.t0(this, gVar);
        d0.f(this, attributeSet, i11, i12, new c());
    }
}
