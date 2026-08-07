package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaDefaultQualifiersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f87081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<AnnotationQualifierApplicabilityType> f87082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f87083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f87084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<FqName, JavaDefaultQualifiers> f87085e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listP = v.p(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f87081a = listP;
        List<AnnotationQualifierApplicabilityType> listE = v.e(annotationQualifierApplicabilityType3);
        f87082b = listE;
        FqName jspecify_old_null_marked_annotation_fq_name = JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<FqName, JavaDefaultQualifiers> mapM = v0.m(x.a(jspecify_old_null_marked_annotation_fq_name, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), x.a(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listP, false)), x.a(JvmAnnotationNamesKt.getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), listP, false, 4, null)));
        f87083c = mapM;
        Map<FqName, JavaDefaultQualifiers> mapM2 = v0.m(x.a(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), listE, false, 4, null)), x.a(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), listE, false, 4, null)));
        f87084d = mapM2;
        f87085e = v0.r(mapM, mapM2);
    }

    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return f87085e;
    }

    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return f87083c;
    }
}
