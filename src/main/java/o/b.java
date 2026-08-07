package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.x0;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f95541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0<m5.b, MenuItem> f95542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x0<m5.c, SubMenu> f95543c;

    b(Context context) {
        this.f95541a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof m5.b)) {
            return menuItem;
        }
        m5.b bVar = (m5.b) menuItem;
        if (this.f95542b == null) {
            this.f95542b = new x0<>();
        }
        MenuItem menuItem2 = this.f95542b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f95541a, bVar);
        this.f95542b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof m5.c)) {
            return subMenu;
        }
        m5.c cVar = (m5.c) subMenu;
        if (this.f95543c == null) {
            this.f95543c = new x0<>();
        }
        SubMenu subMenu2 = this.f95543c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f95541a, cVar);
        this.f95543c.put(cVar, fVar);
        return fVar;
    }

    final void e() {
        x0<m5.b, MenuItem> x0Var = this.f95542b;
        if (x0Var != null) {
            x0Var.clear();
        }
        x0<m5.c, SubMenu> x0Var2 = this.f95543c;
        if (x0Var2 != null) {
            x0Var2.clear();
        }
    }

    final void f(int i11) {
        if (this.f95542b == null) {
            return;
        }
        int i12 = 0;
        while (i12 < this.f95542b.getSize()) {
            if (this.f95542b.i(i12).getGroupId() == i11) {
                this.f95542b.k(i12);
                i12--;
            }
            i12++;
        }
    }

    final void g(int i11) {
        if (this.f95542b == null) {
            return;
        }
        for (int i12 = 0; i12 < this.f95542b.getSize(); i12++) {
            if (this.f95542b.i(i12).getItemId() == i11) {
                this.f95542b.k(i12);
                return;
            }
        }
    }
}
