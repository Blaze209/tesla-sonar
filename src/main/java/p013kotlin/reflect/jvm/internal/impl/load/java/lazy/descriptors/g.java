package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaClassDescriptor f87357a;

    public g(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        this.f87357a = lazyJavaClassDescriptor;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return LazyJavaClassDescriptor.h(this.f87357a, (KotlinTypeRefiner) obj);
    }
}
