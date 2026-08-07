package p013kotlin.reflect.jvm.internal.impl.descriptors;

import co0.g;
import ho0.l;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.e0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes9.dex */
public final class FindClassInModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(ClassId it) {
        s.k(it, "it");
        return 0;
    }

    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        s.k(moduleDescriptor, "<this>");
        s.k(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        s.k(moduleDescriptor, "<this>");
        s.k(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            s.j(listPathSegments, "pathSegments(...)");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object objO0 = v.o0(listPathSegments);
            s.j(objO0, "first(...)");
            ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = memberScope.mo501getContributedClassifier((Name) objO0, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo501getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo501getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) classifierDescriptorMo501getContributedClassifier).getUnsubstitutedInnerClassesScope();
                s.h(name);
                ClassifierDescriptor classifierDescriptorMo501getContributedClassifier2 = unsubstitutedInnerClassesScope.mo501getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo501getContributedClassifier = classifierDescriptorMo501getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo501getContributedClassifier2 : null;
                if (classifierDescriptorMo501getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo501getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        s.j(listPathSegments2, "pathSegments(...)");
        MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
        Object objO1 = v.o0(listPathSegments2);
        s.j(objO1, "first(...)");
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier3 = memberScope2.mo501getContributedClassifier((Name) objO1, NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo501getContributedClassifier3 == null) {
            classifierDescriptorMo501getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo501getContributedClassifier3 instanceof ClassDescriptor) {
                MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) classifierDescriptorMo501getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                s.h(name2);
                ClassifierDescriptor classifierDescriptorMo501getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo501getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo501getContributedClassifier3 = classifierDescriptorMo501getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo501getContributedClassifier4 : null;
                if (classifierDescriptorMo501getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo501getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo501getContributedClassifier3 != null) {
            return classifierDescriptorMo501getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        s.j(listPathSegments3, "pathSegments(...)");
        MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
        Object objO2 = v.o0(listPathSegments3);
        s.j(objO2, "first(...)");
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier5 = memberScope3.mo501getContributedClassifier((Name) objO2, NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo501getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo501getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) classifierDescriptorMo501getContributedClassifier5).getUnsubstitutedInnerClassesScope();
            s.h(name3);
            ClassifierDescriptor classifierDescriptorMo501getContributedClassifier6 = unsubstitutedInnerClassesScope3.mo501getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo501getContributedClassifier5 = classifierDescriptorMo501getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo501getContributedClassifier6 : null;
            if (classifierDescriptorMo501getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo501getContributedClassifier5;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        s.k(moduleDescriptor, "<this>");
        s.k(classId, "classId");
        s.k(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, l.c0(l.U(l.q(classId, new e0() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.a
            @Override // co0.o
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }

            @Override // p013kotlin.jvm.internal.f, co0.c
            public String getName() {
                return "outerClassId";
            }

            @Override // p013kotlin.jvm.internal.f
            public g getOwner() {
                return o0.b(ClassId.class);
            }

            @Override // p013kotlin.jvm.internal.f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), b.f86751a)));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        s.k(moduleDescriptor, "<this>");
        s.k(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
