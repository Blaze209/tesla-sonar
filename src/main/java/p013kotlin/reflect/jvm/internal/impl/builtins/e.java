package p013kotlin.reflect.jvm.internal.impl.builtins;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f86592a;

    public e(ModuleDescriptor moduleDescriptor) {
        this.f86592a = moduleDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return ReflectionTypes.d(this.f86592a);
    }
}
