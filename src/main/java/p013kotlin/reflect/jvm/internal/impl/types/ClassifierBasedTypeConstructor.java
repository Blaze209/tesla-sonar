package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f88867a;

    private final boolean b(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    protected final boolean a(ClassifierDescriptor first, ClassifierDescriptor second) {
        s.k(first, "first");
        s.k(second, "second");
        if (!s.f(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && s.f(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !s.f(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    protected abstract boolean c(ClassifierDescriptor classifierDescriptor);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = mo500getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor2 = typeConstructor.mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor2 != null && b(classifierDescriptorMo500getDeclarationDescriptor) && b(classifierDescriptorMo500getDeclarationDescriptor2)) {
            return c(classifierDescriptorMo500getDeclarationDescriptor2);
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo500getDeclarationDescriptor();

    public int hashCode() {
        int i11 = this.f88867a;
        if (i11 != 0) {
            return i11;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = mo500getDeclarationDescriptor();
        int iHashCode = b(classifierDescriptorMo500getDeclarationDescriptor) ? DescriptorUtils.getFqName(classifierDescriptorMo500getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.f88867a = iHashCode;
        return iHashCode;
    }
}
