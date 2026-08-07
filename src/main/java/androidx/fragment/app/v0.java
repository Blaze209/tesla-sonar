package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
class v0 implements androidx.p003lifecycle.n, xa.d, f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fragment f8692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewModelStore f8693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f8694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewModelProvider.Factory f8695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.p003lifecycle.y f8696e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private xa.c f8697f = null;

    v0(@NonNull Fragment fragment, @NonNull ViewModelStore viewModelStore, @NonNull Runnable runnable) {
        this.f8692a = fragment;
        this.f8693b = viewModelStore;
        this.f8694c = runnable;
    }

    void a(@NonNull Lifecycle.a aVar) {
        this.f8696e.j(aVar);
    }

    void b() {
        if (this.f8696e == null) {
            this.f8696e = new androidx.p003lifecycle.y(this);
            xa.c cVarA = xa.c.a(this);
            this.f8697f = cVarA;
            cVarA.c();
            this.f8694c.run();
        }
    }

    boolean c() {
        return this.f8696e != null;
    }

    void d(Bundle bundle) {
        this.f8697f.d(bundle);
    }

    void e(@NonNull Bundle bundle) {
        this.f8697f.e(bundle);
    }

    void f(@NonNull Lifecycle.State state) {
        this.f8696e.o(state);
    }

    @Override // androidx.p003lifecycle.n
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f8692a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        androidx.p003lifecycle.viewmodel.a aVar = new androidx.p003lifecycle.viewmodel.a();
        if (application != null) {
            aVar.c(ViewModelProvider.a.f8735h, application);
        }
        aVar.c(androidx.p003lifecycle.v0.f8920a, this.f8692a);
        aVar.c(androidx.p003lifecycle.v0.f8921b, this);
        if (this.f8692a.getArguments() != null) {
            aVar.c(androidx.p003lifecycle.v0.f8922c, this.f8692a.getArguments());
        }
        return aVar;
    }

    @Override // androidx.p003lifecycle.n
    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f8692a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f8692a.mDefaultFactory)) {
            this.f8695d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f8695d == null) {
            Context applicationContext = this.f8692a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f8692a;
            this.f8695d = new androidx.p003lifecycle.y0(application, fragment, fragment.getArguments());
        }
        return this.f8695d;
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        b();
        return this.f8696e;
    }

    @Override // xa.d
    @NonNull
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f8697f.getSavedStateRegistry();
    }

    @Override // androidx.p003lifecycle.f1
    @NonNull
    /* JADX INFO: renamed from: getViewModelStore */
    public ViewModelStore getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
        b();
        return this.f8693b;
    }
}
