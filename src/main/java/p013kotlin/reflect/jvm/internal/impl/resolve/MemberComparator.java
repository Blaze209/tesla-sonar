package p013kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import jn0.h0;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final MemberComparator INSTANCE = new MemberComparator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DescriptorRenderer f88416a = DescriptorRenderer.Companion.withOptions(new a());

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Integer b(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int iC = c(declarationDescriptor2) - c(declarationDescriptor);
            if (iC != 0) {
                return Integer.valueOf(iC);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return 0;
            }
            int iCompareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        private static int c(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer numB = b(declarationDescriptor, declarationDescriptor2);
            if (numB != null) {
                return numB.intValue();
            }
            return 0;
        }
    }

    static class a implements l<DescriptorRendererOptions, h0> {
        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return h0.f84049a;
        }
    }

    private MemberComparator() {
    }

    @Override // java.util.Comparator
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer numB = NameAndTypeMemberComparator.b(declarationDescriptor, declarationDescriptor2);
        if (numB != null) {
            return numB.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = f88416a;
            int iCompareTo = descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                DescriptorRenderer descriptorRenderer2 = f88416a;
                int iCompareTo2 = descriptorRenderer2.renderType(extensionReceiverParameter.getType()).compareTo(descriptorRenderer2.renderType(extensionReceiverParameter2.getType()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            List<ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
            List<ValueParameterDescriptor> valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i11 = 0; i11 < Math.min(valueParameters.size(), valueParameters2.size()); i11++) {
                DescriptorRenderer descriptorRenderer3 = f88416a;
                int iCompareTo3 = descriptorRenderer3.renderType(valueParameters.get(i11).getType()).compareTo(descriptorRenderer3.renderType(valueParameters2.get(i11).getType()));
                if (iCompareTo3 != 0) {
                    return iCompareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i12 = 0; i12 < Math.min(typeParameters.size(), typeParameters2.size()); i12++) {
                List<KotlinType> upperBounds = typeParameters.get(i12).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i12).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i13 = 0; i13 < upperBounds.size(); i13++) {
                    DescriptorRenderer descriptorRenderer4 = f88416a;
                    int iCompareTo4 = descriptorRenderer4.renderType(upperBounds.get(i13)).compareTo(descriptorRenderer4.renderType(upperBounds2.get(i13)));
                    if (iCompareTo4 != 0) {
                        return iCompareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                int iOrdinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal();
                if (iOrdinal != 0) {
                    return iOrdinal;
                }
            }
        } else {
            if (!(declarationDescriptor instanceof ClassDescriptor) || !(declarationDescriptor2 instanceof ClassDescriptor)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                return classDescriptor.isCompanionObject() ? 1 : -1;
            }
        }
        DescriptorRenderer descriptorRenderer5 = f88416a;
        int iCompareTo5 = descriptorRenderer5.render(declarationDescriptor).compareTo(descriptorRenderer5.render(declarationDescriptor2));
        return iCompareTo5 != 0 ? iCompareTo5 : DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
