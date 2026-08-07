package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<ModuleDescriptor, KotlinType> f88452b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(List<? extends ConstantValue<?>> value, l<? super ModuleDescriptor, ? extends KotlinType> computeType) {
        super(value);
        s.k(value, "value");
        s.k(computeType, "computeType");
        this.f88452b = computeType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        s.k(module, "module");
        KotlinType kotlinTypeInvoke = this.f88452b.invoke(module);
        if (!KotlinBuiltIns.isArray(kotlinTypeInvoke) && !KotlinBuiltIns.isPrimitiveArray(kotlinTypeInvoke)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinTypeInvoke);
        }
        return kotlinTypeInvoke;
    }
}
