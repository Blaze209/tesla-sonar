package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f87374b;

    public n(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f87373a = lazyJavaClassMemberScope;
        this.f87374b = lazyJavaResolverContext;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.V0(this.f87373a, this.f87374b, (Name) obj);
    }
}
