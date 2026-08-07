package go0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import fo0.i3;
import fo0.x2;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0019\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u0004\u0018\u00010.*\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u00100\"\u001a\u00103\u001a\u0004\u0018\u00010\u001b*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "u", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "n", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Ljava/util/List;", "Lgo0/h;", "", "expectedArgsSize", "", "isDefault", "Ljn0/h0;", "g", "(Lgo0/h;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Ljava/lang/reflect/Member;Lwn0/l;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", Gender.MALE, IntegerTokenConverter.CONVERTER_KEY, "(Lgo0/h;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lgo0/h;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "k", "t", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "s", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {
    private static final boolean a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !vn0.a.e(declaringClass).isValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h<?> hVar, int i11, CallableMemberDescriptor callableMemberDescriptor, boolean z11) {
        if (j.a(hVar) == i11) {
            return;
        }
        throw new x2("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i11 + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + hVar.a() + ")\nDefault: " + z11);
    }

    public static final Object h(Object obj, CallableMemberDescriptor descriptor) {
        KotlinType kotlinTypeL;
        Class<?> clsT;
        Method methodM;
        s.k(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) descriptor)) || (kotlinTypeL = l(descriptor)) == null || (clsT = t(kotlinTypeL)) == null || (methodM = m(clsT, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x0066->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends Member> h<M> i(h<? extends M> hVar, CallableMemberDescriptor descriptor, boolean z11) {
        List<ValueParameterDescriptor> list;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        s.k(hVar, "<this>");
        s.k(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            s.j(contextReceiverParameters, "getContextReceiverParameters(...)");
            List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                s.j(valueParameters, "getValueParameters(...)");
                list = valueParameters;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        s.j(type, "getType(...)");
                        if (InlineClassesUtilsKt.isValueClassType(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((ValueParameterDescriptor) it.next()).getType();
                    s.j(type, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                KotlinType type2 = ((ReceiverParameterDescriptor) it2.next()).getType();
                s.j(type2, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type2)) {
                }
            }
            List<ValueParameterDescriptor> valueParameters2 = descriptor.getValueParameters();
            s.j(valueParameters2, "getValueParameters(...)");
            list = valueParameters2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? hVar : hVar;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                s.j(type, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && !q(descriptor)) {
            }
        }
        return new n(descriptor, hVar, z11);
    }

    public static /* synthetic */ h j(h hVar, CallableMemberDescriptor callableMemberDescriptor, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return i(hVar, callableMemberDescriptor, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, callableMemberDescriptor).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new x2("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private static final KotlinType l(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return dispatchReceiverParameter.getType();
        }
        DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            return classDescriptor.getDefaultType();
        }
        return null;
    }

    public static final Method m(Class<?> cls, CallableMemberDescriptor descriptor) {
        s.k(cls, "<this>");
        s.k(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new x2("No unbox method found in inline class: " + cls + " (calling " + descriptor + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final List<Method> n(SimpleType type) {
        s.k(type, "type");
        List<String> listO = o(TypeSubstitutionKt.asSimpleType(type));
        if (listO == null) {
            return null;
        }
        List<String> list = listO;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = type.getConstructor().mo500getDeclarationDescriptor();
        s.i(classifierDescriptorMo500getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsQ = i3.q((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor);
        s.h(clsQ);
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List<String> o(SimpleType simpleType) {
        Collection collectionE;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = simpleType.getConstructor().mo500getDeclarationDescriptor();
        s.i(classifierDescriptorMo500getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor);
        s.h(multiFieldValueClassRepresentation);
        Iterable<Pair> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : underlyingPropertyNamesToTypes) {
            Name name = (Name) pair.a();
            List<String> listO = o((SimpleType) pair.b());
            if (listO != null) {
                List<String> list = listO;
                collectionE = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    collectionE.add(name.getIdentifier() + CoreConstants.DASH_CHAR + ((String) it.next()));
                }
            } else {
                collectionE = v.e(name.getIdentifier());
            }
            v.E(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> p(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method methodM;
        List<Method> listN = n(simpleType);
        if (listN != null) {
            return listN;
        }
        Class<?> clsT = t(simpleType);
        if (clsT == null || (methodM = m(clsT, callableMemberDescriptor)) == null) {
            return null;
        }
        return v.e(methodM);
    }

    private static final boolean q(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeL = l(callableMemberDescriptor);
        return kotlinTypeL != null && InlineClassesUtilsKt.isValueClassType(kotlinTypeL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KotlinType> r(CallableMemberDescriptor callableMemberDescriptor, Member member, wn0.l<? super ClassDescriptor, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            s.j(constructedClass, "getConstructedClass(...)");
            if (constructedClass.isInner()) {
                DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            s.j(containingDeclaration2, "getContainingDeclaration(...)");
            if ((containingDeclaration2 instanceof ClassDescriptor) && lVar.invoke(containingDeclaration2).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
                } else {
                    SimpleType defaultType = ((ClassDescriptor) containingDeclaration2).getDefaultType();
                    s.j(defaultType, "getDefaultType(...)");
                    arrayList.add(TypeUtilsKt.makeNullable(defaultType));
                }
            }
        }
        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class<?> s(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> clsQ = i3.q(classDescriptor);
        if (clsQ != null) {
            return clsQ;
        }
        throw new x2("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> t(KotlinType kotlinType) {
        KotlinType kotlinTypeUnsubstitutedUnderlyingType;
        Class<?> clsS = s(kotlinType.getConstructor().mo500getDeclarationDescriptor());
        if (clsS == null) {
            return null;
        }
        if (TypeUtils.isNullableType(kotlinType) && ((kotlinTypeUnsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType)) == null || TypeUtils.isNullableType(kotlinTypeUnsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(kotlinTypeUnsubstitutedUnderlyingType))) {
            return null;
        }
        return clsS;
    }

    public static final String u(ClassifierDescriptor classifierDescriptor) {
        s.k(classifierDescriptor, "<this>");
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptor);
        s.h(classId);
        return ClassMapperLite.mapClass(classId.asString());
    }
}
