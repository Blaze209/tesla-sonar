package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import jn0.e;
import jn0.m;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> f87235b;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents components) {
        s.k(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, m.c(null));
        this.f87234a = lazyJavaResolverContext;
        this.f87235b = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment b(FqName fqName) {
        JavaPackage javaPackageFindPackage$default = JavaClassFinder$$Util.findPackage$default(this.f87234a.getComponents().getFinder(), fqName, false, 2, null);
        if (javaPackageFindPackage$default == null) {
            return null;
        }
        return this.f87235b.computeIfAbsent(fqName, new d(this, javaPackageFindPackage$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaPackageFragment c(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        return new LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.f87234a, javaPackage);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        s.k(fqName, "fqName");
        s.k(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, b(fqName));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @e
    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        s.k(fqName, "fqName");
        return v.q(b(fqName));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, l lVar) {
        return getSubPackagesOf(fqName, (l<? super Name, Boolean>) lVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        s.k(fqName, "fqName");
        return JavaClassFinder$$Util.findPackage$default(this.f87234a.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f87234a.getComponents().getModule();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentB = b(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = lazyJavaPackageFragmentB != null ? lazyJavaPackageFragmentB.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? v.m() : subPackageFqNames$descriptors_jvm;
    }
}
