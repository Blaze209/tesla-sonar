package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.u0;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.w0;
import androidx.core.view.x0;
import androidx.core.view.y0;
import com.adyen.checkout.components.core.Address;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p extends ActionBar implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f2156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f2158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f2159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f2160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    e0 f2161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f2162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f2163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    u0 f2164i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f2167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f2168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ActionMode f2169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ActionMode.Callback f2170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2171p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2173r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f2176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f2177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f2178w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    n.e f2180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2181z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f2165j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2166k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<ActionBar.b> f2172q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2174s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f2175t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2179x = true;
    final w0 B = new a();
    final w0 C = new b();
    final y0 D = new c();

    class a extends x0 {
        a() {
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            View view2;
            p pVar = p.this;
            if (pVar.f2175t && (view2 = pVar.f2163h) != null) {
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                p.this.f2160e.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            p.this.f2160e.setVisibility(8);
            p.this.f2160e.setTransitioning(false);
            p pVar2 = p.this;
            pVar2.f2180y = null;
            pVar2.G();
            ActionBarOverlayLayout actionBarOverlayLayout = p.this.f2159d;
            if (actionBarOverlayLayout != null) {
                ViewCompat.m0(actionBarOverlayLayout);
            }
        }
    }

    class b extends x0 {
        b() {
        }

        @Override // androidx.core.view.w0
        public void b(View view) {
            p pVar = p.this;
            pVar.f2180y = null;
            pVar.f2160e.requestLayout();
        }
    }

    class c implements y0 {
        c() {
        }

        @Override // androidx.core.view.y0
        public void a(View view) {
            ((View) p.this.f2160e.getParent()).invalidate();
        }
    }

    public class d extends ActionMode implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f2185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f2186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ActionMode.Callback f2187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f2188f;

        public d(Context context, ActionMode.Callback callback) {
            this.f2185c = context;
            this.f2187e = callback;
            androidx.appcompat.view.menu.e eVarW = new androidx.appcompat.view.menu.e(context).W(1);
            this.f2186d = eVarW;
            eVarW.V(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            ActionMode.Callback callback = this.f2187e;
            if (callback != null) {
                return callback.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            if (this.f2187e == null) {
                return;
            }
            k();
            p.this.f2162g.l();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void c() {
            p pVar = p.this;
            if (pVar.f2168m != this) {
                return;
            }
            if (p.F(pVar.f2176u, pVar.f2177v, false)) {
                this.f2187e.d(this);
            } else {
                p pVar2 = p.this;
                pVar2.f2169n = this;
                pVar2.f2170o = this.f2187e;
            }
            this.f2187e = null;
            p.this.E(false);
            p.this.f2162g.g();
            p.this.f2161f.s().sendAccessibilityEvent(32);
            p pVar3 = p.this;
            pVar3.f2159d.setHideOnContentScrollEnabled(pVar3.A);
            p.this.f2168m = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public View d() {
            WeakReference<View> weakReference = this.f2188f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        public Menu e() {
            return this.f2186d;
        }

        @Override // androidx.appcompat.view.ActionMode
        public MenuInflater f() {
            return new n.d(this.f2185c);
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence g() {
            return p.this.f2162g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public CharSequence i() {
            return p.this.f2162g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void k() {
            if (p.this.f2168m != this) {
                return;
            }
            this.f2186d.h0();
            try {
                this.f2187e.c(this, this.f2186d);
            } finally {
                this.f2186d.g0();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean l() {
            return p.this.f2162g.j();
        }

        @Override // androidx.appcompat.view.ActionMode
        public void m(View view) {
            p.this.f2162g.setCustomView(view);
            this.f2188f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void n(int i11) {
            o(p.this.f2156a.getResources().getString(i11));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void o(CharSequence charSequence) {
            p.this.f2162g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void q(int i11) {
            r(p.this.f2156a.getResources().getString(i11));
        }

        @Override // androidx.appcompat.view.ActionMode
        public void r(CharSequence charSequence) {
            p.this.f2162g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        public void s(boolean z11) {
            super.s(z11);
            p.this.f2162g.setTitleOptional(z11);
        }

        public boolean t() {
            this.f2186d.h0();
            try {
                return this.f2187e.a(this, this.f2186d);
            } finally {
                this.f2186d.g0();
            }
        }
    }

    public p(Activity activity, boolean z11) {
        this.f2158c = activity;
        View decorView = activity.getWindow().getDecorView();
        M(decorView);
        if (z11) {
            return;
        }
        this.f2163h = decorView.findViewById(R.id.content);
    }

    static boolean F(boolean z11, boolean z12, boolean z13) {
        if (z13) {
            return true;
        }
        return (z11 || z12) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e0 J(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : Address.ADDRESS_NULL_PLACEHOLDER);
        throw new IllegalStateException(sb2.toString());
    }

    private void L() {
        if (this.f2178w) {
            this.f2178w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f2159d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void M(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.f.f73816q);
        this.f2159d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f2161f = J(view.findViewById(i.f.f73800a));
        this.f2162g = (ActionBarContextView) view.findViewById(i.f.f73806g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.f.f73802c);
        this.f2160e = actionBarContainer;
        e0 e0Var = this.f2161f;
        if (e0Var == null || this.f2162g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2156a = e0Var.getContext();
        boolean z11 = (this.f2161f.m() & 4) != 0;
        if (z11) {
            this.f2167l = true;
        }
        n.a aVarB = n.a.b(this.f2156a);
        Q(aVarB.a() || z11);
        O(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f2156a.obtainStyledAttributes(null, i.j.f73865a, i.a.f73726c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f73920k, false)) {
            P(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f73910i, 0);
        if (dimensionPixelSize != 0) {
            x(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void O(boolean z11) {
        this.f2173r = z11;
        if (z11) {
            this.f2160e.setTabContainer(null);
            this.f2161f.u(this.f2164i);
        } else {
            this.f2161f.u(null);
            this.f2160e.setTabContainer(this.f2164i);
        }
        boolean z12 = K() == 2;
        u0 u0Var = this.f2164i;
        if (u0Var != null) {
            if (z12) {
                u0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2159d;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m0(actionBarOverlayLayout);
                }
            } else {
                u0Var.setVisibility(8);
            }
        }
        this.f2161f.k(!this.f2173r && z12);
        this.f2159d.setHasNonEmbeddedTabs(!this.f2173r && z12);
    }

    private boolean R() {
        return ViewCompat.U(this.f2160e);
    }

    private void S() {
        if (this.f2178w) {
            return;
        }
        this.f2178w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2159d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T(false);
    }

    private void T(boolean z11) {
        if (F(this.f2176u, this.f2177v, this.f2178w)) {
            if (this.f2179x) {
                return;
            }
            this.f2179x = true;
            I(z11);
            return;
        }
        if (this.f2179x) {
            this.f2179x = false;
            H(z11);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A(int i11) {
        B(this.f2156a.getString(i11));
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B(CharSequence charSequence) {
        this.f2161f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C(CharSequence charSequence) {
        this.f2161f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public ActionMode D(ActionMode.Callback callback) {
        d dVar = this.f2168m;
        if (dVar != null) {
            dVar.c();
        }
        this.f2159d.setHideOnContentScrollEnabled(false);
        this.f2162g.k();
        d dVar2 = new d(this.f2162g.getContext(), callback);
        if (!dVar2.t()) {
            return null;
        }
        this.f2168m = dVar2;
        dVar2.k();
        this.f2162g.h(dVar2);
        E(true);
        this.f2162g.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void E(boolean z11) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatR;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatF;
        if (z11) {
            S();
        } else {
            L();
        }
        if (!R()) {
            if (z11) {
                this.f2161f.setVisibility(4);
                this.f2162g.setVisibility(0);
                return;
            } else {
                this.f2161f.setVisibility(0);
                this.f2162g.setVisibility(8);
                return;
            }
        }
        if (z11) {
            viewPropertyAnimatorCompatF = this.f2161f.r(4, 100L);
            viewPropertyAnimatorCompatR = this.f2162g.f(0, 200L);
        } else {
            viewPropertyAnimatorCompatR = this.f2161f.r(0, 200L);
            viewPropertyAnimatorCompatF = this.f2162g.f(8, 100L);
        }
        n.e eVar = new n.e();
        eVar.d(viewPropertyAnimatorCompatF, viewPropertyAnimatorCompatR);
        eVar.h();
    }

    void G() {
        ActionMode.Callback callback = this.f2170o;
        if (callback != null) {
            callback.d(this.f2169n);
            this.f2169n = null;
            this.f2170o = null;
        }
    }

    public void H(boolean z11) {
        View view;
        n.e eVar = this.f2180y;
        if (eVar != null) {
            eVar.a();
        }
        if (this.f2174s != 0 || (!this.f2181z && !z11)) {
            this.B.b(null);
            return;
        }
        this.f2160e.setAlpha(1.0f);
        this.f2160e.setTransitioning(true);
        n.e eVar2 = new n.e();
        float f11 = -this.f2160e.getHeight();
        if (z11) {
            int[] iArr = {0, 0};
            this.f2160e.getLocationInWindow(iArr);
            f11 -= iArr[1];
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatL = ViewCompat.e(this.f2160e).l(f11);
        viewPropertyAnimatorCompatL.j(this.D);
        eVar2.c(viewPropertyAnimatorCompatL);
        if (this.f2175t && (view = this.f2163h) != null) {
            eVar2.c(ViewCompat.e(view).l(f11));
        }
        eVar2.f(E);
        eVar2.e(250L);
        eVar2.g(this.B);
        this.f2180y = eVar2;
        eVar2.h();
    }

    public void I(boolean z11) {
        View view;
        View view2;
        n.e eVar = this.f2180y;
        if (eVar != null) {
            eVar.a();
        }
        this.f2160e.setVisibility(0);
        if (this.f2174s == 0 && (this.f2181z || z11)) {
            this.f2160e.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            float f11 = -this.f2160e.getHeight();
            if (z11) {
                int[] iArr = {0, 0};
                this.f2160e.getLocationInWindow(iArr);
                f11 -= iArr[1];
            }
            this.f2160e.setTranslationY(f11);
            n.e eVar2 = new n.e();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatL = ViewCompat.e(this.f2160e).l(BitmapDescriptorFactory.HUE_RED);
            viewPropertyAnimatorCompatL.j(this.D);
            eVar2.c(viewPropertyAnimatorCompatL);
            if (this.f2175t && (view2 = this.f2163h) != null) {
                view2.setTranslationY(f11);
                eVar2.c(ViewCompat.e(this.f2163h).l(BitmapDescriptorFactory.HUE_RED));
            }
            eVar2.f(F);
            eVar2.e(250L);
            eVar2.g(this.C);
            this.f2180y = eVar2;
            eVar2.h();
        } else {
            this.f2160e.setAlpha(1.0f);
            this.f2160e.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            if (this.f2175t && (view = this.f2163h) != null) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2159d;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m0(actionBarOverlayLayout);
        }
    }

    public int K() {
        return this.f2161f.i();
    }

    public void N(int i11, int i12) {
        int iM = this.f2161f.m();
        if ((i12 & 4) != 0) {
            this.f2167l = true;
        }
        this.f2161f.h((i11 & i12) | ((~i12) & iM));
    }

    public void P(boolean z11) {
        if (z11 && !this.f2159d.o()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z11;
        this.f2159d.setHideOnContentScrollEnabled(z11);
    }

    public void Q(boolean z11) {
        this.f2161f.t(z11);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f2177v) {
            this.f2177v = false;
            T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.f2177v) {
            return;
        }
        this.f2177v = true;
        T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        n.e eVar = this.f2180y;
        if (eVar != null) {
            eVar.a();
            this.f2180y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z11) {
        this.f2175t = z11;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean g() {
        e0 e0Var = this.f2161f;
        if (e0Var == null || !e0Var.g()) {
            return false;
        }
        this.f2161f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(boolean z11) {
        if (z11 == this.f2171p) {
            return;
        }
        this.f2171p = z11;
        int size = this.f2172q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f2172q.get(i11).onMenuVisibilityChanged(z11);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int i() {
        return this.f2161f.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context j() {
        if (this.f2157b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2156a.getTheme().resolveAttribute(i.a.f73731h, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f2157b = new ContextThemeWrapper(this.f2156a, i11);
            } else {
                this.f2157b = this.f2156a;
            }
        }
        return this.f2157b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k() {
        if (this.f2176u) {
            return;
        }
        this.f2176u = true;
        T(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(Configuration configuration) {
        O(n.a.b(this.f2156a).g());
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean o(int i11, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f2168m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i11) {
        this.f2174s = i11;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(Drawable drawable) {
        this.f2160e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s(View view, ActionBar.a aVar) {
        view.setLayoutParams(aVar);
        this.f2161f.n(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t(boolean z11) {
        if (this.f2167l) {
            return;
        }
        u(z11);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u(boolean z11) {
        N(z11 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v(boolean z11) {
        N(z11 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w(boolean z11) {
        N(z11 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x(float f11) {
        ViewCompat.x0(this.f2160e, f11);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y(Drawable drawable) {
        this.f2161f.p(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z(boolean z11) {
        n.e eVar;
        this.f2181z = z11;
        if (z11 || (eVar = this.f2180y) == null) {
            return;
        }
        eVar.a();
    }

    public p(Dialog dialog) {
        M(dialog.getWindow().getDecorView());
    }
}
