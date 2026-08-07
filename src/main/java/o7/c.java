package o7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo7/c;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/lifecycle/c1;", "T", "Lco0/d;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Lco0/d;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f96784a = new c();

    private c() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends c1> T create(co0.d<T> modelClass, CreationExtras extras) {
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        return (T) d.f96785a.a(vn0.a.b(modelClass));
    }
}
