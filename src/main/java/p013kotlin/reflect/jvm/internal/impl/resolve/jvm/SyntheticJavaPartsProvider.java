package p013kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public interface SyntheticJavaPartsProvider {
    public static final Companion Companion = Companion.f88494a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f88494a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final CompositeSyntheticJavaPartsProvider f88495b = new CompositeSyntheticJavaPartsProvider(v.m());

        private Companion() {
        }

        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return f88495b;
        }
    }

    void generateConstructors(ClassDescriptor classDescriptor, List<ClassConstructorDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);

    void generateMethods(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    void generateNestedClass(ClassDescriptor classDescriptor, Name name, List<ClassDescriptor> list, LazyJavaResolverContext lazyJavaResolverContext);

    void generateStaticFunctions(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getMethodNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getNestedClassNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    List<Name> getStaticFunctionNames(ClassDescriptor classDescriptor, LazyJavaResolverContext lazyJavaResolverContext);

    PropertyDescriptorImpl modifyField(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptorImpl, LazyJavaResolverContext lazyJavaResolverContext);
}
