package n7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Lco0/d;", "modelClass", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "b", "(Lco0/d;Landroidx/lifecycle/f1;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Lr2/l;II)Landroidx/lifecycle/c1;", "a", "(Landroidx/lifecycle/f1;Lco0/d;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel-compose_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
final /* synthetic */ class d {
    public static final <VM extends c1> VM a(f1 f1Var, co0.d<VM> modelClass, String str, ViewModelProvider.Factory factory, CreationExtras extras) {
        ViewModelProvider viewModelProviderA;
        s.k(f1Var, "<this>");
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        if (factory != null) {
            viewModelProviderA = ViewModelProvider.INSTANCE.a(f1Var.getViewModelStore(), factory, extras);
        } else {
            viewModelProviderA = f1Var instanceof n ? ViewModelProvider.INSTANCE.a(f1Var.getViewModelStore(), ((n) f1Var).getDefaultViewModelProviderFactory(), extras) : ViewModelProvider.Companion.c(ViewModelProvider.INSTANCE, f1Var, null, null, 6, null);
        }
        return str != null ? (VM) viewModelProviderA.c(str, modelClass) : (VM) viewModelProviderA.a(modelClass);
    }

    public static final <VM extends c1> VM b(co0.d<VM> modelClass, f1 f1Var, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, l lVar, int i11, int i12) {
        s.k(modelClass, "modelClass");
        lVar.H(1673618944);
        if ((i12 & 2) != 0 && (f1Var = a.f93383a.a(lVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        if ((i12 & 8) != 0) {
            factory = null;
        }
        if ((i12 & 16) != 0) {
            creationExtras = f1Var instanceof n ? ((n) f1Var).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b;
        }
        if (o.J()) {
            o.S(1673618944, i11, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        VM vm2 = (VM) c.a(f1Var, modelClass, str, factory, creationExtras);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return vm2;
    }
}
