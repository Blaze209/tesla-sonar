package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q0;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = i.g.f73830e;
    boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f2251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Handler f2252g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f2260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f2261p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2264s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2265t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2266u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private j.a f2269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ViewTreeObserver f2270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2271z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<e> f2253h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final List<d> f2254i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2255j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2256k = new ViewOnAttachStateChangeListenerC0061b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p0 f2257l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2258m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2259n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2267v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2262q = E();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f2254i.size() <= 0 || b.this.f2254i.get(0).f2279a.A()) {
                return;
            }
            View view = b.this.f2261p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f2254i.iterator();
            while (it.hasNext()) {
                it.next().f2279a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0061b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0061b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f2270y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f2270y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f2270y.removeGlobalOnLayoutListener(bVar.f2255j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements p0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f2275a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MenuItem f2276b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f2277c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f2275a = dVar;
                this.f2276b = menuItem;
                this.f2277c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f2275a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f2280b.e(false);
                    b.this.A = false;
                }
                if (this.f2276b.isEnabled() && this.f2276b.hasSubMenu()) {
                    this.f2277c.N(this.f2276b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.p0
        public void c(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f2252g.removeCallbacksAndMessages(null);
            int size = b.this.f2254i.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (eVar == b.this.f2254i.get(i11).f2280b) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return;
            }
            int i12 = i11 + 1;
            b.this.f2252g.postAtTime(new a(i12 < b.this.f2254i.size() ? b.this.f2254i.get(i12) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.p0
        public void i(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f2252g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f2279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f2280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2281c;

        public d(@NonNull q0 q0Var, @NonNull e eVar, int i11) {
            this.f2279a = q0Var;
            this.f2280b = eVar;
            this.f2281c = i11;
        }

        public ListView a() {
            return this.f2279a.j();
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i11, int i12, boolean z11) {
        this.f2247b = context;
        this.f2260o = view;
        this.f2249d = i11;
        this.f2250e = i12;
        this.f2251f = z11;
        Resources resources = context.getResources();
        this.f2248c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f73762d));
        this.f2252g = new Handler();
    }

    private q0 A() {
        q0 q0Var = new q0(this.f2247b, null, this.f2249d, this.f2250e);
        q0Var.T(this.f2257l);
        q0Var.K(this);
        q0Var.J(this);
        q0Var.C(this.f2260o);
        q0Var.F(this.f2259n);
        q0Var.I(true);
        q0Var.H(2);
        return q0Var;
    }

    private int B(@NonNull e eVar) {
        int size = this.f2254i.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (eVar == this.f2254i.get(i11).f2280b) {
                return i11;
            }
        }
        return -1;
    }

    private MenuItem C(@NonNull e eVar, @NonNull e eVar2) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = eVar.getItem(i11);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View D(@NonNull d dVar, @NonNull e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemC = C(dVar.f2280b, eVar);
        if (menuItemC == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (menuItemC == dVar2.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int E() {
        return ViewCompat.A(this.f2260o) == 1 ? 0 : 1;
    }

    private int F(int i11) {
        List<d> list = this.f2254i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2261p.getWindowVisibleDisplayFrame(rect);
        if (this.f2262q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i11 > rect.right ? 0 : 1;
        }
        return iArr[0] - i11 < 0 ? 1 : 0;
    }

    private void G(@NonNull e eVar) {
        d dVar;
        View viewD;
        int i11;
        int i12;
        int i13;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2247b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f2251f, B);
        if (!a() && this.f2267v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.y(eVar));
        }
        int iP = h.p(dVar2, null, this.f2247b, this.f2248c);
        q0 q0VarA = A();
        q0VarA.o(dVar2);
        q0VarA.E(iP);
        q0VarA.F(this.f2259n);
        if (this.f2254i.size() > 0) {
            List<d> list = this.f2254i;
            dVar = list.get(list.size() - 1);
            viewD = D(dVar, eVar);
        } else {
            dVar = null;
            viewD = null;
        }
        if (viewD != null) {
            q0VarA.U(false);
            q0VarA.R(null);
            int iF = F(iP);
            boolean z11 = iF == 1;
            this.f2262q = iF;
            if (Build.VERSION.SDK_INT >= 26) {
                q0VarA.C(viewD);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr = new int[2];
                this.f2260o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewD.getLocationOnScreen(iArr2);
                if ((this.f2259n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2260o.getWidth();
                    iArr2[0] = iArr2[0] + viewD.getWidth();
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.f2259n & 5) == 5) {
                if (z11) {
                    i13 = i11 + iP;
                } else {
                    iP = viewD.getWidth();
                    i13 = i11 - iP;
                }
            } else if (z11) {
                iP = viewD.getWidth();
                i13 = i11 + iP;
            } else {
                i13 = i11 - iP;
            }
            q0VarA.l(i13);
            q0VarA.M(true);
            q0VarA.e(i12);
        } else {
            if (this.f2263r) {
                q0VarA.l(this.f2265t);
            }
            if (this.f2264s) {
                q0VarA.e(this.f2266u);
            }
            q0VarA.G(o());
        }
        this.f2254i.add(new d(q0VarA, eVar, this.f2262q));
        q0VarA.show();
        ListView listViewJ = q0VarA.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f2268w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.g.f73837l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewJ.addHeaderView(frameLayout, null, false);
            q0VarA.show();
        }
    }

    @Override // o.e
    public boolean a() {
        return this.f2254i.size() > 0 && this.f2254i.get(0).f2279a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z11) {
        int iB = B(eVar);
        if (iB < 0) {
            return;
        }
        int i11 = iB + 1;
        if (i11 < this.f2254i.size()) {
            this.f2254i.get(i11).f2280b.e(false);
        }
        d dVarRemove = this.f2254i.remove(iB);
        dVarRemove.f2280b.Q(this);
        if (this.A) {
            dVarRemove.f2279a.S(null);
            dVarRemove.f2279a.D(0);
        }
        dVarRemove.f2279a.dismiss();
        int size = this.f2254i.size();
        if (size > 0) {
            this.f2262q = this.f2254i.get(size - 1).f2281c;
        } else {
            this.f2262q = E();
        }
        if (size != 0) {
            if (z11) {
                this.f2254i.get(0).f2280b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f2269x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2270y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2270y.removeGlobalOnLayoutListener(this.f2255j);
            }
            this.f2270y = null;
        }
        this.f2261p.removeOnAttachStateChangeListener(this.f2256k);
        this.f2271z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable d() {
        return null;
    }

    @Override // o.e
    public void dismiss() {
        int size = this.f2254i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f2254i.toArray(new d[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                d dVar = dVarArr[i11];
                if (dVar.f2279a.a()) {
                    dVar.f2279a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        Iterator<d> it = this.f2254i.iterator();
        while (it.hasNext()) {
            h.z(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f2269x = aVar;
    }

    @Override // o.e
    public ListView j() {
        if (this.f2254i.isEmpty()) {
            return null;
        }
        List<d> list = this.f2254i;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean l(m mVar) {
        for (d dVar : this.f2254i) {
            if (mVar == dVar.f2280b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m(mVar);
        j.a aVar = this.f2269x;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
        eVar.c(this, this.f2247b);
        if (a()) {
            G(eVar);
        } else {
            this.f2253h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean n() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f2254i.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f2254i.get(i11);
            if (!dVar.f2279a.a()) {
                break;
            } else {
                i11++;
            }
        }
        if (dVar != null) {
            dVar.f2280b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i11 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(@NonNull View view) {
        if (this.f2260o != view) {
            this.f2260o = view;
            this.f2259n = androidx.core.view.k.b(this.f2258m, ViewCompat.A(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z11) {
        this.f2267v = z11;
    }

    @Override // o.e
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f2253h.iterator();
        while (it.hasNext()) {
            G(it.next());
        }
        this.f2253h.clear();
        View view = this.f2260o;
        this.f2261p = view;
        if (view != null) {
            boolean z11 = this.f2270y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2270y = viewTreeObserver;
            if (z11) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2255j);
            }
            this.f2261p.addOnAttachStateChangeListener(this.f2256k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i11) {
        if (this.f2258m != i11) {
            this.f2258m = i11;
            this.f2259n = androidx.core.view.k.b(i11, ViewCompat.A(this.f2260o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i11) {
        this.f2263r = true;
        this.f2265t = i11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f2271z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(boolean z11) {
        this.f2268w = z11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(int i11) {
        this.f2264s = true;
        this.f2266u = i11;
    }
}
