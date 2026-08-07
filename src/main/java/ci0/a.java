package ci0;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import xa.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lci0/a;", "Landroidx/lifecycle/c1;", "T", "Landroidx/lifecycle/a;", "Lxa/d;", "savedStateRegistryOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/s0;", "create", "<init>", "(Lxa/d;Lwn0/l;)V", "", Action.KEY_ATTRIBUTE, "Ljava/lang/Class;", "modelClass", "handle", "c", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/s0;)Landroidx/lifecycle/c1;", "e", "Lwn0/l;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a<T extends c1> extends androidx.p003lifecycle.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<s0, T> create;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(d savedStateRegistryOwner, l<? super s0, ? extends T> create) {
        super(savedStateRegistryOwner, null);
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(create, "create");
        this.create = create;
    }

    @Override // androidx.p003lifecycle.a
    protected <T extends c1> T c(String key, Class<T> modelClass, s0 handle) {
        s.k(key, "key");
        s.k(modelClass, "modelClass");
        s.k(handle, "handle");
        T tInvoke = this.create.invoke(handle);
        s.i(tInvoke, "null cannot be cast to non-null type T of com.withpersona.sdk2.inquiry.shared.di.Factory.create");
        return tInvoke;
    }
}
