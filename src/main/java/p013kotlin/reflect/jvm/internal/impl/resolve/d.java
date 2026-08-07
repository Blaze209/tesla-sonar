package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: loaded from: classes9.dex */
class d implements KotlinTypeChecker.TypeConstructorEquality {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CallableDescriptor f88475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CallableDescriptor f88476c;

    public d(boolean z11, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f88474a = z11;
        this.f88475b = callableDescriptor;
        this.f88476c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return DescriptorEquivalenceForOverrides.f(this.f88474a, this.f88475b, this.f88476c, typeConstructor, typeConstructor2);
    }
}
