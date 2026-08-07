package p013kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import p013kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class FunctionTypesKt {
    private static final FunctionTypeKind a(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionTypeKindExtractor functionTypeKindExtractor = FunctionTypeKindExtractor.Companion.getDefault();
        FqName fqNameParent = fqNameUnsafe.toSafe().parent();
        s.j(fqNameParent, "parent(...)");
        String strAsString = fqNameUnsafe.shortName().asString();
        s.j(strAsString, "asString(...)");
        return functionTypeKindExtractor.getFunctionalClassKind(fqNameParent, strAsString);
    }

    private static final boolean b(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo496findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final int contextFunctionTypeParamsCount(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorMo496findAnnotation = kotlinType.getAnnotations().mo496findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (annotationDescriptorMo496findAnnotation == null) {
            return 0;
        }
        ConstantValue constantValue = (ConstantValue) v0.j(annotationDescriptorMo496findAnnotation.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        s.i(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((IntValue) constantValue).getValue().intValue();
    }

    public static final SimpleType createFunctionType(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z11) {
        s.k(builtIns, "builtIns");
        s.k(annotations, "annotations");
        s.k(contextReceiverTypes, "contextReceiverTypes");
        s.k(parameterTypes, "parameterTypes");
        s.k(returnType, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        ClassDescriptor functionDescriptor = getFunctionDescriptor(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (kotlinType == null ? 0 : 1), z11);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        String value;
        s.k(kotlinType, "<this>");
        AnnotationDescriptor annotationDescriptorMo496findAnnotation = kotlinType.getAnnotations().mo496findAnnotation(StandardNames.FqNames.parameterName);
        if (annotationDescriptorMo496findAnnotation == null) {
            return null;
        }
        Object objV0 = v.V0(annotationDescriptorMo496findAnnotation.getAllValueArguments().values());
        StringValue stringValue = objV0 instanceof StringValue ? (StringValue) objV0 : null;
        if (stringValue != null && (value = stringValue.getValue()) != null) {
            if (!Name.isValidIdentifier(value)) {
                value = null;
            }
            if (value != null) {
                return Name.identifier(value);
            }
        }
        return null;
    }

    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        int iContextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (iContextFunctionTypeParamsCount == 0) {
            return v.m();
        }
        List<TypeProjection> listSubList = kotlinType.getArguments().subList(0, iContextFunctionTypeParamsCount);
        ArrayList arrayList = new ArrayList(v.y(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeProjection) it.next()).getType());
        }
        return arrayList;
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns builtIns, int i11, boolean z11) {
        s.k(builtIns, "builtIns");
        ClassDescriptor suspendFunction = z11 ? builtIns.getSuspendFunction(i11) : builtIns.getFunction(i11);
        s.h(suspendFunction);
        return suspendFunction;
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, KotlinBuiltIns builtIns) {
        Name name;
        KotlinBuiltIns kotlinBuiltIns;
        s.k(contextReceiverTypes, "contextReceiverTypes");
        s.k(parameterTypes, "parameterTypes");
        s.k(returnType, "returnType");
        s.k(builtIns, "builtIns");
        int i11 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (kotlinType != null ? 1 : 0) + 1);
        List<? extends KotlinType> list2 = contextReceiverTypes;
        ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.asTypeProjection((KotlinType) it.next()));
        }
        arrayList.addAll(arrayList2);
        CollectionsKt.addIfNotNull(arrayList, kotlinType != null ? TypeUtilsKt.asTypeProjection(kotlinType) : null);
        for (Object obj : parameterTypes) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            KotlinType kotlinTypeReplaceAnnotations = (KotlinType) obj;
            if (list == null || (name = list.get(i11)) == null || name.isSpecial()) {
                name = null;
            }
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name name2 = StandardNames.NAME;
                String strAsString = name.asString();
                s.j(strAsString, "asString(...)");
                Map mapF = v0.f(x.a(name2, new StringValue(strAsString)));
                kotlinBuiltIns = builtIns;
                kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(kotlinTypeReplaceAnnotations, Annotations.Companion.create(v.O0(kotlinTypeReplaceAnnotations.getAnnotations(), new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, mapF, false, 8, null))));
            } else {
                kotlinBuiltIns = builtIns;
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinTypeReplaceAnnotations));
            i11 = i12;
            builtIns = kotlinBuiltIns;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(returnType));
        return arrayList;
    }

    public static final FunctionTypeKind getFunctionTypeKind(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor != null) {
            return getFunctionTypeKind(classifierDescriptorMo500getDeclarationDescriptor);
        }
        return null;
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        if (!b(kotlinType)) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) v.A0(kotlinType.getArguments())).getType();
        s.j(type, "getType(...)");
        return type;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        List<TypeProjection> arguments = kotlinType.getArguments();
        return arguments.subList(contextFunctionTypeParamsCount(kotlinType) + (isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0), arguments.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return isBuiltinFunctionalType(kotlinType) && b(kotlinType);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        FunctionTypeKind functionTypeKind = getFunctionTypeKind(declarationDescriptor);
        return s.f(functionTypeKind, FunctionTypeKind.Function.INSTANCE) || s.f(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        return classifierDescriptorMo500getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(classifierDescriptorMo500getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return s.f(getFunctionTypeKind(kotlinType), FunctionTypeKind.Function.INSTANCE);
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        return s.f(getFunctionTypeKind(kotlinType), FunctionTypeKind.SuspendFunction.INSTANCE);
    }

    public static final Annotations withContextReceiversFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns, int i11) {
        s.k(annotations, "<this>");
        s.k(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        return annotations.hasAnnotation(fqName) ? annotations : Annotations.Companion.create(v.O0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, v0.f(x.a(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i11))), false, 8, null)));
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns) {
        s.k(annotations, "<this>");
        s.k(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        return annotations.hasAnnotation(fqName) ? annotations : Annotations.Companion.create(v.O0(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, v0.i(), false, 8, null)));
    }

    public static final FunctionTypeKind getFunctionTypeKind(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return a(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }
}
