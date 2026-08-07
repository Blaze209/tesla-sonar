package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* JADX INFO: loaded from: classes9.dex */
public final class StdlibClassFinderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ModuleCapability<StdlibClassFinder> f88440a = new ModuleCapability<>("StdlibClassFinder");

    public static final StdlibClassFinder getStdlibClassFinder(ModuleDescriptor moduleDescriptor) {
        s.k(moduleDescriptor, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.getCapability(f88440a);
        return stdlibClassFinder == null ? a.f88441a : stdlibClassFinder;
    }
}
