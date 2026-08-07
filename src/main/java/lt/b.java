package lt;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f90737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f90738b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f90739c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f90737a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f90737a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f90737a);
        }
    }

    public int b() {
        return this.f90739c;
    }

    public boolean c() {
        return this.f90738b;
    }

    public void d(@NonNull Bundle bundle) {
        this.f90738b = bundle.getBoolean("expanded", false);
        this.f90739c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f90738b) {
            a();
        }
    }

    @NonNull
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f90738b);
        bundle.putInt("expandedComponentIdHint", this.f90739c);
        return bundle;
    }

    public void f(int i11) {
        this.f90739c = i11;
    }
}
