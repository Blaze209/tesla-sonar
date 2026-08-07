package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f86675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f86676b;

    public d(ModuleDescriptor moduleDescriptor, boolean z11) {
        this.f86675a = moduleDescriptor;
        this.f86676b = z11;
    }

    @Override // wn0.a
    public Object invoke() {
        return JvmBuiltIns.w(this.f86675a, this.f86676b);
    }
}
