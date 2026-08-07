package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(StorageManager storageManager, KotlinClassFinder finder, ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, DeserializationConfiguration deserializationConfiguration, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        s.k(storageManager, "storageManager");
        s.k(finder, "finder");
        s.k(moduleDescriptor, "moduleDescriptor");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(additionalClassPartsProvider, "additionalClassPartsProvider");
        s.k(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.k(deserializationConfiguration, "deserializationConfiguration");
        s.k(kotlinTypeChecker, "kotlinTypeChecker");
        s.k(samConversionResolver, "samConversionResolver");
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(this);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r11 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        s.j(DO_NOTHING, "DO_NOTHING");
        h(new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, this, r11, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, v.p(new BuiltInFictitiousFunctionClassFactory(storageManager, moduleDescriptor), new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), kotlinTypeChecker, samConversionResolver, null, JvmEnumEntriesDeserializationSupport.INSTANCE, 262144, null));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    protected DeserializedPackageFragment b(FqName fqName) {
        s.k(fqName, "fqName");
        InputStream inputStreamFindBuiltInsData = e().findBuiltInsData(fqName);
        if (inputStreamFindBuiltInsData != null) {
            return BuiltInsPackageFragmentImpl.Companion.create(fqName, g(), f(), inputStreamFindBuiltInsData, false);
        }
        return null;
    }
}
