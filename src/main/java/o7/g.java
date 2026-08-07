package o7;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import java.util.Collection;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001b\u001a\u00020\u00182\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001c\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lo7/g;", "", "<init>", "()V", "Landroidx/lifecycle/c1;", "T", "Lco0/d;", "modelClass", "", "e", "(Lco0/d;)Ljava/lang/String;", "VM", "f", "()Landroidx/lifecycle/c1;", "", "Lm7/d;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Ljava/util/Collection;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/f1;", "owner", DateTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/f1;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "c", "(Landroidx/lifecycle/f1;)Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "", "b", "(Lco0/d;Landroidx/lifecycle/viewmodel/CreationExtras;[Lm7/d;)Landroidx/lifecycle/c1;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f96790a = new g();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lo7/g$a;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements CreationExtras.b<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f96791a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final ViewModelProvider.Factory a(Collection<? extends m7.d<?>> initializers) {
        s.k(initializers, "initializers");
        m7.d[] dVarArr = (m7.d[]) initializers.toArray(new m7.d[0]);
        return new m7.a((m7.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    public final <VM extends c1> VM b(co0.d<VM> modelClass, CreationExtras extras, m7.d<?>... initializers) {
        VM vm2;
        m7.d<?> dVar;
        l<CreationExtras, T> lVarB;
        s.k(modelClass, "modelClass");
        s.k(extras, "extras");
        s.k(initializers, "initializers");
        int length = initializers.length;
        int i11 = 0;
        while (true) {
            vm2 = null;
            if (i11 >= length) {
                dVar = null;
                break;
            }
            dVar = initializers[i11];
            if (s.f(dVar.a(), modelClass)) {
                break;
            }
            i11++;
        }
        if (dVar != null && (lVarB = dVar.b()) != 0) {
            vm2 = (VM) lVarB.invoke(extras);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + h.a(modelClass)).toString());
    }

    public final CreationExtras c(f1 owner) {
        s.k(owner, "owner");
        return owner instanceof n ? ((n) owner).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b;
    }

    public final ViewModelProvider.Factory d(f1 owner) {
        s.k(owner, "owner");
        return owner instanceof n ? ((n) owner).getDefaultViewModelProviderFactory() : c.f96784a;
    }

    public final <T extends c1> String e(co0.d<T> modelClass) {
        s.k(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final <VM extends c1> VM f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
