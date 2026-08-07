package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.e0;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m extends ActionBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e0 f2128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f2129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Window.Callback f2130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<ActionBar.b> f2133f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f2134g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Toolbar.f f2135h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.G();
        }
    }

    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return m.this.f2130c.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2138a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar, boolean z11) {
            if (this.f2138a) {
                return;
            }
            this.f2138a = true;
            m.this.f2128a.l();
            Window.Callback callback = m.this.f2130c;
            if (callback != null) {
                callback.onPanelClosed(108, eVar);
            }
            this.f2138a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(@NonNull androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = m.this.f2130c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(@NonNull androidx.appcompat.view.menu.e eVar, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(@NonNull androidx.appcompat.view.menu.e eVar) {
            m mVar = m.this;
            if (mVar.f2130c != null) {
                if (mVar.f2128a.d()) {
                    m.this.f2130c.onPanelClosed(108, eVar);
                } else if (m.this.f2130c.onPreparePanel(0, null, eVar)) {
                    m.this.f2130c.onMenuOpened(108, eVar);
                }
            }
        }
    }

    private class e extends n.f {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // n.f, android.view.Window.Callback
        public View onCreatePanelView(int i11) {
            return i11 == 0 ? new View(m.this.f2128a.getContext()) : super.onCreatePanelView(i11);
        }

        @Override // n.f, android.view.Window.Callback
        public boolean onPreparePanel(int i11, View view, Menu menu) {
            boolean zOnPreparePanel = super.onPreparePanel(i11, view, menu);
            if (zOnPreparePanel) {
                m mVar = m.this;
                if (!mVar.f2129b) {
                    mVar.f2128a.setMenuPrepared();
                    m.this.f2129b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f2135h = bVar;
        this.f2128a = new c1(toolbar, false);
        e eVar = new e(callback);
        this.f2130c = eVar;
        this.f2128a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f2128a.setWindowTitle(charSequence);
    }

    private Menu E() {
        if (!this.f2131d) {
            this.f2128a.w(new c(), new d());
            this.f2131d = true;
        }
        return this.f2128a.q();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void A(int i11) {
        e0 e0Var = this.f2128a;
        e0Var.setTitle(i11 != 0 ? e0Var.getContext().getText(i11) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void B(CharSequence charSequence) {
        this.f2128a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void C(CharSequence charSequence) {
        this.f2128a.setWindowTitle(charSequence);
    }

    public Window.Callback F() {
        return this.f2130c;
    }

    void G() {
        Menu menuE = E();
        androidx.appcompat.view.menu.e eVar = menuE instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuE : null;
        if (eVar != null) {
            eVar.h0();
        }
        try {
            menuE.clear();
            if (!this.f2130c.onCreatePanelMenu(0, menuE) || !this.f2130c.onPreparePanel(0, null, menuE)) {
                menuE.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.g0();
            }
        }
    }

    public void H(int i11, int i12) {
        this.f2128a.h((i11 & i12) | ((~i12) & this.f2128a.m()));
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean f() {
        return this.f2128a.e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean g() {
        if (!this.f2128a.g()) {
            return false;
        }
        this.f2128a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void h(boolean z11) {
        if (z11 == this.f2132e) {
            return;
        }
        this.f2132e = z11;
        int size = this.f2133f.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f2133f.get(i11).onMenuVisibilityChanged(z11);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public int i() {
        return this.f2128a.m();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context j() {
        return this.f2128a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void k() {
        this.f2128a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean l() {
        this.f2128a.s().removeCallbacks(this.f2134g);
        ViewCompat.h0(this.f2128a.s(), this.f2134g);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    void n() {
        this.f2128a.s().removeCallbacks(this.f2134g);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean o(int i11, KeyEvent keyEvent) {
        Menu menuE = E();
        if (menuE == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean q() {
        return this.f2128a.c();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void r(Drawable drawable) {
        this.f2128a.b(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void s(View view, ActionBar.a aVar) {
        if (view != null) {
            view.setLayoutParams(aVar);
        }
        this.f2128a.n(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void t(boolean z11) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public void u(boolean z11) {
        H(z11 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void v(boolean z11) {
        H(z11 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void w(boolean z11) {
        H(z11 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void x(float f11) {
        ViewCompat.x0(this.f2128a.s(), f11);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void y(Drawable drawable) {
        this.f2128a.p(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void z(boolean z11) {
    }
}
