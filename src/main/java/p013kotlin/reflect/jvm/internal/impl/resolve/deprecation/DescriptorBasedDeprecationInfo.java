package p013kotlin.reflect.jvm.internal.impl.resolve.deprecation;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DescriptorBasedDeprecationInfo extends DeprecationInfo {
    public boolean getForcePropagationToOverrides() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationInfo
    public boolean getPropagatesToOverrides() {
        return getForcePropagationToOverrides();
    }
}
