package p013kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractModifierChecks {
    public final CheckResult check(FunctionDescriptor functionDescriptor) {
        s.k(functionDescriptor, "functionDescriptor");
        for (Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.INSTANCE;
    }

    public abstract List<Checks> getChecks$descriptors();
}
