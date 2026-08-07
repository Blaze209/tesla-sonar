package p013kotlin.reflect.jvm.internal.impl.descriptors;

import ho0.i;
import ho0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        s.k(kotlinType, "<this>");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        return d(kotlinType, classifierDescriptorMo500getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo500getDeclarationDescriptor : null, 0);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> listM;
        DeclarationDescriptor next;
        TypeConstructor typeConstructor;
        s.k(classifierDescriptorWithTypeParameters, "<this>");
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List listC0 = l.c0(l.N(l.H(l.a0(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), i.f86760a), j.f86985a), k.f86986a));
        Iterator<DeclarationDescriptor> it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        do {
            listM = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof ClassDescriptor));
        ClassDescriptor classDescriptor = (ClassDescriptor) next;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            listM = typeConstructor.getParameters();
        }
        if (listM == null) {
            listM = v.m();
        }
        if (listC0.isEmpty() && listM.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            s.j(declaredTypeParameters2, "getDeclaredTypeParameters(...)");
            return declaredTypeParameters2;
        }
        List<TypeParameterDescriptor> listP0 = v.P0(listC0, listM);
        ArrayList arrayList = new ArrayList(v.y(listP0, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : listP0) {
            s.h(typeParameterDescriptor);
            arrayList.add(e(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return v.P0(declaredTypeParameters, arrayList);
    }

    private static final PossiblyInnerType d(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i11) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i11;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> listSubList = kotlinType.getArguments().subList(i11, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, listSubList, d(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i11, kotlinType.getArguments().size()), null);
    }

    private static final a e(TypeParameterDescriptor typeParameterDescriptor, DeclarationDescriptor declarationDescriptor, int i11) {
        return new a(typeParameterDescriptor, declarationDescriptor, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(DeclarationDescriptor it) {
        s.k(it, "it");
        return it instanceof CallableDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(DeclarationDescriptor it) {
        s.k(it, "it");
        return !(it instanceof ConstructorDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(DeclarationDescriptor it) {
        s.k(it, "it");
        List<TypeParameterDescriptor> typeParameters = ((CallableDescriptor) it).getTypeParameters();
        s.j(typeParameters, "getTypeParameters(...)");
        return v.e0(typeParameters);
    }
}
