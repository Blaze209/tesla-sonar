package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptorImpl f86980a;

    public g(ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f86980a = moduleDescriptorImpl;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return ModuleDescriptorImpl.g(this.f86980a, (FqName) obj);
    }
}
