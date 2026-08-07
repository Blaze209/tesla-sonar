package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;

/* JADX INFO: loaded from: classes9.dex */
public interface ClassDescriptor extends ClassOrPackageFragmentDescriptor, ClassifierDescriptorWithTypeParameters {
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    ClassDescriptor mo494getCompanionObjectDescriptor();

    Collection<ClassConstructorDescriptor> getConstructors();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor getContainingDeclaration();

    List<ReceiverParameterDescriptor> getContextReceivers();

    List<TypeParameterDescriptor> getDeclaredTypeParameters();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    SimpleType getDefaultType();

    ClassKind getKind();

    MemberScope getMemberScope(TypeSubstitution typeSubstitution);

    Modality getModality();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassDescriptor getOriginal();

    Collection<ClassDescriptor> getSealedSubclasses();

    MemberScope getStaticScope();

    ReceiverParameterDescriptor getThisAsReceiverParameter();

    MemberScope getUnsubstitutedInnerClassesScope();

    MemberScope getUnsubstitutedMemberScope();

    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor();

    ValueClassRepresentation<SimpleType> getValueClassRepresentation();

    DescriptorVisibility getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
