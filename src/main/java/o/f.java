package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f extends d implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m5.c f95556e;

    f(Context context, m5.c cVar) {
        super(context, cVar);
        this.f95556e = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f95556e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return c(this.f95556e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i11) {
        this.f95556e.setHeaderIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i11) {
        this.f95556e.setHeaderTitle(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f95556e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i11) {
        this.f95556e.setIcon(i11);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f95556e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f95556e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f95556e.setIcon(drawable);
        return this;
    }
}
