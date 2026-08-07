package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f87353a;

    public e(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f87353a = lazyJavaAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.d(this.f87353a);
    }
}
