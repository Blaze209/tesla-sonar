package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87300o = {o0.k(new f0(o0.b(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), o0.k(new f0(o0.b(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JavaPackage f87301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LazyJavaResolverContext f87302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JvmMetadataVersion f87303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue f87304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final JvmPackageScope f87305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final NotNullLazyValue<List<FqName>> f87306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Annotations f87307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final NotNullLazyValue f87308n;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(LazyJavaResolverContext outerContext, JavaPackage jPackage) {
        super(outerContext.getModule(), jPackage.getFqName());
        s.k(outerContext, "outerContext");
        s.k(jPackage, "jPackage");
        this.f87301g = jPackage;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, null, 0, 6, null);
        this.f87302h = lazyJavaResolverContextChildForClassOrPackage$default;
        this.f87303i = DeserializationHelpersKt.jvmMetadataVersionOrDefault(outerContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.f87304j = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new t(this));
        this.f87305k = new JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, jPackage, this);
        this.f87306l = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new u(this), v.m());
        this.f87307m = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jPackage);
        this.f87308n = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e(LazyJavaPackageFragment lazyJavaPackageFragment) {
        PackagePartProvider packagePartProvider = lazyJavaPackageFragment.f87302h.getComponents().getPackagePartProvider();
        String strAsString = lazyJavaPackageFragment.getFqName().asString();
        s.j(strAsString, "asString(...)");
        List<String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
        ArrayList arrayList = new ArrayList();
        for (String str : listFindPackageParts) {
            ClassId.Companion companion = ClassId.Companion;
            FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
            s.j(fqNameForTopLevelClassMaybeWithDollars, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f87302h.getComponents().getKotlinClassFinder(), companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), lazyJavaPackageFragment.f87303i);
            Pair pairA = kotlinJvmBinaryClassFindKotlinClass != null ? x.a(str, kotlinJvmBinaryClassFindKotlinClass) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return v0.y(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap f(LazyJavaPackageFragment lazyJavaPackageFragment) {
        HashMap map = new HashMap();
        for (Map.Entry<String, KotlinJvmBinaryClass> entry : lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().entrySet()) {
            String key = entry.getKey();
            KotlinJvmBinaryClass value = entry.getValue();
            JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
            s.j(jvmClassNameByInternalName, "byInternalName(...)");
            KotlinClassHeader classHeader = value.getClassHeader();
            int i11 = WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
            if (i11 == 1) {
                String multifileClassName = classHeader.getMultifileClassName();
                if (multifileClassName != null) {
                    map.put(jvmClassNameByInternalName, JvmClassName.byInternalName(multifileClassName));
                }
            } else if (i11 == 2) {
                map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(LazyJavaPackageFragment lazyJavaPackageFragment) {
        Collection<JavaPackage> subPackages = lazyJavaPackageFragment.f87301g.getSubPackages();
        ArrayList arrayList = new ArrayList(v.y(subPackages, 10));
        Iterator<T> it = subPackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((JavaPackage) it.next()).getFqName());
        }
        return arrayList;
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass jClass) {
        s.k(jClass, "jClass");
        return this.f87305k.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(jClass);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f87307m;
    }

    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.f87304j, this, (m<?>) f87300o[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return (List) this.f87306l.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.f87302h.getComponents().getModule();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public JvmPackageScope getMemberScope() {
        return this.f87305k;
    }
}
