package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f86979a;

    public f(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f86979a = lazyPackageViewDescriptorImpl;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyPackageViewDescriptorImpl.h(this.f86979a);
    }
}
