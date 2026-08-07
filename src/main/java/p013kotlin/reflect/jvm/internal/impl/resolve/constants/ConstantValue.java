package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f88455a;

    public ConstantValue(T t11) {
        this.f88455a = t11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return s.f(value, constantValue != null ? constantValue.getValue() : null);
    }

    public abstract KotlinType getType(ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return this.f88455a;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
