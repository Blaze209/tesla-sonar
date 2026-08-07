package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
final class b implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f89082a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f89083b = "should not have varargs or parameters with default values";

    private b() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            s.h(valueParameterDescriptor);
            if (DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) || valueParameterDescriptor.getVarargElementType() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return f89083b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
