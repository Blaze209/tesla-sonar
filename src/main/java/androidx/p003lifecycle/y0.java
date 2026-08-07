package androidx.p003lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import java.lang.reflect.Constructor;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xa.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000bJ/\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/lifecycle/y0;", "Landroidx/lifecycle/ViewModelProvider$d;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Lxa/d;", "owner", "Landroid/os/Bundle;", "defaultArgs", "(Landroid/app/Application;Lxa/d;Landroid/os/Bundle;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "", Action.KEY_ATTRIBUTE, "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c1;", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "viewModel", "Ljn0/h0;", "a", "(Landroidx/lifecycle/c1;)V", "Landroid/app/Application;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "e", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/savedstate/SavedStateRegistry;", "f", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y0 extends ViewModelProvider.d implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ViewModelProvider.Factory factory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArgs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Lifecycle lifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private SavedStateRegistry savedStateRegistry;

    public y0() {
        this.factory = new ViewModelProvider.a();
    }

    @Override // androidx.lifecycle.ViewModelProvider.d
    public void a(c1 viewModel) {
        s.k(viewModel, "viewModel");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            s.h(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            s.h(lifecycle);
            o.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public final <T extends c1> T b(String key, Class<T> modelClass) {
        T t11;
        Application application;
        s.k(key, "key");
        s.k(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.application == null) ? z0.c(modelClass, z0.f8952b) : z0.c(modelClass, z0.f8951a);
        if (constructorC == null) {
            return this.application != null ? (T) this.factory.create(modelClass) : (T) ViewModelProvider.c.INSTANCE.a().create(modelClass);
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        s.h(savedStateRegistry);
        u0 u0VarB = o.b(savedStateRegistry, lifecycle, key, this.defaultArgs);
        if (!zIsAssignableFrom || (application = this.application) == null) {
            t11 = (T) z0.d(modelClass, constructorC, u0VarB.getHandle());
        } else {
            s.h(application);
            t11 = (T) z0.d(modelClass, constructorC, application, u0VarB.getHandle());
        }
        t11.addCloseable("androidx.lifecycle.savedstate.vm.tag", u0VarB);
        return t11;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        String str = (String) extras.a(ViewModelProvider.c.f8739d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(v0.f8920a) == null || extras.a(v0.f8921b) == null) {
            if (this.lifecycle != null) {
                return (T) b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(ViewModelProvider.a.f8735h);
        boolean zIsAssignableFrom = b.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? z0.c(modelClass, z0.f8952b) : z0.c(modelClass, z0.f8951a);
        if (constructorC == null) {
            return (T) this.factory.create(modelClass, extras);
        }
        return (!zIsAssignableFrom || application == null) ? (T) z0.d(modelClass, constructorC, v0.a(extras)) : (T) z0.d(modelClass, constructorC, application, v0.a(extras));
    }

    @SuppressLint({"LambdaLast"})
    public y0(Application application, d owner, Bundle bundle) {
        ViewModelProvider.a aVar;
        s.k(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            aVar = ViewModelProvider.a.INSTANCE.a(application);
        } else {
            aVar = new ViewModelProvider.a();
        }
        this.factory = aVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(Class<T> modelClass) {
        s.k(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
