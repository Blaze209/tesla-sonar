package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.p0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.v {
    static boolean G0 = false;
    static boolean H0 = false;
    private static final int[] I0 = {R.attr.nestedScrollingEnabled};
    private static final float J0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean K0 = false;
    static final boolean L0 = true;
    static final boolean M0 = true;
    private static final Class<?>[] N0;
    static final Interpolator O0;
    static final d0 P0;
    private boolean A;
    private int A0;
    private int B;
    private int B0;
    boolean C;
    boolean C0;
    private final AccessibilityManager D;
    private final androidx.recyclerview.widget.a0.b D0;
    private List<s> E;
    private final androidx.core.view.i E0;
    boolean F;
    androidx.core.view.h F0;
    boolean G;
    private int H;
    private int I;

    @NonNull
    private m J;
    private EdgeEffect K;
    private EdgeEffect L;
    private EdgeEffect M;
    private EdgeEffect N;
    n O;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13147a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private t f13148a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f13149b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final int f13150b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x f13151c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int f13152c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a0 f13153d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    float f13154d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f13155e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    float f13156e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.f f13157f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f13158f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.a0 f13159g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final f0 f13160g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f13161h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    androidx.recyclerview.widget.k f13162h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Runnable f13163i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    androidx.recyclerview.widget.k.b f13164i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Rect f13165j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final c0 f13166j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f13167k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private v f13168k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f13169l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private List<v> f13170l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    h f13171m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f13172m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    q f13173n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    boolean f13174n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    y f13175o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private n.b f13176o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final List<y> f13177p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f13178p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final ArrayList<p> f13179q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    androidx.recyclerview.widget.v f13180q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList<u> f13181r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private l f13182r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private u f13183s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final int[] f13184s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f13185t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private androidx.core.view.w f13186t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f13187u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final int[] f13188u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f13189v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final int[] f13190v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f13191w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    final int[] f13192w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f13193x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    final List<g0> f13194x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f13195y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private Runnable f13196y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f13197z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f13198z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f13191w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f13185t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f13197z) {
                recyclerView2.f13195y = true;
            } else {
                recyclerView2.A();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.O;
            if (nVar != null) {
                nVar.runPendingAnimations();
            }
            RecyclerView.this.f13178p0 = false;
        }
    }

    public static abstract class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f13203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f13204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f13207f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f13209h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13202a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f13208g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f13210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f13211b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f13212c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f13213d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f13214e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f13215f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f13216g;

            public a(int i11, int i12) {
                this(i11, i12, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f13214e != null && this.f13212c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f13212c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f13213d >= 0;
            }

            public void b(int i11) {
                this.f13213d = i11;
            }

            void c(RecyclerView recyclerView) {
                int i11 = this.f13213d;
                if (i11 >= 0) {
                    this.f13213d = -1;
                    recyclerView.G0(i11);
                    this.f13215f = false;
                } else {
                    if (!this.f13215f) {
                        this.f13216g = 0;
                        return;
                    }
                    e();
                    recyclerView.f13160g0.e(this.f13210a, this.f13211b, this.f13212c, this.f13214e);
                    int i12 = this.f13216g + 1;
                    this.f13216g = i12;
                    if (i12 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f13215f = false;
                }
            }

            public void d(int i11, int i12, int i13, Interpolator interpolator) {
                this.f13210a = i11;
                this.f13211b = i12;
                this.f13212c = i13;
                this.f13214e = interpolator;
                this.f13215f = true;
            }

            public a(int i11, int i12, int i13, Interpolator interpolator) {
                this.f13213d = -1;
                this.f13215f = false;
                this.f13216g = 0;
                this.f13210a = i11;
                this.f13211b = i12;
                this.f13212c = i13;
                this.f13214e = interpolator;
            }
        }

        public interface b {
            PointF c(int i11);
        }

        public PointF a(int i11) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i11);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i11) {
            return this.f13203b.f13173n.I(i11);
        }

        public int c() {
            return this.f13203b.f13173n.P();
        }

        public int d(View view) {
            return this.f13203b.m0(view);
        }

        public q e() {
            return this.f13204c;
        }

        public int f() {
            return this.f13202a;
        }

        public boolean g() {
            return this.f13205d;
        }

        public boolean h() {
            return this.f13206e;
        }

        protected void i(@NonNull PointF pointF) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            float fSqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i11, int i12) {
            PointF pointFA;
            RecyclerView recyclerView = this.f13203b;
            if (this.f13202a == -1 || recyclerView == null) {
                r();
            }
            if (this.f13205d && this.f13207f == null && this.f13204c != null && (pointFA = a(this.f13202a)) != null) {
                float f11 = pointFA.x;
                if (f11 != BitmapDescriptorFactory.HUE_RED || pointFA.y != BitmapDescriptorFactory.HUE_RED) {
                    recyclerView.u1((int) Math.signum(f11), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f13205d = false;
            View view = this.f13207f;
            if (view != null) {
                if (d(view) == this.f13202a) {
                    o(this.f13207f, recyclerView.f13166j0, this.f13208g);
                    this.f13208g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f13207f = null;
                }
            }
            if (this.f13206e) {
                l(i11, i12, recyclerView.f13166j0, this.f13208g);
                boolean zA = this.f13208g.a();
                this.f13208g.c(recyclerView);
                if (zA && this.f13206e) {
                    this.f13205d = true;
                    recyclerView.f13160g0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f13207f = view;
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i11, int i12, @NonNull c0 c0Var, @NonNull a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(@NonNull View view, @NonNull c0 c0Var, @NonNull a aVar);

        public void p(int i11) {
            this.f13202a = i11;
        }

        void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f13160g0.stop();
            if (this.f13209h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f13203b = recyclerView;
            this.f13204c = qVar;
            int i11 = this.f13202a;
            if (i11 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f13166j0.f13217a = i11;
            this.f13206e = true;
            this.f13205d = true;
            this.f13207f = b(f());
            m();
            this.f13203b.f13160g0.d();
            this.f13209h = true;
        }

        protected final void r() {
            if (this.f13206e) {
                this.f13206e = false;
                n();
                this.f13203b.f13166j0.f13217a = -1;
                this.f13207f = null;
                this.f13202a = -1;
                this.f13205d = false;
                this.f13204c.l1(this);
                this.f13204c = null;
                this.f13203b = null;
            }
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    public static class c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f13218b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13229m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f13230n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f13231o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f13232p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13233q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13217a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13219c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13220d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13221e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13222f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f13223g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13224h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13225i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13226j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f13227k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f13228l = false;

        void a(int i11) {
            if ((this.f13221e & i11) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f13221e));
        }

        public int b() {
            return this.f13224h ? this.f13219c - this.f13220d : this.f13222f;
        }

        public int c() {
            return this.f13217a;
        }

        public boolean d() {
            return this.f13217a != -1;
        }

        public boolean e() {
            return this.f13224h;
        }

        void f(h hVar) {
            this.f13221e = 1;
            this.f13222f = hVar.getItemCount();
            this.f13224h = false;
            this.f13225i = false;
            this.f13226j = false;
        }

        public boolean g() {
            return this.f13228l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f13217a + ", mData=" + this.f13218b + ", mItemCount=" + this.f13222f + ", mIsMeasuring=" + this.f13226j + ", mPreviousLayoutItemCount=" + this.f13219c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f13220d + ", mStructureChanged=" + this.f13223g + ", mInPreLayout=" + this.f13224h + ", mRunSimpleAnimations=" + this.f13227k + ", mRunPredictiveAnimations=" + this.f13228l + CoreConstants.CURLY_RIGHT;
        }
    }

    class d implements androidx.recyclerview.widget.a0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void a(g0 g0Var, n.c cVar, n.c cVar2) {
            RecyclerView.this.o(g0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void b(g0 g0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f13173n.s1(g0Var.itemView, recyclerView.f13151c);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void c(g0 g0Var, @NonNull n.c cVar, n.c cVar2) {
            RecyclerView.this.f13151c.O(g0Var);
            RecyclerView.this.q(g0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void d(g0 g0Var, @NonNull n.c cVar, @NonNull n.c cVar2) {
            g0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.F) {
                if (recyclerView.O.animateChange(g0Var, g0Var, cVar, cVar2)) {
                    RecyclerView.this.X0();
                }
            } else if (recyclerView.O.animatePersistence(g0Var, cVar, cVar2)) {
                RecyclerView.this.X0();
            }
        }
    }

    static class d0 extends m {
        d0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class e implements androidx.core.view.i {
        e() {
        }

        @Override // androidx.core.view.i
        public float a() {
            float f11;
            if (RecyclerView.this.f13173n.r()) {
                f11 = RecyclerView.this.f13156e0;
            } else {
                if (!RecyclerView.this.f13173n.q()) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                f11 = RecyclerView.this.f13154d0;
            }
            return -f11;
        }

        @Override // androidx.core.view.i
        public boolean b(float f11) {
            int i11;
            int i12;
            if (RecyclerView.this.f13173n.r()) {
                i12 = (int) f11;
                i11 = 0;
            } else if (RecyclerView.this.f13173n.q()) {
                i11 = (int) f11;
                i12 = 0;
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            RecyclerView.this.L1();
            return RecyclerView.this.j0(i11, i12);
        }

        @Override // androidx.core.view.i
        public void c() {
            RecyclerView.this.L1();
        }
    }

    public static abstract class e0 {
    }

    class f implements androidx.recyclerview.widget.f.b {
        f() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public void a(View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0 != null) {
                g0VarO0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public g0 b(View view) {
            return RecyclerView.o0(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void c(View view, int i11) {
            RecyclerView.this.addView(view, i11);
            RecyclerView.this.E(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void d() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(View view, int i11, ViewGroup.LayoutParams layoutParams) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0 != null) {
                if (!g0VarO0.isTmpDetached() && !g0VarO0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0VarO0 + RecyclerView.this.V());
                }
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "reAttach " + g0VarO0);
                }
                g0VarO0.clearTmpDetachFlag();
            } else if (RecyclerView.G0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i11 + RecyclerView.this.V());
            }
            RecyclerView.this.attachViewToParent(view, i11, layoutParams);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f(int i11) {
            View childAt = getChildAt(i11);
            if (childAt != null) {
                g0 g0VarO0 = RecyclerView.o0(childAt);
                if (g0VarO0 != null) {
                    if (g0VarO0.isTmpDetached() && !g0VarO0.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + g0VarO0 + RecyclerView.this.V());
                    }
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "tmpDetach " + g0VarO0);
                    }
                    g0VarO0.addFlags(256);
                }
            } else if (RecyclerView.G0) {
                throw new IllegalArgumentException("No view at offset " + i11 + RecyclerView.this.V());
            }
            RecyclerView.this.detachViewFromParent(i11);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public View getChildAt(int i11) {
            return RecyclerView.this.getChildAt(i11);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void h(View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0 != null) {
                g0VarO0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(int i11) {
            View childAt = RecyclerView.this.getChildAt(i11);
            if (childAt != null) {
                RecyclerView.this.F(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i11);
        }
    }

    class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f13239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f13240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f13242f;

        f0() {
            Interpolator interpolator = RecyclerView.O0;
            this.f13240d = interpolator;
            this.f13241e = false;
            this.f13242f = false;
            this.f13239c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i11, int i12) {
            int iAbs = Math.abs(i11);
            int iAbs2 = Math.abs(i12);
            boolean z11 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z11) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.h0(RecyclerView.this, this);
        }

        public void b(int i11, int i12) {
            RecyclerView.this.setScrollState(2);
            this.f13238b = 0;
            this.f13237a = 0;
            Interpolator interpolator = this.f13240d;
            Interpolator interpolator2 = RecyclerView.O0;
            if (interpolator != interpolator2) {
                this.f13240d = interpolator2;
                this.f13239c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f13239c.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f13241e) {
                this.f13242f = true;
            } else {
                c();
            }
        }

        public void e(int i11, int i12, int i13, Interpolator interpolator) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = a(i11, i12);
            }
            int i14 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.O0;
            }
            if (this.f13240d != interpolator) {
                this.f13240d = interpolator;
                this.f13239c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f13238b = 0;
            this.f13237a = 0;
            RecyclerView.this.setScrollState(2);
            this.f13239c.startScroll(0, 0, i11, i12, i14);
            d();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            int i12;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f13173n == null) {
                stop();
                return;
            }
            this.f13242f = false;
            this.f13241e = true;
            recyclerView.A();
            OverScroller overScroller = this.f13239c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.f13237a;
                int i15 = currY - this.f13238b;
                this.f13237a = currX;
                this.f13238b = currY;
                int iX = RecyclerView.this.x(i14);
                int iZ = RecyclerView.this.z(i15);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f13192w0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.L(iX, iZ, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f13192w0;
                    iX -= iArr2[0];
                    iZ -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.w(iX, iZ);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f13171m != null) {
                    int[] iArr3 = recyclerView3.f13192w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.u1(iX, iZ, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f13192w0;
                    int i16 = iArr4[0];
                    int i17 = iArr4[1];
                    iX -= i16;
                    iZ -= i17;
                    b0 b0Var = recyclerView4.f13173n.f13256g;
                    if (b0Var != null && !b0Var.g() && b0Var.h()) {
                        int iB = RecyclerView.this.f13166j0.b();
                        if (iB == 0) {
                            b0Var.r();
                        } else if (b0Var.f() >= iB) {
                            b0Var.p(iB - 1);
                            b0Var.j(i16, i17);
                        } else {
                            b0Var.j(i16, i17);
                        }
                    }
                    i12 = i17;
                    i11 = i16;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i18 = iX;
                int i19 = iZ;
                if (!RecyclerView.this.f13179q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f13192w0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.M(i11, i12, i18, i19, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f13192w0;
                int i21 = i18 - iArr6[0];
                int i22 = i19 - iArr6[1];
                if (i11 != 0 || i12 != 0) {
                    recyclerView6.O(i11, i12);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
                b0 b0Var2 = RecyclerView.this.f13173n.f13256g;
                if ((b0Var2 == null || !b0Var2.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i21 < 0) {
                            i13 = -currVelocity;
                        } else {
                            i13 = i21 > 0 ? currVelocity : 0;
                        }
                        if (i22 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i22 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i13, currVelocity);
                    }
                    if (RecyclerView.M0) {
                        RecyclerView.this.f13164i0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.k kVar = recyclerView7.f13162h0;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i11, i12);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            b0 b0Var3 = RecyclerView.this.f13173n.f13256g;
            if (b0Var3 != null && b0Var3.g()) {
                b0Var3.j(0, 0);
            }
            this.f13241e = false;
            if (this.f13242f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.K1(1);
            }
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f13239c.abortAnimation();
        }
    }

    class g implements androidx.recyclerview.widget.a.InterfaceC0218a {
        g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void a(int i11, int i12) {
            RecyclerView.this.N0(i11, i12);
            RecyclerView.this.f13172m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public g0 d(int i11) {
            g0 g0VarG0 = RecyclerView.this.g0(i11, true);
            if (g0VarG0 == null) {
                return null;
            }
            if (!RecyclerView.this.f13157f.n(g0VarG0.itemView)) {
                return g0VarG0;
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void e(int i11, int i12) {
            RecyclerView.this.M0(i11, i12);
            RecyclerView.this.f13172m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void f(int i11, int i12) {
            RecyclerView.this.O0(i11, i12, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f13172m0 = true;
            recyclerView.f13166j0.f13220d += i12;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void g(int i11, int i12) {
            RecyclerView.this.O0(i11, i12, false);
            RecyclerView.this.f13172m0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0218a
        public void h(int i11, int i12, Object obj) {
            RecyclerView.this.N1(i11, i12, obj);
            RecyclerView.this.f13174n0 = true;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i11 = bVar.f13342a;
            if (i11 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f13173n.X0(recyclerView, bVar.f13343b, bVar.f13345d);
                return;
            }
            if (i11 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f13173n.a1(recyclerView2, bVar.f13343b, bVar.f13345d);
            } else if (i11 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f13173n.c1(recyclerView3, bVar.f13343b, bVar.f13345d, bVar.f13344c);
            } else {
                if (i11 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f13173n.Z0(recyclerView4, bVar.f13343b, bVar.f13345d, 1);
            }
        }
    }

    public static abstract class g0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        h<? extends g0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        g0 mShadowedHolder = null;
        g0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        x mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public g0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i11) {
            this.mFlags = i11 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.Q(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
            addFlags(8);
            offsetPosition(i12, z11);
            this.mPosition = i11;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends g0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iK0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iK0 = this.mOwnerRecyclerView.k0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iK0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i11) {
            return (i11 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.Q(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i11, boolean z11) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z11) {
                this.mPreLayoutPosition += i11;
            }
            this.mPosition += i11;
            if (this.itemView.getLayoutParams() != null) {
                ((r) this.itemView.getLayoutParams()).f13276c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i11 = this.mPendingAccessibilityState;
            if (i11 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i11;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.x1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.x1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.G0 && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.u(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i11, int i12) {
            this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
        }

        public final void setIsRecyclable(boolean z11) {
            int i11 = this.mIsRecyclableCount;
            int i12 = z11 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.G0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z11 && i12 == 1) {
                this.mFlags |= 16;
            } else if (z11 && i12 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z11 + ":" + this);
            }
        }

        void setScrapContainer(x xVar, boolean z11) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z11;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.O(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static abstract class h<VH extends g0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh2, int i11) {
            boolean z11 = vh2.mBindingAdapter == null;
            if (z11) {
                vh2.mPosition = i11;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i11);
                }
                vh2.setFlags(1, 519);
                if (q5.k.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(vh2.mItemViewType)));
                }
            }
            vh2.mBindingAdapter = this;
            if (RecyclerView.G0) {
                if (vh2.itemView.getParent() == null && vh2.itemView.isAttachedToWindow() != vh2.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.isTmpDetached() + ", attached to window: " + vh2.itemView.isAttachedToWindow() + ", holder: " + vh2);
                }
                if (vh2.itemView.getParent() == null && vh2.itemView.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            onBindViewHolder(vh2, i11, vh2.getUnmodifiedPayloads());
            if (z11) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f13276c = true;
                }
                Trace.endSection();
            }
        }

        boolean canRestoreState() {
            int iOrdinal = this.mStateRestorationPolicy.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2;
            }
            return getItemCount() > 0;
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i11) {
            try {
                if (q5.k.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i11)));
                }
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i11);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i11;
                Trace.endSection();
                return vh2;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull h<? extends g0> hVar, @NonNull g0 g0Var, int i11) {
            if (hVar == this) {
                return i11;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i11) {
            return -1L;
        }

        public int getItemViewType(int i11) {
            return 0;
        }

        @NonNull
        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i11) {
            this.mObservable.d(i11, 1);
        }

        public final void notifyItemInserted(int i11) {
            this.mObservable.f(i11, 1);
        }

        public final void notifyItemMoved(int i11, int i12) {
            this.mObservable.c(i11, i12);
        }

        public final void notifyItemRangeChanged(int i11, int i12) {
            this.mObservable.d(i11, i12);
        }

        public final void notifyItemRangeInserted(int i11, int i12) {
            this.mObservable.f(i11, i12);
        }

        public final void notifyItemRangeRemoved(int i11, int i12) {
            this.mObservable.g(i11, i12);
        }

        public final void notifyItemRemoved(int i11) {
            this.mObservable.g(i11, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i11);

        public void onBindViewHolder(@NonNull VH vh2, int i11, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i11);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }

        public void registerAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z11) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z11;
        }

        public void setStateRestorationPolicy(@NonNull a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i11, Object obj) {
            this.mObservable.e(i11, 1, obj);
        }

        public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
            this.mObservable.e(i11, i12, obj);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i11, i12, 1);
            }
        }

        public void d(int i11, int i12) {
            e(i11, i12, null);
        }

        public void e(int i11, int i12, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i11, i12, obj);
            }
        }

        public void f(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i11, i12);
            }
        }

        public void g(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i11, i12);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i11, int i12) {
        }

        public void c(int i11, int i12, Object obj) {
            b(i11, i12);
        }

        public void d(int i11, int i12) {
        }

        public void e(int i11, int i12, int i13) {
        }

        public void f(int i11, int i12) {
        }

        public void g() {
        }
    }

    private static final class k {
        public static void a(View view, float f11) {
            try {
                view.setFrameContentVelocity(f11);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
        int a(int i11, int i12);
    }

    public static class m {
        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView, int i11) {
            throw null;
        }
    }

    public static abstract class n {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(@NonNull g0 g0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f13247c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f13248d;

            @NonNull
            public c a(@NonNull g0 g0Var) {
                return b(g0Var, 0);
            }

            @NonNull
            public c b(@NonNull g0 g0Var, int i11) {
                View view = g0Var.itemView;
                this.f13245a = view.getLeft();
                this.f13246b = view.getTop();
                this.f13247c = view.getRight();
                this.f13248d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(g0 g0Var) {
            int i11 = g0Var.mFlags;
            int i12 = i11 & 14;
            if (g0Var.isInvalid()) {
                return 4;
            }
            if ((i11 & 4) == 0) {
                int oldPosition = g0Var.getOldPosition();
                int absoluteAdapterPosition = g0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i12 | 2048;
                }
            }
            return i12;
        }

        public abstract boolean animateAppearance(@NonNull g0 g0Var, c cVar, @NonNull c cVar2);

        public abstract boolean animateChange(@NonNull g0 g0Var, @NonNull g0 g0Var2, @NonNull c cVar, @NonNull c cVar2);

        public abstract boolean animateDisappearance(@NonNull g0 g0Var, @NonNull c cVar, c cVar2);

        public abstract boolean animatePersistence(@NonNull g0 g0Var, @NonNull c cVar, @NonNull c cVar2);

        public boolean canReuseUpdatedViewHolder(@NonNull g0 g0Var) {
            return true;
        }

        public final void dispatchAnimationFinished(@NonNull g0 g0Var) {
            onAnimationFinished(g0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(g0Var);
            }
        }

        public final void dispatchAnimationStarted(@NonNull g0 g0Var) {
            onAnimationStarted(g0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mFinishedListeners.get(i11).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(@NonNull g0 g0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean zIsRunning = isRunning();
            if (aVar != null) {
                if (!zIsRunning) {
                    aVar.a();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(aVar);
            }
            return zIsRunning;
        }

        @NonNull
        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(@NonNull g0 g0Var) {
        }

        public void onAnimationStarted(@NonNull g0 g0Var) {
        }

        @NonNull
        public c recordPostLayoutInformation(@NonNull c0 c0Var, @NonNull g0 g0Var) {
            return obtainHolderInfo().a(g0Var);
        }

        @NonNull
        public c recordPreLayoutInformation(@NonNull c0 c0Var, @NonNull g0 g0Var, int i11, @NonNull List<Object> list) {
            return obtainHolderInfo().a(g0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j11) {
            this.mAddDuration = j11;
        }

        public void setChangeDuration(long j11) {
            this.mChangeDuration = j11;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j11) {
            this.mMoveDuration = j11;
        }

        public void setRemoveDuration(long j11) {
            this.mRemoveDuration = j11;
        }

        public boolean canReuseUpdatedViewHolder(@NonNull g0 g0Var, @NonNull List<Object> list) {
            return canReuseUpdatedViewHolder(g0Var);
        }
    }

    private class o implements n.b {
        o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.b
        public void a(g0 g0Var) {
            g0Var.setIsRecyclable(true);
            if (g0Var.mShadowedHolder != null && g0Var.mShadowingHolder == null) {
                g0Var.mShadowedHolder = null;
            }
            g0Var.mShadowingHolder = null;
            if (g0Var.shouldBeKeptAsChild() || RecyclerView.this.i1(g0Var.itemView) || !g0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(g0Var.itemView, false);
        }
    }

    public static abstract class p {
        @Deprecated
        public void f(@NonNull Rect rect, int i11, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void g(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            f(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void h(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void i(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            h(canvas, recyclerView);
        }

        @Deprecated
        public void j(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void k(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            j(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.f f13250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f13251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.z.b f13252c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.z.b f13253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.z f13254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.z f13255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        b0 f13256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f13257h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f13258i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13259j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f13260k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f13261l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13262m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f13263n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f13264o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f13265p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f13266q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f13267r;

        class a implements androidx.recyclerview.widget.z.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public int a() {
                return q.this.j0();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b() {
                return q.this.t0() - q.this.k0();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c(View view) {
                return q.this.W(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d(View view) {
                return q.this.Z(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public View getChildAt(int i11) {
                return q.this.O(i11);
            }
        }

        class b implements androidx.recyclerview.widget.z.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public int a() {
                return q.this.l0();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b() {
                return q.this.c0() - q.this.i0();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c(View view) {
                return q.this.a0(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d(View view) {
                return q.this.U(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public View getChildAt(int i11) {
                return q.this.O(i11);
            }
        }

        public interface c {
            void a(int i11, int i12);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f13270a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13271b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f13272c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f13273d;
        }

        public q() {
            a aVar = new a();
            this.f13252c = aVar;
            b bVar = new b();
            this.f13253d = bVar;
            this.f13254e = new androidx.recyclerview.widget.z(aVar);
            this.f13255f = new androidx.recyclerview.widget.z(bVar);
            this.f13257h = false;
            this.f13258i = false;
            this.f13259j = false;
            this.f13260k = true;
            this.f13261l = true;
        }

        private void B1(x xVar, int i11, View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0.shouldIgnore()) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "ignoring view " + g0VarO0);
                    return;
                }
                return;
            }
            if (g0VarO0.isInvalid() && !g0VarO0.isRemoved() && !this.f13251b.f13171m.hasStableIds()) {
                w1(i11);
                xVar.H(g0VarO0);
            } else {
                D(i11);
                xVar.I(view);
                this.f13251b.f13159g.k(g0VarO0);
            }
        }

        private static boolean C0(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 > 0 && i11 != i13) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i11;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i11;
            }
            return true;
        }

        private void E(int i11, @NonNull View view) {
            this.f13250a.d(i11);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001a  */
        /* JADX WARN: Code duplicated, block: B:14:0x0022  */
        /* JADX WARN: Code duplicated, block: B:5:0x0010  */
        public static int Q(int i11, int i12, int i13, int i14, boolean z11) {
            int iMax = Math.max(0, i11 - i13);
            if (z11) {
                if (i14 >= 0) {
                    i12 = 1073741824;
                } else if (i14 != -1 || (i12 != Integer.MIN_VALUE && (i12 == 0 || i12 != 1073741824))) {
                    i12 = 0;
                    i14 = 0;
                } else {
                    i14 = iMax;
                }
            } else if (i14 >= 0) {
                i12 = 1073741824;
            } else if (i14 == -1) {
                i14 = iMax;
            } else if (i14 != -2) {
                i12 = 0;
                i14 = 0;
            } else if (i12 == Integer.MIN_VALUE || i12 == 1073741824) {
                i14 = iMax;
                i12 = Integer.MIN_VALUE;
            } else {
                i14 = iMax;
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i14, i12);
        }

        private int[] R(View view, Rect rect) {
            int iJ0 = j0();
            int iL0 = l0();
            int iT0 = t0() - k0();
            int iC0 = c0() - i0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i11 = left - iJ0;
            int iMin = Math.min(0, i11);
            int i12 = top - iL0;
            int iMin2 = Math.min(0, i12);
            int i13 = iWidth - iT0;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, iHeight - iC0);
            if (e0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i11, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i13);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i12, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void l(View view, int i11, boolean z11) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (z11 || g0VarO0.isRemoved()) {
                this.f13251b.f13159g.b(g0VarO0);
            } else {
                this.f13251b.f13159g.p(g0VarO0);
            }
            r rVar = (r) view.getLayoutParams();
            if (g0VarO0.wasReturnedFromScrap() || g0VarO0.isScrap()) {
                if (g0VarO0.isScrap()) {
                    g0VarO0.unScrap();
                } else {
                    g0VarO0.clearReturnedFromScrapFlag();
                }
                this.f13250a.c(view, i11, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f13251b) {
                int iM = this.f13250a.m(view);
                if (i11 == -1) {
                    i11 = this.f13250a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f13251b.indexOfChild(view) + this.f13251b.V());
                }
                if (iM != i11) {
                    this.f13251b.f13173n.H0(iM, i11);
                }
            } else {
                this.f13250a.a(view, i11, false);
                rVar.f13276c = true;
                b0 b0Var = this.f13256g;
                if (b0Var != null && b0Var.h()) {
                    this.f13256g.k(view);
                }
            }
            if (rVar.f13277d) {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f13274a);
                }
                g0VarO0.itemView.invalidate();
                rVar.f13277d = false;
            }
        }

        public static d n0(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qa.d.f105277a, i11, i12);
            dVar.f13270a = typedArrayObtainStyledAttributes.getInt(qa.d.f105278b, 1);
            dVar.f13271b = typedArrayObtainStyledAttributes.getInt(qa.d.f105288l, 1);
            dVar.f13272c = typedArrayObtainStyledAttributes.getBoolean(qa.d.f105287k, false);
            dVar.f13273d = typedArrayObtainStyledAttributes.getBoolean(qa.d.f105289m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int t(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i12, i13) : size;
            }
            return Math.min(size, Math.max(i12, i13));
        }

        private boolean y0(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iJ0 = j0();
            int iL0 = l0();
            int iT0 = t0() - k0();
            int iC0 = c0() - i0();
            Rect rect = this.f13251b.f13165j;
            V(focusedChild, rect);
            return rect.left - i11 < iT0 && rect.right - i11 > iJ0 && rect.top - i12 < iC0 && rect.bottom - i12 > iL0;
        }

        public int A(@NonNull c0 c0Var) {
            return 0;
        }

        public boolean A0(@NonNull x xVar, @NonNull c0 c0Var) {
            return false;
        }

        public void A1() {
            this.f13257h = true;
        }

        public int B(@NonNull c0 c0Var) {
            return 0;
        }

        public boolean B0() {
            return false;
        }

        public void C(@NonNull x xVar) {
            for (int iP = P() - 1; iP >= 0; iP--) {
                B1(xVar, iP, O(iP));
            }
        }

        @SuppressLint({"UnknownNullness"})
        public int C1(int i11, x xVar, c0 c0Var) {
            return 0;
        }

        public void D(int i11) {
            E(i11, O(i11));
        }

        public boolean D0() {
            b0 b0Var = this.f13256g;
            return b0Var != null && b0Var.h();
        }

        public void D1(int i11) {
            if (RecyclerView.H0) {
                Log.e("RecyclerView", "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public boolean E0(@NonNull View view, boolean z11, boolean z12) {
            boolean z13 = this.f13254e.b(view, 24579) && this.f13255f.b(view, 24579);
            return z11 ? z13 : !z13;
        }

        @SuppressLint({"UnknownNullness"})
        public int E1(int i11, x xVar, c0 c0Var) {
            return 0;
        }

        void F(RecyclerView recyclerView) {
            this.f13258i = true;
            M0(recyclerView);
        }

        public void F0(@NonNull View view, int i11, int i12, int i13, int i14) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f13275b;
            view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        void F1(RecyclerView recyclerView) {
            G1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        void G(RecyclerView recyclerView, x xVar) {
            this.f13258i = false;
            O0(recyclerView, xVar);
        }

        public void G0(@NonNull View view, int i11, int i12) {
            r rVar = (r) view.getLayoutParams();
            Rect rectT0 = this.f13251b.t0(view);
            int i13 = i11 + rectT0.left + rectT0.right;
            int i14 = i12 + rectT0.top + rectT0.bottom;
            int iQ = Q(t0(), u0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).width, q());
            int iQ2 = Q(c0(), d0(), l0() + i0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) rVar).height, r());
            if (L1(view, iQ, iQ2, rVar)) {
                view.measure(iQ, iQ2);
            }
        }

        void G1(int i11, int i12) {
            this.f13266q = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.f13264o = mode;
            if (mode == 0 && !RecyclerView.L0) {
                this.f13266q = 0;
            }
            this.f13267r = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f13265p = mode2;
            if (mode2 != 0 || RecyclerView.L0) {
                return;
            }
            this.f13267r = 0;
        }

        public View H(@NonNull View view) {
            View viewY;
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null || (viewY = recyclerView.Y(view)) == null || this.f13250a.n(viewY)) {
                return null;
            }
            return viewY;
        }

        public void H0(int i11, int i12) {
            View viewO = O(i11);
            if (viewO != null) {
                D(i11);
                n(viewO, i12);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.f13251b.toString());
            }
        }

        public void H1(int i11, int i12) {
            this.f13251b.setMeasuredDimension(i11, i12);
        }

        public View I(int i11) {
            int iP = P();
            for (int i12 = 0; i12 < iP; i12++) {
                View viewO = O(i12);
                g0 g0VarO0 = RecyclerView.o0(viewO);
                if (g0VarO0 != null && g0VarO0.getLayoutPosition() == i11 && !g0VarO0.shouldIgnore() && (this.f13251b.f13166j0.e() || !g0VarO0.isRemoved())) {
                    return viewO;
                }
            }
            return null;
        }

        public void I0(int i11) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                recyclerView.K0(i11);
            }
        }

        public void I1(Rect rect, int i11, int i12) {
            H1(t(i11, rect.width() + j0() + k0(), h0()), t(i12, rect.height() + l0() + i0(), g0()));
        }

        @SuppressLint({"UnknownNullness"})
        public abstract r J();

        public void J0(int i11) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                recyclerView.L0(i11);
            }
        }

        void J1(int i11, int i12) {
            int iP = P();
            if (iP == 0) {
                this.f13251b.C(i11, i12);
                return;
            }
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < iP; i17++) {
                View viewO = O(i17);
                Rect rect = this.f13251b.f13165j;
                V(viewO, rect);
                int i18 = rect.left;
                if (i18 < i16) {
                    i16 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i14) {
                    i14 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i15) {
                    i15 = i22;
                }
            }
            this.f13251b.f13165j.set(i16, i14, i13, i15);
            I1(this.f13251b.f13165j, i11, i12);
        }

        @SuppressLint({"UnknownNullness"})
        public r K(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void K0(h hVar, h hVar2) {
        }

        void K1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f13251b = null;
                this.f13250a = null;
                this.f13266q = 0;
                this.f13267r = 0;
            } else {
                this.f13251b = recyclerView;
                this.f13250a = recyclerView.f13157f;
                this.f13266q = recyclerView.getWidth();
                this.f13267r = recyclerView.getHeight();
            }
            this.f13264o = 1073741824;
            this.f13265p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public r L(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof r) {
                return new r((r) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public boolean L0(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i11, int i12) {
            return false;
        }

        boolean L1(View view, int i11, int i12, r rVar) {
            return (!view.isLayoutRequested() && this.f13260k && C0(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) rVar).width) && C0(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int M() {
            return -1;
        }

        public void M0(RecyclerView recyclerView) {
        }

        boolean M1() {
            return false;
        }

        public int N(@NonNull View view) {
            return ((r) view.getLayoutParams()).f13275b.bottom;
        }

        @Deprecated
        public void N0(RecyclerView recyclerView) {
        }

        boolean N1(View view, int i11, int i12, r rVar) {
            return (this.f13260k && C0(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) rVar).width) && C0(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public View O(int i11) {
            androidx.recyclerview.widget.f fVar = this.f13250a;
            if (fVar != null) {
                return fVar.f(i11);
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void O0(RecyclerView recyclerView, x xVar) {
            N0(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void O1(RecyclerView recyclerView, c0 c0Var, int i11) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int P() {
            androidx.recyclerview.widget.f fVar = this.f13250a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public View P0(@NonNull View view, int i11, @NonNull x xVar, @NonNull c0 c0Var) {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void P1(b0 b0Var) {
            b0 b0Var2 = this.f13256g;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.h()) {
                this.f13256g.r();
            }
            this.f13256g = b0Var;
            b0Var.q(this.f13251b, this);
        }

        public void Q0(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f13251b;
            R0(recyclerView.f13151c, recyclerView.f13166j0, accessibilityEvent);
        }

        void Q1() {
            b0 b0Var = this.f13256g;
            if (b0Var != null) {
                b0Var.r();
            }
        }

        public void R0(@NonNull x xVar, @NonNull c0 c0Var, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z11 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f13251b.canScrollVertically(-1) && !this.f13251b.canScrollHorizontally(-1) && !this.f13251b.canScrollHorizontally(1)) {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            h hVar = this.f13251b.f13171m;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public boolean R1() {
            return false;
        }

        public boolean S() {
            RecyclerView recyclerView = this.f13251b;
            return recyclerView != null && recyclerView.f13161h;
        }

        void S0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.f13251b;
            T0(recyclerView.f13151c, recyclerView.f13166j0, accessibilityNodeInfoCompat);
        }

        public int T(@NonNull x xVar, @NonNull c0 c0Var) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null || recyclerView.f13171m == null || !q()) {
                return 1;
            }
            return this.f13251b.f13171m.getItemCount();
        }

        public void T0(@NonNull x xVar, @NonNull c0 c0Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.f13251b.canScrollVertically(-1) || this.f13251b.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(PKIFailureInfo.certRevoked);
                accessibilityNodeInfoCompat.X0(true);
                accessibilityNodeInfoCompat.F0(true);
            }
            if (this.f13251b.canScrollVertically(1) || this.f13251b.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
                accessibilityNodeInfoCompat.X0(true);
                accessibilityNodeInfoCompat.F0(true);
            }
            accessibilityNodeInfoCompat.v0(AccessibilityNodeInfoCompat.d.b(p0(xVar, c0Var), T(xVar, c0Var), A0(xVar, c0Var), q0(xVar, c0Var)));
        }

        public int U(@NonNull View view) {
            return view.getBottom() + N(view);
        }

        void U0(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0 == null || g0VarO0.isRemoved() || this.f13250a.n(g0VarO0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f13251b;
            V0(recyclerView.f13151c, recyclerView.f13166j0, view, accessibilityNodeInfoCompat);
        }

        public void V(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.q0(view, rect);
        }

        public void V0(@NonNull x xVar, @NonNull c0 c0Var, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(r() ? m0(view) : 0, 1, q() ? m0(view) : 0, 1, false, false));
        }

        public int W(@NonNull View view) {
            return view.getLeft() - f0(view);
        }

        public View W0(@NonNull View view, int i11) {
            return null;
        }

        public int X(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).f13275b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void X0(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public int Y(@NonNull View view) {
            Rect rect = ((r) view.getLayoutParams()).f13275b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void Y0(@NonNull RecyclerView recyclerView) {
        }

        public int Z(@NonNull View view) {
            return view.getRight() + o0(view);
        }

        public void Z0(@NonNull RecyclerView recyclerView, int i11, int i12, int i13) {
        }

        public int a() {
            RecyclerView recyclerView = this.f13251b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int a0(@NonNull View view) {
            return view.getTop() - r0(view);
        }

        public void a1(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public View b0() {
            View focusedChild;
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f13250a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void b1(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }

        public int c0() {
            return this.f13267r;
        }

        public void c1(@NonNull RecyclerView recyclerView, int i11, int i12, Object obj) {
            b1(recyclerView, i11, i12);
        }

        public int d0() {
            return this.f13265p;
        }

        @SuppressLint({"UnknownNullness"})
        public void d1(x xVar, c0 c0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int e0() {
            return this.f13251b.getLayoutDirection();
        }

        @SuppressLint({"UnknownNullness"})
        public void e1(c0 c0Var) {
        }

        public int f0(@NonNull View view) {
            return ((r) view.getLayoutParams()).f13275b.left;
        }

        public void f1(@NonNull x xVar, @NonNull c0 c0Var, int i11, int i12) {
            this.f13251b.C(i11, i12);
        }

        public int g0() {
            return ViewCompat.B(this.f13251b);
        }

        @Deprecated
        public boolean g1(@NonNull RecyclerView recyclerView, @NonNull View view, View view2) {
            return D0() || recyclerView.E0();
        }

        @SuppressLint({"UnknownNullness"})
        public void h(View view) {
            i(view, -1);
        }

        public int h0() {
            return ViewCompat.C(this.f13251b);
        }

        public boolean h1(@NonNull RecyclerView recyclerView, @NonNull c0 c0Var, @NonNull View view, View view2) {
            return g1(recyclerView, view, view2);
        }

        @SuppressLint({"UnknownNullness"})
        public void i(View view, int i11) {
            l(view, i11, true);
        }

        public int i0() {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public void i1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void j(View view) {
            k(view, -1);
        }

        public int j0() {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable j1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void k(View view, int i11) {
            l(view, i11, false);
        }

        public int k0() {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void k1(int i11) {
        }

        public int l0() {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        void l1(b0 b0Var) {
            if (this.f13256g == b0Var) {
                this.f13256g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void m(String str) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                recyclerView.r(str);
            }
        }

        public int m0(@NonNull View view) {
            return ((r) view.getLayoutParams()).a();
        }

        boolean m1(int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f13251b;
            return n1(recyclerView.f13151c, recyclerView.f13166j0, i11, bundle);
        }

        public void n(@NonNull View view, int i11) {
            o(view, i11, (r) view.getLayoutParams());
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065 A[PHI: r11
          0x0065: PHI (r11v8 int) = (r11v5 int), (r11v18 int) binds: [B:27:0x0081, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean n1(@NonNull x xVar, @NonNull c0 c0Var, int i11, Bundle bundle) {
            int iL0;
            int iJ0;
            float f11;
            if (this.f13251b == null) {
                return false;
            }
            int iC0 = c0();
            int iT0 = t0();
            Rect rect = new Rect();
            if (this.f13251b.getMatrix().isIdentity() && this.f13251b.getGlobalVisibleRect(rect)) {
                iC0 = rect.height();
                iT0 = rect.width();
            }
            if (i11 == 4096) {
                iL0 = this.f13251b.canScrollVertically(1) ? (iC0 - l0()) - i0() : 0;
                if (this.f13251b.canScrollHorizontally(1)) {
                    iJ0 = (iT0 - j0()) - k0();
                } else {
                    iJ0 = 0;
                }
            } else if (i11 != 8192) {
                iL0 = 0;
                iJ0 = 0;
            } else {
                iL0 = this.f13251b.canScrollVertically(-1) ? -((iC0 - l0()) - i0()) : 0;
                if (this.f13251b.canScrollHorizontally(-1)) {
                    iJ0 = -((iT0 - j0()) - k0());
                } else {
                    iJ0 = 0;
                }
            }
            if (iL0 == 0 && iJ0 == 0) {
                return false;
            }
            if (bundle != null) {
                f11 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f11 < BitmapDescriptorFactory.HUE_RED) {
                    if (!RecyclerView.G0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f11 + ")");
                }
            } else {
                f11 = 1.0f;
            }
            if (Float.compare(f11, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f11) != 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, f11) != 0) {
                    iJ0 = (int) (iJ0 * f11);
                    iL0 = (int) (iL0 * f11);
                }
                this.f13251b.D1(iJ0, iL0, null, Integer.MIN_VALUE, true);
                return true;
            }
            RecyclerView recyclerView = this.f13251b;
            h hVar = recyclerView.f13171m;
            if (hVar == null) {
                return false;
            }
            if (i11 == 4096) {
                recyclerView.E1(hVar.getItemCount() - 1);
            } else if (i11 == 8192) {
                recyclerView.E1(0);
            }
            return true;
        }

        public void o(@NonNull View view, int i11, r rVar) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0.isRemoved()) {
                this.f13251b.f13159g.b(g0VarO0);
            } else {
                this.f13251b.f13159g.p(g0VarO0);
            }
            this.f13250a.c(view, i11, rVar, g0VarO0.isRemoved());
        }

        public int o0(@NonNull View view) {
            return ((r) view.getLayoutParams()).f13275b.right;
        }

        boolean o1(@NonNull View view, int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f13251b;
            return p1(recyclerView.f13151c, recyclerView.f13166j0, view, i11, bundle);
        }

        public void p(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.t0(view));
            }
        }

        public int p0(@NonNull x xVar, @NonNull c0 c0Var) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView == null || recyclerView.f13171m == null || !r()) {
                return 1;
            }
            return this.f13251b.f13171m.getItemCount();
        }

        public boolean p1(@NonNull x xVar, @NonNull c0 c0Var, @NonNull View view, int i11, Bundle bundle) {
            return false;
        }

        public boolean q() {
            return false;
        }

        public int q0(@NonNull x xVar, @NonNull c0 c0Var) {
            return 0;
        }

        public void q1(@NonNull x xVar) {
            for (int iP = P() - 1; iP >= 0; iP--) {
                if (!RecyclerView.o0(O(iP)).shouldIgnore()) {
                    t1(iP, xVar);
                }
            }
        }

        public boolean r() {
            return false;
        }

        public int r0(@NonNull View view) {
            return ((r) view.getLayoutParams()).f13275b.top;
        }

        void r1(x xVar) {
            int iJ = xVar.j();
            for (int i11 = iJ - 1; i11 >= 0; i11--) {
                View viewN = xVar.n(i11);
                g0 g0VarO0 = RecyclerView.o0(viewN);
                if (!g0VarO0.shouldIgnore()) {
                    g0VarO0.setIsRecyclable(false);
                    if (g0VarO0.isTmpDetached()) {
                        this.f13251b.removeDetachedView(viewN, false);
                    }
                    n nVar = this.f13251b.O;
                    if (nVar != null) {
                        nVar.endAnimation(g0VarO0);
                    }
                    g0VarO0.setIsRecyclable(true);
                    xVar.D(viewN);
                }
            }
            xVar.e();
            if (iJ > 0) {
                this.f13251b.invalidate();
            }
        }

        public boolean s(r rVar) {
            return rVar != null;
        }

        public void s0(@NonNull View view, boolean z11, @NonNull Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((r) view.getLayoutParams()).f13275b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f13251b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f13251b.f13169l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void s1(@NonNull View view, @NonNull x xVar) {
            v1(view);
            xVar.G(view);
        }

        public int t0() {
            return this.f13266q;
        }

        public void t1(int i11, @NonNull x xVar) {
            View viewO = O(i11);
            w1(i11);
            xVar.G(viewO);
        }

        @SuppressLint({"UnknownNullness"})
        public void u(int i11, int i12, c0 c0Var, c cVar) {
        }

        public int u0() {
            return this.f13264o;
        }

        public boolean u1(Runnable runnable) {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void v(int i11, c cVar) {
        }

        boolean v0() {
            int iP = P();
            for (int i11 = 0; i11 < iP; i11++) {
                ViewGroup.LayoutParams layoutParams = O(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void v1(View view) {
            this.f13250a.p(view);
        }

        public int w(@NonNull c0 c0Var) {
            return 0;
        }

        public boolean w0() {
            return this.f13258i;
        }

        public void w1(int i11) {
            if (O(i11) != null) {
                this.f13250a.q(i11);
            }
        }

        public int x(@NonNull c0 c0Var) {
            return 0;
        }

        public boolean x0() {
            return this.f13259j;
        }

        public boolean x1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11) {
            return y1(recyclerView, view, rect, z11, false);
        }

        public int y(@NonNull c0 c0Var) {
            return 0;
        }

        public boolean y1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
            int[] iArrR = R(view, rect);
            int i11 = iArrR[0];
            int i12 = iArrR[1];
            if ((z12 && !y0(recyclerView, i11, i12)) || (i11 == 0 && i12 == 0)) {
                return false;
            }
            if (z11) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.A1(i11, i12);
            }
            return true;
        }

        public int z(@NonNull c0 c0Var) {
            return 0;
        }

        public final boolean z0() {
            return this.f13261l;
        }

        public void z1() {
            RecyclerView recyclerView = this.f13251b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    public interface s {
        void b(@NonNull View view);

        void d(@NonNull View view);
    }

    public static abstract class t {
        public abstract boolean a(int i11, int i12);
    }

    public interface u {
        void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void e(boolean z11);
    }

    public static abstract class v {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        }
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f13278a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13279b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set<h<?>> f13280c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<g0> f13281a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f13282b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f13283c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f13284d = 0;

            a() {
            }
        }

        private a i(int i11) {
            a aVar = this.f13278a.get(i11);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f13278a.put(i11, aVar2);
            return aVar2;
        }

        void a() {
            this.f13279b++;
        }

        void b(@NonNull h<?> hVar) {
            this.f13280c.add(hVar);
        }

        public void c() {
            for (int i11 = 0; i11 < this.f13278a.size(); i11++) {
                a aVarValueAt = this.f13278a.valueAt(i11);
                Iterator<g0> it = aVarValueAt.f13281a.iterator();
                while (it.hasNext()) {
                    q6.a.b(it.next().itemView);
                }
                aVarValueAt.f13281a.clear();
            }
        }

        void d() {
            this.f13279b--;
        }

        void e(@NonNull h<?> hVar, boolean z11) {
            this.f13280c.remove(hVar);
            if (this.f13280c.size() != 0 || z11) {
                return;
            }
            for (int i11 = 0; i11 < this.f13278a.size(); i11++) {
                SparseArray<a> sparseArray = this.f13278a;
                ArrayList<g0> arrayList = sparseArray.get(sparseArray.keyAt(i11)).f13281a;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    q6.a.b(arrayList.get(i12).itemView);
                }
            }
        }

        void f(int i11, long j11) {
            a aVarI = i(i11);
            aVarI.f13284d = l(aVarI.f13284d, j11);
        }

        void g(int i11, long j11) {
            a aVarI = i(i11);
            aVarI.f13283c = l(aVarI.f13283c, j11);
        }

        public g0 h(int i11) {
            a aVar = this.f13278a.get(i11);
            if (aVar == null || aVar.f13281a.isEmpty()) {
                return null;
            }
            ArrayList<g0> arrayList = aVar.f13281a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z11) {
            if (hVar != null) {
                d();
            }
            if (!z11 && this.f13279b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(g0 g0Var) {
            int itemViewType = g0Var.getItemViewType();
            ArrayList<g0> arrayList = i(itemViewType).f13281a;
            if (this.f13278a.get(itemViewType).f13282b <= arrayList.size()) {
                q6.a.b(g0Var.itemView);
            } else {
                if (RecyclerView.G0 && arrayList.contains(g0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                g0Var.resetInternal();
                arrayList.add(g0Var);
            }
        }

        long l(long j11, long j12) {
            return j11 == 0 ? j12 : ((j11 / 4) * 3) + (j12 / 4);
        }

        boolean m(int i11, long j11, long j12) {
            long j13 = i(i11).f13284d;
            return j13 == 0 || j11 + j13 < j12;
        }

        boolean n(int i11, long j11, long j12) {
            long j13 = i(i11).f13283c;
            return j13 == 0 || j11 + j13 < j12;
        }
    }

    public final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<g0> f13285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<g0> f13286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<g0> f13287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<g0> f13288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f13291g;

        public x() {
            ArrayList<g0> arrayList = new ArrayList<>();
            this.f13285a = arrayList;
            this.f13286b = null;
            this.f13287c = new ArrayList<>();
            this.f13288d = Collections.unmodifiableList(arrayList);
            this.f13289e = 2;
            this.f13290f = 2;
        }

        private void B(h<?> hVar) {
            C(hVar, false);
        }

        private void C(h<?> hVar, boolean z11) {
            w wVar = this.f13291g;
            if (wVar != null) {
                wVar.e(hVar, z11);
            }
        }

        private boolean M(@NonNull g0 g0Var, int i11, int i12, long j11) {
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = g0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z11 = false;
            if (j11 != Long.MAX_VALUE && !this.f13291g.m(itemViewType, nanoTime, j11)) {
                return false;
            }
            if (g0Var.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(g0Var.itemView, recyclerView.getChildCount(), g0Var.itemView.getLayoutParams());
                z11 = true;
            }
            RecyclerView.this.f13171m.bindViewHolder(g0Var, i11);
            if (z11) {
                RecyclerView.this.detachViewFromParent(g0Var.itemView);
            }
            this.f13291g.f(g0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(g0Var);
            if (RecyclerView.this.f13166j0.e()) {
                g0Var.mPreLayoutPosition = i12;
            }
            return true;
        }

        private void b(g0 g0Var) {
            if (RecyclerView.this.D0()) {
                View view = g0Var.itemView;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.v vVar = RecyclerView.this.f13180q0;
                if (vVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = vVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.v.a) {
                    ((androidx.recyclerview.widget.v.a) aVarN).o(view);
                }
                ViewCompat.p0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z11) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(g0 g0Var) {
            View view = g0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f13291g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f13171m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f13291g.b(RecyclerView.this.f13171m);
            }
        }

        void A() {
            for (int i11 = 0; i11 < this.f13287c.size(); i11++) {
                q6.a.b(this.f13287c.get(i11).itemView);
            }
            B(RecyclerView.this.f13171m);
        }

        void D(View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            g0VarO0.mScrapContainer = null;
            g0VarO0.mInChangeScrap = false;
            g0VarO0.clearReturnedFromScrapFlag();
            H(g0VarO0);
        }

        void E() {
            for (int size = this.f13287c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f13287c.clear();
            if (RecyclerView.M0) {
                RecyclerView.this.f13164i0.b();
            }
        }

        void F(int i11) {
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i11);
            }
            g0 g0Var = this.f13287c.get(i11);
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + g0Var);
            }
            a(g0Var, true);
            this.f13287c.remove(i11);
        }

        public void G(@NonNull View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (g0VarO0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g0VarO0.isScrap()) {
                g0VarO0.unScrap();
            } else if (g0VarO0.wasReturnedFromScrap()) {
                g0VarO0.clearReturnedFromScrapFlag();
            }
            H(g0VarO0);
            if (RecyclerView.this.O == null || g0VarO0.isRecyclable()) {
                return;
            }
            RecyclerView.this.O.endAnimation(g0VarO0);
        }

        void H(g0 g0Var) {
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (g0Var.isScrap() || g0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(g0Var.isScrap());
                sb2.append(" isAttached:");
                sb2.append(g0Var.itemView.getParent() != null);
                sb2.append(RecyclerView.this.V());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (g0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g0Var + RecyclerView.this.V());
            }
            if (g0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.V());
            }
            boolean zDoesTransientStatePreventRecycling = g0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f13171m;
            boolean z14 = hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(g0Var);
            if (RecyclerView.G0 && this.f13287c.contains(g0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + g0Var + RecyclerView.this.V());
            }
            if (z14 || g0Var.isRecyclable()) {
                if (this.f13290f <= 0 || g0Var.hasAnyOfTheFlags(526)) {
                    z11 = false;
                } else {
                    int size = this.f13287c.size();
                    if (size >= this.f13290f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.M0 && size > 0 && !RecyclerView.this.f13164i0.d(g0Var.mPosition)) {
                        int i11 = size - 1;
                        while (i11 >= 0) {
                            if (!RecyclerView.this.f13164i0.d(this.f13287c.get(i11).mPosition)) {
                                break;
                            } else {
                                i11--;
                            }
                        }
                        size = i11 + 1;
                    }
                    this.f13287c.add(size, g0Var);
                    z11 = true;
                }
                if (z11) {
                    z13 = false;
                } else {
                    a(g0Var, true);
                }
                z12 = z11;
            } else {
                if (RecyclerView.H0) {
                    Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.V());
                }
                z13 = false;
            }
            RecyclerView.this.f13159g.q(g0Var);
            if (z12 || z13 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            q6.a.b(g0Var.itemView);
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = null;
        }

        void I(View view) {
            g0 g0VarO0 = RecyclerView.o0(view);
            if (!g0VarO0.hasAnyOfTheFlags(12) && g0VarO0.isUpdated() && !RecyclerView.this.s(g0VarO0)) {
                if (this.f13286b == null) {
                    this.f13286b = new ArrayList<>();
                }
                g0VarO0.setScrapContainer(this, true);
                this.f13286b.add(g0VarO0);
                return;
            }
            if (!g0VarO0.isInvalid() || g0VarO0.isRemoved() || RecyclerView.this.f13171m.hasStableIds()) {
                g0VarO0.setScrapContainer(this, false);
                this.f13285a.add(g0VarO0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.V());
            }
        }

        void J(w wVar) {
            B(RecyclerView.this.f13171m);
            w wVar2 = this.f13291g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f13291g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f13291g.a();
            }
            u();
        }

        void K(e0 e0Var) {
        }

        public void L(int i11) {
            this.f13289e = i11;
            P();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0217  */
        /* JADX WARN: Code duplicated, block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:105:0x0220  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:72:0x0171  */
        /* JADX WARN: Code duplicated, block: B:78:0x019d  */
        /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:88:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:97:0x0201  */
        /* JADX WARN: Code duplicated, block: B:99:0x0209  */
        g0 N(int i11, boolean z11, long j11) {
            g0 g0VarCreateViewHolder;
            boolean z12;
            g0 g0Var;
            boolean z13;
            boolean zM;
            ViewGroup.LayoutParams layoutParams;
            r rVar;
            int iM;
            RecyclerView recyclerViewC0;
            if (i11 < 0 || i11 >= RecyclerView.this.f13166j0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i11 + "(" + i11 + "). Item count:" + RecyclerView.this.f13166j0.b() + RecyclerView.this.V());
            }
            if (RecyclerView.this.f13166j0.e()) {
                g0VarCreateViewHolder = h(i11);
                if (g0VarCreateViewHolder != null) {
                    z12 = true;
                }
                if (g0VarCreateViewHolder == null && (g0VarCreateViewHolder = m(i11, z11)) != null) {
                    if (Q(g0VarCreateViewHolder)) {
                        z12 = true;
                    } else {
                        if (!z11) {
                            g0VarCreateViewHolder.addFlags(4);
                            if (g0VarCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                                g0VarCreateViewHolder.unScrap();
                            } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                                g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            H(g0VarCreateViewHolder);
                        }
                        g0VarCreateViewHolder = null;
                    }
                }
                if (g0VarCreateViewHolder == null) {
                    iM = RecyclerView.this.f13155e.m(i11);
                    if (iM >= 0 || iM >= RecyclerView.this.f13171m.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + iM + ").state:" + RecyclerView.this.f13166j0.b() + RecyclerView.this.V());
                    }
                    int itemViewType = RecyclerView.this.f13171m.getItemViewType(iM);
                    if (RecyclerView.this.f13171m.hasStableIds() && (g0VarCreateViewHolder = l(RecyclerView.this.f13171m.getItemId(iM), itemViewType, z11)) != null) {
                        g0VarCreateViewHolder.mPosition = iM;
                        z12 = true;
                    }
                    if (g0VarCreateViewHolder == null) {
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i11 + ") fetching from shared pool");
                        }
                        g0VarCreateViewHolder = i().h(itemViewType);
                        if (g0VarCreateViewHolder != null) {
                            g0VarCreateViewHolder.resetInternal();
                            if (RecyclerView.K0) {
                                r(g0VarCreateViewHolder);
                            }
                        }
                    }
                    if (g0VarCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j11 != Long.MAX_VALUE && !this.f13291g.n(itemViewType, nanoTime, j11)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        g0VarCreateViewHolder = recyclerView.f13171m.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.M0 && (recyclerViewC0 = RecyclerView.c0(g0VarCreateViewHolder.itemView)) != null) {
                            g0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewC0);
                        }
                        this.f13291g.g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                }
                g0Var = g0VarCreateViewHolder;
                z13 = z12;
                if (z13 && !RecyclerView.this.f13166j0.e() && g0Var.hasAnyOfTheFlags(PKIFailureInfo.certRevoked)) {
                    g0Var.setFlags(0, PKIFailureInfo.certRevoked);
                    if (RecyclerView.this.f13166j0.f13227k) {
                        int iBuildAdapterChangeFlagsForAnimations = n.buildAdapterChangeFlagsForAnimations(g0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.c1(g0Var, recyclerView2.O.recordPreLayoutInformation(recyclerView2.f13166j0, g0Var, iBuildAdapterChangeFlagsForAnimations, g0Var.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.f13166j0.e() || !g0Var.isBound()) {
                    if (g0Var.isBound() || g0Var.needsUpdate() || g0Var.isInvalid()) {
                        if (!RecyclerView.G0 && g0Var.isRemoved()) {
                            throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + g0Var + RecyclerView.this.V());
                        }
                        zM = M(g0Var, RecyclerView.this.f13155e.m(i11), i11, j11);
                    }
                    layoutParams = g0Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                        g0Var.itemView.setLayoutParams(rVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        rVar = (r) layoutParams;
                    } else {
                        rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                        g0Var.itemView.setLayoutParams(rVar);
                    }
                    rVar.f13274a = g0Var;
                    rVar.f13277d = !z13 && zM;
                    return g0Var;
                }
                g0Var.mPreLayoutPosition = i11;
                zM = false;
                layoutParams = g0Var.itemView.getLayoutParams();
                if (layoutParams == null) {
                    rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                    g0Var.itemView.setLayoutParams(rVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                    g0Var.itemView.setLayoutParams(rVar);
                } else {
                    rVar = (r) layoutParams;
                }
                rVar.f13274a = g0Var;
                rVar.f13277d = !z13 && zM;
                return g0Var;
            }
            g0VarCreateViewHolder = null;
            z12 = false;
            if (g0VarCreateViewHolder == null) {
                if (Q(g0VarCreateViewHolder)) {
                    if (!z11) {
                        g0VarCreateViewHolder.addFlags(4);
                        if (g0VarCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                            g0VarCreateViewHolder.unScrap();
                        } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                            g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        H(g0VarCreateViewHolder);
                    }
                    g0VarCreateViewHolder = null;
                } else {
                    z12 = true;
                }
            }
            if (g0VarCreateViewHolder == null) {
                iM = RecyclerView.this.f13155e.m(i11);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + iM + ").state:" + RecyclerView.this.f13166j0.b() + RecyclerView.this.V());
            }
            g0Var = g0VarCreateViewHolder;
            z13 = z12;
            if (z13) {
                g0Var.setFlags(0, PKIFailureInfo.certRevoked);
                if (RecyclerView.this.f13166j0.f13227k) {
                    int iBuildAdapterChangeFlagsForAnimations2 = n.buildAdapterChangeFlagsForAnimations(g0Var) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.c1(g0Var, recyclerView3.O.recordPreLayoutInformation(recyclerView3.f13166j0, g0Var, iBuildAdapterChangeFlagsForAnimations2, g0Var.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.f13166j0.e()) {
                if (g0Var.isBound()) {
                }
                if (!RecyclerView.G0) {
                }
                zM = M(g0Var, RecyclerView.this.f13155e.m(i11), i11, j11);
            } else {
                if (g0Var.isBound()) {
                }
                if (!RecyclerView.G0) {
                }
                zM = M(g0Var, RecyclerView.this.f13155e.m(i11), i11, j11);
            }
            layoutParams = g0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                rVar = (r) RecyclerView.this.generateDefaultLayoutParams();
                g0Var.itemView.setLayoutParams(rVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                rVar = (r) RecyclerView.this.generateLayoutParams(layoutParams);
                g0Var.itemView.setLayoutParams(rVar);
            } else {
                rVar = (r) layoutParams;
            }
            rVar.f13274a = g0Var;
            rVar.f13277d = !z13 && zM;
            return g0Var;
        }

        void O(g0 g0Var) {
            if (g0Var.mInChangeScrap) {
                this.f13286b.remove(g0Var);
            } else {
                this.f13285a.remove(g0Var);
            }
            g0Var.mScrapContainer = null;
            g0Var.mInChangeScrap = false;
            g0Var.clearReturnedFromScrapFlag();
        }

        void P() {
            q qVar = RecyclerView.this.f13173n;
            this.f13290f = this.f13289e + (qVar != null ? qVar.f13262m : 0);
            for (int size = this.f13287c.size() - 1; size >= 0 && this.f13287c.size() > this.f13290f; size--) {
                F(size);
            }
        }

        boolean Q(g0 g0Var) {
            if (g0Var.isRemoved()) {
                if (!RecyclerView.G0 || RecyclerView.this.f13166j0.e()) {
                    return RecyclerView.this.f13166j0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.V());
            }
            int i11 = g0Var.mPosition;
            if (i11 >= 0 && i11 < RecyclerView.this.f13171m.getItemCount()) {
                if (RecyclerView.this.f13166j0.e() || RecyclerView.this.f13171m.getItemViewType(g0Var.mPosition) == g0Var.getItemViewType()) {
                    return !RecyclerView.this.f13171m.hasStableIds() || g0Var.getItemId() == RecyclerView.this.f13171m.getItemId(g0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g0Var + RecyclerView.this.V());
        }

        void R(int i11, int i12) {
            int i13;
            int i14 = i12 + i11;
            for (int size = this.f13287c.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f13287c.get(size);
                if (g0Var != null && (i13 = g0Var.mPosition) >= i11 && i13 < i14) {
                    g0Var.addFlags(2);
                    F(size);
                }
            }
        }

        void a(@NonNull g0 g0Var, boolean z11) {
            RecyclerView.u(g0Var);
            View view = g0Var.itemView;
            androidx.recyclerview.widget.v vVar = RecyclerView.this.f13180q0;
            if (vVar != null) {
                androidx.core.view.a aVarN = vVar.n();
                ViewCompat.p0(view, aVarN instanceof androidx.recyclerview.widget.v.a ? ((androidx.recyclerview.widget.v.a) aVarN).n(view) : null);
            }
            if (z11) {
                g(g0Var);
            }
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = null;
            i().k(g0Var);
        }

        public void c() {
            this.f13285a.clear();
            E();
        }

        void d() {
            int size = this.f13287c.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f13287c.get(i11).clearOldPosition();
            }
            int size2 = this.f13285a.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f13285a.get(i12).clearOldPosition();
            }
            ArrayList<g0> arrayList = this.f13286b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    this.f13286b.get(i13).clearOldPosition();
                }
            }
        }

        void e() {
            this.f13285a.clear();
            ArrayList<g0> arrayList = this.f13286b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i11) {
            if (i11 >= 0 && i11 < RecyclerView.this.f13166j0.b()) {
                return !RecyclerView.this.f13166j0.e() ? i11 : RecyclerView.this.f13155e.m(i11);
            }
            throw new IndexOutOfBoundsException("invalid position " + i11 + ". State item count is " + RecyclerView.this.f13166j0.b() + RecyclerView.this.V());
        }

        void g(@NonNull g0 g0Var) {
            y yVar = RecyclerView.this.f13175o;
            if (yVar != null) {
                yVar.a(g0Var);
            }
            int size = RecyclerView.this.f13177p.size();
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView.this.f13177p.get(i11).a(g0Var);
            }
            h hVar = RecyclerView.this.f13171m;
            if (hVar != null) {
                hVar.onViewRecycled(g0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f13166j0 != null) {
                recyclerView.f13159g.q(g0Var);
            }
            if (RecyclerView.H0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + g0Var);
            }
        }

        g0 h(int i11) {
            int size;
            int iM;
            ArrayList<g0> arrayList = this.f13286b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    g0 g0Var = this.f13286b.get(i12);
                    if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i11) {
                        g0Var.addFlags(32);
                        return g0Var;
                    }
                }
                if (RecyclerView.this.f13171m.hasStableIds() && (iM = RecyclerView.this.f13155e.m(i11)) > 0 && iM < RecyclerView.this.f13171m.getItemCount()) {
                    long itemId = RecyclerView.this.f13171m.getItemId(iM);
                    for (int i13 = 0; i13 < size; i13++) {
                        g0 g0Var2 = this.f13286b.get(i13);
                        if (!g0Var2.wasReturnedFromScrap() && g0Var2.getItemId() == itemId) {
                            g0Var2.addFlags(32);
                            return g0Var2;
                        }
                    }
                }
            }
            return null;
        }

        w i() {
            if (this.f13291g == null) {
                this.f13291g = new w();
                u();
            }
            return this.f13291g;
        }

        int j() {
            return this.f13285a.size();
        }

        @NonNull
        public List<g0> k() {
            return this.f13288d;
        }

        g0 l(long j11, int i11, boolean z11) {
            for (int size = this.f13285a.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f13285a.get(size);
                if (g0Var.getItemId() == j11 && !g0Var.wasReturnedFromScrap()) {
                    if (i11 == g0Var.getItemViewType()) {
                        g0Var.addFlags(32);
                        if (g0Var.isRemoved() && !RecyclerView.this.f13166j0.e()) {
                            g0Var.setFlags(2, 14);
                        }
                        return g0Var;
                    }
                    if (!z11) {
                        this.f13285a.remove(size);
                        RecyclerView.this.removeDetachedView(g0Var.itemView, false);
                        D(g0Var.itemView);
                    }
                }
            }
            int size2 = this.f13287c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                g0 g0Var2 = this.f13287c.get(size2);
                if (g0Var2.getItemId() == j11 && !g0Var2.isAttachedToTransitionOverlay()) {
                    if (i11 == g0Var2.getItemViewType()) {
                        if (!z11) {
                            this.f13287c.remove(size2);
                        }
                        return g0Var2;
                    }
                    if (!z11) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        g0 m(int i11, boolean z11) {
            View viewE;
            int size = this.f13285a.size();
            for (int i12 = 0; i12 < size; i12++) {
                g0 g0Var = this.f13285a.get(i12);
                if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i11 && !g0Var.isInvalid() && (RecyclerView.this.f13166j0.f13224h || !g0Var.isRemoved())) {
                    g0Var.addFlags(32);
                    return g0Var;
                }
            }
            if (!z11 && (viewE = RecyclerView.this.f13157f.e(i11)) != null) {
                g0 g0VarO0 = RecyclerView.o0(viewE);
                RecyclerView.this.f13157f.s(viewE);
                int iM = RecyclerView.this.f13157f.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f13157f.d(iM);
                    I(viewE);
                    g0VarO0.addFlags(8224);
                    return g0VarO0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g0VarO0 + RecyclerView.this.V());
            }
            int size2 = this.f13287c.size();
            for (int i13 = 0; i13 < size2; i13++) {
                g0 g0Var2 = this.f13287c.get(i13);
                if (!g0Var2.isInvalid() && g0Var2.getLayoutPosition() == i11 && !g0Var2.isAttachedToTransitionOverlay()) {
                    if (!z11) {
                        this.f13287c.remove(i13);
                    }
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i11 + ") found match in cache: " + g0Var2);
                    }
                    return g0Var2;
                }
            }
            return null;
        }

        View n(int i11) {
            return this.f13285a.get(i11).itemView;
        }

        @NonNull
        public View o(int i11) {
            return p(i11, false);
        }

        View p(int i11, boolean z11) {
            return N(i11, z11, Long.MAX_VALUE).itemView;
        }

        void s() {
            int size = this.f13287c.size();
            for (int i11 = 0; i11 < size; i11++) {
                r rVar = (r) this.f13287c.get(i11).itemView.getLayoutParams();
                if (rVar != null) {
                    rVar.f13276c = true;
                }
            }
        }

        void t() {
            int size = this.f13287c.size();
            for (int i11 = 0; i11 < size; i11++) {
                g0 g0Var = this.f13287c.get(i11);
                if (g0Var != null) {
                    g0Var.addFlags(6);
                    g0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f13171m;
            if (hVar == null || !hVar.hasStableIds()) {
                E();
            }
        }

        void v(int i11, int i12) {
            int size = this.f13287c.size();
            for (int i13 = 0; i13 < size; i13++) {
                g0 g0Var = this.f13287c.get(i13);
                if (g0Var != null && g0Var.mPosition >= i11) {
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + g0Var + " now at position " + (g0Var.mPosition + i12));
                    }
                    g0Var.offsetPosition(i12, false);
                }
            }
        }

        void w(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (i11 < i12) {
                i13 = -1;
                i15 = i11;
                i14 = i12;
            } else {
                i13 = 1;
                i14 = i11;
                i15 = i12;
            }
            int size = this.f13287c.size();
            for (int i17 = 0; i17 < size; i17++) {
                g0 g0Var = this.f13287c.get(i17);
                if (g0Var != null && (i16 = g0Var.mPosition) >= i15 && i16 <= i14) {
                    if (i16 == i11) {
                        g0Var.offsetPosition(i12 - i11, false);
                    } else {
                        g0Var.offsetPosition(i13, false);
                    }
                    if (RecyclerView.H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i17 + " holder " + g0Var);
                    }
                }
            }
        }

        void x(int i11, int i12, boolean z11) {
            int i13 = i11 + i12;
            for (int size = this.f13287c.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f13287c.get(size);
                if (g0Var != null) {
                    int i14 = g0Var.mPosition;
                    if (i14 >= i13) {
                        if (RecyclerView.H0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + g0Var + " now at position " + (g0Var.mPosition - i12));
                        }
                        g0Var.offsetPosition(-i12, z11);
                    } else if (i14 >= i11) {
                        g0Var.addFlags(8);
                        F(size);
                    }
                }
            }
        }

        void y(h<?> hVar, h<?> hVar2, boolean z11) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z11);
            u();
        }

        void z() {
            u();
        }
    }

    public interface y {
        void a(@NonNull g0 g0Var);
    }

    private class z extends j {
        z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.r(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f13166j0.f13223g = true;
            recyclerView.a1(true);
            if (RecyclerView.this.f13155e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i11, int i12, Object obj) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13155e.r(i11, i12, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13155e.s(i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i11, int i12, int i13) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13155e.t(i11, i12, i13)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i11, int i12) {
            RecyclerView.this.r(null);
            if (RecyclerView.this.f13155e.u(i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f13153d == null || (hVar = recyclerView.f13171m) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f13187u && recyclerView.f13185t) {
                ViewCompat.h0(recyclerView, recyclerView.f13163i);
            } else {
                recyclerView.C = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        N0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        O0 = new c();
        P0 = new d0();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void A0() {
        this.f13157f = new androidx.recyclerview.widget.f(new f());
    }

    private void B(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strS0 = s0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strS0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(N0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                } catch (NoSuchMethodException e11) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e12) {
                        e12.initCause(e11);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strS0, e12);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strS0, e13);
            } catch (ClassNotFoundException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strS0, e14);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strS0, e15);
            } catch (InstantiationException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strS0, e17);
            }
        }
    }

    private boolean D(int i11, int i12) {
        b0(this.f13184s0);
        int[] iArr = this.f13184s0;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private boolean F0(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f13165j.set(0, 0, view.getWidth(), view.getHeight());
        this.f13167k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f13165j);
        offsetDescendantRectToMyCoords(view2, this.f13167k);
        byte b11 = -1;
        int i13 = this.f13173n.e0() == 1 ? -1 : 1;
        Rect rect = this.f13165j;
        int i14 = rect.left;
        Rect rect2 = this.f13167k;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            b11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                b11 = 0;
            }
        }
        if (i11 == 1) {
            return b11 < 0 || (b11 == 0 && i12 * i13 < 0);
        }
        if (i11 == 2) {
            return b11 > 0 || (b11 == 0 && i12 * i13 > 0);
        }
        if (i11 == 17) {
            return i12 < 0;
        }
        if (i11 == 33) {
            return b11 < 0;
        }
        if (i11 == 66) {
            return i12 > 0;
        }
        if (i11 == 130) {
            return b11 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i11 + V());
    }

    private void G() {
        int i11 = this.B;
        this.B = 0;
        if (i11 == 0 || !D0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        z5.b.b(accessibilityEventObtain, i11);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H1(int i11) {
        boolean zQ = this.f13173n.q();
        int i12 = zQ;
        if (this.f13173n.r()) {
            i12 = (zQ ? 1 : 0) | 2;
        }
        G1(i12, i11);
    }

    private void I() {
        this.f13166j0.a(1);
        W(this.f13166j0);
        this.f13166j0.f13226j = false;
        F1();
        this.f13159g.f();
        R0();
        Z0();
        r1();
        c0 c0Var = this.f13166j0;
        c0Var.f13225i = c0Var.f13227k && this.f13174n0;
        this.f13174n0 = false;
        this.f13172m0 = false;
        c0Var.f13224h = c0Var.f13228l;
        c0Var.f13222f = this.f13171m.getItemCount();
        b0(this.f13184s0);
        if (this.f13166j0.f13227k) {
            int iG = this.f13157f.g();
            for (int i11 = 0; i11 < iG; i11++) {
                g0 g0VarO0 = o0(this.f13157f.f(i11));
                if (!g0VarO0.shouldIgnore() && (!g0VarO0.isInvalid() || this.f13171m.hasStableIds())) {
                    this.f13159g.e(g0VarO0, this.O.recordPreLayoutInformation(this.f13166j0, g0VarO0, n.buildAdapterChangeFlagsForAnimations(g0VarO0), g0VarO0.getUnmodifiedPayloads()));
                    if (this.f13166j0.f13225i && g0VarO0.isUpdated() && !g0VarO0.isRemoved() && !g0VarO0.shouldIgnore() && !g0VarO0.isInvalid()) {
                        this.f13159g.c(l0(g0VarO0), g0VarO0);
                    }
                }
            }
        }
        if (this.f13166j0.f13228l) {
            s1();
            c0 c0Var2 = this.f13166j0;
            boolean z11 = c0Var2.f13223g;
            c0Var2.f13223g = false;
            this.f13173n.d1(this.f13151c, c0Var2);
            this.f13166j0.f13223g = z11;
            for (int i12 = 0; i12 < this.f13157f.g(); i12++) {
                g0 g0VarO1 = o0(this.f13157f.f(i12));
                if (!g0VarO1.shouldIgnore() && !this.f13159g.i(g0VarO1)) {
                    int iBuildAdapterChangeFlagsForAnimations = n.buildAdapterChangeFlagsForAnimations(g0VarO1);
                    boolean zHasAnyOfTheFlags = g0VarO1.hasAnyOfTheFlags(PKIFailureInfo.certRevoked);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    n.c cVarRecordPreLayoutInformation = this.O.recordPreLayoutInformation(this.f13166j0, g0VarO1, iBuildAdapterChangeFlagsForAnimations, g0VarO1.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        c1(g0VarO1, cVarRecordPreLayoutInformation);
                    } else {
                        this.f13159g.a(g0VarO1, cVarRecordPreLayoutInformation);
                    }
                }
            }
            v();
        } else {
            v();
        }
        S0();
        J1(false);
        this.f13166j0.f13221e = 2;
    }

    private boolean I1(MotionEvent motionEvent) {
        boolean z11;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || androidx.core.widget.h.b(edgeEffect) == BitmapDescriptorFactory.HUE_RED || canScrollHorizontally(-1)) {
            z11 = false;
        } else {
            androidx.core.widget.h.d(this.K, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getY() / getHeight()));
            z11 = true;
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && androidx.core.widget.h.b(edgeEffect2) != BitmapDescriptorFactory.HUE_RED && !canScrollHorizontally(1)) {
            androidx.core.widget.h.d(this.M, BitmapDescriptorFactory.HUE_RED, motionEvent.getY() / getHeight());
            z11 = true;
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && androidx.core.widget.h.b(edgeEffect3) != BitmapDescriptorFactory.HUE_RED && !canScrollVertically(-1)) {
            androidx.core.widget.h.d(this.L, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
            z11 = true;
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 == null || androidx.core.widget.h.b(edgeEffect4) == BitmapDescriptorFactory.HUE_RED || canScrollVertically(1)) {
            return z11;
        }
        androidx.core.widget.h.d(this.N, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void J() {
        F1();
        R0();
        this.f13166j0.a(6);
        this.f13155e.j();
        this.f13166j0.f13222f = this.f13171m.getItemCount();
        this.f13166j0.f13220d = 0;
        if (this.f13153d != null && this.f13171m.canRestoreState()) {
            Parcelable parcelable = this.f13153d.f13200c;
            if (parcelable != null) {
                this.f13173n.i1(parcelable);
            }
            this.f13153d = null;
        }
        c0 c0Var = this.f13166j0;
        c0Var.f13224h = false;
        this.f13173n.d1(this.f13151c, c0Var);
        c0 c0Var2 = this.f13166j0;
        c0Var2.f13223g = false;
        c0Var2.f13227k = c0Var2.f13227k && this.O != null;
        c0Var2.f13221e = 4;
        S0();
        J1(false);
    }

    private void J0(int i11, int i12, MotionEvent motionEvent, int i13) {
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f13197z) {
            return;
        }
        int[] iArr = this.f13192w0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zQ = qVar.q();
        boolean zR = this.f13173n.r();
        int i14 = zR ? (zQ ? 1 : 0) | 2 : zQ ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iF1 = i11 - f1(i11, height);
        int iG1 = i12 - g1(i12, width);
        G1(i14, i13);
        if (L(zQ ? iF1 : 0, zR ? iG1 : 0, this.f13192w0, this.f13188u0, i13)) {
            int[] iArr2 = this.f13192w0;
            iF1 -= iArr2[0];
            iG1 -= iArr2[1];
        }
        t1(zQ ? iF1 : 0, zR ? iG1 : 0, motionEvent, i13);
        androidx.recyclerview.widget.k kVar = this.f13162h0;
        if (kVar != null && (iF1 != 0 || iG1 != 0)) {
            kVar.f(this, iF1, iG1);
        }
        K1(i13);
    }

    private void K() {
        RecyclerView recyclerView;
        this.f13166j0.a(4);
        F1();
        R0();
        c0 c0Var = this.f13166j0;
        c0Var.f13221e = 1;
        if (c0Var.f13227k) {
            for (int iG = this.f13157f.g() - 1; iG >= 0; iG--) {
                g0 g0VarO0 = o0(this.f13157f.f(iG));
                if (!g0VarO0.shouldIgnore()) {
                    long jL0 = l0(g0VarO0);
                    n.c cVarRecordPostLayoutInformation = this.O.recordPostLayoutInformation(this.f13166j0, g0VarO0);
                    g0 g0VarG = this.f13159g.g(jL0);
                    if (g0VarG == null || g0VarG.shouldIgnore()) {
                        this.f13159g.d(g0VarO0, cVarRecordPostLayoutInformation);
                    } else {
                        boolean zH = this.f13159g.h(g0VarG);
                        boolean zH2 = this.f13159g.h(g0VarO0);
                        if (zH && g0VarG == g0VarO0) {
                            this.f13159g.d(g0VarO0, cVarRecordPostLayoutInformation);
                        } else {
                            n.c cVarN = this.f13159g.n(g0VarG);
                            this.f13159g.d(g0VarO0, cVarRecordPostLayoutInformation);
                            n.c cVarM = this.f13159g.m(g0VarO0);
                            if (cVarN == null) {
                                v0(jL0, g0VarO0, g0VarG);
                            } else {
                                p(g0VarG, g0VarO0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f13159g.o(recyclerView.D0);
        } else {
            recyclerView = this;
        }
        recyclerView.f13173n.r1(recyclerView.f13151c);
        c0 c0Var2 = recyclerView.f13166j0;
        c0Var2.f13219c = c0Var2.f13222f;
        recyclerView.F = false;
        recyclerView.G = false;
        c0Var2.f13227k = false;
        c0Var2.f13228l = false;
        recyclerView.f13173n.f13257h = false;
        ArrayList<g0> arrayList = recyclerView.f13151c.f13286b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f13173n;
        if (qVar.f13263n) {
            qVar.f13262m = 0;
            qVar.f13263n = false;
            recyclerView.f13151c.P();
        }
        recyclerView.f13173n.e1(recyclerView.f13166j0);
        S0();
        J1(false);
        recyclerView.f13159g.f();
        int[] iArr = recyclerView.f13184s0;
        if (D(iArr[0], iArr[1])) {
            O(0, 0);
        }
        d1();
        p1();
    }

    private void M1() {
        this.f13160g0.stop();
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.Q1();
        }
    }

    private boolean Q(MotionEvent motionEvent) {
        u uVar = this.f13183s;
        if (uVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        uVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f13183s = null;
        }
        return true;
    }

    private void U0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.U = x11;
            this.S = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.V = y11;
            this.T = y11;
        }
    }

    private boolean Y0() {
        return this.O != null && this.f13173n.R1();
    }

    private void Z0() {
        boolean z11;
        if (this.F) {
            this.f13155e.y();
            if (this.G) {
                this.f13173n.Y0(this);
            }
        }
        if (Y0()) {
            this.f13155e.w();
        } else {
            this.f13155e.j();
        }
        boolean z12 = this.f13172m0 || this.f13174n0;
        this.f13166j0.f13227k = this.f13191w && this.O != null && ((z11 = this.F) || z12 || this.f13173n.f13257h) && (!z11 || this.f13171m.hasStableIds());
        c0 c0Var = this.f13166j0;
        c0Var.f13228l = c0Var.f13227k && z12 && !this.F && Y0();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f13181r.size();
        for (int i11 = 0; i11 < size; i11++) {
            u uVar = this.f13181r.get(i11);
            if (uVar.c(this, motionEvent) && action != 3) {
                this.f13183s = uVar;
                return true;
            }
        }
        return false;
    }

    private void b0(int[] iArr) {
        int iG = this.f13157f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < iG; i13++) {
            g0 g0VarO0 = o0(this.f13157f.f(i13));
            if (!g0VarO0.shouldIgnore()) {
                int layoutPosition = g0VarO0.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void b1(float f11, float f12, float f13, float f14) {
        boolean z11;
        boolean z12 = true;
        if (f12 >= BitmapDescriptorFactory.HUE_RED) {
            if (f12 > BitmapDescriptorFactory.HUE_RED) {
                T();
                androidx.core.widget.h.d(this.M, f12 / getWidth(), f13 / getHeight());
            } else {
                z11 = false;
            }
            if (f14 < BitmapDescriptorFactory.HUE_RED) {
                U();
                androidx.core.widget.h.d(this.L, (-f14) / getHeight(), f11 / getWidth());
            } else if (f14 > BitmapDescriptorFactory.HUE_RED) {
                R();
                androidx.core.widget.h.d(this.N, f14 / getHeight(), 1.0f - (f11 / getWidth()));
            } else {
                z12 = z11;
            }
            if (z12 && f12 == BitmapDescriptorFactory.HUE_RED && f14 == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            postInvalidateOnAnimation();
        }
        S();
        androidx.core.widget.h.d(this.K, (-f12) / getWidth(), 1.0f - (f13 / getHeight()));
        z11 = true;
        if (f14 < BitmapDescriptorFactory.HUE_RED) {
            U();
            androidx.core.widget.h.d(this.L, (-f14) / getHeight(), f11 / getWidth());
        } else if (f14 > BitmapDescriptorFactory.HUE_RED) {
            R();
            androidx.core.widget.h.d(this.N, f14 / getHeight(), 1.0f - (f11 / getWidth()));
        } else {
            z12 = z11;
        }
        if (z12) {
        }
        postInvalidateOnAnimation();
    }

    static RecyclerView c0(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView recyclerViewC0 = c0(viewGroup.getChildAt(i11));
            if (recyclerViewC0 != null) {
                return recyclerViewC0;
            }
        }
        return null;
    }

    private View d0() {
        g0 g0VarE0;
        c0 c0Var = this.f13166j0;
        int i11 = c0Var.f13229m;
        if (i11 == -1) {
            i11 = 0;
        }
        int iB = c0Var.b();
        for (int i12 = i11; i12 < iB; i12++) {
            g0 g0VarE1 = e0(i12);
            if (g0VarE1 == null) {
                break;
            }
            if (g0VarE1.itemView.hasFocusable()) {
                return g0VarE1.itemView;
            }
        }
        int iMin = Math.min(iB, i11);
        do {
            iMin--;
            if (iMin < 0 || (g0VarE0 = e0(iMin)) == null) {
                return null;
            }
        } while (!g0VarE0.itemView.hasFocusable());
        return g0VarE0.itemView;
    }

    private void d1() {
        View viewFindViewById;
        if (!this.f13158f0 || this.f13171m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f13157f.n(getFocusedChild())) {
                return;
            }
        }
        View viewD0 = null;
        g0 g0VarF0 = (this.f13166j0.f13230n == -1 || !this.f13171m.hasStableIds()) ? null : f0(this.f13166j0.f13230n);
        if (g0VarF0 != null && !this.f13157f.n(g0VarF0.itemView) && g0VarF0.itemView.hasFocusable()) {
            viewD0 = g0VarF0.itemView;
        } else if (this.f13157f.g() > 0) {
            viewD0 = d0();
        }
        if (viewD0 != null) {
            int i11 = this.f13166j0.f13231o;
            if (i11 != -1 && (viewFindViewById = viewD0.findViewById(i11)) != null && viewFindViewById.isFocusable()) {
                viewD0 = viewFindViewById;
            }
            viewD0.requestFocus();
        }
    }

    private void e1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.K.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private int f1(int i11, float f11) {
        float height = f11 / getHeight();
        float width = i11 / getWidth();
        EdgeEffect edgeEffect = this.K;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || androidx.core.widget.h.b(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.M;
            if (edgeEffect2 != null && androidx.core.widget.h.b(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollHorizontally(1)) {
                    this.M.onRelease();
                } else {
                    float fD = androidx.core.widget.h.d(this.M, width, height);
                    if (androidx.core.widget.h.b(this.M) == BitmapDescriptorFactory.HUE_RED) {
                        this.M.onRelease();
                    }
                    f12 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.K.onRelease();
            } else {
                float f13 = -androidx.core.widget.h.d(this.K, -width, 1.0f - height);
                if (androidx.core.widget.h.b(this.K) == BitmapDescriptorFactory.HUE_RED) {
                    this.K.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        }
        return Math.round(f12 * getWidth());
    }

    private int g1(int i11, float f11) {
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        EdgeEffect edgeEffect = this.L;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (edgeEffect == null || androidx.core.widget.h.b(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
            EdgeEffect edgeEffect2 = this.N;
            if (edgeEffect2 != null && androidx.core.widget.h.b(edgeEffect2) != BitmapDescriptorFactory.HUE_RED) {
                if (canScrollVertically(1)) {
                    this.N.onRelease();
                } else {
                    float fD = androidx.core.widget.h.d(this.N, height, 1.0f - width);
                    if (androidx.core.widget.h.b(this.N) == BitmapDescriptorFactory.HUE_RED) {
                        this.N.onRelease();
                    }
                    f12 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.L.onRelease();
            } else {
                float f13 = -androidx.core.widget.h.d(this.L, -height, width);
                if (androidx.core.widget.h.b(this.L) == BitmapDescriptorFactory.HUE_RED) {
                    this.L.onRelease();
                }
                f12 = f13;
            }
            invalidate();
        }
        return Math.round(f12 * getHeight());
    }

    private androidx.core.view.w getScrollingChildHelper() {
        if (this.f13186t0 == null) {
            this.f13186t0 = new androidx.core.view.w(this);
        }
        return this.f13186t0;
    }

    private void i(g0 g0Var) {
        View view = g0Var.itemView;
        boolean z11 = view.getParent() == this;
        this.f13151c.O(n0(view));
        if (g0Var.isTmpDetached()) {
            this.f13157f.c(view, -1, view.getLayoutParams(), true);
        } else if (z11) {
            this.f13157f.k(view);
        } else {
            this.f13157f.b(view, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    private boolean i0(int i11, int i12, int i13, int i14) {
        int iMax;
        int i15;
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f13197z) {
            return false;
        }
        boolean zQ = qVar.q();
        boolean zR = this.f13173n.r();
        if (!zQ || Math.abs(i11) < i13) {
            i11 = 0;
        }
        if (!zR || Math.abs(i12) < i13) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        if (i11 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.K;
            if (edgeEffect == null || androidx.core.widget.h.b(edgeEffect) == BitmapDescriptorFactory.HUE_RED) {
                EdgeEffect edgeEffect2 = this.M;
                if (edgeEffect2 == null || androidx.core.widget.h.b(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
                    iMax = 0;
                } else if (y1(this.M, i11, getWidth())) {
                    this.M.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i16 = -i11;
                if (y1(this.K, i16, getWidth())) {
                    this.K.onAbsorb(i16);
                    i11 = 0;
                }
            }
            iMax = i11;
            i11 = 0;
        }
        if (i12 == 0) {
            i15 = i12;
            i12 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.L;
            if (edgeEffect3 == null || androidx.core.widget.h.b(edgeEffect3) == BitmapDescriptorFactory.HUE_RED) {
                EdgeEffect edgeEffect4 = this.N;
                if (edgeEffect4 == null || androidx.core.widget.h.b(edgeEffect4) == BitmapDescriptorFactory.HUE_RED) {
                    i15 = i12;
                    i12 = 0;
                } else if (y1(this.N, i12, getHeight())) {
                    this.N.onAbsorb(i12);
                    i12 = 0;
                }
            } else {
                int i17 = -i12;
                if (y1(this.L, i17, getHeight())) {
                    this.L.onAbsorb(i17);
                    i12 = 0;
                }
            }
            i15 = 0;
        }
        if (iMax != 0 || i12 != 0) {
            int i18 = -i14;
            iMax = Math.max(i18, Math.min(iMax, i14));
            i12 = Math.max(i18, Math.min(i12, i14));
            H1(1);
            this.f13160g0.b(iMax, i12);
        }
        if (i11 == 0 && i15 == 0) {
            return (iMax == 0 && i12 == 0) ? false : true;
        }
        float f11 = i11;
        float f12 = i15;
        if (!dispatchNestedPreFling(f11, f12)) {
            boolean z11 = zQ || zR;
            dispatchNestedFling(f11, f12, z11);
            t tVar = this.f13148a0;
            if (tVar != null && tVar.a(i11, i15)) {
                return true;
            }
            if (z11) {
                H1(1);
                int i19 = -i14;
                this.f13160g0.b(Math.max(i19, Math.min(i11, i14)), Math.max(i19, Math.min(i15, i14)));
                return true;
            }
        }
        return false;
    }

    static g0 o0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f13274a;
    }

    private void o1(@NonNull View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f13165j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f13276c) {
                Rect rect = rVar.f13275b;
                Rect rect2 = this.f13165j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f13165j);
            offsetRectIntoDescendantCoords(view, this.f13165j);
        }
        this.f13173n.y1(this, view, this.f13165j, !this.f13191w, view2 == null);
    }

    private void p(@NonNull g0 g0Var, @NonNull g0 g0Var2, @NonNull n.c cVar, @NonNull n.c cVar2, boolean z11, boolean z12) {
        g0Var.setIsRecyclable(false);
        if (z11) {
            i(g0Var);
        }
        if (g0Var != g0Var2) {
            if (z12) {
                i(g0Var2);
            }
            g0Var.mShadowedHolder = g0Var2;
            i(g0Var);
            this.f13151c.O(g0Var);
            g0Var2.setIsRecyclable(false);
            g0Var2.mShadowingHolder = g0Var;
        }
        if (this.O.animateChange(g0Var, g0Var2, cVar, cVar2)) {
            X0();
        }
    }

    private void p1() {
        c0 c0Var = this.f13166j0;
        c0Var.f13230n = -1L;
        c0Var.f13229m = -1;
        c0Var.f13231o = -1;
    }

    static void q0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f13275b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    private void q1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        K1(0);
        e1();
    }

    private int r0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private void r1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.f13158f0 && hasFocus() && this.f13171m != null) ? getFocusedChild() : null;
        g0 g0VarZ = focusedChild != null ? Z(focusedChild) : null;
        if (g0VarZ == null) {
            p1();
            return;
        }
        this.f13166j0.f13230n = this.f13171m.hasStableIds() ? g0VarZ.getItemId() : -1L;
        c0 c0Var = this.f13166j0;
        if (this.F) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = g0VarZ.isRemoved() ? g0VarZ.mOldPosition : g0VarZ.getAbsoluteAdapterPosition();
        }
        c0Var.f13229m = absoluteAdapterPosition;
        this.f13166j0.f13231o = r0(g0VarZ.itemView);
    }

    private String s0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + CoreConstants.DOT + str;
    }

    public static void setDebugAssertionsEnabled(boolean z11) {
        G0 = z11;
    }

    public static void setVerboseLoggingEnabled(boolean z11) {
        H0 = z11;
    }

    private void t() {
        q1();
        setScrollState(0);
    }

    static void u(@NonNull g0 g0Var) {
        WeakReference<RecyclerView> weakReference = g0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g0Var.mNestedRecyclerView = null;
        }
    }

    private float u0(int i11) {
        double dLog = Math.log((Math.abs(i11) * 0.35f) / (this.f13147a * 0.015f));
        float f11 = J0;
        return (float) (((double) (this.f13147a * 0.015f)) * Math.exp((((double) f11) / (((double) f11) - 1.0d)) * dLog));
    }

    private void v0(long j11, g0 g0Var, g0 g0Var2) {
        int iG = this.f13157f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            g0 g0VarO0 = o0(this.f13157f.f(i11));
            if (g0VarO0 != g0Var && l0(g0VarO0) == j11) {
                h hVar = this.f13171m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g0VarO0 + " \n View Holder 2:" + g0Var + V());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g0VarO0 + " \n View Holder 2:" + g0Var + V());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + g0Var2 + " cannot be found but it is necessary for " + g0Var + V());
    }

    private void w1(h<?> hVar, boolean z11, boolean z12) {
        h hVar2 = this.f13171m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f13149b);
            this.f13171m.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            h1();
        }
        this.f13155e.y();
        h<?> hVar3 = this.f13171m;
        this.f13171m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f13149b);
            hVar.onAttachedToRecyclerView(this);
        }
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.K0(hVar3, this.f13171m);
        }
        this.f13151c.y(hVar3, this.f13171m, z11);
        this.f13166j0.f13223g = true;
    }

    private boolean x0() {
        int iG = this.f13157f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            g0 g0VarO0 = o0(this.f13157f.f(i11));
            if (g0VarO0 != null && !g0VarO0.shouldIgnore() && g0VarO0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private int y(int i11, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i12) {
        if (i11 > 0 && edgeEffect != null && androidx.core.widget.h.b(edgeEffect) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(((-i12) / 4.0f) * androidx.core.widget.h.d(edgeEffect, ((-i11) * 4.0f) / i12, 0.5f));
            if (iRound != i11) {
                edgeEffect.finish();
            }
            return i11 - iRound;
        }
        if (i11 >= 0 || edgeEffect2 == null || androidx.core.widget.h.b(edgeEffect2) == BitmapDescriptorFactory.HUE_RED) {
            return i11;
        }
        float f11 = i12;
        int iRound2 = Math.round((f11 / 4.0f) * androidx.core.widget.h.d(edgeEffect2, (i11 * 4.0f) / f11, 0.5f));
        if (iRound2 != i11) {
            edgeEffect2.finish();
        }
        return i11 - iRound2;
    }

    private boolean y1(@NonNull EdgeEffect edgeEffect, int i11, int i12) {
        if (i11 > 0) {
            return true;
        }
        return u0(-i11) < androidx.core.widget.h.b(edgeEffect) * ((float) i12);
    }

    @SuppressLint({"InlinedApi"})
    private void z0() {
        if (ViewCompat.z(this) == 0) {
            ViewCompat.B0(this, 8);
        }
    }

    void A() {
        if (!this.f13191w || this.F) {
            Trace.beginSection("RV FullInvalidate");
            H();
            Trace.endSection();
            return;
        }
        if (this.f13155e.p()) {
            if (!this.f13155e.o(4) || this.f13155e.o(11)) {
                if (this.f13155e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    H();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            F1();
            R0();
            this.f13155e.w();
            if (!this.f13195y) {
                if (x0()) {
                    H();
                } else {
                    this.f13155e.i();
                }
            }
            J1(true);
            S0();
            Trace.endSection();
        }
    }

    public void A1(int i11, int i12) {
        B1(i11, i12, null);
    }

    void B0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(qa.b.f105270a), resources.getDimensionPixelSize(qa.b.f105272c), resources.getDimensionPixelOffset(qa.b.f105271b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + V());
        }
    }

    public void B1(int i11, int i12, Interpolator interpolator) {
        C1(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    void C(int i11, int i12) {
        setMeasuredDimension(q.t(i11, getPaddingLeft() + getPaddingRight(), ViewCompat.C(this)), q.t(i12, getPaddingTop() + getPaddingBottom(), ViewCompat.B(this)));
    }

    void C0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    public void C1(int i11, int i12, Interpolator interpolator, int i13) {
        D1(i11, i12, interpolator, i13, false);
    }

    boolean D0() {
        AccessibilityManager accessibilityManager = this.D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void D1(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f13197z) {
            return;
        }
        if (!qVar.q()) {
            i11 = 0;
        }
        if (!this.f13173n.r()) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (i13 != Integer.MIN_VALUE && i13 <= 0) {
            scrollBy(i11, i12);
            return;
        }
        if (z11) {
            int i14 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i14 |= 2;
            }
            G1(i14, 1);
        }
        this.f13160g0.e(i11, i12, i13, interpolator);
    }

    void E(View view) {
        g0 g0VarO0 = o0(view);
        P0(view);
        h hVar = this.f13171m;
        if (hVar != null && g0VarO0 != null) {
            hVar.onViewAttachedToWindow(g0VarO0);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).d(view);
            }
        }
    }

    public boolean E0() {
        return this.H > 0;
    }

    public void E1(int i11) {
        if (this.f13197z) {
            return;
        }
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.O1(this, this.f13166j0, i11);
        }
    }

    void F(View view) {
        g0 g0VarO0 = o0(view);
        Q0(view);
        h hVar = this.f13171m;
        if (hVar != null && g0VarO0 != null) {
            hVar.onViewDetachedFromWindow(g0VarO0);
        }
        List<s> list = this.E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.E.get(size).b(view);
            }
        }
    }

    void F1() {
        int i11 = this.f13193x + 1;
        this.f13193x = i11;
        if (i11 != 1 || this.f13197z) {
            return;
        }
        this.f13195y = false;
    }

    void G0(int i11) {
        if (this.f13173n == null) {
            return;
        }
        setScrollState(2);
        this.f13173n.D1(i11);
        awakenScrollBars();
    }

    public boolean G1(int i11, int i12) {
        return getScrollingChildHelper().p(i11, i12);
    }

    void H() {
        if (this.f13171m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f13173n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f13166j0.f13226j = false;
        boolean z11 = this.f13198z0 && !(this.A0 == getWidth() && this.B0 == getHeight());
        this.A0 = 0;
        this.B0 = 0;
        this.f13198z0 = false;
        if (this.f13166j0.f13221e == 1) {
            I();
            this.f13173n.F1(this);
            J();
        } else if (this.f13155e.q() || z11 || this.f13173n.t0() != getWidth() || this.f13173n.c0() != getHeight()) {
            this.f13173n.F1(this);
            J();
        } else {
            this.f13173n.F1(this);
        }
        K();
    }

    void H0() {
        int iJ = this.f13157f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            ((r) this.f13157f.i(i11).getLayoutParams()).f13276c = true;
        }
        this.f13151c.s();
    }

    void I0() {
        int iJ = this.f13157f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarO0 = o0(this.f13157f.i(i11));
            if (g0VarO0 != null && !g0VarO0.shouldIgnore()) {
                g0VarO0.addFlags(6);
            }
        }
        H0();
        this.f13151c.t();
    }

    void J1(boolean z11) {
        if (this.f13193x < 1) {
            if (G0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + V());
            }
            this.f13193x = 1;
        }
        if (!z11 && !this.f13197z) {
            this.f13195y = false;
        }
        if (this.f13193x == 1) {
            if (z11 && this.f13195y && !this.f13197z && this.f13173n != null && this.f13171m != null) {
                H();
            }
            if (!this.f13197z) {
                this.f13195y = false;
            }
        }
        this.f13193x--;
    }

    public void K0(int i11) {
        int iG = this.f13157f.g();
        for (int i12 = 0; i12 < iG; i12++) {
            this.f13157f.f(i12).offsetLeftAndRight(i11);
        }
    }

    public void K1(int i11) {
        getScrollingChildHelper().r(i11);
    }

    public boolean L(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().d(i11, i12, iArr, iArr2, i13);
    }

    public void L0(int i11) {
        int iG = this.f13157f.g();
        for (int i12 = 0; i12 < iG; i12++) {
            this.f13157f.f(i12).offsetTopAndBottom(i11);
        }
    }

    public void L1() {
        setScrollState(0);
        M1();
    }

    public final void M(int i11, int i12, int i13, int i14, int[] iArr, int i15, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    void M0(int i11, int i12) {
        int iJ = this.f13157f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            g0 g0VarO0 = o0(this.f13157f.i(i13));
            if (g0VarO0 != null && !g0VarO0.shouldIgnore() && g0VarO0.mPosition >= i11) {
                if (H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i13 + " holder " + g0VarO0 + " now at position " + (g0VarO0.mPosition + i12));
                }
                g0VarO0.offsetPosition(i12, false);
                this.f13166j0.f13223g = true;
            }
        }
        this.f13151c.v(i11, i12);
        requestLayout();
    }

    void N(int i11) {
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.k1(i11);
        }
        V0(i11);
        v vVar = this.f13168k0;
        if (vVar != null) {
            vVar.onScrollStateChanged(this, i11);
        }
        List<v> list = this.f13170l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f13170l0.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    void N0(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int iJ = this.f13157f.j();
        if (i11 < i12) {
            i15 = -1;
            i14 = i11;
            i13 = i12;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i17 = 0; i17 < iJ; i17++) {
            g0 g0VarO0 = o0(this.f13157f.i(i17));
            if (g0VarO0 != null && (i16 = g0VarO0.mPosition) >= i14 && i16 <= i13) {
                if (H0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i17 + " holder " + g0VarO0);
                }
                if (g0VarO0.mPosition == i11) {
                    g0VarO0.offsetPosition(i12 - i11, false);
                } else {
                    g0VarO0.offsetPosition(i15, false);
                }
                this.f13166j0.f13223g = true;
            }
        }
        this.f13151c.w(i11, i12);
        requestLayout();
    }

    void N1(int i11, int i12, Object obj) {
        int i13;
        int iJ = this.f13157f.j();
        int i14 = i11 + i12;
        for (int i15 = 0; i15 < iJ; i15++) {
            View viewI = this.f13157f.i(i15);
            g0 g0VarO0 = o0(viewI);
            if (g0VarO0 != null && !g0VarO0.shouldIgnore() && (i13 = g0VarO0.mPosition) >= i11 && i13 < i14) {
                g0VarO0.addFlags(2);
                g0VarO0.addChangePayload(obj);
                ((r) viewI.getLayoutParams()).f13276c = true;
            }
        }
        this.f13151c.R(i11, i12);
    }

    void O(int i11, int i12) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        W0(i11, i12);
        v vVar = this.f13168k0;
        if (vVar != null) {
            vVar.onScrolled(this, i11, i12);
        }
        List<v> list = this.f13170l0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f13170l0.get(size).onScrolled(this, i11, i12);
            }
        }
        this.I--;
    }

    void O0(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int iJ = this.f13157f.j();
        for (int i14 = 0; i14 < iJ; i14++) {
            g0 g0VarO0 = o0(this.f13157f.i(i14));
            if (g0VarO0 != null && !g0VarO0.shouldIgnore()) {
                int i15 = g0VarO0.mPosition;
                if (i15 >= i13) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i14 + " holder " + g0VarO0 + " now at position " + (g0VarO0.mPosition - i12));
                    }
                    g0VarO0.offsetPosition(-i12, z11);
                    this.f13166j0.f13223g = true;
                } else if (i15 >= i11) {
                    if (H0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i14 + " holder " + g0VarO0 + " now REMOVED");
                    }
                    g0VarO0.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.f13166j0.f13223g = true;
                }
            }
        }
        this.f13151c.x(i11, i12, z11);
        requestLayout();
    }

    void P() {
        int i11;
        for (int size = this.f13194x0.size() - 1; size >= 0; size--) {
            g0 g0Var = this.f13194x0.get(size);
            if (g0Var.itemView.getParent() == this && !g0Var.shouldIgnore() && (i11 = g0Var.mPendingAccessibilityState) != -1) {
                g0Var.itemView.setImportantForAccessibility(i11);
                g0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f13194x0.clear();
    }

    public void P0(@NonNull View view) {
    }

    public void Q0(@NonNull View view) {
    }

    void R() {
        if (this.N != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 3);
        this.N = edgeEffectA;
        if (this.f13161h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void R0() {
        this.H++;
    }

    void S() {
        if (this.K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 0);
        this.K = edgeEffectA;
        if (this.f13161h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void S0() {
        T0(true);
    }

    void T() {
        if (this.M != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 2);
        this.M = edgeEffectA;
        if (this.f13161h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0(boolean z11) {
        int i11 = this.H - 1;
        this.H = i11;
        if (i11 < 1) {
            if (G0 && i11 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + V());
            }
            this.H = 0;
            if (z11) {
                G();
                P();
            }
        }
    }

    void U() {
        if (this.L != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.J.a(this, 1);
        this.L = edgeEffectA;
        if (this.f13161h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String V() {
        return " " + super.toString() + ", adapter:" + this.f13171m + ", layout:" + this.f13173n + ", context:" + getContext();
    }

    public void V0(int i11) {
    }

    final void W(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.f13232p = 0;
            c0Var.f13233q = 0;
        } else {
            OverScroller overScroller = this.f13160g0.f13239c;
            c0Var.f13232p = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.f13233q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void W0(int i11, int i12) {
    }

    public View X(float f11, float f12) {
        for (int iG = this.f13157f.g() - 1; iG >= 0; iG--) {
            View viewF = this.f13157f.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f11 >= viewF.getLeft() + translationX && f11 <= viewF.getRight() + translationX && f12 >= viewF.getTop() + translationY && f12 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    void X0() {
        if (this.f13178p0 || !this.f13185t) {
            return;
        }
        ViewCompat.h0(this, this.f13196y0);
        this.f13178p0 = true;
    }

    public View Y(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public g0 Z(@NonNull View view) {
        View viewY = Y(view);
        if (viewY == null) {
            return null;
        }
        return n0(viewY);
    }

    void a1(boolean z11) {
        this.G = z11 | this.G;
        this.F = true;
        I0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        q qVar = this.f13173n;
        if (qVar == null || !qVar.L0(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    void b(int i11, int i12) {
        if (i11 < 0) {
            S();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            T();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            U();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            R();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i12);
            }
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    void c1(g0 g0Var, n.c cVar) {
        g0Var.setFlags(0, PKIFailureInfo.certRevoked);
        if (this.f13166j0.f13225i && g0Var.isUpdated() && !g0Var.isRemoved() && !g0Var.shouldIgnore()) {
            this.f13159g.c(l0(g0Var), g0Var);
        }
        this.f13159g.e(g0Var, cVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f13173n.s((r) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.q()) {
            return this.f13173n.w(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.q()) {
            return this.f13173n.x(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.q()) {
            return this.f13173n.y(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.r()) {
            return this.f13173n.z(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.r()) {
            return this.f13173n.A(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        q qVar = this.f13173n;
        if (qVar != null && qVar.r()) {
            return this.f13173n.B(this.f13166j0);
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int itemCount = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.r()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    C1(0, measuredHeight, null, Integer.MIN_VALUE);
                } else {
                    C1(0, -measuredHeight, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zB0 = layoutManager.B0();
                if (keyCode == 122) {
                    if (zB0) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zB0) {
                    itemCount = getAdapter().getItemCount();
                }
                E1(itemCount);
                return true;
            }
        } else if (layoutManager.q()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    C1(measuredWidth, 0, null, Integer.MIN_VALUE);
                } else {
                    C1(-measuredWidth, 0, null, Integer.MIN_VALUE);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zB1 = layoutManager.B0();
                if (keyCode2 == 122) {
                    if (zB1) {
                        itemCount = getAdapter().getItemCount();
                    }
                } else if (!zB1) {
                    itemCount = getAdapter().getItemCount();
                }
                E1(itemCount);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        int size = this.f13179q.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f13179q.get(i11).k(canvas, this, this.f13166j0);
        }
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f13161h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.K;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f13161h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f13161h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.M;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f13161h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(iSave4);
        }
        if ((z11 || this.O == null || this.f13179q.size() <= 0 || !this.O.isRunning()) ? z11 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NonNull Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    public g0 e0(int i11) {
        g0 g0Var = null;
        if (this.F) {
            return null;
        }
        int iJ = this.f13157f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            g0 g0VarO0 = o0(this.f13157f.i(i12));
            if (g0VarO0 != null && !g0VarO0.isRemoved() && k0(g0VarO0) == i11) {
                if (!this.f13157f.n(g0VarO0.itemView)) {
                    return g0VarO0;
                }
                g0Var = g0VarO0;
            }
        }
        return g0Var;
    }

    public g0 f0(long j11) {
        h hVar = this.f13171m;
        g0 g0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f13157f.j();
            for (int i11 = 0; i11 < iJ; i11++) {
                g0 g0VarO0 = o0(this.f13157f.i(i11));
                if (g0VarO0 != null && !g0VarO0.isRemoved() && g0VarO0.getItemId() == j11) {
                    if (!this.f13157f.n(g0VarO0.itemView)) {
                        return g0VarO0;
                    }
                    g0Var = g0VarO0;
                }
            }
        }
        return g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0043  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        View viewP0;
        boolean z11;
        View viewW0 = this.f13173n.W0(view, i11);
        if (viewW0 != null) {
            return viewW0;
        }
        boolean z12 = (this.f13171m == null || this.f13173n == null || E0() || this.f13197z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z12 && (i11 == 2 || i11 == 1)) {
            if (this.f13173n.r()) {
                if (focusFinder.findNextFocus(this, view, i11 == 2 ? EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE : 33) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.f13173n.q()) {
                z11 = focusFinder.findNextFocus(this, view, (this.f13173n.e0() == 1) ^ (i11 == 2) ? 66 : 17) == null;
            }
            if (z11) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                F1();
                this.f13173n.P0(view, i11, this.f13151c, this.f13166j0);
                J1(false);
            }
            viewP0 = focusFinder.findNextFocus(this, view, i11);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (viewFindNextFocus == null && z12) {
                A();
                if (Y(view) == null) {
                    return null;
                }
                F1();
                viewP0 = this.f13173n.P0(view, i11, this.f13151c, this.f13166j0);
                J1(false);
            } else {
                viewP0 = viewFindNextFocus;
            }
        }
        if (viewP0 == null || viewP0.hasFocusable()) {
            return F0(view, viewP0, i11) ? viewP0 : super.focusSearch(view, i11);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i11);
        }
        o1(viewP0, null);
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    g0 g0(int i11, boolean z11) {
        int iJ = this.f13157f.j();
        g0 g0Var = null;
        for (int i12 = 0; i12 < iJ; i12++) {
            g0 g0VarO0 = o0(this.f13157f.i(i12));
            if (g0VarO0 != null && !g0VarO0.isRemoved()) {
                if (z11) {
                    if (g0VarO0.mPosition != i11) {
                        continue;
                    } else {
                        if (this.f13157f.n(g0VarO0.itemView)) {
                            return g0VarO0;
                        }
                        g0Var = g0VarO0;
                    }
                } else if (g0VarO0.getLayoutPosition() != i11) {
                    continue;
                } else {
                    if (this.f13157f.n(g0VarO0.itemView)) {
                        return g0VarO0;
                    }
                    g0Var = g0VarO0;
                }
            }
        }
        return g0Var;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f13173n;
        if (qVar != null) {
            return qVar.J();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f13173n;
        if (qVar != null) {
            return qVar.K(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f13171m;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f13173n;
        return qVar != null ? qVar.M() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        l lVar = this.f13182r0;
        return lVar == null ? super.getChildDrawingOrder(i11, i12) : lVar.a(i11, i12);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f13161h;
    }

    public androidx.recyclerview.widget.v getCompatAccessibilityDelegate() {
        return this.f13180q0;
    }

    @NonNull
    public m getEdgeEffectFactory() {
        return this.J;
    }

    public n getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.f13179q.size();
    }

    public q getLayoutManager() {
        return this.f13173n;
    }

    public int getMaxFlingVelocity() {
        return this.f13152c0;
    }

    public int getMinFlingVelocity() {
        return this.f13150b0;
    }

    long getNanoTime() {
        if (M0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public t getOnFlingListener() {
        return this.f13148a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f13158f0;
    }

    @NonNull
    public w getRecycledViewPool() {
        return this.f13151c.i();
    }

    public int getScrollState() {
        return this.P;
    }

    public boolean h0(int i11, int i12) {
        return i0(i11, i12, this.f13150b0, this.f13152c0);
    }

    void h1() {
        n nVar = this.O;
        if (nVar != null) {
            nVar.endAnimations();
        }
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.q1(this.f13151c);
            this.f13173n.r1(this.f13151c);
        }
        this.f13151c.c();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    boolean i1(View view) {
        F1();
        boolean zR = this.f13157f.r(view);
        if (zR) {
            g0 g0VarO0 = o0(view);
            this.f13151c.O(g0VarO0);
            this.f13151c.H(g0VarO0);
            if (H0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        J1(!zR);
        return zR;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f13185t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f13197z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(@NonNull p pVar) {
        k(pVar, -1);
    }

    boolean j0(int i11, int i12) {
        return i0(i11, i12, 0, Integer.MAX_VALUE);
    }

    public void j1(@NonNull p pVar) {
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.m("Cannot remove item decoration during a scroll  or layout");
        }
        this.f13179q.remove(pVar);
        if (this.f13179q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        H0();
        requestLayout();
    }

    public void k(@NonNull p pVar, int i11) {
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f13179q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.f13179q.add(pVar);
        } else {
            this.f13179q.add(i11, pVar);
        }
        H0();
        requestLayout();
    }

    int k0(g0 g0Var) {
        if (g0Var.hasAnyOfTheFlags(524) || !g0Var.isBound()) {
            return -1;
        }
        return this.f13155e.e(g0Var.mPosition);
    }

    public void k1(@NonNull s sVar) {
        List<s> list = this.E;
        if (list == null) {
            return;
        }
        list.remove(sVar);
    }

    public void l(@NonNull s sVar) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(sVar);
    }

    long l0(g0 g0Var) {
        return this.f13171m.hasStableIds() ? g0Var.getItemId() : g0Var.mPosition;
    }

    public void l1(@NonNull u uVar) {
        this.f13181r.remove(uVar);
        if (this.f13183s == uVar) {
            this.f13183s = null;
        }
    }

    public void m(@NonNull u uVar) {
        this.f13181r.add(uVar);
    }

    public int m0(@NonNull View view) {
        g0 g0VarO0 = o0(view);
        if (g0VarO0 != null) {
            return g0VarO0.getLayoutPosition();
        }
        return -1;
    }

    public void m1(@NonNull v vVar) {
        List<v> list = this.f13170l0;
        if (list != null) {
            list.remove(vVar);
        }
    }

    public void n(@NonNull v vVar) {
        if (this.f13170l0 == null) {
            this.f13170l0 = new ArrayList();
        }
        this.f13170l0.add(vVar);
    }

    public g0 n0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return o0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void n1() {
        g0 g0Var;
        int iG = this.f13157f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            View viewF = this.f13157f.f(i11);
            g0 g0VarN0 = n0(viewF);
            if (g0VarN0 != null && (g0Var = g0VarN0.mShadowingHolder) != null) {
                View view = g0Var.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void o(@NonNull g0 g0Var, n.c cVar, @NonNull n.c cVar2) {
        g0Var.setIsRecyclable(false);
        if (this.O.animateAppearance(g0Var, cVar, cVar2)) {
            X0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.H = 0;
        this.f13185t = true;
        this.f13191w = this.f13191w && !isLayoutRequested();
        this.f13151c.z();
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.F(this);
        }
        this.f13178p0 = false;
        if (M0) {
            ThreadLocal<androidx.recyclerview.widget.k> threadLocal = androidx.recyclerview.widget.k.f13489e;
            androidx.recyclerview.widget.k kVar = threadLocal.get();
            this.f13162h0 = kVar;
            if (kVar == null) {
                this.f13162h0 = new androidx.recyclerview.widget.k();
                Display displayU = ViewCompat.u(this);
                if (isInEditMode() || displayU == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayU.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.k kVar2 = this.f13162h0;
                kVar2.f13493c = (long) (1.0E9f / refreshRate);
                threadLocal.set(kVar2);
            }
            this.f13162h0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.k kVar;
        super.onDetachedFromWindow();
        n nVar = this.O;
        if (nVar != null) {
            nVar.endAnimations();
        }
        L1();
        this.f13185t = false;
        q qVar = this.f13173n;
        if (qVar != null) {
            qVar.G(this, this.f13151c);
        }
        this.f13194x0.clear();
        removeCallbacks(this.f13196y0);
        this.f13159g.j();
        this.f13151c.A();
        q6.a.c(this);
        if (!M0 || (kVar = this.f13162h0) == null) {
            return;
        }
        kVar.j(this);
        this.f13162h0 = null;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f13179q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f13179q.get(i11).i(canvas, this, this.f13166j0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i11;
        boolean z11;
        float axisValue;
        RecyclerView recyclerView;
        if (this.f13173n != null && !this.f13197z && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float axisValue2 = BitmapDescriptorFactory.HUE_RED;
            if (source != 0) {
                float f11 = this.f13173n.r() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f13173n.q()) {
                    axisValue2 = motionEvent.getAxisValue(10);
                }
                z11 = false;
                axisValue = axisValue2;
                axisValue2 = f11;
                i11 = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i11 = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.f13173n.r()) {
                    float f12 = -axisValue;
                    axisValue = 0.0f;
                    axisValue2 = f12;
                } else if (!this.f13173n.q()) {
                    axisValue = 0.0f;
                }
                z11 = this.C0;
            } else {
                i11 = 0;
                z11 = false;
                axisValue = 0.0f;
            }
            int i12 = (int) (axisValue2 * this.f13156e0);
            int i13 = (int) (axisValue * this.f13154d0);
            if (z11) {
                OverScroller overScroller = this.f13160g0.f13239c;
                recyclerView = this;
                recyclerView.D1(i13 + (overScroller.getFinalX() - overScroller.getCurrX()), i12 + (overScroller.getFinalY() - overScroller.getCurrY()), null, Integer.MIN_VALUE, true);
            } else {
                recyclerView = this;
                J0(i13, i12, motionEvent, 1);
            }
            if (i11 != 0 && !z11) {
                recyclerView.F0.g(motionEvent, i11);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.f13197z) {
            return false;
        }
        this.f13183s = null;
        if (a0(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f13173n;
        if (qVar == null) {
            return false;
        }
        boolean zQ = qVar.q();
        boolean zR = this.f13173n.r();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.A) {
                this.A = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.U = x11;
            this.S = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.V = y11;
            this.T = y11;
            if (I1(motionEvent) || this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                K1(1);
            }
            int[] iArr = this.f13190v0;
            iArr[1] = 0;
            iArr[0] = 0;
            H1(0);
        } else if (actionMasked == 1) {
            this.R.clear();
            K1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y12 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i11 = x12 - this.S;
                int i12 = y12 - this.T;
                if (!zQ || Math.abs(i11) <= this.W) {
                    z11 = false;
                } else {
                    this.U = x12;
                    z11 = true;
                }
                if (zR && Math.abs(i12) > this.W) {
                    this.V = y12;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            t();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x13;
            this.S = x13;
            int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y13;
            this.T = y13;
        } else if (actionMasked == 6) {
            U0(motionEvent);
        }
        return this.P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Trace.beginSection("RV OnLayout");
        H();
        Trace.endSection();
        this.f13191w = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        q qVar = this.f13173n;
        if (qVar == null) {
            C(i11, i12);
            return;
        }
        boolean z11 = false;
        if (qVar.x0()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f13173n.f1(this.f13151c, this.f13166j0, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.f13198z0 = z11;
            if (z11 || this.f13171m == null) {
                return;
            }
            if (this.f13166j0.f13221e == 1) {
                I();
            }
            this.f13173n.G1(i11, i12);
            this.f13166j0.f13226j = true;
            J();
            this.f13173n.J1(i11, i12);
            if (this.f13173n.M1()) {
                this.f13173n.G1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f13166j0.f13226j = true;
                J();
                this.f13173n.J1(i11, i12);
            }
            this.A0 = getMeasuredWidth();
            this.B0 = getMeasuredHeight();
            return;
        }
        if (this.f13187u) {
            this.f13173n.f1(this.f13151c, this.f13166j0, i11, i12);
            return;
        }
        if (this.C) {
            F1();
            R0();
            Z0();
            S0();
            c0 c0Var = this.f13166j0;
            if (c0Var.f13228l) {
                c0Var.f13224h = true;
            } else {
                this.f13155e.j();
                this.f13166j0.f13224h = false;
            }
            this.C = false;
            J1(false);
        } else if (this.f13166j0.f13228l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f13171m;
        if (hVar != null) {
            this.f13166j0.f13222f = hVar.getItemCount();
        } else {
            this.f13166j0.f13222f = 0;
        }
        F1();
        this.f13173n.f1(this.f13151c, this.f13166j0, i11, i12);
        J1(false);
        this.f13166j0.f13224h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (E0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        this.f13153d = a0Var;
        super.onRestoreInstanceState(a0Var.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0 a0Var2 = this.f13153d;
        if (a0Var2 != null) {
            a0Var.b(a0Var2);
            return a0Var;
        }
        q qVar = this.f13173n;
        if (qVar != null) {
            a0Var.f13200c = qVar.j1();
            return a0Var;
        }
        a0Var.f13200c = null;
        return a0Var;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        C0();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.f13197z || this.A) {
            return false;
        }
        if (Q(motionEvent)) {
            t();
            return true;
        }
        q qVar = this.f13173n;
        if (qVar == null) {
            return false;
        }
        boolean zQ = qVar.q();
        boolean zR = this.f13173n.r();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f13190v0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f13190v0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.R.addMovement(motionEventObtain);
                this.R.computeCurrentVelocity(1000, this.f13152c0);
                float f11 = zQ ? -this.R.getXVelocity(this.Q) : 0.0f;
                float f12 = zR ? -this.R.getYVelocity(this.Q) : 0.0f;
                if ((f11 == BitmapDescriptorFactory.HUE_RED && f12 == BitmapDescriptorFactory.HUE_RED) || !h0((int) f11, (int) f12)) {
                    setScrollState(0);
                }
                q1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.Q);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.U - x11;
                int iMax2 = this.V - y11;
                if (this.P != 1) {
                    if (zQ) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.W) : Math.min(0, iMax + this.W);
                        if (iMax != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (zR) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.W) : Math.min(0, iMax2 + this.W);
                        if (iMax2 != 0) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        setScrollState(1);
                    }
                }
                if (this.P == 1) {
                    int[] iArr3 = this.f13192w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iF1 = iMax - f1(iMax, motionEvent.getY());
                    int iG1 = iMax2 - g1(iMax2, motionEvent.getX());
                    if (L(zQ ? iF1 : 0, zR ? iG1 : 0, this.f13192w0, this.f13188u0, 0)) {
                        int[] iArr4 = this.f13192w0;
                        iF1 -= iArr4[0];
                        iG1 -= iArr4[1];
                        int[] iArr5 = this.f13190v0;
                        int i11 = iArr5[0];
                        int[] iArr6 = this.f13188u0;
                        iArr5[0] = i11 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f13188u0;
                    this.U = x11 - iArr7[0];
                    this.V = y11 - iArr7[1];
                    if (t1(zQ ? iF1 : 0, zR ? iG1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.k kVar = this.f13162h0;
                    if (kVar != null && (iF1 != 0 || iG1 != 0)) {
                        kVar.f(this, iF1, iG1);
                    }
                }
            } else if (actionMasked == 3) {
                t();
            } else if (actionMasked == 5) {
                this.Q = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.U = x12;
                this.S = x12;
                int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.V = y12;
                this.T = y12;
            } else if (actionMasked == 6) {
                U0(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.Q = motionEvent.getPointerId(0);
        int x13 = (int) (motionEvent.getX() + 0.5f);
        this.U = x13;
        this.S = x13;
        int y13 = (int) (motionEvent.getY() + 0.5f);
        this.V = y13;
        this.T = y13;
        H1(0);
        this.R.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void p0(@NonNull View view, @NonNull Rect rect) {
        q0(view, rect);
    }

    void q(@NonNull g0 g0Var, @NonNull n.c cVar, n.c cVar2) {
        i(g0Var);
        g0Var.setIsRecyclable(false);
        if (this.O.animateDisappearance(g0Var, cVar, cVar2)) {
            X0();
        }
    }

    void r(String str) {
        if (E0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + V());
        }
        if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + V()));
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z11) {
        g0 g0VarO0 = o0(view);
        if (g0VarO0 != null) {
            if (g0VarO0.isTmpDetached()) {
                g0VarO0.clearTmpDetachFlag();
            } else if (!g0VarO0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0VarO0 + V());
            }
        } else if (G0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + V());
        }
        view.clearAnimation();
        F(view);
        super.removeDetachedView(view, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f13173n.h1(this, this.f13166j0, view, view2) && view2 != null) {
            o1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.f13173n.x1(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.f13181r.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f13181r.get(i11).e(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f13193x != 0 || this.f13197z) {
            this.f13195y = true;
        } else {
            super.requestLayout();
        }
    }

    boolean s(g0 g0Var) {
        n nVar = this.O;
        return nVar == null || nVar.canReuseUpdatedViewHolder(g0Var, g0Var.getUnmodifiedPayloads());
    }

    void s1() {
        int iJ = this.f13157f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarO0 = o0(this.f13157f.i(i11));
            if (G0 && g0VarO0.mPosition == -1 && !g0VarO0.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + V());
            }
            if (!g0VarO0.shouldIgnore()) {
                g0VarO0.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f13197z) {
            return;
        }
        boolean zQ = qVar.q();
        boolean zR = this.f13173n.r();
        if (zQ || zR) {
            if (!zQ) {
                i11 = 0;
            }
            if (!zR) {
                i12 = 0;
            }
            t1(i11, i12, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (z1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.v vVar) {
        this.f13180q0 = vVar;
        ViewCompat.p0(this, vVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        w1(hVar, false, true);
        a1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == this.f13182r0) {
            return;
        }
        this.f13182r0 = lVar;
        setChildrenDrawingOrderEnabled(lVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.f13161h) {
            C0();
        }
        this.f13161h = z11;
        super.setClipToPadding(z11);
        if (this.f13191w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull m mVar) {
        u5.h.g(mVar);
        this.J = mVar;
        C0();
    }

    public void setHasFixedSize(boolean z11) {
        this.f13187u = z11;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.O;
        if (nVar2 != null) {
            nVar2.endAnimations();
            this.O.setListener(null);
        }
        this.O = nVar;
        if (nVar != null) {
            nVar.setListener(this.f13176o0);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.f13151c.L(i11);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f13173n) {
            return;
        }
        L1();
        if (this.f13173n != null) {
            n nVar = this.O;
            if (nVar != null) {
                nVar.endAnimations();
            }
            this.f13173n.q1(this.f13151c);
            this.f13173n.r1(this.f13151c);
            this.f13151c.c();
            if (this.f13185t) {
                this.f13173n.G(this, this.f13151c);
            }
            this.f13173n.K1(null);
            this.f13173n = null;
        } else {
            this.f13151c.c();
        }
        this.f13157f.o();
        this.f13173n = qVar;
        if (qVar != null) {
            if (qVar.f13251b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.f13251b.V());
            }
            qVar.K1(this);
            if (this.f13185t) {
                this.f13173n.F(this);
            }
        }
        this.f13151c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().m(z11);
    }

    public void setOnFlingListener(t tVar) {
        this.f13148a0 = tVar;
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
        this.f13168k0 = vVar;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.f13158f0 = z11;
    }

    public void setRecycledViewPool(w wVar) {
        this.f13151c.J(wVar);
    }

    @Deprecated
    public void setRecyclerListener(y yVar) {
        this.f13175o = yVar;
    }

    void setScrollState(int i11) {
        if (i11 == this.P) {
            return;
        }
        if (H0) {
            Log.d("RecyclerView", "setting scroll state to " + i11 + " from " + this.P, new Exception());
        }
        this.P = i11;
        if (i11 != 2) {
            M1();
        }
        N(i11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 == 1) {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(e0 e0Var) {
        this.f13151c.K(e0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.f13197z) {
            r("Do not suppressLayout in layout or scroll");
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
                this.f13197z = true;
                this.A = true;
                L1();
                return;
            }
            this.f13197z = false;
            if (this.f13195y && this.f13173n != null && this.f13171m != null) {
                requestLayout();
            }
            this.f13195y = false;
        }
    }

    Rect t0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f13276c) {
            return rVar.f13275b;
        }
        if (this.f13166j0.e() && (rVar.b() || rVar.d())) {
            return rVar.f13275b;
        }
        Rect rect = rVar.f13275b;
        rect.set(0, 0, 0, 0);
        int size = this.f13179q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f13165j.set(0, 0, 0, 0);
            this.f13179q.get(i11).g(this.f13165j, view, this, this.f13166j0);
            int i12 = rect.left;
            Rect rect2 = this.f13165j;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f13276c = false;
        return rect;
    }

    boolean t1(int i11, int i12, MotionEvent motionEvent, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        A();
        if (this.f13171m != null) {
            int[] iArr = this.f13192w0;
            iArr[0] = 0;
            iArr[1] = 0;
            u1(i11, i12, iArr);
            int[] iArr2 = this.f13192w0;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i16 = i11 - i18;
            i17 = i12 - i19;
            i15 = i19;
            i14 = i18;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
        }
        if (!this.f13179q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f13192w0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        M(i14, i15, i16, i17, this.f13188u0, i13, iArr3);
        int[] iArr4 = this.f13192w0;
        int i21 = iArr4[0];
        int i22 = i16 - i21;
        int i23 = iArr4[1];
        int i24 = i17 - i23;
        boolean z11 = (i21 == 0 && i23 == 0) ? false : true;
        int i25 = this.U;
        int[] iArr5 = this.f13188u0;
        int i26 = iArr5[0];
        this.U = i25 - i26;
        int i27 = this.V;
        int i28 = iArr5[1];
        this.V = i27 - i28;
        int[] iArr6 = this.f13190v0;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.u.b(motionEvent, 8194)) {
                b1(motionEvent.getX(), i22, motionEvent.getY(), i24);
                if (Build.VERSION.SDK_INT >= 31 && androidx.core.view.u.b(motionEvent, 4194304)) {
                    e1();
                }
            }
            w(i11, i12);
        }
        if (i14 != 0 || i15 != 0) {
            O(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i14 == 0 && i15 == 0) ? false : true;
    }

    void u1(int i11, int i12, int[] iArr) {
        F1();
        R0();
        Trace.beginSection("RV Scroll");
        W(this.f13166j0);
        int iC1 = i11 != 0 ? this.f13173n.C1(i11, this.f13151c, this.f13166j0) : 0;
        int iE1 = i12 != 0 ? this.f13173n.E1(i12, this.f13151c, this.f13166j0) : 0;
        Trace.endSection();
        n1();
        S0();
        J1(false);
        if (iArr != null) {
            iArr[0] = iC1;
            iArr[1] = iE1;
        }
    }

    void v() {
        int iJ = this.f13157f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarO0 = o0(this.f13157f.i(i11));
            if (!g0VarO0.shouldIgnore()) {
                g0VarO0.clearOldPosition();
            }
        }
        this.f13151c.d();
    }

    public void v1(int i11) {
        if (this.f13197z) {
            return;
        }
        L1();
        q qVar = this.f13173n;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.D1(i11);
            awakenScrollBars();
        }
    }

    void w(int i11, int i12) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            zIsFinished = false;
        } else {
            this.K.onRelease();
            zIsFinished = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.M.onRelease();
            zIsFinished |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.L.onRelease();
            zIsFinished |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.N.onRelease();
            zIsFinished |= this.N.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public boolean w0() {
        return !this.f13191w || this.F || this.f13155e.p();
    }

    int x(int i11) {
        return y(i11, this.K, this.M, getWidth());
    }

    boolean x1(g0 g0Var, int i11) {
        if (!E0()) {
            g0Var.itemView.setImportantForAccessibility(i11);
            return true;
        }
        g0Var.mPendingAccessibilityState = i11;
        this.f13194x0.add(g0Var);
        return false;
    }

    void y0() {
        this.f13155e = new androidx.recyclerview.widget.a(new g());
    }

    int z(int i11) {
        return y(i11, this.L, this.N, getHeight());
    }

    boolean z1(AccessibilityEvent accessibilityEvent) {
        if (!E0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? z5.b.a(accessibilityEvent) : 0;
        this.B |= iA != 0 ? iA : 0;
        return true;
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, qa.a.f105269a);
    }

    public static class a0 extends r6.a {
        public static final Parcelable.Creator<a0> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f13200c;

        class a implements Parcelable.ClassLoaderCreator<a0> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a0 createFromParcel(Parcel parcel) {
                return new a0(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a0(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a0[] newArray(int i11) {
                return new a0[i11];
            }
        }

        a0(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13200c = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        void b(a0 a0Var) {
            this.f13200c = a0Var.f13200c;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f13200c, 0);
        }

        a0(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f13149b = new z();
        this.f13151c = new x();
        this.f13159g = new androidx.recyclerview.widget.a0();
        this.f13163i = new a();
        this.f13165j = new Rect();
        this.f13167k = new Rect();
        this.f13169l = new RectF();
        this.f13177p = new ArrayList();
        this.f13179q = new ArrayList<>();
        this.f13181r = new ArrayList<>();
        this.f13193x = 0;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        this.J = P0;
        this.O = new androidx.recyclerview.widget.g();
        this.P = 0;
        this.Q = -1;
        this.f13154d0 = Float.MIN_VALUE;
        this.f13156e0 = Float.MIN_VALUE;
        this.f13158f0 = true;
        this.f13160g0 = new f0();
        this.f13164i0 = M0 ? new androidx.recyclerview.widget.k.b() : null;
        this.f13166j0 = new c0();
        this.f13172m0 = false;
        this.f13174n0 = false;
        this.f13176o0 = new o();
        this.f13178p0 = false;
        this.f13184s0 = new int[2];
        this.f13188u0 = new int[2];
        this.f13190v0 = new int[2];
        this.f13192w0 = new int[2];
        this.f13194x0 = new ArrayList();
        this.f13196y0 = new b();
        this.A0 = 0;
        this.B0 = 0;
        this.D0 = new d();
        e eVar = new e();
        this.E0 = eVar;
        this.F0 = new androidx.core.view.h(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f13154d0 = p0.f(viewConfiguration, context);
        this.f13156e0 = p0.j(viewConfiguration, context);
        this.f13150b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13152c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f13147a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.setListener(this.f13176o0);
        y0();
        A0();
        z0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.v(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qa.d.f105277a, i11, 0);
        ViewCompat.n0(this, context, qa.d.f105277a, attributeSet, typedArrayObtainStyledAttributes, i11, 0);
        String string = typedArrayObtainStyledAttributes.getString(qa.d.f105286j);
        if (typedArrayObtainStyledAttributes.getInt(qa.d.f105280d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f13161h = typedArrayObtainStyledAttributes.getBoolean(qa.d.f105279c, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(qa.d.f105281e, false);
        this.f13189v = z11;
        if (z11) {
            B0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(qa.d.f105284h), typedArrayObtainStyledAttributes.getDrawable(qa.d.f105285i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(qa.d.f105282f), typedArrayObtainStyledAttributes.getDrawable(qa.d.f105283g));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.C0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        B(context, string, attributeSet, i11, 0);
        int[] iArr = I0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        ViewCompat.n0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i11, 0);
        boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
        q6.a.h(this, true);
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g0 f13274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f13275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13277d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13275b = new Rect();
            this.f13276c = true;
            this.f13277d = false;
        }

        public int a() {
            return this.f13274a.getLayoutPosition();
        }

        public boolean b() {
            return this.f13274a.isUpdated();
        }

        public boolean c() {
            return this.f13274a.isRemoved();
        }

        public boolean d() {
            return this.f13274a.isInvalid();
        }

        public r(int i11, int i12) {
            super(i11, i12);
            this.f13275b = new Rect();
            this.f13276c = true;
            this.f13277d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13275b = new Rect();
            this.f13276c = true;
            this.f13277d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13275b = new Rect();
            this.f13276c = true;
            this.f13277d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.f13275b = new Rect();
            this.f13276c = true;
            this.f13277d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f13173n;
        if (qVar != null) {
            return qVar.L(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + V());
    }
}
