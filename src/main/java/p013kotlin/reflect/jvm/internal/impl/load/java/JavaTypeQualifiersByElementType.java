package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeQualifiersByElementType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> f87104a;

    public JavaTypeQualifiersByElementType(EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> defaultQualifiers) {
        s.k(defaultQualifiers, "defaultQualifiers");
        this.f87104a = defaultQualifiers;
    }

    public final JavaDefaultQualifiers get(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f87104a.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.f87104a;
    }
}
