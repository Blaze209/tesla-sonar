package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import p013kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltInFictitiousFunctionClassFactory implements ClassDescriptorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageManager f86593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f86594b;

    public BuiltInFictitiousFunctionClassFactory(StorageManager storageManager, ModuleDescriptor module) {
        s.k(storageManager, "storageManager");
        s.k(module, "module");
        this.f86593a = storageManager;
        this.f86594b = module;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        FqName packageFqName;
        FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        s.k(classId, "classId");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        String strAsString = classId.getRelativeClassName().asString();
        s.j(strAsString, "asString(...)");
        if (!t.h0(strAsString, "Function", false, 2, null) || (functionalClassKindWithArity = FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), strAsString)) == null) {
            return null;
        }
        FunctionTypeKind functionTypeKindComponent1 = functionalClassKindWithArity.component1();
        int iComponent2 = functionalClassKindWithArity.component2();
        List<PackageFragmentDescriptor> fragments = this.f86594b.getPackage(packageFqName).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(obj2);
            }
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (FunctionInterfacePackageFragment) v.q0(arrayList2);
        if (packageFragmentDescriptor == null) {
            packageFragmentDescriptor = (BuiltInsPackageFragment) v.o0(arrayList);
        }
        return new FunctionClassDescriptor(this.f86593a, packageFragmentDescriptor, functionTypeKindComponent1, iComponent2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName packageFqName) {
        s.k(packageFqName, "packageFqName");
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName packageFqName, Name name) {
        s.k(packageFqName, "packageFqName");
        s.k(name, "name");
        String strAsString = name.asString();
        s.j(strAsString, "asString(...)");
        return (t.b0(strAsString, "Function", false, 2, null) || t.b0(strAsString, "KFunction", false, 2, null) || t.b0(strAsString, "SuspendFunction", false, 2, null) || t.b0(strAsString, "KSuspendFunction", false, 2, null)) && FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(packageFqName, strAsString) != null;
    }
}
