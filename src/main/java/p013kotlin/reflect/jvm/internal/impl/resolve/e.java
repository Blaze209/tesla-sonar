package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CallableDescriptor f88486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CallableDescriptor f88487b;

    public e(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f88486a = callableDescriptor;
        this.f88487b = callableDescriptor2;
    }

    @Override // wn0.p
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(DescriptorEquivalenceForOverrides.g(this.f88486a, this.f88487b, (DeclarationDescriptor) obj, (DeclarationDescriptor) obj2));
    }
}
