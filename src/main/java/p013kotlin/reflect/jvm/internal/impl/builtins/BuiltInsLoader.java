package p013kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ServiceLoader;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public interface BuiltInsLoader {
    public static final Companion Companion = Companion.f86550a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f86550a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Lazy<BuiltInsLoader> f86551b = m.a(p.PUBLICATION, a.f86588a);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BuiltInsLoader a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
            s.h(serviceLoaderLoad);
            BuiltInsLoader builtInsLoader = (BuiltInsLoader) v.p0(serviceLoaderLoad);
            if (builtInsLoader != null) {
                return builtInsLoader;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final BuiltInsLoader getInstance() {
            return f86551b.getValue();
        }
    }

    PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z11);
}
