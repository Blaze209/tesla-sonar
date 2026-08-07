package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<PackageFragmentProvider> f86799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86800b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositePackageFragmentProvider(List<? extends PackageFragmentProvider> providers, String debugName) {
        s.k(providers, "providers");
        s.k(debugName, "debugName");
        this.f86799a = providers;
        this.f86800b = debugName;
        providers.size();
        v.r1(providers).size();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        s.k(fqName, "fqName");
        s.k(packageFragments, "packageFragments");
        Iterator<PackageFragmentProvider> it = this.f86799a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, packageFragments);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @e
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        s.k(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<PackageFragmentProvider> it = this.f86799a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible(it.next(), fqName, arrayList);
        }
        return v.m1(arrayList);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<PackageFragmentProvider> it = this.f86799a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().getSubPackagesOf(fqName, nameFilter));
        }
        return hashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        s.k(fqName, "fqName");
        List<PackageFragmentProvider> list = this.f86799a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.isEmpty((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.f86800b;
    }
}
