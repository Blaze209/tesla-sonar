package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class FloatValue extends ConstantValue<Float> {
    public FloatValue(float f11) {
        super(Float.valueOf(f11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().floatValue() + ".toFloat()";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType floatType = module.getBuiltIns().getFloatType();
        s.j(floatType, "getFloatType(...)");
        return floatType;
    }
}
