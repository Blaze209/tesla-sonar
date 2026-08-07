package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f7775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0158b f7776c;

    public interface a {
    }

    /* JADX INFO: renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0158b {
        void onActionProviderVisibilityChanged(boolean z11);
    }

    public b(Context context) {
        this.f7774a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f7776c = null;
        this.f7775b = null;
    }

    public void i(a aVar) {
        this.f7775b = aVar;
    }

    public void j(InterfaceC0158b interfaceC0158b) {
        if (this.f7776c != null && interfaceC0158b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f7776c = interfaceC0158b;
    }
}
