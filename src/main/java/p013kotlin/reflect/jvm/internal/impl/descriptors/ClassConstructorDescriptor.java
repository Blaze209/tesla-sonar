package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes9.dex */
public interface ClassConstructorDescriptor extends ConstructorDescriptor {
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassConstructorDescriptor getOriginal();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ClassConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
