package p013kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ErrorModuleDescriptor implements ModuleDescriptor {
    public static final ErrorModuleDescriptor INSTANCE = new ErrorModuleDescriptor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Name f88984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<ModuleDescriptor> f88985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<ModuleDescriptor> f88986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<ModuleDescriptor> f88987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lazy f88988e;

    static {
        Name nameSpecial = Name.special(ErrorEntity.ERROR_MODULE.getDebugText());
        s.j(nameSpecial, "special(...)");
        f88984a = nameSpecial;
        f88985b = v.m();
        f88986c = v.m();
        f88987d = d1.d();
        f88988e = m.b(a.f89008a);
    }

    private ErrorModuleDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns b() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        s.k(visitor, "visitor");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public KotlinBuiltIns getBuiltIns() {
        return (KotlinBuiltIns) f88988e.getValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public <T> T getCapability(ModuleCapability<T> capability) {
        s.k(capability, "capability");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public List<ModuleDescriptor> getExpectedByModules() {
        return f88986c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        return getStableName();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getOriginal() {
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public PackageViewDescriptor getPackage(FqName fqName) {
        s.k(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    public Name getStableName() {
        return f88984a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public Collection<FqName> getSubPackagesOf(FqName fqName, l<? super Name, Boolean> nameFilter) {
        s.k(fqName, "fqName");
        s.k(nameFilter, "nameFilter");
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
    public boolean shouldSeeInternalsOf(ModuleDescriptor targetModule) {
        s.k(targetModule, "targetModule");
        return false;
    }
}
