package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class c1 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f2635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f2637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f2638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f2639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f2640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f2641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f2643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f2644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f2645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f2646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f2647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f2648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f2651q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o.a f2652a;

        a() {
            this.f2652a = new o.a(c1.this.f2635a.getContext(), 0, R.id.home, 0, 0, c1.this.f2643i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            Window.Callback callback = c1Var.f2646l;
            if (callback == null || !c1Var.f2647m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2652a);
        }
    }

    class b extends androidx.core.view.x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2654a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2655b;

        b(int i11) {
            this.f2655b = i11;
        }

        @Override // androidx.core.view.x0, androidx.core.view.w0
        public void a(View view) {
            this.f2654a = true;
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            if (this.f2654a) {
                return;
            }
            c1.this.f2635a.setVisibility(this.f2655b);
        }

        @Override // androidx.core.view.x0, androidx.core.view.w0
        public void c(View view) {
            c1.this.f2635a.setVisibility(0);
        }
    }

    public c1(Toolbar toolbar, boolean z11) {
        this(toolbar, z11, i.h.f73846a, i.e.f73787n);
    }

    private void D(CharSequence charSequence) {
        this.f2643i = charSequence;
        if ((this.f2636b & 8) != 0) {
            this.f2635a.setTitle(charSequence);
        }
    }

    private void E() {
        if ((this.f2636b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2645k)) {
                this.f2635a.setNavigationContentDescription(this.f2650p);
            } else {
                this.f2635a.setNavigationContentDescription(this.f2645k);
            }
        }
    }

    private void F() {
        if ((this.f2636b & 4) == 0) {
            this.f2635a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f2635a;
        Drawable drawable = this.f2641g;
        if (drawable == null) {
            drawable = this.f2651q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        Drawable drawable;
        int i11 = this.f2636b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) == 0 || (drawable = this.f2640f) == null) {
            drawable = this.f2639e;
        }
        this.f2635a.setLogo(drawable);
    }

    private int x() {
        if (this.f2635a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2651q = this.f2635a.getNavigationIcon();
        return 15;
    }

    public void A(int i11) {
        B(i11 == 0 ? null : getContext().getString(i11));
    }

    public void B(CharSequence charSequence) {
        this.f2645k = charSequence;
        E();
    }

    public void C(CharSequence charSequence) {
        this.f2644j = charSequence;
        if ((this.f2636b & 8) != 0) {
            this.f2635a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.e0
    public boolean a() {
        return this.f2635a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public void b(Drawable drawable) {
        ViewCompat.t0(this.f2635a, drawable);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean c() {
        return this.f2635a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public void collapseActionView() {
        this.f2635a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean d() {
        return this.f2635a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean e() {
        return this.f2635a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean f() {
        return this.f2635a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean g() {
        return this.f2635a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.e0
    public Context getContext() {
        return this.f2635a.getContext();
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence getTitle() {
        return this.f2635a.getTitle();
    }

    @Override // androidx.appcompat.widget.e0
    public void h(int i11) {
        View view;
        int i12 = this.f2636b ^ i11;
        this.f2636b = i11;
        if (i12 != 0) {
            if ((i12 & 4) != 0) {
                if ((i11 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i12 & 3) != 0) {
                G();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    this.f2635a.setTitle(this.f2643i);
                    this.f2635a.setSubtitle(this.f2644j);
                } else {
                    this.f2635a.setTitle((CharSequence) null);
                    this.f2635a.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) == 0 || (view = this.f2638d) == null) {
                return;
            }
            if ((i11 & 16) != 0) {
                this.f2635a.addView(view);
            } else {
                this.f2635a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.e0
    public int i() {
        return this.f2649o;
    }

    @Override // androidx.appcompat.widget.e0
    public void j() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void k(boolean z11) {
        this.f2635a.setCollapsible(z11);
    }

    @Override // androidx.appcompat.widget.e0
    public void l() {
        this.f2635a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.e0
    public int m() {
        return this.f2636b;
    }

    @Override // androidx.appcompat.widget.e0
    public void n(View view) {
        View view2 = this.f2638d;
        if (view2 != null && (this.f2636b & 16) != 0) {
            this.f2635a.removeView(view2);
        }
        this.f2638d = view;
        if (view == null || (this.f2636b & 16) == 0) {
            return;
        }
        this.f2635a.addView(view);
    }

    @Override // androidx.appcompat.widget.e0
    public void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void p(Drawable drawable) {
        this.f2641g = drawable;
        F();
    }

    @Override // androidx.appcompat.widget.e0
    public Menu q() {
        return this.f2635a.getMenu();
    }

    @Override // androidx.appcompat.widget.e0
    public ViewPropertyAnimatorCompat r(int i11, long j11) {
        return ViewCompat.e(this.f2635a).b(i11 == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED).e(j11).g(new b(i11));
    }

    @Override // androidx.appcompat.widget.e0
    public ViewGroup s() {
        return this.f2635a;
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(int i11) {
        setIcon(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setMenu(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.f2648n == null) {
            c cVar = new c(this.f2635a.getContext());
            this.f2648n = cVar;
            cVar.r(i.f.f73807h);
        }
        this.f2648n.i(aVar);
        this.f2635a.setMenu((androidx.appcompat.view.menu.e) menu, this.f2648n);
    }

    @Override // androidx.appcompat.widget.e0
    public void setMenuPrepared() {
        this.f2647m = true;
    }

    @Override // androidx.appcompat.widget.e0
    public void setTitle(CharSequence charSequence) {
        this.f2642h = true;
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void setVisibility(int i11) {
        this.f2635a.setVisibility(i11);
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowCallback(Window.Callback callback) {
        this.f2646l = callback;
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2642h) {
            return;
        }
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void t(boolean z11) {
    }

    @Override // androidx.appcompat.widget.e0
    public void u(u0 u0Var) {
        View view = this.f2637c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2635a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2637c);
            }
        }
        this.f2637c = u0Var;
        if (u0Var == null || this.f2649o != 2) {
            return;
        }
        this.f2635a.addView(u0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f2637c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f1961a = 8388691;
        u0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.e0
    public void v(int i11) {
        z(i11 != 0 ? j.a.b(getContext(), i11) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void w(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f2635a.setMenuCallbacks(aVar, aVar2);
    }

    public void y(int i11) {
        if (i11 == this.f2650p) {
            return;
        }
        this.f2650p = i11;
        if (TextUtils.isEmpty(this.f2635a.getNavigationContentDescription())) {
            A(this.f2650p);
        }
    }

    public void z(Drawable drawable) {
        this.f2640f = drawable;
        G();
    }

    public c1(Toolbar toolbar, boolean z11, int i11, int i12) {
        Drawable drawable;
        this.f2649o = 0;
        this.f2650p = 0;
        this.f2635a = toolbar;
        this.f2643i = toolbar.getTitle();
        this.f2644j = toolbar.getSubtitle();
        this.f2642h = this.f2643i != null;
        this.f2641g = toolbar.getNavigationIcon();
        b1 b1VarV = b1.v(toolbar.getContext(), null, i.j.f73865a, i.a.f73726c, 0);
        this.f2651q = b1VarV.g(i.j.f73925l);
        if (z11) {
            CharSequence charSequenceP = b1VarV.p(i.j.f73955r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = b1VarV.p(i.j.f73945p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                C(charSequenceP2);
            }
            Drawable drawableG = b1VarV.g(i.j.f73935n);
            if (drawableG != null) {
                z(drawableG);
            }
            Drawable drawableG2 = b1VarV.g(i.j.f73930m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f2641g == null && (drawable = this.f2651q) != null) {
                p(drawable);
            }
            h(b1VarV.k(i.j.f73905h, 0));
            int iN = b1VarV.n(i.j.f73900g, 0);
            if (iN != 0) {
                n(LayoutInflater.from(this.f2635a.getContext()).inflate(iN, (ViewGroup) this.f2635a, false));
                h(this.f2636b | 16);
            }
            int iM = b1VarV.m(i.j.f73915j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2635a.getLayoutParams();
                layoutParams.height = iM;
                this.f2635a.setLayoutParams(layoutParams);
            }
            int iE = b1VarV.e(i.j.f73895f, -1);
            int iE2 = b1VarV.e(i.j.f73889e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f2635a.setContentInsetsRelative(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = b1VarV.n(i.j.f73960s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f2635a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iN2);
            }
            int iN3 = b1VarV.n(i.j.f73950q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f2635a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iN3);
            }
            int iN4 = b1VarV.n(i.j.f73940o, 0);
            if (iN4 != 0) {
                this.f2635a.setPopupTheme(iN4);
            }
        } else {
            this.f2636b = x();
        }
        b1VarV.w();
        y(i11);
        this.f2645k = this.f2635a.getNavigationContentDescription();
        this.f2635a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(Drawable drawable) {
        this.f2639e = drawable;
        G();
    }
}
