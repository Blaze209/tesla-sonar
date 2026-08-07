package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
final class a implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f89080a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f89081b = "second parameter must be of type KProperty<*> or its supertype";

    private a() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.getValueParameters().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        s.h(valueParameterDescriptor);
        KotlinType kotlinTypeCreateKPropertyStarType = companion.createKPropertyStarType(DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (kotlinTypeCreateKPropertyStarType == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        s.j(type, "getType(...)");
        return TypeUtilsKt.isSubtypeOf(kotlinTypeCreateKPropertyStarType, TypeUtilsKt.makeNotNullable(type));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return f89081b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
