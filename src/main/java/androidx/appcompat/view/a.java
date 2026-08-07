package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.d;

/* JADX INFO: loaded from: classes.dex */
public class a extends ActionMode implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f2193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ActionMode.Callback f2194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f2195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f2198i;

    public a(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z11) {
        this.f2192c = context;
        this.f2193d = actionBarContextView;
        this.f2194e = callback;
        e eVarW = new e(actionBarContextView.getContext()).W(1);
        this.f2198i = eVarW;
        eVarW.V(this);
        this.f2197h = z11;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(@NonNull e eVar, @NonNull MenuItem menuItem) {
        return this.f2194e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(@NonNull e eVar) {
        k();
        this.f2193d.l();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void c() {
        if (this.f2196g) {
            return;
        }
        this.f2196g = true;
        this.f2193d.sendAccessibilityEvent(32);
        this.f2194e.d(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public View d() {
        WeakReference<View> weakReference = this.f2195f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public Menu e() {
        return this.f2198i;
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater f() {
        return new d(this.f2193d.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence g() {
        return this.f2193d.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence i() {
        return this.f2193d.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void k() {
        this.f2194e.c(this, this.f2198i);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean l() {
        return this.f2193d.j();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void m(View view) {
        this.f2193d.setCustomView(view);
        this.f2195f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void n(int i11) {
        o(this.f2192c.getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void o(CharSequence charSequence) {
        this.f2193d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void q(int i11) {
        r(this.f2192c.getString(i11));
    }

    @Override // androidx.appcompat.view.ActionMode
    public void r(CharSequence charSequence) {
        this.f2193d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void s(boolean z11) {
        super.s(z11);
        this.f2193d.setTitleOptional(z11);
    }
}
