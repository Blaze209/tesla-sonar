package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import p013kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JavaPackage f87309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LazyJavaPackageFragment f87310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final NullableLazyValue<Set<String>> f87311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MemoizedFunctionToNullable<a, ClassDescriptor> f87312p;

    private static abstract class KotlinClassLookupResult {

        public static final class Found extends KotlinClassLookupResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ClassDescriptor f87313a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(ClassDescriptor descriptor) {
                super(null);
                s.k(descriptor, "descriptor");
                this.f87313a = descriptor;
            }

            public final ClassDescriptor getDescriptor() {
                return this.f87313a;
            }
        }

        public static final class NotFound extends KotlinClassLookupResult {
            public static final NotFound INSTANCE = new NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends KotlinClassLookupResult {
            public static final SyntheticClass INSTANCE = new SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private KotlinClassLookupResult() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Name f87314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JavaClass f87315b;

        public a(Name name, JavaClass javaClass) {
            s.k(name, "name");
            this.f87314a = name;
            this.f87315b = javaClass;
        }

        public final JavaClass a() {
            return this.f87315b;
        }

        public final Name b() {
            return this.f87314a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && s.f(this.f87314a, ((a) obj).f87314a);
        }

        public int hashCode() {
            return this.f87314a.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(LazyJavaResolverContext c11, JavaPackage jPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(c11);
        s.k(c11, "c");
        s.k(jPackage, "jPackage");
        s.k(ownerDescriptor, "ownerDescriptor");
        this.f87309m = jPackage;
        this.f87310n = ownerDescriptor;
        this.f87311o = c11.getStorageManager().createNullableLazyValue(new w(c11, this));
        this.f87312p = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new x(this, c11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor Y(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext, a request) {
        s.k(request, "request");
        ClassId classId = new ClassId(lazyJavaPackageScope.getOwnerDescriptor().getFqName(), request.b());
        KotlinClassFinder.Result resultFindKotlinClassOrContent = request.a() != null ? lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(request.a(), lazyJavaPackageScope.a0()) : lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId, lazyJavaPackageScope.a0());
        KotlinJvmBinaryClass kotlinJvmBinaryClass = resultFindKotlinClassOrContent != null ? resultFindKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        KotlinClassLookupResult kotlinClassLookupResultD0 = lazyJavaPackageScope.d0(kotlinJvmBinaryClass);
        if (kotlinClassLookupResultD0 instanceof KotlinClassLookupResult.Found) {
            return ((KotlinClassLookupResult.Found) kotlinClassLookupResultD0).getDescriptor();
        }
        if (kotlinClassLookupResultD0 instanceof KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(kotlinClassLookupResultD0 instanceof KotlinClassLookupResult.NotFound)) {
            throw new NoWhenBranchMatchedException();
        }
        JavaClass javaClassA = request.a();
        if (javaClassA == null) {
            JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
            KotlinClassFinder.Result.ClassFileContent classFileContent = resultFindKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) resultFindKotlinClassOrContent : null;
            javaClassA = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
        }
        JavaClass javaClass = javaClassA;
        if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
            FqName fqName = javaClass != null ? javaClass.getFqName() : null;
            if (fqName == null || fqName.isRoot() || !s.f(fqName.parent(), lazyJavaPackageScope.getOwnerDescriptor().getFqName())) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.getOwnerDescriptor(), javaClass, null, 8, null);
            lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + javaClass + "\nClassId: " + classId + "\nfindKotlinClass(JavaClass) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), javaClass, lazyJavaPackageScope.a0()) + "\nfindKotlinClass(ClassId) = " + KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageScope.a0()) + '\n');
    }

    private final ClassDescriptor Z(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set set = (Set) this.f87311o.invoke();
        if (javaClass != null || set == null || set.contains(name.asString())) {
            return (ClassDescriptor) this.f87312p.invoke(new a(name, javaClass));
        }
        return null;
    }

    private final JvmMetadataVersion a0() {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(C().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set c0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        return lazyJavaResolverContext.getComponents().getFinder().knownClassNamesInPackage(lazyJavaPackageScope.getOwnerDescriptor().getFqName());
    }

    private final KotlinClassLookupResult d0(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass == null) {
            return KotlinClassLookupResult.NotFound.INSTANCE;
        }
        if (kotlinJvmBinaryClass.getClassHeader().getKind() != KotlinClassHeader.Kind.CLASS) {
            return KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        ClassDescriptor classDescriptorResolveClass = C().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
        return classDescriptorResolveClass != null ? new KotlinClassLookupResult.Found(classDescriptorResolveClass) : KotlinClassLookupResult.NotFound.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public LazyJavaPackageFragment getOwnerDescriptor() {
        return this.f87310n;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> computeFunctionNames(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        s.k(javaClass, "javaClass");
        return Z(javaClass.getName(), javaClass);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!kindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return v.m();
        }
        Iterable iterable = (Iterable) B().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                s.j(name, "getName(...)");
                if (nameFilter.invoke(name).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> o(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return d1.d();
        }
        Set set = (Set) this.f87311o.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        JavaPackage javaPackage = this.f87309m;
        if (lVar == null) {
            lVar = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = javaPackage.getClasses(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> u(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return Z(name, null);
    }
}
