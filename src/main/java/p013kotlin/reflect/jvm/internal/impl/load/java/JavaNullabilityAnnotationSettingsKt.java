package p013kotlin.reflect.jvm.internal.impl.load.java;

import jn0.k;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FqName f87087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FqName f87088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FqName f87089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FqName f87090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f87091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final FqName[] f87092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> f87093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final JavaNullabilityAnnotationsStatus f87094h;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        f87087a = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f87088b = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        f87089c = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        f87090d = fqName4;
        String strAsString = fqName3.asString();
        s.j(strAsString, "asString(...)");
        f87091e = strAsString;
        f87092f = new FqName[]{new FqName(strAsString + ".Nullable"), new FqName(strAsString + ".NonNull")};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pairA = x.a(fqName5, companion.getDEFAULT());
        Pair pairA2 = x.a(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair pairA3 = x.a(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair pairA4 = x.a(new FqName("android.annotation"), companion.getDEFAULT());
        Pair pairA5 = x.a(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair pairA6 = x.a(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair pairA7 = x.a(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair pairA8 = x.a(fqName4, companion.getDEFAULT());
        Pair pairA9 = x.a(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair pairA10 = x.a(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair pairA11 = x.a(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pairA12 = x.a(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairA13 = x.a(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pairA14 = x.a(new FqName("lombok"), companion.getDEFAULT());
        k kVar = new k(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f87093g = new NullabilityAnnotationStatesImpl(v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, x.a(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kVar, reportLevel2)), x.a(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new k(2, 1), reportLevel2)), x.a(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new k(1, 8), reportLevel2))));
        f87094h = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    public static final Jsr305Settings getDefaultJsr305Settings(k configuredKotlinVersion) {
        s.k(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f87094h;
        ReportLevel reportLevelBefore = (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
        return new Jsr305Settings(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = k.f84054f;
        }
        return getDefaultJsr305Settings(kVar);
    }

    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(ReportLevel globalReportLevel) {
        s.k(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static final ReportLevel getDefaultReportLevelForAnnotation(FqName annotationFqName) {
        s.k(annotationFqName, "annotationFqName");
        return getReportLevelForAnnotation$default(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return f87088b;
    }

    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return f87092f;
    }

    public static final ReportLevel getReportLevelForAnnotation(FqName annotation, NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, k configuredKotlinVersion) {
        s.k(annotation, "annotation");
        s.k(configuredReportLevels, "configuredReportLevels");
        s.k(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = f87093g.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        return (javaNullabilityAnnotationsStatus.getSinceVersion() == null || javaNullabilityAnnotationsStatus.getSinceVersion().compareTo(configuredKotlinVersion) > 0) ? javaNullabilityAnnotationsStatus.getReportLevelBefore() : javaNullabilityAnnotationsStatus.getReportLevelAfter();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, k kVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            kVar = new k(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, kVar);
    }
}
