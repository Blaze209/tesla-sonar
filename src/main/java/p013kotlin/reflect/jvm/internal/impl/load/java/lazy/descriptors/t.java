package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class t implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragment f87383a;

    public t(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f87383a = lazyJavaPackageFragment;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaPackageFragment.e(this.f87383a);
    }
}
