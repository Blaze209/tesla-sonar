package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleExceptionKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.platform.TargetPlatform;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ModuleDescriptorImpl extends DeclarationDescriptorImpl implements ModuleDescriptor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StorageManager f86890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KotlinBuiltIns f86891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TargetPlatform f86892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Name f86893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<ModuleCapability<?>, Object> f86894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PackageViewDescriptorFactory f86895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ModuleDependencies f86896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PackageFragmentProvider f86897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f86898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<FqName, PackageViewDescriptor> f86899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f86900m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform) {
        this(moduleName, storageManager, builtIns, targetPlatform, null, null, 48, null);
        s.k(moduleName, "moduleName");
        s.k(storageManager, "storageManager");
        s.k(builtIns, "builtIns");
    }

    private final String d() {
        String string = getName().toString();
        s.j(string, "toString(...)");
        return string;
    }

    private final CompositePackageFragmentProvider e() {
        return (CompositePackageFragmentProvider) this.f86900m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompositePackageFragmentProvider f(ModuleDescriptorImpl moduleDescriptorImpl) {
        ModuleDependencies moduleDependencies = moduleDescriptorImpl.f86896i;
        if (moduleDependencies == null) {
            throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.d() + " were not set before querying module content");
        }
        List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
        moduleDescriptorImpl.assertValid();
        allDependencies.contains(moduleDescriptorImpl);
        List<ModuleDescriptorImpl> list = allDependencies;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ModuleDescriptorImpl) it.next()).isInitialized();
        }
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            PackageFragmentProvider packageFragmentProvider = ((ModuleDescriptorImpl) it2.next()).f86897j;
            s.h(packageFragmentProvider);
            arrayList.add(packageFragmentProvider);
        }
        return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + moduleDescriptorImpl.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageViewDescriptor g(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName) {
        s.k(fqName, "fqName");
        return moduleDescriptorImpl.f86895h.compute(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f86890c);
    }

    private final boolean isInitialized() {
        return this.f86897j != null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return (R) ModuleDescriptor.DefaultImpls.accept(this, declarationDescriptorVisitor, d11);
    }

    public void assertValid() {
        if (isValid()) {
            return;
        }
        InvalidModuleExceptionKt.moduleInvalidated(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return this.f86891d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleCapability<T> capability) {
        s.k(capability, "capability");
        T t11 = (T) this.f86894g.get(capability);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return ModuleDescriptor.DefaultImpls.getContainingDeclaration(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        ModuleDependencies moduleDependencies = this.f86896i;
        if (moduleDependencies != null) {
            return moduleDependencies.getDirectExpectedByDependencies();
        }
        throw new AssertionError("Dependencies of module " + d() + " were not set");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        s.k(fqName, "fqName");
        assertValid();
        return (PackageViewDescriptor) this.f86899l.invoke(fqName);
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        assertValid();
        return e();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        assertValid();
        return getPackageFragmentProvider().getSubPackagesOf(fqName, nameFilter);
    }

    public final void initialize(PackageFragmentProvider providerForModuleContent) {
        s.k(providerForModuleContent, "providerForModuleContent");
        isInitialized();
        this.f86897j = providerForModuleContent;
    }

    public boolean isValid() {
        return this.f86898k;
    }

    public final void setDependencies(ModuleDependencies dependencies) {
        s.k(dependencies, "dependencies");
        this.f86896i = dependencies;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor targetModule) {
        s.k(targetModule, "targetModule");
        if (s.f(this, targetModule)) {
            return true;
        }
        ModuleDependencies moduleDependencies = this.f86896i;
        s.h(moduleDependencies);
        return v.g0(moduleDependencies.getModulesWhoseInternalsAreVisible(), targetModule) || getExpectedByModules().contains(targetModule) || targetModule.getExpectedByModules().contains(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!isValid()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        PackageFragmentProvider packageFragmentProvider = this.f86897j;
        sb2.append(packageFragmentProvider != null ? packageFragmentProvider.getClass().getSimpleName() : null);
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ModuleDescriptorImpl(Name name, StorageManager storageManager, KotlinBuiltIns kotlinBuiltIns, TargetPlatform targetPlatform, Map map, Name name2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, storageManager, kotlinBuiltIns, (i11 & 8) != 0 ? null : targetPlatform, (i11 & 16) != 0 ? v0.i() : map, (i11 & 32) != 0 ? null : name2);
    }

    public final void setDependencies(ModuleDescriptorImpl... descriptors) {
        s.k(descriptors, "descriptors");
        setDependencies(n.w1(descriptors));
    }

    public final void setDependencies(List<ModuleDescriptorImpl> descriptors) {
        s.k(descriptors, "descriptors");
        setDependencies(descriptors, d1.d());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(Name moduleName, StorageManager storageManager, KotlinBuiltIns builtIns, TargetPlatform targetPlatform, Map<ModuleCapability<?>, ? extends Object> capabilities, Name name) {
        super(Annotations.Companion.getEMPTY(), moduleName);
        s.k(moduleName, "moduleName");
        s.k(storageManager, "storageManager");
        s.k(builtIns, "builtIns");
        s.k(capabilities, "capabilities");
        this.f86890c = storageManager;
        this.f86891d = builtIns;
        this.f86892e = targetPlatform;
        this.f86893f = name;
        if (moduleName.isSpecial()) {
            this.f86894g = capabilities;
            PackageViewDescriptorFactory packageViewDescriptorFactory = (PackageViewDescriptorFactory) getCapability(PackageViewDescriptorFactory.Companion.getCAPABILITY());
            this.f86895h = packageViewDescriptorFactory == null ? PackageViewDescriptorFactory.Default.INSTANCE : packageViewDescriptorFactory;
            this.f86898k = true;
            this.f86899l = storageManager.createMemoizedFunction(new g(this));
            this.f86900m = m.b(new h(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }

    public final void setDependencies(List<ModuleDescriptorImpl> descriptors, Set<ModuleDescriptorImpl> friends) {
        s.k(descriptors, "descriptors");
        s.k(friends, "friends");
        setDependencies(new ModuleDependenciesImpl(descriptors, friends, v.m(), d1.d()));
    }
}
