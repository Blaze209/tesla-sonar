package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmPackageScope f87347a;

    public b(JvmPackageScope jvmPackageScope) {
        this.f87347a = jvmPackageScope;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmPackageScope.c(this.f87347a);
    }
}
