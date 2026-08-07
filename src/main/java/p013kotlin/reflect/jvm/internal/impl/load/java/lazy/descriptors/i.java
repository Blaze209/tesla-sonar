package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f87361a;

    public i(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f87361a = lazyJavaClassDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaClassDescriptor.a.E(this.f87361a);
    }
}
