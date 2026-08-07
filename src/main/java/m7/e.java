package m7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lco0/d;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "a", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lco0/d;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final <VM extends c1> VM a(ViewModelProvider.Factory factory, co0.d<VM> modelClass, CreationExtras extras) {
        s.k(factory, "factory");
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(vn0.a.b(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(vn0.a.b(modelClass), extras);
        }
    }
}
