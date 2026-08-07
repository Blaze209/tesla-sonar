package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class KClassValue extends ConstantValue<Value> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConstantValue<?> create(KotlinType argumentType) {
            s.k(argumentType, "argumentType");
            if (KotlinTypeKt.isError(argumentType)) {
                return null;
            }
            KotlinType type = argumentType;
            int i11 = 0;
            while (KotlinBuiltIns.isArray(type)) {
                type = ((TypeProjection) v.U0(type.getArguments())).getType();
                i11++;
            }
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = type.getConstructor().mo500getDeclarationDescriptor();
            if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptorMo500getDeclarationDescriptor);
                return classId == null ? new KClassValue(new Value.LocalClass(argumentType)) : new KClassValue(classId, i11);
            }
            if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                return null;
            }
            ClassId.Companion companion = ClassId.Companion;
            FqName safe = StandardNames.FqNames.any.toSafe();
            s.j(safe, "toSafe(...)");
            return new KClassValue(companion.topLevel(safe), 0);
        }

        private Companion() {
        }
    }

    public static abstract class Value {

        public static final class LocalClass extends Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KotlinType f88467a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(KotlinType type) {
                super(null);
                s.k(type, "type");
                this.f88467a = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && s.f(this.f88467a, ((LocalClass) obj).f88467a);
            }

            public final KotlinType getType() {
                return this.f88467a;
            }

            public int hashCode() {
                return this.f88467a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f88467a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public static final class NormalClass extends Value {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ClassLiteralValue f88468a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(ClassLiteralValue value) {
                super(null);
                s.k(value, "value");
                this.f88468a = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && s.f(this.f88468a, ((NormalClass) obj).f88468a);
            }

            public final int getArrayDimensions() {
                return this.f88468a.getArrayNestedness();
            }

            public final ClassId getClassId() {
                return this.f88468a.getClassId();
            }

            public final ClassLiteralValue getValue() {
                return this.f88468a;
            }

            public int hashCode() {
                return this.f88468a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f88468a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(Value value) {
        super(value);
        s.k(value, "value");
    }

    public final KotlinType getArgumentType(ModuleDescriptor module) {
        s.k(module, "module");
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (!(value instanceof Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
        ClassId classIdComponent1 = value2.component1();
        int iComponent2 = value2.component2();
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, classIdComponent1);
        if (classDescriptorFindClassAcrossModuleDependencies == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE, classIdComponent1.toString(), String.valueOf(iComponent2));
        }
        SimpleType defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        for (int i11 = 0; i11 < iComponent2; i11++) {
            kotlinTypeReplaceArgumentsWithStarProjections = module.getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeReplaceArgumentsWithStarProjections);
        }
        return kotlinTypeReplaceArgumentsWithStarProjections;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        s.k(module, "module");
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = module.getBuiltIns().getKClass();
        s.j(kClass, "getKClass(...)");
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, v.e(new TypeProjectionImpl(getArgumentType(module))));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassLiteralValue value) {
        this(new Value.NormalClass(value));
        s.k(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassId classId, int i11) {
        this(new ClassLiteralValue(classId, i11));
        s.k(classId, "classId");
    }
}
