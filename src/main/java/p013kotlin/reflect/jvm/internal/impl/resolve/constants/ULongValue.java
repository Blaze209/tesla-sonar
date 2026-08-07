package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class ULongValue extends UnsignedValueConstant<Long> {
    public ULongValue(long j11) {
        super(Long.valueOf(j11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        SimpleType defaultType;
        s.k(module, "module");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.uLong);
        return (classDescriptorFindClassAcrossModuleDependencies == null || (defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : defaultType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().longValue() + ".toULong()";
    }
}
