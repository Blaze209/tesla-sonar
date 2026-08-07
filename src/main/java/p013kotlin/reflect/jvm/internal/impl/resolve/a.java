package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* JADX INFO: loaded from: classes9.dex */
final class a implements StdlibClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f88441a = new a();

    private a() {
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    public ClassDescriptor findEnumEntriesClass(ModuleDescriptor moduleDescriptor) {
        s.k(moduleDescriptor, "moduleDescriptor");
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
