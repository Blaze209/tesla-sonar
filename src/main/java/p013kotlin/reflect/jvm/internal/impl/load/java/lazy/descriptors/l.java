package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87369b;

    public l(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f87368a = lazyJavaResolverContext;
        this.f87369b = lazyJavaClassMemberScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassMemberScope.M0(this.f87368a, this.f87369b);
    }
}
