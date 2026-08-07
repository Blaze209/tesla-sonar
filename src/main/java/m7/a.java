package m7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import java.util.Arrays;
import o7.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lm7/a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Lm7/d;", "initializers", "<init>", "([Lm7/d;)V", "Landroidx/lifecycle/c1;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "[Lm7/d;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<?>[] initializers;

    public a(d<?>... initializers) {
        s.k(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <VM extends c1> VM create(Class<VM> modelClass, CreationExtras extras) {
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        g gVar = g.f96790a;
        co0.d<VM> dVarE = vn0.a.e(modelClass);
        d<?>[] dVarArr = this.initializers;
        return (VM) gVar.b(dVarE, extras, (d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }
}
