package androidx.p003lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/o;", "", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "", Action.KEY_ATTRIBUTE, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/u0;", "b", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/u0;", "Landroidx/lifecycle/c1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/c1;Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "c", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f8846a = new o();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/o$a;", "Landroidx/savedstate/SavedStateRegistry$a;", "<init>", "()V", "Lxa/d;", "owner", "Ljn0/h0;", "a", "(Lxa/d;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements SavedStateRegistry.a {
        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(d owner) {
            s.k(owner, "owner");
            if (!(owner instanceof f1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore = ((f1) owner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                c1 c1VarB = viewModelStore.b(it.next());
                s.h(c1VarB);
                o.a(c1VarB, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/o$b", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Lifecycle f8847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SavedStateRegistry f8848b;

        b(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
            this.f8847a = lifecycle;
            this.f8848b = savedStateRegistry;
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            s.k(source, "source");
            s.k(event, "event");
            if (event == Lifecycle.a.ON_START) {
                this.f8847a.d(this);
                this.f8848b.i(a.class);
            }
        }
    }

    private o() {
    }

    public static final void a(c1 viewModel, SavedStateRegistry registry, Lifecycle lifecycle) {
        s.k(viewModel, "viewModel");
        s.k(registry, "registry");
        s.k(lifecycle, "lifecycle");
        u0 u0Var = (u0) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (u0Var == null || u0Var.getIsAttached()) {
            return;
        }
        u0Var.c(registry, lifecycle);
        f8846a.c(registry, lifecycle);
    }

    public static final u0 b(SavedStateRegistry registry, Lifecycle lifecycle, String key, Bundle defaultArgs) {
        s.k(registry, "registry");
        s.k(lifecycle, "lifecycle");
        s.h(key);
        u0 u0Var = new u0(key, s0.INSTANCE.a(registry.b(key), defaultArgs));
        u0Var.c(registry, lifecycle);
        f8846a.c(registry, lifecycle);
        return u0Var;
    }

    private final void c(SavedStateRegistry registry, Lifecycle lifecycle) {
        Lifecycle.State state = lifecycle.getState();
        if (state == Lifecycle.State.INITIALIZED || state.isAtLeast(Lifecycle.State.STARTED)) {
            registry.i(a.class);
        } else {
            lifecycle.a(new b(lifecycle, registry));
        }
    }
}
