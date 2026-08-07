package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z<?> f8699a;

    private x(z<?> zVar) {
        this.f8699a = zVar;
    }

    @NonNull
    public static x b(@NonNull z<?> zVar) {
        return new x((z) u5.h.h(zVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentManager fragmentManager = this.f8699a.getFragmentManager();
        z<?> zVar = this.f8699a;
        fragmentManager.p(zVar, zVar, fragment);
    }

    public void c() {
        this.f8699a.getFragmentManager().C();
    }

    public boolean d(@NonNull MenuItem menuItem) {
        return this.f8699a.getFragmentManager().F(menuItem);
    }

    public void e() {
        this.f8699a.getFragmentManager().G();
    }

    public void f() {
        this.f8699a.getFragmentManager().I();
    }

    public void g() {
        this.f8699a.getFragmentManager().R();
    }

    public void h() {
        this.f8699a.getFragmentManager().V();
    }

    public void i() {
        this.f8699a.getFragmentManager().W();
    }

    public void j() {
        this.f8699a.getFragmentManager().Y();
    }

    public boolean k() {
        return this.f8699a.getFragmentManager().f0(true);
    }

    @NonNull
    public FragmentManager l() {
        return this.f8699a.getFragmentManager();
    }

    public void m() {
        this.f8699a.getFragmentManager().a1();
    }

    public View n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f8699a.getFragmentManager().C0().onCreateView(view, str, context, attributeSet);
    }
}
