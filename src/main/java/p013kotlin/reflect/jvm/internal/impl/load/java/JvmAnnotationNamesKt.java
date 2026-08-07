package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.collections.d1;
import p013kotlin.collections.v0;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FqName f87112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final FqName f87113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FqName f87114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FqName f87115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FqName f87116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final FqName f87117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FqName f87118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final FqName f87119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FqName f87120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final FqName f87121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final FqName f87122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final FqName f87123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final FqName f87124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FqName f87125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final FqName f87126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final FqName f87127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Set<FqName> f87128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<FqName> f87129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<FqName> f87130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<FqName> f87131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set<FqName> f87132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set<FqName> f87133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Set<FqName> f87134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<FqName, FqName> f87135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final FqName f87136y;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f87112a = fqName;
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f87113b = fqName2;
        FqName fqName3 = new FqName("org.jspecify.nullness.NullnessUnspecified");
        f87114c = fqName3;
        FqName fqName4 = new FqName("org.jspecify.annotations.NonNull");
        f87115d = fqName4;
        FqName fqName5 = new FqName("org.jspecify.annotations.Nullable");
        f87116e = fqName5;
        FqName fqName6 = new FqName("org.jspecify.annotations.NullMarked");
        f87117f = fqName6;
        FqName fqName7 = new FqName("org.jspecify.annotations.NullnessUnspecified");
        f87118g = fqName7;
        FqName fqName8 = new FqName("org.jspecify.annotations.NullUnmarked");
        f87119h = fqName8;
        f87120i = new FqName("javax.annotation.meta.TypeQualifier");
        f87121j = new FqName("javax.annotation.meta.TypeQualifierNickname");
        f87122k = new FqName("javax.annotation.meta.TypeQualifierDefault");
        FqName fqName9 = new FqName("javax.annotation.Nonnull");
        f87123l = fqName9;
        FqName fqName10 = new FqName("javax.annotation.Nullable");
        f87124m = fqName10;
        FqName fqName11 = new FqName("javax.annotation.CheckForNull");
        f87125n = fqName11;
        f87126o = new FqName("javax.annotation.ParametersAreNonnullByDefault");
        f87127p = new FqName("javax.annotation.ParametersAreNullableByDefault");
        f87128q = d1.i(fqName9, fqName11);
        Set<FqName> setI = d1.i(JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, fqName4, new FqName("android.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.RecentlyNonNull"), new FqName("androidx.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("lombok.NonNull"));
        f87129r = setI;
        Set<FqName> setI2 = d1.i(JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, fqName, fqName5, fqName10, fqName11, new FqName("android.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.RecentlyNullable"), new FqName("androidx.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"));
        f87130s = setI2;
        f87131t = d1.i(fqName3, fqName7);
        f87132u = d1.o(d1.o(d1.o(d1.o(d1.n(d1.n(new LinkedHashSet(), setI), setI2), fqName9), fqName2), fqName6), fqName8);
        f87133v = d1.i(JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION);
        f87134w = d1.i(JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION);
        f87135x = v0.m(x.a(JvmAnnotationNames.TARGET_ANNOTATION, StandardNames.FqNames.target), x.a(JvmAnnotationNames.RETENTION_ANNOTATION, StandardNames.FqNames.retention), x.a(JvmAnnotationNames.DEPRECATED_ANNOTATION, StandardNames.FqNames.deprecated), x.a(JvmAnnotationNames.DOCUMENTED_ANNOTATION, StandardNames.FqNames.mustBeDocumented));
        f87136y = new FqName("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<FqName> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return f87128q;
    }

    public static final Set<FqName> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return f87131t;
    }

    public static final FqName getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return f87123l;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return f87126o;
    }

    public static final FqName getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return f87127p;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return f87120i;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return f87122k;
    }

    public static final FqName getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return f87121j;
    }

    public static final FqName getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f87117f;
    }

    public static final FqName getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return f87119h;
    }

    public static final FqName getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return f87113b;
    }

    public static final Set<FqName> getMUTABLE_ANNOTATIONS() {
        return f87134w;
    }

    public static final Set<FqName> getNOT_NULL_ANNOTATIONS() {
        return f87129r;
    }

    public static final Set<FqName> getNULLABLE_ANNOTATIONS() {
        return f87130s;
    }

    public static final Set<FqName> getREAD_ONLY_ANNOTATIONS() {
        return f87133v;
    }

    public static final FqName getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return f87136y;
    }
}
