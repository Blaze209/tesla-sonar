package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import co0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public class LazyPackageViewDescriptorImpl extends DeclarationDescriptorImpl implements PackageViewDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86872h = {o0.k(new f0(o0.b(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), o0.k(new f0(o0.b(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ModuleDescriptorImpl f86873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FqName f86874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f86875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NotNullLazyValue f86876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MemberScope f86877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
        super(Annotations.Companion.getEMPTY(), fqName.shortNameOrSpecial());
        s.k(module, "module");
        s.k(fqName, "fqName");
        s.k(storageManager, "storageManager");
        this.f86873c = module;
        this.f86874d = fqName;
        this.f86875e = storageManager.createLazyValue(new d(this));
        this.f86876f = storageManager.createLazyValue(new e(this));
        this.f86877g = new LazyScopeAdapter(storageManager, new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope h(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl) {
        if (lazyPackageViewDescriptorImpl.isEmpty()) {
            return MemberScope.Empty.INSTANCE;
        }
        List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
        ArrayList arrayList = new ArrayList(v.y(fragments, 10));
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
        }
        List listQ0 = v.Q0(arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
        return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), listQ0);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        s.k(visitor, "visitor");
        return visitor.visitPackageViewDescriptor(this, d11);
    }

    public boolean equals(Object obj) {
        PackageViewDescriptor packageViewDescriptor = obj instanceof PackageViewDescriptor ? (PackageViewDescriptor) obj : null;
        return packageViewDescriptor != null && s.f(getFqName(), packageViewDescriptor.getFqName()) && s.f(getModule(), packageViewDescriptor.getModule());
    }

    protected final boolean g() {
        return ((Boolean) StorageKt.getValue(this.f86876f, this, (m<?>) f86872h[1])).booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public FqName getFqName() {
        return this.f86874d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public List<PackageFragmentDescriptor> getFragments() {
        return (List) StorageKt.getValue(this.f86875e, this, (m<?>) f86872h[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public MemberScope getMemberScope() {
        return this.f86877g;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public boolean isEmpty() {
        return g();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageViewDescriptor getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        ModuleDescriptorImpl module = getModule();
        FqName fqNameParent = getFqName().parent();
        s.j(fqNameParent, "parent(...)");
        return module.getPackage(fqNameParent);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor
    public ModuleDescriptorImpl getModule() {
        return this.f86873c;
    }
}
