package p013kotlin.reflect.jvm.internal.impl.load.java;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeclarationDescriptor f87072a;

    public DeprecationCausedByFunctionNInfo(DeclarationDescriptor target) {
        s.k(target, "target");
        this.f87072a = target;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public DeprecationLevelValue getDeprecationLevel() {
        return DeprecationLevelValue.ERROR;
    }
}
