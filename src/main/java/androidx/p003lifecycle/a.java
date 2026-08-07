package androidx.p003lifecycle;

import android.os.Bundle;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J7\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/lifecycle/a;", "Landroidx/lifecycle/ViewModelProvider$d;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lxa/d;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lxa/d;Landroid/os/Bundle;)V", "Landroidx/lifecycle/c1;", "T", "", Action.KEY_ATTRIBUTE, "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "Landroidx/lifecycle/s0;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/s0;)Landroidx/lifecycle/c1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/c1;)V", "Landroidx/savedstate/SavedStateRegistry;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a extends ViewModelProvider.d implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SavedStateRegistry savedStateRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Lifecycle lifecycle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    public a(d owner, Bundle bundle) {
        s.k(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
    }

    private final <T extends c1> T b(String key, Class<T> modelClass) {
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        s.h(savedStateRegistry);
        Lifecycle lifecycle = this.lifecycle;
        s.h(lifecycle);
        u0 u0VarB = o.b(savedStateRegistry, lifecycle, key, this.defaultArgs);
        T t11 = (T) c(key, modelClass, u0VarB.getHandle());
        t11.addCloseable("androidx.lifecycle.savedstate.vm.tag", u0VarB);
        return t11;
    }

    @Override // androidx.lifecycle.ViewModelProvider.d
    public void a(c1 viewModel) {
        s.k(viewModel, "viewModel");
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        if (savedStateRegistry != null) {
            s.h(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            s.h(lifecycle);
            o.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    protected abstract <T extends c1> T c(String key, Class<T> modelClass, s0 handle);

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        String str = (String) extras.a(ViewModelProvider.c.f8739d);
        if (str != null) {
            return this.savedStateRegistry != null ? (T) b(str, modelClass) : (T) c(str, modelClass, v0.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(Class<T> modelClass) {
        s.k(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) b(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
