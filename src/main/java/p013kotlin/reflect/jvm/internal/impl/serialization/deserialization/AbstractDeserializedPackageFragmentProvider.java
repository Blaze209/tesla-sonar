package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import jn0.e;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageManager f88577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinMetadataFinder f88578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ModuleDescriptor f88579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected DeserializationComponents f88580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> f88581e;

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager, KotlinMetadataFinder finder, ModuleDescriptor moduleDescriptor) {
        s.k(storageManager, "storageManager");
        s.k(finder, "finder");
        s.k(moduleDescriptor, "moduleDescriptor");
        this.f88577a = storageManager;
        this.f88578b = finder;
        this.f88579c = moduleDescriptor;
        this.f88581e = storageManager.createMemoizedFunctionWithNullableValues(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor c(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, FqName fqName) {
        s.k(fqName, "fqName");
        DeserializedPackageFragment deserializedPackageFragmentB = abstractDeserializedPackageFragmentProvider.b(fqName);
        if (deserializedPackageFragmentB == null) {
            return null;
        }
        deserializedPackageFragmentB.initialize(abstractDeserializedPackageFragmentProvider.d());
        return deserializedPackageFragmentB;
    }

    protected abstract DeserializedPackageFragment b(FqName fqName);

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        s.k(fqName, "fqName");
        s.k(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, this.f88581e.invoke(fqName));
    }

    protected final DeserializationComponents d() {
        DeserializationComponents deserializationComponents = this.f88580d;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        s.B("components");
        return null;
    }

    protected final KotlinMetadataFinder e() {
        return this.f88578b;
    }

    protected final ModuleDescriptor f() {
        return this.f88579c;
    }

    protected final StorageManager g() {
        return this.f88577a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @e
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        s.k(fqName, "fqName");
        return v.q(this.f88581e.invoke(fqName));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        return d1.d();
    }

    protected final void h(DeserializationComponents deserializationComponents) {
        s.k(deserializationComponents, "<set-?>");
        this.f88580d = deserializationComponents;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        s.k(fqName, "fqName");
        return (this.f88581e.isComputed(fqName) ? (PackageFragmentDescriptor) this.f88581e.invoke(fqName) : b(fqName)) == null;
    }
}
