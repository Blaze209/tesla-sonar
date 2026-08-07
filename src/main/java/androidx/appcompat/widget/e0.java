package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {
    boolean a();

    void b(Drawable drawable);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h(int i11);

    int i();

    void j();

    void k(boolean z11);

    void l();

    int m();

    void n(View view);

    void o();

    void p(Drawable drawable);

    Menu q();

    ViewPropertyAnimatorCompat r(int i11, long j11);

    ViewGroup s();

    void setIcon(int i11);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    void setMenuPrepared();

    void setTitle(CharSequence charSequence);

    void setVisibility(int i11);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z11);

    void u(u0 u0Var);

    void v(int i11);

    void w(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2);
}
