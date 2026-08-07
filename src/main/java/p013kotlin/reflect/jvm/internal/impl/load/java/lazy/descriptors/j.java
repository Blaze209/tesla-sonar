package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f87364b;

    public j(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f87363a = lazyJavaClassMemberScope;
        this.f87364b = lazyJavaResolverContext;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassMemberScope.r0(this.f87363a, this.f87364b);
    }
}
