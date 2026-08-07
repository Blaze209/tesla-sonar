package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f2371v = i.g.f73838m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f2373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f2374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f2377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final q0 f2379i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PopupWindow.OnDismissListener f2382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f2383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f2384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j.a f2385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ViewTreeObserver f2386p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2387q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2389s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2391u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f2380j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f2381k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2390t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f2379i.A()) {
                return;
            }
            View view = l.this.f2384n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f2379i.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f2386p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f2386p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f2386p.removeGlobalOnLayoutListener(lVar.f2380j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i11, int i12, boolean z11) {
        this.f2372b = context;
        this.f2373c = eVar;
        this.f2375e = z11;
        this.f2374d = new d(eVar, LayoutInflater.from(context), z11, f2371v);
        this.f2377g = i11;
        this.f2378h = i12;
        Resources resources = context.getResources();
        this.f2376f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f73762d));
        this.f2383m = view;
        this.f2379i = new q0(context, null, i11, i12);
        eVar.c(this, context);
    }

    private boolean A() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f2387q || (view = this.f2383m) == null) {
            return false;
        }
        this.f2384n = view;
        this.f2379i.J(this);
        this.f2379i.K(this);
        this.f2379i.I(true);
        View view2 = this.f2384n;
        boolean z11 = this.f2386p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2386p = viewTreeObserver;
        if (z11) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2380j);
        }
        view2.addOnAttachStateChangeListener(this.f2381k);
        this.f2379i.C(view2);
        this.f2379i.F(this.f2390t);
        if (!this.f2388r) {
            this.f2389s = h.p(this.f2374d, null, this.f2372b, this.f2376f);
            this.f2388r = true;
        }
        this.f2379i.E(this.f2389s);
        this.f2379i.H(2);
        this.f2379i.G(o());
        this.f2379i.show();
        ListView listViewJ = this.f2379i.j();
        listViewJ.setOnKeyListener(this);
        if (this.f2391u && this.f2373c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2372b).inflate(i.g.f73837l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f2373c.z());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f2379i.o(this.f2374d);
        this.f2379i.show();
        return true;
    }

    @Override // o.e
    public boolean a() {
        return !this.f2387q && this.f2379i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z11) {
        if (eVar != this.f2373c) {
            return;
        }
        dismiss();
        j.a aVar = this.f2385o;
        if (aVar != null) {
            aVar.b(eVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable d() {
        return null;
    }

    @Override // o.e
    public void dismiss() {
        if (a()) {
            this.f2379i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        this.f2388r = false;
        d dVar = this.f2374d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f2385o = aVar;
    }

    @Override // o.e
    public ListView j() {
        return this.f2379i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public void k(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean l(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f2372b, mVar, this.f2384n, this.f2375e, this.f2377g, this.f2378h);
            iVar.j(this.f2385o);
            iVar.g(h.y(mVar));
            iVar.i(this.f2382l);
            this.f2382l = null;
            this.f2373c.e(false);
            int iK = this.f2379i.k();
            int iH = this.f2379i.h();
            if ((Gravity.getAbsoluteGravity(this.f2390t, ViewCompat.A(this.f2383m)) & 7) == 5) {
                iK += this.f2383m.getWidth();
            }
            if (iVar.n(iK, iH)) {
                j.a aVar = this.f2385o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void m(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2387q = true;
        this.f2373c.close();
        ViewTreeObserver viewTreeObserver = this.f2386p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2386p = this.f2384n.getViewTreeObserver();
            }
            this.f2386p.removeGlobalOnLayoutListener(this.f2380j);
            this.f2386p = null;
        }
        this.f2384n.removeOnAttachStateChangeListener(this.f2381k);
        PopupWindow.OnDismissListener onDismissListener = this.f2382l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
    public void q(View view) {
        this.f2383m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(boolean z11) {
        this.f2374d.d(z11);
    }

    @Override // o.e
    public void show() {
        if (!A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i11) {
        this.f2390t = i11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(int i11) {
        this.f2379i.l(i11);
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(PopupWindow.OnDismissListener onDismissListener) {
        this.f2382l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(boolean z11) {
        this.f2391u = z11;
    }

    @Override // androidx.appcompat.view.menu.h
    public void x(int i11) {
        this.f2379i.e(i11);
    }
}
