package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* JADX INFO: loaded from: classes9.dex */
class a implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaAnnotationDescriptor f87192b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        this.f87191a = lazyJavaResolverContext;
        this.f87192b = javaAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return JavaAnnotationDescriptor.c(this.f87191a, this.f87192b);
    }
}
