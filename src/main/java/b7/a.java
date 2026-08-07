package b7;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends ViewGroup {
    private static final int[] L = {R.attr.colorPrimaryDark};
    static final int[] M = {R.attr.layout_gravity};
    static final boolean N;
    private static final boolean O;
    private static boolean P;
    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList<View> H;
    private Rect I;
    private Matrix J;
    private final AccessibilityViewCommand K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f16733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f16736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f16737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s6.c f16738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s6.c f16739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f16740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f16741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f16744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f16750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<e> f16751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f16752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f16753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f16754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f16755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f16756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f16757z;

    /* JADX INFO: renamed from: b7.a$a, reason: collision with other inner class name */
    class C0328a implements AccessibilityViewCommand {
        C0328a() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean a(@NonNull View view, AccessibilityViewCommand.a aVar) {
            if (!a.this.C(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f16760d = new Rect();

        c() {
        }

        private void n(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (a.A(childAt)) {
                    accessibilityNodeInfoCompat.c(childAt);
                }
            }
        }

        private void o(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.f16760d;
            accessibilityNodeInfoCompat2.n(rect);
            accessibilityNodeInfoCompat.q0(rect);
            accessibilityNodeInfoCompat.l1(accessibilityNodeInfoCompat2.e0());
            accessibilityNodeInfoCompat.P0(accessibilityNodeInfoCompat2.B());
            accessibilityNodeInfoCompat.t0(accessibilityNodeInfoCompat2.q());
            accessibilityNodeInfoCompat.x0(accessibilityNodeInfoCompat2.u());
            accessibilityNodeInfoCompat.B0(accessibilityNodeInfoCompat2.R());
            accessibilityNodeInfoCompat.E0(accessibilityNodeInfoCompat2.U());
            accessibilityNodeInfoCompat.m0(accessibilityNodeInfoCompat2.M());
            accessibilityNodeInfoCompat.Y0(accessibilityNodeInfoCompat2.b0());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoCompat2.k());
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = a.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = a.this.s(a.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (a.N) {
                super.g(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatH0 = AccessibilityNodeInfoCompat.h0(accessibilityNodeInfoCompat);
                super.g(view, accessibilityNodeInfoCompatH0);
                accessibilityNodeInfoCompat.a1(view);
                Object objG = ViewCompat.G(view);
                if (objG instanceof View) {
                    accessibilityNodeInfoCompat.R0((View) objG);
                }
                o(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatH0);
                accessibilityNodeInfoCompatH0.j0();
                n(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.t0("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.D0(false);
            accessibilityNodeInfoCompat.E0(false);
            accessibilityNodeInfoCompat.k0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7742e);
            accessibilityNodeInfoCompat.k0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7743f);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.N || a.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            if (a.A(view)) {
                return;
            }
            accessibilityNodeInfoCompat.R0(null);
        }
    }

    public interface e {
        void a(@NonNull View view);

        void b(@NonNull View view);

        void c(int i11);

        void d(@NonNull View view, float f11);
    }

    private class h extends s6.c.AbstractC2350c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s6.c f16772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f16773c = new RunnableC0330a();

        /* JADX INFO: renamed from: b7.a$h$a, reason: collision with other inner class name */
        class RunnableC0330a implements Runnable {
            RunnableC0330a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i11) {
            this.f16771a = i11;
        }

        private void n() {
            View viewN = a.this.n(this.f16771a == 3 ? 5 : 3);
            if (viewN != null) {
                a.this.f(viewN);
            }
        }

        @Override // s6.c.AbstractC2350c
        public int a(View view, int i11, int i12) {
            if (a.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i11, 0));
            }
            int width = a.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i11, width));
        }

        @Override // s6.c.AbstractC2350c
        public int b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // s6.c.AbstractC2350c
        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // s6.c.AbstractC2350c
        public void f(int i11, int i12) {
            View viewN = (i11 & 1) == 1 ? a.this.n(3) : a.this.n(5);
            if (viewN == null || a.this.r(viewN) != 0) {
                return;
            }
            this.f16772b.b(viewN, i12);
        }

        @Override // s6.c.AbstractC2350c
        public boolean g(int i11) {
            return false;
        }

        @Override // s6.c.AbstractC2350c
        public void h(int i11, int i12) {
            a.this.postDelayed(this.f16773c, 160L);
        }

        @Override // s6.c.AbstractC2350c
        public void i(View view, int i11) {
            ((f) view.getLayoutParams()).f16764c = false;
            n();
        }

        @Override // s6.c.AbstractC2350c
        public void j(int i11) {
            a.this.T(i11, this.f16772b.v());
        }

        @Override // s6.c.AbstractC2350c
        public void k(View view, int i11, int i12, int i13, int i14) {
            int width = view.getWidth();
            float width2 = (a.this.c(view, 3) ? i11 + width : a.this.getWidth() - i11) / width;
            a.this.Q(view, width2);
            view.setVisibility(width2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            a.this.invalidate();
        }

        @Override // s6.c.AbstractC2350c
        public void l(View view, float f11, float f12) {
            int i11;
            float fU = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                i11 = (f11 > BitmapDescriptorFactory.HUE_RED || (f11 == BitmapDescriptorFactory.HUE_RED && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f11 < BitmapDescriptorFactory.HUE_RED || (f11 == BitmapDescriptorFactory.HUE_RED && fU > 0.5f)) {
                    width2 -= width;
                }
                i11 = width2;
            }
            this.f16772b.O(i11, view.getTop());
            a.this.invalidate();
        }

        @Override // s6.c.AbstractC2350c
        public boolean m(View view, int i11) {
            return a.this.D(view) && a.this.c(view, this.f16771a) && a.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iX = this.f16772b.x();
            boolean z11 = this.f16771a == 3;
            if (z11) {
                viewN = a.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iX;
            } else {
                viewN = a.this.n(5);
                width = a.this.getWidth() - iX;
            }
            if (viewN != null) {
                if (((!z11 || viewN.getLeft() >= width) && (z11 || viewN.getLeft() <= width)) || a.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f16772b.Q(viewN, width, viewN.getTop());
                fVar.f16764c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f16773c);
        }

        public void q(s6.c cVar) {
            this.f16772b = cVar;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i11 >= 29;
    }

    public a(@NonNull Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (ViewCompat.y(view) == 4 || ViewCompat.y(view) == 2) ? false : true;
    }

    private boolean F(float f11, float f12, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f11, (int) f12);
    }

    private void G(Drawable drawable, int i11) {
        if (drawable == null || !l5.a.h(drawable)) {
            return;
        }
        l5.a.m(drawable, i11);
    }

    private Drawable N() {
        int iA = ViewCompat.A(this);
        if (iA == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                G(drawable, iA);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                G(drawable2, iA);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable O() {
        int iA = ViewCompat.A(this);
        if (iA == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                G(drawable, iA);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                G(drawable2, iA);
                return this.D;
            }
        }
        return this.G;
    }

    private void P() {
        if (O) {
            return;
        }
        this.f16755x = N();
        this.f16756y = O();
    }

    private void R(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7762y;
        ViewCompat.j0(view, accessibilityActionCompat.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        ViewCompat.l0(view, accessibilityActionCompat, null, this.K);
    }

    private void S(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z11 || D(childAt)) && !(z11 && childAt == view)) {
                ViewCompat.z0(childAt, 4);
            } else {
                ViewCompat.z0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            motionEventObtain.transform(this.J);
        }
        return motionEventObtain;
    }

    static String w(int i11) {
        if ((i11 & 3) == 3) {
            return "LEFT";
        }
        return (i11 & 5) == 5 ? "RIGHT" : Integer.toHexString(i11);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((f) getChildAt(i11).getLayoutParams()).f16764c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f16762a == 0;
    }

    public boolean C(@NonNull View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f16765d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int iB = k.b(((f) view.getLayoutParams()).f16762a, ViewCompat.A(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean E(@NonNull View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f16763b > BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f11) {
        float fU = u(view);
        float width = view.getWidth();
        int i11 = ((int) (width * f11)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i11 = -i11;
        }
        view.offsetLeftAndRight(i11);
        Q(view, f11);
    }

    public void I(int i11) {
        J(i11, true);
    }

    public void J(int i11, boolean z11) {
        View viewN = n(i11);
        if (viewN != null) {
            L(viewN, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void K(@NonNull View view) {
        L(view, true);
    }

    public void L(@NonNull View view, boolean z11) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f16744m) {
            fVar.f16763b = 1.0f;
            fVar.f16765d = 1;
            S(view, true);
            R(view);
        } else if (z11) {
            fVar.f16765d |= 2;
            if (c(view, 3)) {
                this.f16738g.Q(view, 0, view.getTop());
            } else {
                this.f16739h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            T(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(@NonNull e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f16751t) == null) {
            return;
        }
        list.remove(eVar);
    }

    void Q(View view, float f11) {
        f fVar = (f) view.getLayoutParams();
        if (f11 == fVar.f16763b) {
            return;
        }
        fVar.f16763b = f11;
        l(view, f11);
    }

    void T(int i11, View view) {
        int i12;
        int iA = this.f16738g.A();
        int iA2 = this.f16739h.A();
        if (iA == 1 || iA2 == 1) {
            i12 = 1;
        } else {
            i12 = 2;
            if (iA != 2 && iA2 != 2) {
                i12 = 0;
            }
        }
        if (view != null && i11 == 0) {
            float f11 = ((f) view.getLayoutParams()).f16763b;
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                j(view);
            } else if (f11 == 1.0f) {
                k(view);
            }
        }
        if (i12 != this.f16742k) {
            this.f16742k = i12;
            List<e> list = this.f16751t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16751t.get(size).c(i12);
                }
            }
        }
    }

    public void a(@NonNull e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f16751t == null) {
            this.f16751t = new ArrayList();
        }
        this.f16751t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!D(childAt)) {
                this.H.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i11, i12);
                z11 = true;
            }
        }
        if (!z11) {
            int size = this.H.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = this.H.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (o() != null || D(view)) {
            ViewCompat.z0(view, 4);
        } else {
            ViewCompat.z0(view, 1);
        }
        if (N) {
            return;
        }
        ViewCompat.p0(view, this.f16732a);
    }

    void b() {
        if (this.f16749r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f16749r = true;
    }

    boolean c(View view, int i11) {
        return (t(view) & i11) == i11;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < childCount; i11++) {
            fMax = Math.max(fMax, ((f) getChildAt(i11).getLayoutParams()).f16763b);
        }
        this.f16736e = fMax;
        boolean zM = this.f16738g.m(true);
        boolean zM2 = this.f16739h.m(true);
        if (zM || zM2) {
            ViewCompat.g0(this);
        }
    }

    public void d(int i11) {
        e(i11, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f16736e <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt = getChildAt(i11);
            if (F(x11, y11, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i11 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(iSave);
        float f11 = this.f16736e;
        if (f11 > BitmapDescriptorFactory.HUE_RED && zB) {
            int i14 = this.f16735d;
            this.f16737f.setColor((i14 & 16777215) | (((int) ((((-16777216) & i14) >>> 24) * f11)) << 24));
            canvas.drawRect(i11, BitmapDescriptorFactory.HUE_RED, width, getHeight(), this.f16737f);
            return zDrawChild;
        }
        if (this.f16755x != null && c(view, 3)) {
            int intrinsicWidth = this.f16755x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(right2 / this.f16738g.x(), 1.0f));
            this.f16755x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f16755x.setAlpha((int) (fMax * 255.0f));
            this.f16755x.draw(canvas);
            return zDrawChild;
        }
        if (this.f16756y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f16756y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min((getWidth() - left2) / this.f16739h.x(), 1.0f));
            this.f16756y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f16756y.setAlpha((int) (fMax2 * 255.0f));
            this.f16756y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i11, boolean z11) {
        View viewN = n(i11);
        if (viewN != null) {
            g(viewN, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void f(@NonNull View view) {
        g(view, true);
    }

    public void g(@NonNull View view, boolean z11) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f16744m) {
            fVar.f16763b = BitmapDescriptorFactory.HUE_RED;
            fVar.f16765d = 0;
        } else if (z11) {
            fVar.f16765d |= 4;
            if (c(view, 3)) {
                this.f16738g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f16739h.Q(view, getWidth(), view.getTop());
            }
        } else {
            H(view, BitmapDescriptorFactory.HUE_RED);
            T(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        return O ? this.f16733b : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f16754w;
    }

    public void h() {
        i(false);
    }

    void i(boolean z11) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z11 || fVar.f16764c)) {
                zQ |= c(childAt, 3) ? this.f16738g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f16739h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f16764c = false;
            }
        }
        this.f16740i.p();
        this.f16741j.p();
        if (zQ) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f16765d & 1) == 1) {
            fVar.f16765d = 0;
            List<e> list = this.f16751t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16751t.get(size).b(view);
                }
            }
            S(view, false);
            R(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f16765d & 1) == 0) {
            fVar.f16765d = 1;
            List<e> list = this.f16751t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f16751t.get(size).a(view);
                }
            }
            S(view, true);
            R(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f11) {
        List<e> list = this.f16751t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f16751t.get(size).d(view, f11);
            }
        }
    }

    View n(int i11) {
        int iB = k.b(i11, ViewCompat.A(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((((f) childAt.getLayoutParams()).f16765d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16744m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16744m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.f16754w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f16754w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f16754w.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        boolean zP = this.f16738g.P(motionEvent) | this.f16739h.P(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f16749r = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f16749r = false;
                }
            } else if (this.f16738g.d(3)) {
                this.f16740i.p();
                this.f16741j.p();
            }
            z11 = false;
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f16752u = x11;
            this.f16753v = y11;
            z11 = this.f16736e > BitmapDescriptorFactory.HUE_RED && (viewT = this.f16738g.t((int) x11, (int) y11)) != null && B(viewT);
            this.f16749r = false;
        }
        return zP || z11 || y() || this.f16749r;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || !z()) {
            return super.onKeyDown(i11, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WindowInsets rootWindowInsets;
        float f11;
        int i15;
        boolean z12 = true;
        this.f16743l = true;
        int i16 = i13 - i11;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i18, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f12 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (fVar.f16763b * f12));
                        f11 = (measuredWidth + i15) / f12;
                    } else {
                        float f13 = measuredWidth;
                        int i19 = i16 - ((int) (fVar.f16763b * f13));
                        f11 = (i16 - i19) / f13;
                        i15 = i19;
                    }
                    boolean z13 = f11 != fVar.f16763b ? z12 : false;
                    int i21 = fVar.f16762a & 112;
                    if (i21 == 16) {
                        int i22 = i14 - i12;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i25 > i22 - i26) {
                                i23 = (i22 - i26) - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i23, measuredWidth + i15, measuredHeight + i23);
                    } else if (i21 != 80) {
                        int i27 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i15, i27, measuredWidth + i15, measuredHeight + i27);
                    } else {
                        int i28 = i14 - i12;
                        childAt.layout(i15, (i28 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i28 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z13) {
                        Q(childAt, f11);
                    }
                    int i29 = fVar.f16763b > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i29) {
                        childAt.setVisibility(i29);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            k5.e eVarI = WindowInsetsCompat.y(rootWindowInsets).i();
            s6.c cVar = this.f16738g;
            cVar.L(Math.max(cVar.w(), eVarI.f84924a));
            s6.c cVar2 = this.f16739h;
            cVar2.L(Math.max(cVar2.w(), eVarI.f84926c));
        }
        this.f16743l = false;
        this.f16744m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z11 = this.B != null && ViewCompat.x(this);
        int iA = ViewCompat.A(this);
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z11) {
                    int iB = k.b(fVar.f16762a, iA);
                    if (ViewCompat.x(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.B;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float fV = ViewCompat.v(childAt);
                        float f11 = this.f16733b;
                        if (fV != f11) {
                            ViewCompat.x0(childAt, f11);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z14 = iT == 3;
                    if ((z14 && z12) || (!z14 && z13)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z14) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f16734c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i11 = gVar.f16766c;
        if (i11 != 0 && (viewN = n(i11)) != null) {
            K(viewN);
        }
        int i12 = gVar.f16767d;
        if (i12 != 3) {
            setDrawerLockMode(i12, 3);
        }
        int i13 = gVar.f16768e;
        if (i13 != 3) {
            setDrawerLockMode(i13, 5);
        }
        int i14 = gVar.f16769f;
        if (i14 != 3) {
            setDrawerLockMode(i14, 8388611);
        }
        int i15 = gVar.f16770g;
        if (i15 != 3) {
            setDrawerLockMode(i15, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            f fVar = (f) getChildAt(i11).getLayoutParams();
            int i12 = fVar.f16765d;
            boolean z11 = i12 == 1;
            boolean z12 = i12 == 2;
            if (z11 || z12) {
                gVar.f16766c = fVar.f16762a;
                break;
            }
        }
        gVar.f16767d = this.f16745n;
        gVar.f16768e = this.f16746o;
        gVar.f16769f = this.f16747p;
        gVar.f16770g = this.f16748q;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View viewO;
        this.f16738g.F(motionEvent);
        this.f16739h.F(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f16752u = x11;
            this.f16753v = y11;
            this.f16749r = false;
        } else if (action == 1) {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            View viewT = this.f16738g.t((int) x12, (int) y12);
            if (viewT != null && B(viewT)) {
                float f11 = x12 - this.f16752u;
                float f12 = y12 - this.f16753v;
                int iZ = this.f16738g.z();
                z11 = (f11 * f11) + (f12 * f12) >= ((float) (iZ * iZ)) || (viewO = o()) == null || r(viewO) == 2;
            }
            i(z11);
        } else if (action == 3) {
            i(true);
            this.f16749r = false;
        }
        return true;
    }

    View p() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i11) {
        int iA = ViewCompat.A(this);
        if (i11 == 3) {
            int i12 = this.f16745n;
            if (i12 != 3) {
                return i12;
            }
            int i13 = iA == 0 ? this.f16747p : this.f16748q;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i11 == 5) {
            int i14 = this.f16746o;
            if (i14 != 3) {
                return i14;
            }
            int i15 = iA == 0 ? this.f16748q : this.f16747p;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i11 == 8388611) {
            int i16 = this.f16747p;
            if (i16 != 3) {
                return i16;
            }
            int i17 = iA == 0 ? this.f16745n : this.f16746o;
            if (i17 != 3) {
                return i17;
            }
            return 0;
        }
        if (i11 != 8388613) {
            return 0;
        }
        int i18 = this.f16748q;
        if (i18 != 3) {
            return i18;
        }
        int i19 = iA == 0 ? this.f16746o : this.f16745n;
        if (i19 != 3) {
            return i19;
        }
        return 0;
    }

    public int r(@NonNull View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f16762a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f16743l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i11) {
        int iB = k.b(i11, ViewCompat.A(this));
        if (iB == 3) {
            return this.f16757z;
        }
        if (iB == 5) {
            return this.A;
        }
        return null;
    }

    public void setChildInsets(Object obj, boolean z11) {
        this.B = obj;
        this.C = z11;
        setWillNotDraw(!z11 && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f11) {
        this.f16733b = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt)) {
                ViewCompat.x0(childAt, this.f16733b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f16750s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f16750s = eVar;
    }

    public void setDrawerLockMode(int i11) {
        setDrawerLockMode(i11, 3);
        setDrawerLockMode(i11, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i11) {
        if (O) {
            return;
        }
        if ((i11 & 8388611) == 8388611) {
            this.D = drawable;
        } else if ((i11 & 8388613) == 8388613) {
            this.E = drawable;
        } else if ((i11 & 3) == 3) {
            this.F = drawable;
        } else if ((i11 & 5) != 5) {
            return;
        } else {
            this.G = drawable;
        }
        P();
        invalidate();
    }

    public void setDrawerTitle(int i11, CharSequence charSequence) {
        int iB = k.b(i11, ViewCompat.A(this));
        if (iB == 3) {
            this.f16757z = charSequence;
        } else if (iB == 5) {
            this.A = charSequence;
        }
    }

    public void setScrimColor(int i11) {
        this.f16735d = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f16754w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f16754w = new ColorDrawable(i11);
        invalidate();
    }

    int t(View view) {
        return k.b(((f) view.getLayoutParams()).f16762a, ViewCompat.A(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f16763b;
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a7.a.f481a);
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f16732a = new d();
        this.f16735d = -1728053248;
        this.f16737f = new Paint();
        this.f16744m = true;
        this.f16745n = 3;
        this.f16746o = 3;
        this.f16747p = 3;
        this.f16748q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new C0328a();
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f16734c = (int) ((64.0f * f11) + 0.5f);
        float f12 = f11 * 400.0f;
        h hVar = new h(3);
        this.f16740i = hVar;
        h hVar2 = new h(5);
        this.f16741j = hVar2;
        s6.c cVarN = s6.c.n(this, 1.0f, hVar);
        this.f16738g = cVarN;
        cVarN.M(1);
        cVarN.N(f12);
        hVar.q(cVarN);
        s6.c cVarN2 = s6.c.n(this, 1.0f, hVar2);
        this.f16739h = cVarN2;
        cVarN2.M(2);
        cVarN2.N(f12);
        hVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        ViewCompat.z0(this, 1);
        ViewCompat.p0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.x(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.f16754w = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a7.c.f484b, i11, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(a7.c.f485c)) {
                this.f16733b = typedArrayObtainStyledAttributes2.getDimension(a7.c.f485c, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f16733b = getResources().getDimension(a7.b.f482a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.H = new ArrayList<>();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void setDrawerLockMode(int i11, int i12) {
        View viewN;
        int iB = k.b(i12, ViewCompat.A(this));
        if (i12 == 3) {
            this.f16745n = i11;
        } else if (i12 == 5) {
            this.f16746o = i11;
        } else if (i12 == 8388611) {
            this.f16747p = i11;
        } else if (i12 == 8388613) {
            this.f16748q = i11;
        }
        if (i11 != 0) {
            (iB == 3 ? this.f16738g : this.f16739h).a();
        }
        if (i11 != 1) {
            if (i11 == 2 && (viewN = n(iB)) != null) {
                K(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void setStatusBarBackground(int i11) {
        this.f16754w = i11 != 0 ? androidx.core.content.b.getDrawable(getContext(), i11) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f16763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f16764c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16765d;

        public f(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16762a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.M);
            this.f16762a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i11, int i12) {
            super(i11, i12);
            this.f16762a = 0;
        }

        public f(@NonNull f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f16762a = 0;
            this.f16762a = fVar.f16762a;
        }

        public f(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16762a = 0;
        }

        public f(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16762a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends r6.a {
        public static final Parcelable.Creator<g> CREATOR = new C0329a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f16768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f16769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16770g;

        /* JADX INFO: renamed from: b7.a$g$a, reason: collision with other inner class name */
        class C0329a implements Parcelable.ClassLoaderCreator<g> {
            C0329a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16766c = 0;
            this.f16766c = parcel.readInt();
            this.f16767d = parcel.readInt();
            this.f16768e = parcel.readInt();
            this.f16769f = parcel.readInt();
            this.f16770g = parcel.readInt();
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f16766c);
            parcel.writeInt(this.f16767d);
            parcel.writeInt(this.f16768e);
            parcel.writeInt(this.f16769f);
            parcel.writeInt(this.f16770g);
        }

        public g(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f16766c = 0;
        }
    }

    public void setDrawerShadow(int i11, int i12) {
        setDrawerShadow(androidx.core.content.b.getDrawable(getContext(), i11), i12);
    }

    public void setDrawerLockMode(int i11, @NonNull View view) {
        if (D(view)) {
            setDrawerLockMode(i11, ((f) view.getLayoutParams()).f16762a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
