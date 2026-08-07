package p013kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import co0.g;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTypeEnhancementState {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final JavaTypeEnhancementState f87099d = new JavaTypeEnhancementState(JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings$default(null, 1, null), a.f87103a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Jsr305Settings f87100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<FqName, ReportLevel> f87101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f87102c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaTypeEnhancementState getDEFAULT() {
            return JavaTypeEnhancementState.f87099d;
        }

        private Companion() {
        }
    }

    /* synthetic */ class a extends o implements l<FqName, ReportLevel> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87103a = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportLevel invoke(FqName p11) {
            s.k(p11, "p0");
            return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.d(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(Jsr305Settings jsr305, l<? super FqName, ? extends ReportLevel> getReportLevelForAnnotation) {
        s.k(jsr305, "jsr305");
        s.k(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f87100a = jsr305;
        this.f87101b = getReportLevelForAnnotation;
        this.f87102c = jsr305.isDisabled() || getReportLevelForAnnotation.invoke(JavaNullabilityAnnotationSettingsKt.getJSPECIFY_ANNOTATIONS_PACKAGE()) == ReportLevel.IGNORE;
    }

    public final boolean getDisabledDefaultAnnotations() {
        return this.f87102c;
    }

    public final l<FqName, ReportLevel> getGetReportLevelForAnnotation() {
        return this.f87101b;
    }

    public final Jsr305Settings getJsr305() {
        return this.f87100a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f87100a + ", getReportLevelForAnnotation=" + this.f87101b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
