package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class w implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageScope f87387b;

    public w(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        this.f87386a = lazyJavaResolverContext;
        this.f87387b = lazyJavaPackageScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaPackageScope.c0(this.f87386a, this.f87387b);
    }
}
