package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    public BooleanValue(boolean z11) {
        super(Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        s.k(module, "module");
        SimpleType booleanType = module.getBuiltIns().getBooleanType();
        s.j(booleanType, "getBooleanType(...)");
        return booleanType;
    }
}
