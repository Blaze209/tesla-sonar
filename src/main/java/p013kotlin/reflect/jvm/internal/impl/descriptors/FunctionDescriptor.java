package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes9.dex */
public interface FunctionDescriptor extends CallableMemberDescriptor {

    public interface CopyBuilder<D extends FunctionDescriptor> {
        D build();

        <V> CopyBuilder<D> putUserData(CallableDescriptor.UserDataKey<V> userDataKey, V v11);

        CopyBuilder<D> setAdditionalAnnotations(Annotations annotations);

        CopyBuilder<D> setCopyOverrides(boolean z11);

        CopyBuilder<D> setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> setDropOriginalInContainingParts();

        CopyBuilder<D> setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor);

        CopyBuilder<D> setHiddenForResolutionEverywhereBesideSupercalls();

        CopyBuilder<D> setHiddenToOvercomeSignatureClash();

        CopyBuilder<D> setKind(CallableMemberDescriptor.Kind kind);

        CopyBuilder<D> setModality(Modality modality);

        CopyBuilder<D> setName(Name name);

        CopyBuilder<D> setOriginal(CallableMemberDescriptor callableMemberDescriptor);

        CopyBuilder<D> setOwner(DeclarationDescriptor declarationDescriptor);

        CopyBuilder<D> setPreserveSourceElement();

        CopyBuilder<D> setReturnType(KotlinType kotlinType);

        CopyBuilder<D> setSignatureChange();

        CopyBuilder<D> setSubstitution(TypeSubstitution typeSubstitution);

        CopyBuilder<D> setTypeParameters(List<TypeParameterDescriptor> list);

        CopyBuilder<D> setValueParameters(List<ValueParameterDescriptor> list);

        CopyBuilder<D> setVisibility(DescriptorVisibility descriptorVisibility);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor getContainingDeclaration();

    FunctionDescriptor getInitialSignatureDescriptor();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    FunctionDescriptor getOriginal();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<? extends FunctionDescriptor> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    CopyBuilder<? extends FunctionDescriptor> newCopyBuilder();

    FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
