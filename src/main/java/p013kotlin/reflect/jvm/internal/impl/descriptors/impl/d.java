package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f86977a;

    public d(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f86977a = lazyPackageViewDescriptorImpl;
    }

    @Override // wn0.a
    public Object invoke() {
        return LazyPackageViewDescriptorImpl.f(this.f86977a);
    }
}
