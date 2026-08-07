package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class DoubleValue extends ConstantValue<Double> {
    public DoubleValue(double d11) {
        super(Double.valueOf(d11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().doubleValue() + ".toDouble()";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType doubleType = module.getBuiltIns().getDoubleType();
        s.j(doubleType, "getDoubleType(...)");
        return doubleType;
    }
}
