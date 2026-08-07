package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;

/* JADX INFO: loaded from: classes9.dex */
public final class ContextKt {
    private static final LazyJavaResolverContext c(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, Lazy<JavaTypeQualifiersByElementType> lazy) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i11) : lazyJavaResolverContext.getTypeParameterResolver(), lazy);
    }

    public static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static final LazyJavaResolverContext childForClassOrPackage(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor containingDeclaration, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(containingDeclaration, "containingDeclaration");
        return c(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i11, m.a(p.NONE, new a(lazyJavaResolverContext, containingDeclaration)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i11);
    }

    public static final LazyJavaResolverContext childForMethod(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor containingDeclaration, JavaTypeParameterListOwner typeParameterOwner, int i11) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(typeParameterOwner, "typeParameterOwner");
        return c(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i11, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i11);
    }

    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(LazyJavaResolverContext lazyJavaResolverContext, Annotations additionalAnnotations) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), m.a(p.NONE, new b(lazyJavaResolverContext, additionalAnnotations)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType d(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return computeNewDefaultTypeQualifiers(lazyJavaResolverContext, classOrPackageFragmentDescriptor.getAnnotations());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType e(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
        return computeNewDefaultTypeQualifiers(lazyJavaResolverContext, annotations);
    }

    public static final LazyJavaResolverContext replaceComponents(LazyJavaResolverContext lazyJavaResolverContext, JavaResolverComponents components) {
        s.k(lazyJavaResolverContext, "<this>");
        s.k(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }
}
