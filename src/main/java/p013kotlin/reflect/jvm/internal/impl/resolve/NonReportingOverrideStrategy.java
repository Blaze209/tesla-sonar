package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public abstract class NonReportingOverrideStrategy extends OverridingStrategy {
    protected abstract void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void inheritanceConflict(CallableMemberDescriptor first, CallableMemberDescriptor second) {
        s.k(first, "first");
        s.k(second, "second");
        a(first, second);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public void overrideConflict(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
        s.k(fromSuper, "fromSuper");
        s.k(fromCurrent, "fromCurrent");
        a(fromSuper, fromCurrent);
    }
}
