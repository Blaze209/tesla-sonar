package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection<PackageFragmentDescriptor> f86710a;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> packageFragments) {
        s.k(packageFragments, "packageFragments");
        this.f86710a = packageFragments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName c(PackageFragmentDescriptor it) {
        s.k(it, "it");
        return it.getFqName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(FqName fqName, FqName it) {
        s.k(it, "it");
        return !it.isRoot() && s.f(it.parent(), fqName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        s.k(fqName, "fqName");
        s.k(packageFragments, "packageFragments");
        for (Object obj : this.f86710a) {
            if (s.f(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @e
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        s.k(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f86710a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (s.f(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        return ho0.l.c0(ho0.l.H(ho0.l.U(v.e0(this.f86710a), e.f86755a), new f(fqName)));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        s.k(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.f86710a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (s.f(((PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
