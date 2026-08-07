package androidx.p003lifecycle;

import android.os.Bundle;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxa/d;", "Landroidx/lifecycle/f1;", "T", "Ljn0/h0;", "c", "(Lxa/d;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", Action.KEY_ATTRIBUTE, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/s0;", "b", "(Lxa/d;Landroidx/lifecycle/f1;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/s0;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/s0;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/x0;", "e", "(Landroidx/lifecycle/f1;)Landroidx/lifecycle/x0;", "savedStateHandlesVM", "Landroidx/lifecycle/w0;", DateTokenConverter.CONVERTER_KEY, "(Lxa/d;)Landroidx/lifecycle/w0;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CreationExtras.b<xa.d> f8920a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CreationExtras.b<f1> f8921b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CreationExtras.b<Bundle> f8922c = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/v0$a", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements CreationExtras.b<Bundle> {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/v0$b", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Lxa/d;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements CreationExtras.b<xa.d> {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/v0$c", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroidx/lifecycle/f1;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements CreationExtras.b<f1> {
        c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/lifecycle/v0$d", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements ViewModelProvider.Factory {
        d() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            return new x0();
        }
    }

    public static final s0 a(CreationExtras creationExtras) {
        s.k(creationExtras, "<this>");
        xa.d dVar = (xa.d) creationExtras.a(f8920a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        f1 f1Var = (f1) creationExtras.a(f8921b);
        if (f1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(f8922c);
        String str = (String) creationExtras.a(ViewModelProvider.c.f8739d);
        if (str != null) {
            return b(dVar, f1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final s0 b(xa.d dVar, f1 f1Var, String str, Bundle bundle) {
        w0 w0VarD = d(dVar);
        x0 x0VarE = e(f1Var);
        s0 s0Var = x0VarE.f().get(str);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0VarA = s0.INSTANCE.a(w0VarD.b(str), bundle);
        x0VarE.f().put(str, s0VarA);
        return s0VarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends xa.d & f1> void c(T t11) {
        s.k(t11, "<this>");
        Lifecycle.State state = t11.getLifecycle().getState();
        if (state != Lifecycle.State.INITIALIZED && state != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t11.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            w0 w0Var = new w0(t11.getSavedStateRegistry(), t11);
            t11.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", w0Var);
            t11.getLifecycle().a(new t0(w0Var));
        }
    }

    public static final w0 d(xa.d dVar) {
        s.k(dVar, "<this>");
        SavedStateRegistry.c cVarC = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        w0 w0Var = cVarC instanceof w0 ? (w0) cVarC : null;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final x0 e(f1 f1Var) {
        s.k(f1Var, "<this>");
        return (x0) new ViewModelProvider(f1Var, new d()).d("androidx.lifecycle.internal.SavedStateHandlesVM", x0.class);
    }
}
