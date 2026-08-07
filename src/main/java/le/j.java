package le;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a6\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u0000*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/c1;", "ViewModelT", "Lxa/d;", "owner", "Landroid/os/Bundle;", "defaultArgs", "Lkotlin/Function1;", "Landroidx/lifecycle/s0;", "factoryProducer", "Landroidx/lifecycle/a;", "b", "(Lxa/d;Landroid/os/Bundle;Lwn0/l;)Landroidx/lifecycle/a;", "T", "Landroidx/lifecycle/ViewModelProvider;", "", Action.KEY_ATTRIBUTE, "Ljava/lang/Class;", "modelClass", "a", "(Landroidx/lifecycle/ViewModelProvider;Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/c1;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"le/j$a", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/c1;", "T", "", Action.KEY_ATTRIBUTE, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/s0;", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/s0;)Landroidx/lifecycle/c1;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends androidx.p003lifecycle.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<s0, ViewModelT> f89959e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(xa.d dVar, Bundle bundle, l<? super s0, ? extends ViewModelT> lVar) {
            super(dVar, bundle);
            this.f89959e = lVar;
        }

        @Override // androidx.p003lifecycle.a
        protected <T extends c1> T c(String key, Class<T> modelClass, s0 handle) {
            s.k(key, "key");
            s.k(modelClass, "modelClass");
            s.k(handle, "handle");
            Object objInvoke = this.f89959e.invoke(handle);
            s.i(objInvoke, "null cannot be cast to non-null type T of com.adyen.checkout.components.core.internal.util.ViewModelExtKt.viewModelFactory.<no name provided>.create");
            return (T) objInvoke;
        }
    }

    public static final <T extends c1> T a(ViewModelProvider viewModelProvider, String str, Class<T> modelClass) {
        s.k(viewModelProvider, "<this>");
        s.k(modelClass, "modelClass");
        return str == null ? (T) viewModelProvider.b(modelClass) : (T) viewModelProvider.d(str, modelClass);
    }

    public static final <ViewModelT extends c1> androidx.p003lifecycle.a b(xa.d owner, Bundle bundle, l<? super s0, ? extends ViewModelT> factoryProducer) {
        s.k(owner, "owner");
        s.k(factoryProducer, "factoryProducer");
        return new a(owner, bundle, factoryProducer);
    }
}
