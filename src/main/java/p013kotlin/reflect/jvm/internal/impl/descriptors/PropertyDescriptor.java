package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes9.dex */
public interface PropertyDescriptor extends CallableMemberDescriptor, VariableDescriptorWithAccessors {
    List<PropertyAccessorDescriptor> getAccessors();

    FieldDescriptor getBackingField();

    FieldDescriptor getDelegateField();

    PropertyGetterDescriptor getGetter();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    PropertyDescriptor getOriginal();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<? extends PropertyDescriptor> getOverriddenDescriptors();

    PropertySetterDescriptor getSetter();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    PropertyDescriptor substitute(TypeSubstitutor typeSubstitutor);
}
