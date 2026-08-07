package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KotlinType f88469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        super(value, new d(type));
        s.k(value, "value");
        s.k(type, "type");
        this.f88469c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType a(KotlinType kotlinType, ModuleDescriptor it) {
        s.k(it, "it");
        return kotlinType;
    }

    public final KotlinType getType() {
        return this.f88469c;
    }
}
