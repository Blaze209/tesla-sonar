package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class m0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Name f87372a;

    public m0(Name name) {
        this.f87372a = name;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaStaticClassScope.d0(this.f87372a, (MemberScope) obj);
    }
}
