package p013kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class InlineClassManglingRulesKt {
    private static final boolean a(ClassDescriptor classDescriptor) {
        return s.f(DescriptorUtilsKt.getFqNameSafe(classDescriptor), StandardNames.RESULT_FQ_NAME);
    }

    private static final boolean b(KotlinType kotlinType, boolean z11) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        return (z11 || !InlineClassesUtilsKt.isMultiFieldValueClass(typeParameterDescriptor)) && c(TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor));
    }

    private static final boolean c(KotlinType kotlinType) {
        return isValueClassThatRequiresMangling(kotlinType) || b(kotlinType, true);
    }

    public static final boolean isValueClassThatRequiresMangling(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        return InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !a((ClassDescriptor) declarationDescriptor);
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(CallableMemberDescriptor descriptor) {
        s.k(descriptor, "descriptor");
        ClassConstructorDescriptor classConstructorDescriptor = descriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) descriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        s.j(constructedClass, "getConstructedClass(...)");
        if (InlineClassesUtilsKt.isValueClass(constructedClass) || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            s.j(type, "getType(...)");
            if (c(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        return classifierDescriptorMo500getDeclarationDescriptor != null && ((InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo500getDeclarationDescriptor) && isValueClassThatRequiresMangling(classifierDescriptorMo500getDeclarationDescriptor)) || InlineClassesUtilsKt.needsMfvcFlattening(kotlinType));
    }
}
