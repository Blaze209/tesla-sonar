package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public interface ValueParameterDescriptor extends ParameterDescriptor, VariableDescriptor {

    public static final class DefaultImpls {
        public static boolean isLateInit(ValueParameterDescriptor valueParameterDescriptor) {
            return false;
        }
    }

    ValueParameterDescriptor copy(CallableDescriptor callableDescriptor, Name name, int i11);

    boolean declaresDefaultValue();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableDescriptor getContainingDeclaration();

    int getIndex();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ValueParameterDescriptor getOriginal();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection<ValueParameterDescriptor> getOverriddenDescriptors();

    KotlinType getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
