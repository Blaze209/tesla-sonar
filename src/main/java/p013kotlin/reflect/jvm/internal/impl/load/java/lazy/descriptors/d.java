package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaAnnotationDescriptor f87351a;

    public d(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        this.f87351a = lazyJavaAnnotationDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaAnnotationDescriptor.l(this.f87351a);
    }
}
