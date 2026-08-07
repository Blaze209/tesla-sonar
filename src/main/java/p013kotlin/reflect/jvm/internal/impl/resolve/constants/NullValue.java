package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class NullValue extends ConstantValue<Void> {
    public NullValue() {
        super(null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType nullableNothingType = module.getBuiltIns().getNullableNothingType();
        s.j(nullableNothingType, "getNullableNothingType(...)");
        return nullableNothingType;
    }
}
