package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NullabilityQualifier f87435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87436b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier qualifier, boolean z11) {
        s.k(qualifier, "qualifier");
        this.f87435a = qualifier;
        this.f87436b = z11;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f87435a;
        }
        if ((i11 & 2) != 0) {
            z11 = nullabilityQualifierWithMigrationStatus.f87436b;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z11);
    }

    public final NullabilityQualifierWithMigrationStatus copy(NullabilityQualifier qualifier, boolean z11) {
        s.k(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f87435a == nullabilityQualifierWithMigrationStatus.f87435a && this.f87436b == nullabilityQualifierWithMigrationStatus.f87436b;
    }

    public final NullabilityQualifier getQualifier() {
        return this.f87435a;
    }

    public int hashCode() {
        return (this.f87435a.hashCode() * 31) + Boolean.hashCode(this.f87436b);
    }

    public final boolean isForWarningOnly() {
        return this.f87436b;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f87435a + ", isForWarningOnly=" + this.f87436b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i11 & 2) != 0 ? false : z11);
    }
}
