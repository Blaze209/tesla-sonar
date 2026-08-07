package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public interface PackageFragmentProviderOptimized extends PackageFragmentProvider {
    void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> collection);

    boolean isEmpty(FqName fqName);
}
