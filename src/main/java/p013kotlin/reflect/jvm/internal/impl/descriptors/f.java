package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f86756a;

    public f(FqName fqName) {
        this.f86756a = fqName;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(PackageFragmentProviderImpl.d(this.f86756a, (FqName) obj));
    }
}
