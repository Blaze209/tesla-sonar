package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class v implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f87385a;

    public v(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f87385a = lazyJavaPackageFragment;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaPackageFragment.f(this.f87385a);
    }
}
