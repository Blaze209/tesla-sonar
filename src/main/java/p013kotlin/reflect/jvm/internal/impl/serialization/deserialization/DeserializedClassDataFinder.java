package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PackageFragmentProvider f88626a;

    public DeserializedClassDataFinder(PackageFragmentProvider packageFragmentProvider) {
        s.k(packageFragmentProvider, "packageFragmentProvider");
        this.f88626a = packageFragmentProvider;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        ClassData classDataFindClassData;
        s.k(classId, "classId");
        for (PackageFragmentDescriptor packageFragmentDescriptor : PackageFragmentProviderKt.packageFragments(this.f88626a, classId.getPackageFqName())) {
            if ((packageFragmentDescriptor instanceof DeserializedPackageFragment) && (classDataFindClassData = ((DeserializedPackageFragment) packageFragmentDescriptor).getClassDataFinder().findClassData(classId)) != null) {
                return classDataFindClassData;
            }
        }
        return null;
    }
}
