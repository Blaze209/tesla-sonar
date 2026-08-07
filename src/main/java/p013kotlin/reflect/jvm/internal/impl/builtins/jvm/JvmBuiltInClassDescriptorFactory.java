package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Name f86639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ClassId f86640g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f86641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<ModuleDescriptor, DeclarationDescriptor> f86642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f86643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86637d = {o0.k(new f0(o0.b(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FqName f86638e = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.f86640g;
        }

        private Companion() {
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        Name nameShortName = fqNameUnsafe.shortName();
        s.j(nameShortName, "shortName(...)");
        f86639f = nameShortName;
        ClassId.Companion companion = ClassId.Companion;
        FqName safe = fqNameUnsafe.toSafe();
        s.j(safe, "toSafe(...)");
        f86640g = companion.topLevel(safe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, l<? super ModuleDescriptor, ? extends DeclarationDescriptor> computeContainingDeclaration) {
        s.k(storageManager, "storageManager");
        s.k(moduleDescriptor, "moduleDescriptor");
        s.k(computeContainingDeclaration, "computeContainingDeclaration");
        this.f86641a = moduleDescriptor;
        this.f86642b = computeContainingDeclaration;
        this.f86643c = storageManager.createLazyValue(new a(this, storageManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuiltInsPackageFragment a(ModuleDescriptor module) {
        s.k(module, "module");
        List<PackageFragmentDescriptor> fragments = module.getPackage(f86638e).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        return (BuiltInsPackageFragment) v.o0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptorImpl d(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(jvmBuiltInClassDescriptorFactory.f86642b.invoke(jvmBuiltInClassDescriptorFactory.f86641a), f86639f, Modality.ABSTRACT, ClassKind.INTERFACE, v.e(jvmBuiltInClassDescriptorFactory.f86641a.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(new CloneableClassScope(storageManager, classDescriptorImpl), d1.d(), null);
        return classDescriptorImpl;
    }

    private final ClassDescriptorImpl e() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.f86643c, this, (m<?>) f86637d[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        s.k(classId, "classId");
        if (s.f(classId, f86640g)) {
            return e();
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName packageFqName) {
        s.k(packageFqName, "packageFqName");
        return s.f(packageFqName, f86638e) ? d1.c(e()) : d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName packageFqName, Name name) {
        s.k(packageFqName, "packageFqName");
        s.k(name, "name");
        return s.f(name, f86639f) && s.f(packageFqName, f86638e);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i11 & 4) != 0 ? b.f86672a : lVar);
    }
}
