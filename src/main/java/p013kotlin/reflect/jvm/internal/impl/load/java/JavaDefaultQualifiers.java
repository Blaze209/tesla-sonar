package p013kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NullabilityQualifierWithMigrationStatus f87078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection<AnnotationQualifierApplicabilityType> f87079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87080c;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z11) {
        s.k(nullabilityQualifier, "nullabilityQualifier");
        s.k(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f87078a = nullabilityQualifier;
        this.f87079b = qualifierApplicabilityTypes;
        this.f87080c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f87078a;
        }
        if ((i11 & 2) != 0) {
            collection = javaDefaultQualifiers.f87079b;
        }
        if ((i11 & 4) != 0) {
            z11 = javaDefaultQualifiers.f87080c;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z11);
    }

    public final JavaDefaultQualifiers copy(NullabilityQualifierWithMigrationStatus nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z11) {
        s.k(nullabilityQualifier, "nullabilityQualifier");
        s.k(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifier, qualifierApplicabilityTypes, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return s.f(this.f87078a, javaDefaultQualifiers.f87078a) && s.f(this.f87079b, javaDefaultQualifiers.f87079b) && this.f87080c == javaDefaultQualifiers.f87080c;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f87080c;
    }

    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.f87078a;
    }

    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.f87079b;
    }

    public int hashCode() {
        return (((this.f87078a.hashCode() * 31) + this.f87079b.hashCode()) * 31) + Boolean.hashCode(this.f87080c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f87078a + ", qualifierApplicabilityTypes=" + this.f87079b + ", definitelyNotNull=" + this.f87080c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i11 & 4) != 0 ? nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL : z11);
    }
}
