package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class UtilsKt {
    public static final AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard(LazyJavaResolverContext c11, JavaWildcardType wildcardType) {
        AnnotationDescriptor next;
        s.k(c11, "c");
        s.k(wildcardType, "wildcardType");
        if (wildcardType.getBound() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<AnnotationDescriptor> it = new LazyJavaAnnotations(c11, wildcardType, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            AnnotationDescriptor annotationDescriptor = next;
            for (FqName fqName : JavaNullabilityAnnotationSettingsKt.getRXJAVA3_ANNOTATIONS()) {
                if (s.f(annotationDescriptor.getFqName(), fqName)) {
                    return next;
                }
            }
        }
        next = null;
        return next;
    }

    public static final boolean hasErasedValueParameters(CallableMemberDescriptor memberDescriptor) {
        s.k(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof FunctionDescriptor) && s.f(memberDescriptor.getUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS), Boolean.TRUE);
    }

    public static final boolean isJspecifyEnabledInStrictMode(JavaTypeEnhancementState javaTypeEnhancementState) {
        s.k(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.STRICT;
    }

    public static final DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        s.k(visibility, "<this>");
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.toDescriptorVisibility(visibility);
        s.j(descriptorVisibility, "toDescriptorVisibility(...)");
        return descriptorVisibility;
    }
}
