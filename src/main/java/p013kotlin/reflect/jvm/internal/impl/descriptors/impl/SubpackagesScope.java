package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f86958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FqName f86959b;

    public SubpackagesScope(ModuleDescriptor moduleDescriptor, FqName fqName) {
        s.k(moduleDescriptor, "moduleDescriptor");
        s.k(fqName, "fqName");
        this.f86958a = moduleDescriptor;
        this.f86959b = fqName;
    }

    protected final PackageViewDescriptor a(Name name) {
        s.k(name, "name");
        if (name.isSpecial()) {
            return null;
        }
        ModuleDescriptor moduleDescriptor = this.f86958a;
        FqName fqNameChild = this.f86959b.child(name);
        s.j(fqNameChild, "child(...)");
        PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(fqNameChild);
        if (packageViewDescriptor.isEmpty()) {
            return null;
        }
        return packageViewDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return v.m();
        }
        if (this.f86959b.isRoot() && kindFilter.getExcludes().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return v.m();
        }
        Collection<FqName> subPackagesOf = this.f86958a.getSubPackagesOf(this.f86959b, nameFilter);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<FqName> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            Name nameShortName = it.next().shortName();
            s.j(nameShortName, "shortName(...)");
            if (nameFilter.invoke(nameShortName).booleanValue()) {
                CollectionsKt.addIfNotNull(arrayList, a(nameShortName));
            }
        }
        return arrayList;
    }

    public String toString() {
        return "subpackages of " + this.f86959b + " from " + this.f86958a;
    }
}
