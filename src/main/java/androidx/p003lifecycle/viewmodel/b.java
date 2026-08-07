package androidx.p003lifecycle.viewmodel;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.c1;
import ch.qos.logback.core.joran.action.Action;
import co0.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import m7.e;
import o7.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/viewmodel/b;", "", "Landroidx/lifecycle/ViewModelStore;", PlaceTypes.STORE, "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/c1;", "T", "Lco0/d;", "modelClass", "", Action.KEY_ATTRIBUTE, "a", "(Lco0/d;Ljava/lang/String;)Landroidx/lifecycle/c1;", "Landroidx/lifecycle/ViewModelStore;", "b", "Landroidx/lifecycle/ViewModelProvider$Factory;", "c", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewModelStore store;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ViewModelProvider.Factory factory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CreationExtras extras;

    public b(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras extras) {
        s.k(store, "store");
        s.k(factory, "factory");
        s.k(extras, "extras");
        this.store = store;
        this.factory = factory;
        this.extras = extras;
    }

    public static /* synthetic */ c1 b(b bVar, d dVar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = g.f96790a.e(dVar);
        }
        return bVar.a(dVar, str);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <T extends c1> T a(d<T> modelClass, String key) {
        s.k(modelClass, "modelClass");
        s.k(key, "key");
        T t11 = (T) this.store.b(key);
        if (!modelClass.j(t11)) {
            a aVar = new a(this.extras);
            aVar.c(g.a.f96791a, key);
            T t12 = (T) e.a(this.factory, modelClass, aVar);
            this.store.d(key, t12);
            return t12;
        }
        Object obj = this.factory;
        if (obj instanceof ViewModelProvider.d) {
            s.h(t11);
            ((ViewModelProvider.d) obj).a(t11);
        }
        s.i(t11, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t11;
    }
}
