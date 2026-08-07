package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import nt.h;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import st.k;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements nt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.d f42680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f42681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private st.g f42682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f42683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f42684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SideSheetBehavior<V>.d f42685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f42686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f42688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f42689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s6.c f42690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f42692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference<V> f42697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference<View> f42698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f42699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f42700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f42701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f42702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private final Set<g> f42703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final s6.c.AbstractC2350c f42704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f42679z = zs.k.W;
    private static final int A = l.f128811t;

    class a extends s6.c.AbstractC2350c {
        a() {
        }

        @Override // s6.c.AbstractC2350c
        public int a(@NonNull View view, int i11, int i12) {
            return o5.a.b(i11, SideSheetBehavior.this.f42680a.g(), SideSheetBehavior.this.f42680a.f());
        }

        @Override // s6.c.AbstractC2350c
        public int b(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // s6.c.AbstractC2350c
        public int d(@NonNull View view) {
            return SideSheetBehavior.this.f42693n + SideSheetBehavior.this.k0();
        }

        @Override // s6.c.AbstractC2350c
        public void j(int i11) {
            if (i11 == 1 && SideSheetBehavior.this.f42687h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // s6.c.AbstractC2350c
        public void k(@NonNull View view, int i11, int i12, int i13, int i14) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f42680a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i11);
        }

        @Override // s6.c.AbstractC2350c
        public void l(@NonNull View view, float f11, float f12) {
            int iW = SideSheetBehavior.this.W(view, f11, f12);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, iW, sideSheetBehavior.K0());
        }

        @Override // s6.c.AbstractC2350c
        public boolean m(@NonNull View view, int i11) {
            return (SideSheetBehavior.this.f42688i == 1 || SideSheetBehavior.this.f42697r == null || SideSheetBehavior.this.f42697r.get() != view) ? false : true;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f42697r == null || SideSheetBehavior.this.f42697r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f42697r.get()).requestLayout();
        }
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f42709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f42710c = new Runnable() { // from class: com.google.android.material.sidesheet.f
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.d.a(this.f42714a);
            }
        };

        d() {
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.f42709b = false;
            if (SideSheetBehavior.this.f42690k != null && SideSheetBehavior.this.f42690k.m(true)) {
                dVar.b(dVar.f42708a);
            } else if (SideSheetBehavior.this.f42688i == 2) {
                SideSheetBehavior.this.G0(dVar.f42708a);
            }
        }

        void b(int i11) {
            if (SideSheetBehavior.this.f42697r == null || SideSheetBehavior.this.f42697r.get() == null) {
                return;
            }
            this.f42708a = i11;
            if (this.f42709b) {
                return;
            }
            ViewCompat.h0((View) SideSheetBehavior.this.f42697r.get(), this.f42710c);
            this.f42709b = true;
        }
    }

    public SideSheetBehavior() {
        this.f42685f = new d();
        this.f42687h = true;
        this.f42688i = 5;
        this.f42689j = 5;
        this.f42692m = 0.1f;
        this.f42699t = -1;
        this.f42703x = new LinkedHashSet();
        this.f42704y = new a();
    }

    private void A0(@NonNull V v11, Runnable runnable) {
        if (v0(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void D0(int i11) {
        com.google.android.material.sidesheet.d dVar = this.f42680a;
        if (dVar == null || dVar.j() != i11) {
            if (i11 == 0) {
                this.f42680a = new com.google.android.material.sidesheet.b(this);
                if (this.f42684e == null || s0()) {
                    return;
                }
                k.b bVarV = this.f42684e.v();
                bVarV.J(BitmapDescriptorFactory.HUE_RED).y(BitmapDescriptorFactory.HUE_RED);
                O0(bVarV.m());
                return;
            }
            if (i11 == 1) {
                this.f42680a = new com.google.android.material.sidesheet.a(this);
                if (this.f42684e == null || r0()) {
                    return;
                }
                k.b bVarV2 = this.f42684e.v();
                bVarV2.E(BitmapDescriptorFactory.HUE_RED).u(BitmapDescriptorFactory.HUE_RED);
                O0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i11 + ". Must be 0 or 1.");
        }
    }

    private void E0(@NonNull V v11, int i11) {
        D0(androidx.core.view.k.b(((CoordinatorLayout.f) v11.getLayoutParams()).f7405c, i11) == 3 ? 1 : 0);
    }

    private boolean H0() {
        if (this.f42690k != null) {
            return this.f42687h || this.f42688i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i11, View view, AccessibilityViewCommand.a aVar) {
        sideSheetBehavior.F0(i11);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i11) {
        V v11 = sideSheetBehavior.f42697r.get();
        if (v11 != null) {
            sideSheetBehavior.L0(v11, i11, false);
        }
    }

    private boolean J0(@NonNull V v11) {
        return (v11.isShown() || ViewCompat.p(v11) != null) && this.f42687h;
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f42680a.o(marginLayoutParams, at.b.c(i11, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i11, boolean z11) {
        if (!w0(view, i11, z11)) {
            G0(i11);
        } else {
            G0(2);
            this.f42685f.b(i11);
        }
    }

    private void M0() {
        V v11;
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        ViewCompat.j0(v11, 262144);
        ViewCompat.j0(v11, PKIFailureInfo.badCertTemplate);
        if (this.f42688i != 5) {
            y0(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7762y, 5);
        }
        if (this.f42688i != 3) {
            y0(v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7760w, 3);
        }
    }

    private void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v11 = this.f42697r.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f42680a.o(marginLayoutParams, (int) ((this.f42693n * v11.getScaleX()) + this.f42696q));
        viewF0.requestLayout();
    }

    private void O0(@NonNull k kVar) {
        st.g gVar = this.f42682c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void P0(@NonNull View view) {
        int i11 = this.f42688i == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
    }

    private int U(int i11, V v11) {
        int i12 = this.f42688i;
        if (i12 == 1 || i12 == 2) {
            return i11 - this.f42680a.h(v11);
        }
        if (i12 == 3) {
            return 0;
        }
        if (i12 == 5) {
            return this.f42680a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f42688i);
    }

    private float V(float f11, float f12) {
        return Math.abs(f11 - f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(@NonNull View view, float f11, float f12) {
        if (u0(f11)) {
            return 3;
        }
        if (I0(view, f11)) {
            return (this.f42680a.m(f11, f12) || this.f42680a.l(view)) ? 5 : 3;
        }
        if (f11 != BitmapDescriptorFactory.HUE_RED && e.a(f11, f12)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f42680a.e()) ? 3 : 5;
    }

    private void X() {
        WeakReference<View> weakReference = this.f42698s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f42698s = null;
    }

    private AccessibilityViewCommand Y(final int i11) {
        return new AccessibilityViewCommand() { // from class: tt.b
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean a(View view, AccessibilityViewCommand.a aVar) {
                return SideSheetBehavior.I(this.f115128a, i11, view, aVar);
            }
        };
    }

    private void Z(@NonNull Context context) {
        if (this.f42684e == null) {
            return;
        }
        st.g gVar = new st.g(this.f42684e);
        this.f42682c = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f42683d;
        if (colorStateList != null) {
            this.f42682c.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f42682c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(@NonNull View view, int i11) {
        if (this.f42703x.isEmpty()) {
            return;
        }
        float fB = this.f42680a.b(i11);
        Iterator<g> it = this.f42703x.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void b0(View view) {
        if (ViewCompat.p(view) == null) {
            ViewCompat.s0(view, view.getResources().getString(f42679z));
        }
    }

    private int c0(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
        }
        if (size != 0) {
            i13 = Math.min(size, i13);
        }
        return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
    }

    private ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f42680a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: tt.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(this.f115130a, marginLayoutParams, iC, viewF0, valueAnimator);
            }
        };
    }

    private int h0() {
        com.google.android.material.sidesheet.d dVar = this.f42680a;
        return (dVar == null || dVar.j() == 0) ? 5 : 3;
    }

    private CoordinatorLayout.f q0() {
        V v11;
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference == null || (v11 = weakReference.get()) == null || !(v11.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) v11.getLayoutParams();
    }

    private boolean r0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).leftMargin > 0;
    }

    private boolean s0() {
        CoordinatorLayout.f fVarQ0 = q0();
        return fVarQ0 != null && ((ViewGroup.MarginLayoutParams) fVarQ0).rightMargin > 0;
    }

    private boolean t0(@NonNull MotionEvent motionEvent) {
        return H0() && V((float) this.f42702w, motionEvent.getX()) > ((float) this.f42690k.z());
    }

    private boolean u0(float f11) {
        return this.f42680a.k(f11);
    }

    private boolean v0(@NonNull V v11) {
        ViewParent parent = v11.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.S(v11);
    }

    private boolean w0(View view, int i11, boolean z11) {
        int iL0 = l0(i11);
        s6.c cVarP0 = p0();
        if (cVarP0 == null) {
            return false;
        }
        if (z11) {
            return cVarP0.O(iL0, view.getTop());
        }
        return cVarP0.Q(view, iL0, view.getTop());
    }

    private void x0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i11;
        View viewFindViewById;
        if (this.f42698s != null || (i11 = this.f42699t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i11)) == null) {
            return;
        }
        this.f42698s = new WeakReference<>(viewFindViewById);
    }

    private void y0(V v11, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.l0(v11, accessibilityActionCompat, null, Y(i11));
    }

    private void z0() {
        VelocityTracker velocityTracker = this.f42700u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42700u = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        c cVar = (c) parcelable;
        if (cVar.a() != null) {
            super.B(coordinatorLayout, v11, cVar.a());
        }
        int i11 = cVar.f42707c;
        if (i11 == 1 || i11 == 2) {
            i11 = 5;
        }
        this.f42688i = i11;
        this.f42689j = i11;
    }

    public void B0(int i11) {
        this.f42699t = i11;
        X();
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference != null) {
            V v11 = weakReference.get();
            if (i11 == -1 || !ViewCompat.U(v11)) {
                return;
            }
            v11.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new c(super.C(coordinatorLayout, v11), (SideSheetBehavior<?>) this);
    }

    public void C0(boolean z11) {
        this.f42687h = z11;
    }

    public void F0(final int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i11);
        } else {
            A0(this.f42697r.get(), new Runnable() { // from class: tt.a
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(this.f115126a, i11);
                }
            });
        }
    }

    void G0(int i11) {
        V v11;
        if (this.f42688i == i11) {
            return;
        }
        this.f42688i = i11;
        if (i11 == 3 || i11 == 5) {
            this.f42689j = i11;
        }
        WeakReference<V> weakReference = this.f42697r;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        P0(v11);
        Iterator<g> it = this.f42703x.iterator();
        while (it.hasNext()) {
            it.next().a(v11, i11);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f42688i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f42690k.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f42700u == null) {
            this.f42700u = VelocityTracker.obtain();
        }
        this.f42700u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f42691l && t0(motionEvent)) {
            this.f42690k.b(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f42691l;
    }

    boolean I0(@NonNull View view, float f11) {
        return this.f42680a.n(view, f11);
    }

    public boolean K0() {
        return true;
    }

    @Override // nt.b
    public void a(@NonNull androidx.p002activity.b bVar) {
        h hVar = this.f42701v;
        if (hVar == null) {
            return;
        }
        hVar.j(bVar);
    }

    @Override // nt.b
    public void b(@NonNull androidx.p002activity.b bVar) {
        h hVar = this.f42701v;
        if (hVar == null) {
            return;
        }
        hVar.l(bVar, h0());
        N0();
    }

    @Override // nt.b
    public void c() {
        h hVar = this.f42701v;
        if (hVar == null) {
            return;
        }
        androidx.p002activity.b bVarC = hVar.c();
        if (bVarC == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f42701v.h(bVarC, h0(), new b(), e0());
        }
    }

    @Override // nt.b
    public void d() {
        h hVar = this.f42701v;
        if (hVar == null) {
            return;
        }
        hVar.f();
    }

    int d0() {
        return this.f42693n;
    }

    public View f0() {
        WeakReference<View> weakReference = this.f42698s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f42680a.d();
    }

    public float i0() {
        return this.f42692m;
    }

    float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f42697r = null;
        this.f42690k = null;
        this.f42701v = null;
    }

    int k0() {
        return this.f42696q;
    }

    int l0(int i11) {
        if (i11 == 3) {
            return g0();
        }
        if (i11 == 5) {
            return this.f42680a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i11);
    }

    int m0() {
        return this.f42695p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f42697r = null;
        this.f42690k = null;
        this.f42701v = null;
    }

    int n0() {
        return this.f42694o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        s6.c cVar;
        if (!J0(v11)) {
            this.f42691l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f42700u == null) {
            this.f42700u = VelocityTracker.obtain();
        }
        this.f42700u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f42702w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f42691l) {
            this.f42691l = false;
            return false;
        }
        return (this.f42691l || (cVar = this.f42690k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        if (ViewCompat.x(coordinatorLayout) && !ViewCompat.x(v11)) {
            v11.setFitsSystemWindows(true);
        }
        if (this.f42697r == null) {
            this.f42697r = new WeakReference<>(v11);
            this.f42701v = new h(v11);
            st.g gVar = this.f42682c;
            if (gVar != null) {
                ViewCompat.t0(v11, gVar);
                st.g gVar2 = this.f42682c;
                float fV = this.f42686g;
                if (fV == -1.0f) {
                    fV = ViewCompat.v(v11);
                }
                gVar2.a0(fV);
            } else {
                ColorStateList colorStateList = this.f42683d;
                if (colorStateList != null) {
                    ViewCompat.u0(v11, colorStateList);
                }
            }
            P0(v11);
            M0();
            if (ViewCompat.y(v11) == 0) {
                ViewCompat.z0(v11, 1);
            }
            b0(v11);
        }
        E0(v11, i11);
        if (this.f42690k == null) {
            this.f42690k = s6.c.o(coordinatorLayout, this.f42704y);
        }
        int iH = this.f42680a.h(v11);
        coordinatorLayout.onLayoutChild(v11, i11);
        this.f42694o = coordinatorLayout.getWidth();
        this.f42695p = this.f42680a.i(coordinatorLayout);
        this.f42693n = v11.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        this.f42696q = marginLayoutParams != null ? this.f42680a.a(marginLayoutParams) : 0;
        ViewCompat.Z(v11, U(iH, v11));
        x0(coordinatorLayout);
        for (g gVar3 : this.f42703x) {
            if (gVar3 instanceof g) {
                gVar3.c(v11);
            }
        }
        return true;
    }

    s6.c p0() {
        return this.f42690k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(c0(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, -1, marginLayoutParams.width), c0(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, -1, marginLayoutParams.height));
        return true;
    }

    protected static class c extends r6.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f42707c;

        class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
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
            this.f42707c = parcel.readInt();
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f42707c);
        }

        public c(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f42707c = ((SideSheetBehavior) sideSheetBehavior).f42688i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42685f = new d();
        this.f42687h = true;
        this.f42688i = 5;
        this.f42689j = 5;
        this.f42692m = 0.1f;
        this.f42699t = -1;
        this.f42703x = new LinkedHashSet();
        this.f42704y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.X7);
        if (typedArrayObtainStyledAttributes.hasValue(m.Z7)) {
            this.f42683d = pt.c.a(context, typedArrayObtainStyledAttributes, m.Z7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f128851c8)) {
            this.f42684e = k.e(context, attributeSet, 0, A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f128839b8)) {
            B0(typedArrayObtainStyledAttributes.getResourceId(m.f128839b8, -1));
        }
        Z(context);
        this.f42686g = typedArrayObtainStyledAttributes.getDimension(m.Y7, -1.0f);
        C0(typedArrayObtainStyledAttributes.getBoolean(m.f128827a8, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f42681b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
