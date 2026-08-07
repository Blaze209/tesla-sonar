package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.a0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int K = zs.l.D;
    static final Property<View, Float> L = new f(Float.class, Snapshot.WIDTH);
    static final Property<View, Float> M = new g(Float.class, Snapshot.HEIGHT);
    static final Property<View, Float> N = new h(Float.class, "paddingStart");
    static final Property<View, Float> O = new i(Float.class, "paddingEnd");
    private int A;
    private int B;

    @NonNull
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> C;
    private boolean D;
    private boolean E;
    private boolean F;

    @NonNull
    protected ColorStateList G;
    private int H;
    private int I;
    private final int J;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42087t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.a f42088u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.floatingactionbutton.f f42089v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.floatingactionbutton.f f42090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f42091x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.f f42092y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f42093z;

    class a implements n {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    class b implements n {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.A + ExtendedFloatingActionButton.this.B;
        }
    }

    class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42099a;

        c(n nVar) {
            this.f42099a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.I == 0 ? -2 : ExtendedFloatingActionButton.this.I);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.I != -1) {
                return (ExtendedFloatingActionButton.this.I == 0 || ExtendedFloatingActionButton.this.I == -2) ? this.f42099a.getHeight() : ExtendedFloatingActionButton.this.I;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f42099a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.height != -2) {
                return (view.getHeight() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingTop() + view.getPaddingBottom());
            }
            return this.f42099a.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f42099a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || layoutParams.width != -2) {
                return (view.getWidth() - ((!(ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingLeft() + view.getPaddingRight());
            }
            return this.f42099a.getWidth();
        }
    }

    class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f42101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f42102b;

        d(n nVar, n nVar2) {
            this.f42101a = nVar;
            this.f42102b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.B;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams b() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.H == 0 ? -2 : ExtendedFloatingActionButton.this.H, ExtendedFloatingActionButton.this.I != 0 ? ExtendedFloatingActionButton.this.I : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int c() {
            return ExtendedFloatingActionButton.this.A;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.I == -1) {
                return this.f42101a.getHeight();
            }
            return (ExtendedFloatingActionButton.this.I == 0 || ExtendedFloatingActionButton.this.I == -2) ? this.f42102b.getHeight() : ExtendedFloatingActionButton.this.I;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.H == -1) {
                return this.f42101a.getWidth();
            }
            return (ExtendedFloatingActionButton.this.H == 0 || ExtendedFloatingActionButton.this.H == -2) ? this.f42102b.getWidth() : ExtendedFloatingActionButton.this.H;
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f42104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f42105b;

        e(com.google.android.material.floatingactionbutton.f fVar, l lVar) {
            this.f42105b = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f42104a = true;
            this.f42105b.i();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f42105b.a();
            if (this.f42104a) {
                return;
            }
            this.f42105b.g(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f42105b.onAnimationStart(animator);
            this.f42104a = false;
        }
    }

    class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            view.getLayoutParams().width = f11.intValue();
            view.requestLayout();
        }
    }

    class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            view.getLayoutParams().height = f11.intValue();
            view.requestLayout();
        }
    }

    class h extends Property<View, Float> {
        h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.F(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            ViewCompat.F0(view, f11.intValue(), view.getPaddingTop(), ViewCompat.E(view), view.getPaddingBottom());
        }
    }

    class i extends Property<View, Float> {
        i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.E(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f11) {
            ViewCompat.F0(view, ViewCompat.F(view), view.getPaddingTop(), f11.intValue(), view.getPaddingBottom());
        }
    }

    class j extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n f42107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f42108h;

        j(com.google.android.material.floatingactionbutton.a aVar, n nVar, boolean z11) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f42107g = nVar;
            this.f42108h = z11;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.E = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f42107g.b().width;
            layoutParams.height = this.f42107g.b().height;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return this.f42108h == ExtendedFloatingActionButton.this.D || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int e() {
            return this.f42108h ? zs.b.f128548b : zs.b.f128547a;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @NonNull
        public AnimatorSet f() {
            at.i iVarM = m();
            if (iVarM.j(Snapshot.WIDTH)) {
                PropertyValuesHolder[] propertyValuesHolderArrG = iVarM.g(Snapshot.WIDTH);
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f42107g.getWidth());
                iVarM.l(Snapshot.WIDTH, propertyValuesHolderArrG);
            }
            if (iVarM.j(Snapshot.HEIGHT)) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = iVarM.g(Snapshot.HEIGHT);
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f42107g.getHeight());
                iVarM.l(Snapshot.HEIGHT, propertyValuesHolderArrG2);
            }
            if (iVarM.j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = iVarM.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(ViewCompat.F(ExtendedFloatingActionButton.this), this.f42107g.c());
                iVarM.l("paddingStart", propertyValuesHolderArrG3);
            }
            if (iVarM.j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = iVarM.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(ViewCompat.E(ExtendedFloatingActionButton.this), this.f42107g.a());
                iVarM.l("paddingEnd", propertyValuesHolderArrG4);
            }
            if (iVarM.j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = iVarM.g("labelOpacity");
                boolean z11 = this.f42108h;
                propertyValuesHolderArrG5[0].setFloatValues(z11 ? 0.0f : 1.0f, z11 ? 1.0f : 0.0f);
                iVarM.l("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.l(iVarM);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(l lVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h() {
            ExtendedFloatingActionButton.this.D = this.f42108h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f42108h) {
                ExtendedFloatingActionButton.this.H = layoutParams.width;
                ExtendedFloatingActionButton.this.I = layoutParams.height;
            }
            layoutParams.width = this.f42107g.b().width;
            layoutParams.height = this.f42107g.b().height;
            ViewCompat.F0(ExtendedFloatingActionButton.this, this.f42107g.c(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f42107g.a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.D = this.f42108h;
            ExtendedFloatingActionButton.this.E = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    class k extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f42110g;

        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f42087t = 0;
            if (this.f42110g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.x();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int e() {
            return zs.b.f128549c;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(l lVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void i() {
            super.i();
            this.f42110g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f42110g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f42087t = 1;
        }
    }

    public static abstract class l {
    }

    class m extends com.google.android.material.floatingactionbutton.b {
        public m(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.f42087t = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.y();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int e() {
            return zs.b.f128550d;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(l lVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f42087t = 2;
        }
    }

    interface n {
        int a();

        ViewGroup.LayoutParams b();

        int c();

        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    private void A() {
        this.G = getTextColors();
    }

    private boolean B() {
        return (ViewCompat.U(this) || (!y() && this.F)) && !isInEditMode();
    }

    private n w(int i11) {
        b bVar = new b();
        c cVar = new c(bVar);
        d dVar = new d(cVar, bVar);
        if (i11 != 1) {
            return i11 != 2 ? dVar : cVar;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        if (getVisibility() == 0) {
            return this.f42087t == 1;
        }
        return this.f42087t != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        if (getVisibility() != 0) {
            return this.f42087t == 2;
        }
        return this.f42087t != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i11, l lVar) {
        com.google.android.material.floatingactionbutton.f fVar;
        if (i11 == 0) {
            fVar = this.f42091x;
        } else if (i11 == 1) {
            fVar = this.f42092y;
        } else if (i11 == 2) {
            fVar = this.f42089v;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i11);
            }
            fVar = this.f42090w;
        }
        if (fVar.d()) {
            return;
        }
        if (!B()) {
            fVar.h();
            fVar.g(lVar);
            return;
        }
        if (i11 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.H = layoutParams.width;
                this.I = layoutParams.height;
            } else {
                this.H = getWidth();
                this.I = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetF = fVar.f();
        animatorSetF.addListener(new e(fVar, lVar));
        Iterator<Animator.AnimatorListener> it = fVar.j().iterator();
        while (it.hasNext()) {
            animatorSetF.addListener(it.next());
        }
        animatorSetF.start();
    }

    protected void C(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.C;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i11 = this.f42093z;
        return i11 < 0 ? (Math.min(ViewCompat.F(this), ViewCompat.E(this)) * 2) + getIconSize() : i11;
    }

    public at.i getExtendMotionSpec() {
        return this.f42090w.c();
    }

    public at.i getHideMotionSpec() {
        return this.f42092y.c();
    }

    public at.i getShowMotionSpec() {
        return this.f42091x.c();
    }

    public at.i getShrinkMotionSpec() {
        return this.f42089v.c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.D = false;
            this.f42089v.h();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.F = z11;
    }

    public void setExtendMotionSpec(at.i iVar) {
        this.f42090w.b(iVar);
    }

    public void setExtendMotionSpecResource(int i11) {
        setExtendMotionSpec(at.i.d(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        if (this.D == z11) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z11 ? this.f42090w : this.f42089v;
        if (fVar.d()) {
            return;
        }
        fVar.h();
    }

    public void setHideMotionSpec(at.i iVar) {
        this.f42092y.b(iVar);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(at.i.d(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (!this.D || this.E) {
            return;
        }
        this.A = ViewCompat.F(this);
        this.B = ViewCompat.E(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        if (!this.D || this.E) {
            return;
        }
        this.A = i11;
        this.B = i13;
    }

    public void setShowMotionSpec(at.i iVar) {
        this.f42091x.b(iVar);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(at.i.d(getContext(), i11));
    }

    public void setShrinkMotionSpec(at.i iVar) {
        this.f42089v.b(iVar);
    }

    public void setShrinkMotionSpecResource(int i11) {
        setShrinkMotionSpec(at.i.d(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        A();
    }

    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.D);
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f42094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f42096c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f42095b = false;
            this.f42096c = true;
        }

        private static boolean K(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f42095b || this.f42096c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean P(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f42094a == null) {
                this.f42094a = new Rect();
            }
            Rect rect = this.f42094a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        private boolean Q(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        protected void I(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.z(this.f42096c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i11) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i11);
            return true;
        }

        protected void O(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.z(this.f42096c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(@NonNull CoordinatorLayout.f fVar) {
            if (fVar.f7410h == 0) {
                fVar.f7410h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.S2);
            this.f42095b = typedArrayObtainStyledAttributes.getBoolean(zs.m.T2, false);
            this.f42096c = typedArrayObtainStyledAttributes.getBoolean(zs.m.U2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = K;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42087t = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.f42088u = aVar;
        m mVar = new m(aVar);
        this.f42091x = mVar;
        k kVar = new k(aVar);
        this.f42092y = kVar;
        this.D = true;
        this.E = false;
        this.F = false;
        Context context2 = getContext();
        this.C = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayI = a0.i(context2, attributeSet, zs.m.L2, i11, i12, new int[0]);
        at.i iVarC = at.i.c(context2, typedArrayI, zs.m.Q2);
        at.i iVarC2 = at.i.c(context2, typedArrayI, zs.m.P2);
        at.i iVarC3 = at.i.c(context2, typedArrayI, zs.m.N2);
        at.i iVarC4 = at.i.c(context2, typedArrayI, zs.m.R2);
        this.f42093z = typedArrayI.getDimensionPixelSize(zs.m.M2, -1);
        int i13 = typedArrayI.getInt(zs.m.O2, 1);
        this.J = i13;
        this.A = ViewCompat.F(this);
        this.B = ViewCompat.E(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        j jVar = new j(aVar2, w(i13), true);
        this.f42090w = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.f42089v = jVar2;
        mVar.b(iVarC);
        kVar.b(iVarC2);
        jVar.b(iVarC3);
        jVar2.b(iVarC4);
        typedArrayI.recycle();
        setShapeAppearanceModel(st.k.g(context2, attributeSet, i11, i12, st.k.f111831m).m());
        A();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        A();
    }
}
