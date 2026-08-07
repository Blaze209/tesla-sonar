package p013kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z11, boolean z12, boolean z13, KotlinTypeRefiner kotlinTypeRefiner, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z11, z14, z13, kotlinTypeRefiner);
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z11, p pVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            pVar = b.f88442a;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z11, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(boolean z11, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, TypeConstructor c11, TypeConstructor c12) {
        s.k(c11, "c1");
        s.k(c12, "c2");
        if (s.f(c11, c12)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = c11.mo500getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor2 = c12.mo500getDeclarationDescriptor();
        if ((classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) && (classifierDescriptorMo500getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor2, z11, new e(callableDescriptor, callableDescriptor2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return s.f(declarationDescriptor, callableDescriptor) && s.f(declarationDescriptor2, callableDescriptor2);
    }

    private final boolean h(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return s.f(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        return false;
    }

    private final boolean j(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, p<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> pVar, boolean z11) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        return ((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? pVar.invoke(containingDeclaration, containingDeclaration2).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z11, false, 8, null);
    }

    private final SourceElement k(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) v.V0(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(CallableDescriptor a11, CallableDescriptor b11, boolean z11, boolean z12, boolean z13, KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(a11, "a");
        s.k(b11, "b");
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (s.f(a11, b11)) {
            return true;
        }
        if (!s.f(a11.getName(), b11.getName())) {
            return false;
        }
        if (z12 && (a11 instanceof MemberDescriptor) && (b11 instanceof MemberDescriptor) && ((MemberDescriptor) a11).isExpect() != ((MemberDescriptor) b11).isExpect()) {
            return false;
        }
        if ((s.f(a11.getContainingDeclaration(), b11.getContainingDeclaration()) && (!z11 || !s.f(k(a11), k(b11)))) || DescriptorUtils.isLocal(a11) || DescriptorUtils.isLocal(b11) || !j(a11, b11, c.f88443a, z11)) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new d(z11, a11, b11));
        s.j(overridingUtilCreate, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a11, b11, null, !z13).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b11, a11, null, z13 ^ true).getResult() == result2;
    }

    public final boolean areEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z11, boolean z12) {
        if ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) {
            return h((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2);
        }
        if ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z11, null, 8, null);
        }
        if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            return areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z11, z12, false, KotlinTypeRefiner.Default.INSTANCE, 16, null);
        }
        return ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? s.f(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : s.f(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a11, TypeParameterDescriptor b11, boolean z11) {
        s.k(a11, "a");
        s.k(b11, "b");
        return areTypeParametersEquivalent$default(this, a11, b11, z11, null, 8, null);
    }

    public final boolean areTypeParametersEquivalent(TypeParameterDescriptor a11, TypeParameterDescriptor b11, boolean z11, p<? super DeclarationDescriptor, ? super DeclarationDescriptor, Boolean> equivalentCallables) {
        s.k(a11, "a");
        s.k(b11, "b");
        s.k(equivalentCallables, "equivalentCallables");
        if (s.f(a11, b11)) {
            return true;
        }
        return !s.f(a11.getContainingDeclaration(), b11.getContainingDeclaration()) && j(a11, b11, equivalentCallables, z11) && a11.getIndex() == b11.getIndex();
    }
}
