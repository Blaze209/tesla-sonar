package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f86684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassDescriptor f86685b;

    public k(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        this.f86684a = lazyJavaClassDescriptor;
        this.f86685b = classDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltInsCustomizer.p(this.f86684a, this.f86685b);
    }
}
