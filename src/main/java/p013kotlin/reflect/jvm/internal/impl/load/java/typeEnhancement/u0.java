package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p013kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import p013kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;

/* JADX INFO: loaded from: classes9.dex */
final class u0 extends AbstractSignatureParts<AnnotationDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotated f87505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f87506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f87507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AnnotationQualifierApplicabilityType f87508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87509e;

    public /* synthetic */ u0(Annotated annotated, boolean z11, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotated, z11, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i11 & 16) != 0 ? false : z12);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<AnnotationDescriptor> getAnnotations(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<AnnotationDescriptor> getContainerAnnotations() {
        Annotations annotations;
        Annotated annotated = this.f87505a;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? v.m() : annotations;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.f87508d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.f87507c.getDefaultTypeQualifiers();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getContainerIsVarargParameter() {
        Annotated annotated = this.f87505a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).getVarargElementType() != null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getEnableImprovementsInStrictMode() {
        return this.f87507c.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor((KotlinType) kotlinTypeMarker);
        if (classDescriptor != null) {
            return DescriptorUtils.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean getSkipRawTypeArguments() {
        return this.f87509e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        return KotlinBuiltIns.isArrayOrPrimitiveArray((KotlinType) kotlinTypeMarker);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isCovariant() {
        return this.f87506b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker other) {
        s.k(kotlinTypeMarker, "<this>");
        s.k(other, "other");
        return this.f87507c.getComponents().getKotlinTypeChecker().equalTypes((KotlinType) kotlinTypeMarker, (KotlinType) other);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isFromJava(TypeParameterMarker typeParameterMarker) {
        s.k(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).unwrap() instanceof NotNullTypeParameterImpl;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    protected NullabilityQualifierWithMigrationStatus l(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusCopy$default;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusCopy$default = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusCopy$default;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.getNullabilityQualifier();
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean forceWarning(AnnotationDescriptor annotationDescriptor, KotlinTypeMarker kotlinTypeMarker) {
        s.k(annotationDescriptor, "<this>");
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !getEnableImprovementsInStrictMode() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return kotlinTypeMarker != null && KotlinBuiltIns.isPrimitiveArray((KotlinType) kotlinTypeMarker) && getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor) && !this.f87507c.getComponents().getSettings().getEnhancePrimitiveArrays();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f87507c.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public KotlinType getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker) {
        s.k(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.getEnhancement((KotlinType) kotlinTypeMarker);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public TypeSystemInferenceExtensionContext getTypeSystem() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    public u0(Annotated annotated, boolean z11, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z12) {
        s.k(containerContext, "containerContext");
        s.k(containerApplicabilityType, "containerApplicabilityType");
        this.f87505a = annotated;
        this.f87506b = z11;
        this.f87507c = containerContext;
        this.f87508d = containerApplicabilityType;
        this.f87509e = z12;
    }
}
