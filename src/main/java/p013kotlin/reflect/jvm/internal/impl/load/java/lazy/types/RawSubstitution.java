package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class RawSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JavaTypeAttributes f87406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final JavaTypeAttributes f87407d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RawProjectionComputer f87408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeParameterUpperBoundEraser f87409b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f87406c = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f87407d = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, true, null, 5, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Pair<SimpleType, Boolean> b(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return x.a(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            Variance projectionKind = typeProjection.getProjectionKind();
            KotlinType type = typeProjection.getType();
            s.j(type, "getType(...)");
            return x.a(KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), v.e(new TypeProjectionImpl(projectionKind, d(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return x.a(ErrorUtils.createErrorType(ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        s.j(memberScope, "getMemberScope(...)");
        TypeAttributes attributes = simpleType.getAttributes();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        s.j(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            RawProjectionComputer rawProjectionComputer = this.f87408a;
            s.h(typeParameterDescriptor);
            arrayList.add(ErasureProjectionComputer.computeProjection$default(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.f87409b, null, 8, null));
        }
        return x.a(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new b(classDescriptor, this, simpleType, javaTypeAttributes)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType c(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || s.f(classDescriptorFindClassAcrossModuleDependencies, classDescriptor)) {
            return null;
        }
        return rawSubstitution.b(simpleType, classDescriptorFindClassAcrossModuleDependencies, javaTypeAttributes).e();
    }

    private final KotlinType d(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return d(this.f87409b.getErasedUpperBound((TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true)), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + classifierDescriptorMo500getDeclarationDescriptor).toString());
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor2 instanceof ClassDescriptor) {
            Pair<SimpleType, Boolean> pairB = b(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor, f87406c);
            SimpleType simpleTypeA = pairB.a();
            boolean zBooleanValue = pairB.b().booleanValue();
            Pair<SimpleType, Boolean> pairB2 = b(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor2, f87407d);
            SimpleType simpleTypeA2 = pairB2.a();
            return (zBooleanValue || pairB2.b().booleanValue()) ? new RawTypeImpl(simpleTypeA, simpleTypeA2) : KotlinTypeFactory.flexibleType(simpleTypeA, simpleTypeA2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo500getDeclarationDescriptor2 + "\" while for lower it's \"" + classifierDescriptorMo500getDeclarationDescriptor + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    static /* synthetic */ KotlinType e(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.d(kotlinType, javaTypeAttributes);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f87408a = rawProjectionComputer;
        if (typeParameterUpperBoundEraser == null) {
            typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
        }
        this.f87409b = typeParameterUpperBoundEraser;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjectionImpl mo503get(KotlinType key) {
        s.k(key, "key");
        return new TypeProjectionImpl(e(this, key, null, 2, null));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
