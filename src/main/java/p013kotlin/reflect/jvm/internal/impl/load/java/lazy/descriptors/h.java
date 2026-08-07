package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f87359a;

    public h(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f87359a = lazyJavaClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassDescriptor.e(this.f87359a);
    }
}
