package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ch.qos.logback.core.CoreConstants;
import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.x;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86650i = {o0.k(new f0(o0.b(JvmBuiltInsCustomizer.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), o0.k(new f0(o0.b(JvmBuiltInsCustomizer.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), o0.k(new f0(o0.b(JvmBuiltInsCustomizer.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleDescriptor f86651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaToKotlinClassMapper f86652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f86653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KotlinType f86654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue f86655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CacheWithNotNullValues<FqName, ClassDescriptor> f86656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f86657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Pair<String, String>, Annotations> f86658h;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    public JvmBuiltInsCustomizer(ModuleDescriptor moduleDescriptor, StorageManager storageManager, wn0.a<JvmBuiltIns.Settings> settingsComputation) {
        s.k(moduleDescriptor, "moduleDescriptor");
        s.k(storageManager, "storageManager");
        s.k(settingsComputation, "settingsComputation");
        this.f86651a = moduleDescriptor;
        this.f86652b = JavaToKotlinClassMapper.INSTANCE;
        this.f86653c = storageManager.createLazyValue(settingsComputation);
        this.f86654d = l(storageManager);
        this.f86655e = storageManager.createLazyValue(new f(this, storageManager));
        this.f86656f = storageManager.createCacheWithNotNullValues();
        this.f86657g = storageManager.createLazyValue(new g(this));
        this.f86658h = storageManager.createMemoizedFunction(new h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public static final Boolean A(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z11;
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION) {
            JavaToKotlinClassMapper javaToKotlinClassMapper = jvmBuiltInsCustomizer.f86652b;
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (javaToKotlinClassMapper.isMutable((ClassDescriptor) containingDeclaration)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    private final boolean B(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.getValueParameters().size() != 1) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((ValueParameterDescriptor) v.U0(valueParameters)).getType().getConstructor().mo500getDeclarationDescriptor();
        return s.f(classifierDescriptorMo500getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo500getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations C(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        return Annotations.Companion.create(v.e(AnnotationUtilKt.createDeprecatedAnnotation$default(jvmBuiltInsCustomizer.f86651a.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType j(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(jvmBuiltInsCustomizer.x().getOwnerModuleDescriptor(), JvmBuiltInClassDescriptorFactory.Companion.getCLONEABLE_CLASS_ID(), new NotFoundClasses(storageManager, jvmBuiltInsCustomizer.x().getOwnerModuleDescriptor())).getDefaultType();
    }

    private final SimpleFunctionDescriptor k(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
        copyBuilderNewCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
        copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
        s.h(functionDescriptorBuild);
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    private final KotlinType l(StorageManager storageManager) {
        final ModuleDescriptor moduleDescriptor = this.f86651a;
        final FqName fqName = new FqName("java.io");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new PackageFragmentDescriptorImpl(moduleDescriptor, fqName) { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1
            @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
            public MemberScope.Empty getMemberScope() {
                return MemberScope.Empty.INSTANCE;
            }
        }, Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, v.e(new LazyWrappedType(storageManager, new i(this))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, d1.d(), null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType m(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        SimpleType anyType = jvmBuiltInsCustomizer.f86651a.getBuiltIns().getAnyType();
        s.j(anyType, "getAnyType(...)");
        return anyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Annotations n(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, Pair pair) {
        s.k(pair, "<destruct>");
        String str = (String) pair.a();
        String str2 = (String) pair.b();
        return Annotations.Companion.create(v.e(AnnotationUtilKt.createDeprecatedAnnotation(jvmBuiltInsCustomizer.f86651a.getBuiltIns(), CoreConstants.SINGLE_QUOTE_CHAR + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection<SimpleFunctionDescriptor> o(ClassDescriptor classDescriptor, l<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        LazyJavaClassDescriptor lazyJavaClassDescriptorT = t(classDescriptor);
        if (lazyJavaClassDescriptorT == null) {
            return v.m();
        }
        Collection<ClassDescriptor> collectionMapPlatformClass = this.f86652b.mapPlatformClass(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorT), FallbackBuiltIns.f86616g.getInstance());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) v.B0(collectionMapPlatformClass);
        if (classDescriptor2 == null) {
            return v.m();
        }
        SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(v.y(collectionMapPlatformClass, 10));
        Iterator<T> it = collectionMapPlatformClass.iterator();
        while (it.hasNext()) {
            arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it.next()));
        }
        SmartSet smartSetCreate = companion.create(arrayList);
        boolean zIsMutable = this.f86652b.isMutable(classDescriptor);
        MemberScope unsubstitutedMemberScope = this.f86656f.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorT), new k(lazyJavaClassDescriptorT, classDescriptor2)).getUnsubstitutedMemberScope();
        s.j(unsubstitutedMemberScope, "getUnsubstitutedMemberScope(...)");
        Collection<? extends SimpleFunctionDescriptor> collectionInvoke = lVar.invoke(unsubstitutedMemberScope);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionInvoke) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (simpleFunctionDescriptor.getKind() == CallableMemberDescriptor.Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
                Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            DeclarationDescriptor containingDeclaration = ((FunctionDescriptor) it2.next()).getContainingDeclaration();
                            s.j(containingDeclaration, "getContainingDeclaration(...)");
                            if (smartSetCreate.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                            }
                        }
                    }
                }
                if (!y(simpleFunctionDescriptor, zIsMutable)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor p(LazyJavaClassDescriptor lazyJavaClassDescriptor, ClassDescriptor classDescriptor) {
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        s.j(EMPTY, "EMPTY");
        return lazyJavaClassDescriptor.copy$descriptors_jvm(EMPTY, classDescriptor);
    }

    private final SimpleType q() {
        return (SimpleType) StorageKt.getValue(this.f86655e, this, (m<?>) f86650i[1]);
    }

    private static final boolean r(ConstructorDescriptor constructorDescriptor, TypeSubstitutor typeSubstitutor, ConstructorDescriptor constructorDescriptor2) {
        return OverridingUtil.getBothWaysOverridability(constructorDescriptor, constructorDescriptor2.substitute(typeSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection s(Name name, MemberScope it) {
        s.k(it, "it");
        return it.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
    }

    private final LazyJavaClassDescriptor t(ClassDescriptor classDescriptor) {
        ClassId classIdMapKotlinToJava;
        FqName fqNameAsSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (fqNameUnsafe.isSafe() && (classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) != null) {
            ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(x().getOwnerModuleDescriptor(), fqNameAsSingleFqName, NoLookupLocation.FROM_BUILTINS);
            if (classDescriptorResolveClassByFqName instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorResolveClassByFqName;
            }
        }
        return null;
    }

    private final a u(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        final String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        final n0 n0Var = new n0();
        Object objDfs = DFS.dfs(v.e((ClassDescriptor) containingDeclaration), new n(this), new DFS.AbstractNodeHandler<ClassDescriptor, a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
            /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a] */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(ClassDescriptor javaClassDescriptor) {
                s.k(javaClassDescriptor, "javaClassDescriptor");
                String strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaClassDescriptor, strComputeJvmDescriptor$default);
                JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                if (jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(strSignature)) {
                    n0Var.f86529a = JvmBuiltInsCustomizer.a.HIDDEN;
                } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
                    n0Var.f86529a = JvmBuiltInsCustomizer.a.VISIBLE;
                } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
                    n0Var.f86529a = JvmBuiltInsCustomizer.a.DEPRECATED_LIST_METHODS;
                } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                    n0Var.f86529a = JvmBuiltInsCustomizer.a.DROP;
                }
                return n0Var.f86529a == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public JvmBuiltInsCustomizer.a result() {
                JvmBuiltInsCustomizer.a aVar = n0Var.f86529a;
                return aVar == null ? JvmBuiltInsCustomizer.a.NOT_CONSIDERED : aVar;
            }
        });
        s.j(objDfs, "dfs(...)");
        return (a) objDfs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable v(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, ClassDescriptor classDescriptor) {
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((KotlinType) it.next()).getConstructor().mo500getDeclarationDescriptor();
            ClassDescriptor classDescriptorT = null;
            ClassifierDescriptor original = classifierDescriptorMo500getDeclarationDescriptor != null ? classifierDescriptorMo500getDeclarationDescriptor.getOriginal() : null;
            ClassDescriptor classDescriptor2 = original instanceof ClassDescriptor ? (ClassDescriptor) original : null;
            if (classDescriptor2 != null && (classDescriptorT = jvmBuiltInsCustomizer.t(classDescriptor2)) == null) {
                classDescriptorT = classDescriptor2;
            }
            if (classDescriptorT != null) {
                arrayList.add(classDescriptorT);
            }
        }
        return arrayList;
    }

    private final Annotations w() {
        return (Annotations) StorageKt.getValue(this.f86657g, this, (m<?>) f86650i[2]);
    }

    private final JvmBuiltIns.Settings x() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.f86653c, this, (m<?>) f86650i[0]);
    }

    private final boolean y(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z11) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        if (z11 ^ JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration, strComputeJvmDescriptor$default))) {
            return true;
        }
        Boolean boolIfAny = DFS.ifAny(v.e(simpleFunctionDescriptor), l.f86686a, new m(this));
        s.j(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable z(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getOriginal().getOverriddenDescriptors();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
        s.k(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !x().isAdditionalBuiltInsFeatureSupported()) {
            return v.m();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorT = t(classDescriptor);
        if (lazyJavaClassDescriptorT == null) {
            return v.m();
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.f86652b, DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorT), FallbackBuiltIns.f86616g.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return v.m();
        }
        TypeSubstitutor typeSubstitutorBuildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, lazyJavaClassDescriptorT).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = lazyJavaClassDescriptorT.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                s.j(constructors2, "getConstructors(...)");
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ClassConstructorDescriptor classConstructorDescriptor2 = (ClassConstructorDescriptor) it.next();
                            s.h(classConstructorDescriptor2);
                            if (r(classConstructorDescriptor2, typeSubstitutorBuildSubstitutor, classConstructorDescriptor)) {
                            }
                        }
                    }
                }
                if (!B(classConstructorDescriptor, classDescriptor) && !KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorT, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderNewCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorT, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations(w());
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            s.i(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
        Annotations annotations;
        s.k(name, "name");
        s.k(classDescriptor, "classDescriptor");
        if (s.f(name, CloneableClassScope.Companion.getCLONE_NAME()) && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            s.j(functionList, "getFunctionList(...)");
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (s.f(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return v.m();
                    }
                }
            }
            return v.e(k(deserializedClassDescriptor, (SimpleFunctionDescriptor) v.T0(q().getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))));
        }
        if (!x().isAdditionalBuiltInsFeatureSupported()) {
            return v.m();
        }
        Collection<SimpleFunctionDescriptor> collectionO = o(classDescriptor, new j(name));
        ArrayList arrayList = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collectionO) {
            DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
            s.i(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration, classDescriptor).buildSubstitutor());
            s.i(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            int i11 = WhenMappings.$EnumSwitchMapping$0[u(simpleFunctionDescriptor).ordinal()];
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = null;
            if (i11 != 1) {
                if (i11 == 2) {
                    Name name2 = simpleFunctionDescriptor.getName();
                    if (s.f(name2, JvmBuiltInsCustomizerKt.f86661a)) {
                        annotations = (Annotations) this.f86658h.invoke(x.a(simpleFunctionDescriptor.getName().asString(), "first"));
                    } else {
                        if (!s.f(name2, JvmBuiltInsCustomizerKt.f86662b)) {
                            throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor.getName()).toString());
                        }
                        annotations = (Annotations) this.f86658h.invoke(x.a(simpleFunctionDescriptor.getName().asString(), "last"));
                    }
                    copyBuilderNewCopyBuilder.setAdditionalAnnotations(annotations);
                } else if (i11 == 3) {
                    copyBuilderNewCopyBuilder.setAdditionalAnnotations(w());
                } else if (i11 != 4) {
                    if (i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f84049a;
                }
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                s.h(functionDescriptorBuild);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
            } else if (!ModalityUtilsKt.isFinalClass(classDescriptor)) {
                copyBuilderNewCopyBuilder.setHiddenForResolutionEverywhereBesideSupercalls();
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderNewCopyBuilder.build();
                s.h(functionDescriptorBuild2);
                simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            }
            if (simpleFunctionDescriptor2 != null) {
                arrayList.add(simpleFunctionDescriptor2);
            }
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
        s.k(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        if (jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return v.p(q(), this.f86654d);
        }
        return jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? v.e(this.f86654d) : v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor functionDescriptor) {
        s.k(classDescriptor, "classDescriptor");
        s.k(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorT = t(classDescriptor);
        if (lazyJavaClassDescriptorT == null || !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!x().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = lazyJavaClassDescriptorT.getUnsubstitutedMemberScope();
        Name name = functionDescriptor.getName();
        s.j(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if ((contributedFunctions instanceof Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator<T> it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (s.f(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    public Set<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        s.k(classDescriptor, "classDescriptor");
        if (!x().isAdditionalBuiltInsFeatureSupported()) {
            return d1.d();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorT = t(classDescriptor);
        return (lazyJavaClassDescriptorT == null || (unsubstitutedMemberScope = lazyJavaClassDescriptorT.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? d1.d() : functionNames;
    }
}
