package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class i implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeAliasConstructorDescriptorImpl f86982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassConstructorDescriptor f86983b;

    public i(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        this.f86982a = typeAliasConstructorDescriptorImpl;
        this.f86983b = classConstructorDescriptor;
    }

    @Override // wn0.a
    public Object invoke() {
        return TypeAliasConstructorDescriptorImpl.k(this.f86982a, this.f86983b);
    }
}
