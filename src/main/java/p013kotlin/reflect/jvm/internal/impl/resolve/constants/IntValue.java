package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    public IntValue(int i11) {
        super(Integer.valueOf(i11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType intType = module.getBuiltIns().getIntType();
        s.j(intType, "getIntType(...)");
        return intType;
    }
}
