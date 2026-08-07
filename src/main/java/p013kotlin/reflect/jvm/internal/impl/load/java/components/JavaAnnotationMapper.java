package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import jn0.x;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaAnnotationMapper {
    public static final JavaAnnotationMapper INSTANCE = new JavaAnnotationMapper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Name f87173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Name f87174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Name f87175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<FqName, FqName> f87176d;

    static {
        Name nameIdentifier = Name.identifier("message");
        s.j(nameIdentifier, "identifier(...)");
        f87173a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("allowedTargets");
        s.j(nameIdentifier2, "identifier(...)");
        f87174b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("value");
        s.j(nameIdentifier3, "identifier(...)");
        f87175c = nameIdentifier3;
        f87176d = v0.m(x.a(StandardNames.FqNames.target, JvmAnnotationNames.TARGET_ANNOTATION), x.a(StandardNames.FqNames.retention, JvmAnnotationNames.RETENTION_ANNOTATION), x.a(StandardNames.FqNames.mustBeDocumented, JvmAnnotationNames.DOCUMENTED_ANNOTATION));
    }

    private JavaAnnotationMapper() {
    }

    public static /* synthetic */ AnnotationDescriptor mapOrResolveJavaAnnotation$default(JavaAnnotationMapper javaAnnotationMapper, JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return javaAnnotationMapper.mapOrResolveJavaAnnotation(javaAnnotation, lazyJavaResolverContext, z11);
    }

    public final AnnotationDescriptor findMappedJavaAnnotation(FqName kotlinName, JavaAnnotationOwner annotationOwner, LazyJavaResolverContext c11) {
        JavaAnnotation javaAnnotationFindAnnotation;
        s.k(kotlinName, "kotlinName");
        s.k(annotationOwner, "annotationOwner");
        s.k(c11, "c");
        if (s.f(kotlinName, StandardNames.FqNames.deprecated)) {
            FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
            s.j(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            JavaAnnotation javaAnnotationFindAnnotation2 = annotationOwner.findAnnotation(DEPRECATED_ANNOTATION);
            if (javaAnnotationFindAnnotation2 != null || annotationOwner.isDeprecatedInJavaDoc()) {
                return new JavaDeprecatedAnnotationDescriptor(javaAnnotationFindAnnotation2, c11);
            }
        }
        FqName fqName = f87176d.get(kotlinName);
        if (fqName == null || (javaAnnotationFindAnnotation = annotationOwner.findAnnotation(fqName)) == null) {
            return null;
        }
        return mapOrResolveJavaAnnotation$default(INSTANCE, javaAnnotationFindAnnotation, c11, false, 4, null);
    }

    public final Name getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm() {
        return f87173a;
    }

    public final Name getRETENTION_ANNOTATION_VALUE$descriptors_jvm() {
        return f87175c;
    }

    public final Name getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm() {
        return f87174b;
    }

    public final AnnotationDescriptor mapOrResolveJavaAnnotation(JavaAnnotation annotation, LazyJavaResolverContext c11, boolean z11) {
        s.k(annotation, "annotation");
        s.k(c11, "c");
        ClassId classId = annotation.getClassId();
        ClassId.Companion companion = ClassId.Companion;
        FqName TARGET_ANNOTATION = JvmAnnotationNames.TARGET_ANNOTATION;
        s.j(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (s.f(classId, companion.topLevel(TARGET_ANNOTATION))) {
            return new JavaTargetAnnotationDescriptor(annotation, c11);
        }
        FqName RETENTION_ANNOTATION = JvmAnnotationNames.RETENTION_ANNOTATION;
        s.j(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (s.f(classId, companion.topLevel(RETENTION_ANNOTATION))) {
            return new JavaRetentionAnnotationDescriptor(annotation, c11);
        }
        FqName DOCUMENTED_ANNOTATION = JvmAnnotationNames.DOCUMENTED_ANNOTATION;
        s.j(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (s.f(classId, companion.topLevel(DOCUMENTED_ANNOTATION))) {
            return new JavaAnnotationDescriptor(c11, annotation, StandardNames.FqNames.mustBeDocumented);
        }
        FqName DEPRECATED_ANNOTATION = JvmAnnotationNames.DEPRECATED_ANNOTATION;
        s.j(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (s.f(classId, companion.topLevel(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new LazyJavaAnnotationDescriptor(c11, annotation, z11);
    }
}
