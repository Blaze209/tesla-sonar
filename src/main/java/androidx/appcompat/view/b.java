package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.x0;
import java.util.ArrayList;
import o.c;
import o.d;

/* JADX INFO: loaded from: classes.dex */
public class b extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f2199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ActionMode f2200b;

    public static class a implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final android.view.ActionMode.Callback f2201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f2202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<b> f2203c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final x0<Menu, Menu> f2204d = new x0<>();

        public a(Context context, android.view.ActionMode.Callback callback) {
            this.f2202b = context;
            this.f2201a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f2204d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            d dVar = new d(this.f2202b, (m5.a) menu);
            this.f2204d.put(menu, dVar);
            return dVar;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean a(ActionMode actionMode, Menu menu) {
            return this.f2201a.onCreateActionMode(e(actionMode), f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean b(ActionMode actionMode, MenuItem menuItem) {
            return this.f2201a.onActionItemClicked(e(actionMode), new c(this.f2202b, (m5.b) menuItem));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean c(ActionMode actionMode, Menu menu) {
            return this.f2201a.onPrepareActionMode(e(actionMode), f(menu));
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void d(ActionMode actionMode) {
            this.f2201a.onDestroyActionMode(e(actionMode));
        }

        public android.view.ActionMode e(ActionMode actionMode) {
            int size = this.f2203c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f2203c.get(i11);
                if (bVar != null && bVar.f2200b == actionMode) {
                    return bVar;
                }
            }
            b bVar2 = new b(this.f2202b, actionMode);
            this.f2203c.add(bVar2);
            return bVar2;
        }
    }

    public b(Context context, ActionMode actionMode) {
        this.f2199a = context;
        this.f2200b = actionMode;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f2200b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f2200b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new d(this.f2199a, (m5.a) this.f2200b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f2200b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f2200b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f2200b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f2200b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f2200b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f2200b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f2200b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f2200b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f2200b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f2200b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f2200b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z11) {
        this.f2200b.s(z11);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i11) {
        this.f2200b.n(i11);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i11) {
        this.f2200b.q(i11);
    }
}
