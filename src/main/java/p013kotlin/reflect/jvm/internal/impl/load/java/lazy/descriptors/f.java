package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f87355a;

    public f(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f87355a = lazyJavaClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassDescriptor.g(this.f87355a);
    }
}
