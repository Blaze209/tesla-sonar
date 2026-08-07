package com.stripe.android.view;

import android.view.View;
import androidx.p003lifecycle.C2797h1;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelStore;
import androidx.savedstate.SavedStateRegistry;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/stripe/android/view/r1;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/f1;", "Lxa/d;", "<init>", "()V", "Landroid/view/View;", "owner", "Ljn0/h0;", "a", "(Landroid/view/View;)V", "c", "b", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "lifecycleRegistry", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/lifecycle/ViewModelStore;", PlaceTypes.STORE, "Lxa/c;", "Lxa/c;", "savedStateRegistryController", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r1 implements LifecycleOwner, androidx.p003lifecycle.f1, xa.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.p003lifecycle.y lifecycleRegistry = new androidx.p003lifecycle.y(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ViewModelStore store = new ViewModelStore();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xa.c savedStateRegistryController = xa.c.INSTANCE.a(this);

    private final void a(View owner) {
        androidx.p003lifecycle.View.b(owner, this);
        C2797h1.b(owner, this);
        xa.e.b(owner, this);
    }

    public final void b(View owner) {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        if (androidx.p003lifecycle.View.a(owner) == null) {
            this.lifecycleRegistry.j(Lifecycle.a.ON_PAUSE);
            this.lifecycleRegistry.j(Lifecycle.a.ON_DESTROY);
            this.store.a();
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    public final void c(View owner) {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        if (androidx.p003lifecycle.View.a(owner) == null) {
            this.savedStateRegistryController.d(null);
            this.lifecycleRegistry.j(Lifecycle.a.ON_CREATE);
            androidx.p003lifecycle.v0.c(this);
            a(owner);
            this.lifecycleRegistry.j(Lifecycle.a.ON_RESUME);
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // xa.d
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.p003lifecycle.f1
    /* JADX INFO: renamed from: getViewModelStore, reason: from getter */
    public ViewModelStore getStore() {
        return this.store;
    }
}
