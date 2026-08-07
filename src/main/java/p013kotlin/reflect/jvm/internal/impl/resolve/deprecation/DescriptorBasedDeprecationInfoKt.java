package p013kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorBasedDeprecationInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> f88477a = new CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt$DEPRECATED_FUNCTION_KEY$1
    };

    public static final CallableDescriptor.UserDataKey<DescriptorBasedDeprecationInfo> getDEPRECATED_FUNCTION_KEY() {
        return f88477a;
    }
}
