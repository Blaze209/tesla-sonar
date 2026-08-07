package p013kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import jn0.k;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final JavaNullabilityAnnotationsStatus f87095d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReportLevel f87096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f87097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReportLevel f87098c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.f87095d;
        }

        private Companion() {
        }
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevelBefore, k kVar, ReportLevel reportLevelAfter) {
        s.k(reportLevelBefore, "reportLevelBefore");
        s.k(reportLevelAfter, "reportLevelAfter");
        this.f87096a = reportLevelBefore;
        this.f87097b = kVar;
        this.f87098c = reportLevelAfter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f87096a == javaNullabilityAnnotationsStatus.f87096a && s.f(this.f87097b, javaNullabilityAnnotationsStatus.f87097b) && this.f87098c == javaNullabilityAnnotationsStatus.f87098c;
    }

    public final ReportLevel getReportLevelAfter() {
        return this.f87098c;
    }

    public final ReportLevel getReportLevelBefore() {
        return this.f87096a;
    }

    public final k getSinceVersion() {
        return this.f87097b;
    }

    public int hashCode() {
        int iHashCode = this.f87096a.hashCode() * 31;
        k kVar = this.f87097b;
        return ((iHashCode + (kVar == null ? 0 : kVar.getVersion())) * 31) + this.f87098c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f87096a + ", sinceVersion=" + this.f87097b + ", reportLevelAfter=" + this.f87098c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, k kVar, ReportLevel reportLevel2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i11 & 2) != 0 ? new k(1, 0) : kVar, (i11 & 4) != 0 ? reportLevel : reportLevel2);
    }
}
