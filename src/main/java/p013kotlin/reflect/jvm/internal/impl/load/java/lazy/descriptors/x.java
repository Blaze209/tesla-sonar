package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class x implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageScope f87388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f87389b;

    public x(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f87388a = lazyJavaPackageScope;
        this.f87389b = lazyJavaResolverContext;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaPackageScope.Y(this.f87388a, this.f87389b, (LazyJavaPackageScope.a) obj);
    }
}
