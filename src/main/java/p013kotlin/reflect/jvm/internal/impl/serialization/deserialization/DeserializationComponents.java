package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageManager f88596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f88597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeserializationConfiguration f88598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClassDataFinder f88599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> f88600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PackageFragmentProvider f88601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LocalClassifierTypeSettings f88602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ErrorReporter f88603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LookupTracker f88604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final FlexibleTypeDeserializer f88605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Iterable<ClassDescriptorFactory> f88606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final NotFoundClasses f88607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ContractDeserializer f88608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AdditionalClassPartsProvider f88609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final PlatformDependentDeclarationFilter f88610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ExtensionRegistryLite f88611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final NewKotlinTypeChecker f88612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SamConversionResolver f88613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List<TypeAttributeTranslator> f88614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EnumEntriesDeserializationSupport f88615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ClassDeserializer f88616u;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable<? extends ClassDescriptorFactory> fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver, List<? extends TypeAttributeTranslator> typeAttributeTranslators, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        s.k(storageManager, "storageManager");
        s.k(moduleDescriptor, "moduleDescriptor");
        s.k(configuration, "configuration");
        s.k(classDataFinder, "classDataFinder");
        s.k(annotationAndConstantLoader, "annotationAndConstantLoader");
        s.k(packageFragmentProvider, "packageFragmentProvider");
        s.k(localClassifierTypeSettings, "localClassifierTypeSettings");
        s.k(errorReporter, "errorReporter");
        s.k(lookupTracker, "lookupTracker");
        s.k(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        s.k(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(contractDeserializer, "contractDeserializer");
        s.k(additionalClassPartsProvider, "additionalClassPartsProvider");
        s.k(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.k(extensionRegistryLite, "extensionRegistryLite");
        s.k(kotlinTypeChecker, "kotlinTypeChecker");
        s.k(samConversionResolver, "samConversionResolver");
        s.k(typeAttributeTranslators, "typeAttributeTranslators");
        s.k(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f88596a = storageManager;
        this.f88597b = moduleDescriptor;
        this.f88598c = configuration;
        this.f88599d = classDataFinder;
        this.f88600e = annotationAndConstantLoader;
        this.f88601f = packageFragmentProvider;
        this.f88602g = localClassifierTypeSettings;
        this.f88603h = errorReporter;
        this.f88604i = lookupTracker;
        this.f88605j = flexibleTypeDeserializer;
        this.f88606k = fictitiousClassDescriptorFactories;
        this.f88607l = notFoundClasses;
        this.f88608m = contractDeserializer;
        this.f88609n = additionalClassPartsProvider;
        this.f88610o = platformDependentDeclarationFilter;
        this.f88611p = extensionRegistryLite;
        this.f88612q = kotlinTypeChecker;
        this.f88613r = samConversionResolver;
        this.f88614s = typeAttributeTranslators;
        this.f88615t = enumEntriesDeserializationSupport;
        this.f88616u = new ClassDeserializer(this);
    }

    public final DeserializationContext createContext(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        s.k(descriptor, "descriptor");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        s.k(versionRequirementTable, "versionRequirementTable");
        s.k(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, v.m());
    }

    public final ClassDescriptor deserializeClass(ClassId classId) {
        s.k(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.f88616u, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.f88609n;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.f88600e;
    }

    public final ClassDataFinder getClassDataFinder() {
        return this.f88599d;
    }

    public final ClassDeserializer getClassDeserializer() {
        return this.f88616u;
    }

    public final DeserializationConfiguration getConfiguration() {
        return this.f88598c;
    }

    public final ContractDeserializer getContractDeserializer() {
        return this.f88608m;
    }

    public final EnumEntriesDeserializationSupport getEnumEntriesDeserializationSupport() {
        return this.f88615t;
    }

    public final ErrorReporter getErrorReporter() {
        return this.f88603h;
    }

    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.f88611p;
    }

    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.f88606k;
    }

    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.f88605j;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f88612q;
    }

    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.f88602g;
    }

    public final LookupTracker getLookupTracker() {
        return this.f88604i;
    }

    public final ModuleDescriptor getModuleDescriptor() {
        return this.f88597b;
    }

    public final NotFoundClasses getNotFoundClasses() {
        return this.f88607l;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.f88601f;
    }

    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.f88610o;
    }

    public final StorageManager getStorageManager() {
        return this.f88596a;
    }

    public final List<TypeAttributeTranslator> getTypeAttributeTranslators() {
        return this.f88614s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i11 & PKIFailureInfo.certRevoked) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i11 & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i11) != 0 ? NewKotlinTypeChecker.Companion.getDefault() : newKotlinTypeChecker, samConversionResolver, (262144 & i11) != 0 ? v.e(DefaultTypeAttributeTranslator.INSTANCE) : list, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }
}
