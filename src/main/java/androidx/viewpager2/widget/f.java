package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static boolean f14388u = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f14389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f14390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f14391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f14392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f14393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f14394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LinearLayoutManager f14395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Parcelable f14397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RecyclerView f14398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u f14399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f14400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f14401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f14402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f14403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RecyclerView.n f14404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f14405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    e f14408t;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.f.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            f fVar = f.this;
            fVar.f14393e = true;
            fVar.f14400l.j();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int i11) {
            if (i11 == 0) {
                f.this.m();
            }
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i11) {
            f fVar = f.this;
            if (fVar.f14392d != i11) {
                fVar.f14392d = i11;
                fVar.f14408t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i11) {
            f.this.clearFocus();
            if (f.this.hasFocus()) {
                f.this.f14398j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.s {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void d(@NonNull View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) rVar).width != -1 || ((ViewGroup.MarginLayoutParams) rVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i11) {
            return false;
        }

        boolean c(int i11, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        void k(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        boolean l(int i11) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i11, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.f$f, reason: collision with other inner class name */
    class C0244f extends e {
        C0244f() {
            super(f.this, null);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean b(int i11) {
            return (i11 == 8192 || i11 == 4096) && !f.this.e();
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (f.this.e()) {
                return;
            }
            accessibilityNodeInfoCompat.k0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r);
            accessibilityNodeInfoCompat.k0(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7754q);
            accessibilityNodeInfoCompat.X0(false);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean l(int i11) {
            if (b(i11)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i11, int i12, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i11, int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i11, int i12) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void S1(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.S1(c0Var, iArr);
                return;
            }
            int pageSize = f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
        public void T0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.T0(xVar, c0Var, accessibilityNodeInfoCompat);
            f.this.f14408t.j(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void V0(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            f.this.f14408t.k(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean n1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, int i11, Bundle bundle) {
            return f.this.f14408t.b(i11) ? f.this.f14408t.l(i11) : super.n1(xVar, c0Var, i11, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public boolean y1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z11, boolean z12) {
            return false;
        }
    }

    public static abstract class i {
        public void a(int i11) {
        }

        public void b(int i11, float f11, int i12) {
        }

        public void c(int i11) {
        }
    }

    class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AccessibilityViewCommand f14415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AccessibilityViewCommand f14416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.j f14417d;

        class a implements AccessibilityViewCommand {
            a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean a(@NonNull View view, AccessibilityViewCommand.a aVar) {
                j.this.x(((f) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements AccessibilityViewCommand {
            b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean a(@NonNull View view, AccessibilityViewCommand.a aVar) {
                j.this.x(((f) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.f.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        j() {
            super(f.this, null);
            this.f14415b = new a();
            this.f14416c = new b();
        }

        private void u(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            int itemCount2;
            if (f.this.getAdapter() != null) {
                itemCount2 = 1;
                if (f.this.getOrientation() == 1) {
                    itemCount2 = f.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = f.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            accessibilityNodeInfoCompat.v0(AccessibilityNodeInfoCompat.d.b(itemCount2, itemCount, false, 0));
        }

        private void v(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(f.this.getOrientation() == 1 ? f.this.f14395g.m0(view) : 0, 1, f.this.getOrientation() == 0 ? f.this.f14395g.m0(view) : 0, 1, false, false));
        }

        private void w(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int itemCount;
            RecyclerView.h adapter = f.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.f14392d > 0) {
                accessibilityNodeInfoCompat.a(PKIFailureInfo.certRevoked);
            }
            if (f.this.f14392d < itemCount - 1) {
                accessibilityNodeInfoCompat.a(4096);
            }
            accessibilityNodeInfoCompat.X0(true);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean c(int i11, Bundle bundle) {
            return i11 == 8192 || i11 == 4096;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f14417d);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f14417d);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f14417d = new c();
            if (f.this.getImportantForAccessibility() == 0) {
                f.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatN1 = AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo);
            u(accessibilityNodeInfoCompatN1);
            w(accessibilityNodeInfoCompatN1);
        }

        @Override // androidx.viewpager2.widget.f.e
        void k(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            v(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean m(int i11, Bundle bundle) {
            if (!c(i11, bundle)) {
                throw new IllegalStateException();
            }
            x(i11 == 8192 ? f.this.getCurrentItem() - 1 : f.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(f.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.f.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void t() {
            y();
        }

        void x(int i11) {
            if (f.this.e()) {
                f.this.j(i11, true);
            }
        }

        void y() {
            int itemCount;
            f fVar = f.this;
            int i11 = R.id.accessibilityActionPageLeft;
            ViewCompat.j0(fVar, R.id.accessibilityActionPageLeft);
            ViewCompat.j0(fVar, R.id.accessibilityActionPageRight);
            ViewCompat.j0(fVar, R.id.accessibilityActionPageUp);
            ViewCompat.j0(fVar, R.id.accessibilityActionPageDown);
            if (f.this.getAdapter() == null || (itemCount = f.this.getAdapter().getItemCount()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.getOrientation() != 0) {
                if (f.this.f14392d < itemCount - 1) {
                    ViewCompat.l0(fVar, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, null), null, this.f14415b);
                }
                if (f.this.f14392d > 0) {
                    ViewCompat.l0(fVar, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, null), null, this.f14416c);
                    return;
                }
                return;
            }
            boolean zD = f.this.d();
            int i12 = zD ? 16908360 : 16908361;
            if (zD) {
                i11 = 16908361;
            }
            if (f.this.f14392d < itemCount - 1) {
                ViewCompat.l0(fVar, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i12, null), null, this.f14415b);
            }
            if (f.this.f14392d > 0) {
                ViewCompat.l0(fVar, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i11, null), null, this.f14416c);
            }
        }
    }

    public interface k {
        void a(@NonNull View view, float f11);
    }

    private class l extends u {
        l() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.y
        public View f(RecyclerView.q qVar) {
            if (f.this.c()) {
                return null;
            }
            return super.f(qVar);
        }
    }

    private class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return f.this.f14408t.d() ? f.this.f14408t.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(f.this.f14392d);
            accessibilityEvent.setToIndex(f.this.f14392d);
            f.this.f14408t.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    private static class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f14427b;

        o(int i11, RecyclerView recyclerView) {
            this.f14426a = i11;
            this.f14427b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14427b.E1(this.f14426a);
        }
    }

    public f(@NonNull Context context) {
        super(context);
        this.f14389a = new Rect();
        this.f14390b = new Rect();
        this.f14391c = new androidx.viewpager2.widget.b(3);
        this.f14393e = false;
        this.f14394f = new a();
        this.f14396h = -1;
        this.f14404p = null;
        this.f14405q = false;
        this.f14406r = true;
        this.f14407s = -1;
        b(context, null);
    }

    private RecyclerView.s a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f14408t = f14388u ? new j() : new C0244f();
        m mVar = new m(context);
        this.f14398j = mVar;
        mVar.setId(View.generateViewId());
        this.f14398j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f14395g = hVar;
        this.f14398j.setLayoutManager(hVar);
        this.f14398j.setScrollingTouchSlop(1);
        k(context, attributeSet);
        this.f14398j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f14398j.l(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f14400l = eVar;
        this.f14402n = new androidx.viewpager2.widget.c(this, eVar, this.f14398j);
        l lVar = new l();
        this.f14399k = lVar;
        lVar.b(this.f14398j);
        this.f14398j.n(this.f14400l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f14401m = bVar;
        this.f14400l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f14401m.d(bVar2);
        this.f14401m.d(cVar);
        this.f14408t.h(this.f14401m, this.f14398j);
        this.f14401m.d(this.f14391c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f14395g);
        this.f14403o = dVar;
        this.f14401m.d(dVar);
        RecyclerView recyclerView = this.f14398j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f14394f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        RecyclerView.h adapter;
        if (this.f14396h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f14397i;
        if (parcelable != null) {
            if (adapter instanceof ib.a) {
                ((ib.a) adapter).b(parcelable);
            }
            this.f14397i = null;
        }
        int iMax = Math.max(0, Math.min(this.f14396h, adapter.getItemCount() - 1));
        this.f14392d = iMax;
        this.f14396h = -1;
        this.f14398j.v1(iMax);
        this.f14408t.n();
    }

    private void k(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hb.a.f72471a);
        ViewCompat.n0(this, context, hb.a.f72471a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(hb.a.f72472b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void l(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f14394f);
        }
    }

    public boolean c() {
        return this.f14402n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.f14398j.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        return this.f14398j.canScrollVertically(i11);
    }

    boolean d() {
        return this.f14395g.e0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i11 = ((n) parcelable).f14423a;
            sparseArray.put(this.f14398j.getId(), sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f14406r;
    }

    public void g(@NonNull i iVar) {
        this.f14391c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f14408t.a() ? this.f14408t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f14398j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f14392d;
    }

    public int getItemDecorationCount() {
        return this.f14398j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f14407s;
    }

    public int getOrientation() {
        return this.f14395g.r2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f14398j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f14400l.f();
    }

    public void h() {
        if (this.f14403o.d() == null) {
            return;
        }
        double dE = this.f14400l.e();
        int i11 = (int) dE;
        float f11 = (float) (dE - ((double) i11));
        this.f14403o.b(i11, f11, Math.round(getPageSize() * f11));
    }

    void j(int i11, boolean z11) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f14396h != -1) {
                this.f14396h = Math.max(i11, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i11, 0), adapter.getItemCount() - 1);
        if (iMin == this.f14392d && this.f14400l.h()) {
            return;
        }
        int i12 = this.f14392d;
        if (iMin == i12 && z11) {
            return;
        }
        double dE = i12;
        this.f14392d = iMin;
        this.f14408t.r();
        if (!this.f14400l.h()) {
            dE = this.f14400l.e();
        }
        this.f14400l.k(iMin, z11);
        if (!z11) {
            this.f14398j.v1(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - dE) <= 3.0d) {
            this.f14398j.E1(iMin);
            return;
        }
        this.f14398j.v1(d11 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f14398j;
        recyclerView.post(new o(iMin, recyclerView));
    }

    void m() {
        u uVar = this.f14399k;
        if (uVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = uVar.f(this.f14395g);
        if (viewF == null) {
            return;
        }
        int iM0 = this.f14395g.m0(viewF);
        if (iM0 != this.f14392d && getScrollState() == 0) {
            this.f14401m.c(iM0);
        }
        this.f14393e = false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f14408t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.f14398j.getMeasuredWidth();
        int measuredHeight = this.f14398j.getMeasuredHeight();
        this.f14389a.left = getPaddingLeft();
        this.f14389a.right = (i13 - i11) - getPaddingRight();
        this.f14389a.top = getPaddingTop();
        this.f14389a.bottom = (i14 - i12) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f14389a, this.f14390b);
        RecyclerView recyclerView = this.f14398j;
        Rect rect = this.f14390b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f14393e) {
            m();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        measureChild(this.f14398j, i11, i12);
        int measuredWidth = this.f14398j.getMeasuredWidth();
        int measuredHeight = this.f14398j.getMeasuredHeight();
        int measuredState = this.f14398j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f14396h = nVar.f14424b;
        this.f14397i = nVar.f14425c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f14423a = this.f14398j.getId();
        int i11 = this.f14396h;
        if (i11 == -1) {
            i11 = this.f14392d;
        }
        nVar.f14424b = i11;
        Parcelable parcelable = this.f14397i;
        if (parcelable != null) {
            nVar.f14425c = parcelable;
            return nVar;
        }
        Object adapter = this.f14398j.getAdapter();
        if (adapter instanceof ib.a) {
            nVar.f14425c = ((ib.a) adapter).a();
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(f.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        return this.f14408t.c(i11, bundle) ? this.f14408t.m(i11, bundle) : super.performAccessibilityAction(i11, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f14398j.getAdapter();
        this.f14408t.f(adapter);
        l(adapter);
        this.f14398j.setAdapter(hVar);
        this.f14392d = 0;
        i();
        this.f14408t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i11) {
        setCurrentItem(i11, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.f14408t.q();
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f14407s = i11;
        this.f14398j.requestLayout();
    }

    public void setOrientation(int i11) {
        this.f14395g.F2(i11);
        this.f14408t.s();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f14405q) {
                this.f14404p = this.f14398j.getItemAnimator();
                this.f14405q = true;
            }
            this.f14398j.setItemAnimator(null);
        } else if (this.f14405q) {
            this.f14398j.setItemAnimator(this.f14404p);
            this.f14404p = null;
            this.f14405q = false;
        }
        if (kVar == this.f14403o.d()) {
            return;
        }
        this.f14403o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z11) {
        this.f14406r = z11;
        this.f14408t.t();
    }

    static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f14425c;

        class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i11) {
                return new n[i11];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f14423a = parcel.readInt();
            this.f14424b = parcel.readInt();
            this.f14425c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14423a);
            parcel.writeInt(this.f14424b);
            parcel.writeParcelable(this.f14425c, i11);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i11, boolean z11) {
        if (c()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        j(i11, z11);
    }

    public f(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14389a = new Rect();
        this.f14390b = new Rect();
        this.f14391c = new androidx.viewpager2.widget.b(3);
        this.f14393e = false;
        this.f14394f = new a();
        this.f14396h = -1;
        this.f14404p = null;
        this.f14405q = false;
        this.f14406r = true;
        this.f14407s = -1;
        b(context, attributeSet);
    }

    public f(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f14389a = new Rect();
        this.f14390b = new Rect();
        this.f14391c = new androidx.viewpager2.widget.b(3);
        this.f14393e = false;
        this.f14394f = new a();
        this.f14396h = -1;
        this.f14404p = null;
        this.f14405q = false;
        this.f14406r = true;
        this.f14407s = -1;
        b(context, attributeSet);
    }
}
