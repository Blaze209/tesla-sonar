package p013kotlin.reflect.jvm.internal.impl.load.java.lazy;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p013kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageManager f87205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaClassFinder f87206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KotlinClassFinder f87207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DeserializedDescriptorResolver f87208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SignaturePropagator f87209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ErrorReporter f87210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JavaResolverCache f87211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JavaPropertyInitializerEvaluator f87212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SamConversionResolver f87213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final JavaSourceElementFactory f87214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ModuleClassResolver f87215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PackagePartProvider f87216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SupertypeLoopChecker f87217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LookupTracker f87218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ModuleDescriptor f87219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ReflectionTypes f87220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AnnotationTypeQualifierResolver f87221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SignatureEnhancement f87222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final JavaClassesTracker f87223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JavaResolverSettings f87224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final NewKotlinTypeChecker f87225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final JavaTypeEnhancementState f87226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final JavaModuleAnnotationsProvider f87227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SyntheticJavaPartsProvider f87228x;

    public JavaResolverComponents(StorageManager storageManager, JavaClassFinder finder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory sourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor module, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings settings, NewKotlinTypeChecker kotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleResolver, SyntheticJavaPartsProvider syntheticPartsProvider) {
        s.k(storageManager, "storageManager");
        s.k(finder, "finder");
        s.k(kotlinClassFinder, "kotlinClassFinder");
        s.k(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        s.k(signaturePropagator, "signaturePropagator");
        s.k(errorReporter, "errorReporter");
        s.k(javaResolverCache, "javaResolverCache");
        s.k(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        s.k(samConversionResolver, "samConversionResolver");
        s.k(sourceElementFactory, "sourceElementFactory");
        s.k(moduleClassResolver, "moduleClassResolver");
        s.k(packagePartProvider, "packagePartProvider");
        s.k(supertypeLoopChecker, "supertypeLoopChecker");
        s.k(lookupTracker, "lookupTracker");
        s.k(module, "module");
        s.k(reflectionTypes, "reflectionTypes");
        s.k(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        s.k(signatureEnhancement, "signatureEnhancement");
        s.k(javaClassesTracker, "javaClassesTracker");
        s.k(settings, "settings");
        s.k(kotlinTypeChecker, "kotlinTypeChecker");
        s.k(javaTypeEnhancementState, "javaTypeEnhancementState");
        s.k(javaModuleResolver, "javaModuleResolver");
        s.k(syntheticPartsProvider, "syntheticPartsProvider");
        this.f87205a = storageManager;
        this.f87206b = finder;
        this.f87207c = kotlinClassFinder;
        this.f87208d = deserializedDescriptorResolver;
        this.f87209e = signaturePropagator;
        this.f87210f = errorReporter;
        this.f87211g = javaResolverCache;
        this.f87212h = javaPropertyInitializerEvaluator;
        this.f87213i = samConversionResolver;
        this.f87214j = sourceElementFactory;
        this.f87215k = moduleClassResolver;
        this.f87216l = packagePartProvider;
        this.f87217m = supertypeLoopChecker;
        this.f87218n = lookupTracker;
        this.f87219o = module;
        this.f87220p = reflectionTypes;
        this.f87221q = annotationTypeQualifierResolver;
        this.f87222r = signatureEnhancement;
        this.f87223s = javaClassesTracker;
        this.f87224t = settings;
        this.f87225u = kotlinTypeChecker;
        this.f87226v = javaTypeEnhancementState;
        this.f87227w = javaModuleResolver;
        this.f87228x = syntheticPartsProvider;
    }

    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f87221q;
    }

    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.f87208d;
    }

    public final ErrorReporter getErrorReporter() {
        return this.f87210f;
    }

    public final JavaClassFinder getFinder() {
        return this.f87206b;
    }

    public final JavaClassesTracker getJavaClassesTracker() {
        return this.f87223s;
    }

    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.f87227w;
    }

    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.f87212h;
    }

    public final JavaResolverCache getJavaResolverCache() {
        return this.f87211g;
    }

    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.f87226v;
    }

    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f87207c;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f87225u;
    }

    public final LookupTracker getLookupTracker() {
        return this.f87218n;
    }

    public final ModuleDescriptor getModule() {
        return this.f87219o;
    }

    public final ModuleClassResolver getModuleClassResolver() {
        return this.f87215k;
    }

    public final PackagePartProvider getPackagePartProvider() {
        return this.f87216l;
    }

    public final ReflectionTypes getReflectionTypes() {
        return this.f87220p;
    }

    public final JavaResolverSettings getSettings() {
        return this.f87224t;
    }

    public final SignatureEnhancement getSignatureEnhancement() {
        return this.f87222r;
    }

    public final SignaturePropagator getSignaturePropagator() {
        return this.f87209e;
    }

    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.f87214j;
    }

    public final StorageManager getStorageManager() {
        return this.f87205a;
    }

    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.f87217m;
    }

    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.f87228x;
    }

    public final JavaResolverComponents replace(JavaResolverCache javaResolverCache) {
        s.k(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f87205a, this.f87206b, this.f87207c, this.f87208d, this.f87209e, this.f87210f, javaResolverCache, this.f87212h, this.f87213i, this.f87214j, this.f87215k, this.f87216l, this.f87217m, this.f87218n, this.f87219o, this.f87220p, this.f87221q, this.f87222r, this.f87223s, this.f87224t, this.f87225u, this.f87226v, this.f87227w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i11 & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }
}
