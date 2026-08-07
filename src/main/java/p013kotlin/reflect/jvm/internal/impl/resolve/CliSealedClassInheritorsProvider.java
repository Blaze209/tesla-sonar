package p013kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mn0.a;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;

/* JADX INFO: loaded from: classes9.dex */
public final class CliSealedClassInheritorsProvider extends SealedClassInheritorsProvider {
    public static final CliSealedClassInheritorsProvider INSTANCE = new CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    private static final void a(ClassDescriptor classDescriptor, LinkedHashSet<ClassDescriptor> linkedHashSet, MemberScope memberScope, boolean z11) {
        for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof ClassDescriptor) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    Name name = classDescriptor2.getName();
                    s.j(name, "getName(...)");
                    ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = memberScope.mo501getContributedClassifier(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    classDescriptor2 = classifierDescriptorMo501getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo501getContributedClassifier : classifierDescriptorMo501getContributedClassifier instanceof TypeAliasDescriptor ? ((TypeAliasDescriptor) classifierDescriptorMo501getContributedClassifier).getClassDescriptor() : null;
                }
                if (classDescriptor2 != null) {
                    if (DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z11) {
                        MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        s.j(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
                        a(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z11);
                    }
                }
            }
        }
    }

    public Collection<ClassDescriptor> computeSealedSubclasses(ClassDescriptor sealedClass, boolean z11) {
        DeclarationDescriptor next;
        DeclarationDescriptor containingDeclaration;
        s.k(sealedClass, "sealedClass");
        if (sealedClass.getModality() != Modality.SEALED) {
            return v.m();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z11) {
            Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof PackageFragmentDescriptor));
            containingDeclaration = next;
        } else {
            containingDeclaration = sealedClass.getContainingDeclaration();
        }
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            a(sealedClass, linkedHashSet, ((PackageFragmentDescriptor) containingDeclaration).getMemberScope(), z11);
        }
        MemberScope unsubstitutedInnerClassesScope = sealedClass.getUnsubstitutedInnerClassesScope();
        s.j(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
        a(sealedClass, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return v.a1(linkedHashSet, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.d(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t12).asString());
            }
        });
    }
}
