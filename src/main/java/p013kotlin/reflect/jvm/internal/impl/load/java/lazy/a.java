package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassOrPackageFragmentDescriptor f87247b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.f87246a = lazyJavaResolverContext;
        this.f87247b = classOrPackageFragmentDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return ContextKt.d(this.f87246a, this.f87247b);
    }
}
