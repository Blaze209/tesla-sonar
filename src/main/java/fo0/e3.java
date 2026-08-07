package fo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Method;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p013kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lfo0/e3;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Z", "Lfo0/n$e;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lfo0/n$e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/String;", "possiblySubstitutedFunction", "Lfo0/n;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lfo0/n;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "possiblyOverriddenProperty", "Lfo0/p;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Lfo0/p;", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "c", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f66120a = new e3();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ClassId JAVA_LANG_VOID = ClassId.Companion.topLevel(new FqName("java.lang.Void"));

    private e3() {
    }

    private final PrimitiveType a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(FunctionDescriptor descriptor) {
        if (DescriptorFactory.isEnumValueOfMethod(descriptor) || DescriptorFactory.isEnumValuesMethod(descriptor)) {
            return true;
        }
        return p013kotlin.jvm.internal.s.f(descriptor.getName(), CloneableClassScope.Companion.getCLONE_NAME()) && descriptor.getValueParameters().isEmpty();
    }

    private final n.e d(FunctionDescriptor descriptor) {
        return new n.e(new JvmMemberSignature.Method(e(descriptor), MethodSignatureMappingKt.computeJvmDescriptor$default(descriptor, false, false, 1, null)));
    }

    private final String e(CallableMemberDescriptor descriptor) {
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(descriptor);
        if (jvmMethodNameIfSpecial != null) {
            return jvmMethodNameIfSpecial;
        }
        if (descriptor instanceof PropertyGetterDescriptor) {
            String strAsString = DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString();
            p013kotlin.jvm.internal.s.j(strAsString, "asString(...)");
            return JvmAbi.getterName(strAsString);
        }
        if (descriptor instanceof PropertySetterDescriptor) {
            String strAsString2 = DescriptorUtilsKt.getPropertyIfAccessor(descriptor).getName().asString();
            p013kotlin.jvm.internal.s.j(strAsString2, "asString(...)");
            return JvmAbi.setterName(strAsString2);
        }
        String strAsString3 = descriptor.getName().asString();
        p013kotlin.jvm.internal.s.j(strAsString3, "asString(...)");
        return strAsString3;
    }

    public final ClassId c(Class<?> klass) {
        ClassId classIdMapJavaToKotlin;
        p013kotlin.jvm.internal.s.k(klass, "klass");
        if (!klass.isArray()) {
            if (p013kotlin.jvm.internal.s.f(klass, Void.TYPE)) {
                return JAVA_LANG_VOID;
            }
            PrimitiveType primitiveTypeA = a(klass);
            if (primitiveTypeA != null) {
                return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveTypeA.getTypeName());
            }
            ClassId classId = ReflectClassUtilKt.getClassId(klass);
            return (classId.isLocal() || (classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName())) == null) ? classId : classIdMapJavaToKotlin;
        }
        Class<?> componentType = klass.getComponentType();
        p013kotlin.jvm.internal.s.j(componentType, "getComponentType(...)");
        PrimitiveType primitiveTypeA2 = a(componentType);
        if (primitiveTypeA2 != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveTypeA2.getArrayTypeName());
        }
        ClassId.Companion companion = ClassId.Companion;
        FqName safe = StandardNames.FqNames.array.toSafe();
        p013kotlin.jvm.internal.s.j(safe, "toSafe(...)");
        return companion.topLevel(safe);
    }

    public final p f(PropertyDescriptor possiblyOverriddenProperty) {
        p013kotlin.jvm.internal.s.k(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor original = ((PropertyDescriptor) DescriptorUtils.unwrapFakeOverride(possiblyOverriddenProperty)).getOriginal();
        p013kotlin.jvm.internal.s.j(original, "getOriginal(...)");
        if (original instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
            p013kotlin.jvm.internal.s.j(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
            if (jvmPropertySignature != null) {
                return new p.c(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) original;
            SourceElement source = javaPropertyDescriptor.getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (javaElement instanceof ReflectJavaField) {
                return new p.a(((ReflectJavaField) javaElement).getMember());
            }
            if (javaElement instanceof ReflectJavaMethod) {
                Method member = ((ReflectJavaMethod) javaElement).getMember();
                PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
                SourceElement source2 = setter != null ? setter.getSource() : null;
                JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
                JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
                ReflectJavaMethod reflectJavaMethod = javaElement2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement2 : null;
                return new p.b(member, reflectJavaMethod != null ? reflectJavaMethod.getMember() : null);
            }
            throw new x2("Incorrect resolution sequence for Java field " + original + " (source = " + javaElement + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        PropertyGetterDescriptor getter = original.getGetter();
        p013kotlin.jvm.internal.s.h(getter);
        n.e eVarD = d(getter);
        PropertySetterDescriptor setter2 = original.getSetter();
        return new p.d(eVarD, setter2 != null ? d(setter2) : null);
    }

    public final n g(FunctionDescriptor possiblySubstitutedFunction) {
        Method member;
        JvmMemberSignature.Method jvmConstructorSignature;
        JvmMemberSignature.Method jvmMethodSignature;
        p013kotlin.jvm.internal.s.k(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor original = ((FunctionDescriptor) DescriptorUtils.unwrapFakeOverride(possiblySubstitutedFunction)).getOriginal();
        p013kotlin.jvm.internal.s.j(original, "getOriginal(...)");
        if (!(original instanceof DeserializedCallableMemberDescriptor)) {
            if (original instanceof JavaMethodDescriptor) {
                SourceElement source = ((JavaMethodDescriptor) original).getSource();
                JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
                JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
                ReflectJavaMethod reflectJavaMethod = javaElement instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement : null;
                if (reflectJavaMethod != null && (member = reflectJavaMethod.getMember()) != null) {
                    return new n.c(member);
                }
                throw new x2("Incorrect resolution sequence for Java method " + original);
            }
            if (!(original instanceof JavaClassConstructorDescriptor)) {
                if (b(original)) {
                    return d(original);
                }
                throw new x2("Unknown origin of " + original + " (" + original.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            SourceElement source2 = ((JavaClassConstructorDescriptor) original).getSource();
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            if (javaElement2 instanceof ReflectJavaConstructor) {
                return new n.b(((ReflectJavaConstructor) javaElement2).getMember());
            }
            if (javaElement2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElement2;
                if (reflectJavaClass.isAnnotationType()) {
                    return new n.a(reflectJavaClass.getElement());
                }
            }
            throw new x2("Incorrect resolution sequence for Java constructor " + original + " (" + javaElement2 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) original;
        MessageLite proto = deserializedMemberDescriptor.getProto();
        if ((proto instanceof ProtoBuf.Function) && (jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) != null) {
            return new n.e(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Constructor) || (jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) == null) {
            return d(original);
        }
        DeclarationDescriptor containingDeclaration = possiblySubstitutedFunction.getContainingDeclaration();
        p013kotlin.jvm.internal.s.j(containingDeclaration, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
            return new n.e(jvmConstructorSignature);
        }
        DeclarationDescriptor containingDeclaration2 = possiblySubstitutedFunction.getContainingDeclaration();
        p013kotlin.jvm.internal.s.j(containingDeclaration2, "getContainingDeclaration(...)");
        if (!InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration2)) {
            return new n.d(jvmConstructorSignature);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.isPrimary()) {
            if (!p013kotlin.jvm.internal.s.f(jvmConstructorSignature.getName(), "constructor-impl") || !p013kotlin.text.t.L(jvmConstructorSignature.getDesc(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        } else {
            if (!p013kotlin.jvm.internal.s.f(jvmConstructorSignature.getName(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
            ClassDescriptor constructedClass = constructorDescriptor.getConstructedClass();
            p013kotlin.jvm.internal.s.j(constructedClass, "getConstructedClass(...)");
            String strU = go0.o.u(constructedClass);
            if (p013kotlin.text.t.L(jvmConstructorSignature.getDesc(), ")V", false, 2, null)) {
                jvmConstructorSignature = JvmMemberSignature.Method.copy$default(jvmConstructorSignature, null, p013kotlin.text.t.W0(jvmConstructorSignature.getDesc(), "V") + strU, 1, null);
            } else if (!p013kotlin.text.t.L(jvmConstructorSignature.getDesc(), strU, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        }
        return new n.e(jvmConstructorSignature);
    }
}
