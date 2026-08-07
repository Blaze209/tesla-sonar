package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import co0.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BuiltInsResourceLoader f88667a = new BuiltInsResourceLoader();

    /* synthetic */ class a extends o implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "loadResource";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(BuiltInsResourceLoader.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p11) {
            s.k(p11, "p0");
            return ((BuiltInsResourceLoader) this.receiver).loadResource(p11);
        }
    }

    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set<FqName> packageFqNames, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11, l<? super String, ? extends InputStream> loadResource) {
        StorageManager storageManager2 = storageManager;
        ModuleDescriptor module = moduleDescriptor;
        s.k(storageManager2, "storageManager");
        s.k(module, "module");
        s.k(packageFqNames, "packageFqNames");
        s.k(classDescriptorFactories, "classDescriptorFactories");
        s.k(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.k(additionalClassPartsProvider, "additionalClassPartsProvider");
        s.k(loadResource, "loadResource");
        Set<FqName> set = packageFqNames;
        ArrayList arrayList = new ArrayList(v.y(set, 10));
        for (FqName fqName : set) {
            String builtInsFilePath = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            InputStream inputStreamInvoke = loadResource.invoke(builtInsFilePath);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + builtInsFilePath);
            }
            ModuleDescriptor moduleDescriptor2 = module;
            storageManager2 = storageManager;
            module = moduleDescriptor2;
            arrayList.add(BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor2, inputStreamInvoke, z11));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager2, module);
        DeserializationConfiguration.Default r11 = DeserializationConfiguration.Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(module, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r12 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        s.j(DO_NOTHING, "DO_NOTHING");
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager2, moduleDescriptor, r11, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r12, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, classDescriptorFactories, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), null, new SamConversionResolverImpl(storageManager2, v.m()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor builtInsModule, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11) {
        s.k(storageManager, "storageManager");
        s.k(builtInsModule, "builtInsModule");
        s.k(classDescriptorFactories, "classDescriptorFactories");
        s.k(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.k(additionalClassPartsProvider, "additionalClassPartsProvider");
        return createBuiltInPackageFragmentProvider(storageManager, builtInsModule, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z11, new a(this.f88667a));
    }
}
