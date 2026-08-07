package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
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
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import p013kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializationComponentsForJavaKt {
    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(ModuleDescriptor module, StorageManager storageManager, NotFoundClasses notFoundClasses, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, KotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JvmMetadataVersion jvmMetadataVersion) {
        s.k(module, "module");
        s.k(storageManager, "storageManager");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        s.k(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        s.k(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        s.k(errorReporter, "errorReporter");
        s.k(jvmMetadataVersion, "jvmMetadataVersion");
        return new DeserializationComponentsForJava(storageManager, module, DeserializationConfiguration.Default.INSTANCE, new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver), BinaryClassAnnotationAndConstantLoaderImplKt.createBinaryClassAnnotationAndConstantLoader(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault(), new TypeAttributeTranslators(v.e(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(JavaClassFinder javaClassFinder, ModuleDescriptor module, StorageManager storageManager, NotFoundClasses notFoundClasses, KotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver singleModuleClassResolver, PackagePartProvider packagePartProvider) {
        s.k(javaClassFinder, "javaClassFinder");
        s.k(module, "module");
        s.k(storageManager, "storageManager");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        s.k(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        s.k(errorReporter, "errorReporter");
        s.k(javaSourceElementFactory, "javaSourceElementFactory");
        s.k(singleModuleClassResolver, "singleModuleClassResolver");
        s.k(packagePartProvider, "packagePartProvider");
        SignaturePropagator DO_NOTHING = SignaturePropagator.DO_NOTHING;
        s.j(DO_NOTHING, "DO_NOTHING");
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        s.j(EMPTY, "EMPTY");
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(storageManager, v.m());
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.INSTANCE;
        ReflectionTypes reflectionTypes = new ReflectionTypes(module, notFoundClasses);
        JavaTypeEnhancementState.Companion companion = JavaTypeEnhancementState.Companion;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(companion.getDEFAULT());
        JavaResolverSettings.Default r11 = JavaResolverSettings.Default.INSTANCE;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, doNothing, samConversionResolverImpl, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, empty, do_nothing, module, reflectionTypes, annotationTypeQualifierResolver, new SignatureEnhancement(new JavaTypeEnhancement(r11)), JavaClassesTracker.Default.INSTANCE, r11, NewKotlinTypeChecker.Companion.getDefault(), companion.getDEFAULT(), new JavaModuleAnnotationsProvider() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializationComponentsForJavaKt$makeLazyJavaPackageFragmentProvider$javaResolverComponents$1
            @Override // p013kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider
            public List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(ClassId classId) {
                s.k(classId, "classId");
                return null;
            }
        }, null, 8388608, null));
    }
}
