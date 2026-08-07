package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f87356a;

    public f0(LazyJavaScope lazyJavaScope) {
        this.f87356a = lazyJavaScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaScope.z(this.f87356a);
    }
}
