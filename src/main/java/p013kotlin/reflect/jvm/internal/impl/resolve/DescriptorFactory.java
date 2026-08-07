package p013kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.name.NameUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public class DescriptorFactory {

    private static class a extends ClassConstructorDescriptorImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClassDescriptor classDescriptor, SourceElement sourceElement, boolean z11) {
            super(classDescriptor, null, Annotations.Companion.getEMPTY(), true, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
            if (classDescriptor == null) {
                a(0);
            }
            if (sourceElement == null) {
                a(1);
            }
            initialize(Collections.EMPTY_LIST, DescriptorUtils.getDefaultConstructorVisibility(classDescriptor, z11));
        }

        private static /* synthetic */ void a(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 12 || i11 == 23 || i11 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 12 || i11 == 23 || i11 == 25) ? 2 : 3];
        switch (i11) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i11 == 12) {
            objArr[1] = "createSetter";
        } else if (i11 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i11 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i11) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 12 && i11 != 23 && i11 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private static boolean b(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(29);
        }
        return functionDescriptor.getKind() == CallableMemberDescriptor.Kind.SYNTHESIZED && DescriptorUtils.isEnumClass(functionDescriptor.getContainingDeclaration());
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i11) {
        if (callableDescriptor == null) {
            a(32);
        }
        if (annotations == null) {
            a(33);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ContextReceiver(callableDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i11));
    }

    public static ReceiverParameterDescriptor createContextReceiverParameterForClass(ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, Annotations annotations, int i11) {
        if (classDescriptor == null) {
            a(34);
        }
        if (annotations == null) {
            a(35);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(classDescriptor, new ContextClassReceiver(classDescriptor, kotlinType, name, null), annotations, NameUtils.contextReceiverName(i11));
    }

    public static PropertyGetterDescriptorImpl createDefaultGetter(PropertyDescriptor propertyDescriptor, Annotations annotations) {
        if (propertyDescriptor == null) {
            a(13);
        }
        if (annotations == null) {
            a(14);
        }
        return createGetter(propertyDescriptor, annotations, true, false, false);
    }

    public static PropertySetterDescriptorImpl createDefaultSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2) {
        if (propertyDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (annotations2 == null) {
            a(2);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, true, false, false, propertyDescriptor.getSource());
    }

    public static PropertyDescriptor createEnumEntriesProperty(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(26);
        }
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(classDescriptor);
        ClassDescriptor classDescriptorFindEnumEntriesClass = StdlibClassFinderKt.getStdlibClassFinder(containingModule).findEnumEntriesClass(containingModule);
        if (classDescriptorFindEnumEntriesClass == null) {
            return null;
        }
        Annotations.Companion companion = Annotations.Companion;
        Annotations empty = companion.getEMPTY();
        Modality modality = Modality.FINAL;
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        Name name = StandardNames.ENUM_ENTRIES;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        PropertyDescriptorImpl propertyDescriptorImplCreate = PropertyDescriptorImpl.create(classDescriptor, empty, modality, descriptorVisibility, false, name, kind, classDescriptor.getSource(), false, false, false, false, false, false);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(propertyDescriptorImplCreate, companion.getEMPTY(), modality, descriptorVisibility, false, false, false, kind, null, classDescriptor.getSource());
        propertyDescriptorImplCreate.initialize(propertyGetterDescriptorImpl, null);
        SimpleType simpleType = KotlinTypeFactory.simpleType(TypeAttributes.Companion.getEmpty(), classDescriptorFindEnumEntriesClass.getTypeConstructor(), Collections.singletonList(new TypeProjectionImpl(classDescriptor.getDefaultType())), false);
        List<? extends TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        propertyDescriptorImplCreate.setType(simpleType, list, null, null, list);
        propertyGetterDescriptorImpl.initialize(propertyDescriptorImplCreate.getReturnType());
        return propertyDescriptorImplCreate;
    }

    public static SimpleFunctionDescriptor createEnumValueOfMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(24);
        }
        Annotations.Companion companion = Annotations.Companion;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(classDescriptor, companion.getEMPTY(), StandardNames.ENUM_VALUE_OF, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(simpleFunctionDescriptorImplCreate, null, 0, companion.getEMPTY(), Name.identifier("value"), DescriptorUtilsKt.getBuiltIns(classDescriptor).getStringType(), false, false, false, null, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, list, (List<? extends TypeParameterDescriptor>) list, Collections.singletonList(valueParameterDescriptorImpl), (KotlinType) classDescriptor.getDefaultType(), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize == null) {
            a(25);
        }
        return simpleFunctionDescriptorImplInitialize;
    }

    public static SimpleFunctionDescriptor createEnumValuesMethod(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(22);
        }
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplCreate = SimpleFunctionDescriptorImpl.create(classDescriptor, Annotations.Companion.getEMPTY(), StandardNames.ENUM_VALUES, CallableMemberDescriptor.Kind.SYNTHESIZED, classDescriptor.getSource());
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImplInitialize = simpleFunctionDescriptorImplCreate.initialize((ReceiverParameterDescriptor) null, (ReceiverParameterDescriptor) null, list, (List<? extends TypeParameterDescriptor>) list, (List<ValueParameterDescriptor>) list, (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getArrayType(Variance.INVARIANT, classDescriptor.getDefaultType()), Modality.FINAL, DescriptorVisibilities.PUBLIC);
        if (simpleFunctionDescriptorImplInitialize == null) {
            a(23);
        }
        return simpleFunctionDescriptorImplInitialize;
    }

    public static ReceiverParameterDescriptor createExtensionReceiverParameterForCallable(CallableDescriptor callableDescriptor, KotlinType kotlinType, Annotations annotations) {
        if (callableDescriptor == null) {
            a(30);
        }
        if (annotations == null) {
            a(31);
        }
        if (kotlinType == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(callableDescriptor, new ExtensionReceiver(callableDescriptor, kotlinType, null), annotations);
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z11, boolean z12, boolean z13) {
        if (propertyDescriptor == null) {
            a(15);
        }
        if (annotations == null) {
            a(16);
        }
        return createGetter(propertyDescriptor, annotations, z11, z12, z13, propertyDescriptor.getSource());
    }

    public static ClassConstructorDescriptorImpl createPrimaryConstructorForObject(ClassDescriptor classDescriptor, SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(20);
        }
        if (sourceElement == null) {
            a(21);
        }
        return new a(classDescriptor, sourceElement, false);
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z11, boolean z12, boolean z13, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(3);
        }
        if (annotations == null) {
            a(4);
        }
        if (annotations2 == null) {
            a(5);
        }
        if (sourceElement == null) {
            a(6);
        }
        return createSetter(propertyDescriptor, annotations, annotations2, z11, z12, z13, propertyDescriptor.getVisibility(), sourceElement);
    }

    public static boolean isEnumValueOfMethod(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(28);
        }
        return functionDescriptor.getName().equals(StandardNames.ENUM_VALUE_OF) && b(functionDescriptor);
    }

    public static boolean isEnumValuesMethod(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor == null) {
            a(27);
        }
        return functionDescriptor.getName().equals(StandardNames.ENUM_VALUES) && b(functionDescriptor);
    }

    public static PropertyGetterDescriptorImpl createGetter(PropertyDescriptor propertyDescriptor, Annotations annotations, boolean z11, boolean z12, boolean z13, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(17);
        }
        if (annotations == null) {
            a(18);
        }
        if (sourceElement == null) {
            a(19);
        }
        return new PropertyGetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), propertyDescriptor.getVisibility(), z11, z12, z13, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
    }

    public static PropertySetterDescriptorImpl createSetter(PropertyDescriptor propertyDescriptor, Annotations annotations, Annotations annotations2, boolean z11, boolean z12, boolean z13, DescriptorVisibility descriptorVisibility, SourceElement sourceElement) {
        if (propertyDescriptor == null) {
            a(7);
        }
        if (annotations == null) {
            a(8);
        }
        if (annotations2 == null) {
            a(9);
        }
        if (descriptorVisibility == null) {
            a(10);
        }
        if (sourceElement == null) {
            a(11);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(propertyDescriptor, annotations, propertyDescriptor.getModality(), descriptorVisibility, z11, z12, z13, CallableMemberDescriptor.Kind.DECLARATION, null, sourceElement);
        propertySetterDescriptorImpl.initialize(PropertySetterDescriptorImpl.createSetterParameter(propertySetterDescriptorImpl, propertyDescriptor.getType(), annotations2));
        return propertySetterDescriptorImpl;
    }
}
