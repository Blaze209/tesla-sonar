package p013kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class SpecialJvmAnnotations {
    public static final SpecialJvmAnnotations INSTANCE = new SpecialJvmAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<ClassId> f86547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ClassId f86548b;

    static {
        List listP = v.p(JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, JvmAnnotationNames.TARGET_ANNOTATION, JvmAnnotationNames.RETENTION_ANNOTATION, JvmAnnotationNames.DOCUMENTED_ANNOTATION);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClassId.Companion companion = ClassId.Companion;
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(companion.topLevel((FqName) it.next()));
        }
        f86547a = linkedHashSet;
        ClassId.Companion companion2 = ClassId.Companion;
        FqName REPEATABLE_ANNOTATION = JvmAnnotationNames.REPEATABLE_ANNOTATION;
        s.j(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f86548b = companion2.topLevel(REPEATABLE_ANNOTATION);
    }

    private SpecialJvmAnnotations() {
    }

    public final ClassId getJAVA_LANG_ANNOTATION_REPEATABLE() {
        return f86548b;
    }

    public final Set<ClassId> getSPECIAL_ANNOTATIONS() {
        return f86547a;
    }

    public final boolean isAnnotatedWithContainerMetaAnnotation(KotlinJvmBinaryClass klass) {
        s.k(klass, "klass");
        final j0 j0Var = new j0();
        klass.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations.isAnnotatedWithContainerMetaAnnotation.1
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source) {
                s.k(classId, "classId");
                s.k(source, "source");
                if (!s.f(classId, JvmAbi.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
                    return null;
                }
                j0Var.f86523a = true;
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, null);
        return j0Var.f86523a;
    }
}
