package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import jn0.e;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public interface PackageFragmentProvider {
    @e
    List<PackageFragmentDescriptor> getPackageFragments(FqName fqName);

    Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> lVar);
}
