package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyPackageViewDescriptorImpl f86978a;

    public e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        this.f86978a = lazyPackageViewDescriptorImpl;
    }

    @Override // wn0.a
    public Object invoke() {
        return Boolean.valueOf(LazyPackageViewDescriptorImpl.e(this.f86978a));
    }
}
