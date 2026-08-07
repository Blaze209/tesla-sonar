package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.v;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nt.i;
import st.h;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f41409z = l.f128802k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WindowInsetsCompat f41416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<b> f41417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f41418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f41419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<View> f41423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f41424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueAnimator f41425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f41426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List<f> f41427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f41428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TimeInterpolator f41429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f41430u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f41431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f41432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f41433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Behavior f41434y;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f41435k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f41436l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f41437m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f41438n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference<View> f41439o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f41440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f41441b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f41440a = coordinatorLayout;
                this.f41441b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseBehavior.this.T(this.f41440a, this.f41441b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends androidx.core.view.a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f41443d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f41444e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f41443d = appBarLayout;
                this.f41444e = coordinatorLayout;
            }

            @Override // androidx.core.view.a
            public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View viewJ0;
                super.g(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.t0(ScrollView.class.getName());
                if (this.f41443d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f41444e)) == null || !BaseBehavior.this.f0(this.f41443d)) {
                    return;
                }
                if (BaseBehavior.this.Q() != (-this.f41443d.getTotalScrollRange())) {
                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7754q);
                    accessibilityNodeInfoCompat.X0(true);
                }
                if (BaseBehavior.this.Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r);
                        accessibilityNodeInfoCompat.X0(true);
                    } else if ((-this.f41443d.getDownNestedPreScrollRange()) != 0) {
                        accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r);
                        accessibilityNodeInfoCompat.X0(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // androidx.core.view.a
            public boolean j(View view, int i11, Bundle bundle) {
                if (i11 == 4096) {
                    this.f41443d.setExpanded(false);
                    return true;
                }
                if (i11 != 8192) {
                    return super.j(view, i11, bundle);
                }
                if (BaseBehavior.this.Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f41444e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f41443d.setExpanded(true);
                        return true;
                    }
                    int i12 = -this.f41443d.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        BaseBehavior.this.u(this.f41444e, this.f41443d, viewJ0, 0, i12, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void A0(CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            int topInset = t11.getTopInset() + t11.getPaddingTop();
            int iQ = Q() - topInset;
            int iI0 = i0(t11, iQ);
            if (iI0 >= 0) {
                View childAt = t11.getChildAt(iI0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iB = -childAt.getBottom();
                    if (iI0 == 0 && ViewCompat.x(t11) && ViewCompat.x(childAt)) {
                        topInset2 -= t11.getTopInset();
                    }
                    if (e0(iC, 2)) {
                        iB += ViewCompat.B(childAt);
                    } else if (e0(iC, 5)) {
                        int iB2 = ViewCompat.B(childAt) + iB;
                        if (iQ < iB2) {
                            topInset2 = iB2;
                        } else {
                            iB = iB2;
                        }
                    }
                    if (e0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iB -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    Z(coordinatorLayout, t11, o5.a.b(b0(iQ, iB, topInset2) + topInset, -t11.getTotalScrollRange(), 0), BitmapDescriptorFactory.HUE_RED);
                }
            }
        }

        private void B0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, boolean z11) {
            View viewH0 = h0(t11, i11);
            boolean zY = false;
            if (viewH0 != null) {
                int iC = ((e) viewH0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iB = ViewCompat.B(viewH0);
                    if (i12 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i11) < (viewH0.getBottom() - iB) - t11.getTopInset()) : (-i11) >= (viewH0.getBottom() - iB) - t11.getTopInset()) {
                        zY = true;
                    }
                }
            }
            if (t11.o()) {
                zY = t11.y(g0(coordinatorLayout));
            }
            boolean zV = t11.v(zY);
            if (z11 || (zV && z0(coordinatorLayout, t11))) {
                if (t11.getBackground() != null) {
                    t11.getBackground().jumpToCurrentState();
                }
                if (t11.getForeground() != null) {
                    t11.getForeground().jumpToCurrentState();
                }
                if (t11.getStateListAnimator() != null) {
                    t11.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private void Y(CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            if (ViewCompat.O(coordinatorLayout)) {
                return;
            }
            ViewCompat.p0(coordinatorLayout, new b(t11, coordinatorLayout));
        }

        private void Z(CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, float f11) {
            int iAbs = Math.abs(Q() - i11);
            float fAbs = Math.abs(f11);
            a0(coordinatorLayout, t11, i11, fAbs > BitmapDescriptorFactory.HUE_RED ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t11.getHeight()) + 1.0f) * 150.0f));
        }

        private void a0(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12) {
            int iQ = Q();
            if (iQ == i11) {
                ValueAnimator valueAnimator = this.f41437m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f41437m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f41437m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f41437m = valueAnimator3;
                valueAnimator3.setInterpolator(at.b.f14976e);
                this.f41437m.addUpdateListener(new a(coordinatorLayout, t11));
            } else {
                valueAnimator2.cancel();
            }
            this.f41437m.setDuration(Math.min(i12, 600));
            this.f41437m.setIntValues(iQ, i11);
            this.f41437m.start();
        }

        private int b0(int i11, int i12, int i13) {
            return i11 < (i12 + i13) / 2 ? i12 : i13;
        }

        private boolean d0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view) {
            return t11.k() && coordinatorLayout.getHeight() - view.getHeight() <= t11.getHeight();
        }

        private static boolean e0(int i11, int i12) {
            return (i11 & i12) == i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (((e) appBarLayout.getChildAt(i11).getLayoutParams()).f41454a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View g0(@NonNull CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof v) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View h0(@NonNull AppBarLayout appBarLayout, int i11) {
            int iAbs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(@NonNull T t11, int i11) {
            int childCount = t11.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (e0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i13 = -i11;
                if (top <= i13 && bottom >= i13) {
                    return i12;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int m0(@NonNull T t11, int i11) {
            int iAbs = Math.abs(i11);
            int childCount = t11.getChildCount();
            int topInset = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= ViewCompat.B(childAt);
                        }
                    }
                    if (ViewCompat.x(childAt)) {
                        topInset -= t11.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f11 = topInset;
                    return Integer.signum(i11) * (childAt.getTop() + Math.round(f11 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f11)));
                }
            }
            return i11;
        }

        private boolean z0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            List<View> dependents = coordinatorLayout.getDependents(t11);
            int size = dependents.size();
            for (int i11 = 0; i11 < size; i11++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) dependents.get(i11).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).O() != 0;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.c
        int Q() {
            return I() + this.f41435k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean L(T t11) {
            WeakReference<View> weakReference = this.f41439o;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int O(@NonNull T t11) {
            return (-t11.getDownNestedScrollRange()) + t11.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int P(@NonNull T t11) {
            return t11.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void R(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            A0(coordinatorLayout, t11);
            if (t11.o()) {
                t11.v(t11.y(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11) {
            boolean zP = super.p(coordinatorLayout, t11, i11);
            int pendingAction = t11.getPendingAction();
            c cVar = this.f41438n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -t11.getUpNestedPreScrollRange();
                        if (z11) {
                            Z(coordinatorLayout, t11, i12, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            T(coordinatorLayout, t11, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            Z(coordinatorLayout, t11, 0, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            T(coordinatorLayout, t11, 0);
                        }
                    }
                }
            } else if (cVar.f41446c) {
                T(coordinatorLayout, t11, -t11.getTotalScrollRange());
            } else if (cVar.f41447d) {
                T(coordinatorLayout, t11, 0);
            } else {
                View childAt = t11.getChildAt(cVar.f41448e);
                T(coordinatorLayout, t11, (-childAt.getBottom()) + (this.f41438n.f41450g ? ViewCompat.B(childAt) + t11.getTopInset() : Math.round(childAt.getHeight() * this.f41438n.f41449f)));
            }
            t11.s();
            this.f41438n = null;
            K(o5.a.b(I(), -t11.getTotalScrollRange(), 0));
            B0(coordinatorLayout, t11, I(), 0, true);
            t11.q(I());
            Y(coordinatorLayout, t11);
            return zP;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13, int i14) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t11.getLayoutParams())).height != -2) {
                return super.q(coordinatorLayout, t11, i11, i12, i13, i14);
            }
            coordinatorLayout.onMeasureChild(t11, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void u(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11, int i12, int[] iArr, int i13) {
            T t12;
            int i14;
            int downNestedPreScrollRange;
            if (i12 == 0) {
                t12 = t11;
            } else {
                if (i12 < 0) {
                    i14 = -t11.getTotalScrollRange();
                    downNestedPreScrollRange = t11.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -t11.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i15 = i14;
                int i16 = downNestedPreScrollRange;
                if (i15 != i16) {
                    t12 = t11;
                    iArr[1] = S(coordinatorLayout, t12, i12, i15, i16);
                } else {
                    t12 = t11;
                }
            }
            if (t12.o()) {
                t12.v(t12.y(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int i16;
            if (i14 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
                iArr[1] = S(coordinatorLayout2, t12, i16, -t11.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                i16 = i14;
            }
            if (i16 == 0) {
                Y(coordinatorLayout2, t12);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, Parcelable parcelable) {
            if (parcelable instanceof c) {
                w0((c) parcelable, true);
                super.B(coordinatorLayout, t11, this.f41438n.a());
            } else {
                super.B(coordinatorLayout, t11, parcelable);
                this.f41438n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11) {
            Parcelable parcelableC = super.C(coordinatorLayout, t11);
            c cVarX0 = x0(parcelableC, t11);
            return cVarX0 == null ? parcelableC : cVarX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, @NonNull View view, View view2, int i11, int i12) {
            ValueAnimator valueAnimator;
            boolean z11 = (i11 & 2) != 0 && (t11.o() || d0(coordinatorLayout, t11, view));
            if (z11 && (valueAnimator = this.f41437m) != null) {
                valueAnimator.cancel();
            }
            this.f41439o = null;
            this.f41436l = i12;
            return z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void G(CoordinatorLayout coordinatorLayout, @NonNull T t11, View view, int i11) {
            if (this.f41436l == 0 || i11 == 1) {
                A0(coordinatorLayout, t11);
                if (t11.o()) {
                    t11.v(t11.y(view));
                }
            }
            this.f41439o = new WeakReference<>(view);
        }

        void w0(c cVar, boolean z11) {
            if (this.f41438n == null || z11) {
                this.f41438n = cVar;
            }
        }

        c x0(Parcelable parcelable, @NonNull T t11) {
            int I = I();
            int childCount = t11.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t11.getChildAt(i11);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = r6.a.f107051b;
                    }
                    c cVar = new c(parcelable);
                    boolean z11 = I == 0;
                    cVar.f41447d = z11;
                    cVar.f41446c = !z11 && (-I) >= t11.getTotalScrollRange();
                    cVar.f41448e = i11;
                    cVar.f41450g = bottom == ViewCompat.B(childAt) + t11.getTopInset();
                    cVar.f41449f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int U(@NonNull CoordinatorLayout coordinatorLayout, @NonNull T t11, int i11, int i12, int i13) {
            CoordinatorLayout coordinatorLayout2;
            T t12;
            int iQ = Q();
            int i14 = 0;
            if (i12 == 0 || iQ < i12 || iQ > i13) {
                coordinatorLayout2 = coordinatorLayout;
                t12 = t11;
                this.f41435k = 0;
            } else {
                int iB = o5.a.b(i11, i12, i13);
                if (iQ != iB) {
                    int iM0 = t11.i() ? m0(t11, iB) : iB;
                    boolean zK = K(iM0);
                    int i15 = iQ - iB;
                    this.f41435k = iB - iM0;
                    if (zK) {
                        while (i14 < t11.getChildCount()) {
                            e eVar = (e) t11.getChildAt(i14).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(t11, t11.getChildAt(i14), I());
                            }
                            i14++;
                        }
                    }
                    if (!zK && t11.i()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t11);
                    }
                    t11.q(I());
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                    B0(coordinatorLayout2, t12, iB, iB < iQ ? -1 : 1, false);
                    i14 = i15;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t12 = t11;
                }
            }
            Y(coordinatorLayout2, t12);
            return i14;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends r6.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f41446c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f41447d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f41448e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f41449f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f41450g;

            class a implements Parcelable.ClassLoaderCreator<c> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(@NonNull Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i11) {
                    return new c[i11];
                }
            }

            public c(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f41446c = parcel.readByte() != 0;
                this.f41447d = parcel.readByte() != 0;
                this.f41448e = parcel.readInt();
                this.f41449f = parcel.readFloat();
                this.f41450g = parcel.readByte() != 0;
            }

            @Override // r6.a, android.os.Parcelable
            public void writeToParcel(@NonNull Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.f41446c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f41447d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f41448e);
                parcel.writeFloat(this.f41449f);
                parcel.writeByte(this.f41450g ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int I() {
            return super.I();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean K(int i11) {
            return super.K(i11);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            return super.o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11) {
            return super.p(coordinatorLayout, appBarLayout, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i11, int i12, int i13, int i14) {
            return super.q(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ void u(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
            super.u(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            super.x(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: s0 */
        public /* bridge */ /* synthetic */ void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, Parcelable parcelable) {
            super.B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout) {
            return super.C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull View view, View view2, int i11, int i12) {
            return super.E(coordinatorLayout, appBarLayout, view, view2, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v0 */
        public /* bridge */ /* synthetic */ void G(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, View view, int i11) {
            super.G(coordinatorLayout, appBarLayout, view, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int V(@NonNull AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).Q();
            }
            return 0;
        }

        private void W(@NonNull View view, @NonNull View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                ViewCompat.a0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f41435k) + Q()) - M(view2));
            }
        }

        private void X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.v(appBarLayout.y(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z11) {
            AppBarLayout appBarLayoutL = L(coordinatorLayout.getDependencies(view));
            if (appBarLayoutL != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f41481d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutL.setExpanded(false, !z11);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.d
        float N(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iV = V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iV > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iV / i11) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.google.android.material.appbar.d
        int P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.P(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout L(@NonNull List<View> list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            W(view, view2);
            X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.p0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
            return super.p(coordinatorLayout, view, i11);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11, int i12, int i13, int i14) {
            return super.q(coordinatorLayout, view, i11, i12, i13, i14);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.Z6);
            S(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f128826a7, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements a0 {
        a() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return AppBarLayout.this.r(windowInsetsCompat);
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t11, int i11);
    }

    public static abstract class c {
        public abstract void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f41452a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f41453b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11) {
            b(this.f41452a, appBarLayout, view);
            float fAbs = this.f41452a.top - Math.abs(f11);
            if (fAbs > BitmapDescriptorFactory.HUE_RED) {
                ViewCompat.w0(view, null);
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - o5.a.a(Math.abs(fAbs / this.f41452a.height()), BitmapDescriptorFactory.HUE_RED, 1.0f);
            float fHeight = (-fAbs) - ((this.f41452a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f41453b);
            this.f41453b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f41453b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            ViewCompat.w0(view, this.f41453b);
        }
    }

    public interface f {
        void a(float f11, int i11);
    }

    public AppBarLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(float f11, float f12) {
        ValueAnimator valueAnimator = this.f41425p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        this.f41425p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f41428s);
        this.f41425p.setInterpolator(this.f41429t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f41426q;
        if (animatorUpdateListener != null) {
            this.f41425p.addUpdateListener(animatorUpdateListener);
        }
        this.f41425p.start();
    }

    private void B() {
        setWillNotDraw(!x());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, st.g gVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.a0(fFloatValue);
        Drawable drawable = appBarLayout.f41431v;
        if (drawable instanceof st.g) {
            ((st.g) drawable).a0(fFloatValue);
        }
        Iterator<f> it = appBarLayout.f41427r.iterator();
        while (it.hasNext()) {
            it.next().a(fFloatValue, gVar.A());
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, st.g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = ht.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.b0(ColorStateList.valueOf(iJ));
        if (appBarLayout.f41431v != null && (num2 = appBarLayout.f41432w) != null && num2.equals(num)) {
            l5.a.n(appBarLayout.f41431v, iJ);
        }
        if (appBarLayout.f41427r.isEmpty()) {
            return;
        }
        for (f fVar : appBarLayout.f41427r) {
            if (gVar.x() != null) {
                fVar.a(BitmapDescriptorFactory.HUE_RED, iJ);
            }
        }
    }

    private void c() {
        WeakReference<View> weakReference = this.f41423n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f41423n = null;
    }

    private Integer d() {
        Drawable drawable = this.f41431v;
        if (drawable instanceof st.g) {
            return Integer.valueOf(((st.g) drawable).A());
        }
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(drawable);
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i11;
        if (this.f41423n == null && (i11 = this.f41422m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i11) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f41422m);
            }
            if (viewFindViewById != null) {
                this.f41423n = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f41423n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((e) getChildAt(i11).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final st.g gVar, @NonNull final ColorStateList colorStateList, @NonNull final ColorStateList colorStateList2) {
        final Integer numF = ht.a.f(getContext(), zs.c.f128599w);
        this.f41426q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f41464a, colorStateList, colorStateList2, gVar, numF, valueAnimator);
            }
        };
        ViewCompat.t0(this, gVar);
    }

    private void m(Context context, final st.g gVar) {
        gVar.Q(context);
        this.f41426q = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f41469a, gVar, valueAnimator);
            }
        };
        ViewCompat.t0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.f41434y;
        BaseBehavior.c cVarX0 = (behavior == null || this.f41411b == -1 || this.f41415f != 0) ? null : behavior.x0(r6.a.f107051b, this);
        this.f41411b = -1;
        this.f41412c = -1;
        this.f41413d = -1;
        if (cVarX0 != null) {
            this.f41434y.w0(cVarX0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof st.g;
    }

    private void t(boolean z11, boolean z12, boolean z13) {
        this.f41415f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    private boolean u(boolean z11) {
        if (this.f41419j == z11) {
            return false;
        }
        this.f41419j = z11;
        refreshDrawableState();
        return true;
    }

    private boolean x() {
        return this.f41431v != null && getTopInset() > 0;
    }

    private boolean z() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.x(childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (x()) {
            int iSave = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, -this.f41410a);
            this.f41431v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f41431v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f41434y = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iB;
        int i11 = this.f41412c;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f41454a;
                if ((i13 & 5) != 5) {
                    if (i12 > 0) {
                        break;
                    }
                } else {
                    int i14 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i13 & 8) != 0) {
                        iB = ViewCompat.B(childAt);
                    } else {
                        if ((i13 & 2) != 0) {
                            iB = measuredHeight - ViewCompat.B(childAt);
                        } else {
                            iMin = i14 + measuredHeight;
                        }
                        if (childCount == 0 && ViewCompat.x(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i12 += iMin;
                    }
                    iMin = i14 + iB;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i12 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i12);
        this.f41412c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i11 = this.f41413d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int iB = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i13 = eVar.f41454a;
                if ((i13 & 1) == 0) {
                    break;
                }
                iB += measuredHeight;
                if ((i13 & 2) != 0) {
                    iB -= ViewCompat.B(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iB);
        this.f41413d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f41422m;
    }

    public st.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof st.g) {
            return (st.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iB = ViewCompat.B(this);
        if (iB == 0) {
            int childCount = getChildCount();
            iB = childCount >= 1 ? ViewCompat.B(getChildAt(childCount - 1)) : 0;
            if (iB == 0) {
                return getHeight() / 3;
            }
        }
        return (iB * 2) + topInset;
    }

    int getPendingAction() {
        return this.f41415f;
    }

    public Drawable getStatusBarForeground() {
        return this.f41431v;
    }

    @Deprecated
    public float getTargetElevation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.f41416g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f41411b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int iB = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f41454a;
                if ((i13 & 1) == 0) {
                    break;
                }
                iB += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i12 == 0 && ViewCompat.x(childAt)) {
                    iB -= getTopInset();
                }
                if ((i13 & 2) != 0) {
                    iB -= ViewCompat.B(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iB);
        this.f41411b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    boolean i() {
        return this.f41414e;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f41421l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        if (this.f41430u == null) {
            this.f41430u = new int[4];
        }
        int[] iArr = this.f41430u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f41419j;
        int i12 = zs.c.f128600w0;
        if (!z11) {
            i12 = -i12;
        }
        iArr[0] = i12;
        iArr[1] = (z11 && this.f41420k) ? zs.c.f128602x0 : -zs.c.f128602x0;
        int i13 = zs.c.f128592s0;
        if (!z11) {
            i13 = -i13;
        }
        iArr[2] = i13;
        iArr[3] = (z11 && this.f41420k) ? zs.c.f128590r0 : -zs.c.f128590r0;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (ViewCompat.x(this) && z()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.a0(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f41414e = false;
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            if (((e) getChildAt(i15).getLayoutParams()).d() != null) {
                this.f41414e = true;
                break;
            }
        }
        Drawable drawable = this.f41431v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f41418i) {
            return;
        }
        if (!this.f41421l && !j()) {
            z12 = false;
        }
        u(z12);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && ViewCompat.x(this) && z()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = o5.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i12));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    void q(int i11) {
        this.f41410a = i11;
        if (!willNotDraw()) {
            ViewCompat.g0(this);
        }
        List<b> list = this.f41417h;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b bVar = this.f41417h.get(i12);
                if (bVar != null) {
                    bVar.a(this, i11);
                }
            }
        }
    }

    WindowInsetsCompat r(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = ViewCompat.x(this) ? windowInsetsCompat : null;
        if (!u5.c.a(this.f41416g, windowInsetsCompat2)) {
            this.f41416g = windowInsetsCompat2;
            B();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    void s() {
        this.f41415f = 0;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h.d(this, f11);
    }

    public void setExpanded(boolean z11) {
        setExpanded(z11, ViewCompat.U(this));
    }

    public void setLiftOnScroll(boolean z11) {
        this.f41421l = z11;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f41422m = -1;
        if (view == null) {
            c();
        } else {
            this.f41423n = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i11) {
        this.f41422m = i11;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.f41418i = z11;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i11);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f41431v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f41431v = drawable != null ? drawable.mutate() : null;
            this.f41432w = d();
            Drawable drawable3 = this.f41431v;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f41431v.setState(getDrawableState());
                }
                l5.a.m(this.f41431v, ViewCompat.A(this));
                this.f41431v.setVisible(getVisibility() == 0, false);
                this.f41431v.setCallback(this);
            }
            B();
            ViewCompat.g0(this);
        }
    }

    public void setStatusBarForegroundColor(int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(int i11) {
        setStatusBarForeground(j.a.b(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        g.b(this, f11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f41431v;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    boolean v(boolean z11) {
        return w(z11, !this.f41418i);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f41431v;
    }

    boolean w(boolean z11, boolean z12) {
        if (!z12 || this.f41420k == z11) {
            return false;
        }
        this.f41420k = z11;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        boolean z13 = this.f41424o;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (z13) {
            float f12 = z11 ? 0.0f : 1.0f;
            if (z11) {
                f11 = 1.0f;
            }
            A(f12, f11);
            return true;
        }
        if (!this.f41421l) {
            return true;
        }
        float f13 = z11 ? 0.0f : this.f41433x;
        if (z11) {
            f11 = this.f41433x;
        }
        A(f13, f11);
        return true;
    }

    boolean y(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.f128555a);
    }

    public void setExpanded(boolean z11, boolean z12) {
        t(z11, z12, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41409z;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f41411b = -1;
        this.f41412c = -1;
        this.f41413d = -1;
        this.f41415f = 0;
        this.f41427r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i13 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            g.a(this);
        }
        g.c(this, attributeSet, i11, i12);
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, m.f128938k, i11, i12, new int[0]);
        ViewCompat.t0(this, typedArrayI.getDrawable(m.f128950l));
        ColorStateList colorStateListA = pt.c.a(context2, typedArrayI, m.f129022r);
        this.f41424o = colorStateListA != null;
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(getBackground());
        if (colorStateListG != null) {
            st.g gVar = new st.g();
            gVar.b0(colorStateListG);
            if (colorStateListA != null) {
                l(gVar, colorStateListG, colorStateListA);
            } else {
                m(context2, gVar);
            }
        }
        this.f41428s = i.f(context2, zs.c.Z, getResources().getInteger(zs.h.f128736a));
        this.f41429t = i.g(context2, zs.c.f128578l0, at.b.f14972a);
        if (typedArrayI.hasValue(m.f128998p)) {
            t(typedArrayI.getBoolean(m.f128998p, false), false, false);
        }
        if (typedArrayI.hasValue(m.f128986o)) {
            g.b(this, typedArrayI.getDimensionPixelSize(m.f128986o, 0));
        }
        if (i13 >= 26) {
            if (typedArrayI.hasValue(m.f128974n)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(m.f128974n, false));
            }
            if (typedArrayI.hasValue(m.f128962m)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(m.f128962m, false));
            }
        }
        this.f41433x = getResources().getDimension(zs.e.f128618a);
        this.f41421l = typedArrayI.getBoolean(m.f129010q, false);
        this.f41422m = typedArrayI.getResourceId(m.f129034s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(m.f129046t));
        typedArrayI.recycle();
        ViewCompat.E0(this, new a());
    }

    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f41454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f41455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f41456c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f41454a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f129070v);
            this.f41454a = typedArrayObtainStyledAttributes.getInt(m.f129094x, 0);
            f(typedArrayObtainStyledAttributes.getInt(m.f129082w, 0));
            if (typedArrayObtainStyledAttributes.hasValue(m.f129105y)) {
                this.f41456c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(m.f129105y, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private c a(int i11) {
            if (i11 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f41455b;
        }

        public int c() {
            return this.f41454a;
        }

        public Interpolator d() {
            return this.f41456c;
        }

        boolean e() {
            int i11 = this.f41454a;
            return (i11 & 1) == 1 && (i11 & 10) != 0;
        }

        public void f(int i11) {
            this.f41455b = a(i11);
        }

        public void g(int i11) {
            this.f41454a = i11;
        }

        public e(int i11, int i12) {
            super(i11, i12);
            this.f41454a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41454a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f41454a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f41454a = 1;
        }
    }
}
