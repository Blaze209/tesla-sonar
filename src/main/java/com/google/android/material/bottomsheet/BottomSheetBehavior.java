package com.google.android.material.bottomsheet;

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
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import st.k;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements nt.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f41586i0 = l.f128804m;
    private boolean A;
    private final BottomSheetBehavior<V>.i B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    int M;
    int N;
    s6.c O;
    private boolean P;
    private int Q;
    private boolean R;
    private float S;
    private int T;
    int U;
    int V;
    WeakReference<V> W;
    WeakReference<View> X;
    WeakReference<View> Y;

    @NonNull
    private final ArrayList<g> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41587a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private VelocityTracker f41588a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41589b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    nt.e f41590b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41591c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f41592c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f41593d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f41594d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41595e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f41596e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41597f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Map<View, Integer> f41598f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41599g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final SparseIntArray f41600g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41601h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final s6.c.AbstractC2350c f41602h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private st.g f41604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f41605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f41615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f41616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f41617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f41618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f41619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private k f41620z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f41621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41622b;

        a(View view, int i11) {
            this.f41621a = view;
            this.f41622b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.h1(this.f41621a, this.f41622b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.Z0(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.W.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f41604j != null) {
                BottomSheetBehavior.this.f41604j.c0(fFloatValue);
            }
        }
    }

    class d implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f41626a;

        d(boolean z11) {
            this.f41626a = z11;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.d0.d
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d0.e eVar) {
            boolean z11;
            k5.e eVarF = windowInsetsCompat.f(WindowInsetsCompat.n.h());
            k5.e eVarF2 = windowInsetsCompat.f(WindowInsetsCompat.n.e());
            BottomSheetBehavior.this.f41618x = eVarF.f84925b;
            boolean zM = d0.m(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f41610p) {
                BottomSheetBehavior.this.f41617w = windowInsetsCompat.j();
                paddingBottom = eVar.f42331d + BottomSheetBehavior.this.f41617w;
            }
            if (BottomSheetBehavior.this.f41611q) {
                paddingLeft = (zM ? eVar.f42330c : eVar.f42328a) + eVarF.f84924a;
            }
            if (BottomSheetBehavior.this.f41612r) {
                paddingRight = (zM ? eVar.f42328a : eVar.f42330c) + eVarF.f84926c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z12 = true;
            if (BottomSheetBehavior.this.f41614t) {
                int i11 = marginLayoutParams.leftMargin;
                int i12 = eVarF.f84924a;
                if (i11 != i12) {
                    marginLayoutParams.leftMargin = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (BottomSheetBehavior.this.f41615u) {
                int i13 = marginLayoutParams.rightMargin;
                int i14 = eVarF.f84926c;
                if (i13 != i14) {
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
            }
            if (BottomSheetBehavior.this.f41616v) {
                int i15 = marginLayoutParams.topMargin;
                int i16 = eVarF.f84925b;
                if (i15 != i16) {
                    marginLayoutParams.topMargin = i16;
                } else {
                    z12 = z11;
                }
            } else {
                z12 = z11;
            }
            if (z12) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f41626a) {
                BottomSheetBehavior.this.f41608n = eVarF2.f84927d;
            }
            if (!BottomSheetBehavior.this.f41610p && !this.f41626a) {
                return windowInsetsCompat;
            }
            BottomSheetBehavior.this.m1(false);
            return windowInsetsCompat;
        }
    }

    class e extends s6.c.AbstractC2350c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41628a;

        e() {
        }

        private boolean n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.s0()) / 2;
        }

        @Override // s6.c.AbstractC2350c
        public int a(@NonNull View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // s6.c.AbstractC2350c
        public int b(@NonNull View view, int i11, int i12) {
            return o5.a.b(i11, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // s6.c.AbstractC2350c
        public int e(@NonNull View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // s6.c.AbstractC2350c
        public void j(int i11) {
            if (i11 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Z0(1);
            }
        }

        @Override // s6.c.AbstractC2350c
        public void k(@NonNull View view, int i11, int i12, int i13, int i14) {
            BottomSheetBehavior.this.o0(i12);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // s6.c.AbstractC2350c
        public void l(@NonNull View view, float f11, float f12) {
            int i11 = 6;
            if (f12 >= BitmapDescriptorFactory.HUE_RED) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J && bottomSheetBehavior.e1(view, f12)) {
                    if ((Math.abs(f11) < Math.abs(f12) && f12 > BottomSheetBehavior.this.f41595e) || n(view)) {
                        i11 = 5;
                    } else if (BottomSheetBehavior.this.f41589b || Math.abs(view.getTop() - BottomSheetBehavior.this.s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.F)) {
                        i11 = 3;
                    }
                } else if (f12 == BitmapDescriptorFactory.HUE_RED || Math.abs(f11) > Math.abs(f12)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f41589b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i12 = bottomSheetBehavior2.F;
                        if (top < i12) {
                            if (top < Math.abs(top - bottomSheetBehavior2.H)) {
                                i11 = 3;
                            } else if (BottomSheetBehavior.this.f1()) {
                                i11 = 4;
                            }
                        } else if (Math.abs(top - i12) >= Math.abs(top - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.f1()) {
                            i11 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.E) < Math.abs(top - BottomSheetBehavior.this.H)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (BottomSheetBehavior.this.f41589b) {
                    i11 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.F) >= Math.abs(top2 - BottomSheetBehavior.this.H) || BottomSheetBehavior.this.f1()) {
                        i11 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f41589b) {
                i11 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f41628a;
                if (BottomSheetBehavior.this.f1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.c1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.V)) {
                        i11 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.F) {
                }
                i11 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.h1(view, i11, bottomSheetBehavior4.g1());
        }

        @Override // s6.c.AbstractC2350c
        public boolean m(@NonNull View view, int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i12 = bottomSheetBehavior.M;
            if (i12 == 1 || bottomSheetBehavior.f41596e0) {
                return false;
            }
            if (i12 == 3 && bottomSheetBehavior.f41592c0 == i11) {
                WeakReference<View> weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f41628a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements AccessibilityViewCommand {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f41630a;

        f(int i11) {
            this.f41630a = i11;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean a(@NonNull View view, AccessibilityViewCommand.a aVar) {
            BottomSheetBehavior.this.Y0(this.f41630a);
            return true;
        }
    }

    public static abstract class g {
        void onLayout(@NonNull View view) {
        }

        public abstract void onSlide(@NonNull View view, float f11);

        public abstract void onStateChanged(@NonNull View view, int i11);
    }

    public BottomSheetBehavior() {
        this.f41587a = 0;
        this.f41589b = true;
        this.f41591c = false;
        this.f41606l = -1;
        this.f41607m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f41594d0 = -1;
        this.f41600g0 = new SparseIntArray();
        this.f41602h0 = new e();
    }

    private boolean A0() {
        if (this.M == 3) {
            return this.f41619y || z0();
        }
        return false;
    }

    private boolean E0(V v11) {
        ViewParent parent = v11.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.S(v11);
    }

    private void H0(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i11) {
        ViewCompat.l0(view, accessibilityActionCompat, null, l0(i11));
    }

    private void I0() {
        this.f41592c0 = -1;
        this.f41594d0 = -1;
        VelocityTracker velocityTracker = this.f41588a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f41588a0 = null;
        }
    }

    private void J0(@NonNull h hVar) {
        int i11 = this.f41587a;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.f41597f = hVar.f41633d;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.f41589b = hVar.f41634e;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.J = hVar.f41635f;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.K = hVar.f41636g;
        }
    }

    private void K0(V v11, Runnable runnable) {
        if (E0(v11)) {
            v11.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int b0(View view, int i11, int i12) {
        return ViewCompat.c(view, view.getResources().getString(i11), l0(i12));
    }

    private void b1(@NonNull View view) {
        boolean z11 = (Build.VERSION.SDK_INT < 29 || B0() || this.f41599g) ? false : true;
        if (this.f41610p || this.f41611q || this.f41612r || this.f41614t || this.f41615u || this.f41616v || z11) {
            d0.g(view, new d(z11));
        }
    }

    private void d0() {
        int iH0 = h0();
        if (this.f41589b) {
            this.H = Math.max(this.V - iH0, this.E);
        } else {
            this.H = this.V - iH0;
        }
    }

    private boolean d1() {
        if (this.O != null) {
            return this.L || this.M == 1;
        }
        return false;
    }

    private float e0(float f11, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > BitmapDescriptorFactory.HUE_RED && f11 > BitmapDescriptorFactory.HUE_RED) {
                return radius / f11;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private void f0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    private float g0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f41604j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (!z0() || (rootWindowInsets = this.W.get().getRootWindowInsets()) == null) ? BitmapDescriptorFactory.HUE_RED : Math.max(e0(this.f41604j.J(), rootWindowInsets.getRoundedCorner(0)), e0(this.f41604j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private int h0() {
        int i11;
        if (this.f41599g) {
            return Math.min(Math.max(this.f41601h, this.V - ((this.U * 9) / 16)), this.T) + this.f41617w;
        }
        return (this.f41609o || this.f41610p || (i11 = this.f41608n) <= 0) ? this.f41597f + this.f41617w : Math.max(this.f41597f, i11 + this.f41603i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1(View view, int i11, boolean z11) {
        int iX0 = x0(i11);
        s6.c cVar = this.O;
        if (cVar == null || (!z11 ? cVar.Q(view, view.getLeft(), iX0) : cVar.O(view.getLeft(), iX0))) {
            Z0(i11);
            return;
        }
        Z0(2);
        k1(i11, true);
        this.B.c(i11);
    }

    private float i0(int i11) {
        float f11;
        float fS0;
        int i12 = this.H;
        if (i11 > i12 || i12 == s0()) {
            int i13 = this.H;
            f11 = i13 - i11;
            fS0 = this.V - i13;
        } else {
            int i14 = this.H;
            f11 = i14 - i11;
            fS0 = i14 - s0();
        }
        return f11 / fS0;
    }

    private void i1() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null) {
            j1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.X;
        if (weakReference2 != null) {
            j1(weakReference2.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j0() {
        return C0() && D0();
    }

    private void j1(View view, int i11) {
        if (view == null) {
            return;
        }
        k0(view, i11);
        if (!this.f41589b && this.M != 6) {
            this.f41600g0.put(i11, b0(view, zs.k.f128766a, 6));
        }
        if (this.J && D0() && this.M != 5) {
            H0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7762y, 5);
        }
        int i12 = this.M;
        if (i12 == 3) {
            H0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7761x, this.f41589b ? 4 : 6);
            return;
        }
        if (i12 == 4) {
            H0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7760w, this.f41589b ? 3 : 6);
        } else {
            if (i12 != 6) {
                return;
            }
            H0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7761x, 4);
            H0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7760w, 3);
        }
    }

    private void k0(View view, int i11) {
        if (view == null) {
            return;
        }
        ViewCompat.j0(view, PKIFailureInfo.signerNotTrusted);
        ViewCompat.j0(view, 262144);
        ViewCompat.j0(view, PKIFailureInfo.badCertTemplate);
        int i12 = this.f41600g0.get(i11, -1);
        if (i12 != -1) {
            ViewCompat.j0(view, i12);
            this.f41600g0.delete(i11);
        }
    }

    private void k1(int i11, boolean z11) {
        boolean zA0;
        ValueAnimator valueAnimator;
        if (i11 == 2 || this.A == (zA0 = A0()) || this.f41604j == null) {
            return;
        }
        this.A = zA0;
        if (!z11 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f41604j.c0(this.A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f41604j.y(), zA0 ? g0() : 1.0f);
            this.C.start();
        }
    }

    private AccessibilityViewCommand l0(int i11) {
        return new f(i11);
    }

    private void l1(boolean z11) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.f41598f0 != null) {
                    return;
                } else {
                    this.f41598f0 = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.W.get()) {
                    if (z11) {
                        this.f41598f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f41591c) {
                            ViewCompat.z0(childAt, 4);
                        }
                    } else if (this.f41591c && (map = this.f41598f0) != null && map.containsKey(childAt)) {
                        ViewCompat.z0(childAt, this.f41598f0.get(childAt).intValue());
                    }
                }
            }
            if (!z11) {
                this.f41598f0 = null;
            } else if (this.f41591c) {
                this.W.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void m0(@NonNull Context context) {
        if (this.f41620z == null) {
            return;
        }
        st.g gVar = new st.g(this.f41620z);
        this.f41604j = gVar;
        gVar.Q(context);
        ColorStateList colorStateList = this.f41605k;
        if (colorStateList != null) {
            this.f41604j.b0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f41604j.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1(boolean z11) {
        V v11;
        if (this.W != null) {
            d0();
            if (this.M != 4 || (v11 = this.W.get()) == null) {
                return;
            }
            if (z11) {
                Y0(4);
            } else {
                v11.requestLayout();
            }
        }
    }

    private void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new c());
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> q0(@NonNull V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int r0(int i11, int i12, int i13, int i14) {
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

    private int x0(int i11) {
        if (i11 == 3) {
            return s0();
        }
        if (i11 == 4) {
            return this.H;
        }
        if (i11 == 5) {
            return this.V;
        }
        if (i11 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i11);
    }

    private float y0() {
        VelocityTracker velocityTracker = this.f41588a0;
        if (velocityTracker == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f41593d);
        return this.f41588a0.getYVelocity(this.f41592c0);
    }

    private boolean z0() {
        WeakReference<V> weakReference = this.W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.W.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.B(coordinatorLayout, v11, hVar.a());
        J0(hVar);
        int i11 = hVar.f41632c;
        if (i11 == 1 || i11 == 2) {
            this.M = 4;
            this.N = 4;
        } else {
            this.M = i11;
            this.N = i11;
        }
    }

    public boolean B0() {
        return this.f41609o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11) {
        return new h(super.C(coordinatorLayout, v11), (BottomSheetBehavior<?>) this);
    }

    public boolean C0() {
        return this.J;
    }

    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, @NonNull View view2, int i11, int i12) {
        this.Q = 0;
        this.R = false;
        return (i11 & 2) != 0;
    }

    public boolean F0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11) {
        WeakReference<View> weakReference;
        int i12 = 3;
        if (v11.getTop() == s0()) {
            Z0(3);
            return;
        }
        if (!F0() || ((weakReference = this.Y) != null && view == weakReference.get() && this.R)) {
            if (this.Q > 0) {
                if (!this.f41589b && v11.getTop() > this.F) {
                    i12 = 6;
                }
            } else if (this.J && e1(v11, y0())) {
                i12 = 5;
            } else if (this.Q == 0) {
                int top = v11.getTop();
                if (!this.f41589b) {
                    int i13 = this.F;
                    if (top < i13) {
                        if (top >= Math.abs(top - this.H)) {
                            if (f1()) {
                                i12 = 4;
                            } else {
                                i12 = 6;
                            }
                        }
                    } else if (Math.abs(top - i13) < Math.abs(top - this.H)) {
                        i12 = 6;
                    } else {
                        i12 = 4;
                    }
                } else if (Math.abs(top - this.E) >= Math.abs(top - this.H)) {
                    i12 = 4;
                }
            } else {
                if (!this.f41589b) {
                    int top2 = v11.getTop();
                    if (Math.abs(top2 - this.F) < Math.abs(top2 - this.H)) {
                        i12 = 6;
                    }
                }
                i12 = 4;
            }
            h1(v11, i12, false);
            this.R = false;
        }
    }

    public void G0(@NonNull g gVar) {
        this.Z.remove(gVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        if (!v11.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (d1()) {
            this.O.F(motionEvent);
        }
        if (actionMasked == 0) {
            I0();
        }
        if (this.f41588a0 == null) {
            this.f41588a0 = VelocityTracker.obtain();
        }
        this.f41588a0.addMovement(motionEvent);
        if (d1() && actionMasked == 2 && !this.P && Math.abs(this.f41594d0 - motionEvent.getY()) > this.O.z()) {
            this.O.b(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public void L0(boolean z11) {
        this.L = z11;
    }

    public void M0(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i11;
        k1(this.M, true);
    }

    public void N0(boolean z11) {
        if (this.f41589b == z11) {
            return;
        }
        this.f41589b = z11;
        if (this.W != null) {
            d0();
        }
        Z0((this.f41589b && this.M == 6) ? 3 : this.M);
        k1(this.M, true);
        i1();
    }

    public void O0(boolean z11) {
        this.f41609o = z11;
    }

    public void P0(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f11;
        if (this.W != null) {
            f0();
        }
    }

    public void Q0(boolean z11) {
        if (this.J != z11) {
            this.J = z11;
            if (!z11 && this.M == 5) {
                Y0(4);
            }
            i1();
        }
    }

    public void R0(int i11) {
        this.f41607m = i11;
    }

    public void S0(int i11) {
        this.f41606l = i11;
    }

    public void T0(int i11) {
        U0(i11, false);
    }

    public final void U0(int i11, boolean z11) {
        if (i11 == -1) {
            if (this.f41599g) {
                return;
            } else {
                this.f41599g = true;
            }
        } else {
            if (!this.f41599g && this.f41597f == i11) {
                return;
            }
            this.f41599g = false;
            this.f41597f = Math.max(0, i11);
        }
        m1(z11);
    }

    public void V0(int i11) {
        this.f41587a = i11;
    }

    public void W0(int i11) {
        this.f41595e = i11;
    }

    public void X0(boolean z11) {
        this.K = z11;
    }

    public void Y0(int i11) {
        if (i11 == 1 || i11 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i11 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.J && i11 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i11);
            return;
        }
        int i12 = (i11 == 6 && this.f41589b && x0(i11) <= this.E) ? 3 : i11;
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            Z0(i11);
        } else {
            V v11 = this.W.get();
            K0(v11, new a(v11, i12));
        }
    }

    void Z0(int i11) {
        V v11;
        if (this.M == i11) {
            return;
        }
        this.M = i11;
        if (i11 == 4 || i11 == 3 || i11 == 6 || (this.J && i11 == 5)) {
            this.N = i11;
        }
        WeakReference<V> weakReference = this.W;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            l1(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            l1(false);
        }
        k1(i11, true);
        for (int i12 = 0; i12 < this.Z.size(); i12++) {
            this.Z.get(i12).onStateChanged(v11, i11);
        }
        i1();
    }

    @Override // nt.b
    public void a(@NonNull androidx.p002activity.b bVar) {
        nt.e eVar = this.f41590b0;
        if (eVar == null) {
            return;
        }
        eVar.j(bVar);
    }

    public void a1(boolean z11) {
        this.f41591c = z11;
    }

    @Override // nt.b
    public void b(@NonNull androidx.p002activity.b bVar) {
        nt.e eVar = this.f41590b0;
        if (eVar == null) {
            return;
        }
        eVar.l(bVar);
    }

    @Override // nt.b
    public void c() {
        nt.e eVar = this.f41590b0;
        if (eVar == null) {
            return;
        }
        androidx.p002activity.b bVarC = eVar.c();
        if (bVarC == null || Build.VERSION.SDK_INT < 34) {
            Y0(this.J ? 5 : 4);
        } else if (this.J) {
            this.f41590b0.h(bVarC, new b());
        } else {
            this.f41590b0.i(bVarC, null);
            Y0(4);
        }
    }

    public void c0(@NonNull g gVar) {
        if (this.Z.contains(gVar)) {
            return;
        }
        this.Z.add(gVar);
    }

    public boolean c1(long j11, float f11) {
        return false;
    }

    @Override // nt.b
    public void d() {
        nt.e eVar = this.f41590b0;
        if (eVar == null) {
            return;
        }
        eVar.f();
    }

    boolean e1(@NonNull View view, float f11) {
        if (this.K) {
            return true;
        }
        if (D0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f11 * this.S)) - ((float) this.H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public boolean f1() {
        return false;
    }

    public boolean g1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(@NonNull CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.W = null;
        this.O = null;
        this.f41590b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.W = null;
        this.O = null;
        this.f41590b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        int i11;
        s6.c cVar;
        if (!v11.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            I0();
        }
        if (this.f41588a0 == null) {
            this.f41588a0 = VelocityTracker.obtain();
        }
        this.f41588a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            this.f41594d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference<View> weakReference = this.Y;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x11, this.f41594d0)) {
                    this.f41592c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f41596e0 = true;
                }
            }
            this.P = this.f41592c0 == -1 && !coordinatorLayout.isPointInChildBounds(v11, x11, this.f41594d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f41596e0 = false;
            this.f41592c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (cVar = this.O) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.Y;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.P || this.M == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i11 = this.f41594d0) == -1 || Math.abs(((float) i11) - motionEvent.getY()) <= ((float) this.O.z())) ? false : true;
    }

    void o0(int i11) {
        V v11 = this.W.get();
        if (v11 == null || this.Z.isEmpty()) {
            return;
        }
        float fI0 = i0(i11);
        for (int i12 = 0; i12 < this.Z.size(); i12++) {
            this.Z.get(i12).onSlide(v11, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        if (ViewCompat.x(coordinatorLayout) && !ViewCompat.x(v11)) {
            v11.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.f41601h = coordinatorLayout.getResources().getDimensionPixelSize(zs.e.f128634i);
            b1(v11);
            ViewCompat.L0(v11, new com.google.android.material.bottomsheet.c(v11));
            this.W = new WeakReference<>(v11);
            this.f41590b0 = new nt.e(v11);
            st.g gVar = this.f41604j;
            if (gVar != null) {
                ViewCompat.t0(v11, gVar);
                st.g gVar2 = this.f41604j;
                float fV = this.I;
                if (fV == -1.0f) {
                    fV = ViewCompat.v(v11);
                }
                gVar2.a0(fV);
            } else {
                ColorStateList colorStateList = this.f41605k;
                if (colorStateList != null) {
                    ViewCompat.u0(v11, colorStateList);
                }
            }
            i1();
            if (ViewCompat.y(v11) == 0) {
                ViewCompat.z0(v11, 1);
            }
        }
        if (this.O == null) {
            this.O = s6.c.o(coordinatorLayout, this.f41602h0);
        }
        int top = v11.getTop();
        coordinatorLayout.onLayoutChild(v11, i11);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = v11.getHeight();
        this.T = height;
        int iMin = this.V;
        int i12 = iMin - height;
        int i13 = this.f41618x;
        if (i12 < i13) {
            if (this.f41613s) {
                int i14 = this.f41607m;
                if (i14 != -1) {
                    iMin = Math.min(iMin, i14);
                }
                this.T = iMin;
            } else {
                int iMin2 = iMin - i13;
                int i15 = this.f41607m;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.T = iMin2;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        f0();
        d0();
        int i16 = this.M;
        if (i16 == 3) {
            ViewCompat.a0(v11, s0());
        } else if (i16 == 6) {
            ViewCompat.a0(v11, this.F);
        } else if (this.J && i16 == 5) {
            ViewCompat.a0(v11, this.V);
        } else if (i16 == 4) {
            ViewCompat.a0(v11, this.H);
        } else if (i16 == 1 || i16 == 2) {
            ViewCompat.a0(v11, top - v11.getTop());
        }
        k1(this.M, false);
        this.Y = new WeakReference<>(p0(v11));
        for (int i17 = 0; i17 < this.Z.size(); i17++) {
            this.Z.get(i17).onLayout(v11);
        }
        return true;
    }

    View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View viewP0 = p0(viewGroup.getChildAt(i11));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(r0(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.f41606l, marginLayoutParams.width), r0(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, this.f41607m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, float f11, float f12) {
        WeakReference<View> weakReference;
        return F0() && (weakReference = this.Y) != null && view == weakReference.get() && (this.M != 3 || super.s(coordinatorLayout, v11, view, f11, f12));
    }

    public int s0() {
        if (this.f41589b) {
            return this.E;
        }
        return Math.max(this.D, this.f41613s ? 0 : this.f41618x);
    }

    public float t0() {
        return this.G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, @NonNull int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Y;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!F0() || view == view2) {
            int top = v11.getTop();
            int i14 = top - i12;
            if (i12 > 0) {
                if (i14 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    ViewCompat.a0(v11, -iS0);
                    Z0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.a0(v11, -i12);
                    Z0(1);
                }
            } else if (i12 < 0 && !view.canScrollVertically(-1)) {
                if (i14 > this.H && !j0()) {
                    int i15 = top - this.H;
                    iArr[1] = i15;
                    ViewCompat.a0(v11, -i15);
                    Z0(4);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i12;
                    ViewCompat.a0(v11, -i12);
                    Z0(1);
                }
            }
            o0(v11.getTop());
            this.Q = i12;
            this.R = true;
        }
    }

    st.g u0() {
        return this.f41604j;
    }

    public int v0() {
        if (this.f41599g) {
            return -1;
        }
        return this.f41597f;
    }

    public int w0() {
        return this.M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
    }

    private class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f41638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f41639c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f41638b = false;
                s6.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.m(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f41637a);
                    return;
                }
                i iVar2 = i.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Z0(iVar2.f41637a);
                }
            }
        }

        private i() {
            this.f41639c = new a();
        }

        void c(int i11) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f41637a = i11;
            if (this.f41638b) {
                return;
            }
            ViewCompat.h0(BottomSheetBehavior.this.W.get(), this.f41639c);
            this.f41638b = true;
        }

        /* synthetic */ i(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f41632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f41634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f41635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f41636g;

        class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        public h(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f41632c = parcel.readInt();
            this.f41633d = parcel.readInt();
            this.f41634e = parcel.readInt() == 1;
            this.f41635f = parcel.readInt() == 1;
            this.f41636g = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f41632c);
            parcel.writeInt(this.f41633d);
            parcel.writeInt(this.f41634e ? 1 : 0);
            parcel.writeInt(this.f41635f ? 1 : 0);
            parcel.writeInt(this.f41636g ? 1 : 0);
        }

        public h(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f41632c = bottomSheetBehavior.M;
            this.f41633d = ((BottomSheetBehavior) bottomSheetBehavior).f41597f;
            this.f41634e = ((BottomSheetBehavior) bottomSheetBehavior).f41589b;
            this.f41635f = bottomSheetBehavior.J;
            this.f41636g = ((BottomSheetBehavior) bottomSheetBehavior).K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i11;
        super(context, attributeSet);
        this.f41587a = 0;
        this.f41589b = true;
        this.f41591c = false;
        this.f41606l = -1;
        this.f41607m = -1;
        this.B = new i(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList<>();
        this.f41594d0 = -1;
        this.f41600g0 = new SparseIntArray();
        this.f41602h0 = new e();
        this.f41603i = context.getResources().getDimensionPixelSize(zs.e.f128661v0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.M0);
        if (typedArrayObtainStyledAttributes.hasValue(m.Q0)) {
            this.f41605k = pt.c.a(context, typedArrayObtainStyledAttributes, m.Q0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.f128916i1)) {
            this.f41620z = k.e(context, attributeSet, zs.c.f128567g, f41586i0).m();
        }
        m0(context);
        n0();
        this.I = typedArrayObtainStyledAttributes.getDimension(m.P0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(m.N0)) {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.N0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(m.O0)) {
            R0(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.O0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(m.W0);
        if (typedValuePeekValue != null && (i11 = typedValuePeekValue.data) == -1) {
            T0(i11);
        } else {
            T0(typedArrayObtainStyledAttributes.getDimensionPixelSize(m.W0, -1));
        }
        Q0(typedArrayObtainStyledAttributes.getBoolean(m.V0, false));
        O0(typedArrayObtainStyledAttributes.getBoolean(m.f128820a1, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(m.T0, true));
        X0(typedArrayObtainStyledAttributes.getBoolean(m.Z0, false));
        L0(typedArrayObtainStyledAttributes.getBoolean(m.R0, true));
        V0(typedArrayObtainStyledAttributes.getInt(m.X0, 0));
        P0(typedArrayObtainStyledAttributes.getFloat(m.U0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(m.S0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            M0(typedValuePeekValue2.data);
        } else {
            M0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(m.S0, 0));
        }
        W0(typedArrayObtainStyledAttributes.getInt(m.Y0, 500));
        this.f41610p = typedArrayObtainStyledAttributes.getBoolean(m.f128868e1, false);
        this.f41611q = typedArrayObtainStyledAttributes.getBoolean(m.f128880f1, false);
        this.f41612r = typedArrayObtainStyledAttributes.getBoolean(m.f128892g1, false);
        this.f41613s = typedArrayObtainStyledAttributes.getBoolean(m.f128904h1, true);
        this.f41614t = typedArrayObtainStyledAttributes.getBoolean(m.f128832b1, false);
        this.f41615u = typedArrayObtainStyledAttributes.getBoolean(m.f128844c1, false);
        this.f41616v = typedArrayObtainStyledAttributes.getBoolean(m.f128856d1, false);
        this.f41619y = typedArrayObtainStyledAttributes.getBoolean(m.f128928j1, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f41593d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
