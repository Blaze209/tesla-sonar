package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ModuleDependenciesImpl implements ModuleDependencies {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f86886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f86887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<ModuleDescriptorImpl> f86888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<ModuleDescriptorImpl> f86889d;

    public ModuleDependenciesImpl(List<ModuleDescriptorImpl> allDependencies, Set<ModuleDescriptorImpl> modulesWhoseInternalsAreVisible, List<ModuleDescriptorImpl> directExpectedByDependencies, Set<ModuleDescriptorImpl> allExpectedByDependencies) {
        s.k(allDependencies, "allDependencies");
        s.k(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        s.k(directExpectedByDependencies, "directExpectedByDependencies");
        s.k(allExpectedByDependencies, "allExpectedByDependencies");
        this.f86886a = allDependencies;
        this.f86887b = modulesWhoseInternalsAreVisible;
        this.f86888c = directExpectedByDependencies;
        this.f86889d = allExpectedByDependencies;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getAllDependencies() {
        return this.f86886a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public List<ModuleDescriptorImpl> getDirectExpectedByDependencies() {
        return this.f86888c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependencies
    public Set<ModuleDescriptorImpl> getModulesWhoseInternalsAreVisible() {
        return this.f86887b;
    }
}
