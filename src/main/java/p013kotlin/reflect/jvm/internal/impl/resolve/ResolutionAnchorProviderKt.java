package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class ResolutionAnchorProviderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<ResolutionAnchorProvider> f88439a = new ModuleCapability<>("ResolutionAnchorProvider");

    public static final ModuleDescriptor getResolutionAnchorIfAny(ModuleDescriptor moduleDescriptor) {
        s.k(moduleDescriptor, "<this>");
        ResolutionAnchorProvider resolutionAnchorProvider = (ResolutionAnchorProvider) moduleDescriptor.getCapability(f88439a);
        if (resolutionAnchorProvider != null) {
            return resolutionAnchorProvider.getResolutionAnchor(moduleDescriptor);
        }
        return null;
    }
}
