package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotNullLazyValue<MemberScope> f88524a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(a<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        s.k(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope c(a aVar) {
        MemberScope memberScope = (MemberScope) aVar.invoke();
        return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected MemberScope a() {
        return (MemberScope) this.f88524a.invoke();
    }

    public /* synthetic */ LazyScopeAdapter(StorageManager storageManager, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? LockBasedStorageManager.NO_LOCKS : storageManager, aVar);
    }

    public LazyScopeAdapter(StorageManager storageManager, a<? extends MemberScope> getScope) {
        s.k(storageManager, "storageManager");
        s.k(getScope, "getScope");
        this.f88524a = storageManager.createLazyValue(new b(getScope));
    }
}
