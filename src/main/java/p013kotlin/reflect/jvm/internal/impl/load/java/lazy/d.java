package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragmentProvider f87251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaPackage f87252b;

    public d(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.f87251a = lazyJavaPackageFragmentProvider;
        this.f87252b = javaPackage;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyJavaPackageFragmentProvider.c(this.f87251a, this.f87252b);
    }
}
