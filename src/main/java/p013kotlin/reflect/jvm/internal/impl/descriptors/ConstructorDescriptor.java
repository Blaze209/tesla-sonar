package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes9.dex */
public interface ConstructorDescriptor extends FunctionDescriptor {
    ClassDescriptor getConstructedClass();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptorWithTypeParameters getContainingDeclaration();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    KotlinType getReturnType();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    List<TypeParameterDescriptor> getTypeParameters();

    boolean isPrimary();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    ConstructorDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
