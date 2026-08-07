package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bo0.j;
import ho0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.m;
import mn0.a;
import p013kotlin.Lazy;
import p013kotlin.collections.d1;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.FakePureImplementationsProvider;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaClassDescriptor extends ClassDescriptorBase implements JavaClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Set<String> f87273x = d1.i("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LazyJavaResolverContext f87274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JavaClass f87275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ClassDescriptor f87276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LazyJavaResolverContext f87277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f87278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ClassKind f87279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Modality f87280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Visibility f87281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f87282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a f87283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LazyJavaClassMemberScope f87284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ScopesHolderForClass<LazyJavaClassMemberScope> f87285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InnerClassesScopeWrapper f87286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final LazyJavaStaticClassScope f87287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Annotations f87288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final NotNullLazyValue<List<TypeParameterDescriptor>> f87289w;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue<List<TypeParameterDescriptor>> f87290d;

        public a() {
            super(LazyJavaClassDescriptor.this.f87277k.getStorageManager());
            this.f87290d = LazyJavaClassDescriptor.this.f87277k.getStorageManager().createLazyValue(new i(LazyJavaClassDescriptor.this));
        }

        private final KotlinType C() {
            FqName purelyImplementedInterface;
            ArrayList arrayList;
            FqName fqNameD = D();
            if (fqNameD == null || fqNameD.isRoot() || !fqNameD.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
                fqNameD = null;
            }
            if (fqNameD == null) {
                purelyImplementedInterface = FakePureImplementationsProvider.INSTANCE.getPurelyImplementedInterface(DescriptorUtilsKt.getFqNameSafe(LazyJavaClassDescriptor.this));
                if (purelyImplementedInterface == null) {
                    return null;
                }
            } else {
                purelyImplementedInterface = fqNameD;
            }
            ClassDescriptor classDescriptorResolveTopLevelClass = DescriptorUtilsKt.resolveTopLevelClass(LazyJavaClassDescriptor.this.f87277k.getModule(), purelyImplementedInterface, NoLookupLocation.FROM_JAVA_LOADER);
            if (classDescriptorResolveTopLevelClass == null) {
                return null;
            }
            int size = classDescriptorResolveTopLevelClass.getTypeConstructor().getParameters().size();
            List<TypeParameterDescriptor> parameters = LazyJavaClassDescriptor.this.getTypeConstructor().getParameters();
            s.j(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                List<TypeParameterDescriptor> list = parameters;
                arrayList = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) it.next()).getDefaultType()));
                }
            } else {
                if (size2 != 1 || size <= 1 || fqNameD != null) {
                    return null;
                }
                TypeProjectionImpl typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, ((TypeParameterDescriptor) v.U0(parameters)).getDefaultType());
                j jVar = new j(1, size);
                ArrayList arrayList2 = new ArrayList(v.y(jVar, 10));
                Iterator<Integer> it2 = jVar.iterator();
                while (it2.hasNext()) {
                    ((s0) it2).nextInt();
                    arrayList2.add(typeProjectionImpl);
                }
                arrayList = arrayList2;
            }
            return KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorResolveTopLevelClass, arrayList);
        }

        private final FqName D() {
            String value;
            Annotations annotations = LazyJavaClassDescriptor.this.getAnnotations();
            FqName PURELY_IMPLEMENTS_ANNOTATION = JvmAnnotationNames.PURELY_IMPLEMENTS_ANNOTATION;
            s.j(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            AnnotationDescriptor annotationDescriptorMo496findAnnotation = annotations.mo496findAnnotation(PURELY_IMPLEMENTS_ANNOTATION);
            if (annotationDescriptorMo496findAnnotation == null) {
                return null;
            }
            Object objV0 = v.V0(annotationDescriptorMo496findAnnotation.getAllValueArguments().values());
            StringValue stringValue = objV0 instanceof StringValue ? (StringValue) objV0 : null;
            if (stringValue == null || (value = stringValue.getValue()) == null || !FqNamesUtilKt.isValidJavaFqName(value)) {
                return null;
            }
            return new FqName(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List E(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
            return TypeParameterUtilsKt.computeConstructorTypeParameters(lazyJavaClassDescriptor);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.f87290d.invoke();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> l() {
            Collection<JavaClassifierType> supertypes = LazyJavaClassDescriptor.this.getJClass().getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            ArrayList<JavaType> arrayList2 = new ArrayList(0);
            KotlinType kotlinTypeC = C();
            Iterator<JavaClassifierType> it = supertypes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JavaClassifierType next = it.next();
                KotlinType kotlinTypeEnhanceSuperType = LazyJavaClassDescriptor.this.f87277k.getComponents().getSignatureEnhancement().enhanceSuperType(LazyJavaClassDescriptor.this.f87277k.getTypeResolver().transformJavaType(next, JavaTypeAttributesKt.toAttributes$default(TypeUsage.SUPERTYPE, false, false, null, 7, null)), LazyJavaClassDescriptor.this.f87277k);
                if (kotlinTypeEnhanceSuperType.getConstructor().mo500getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor) {
                    arrayList2.add(next);
                }
                if (!s.f(kotlinTypeEnhanceSuperType.getConstructor(), kotlinTypeC != null ? kotlinTypeC.getConstructor() : null) && !KotlinBuiltIns.isAnyOrNullableAny(kotlinTypeEnhanceSuperType)) {
                    arrayList.add(kotlinTypeEnhanceSuperType);
                }
            }
            ClassDescriptor classDescriptor = LazyJavaClassDescriptor.this.f87276j;
            CollectionsKt.addIfNotNull(arrayList, classDescriptor != null ? MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptor, LazyJavaClassDescriptor.this).buildSubstitutor().substitute(classDescriptor.getDefaultType(), Variance.INVARIANT) : null);
            CollectionsKt.addIfNotNull(arrayList, kotlinTypeC);
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = LazyJavaClassDescriptor.this.f87277k.getComponents().getErrorReporter();
                ClassDescriptor classDescriptorMo500getDeclarationDescriptor = mo500getDeclarationDescriptor();
                ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
                for (JavaType javaType : arrayList2) {
                    s.i(javaType, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((JavaClassifierType) javaType).getPresentableText());
                }
                errorReporter.reportIncompleteHierarchy(classDescriptorMo500getDeclarationDescriptor, arrayList3);
            }
            return !arrayList.isEmpty() ? v.m1(arrayList) : v.e(LazyJavaClassDescriptor.this.f87277k.getModule().getBuiltIns().getAnyType());
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker p() {
            return LazyJavaClassDescriptor.this.f87277k.getComponents().getSupertypeLoopChecker();
        }

        public String toString() {
            String strAsString = LazyJavaClassDescriptor.this.getName().asString();
            s.j(strAsString, "asString(...)");
            return strAsString;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassDescriptor mo500getDeclarationDescriptor() {
            return LazyJavaClassDescriptor.this;
        }
    }

    public /* synthetic */ LazyJavaClassDescriptor(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaClass javaClass, ClassDescriptor classDescriptor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, declarationDescriptor, javaClass, (i11 & 8) != 0 ? null : classDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        List<JavaTypeParameter> typeParameters = lazyJavaClassDescriptor.f87275i.getTypeParameters();
        ArrayList arrayList = new ArrayList(v.y(typeParameters, 10));
        for (JavaTypeParameter javaTypeParameter : typeParameters) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaClassDescriptor.f87277k.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
            if (typeParameterDescriptorResolveTypeParameter == null) {
                throw new AssertionError("Parameter " + javaTypeParameter + " surely belongs to class " + lazyJavaClassDescriptor.f87275i + ", so it must be resolved");
            }
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
        if (classId != null) {
            return lazyJavaClassDescriptor.f87274h.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaClassMemberScope h(LazyJavaClassDescriptor lazyJavaClassDescriptor, KotlinTypeRefiner it) {
        s.k(it, "it");
        return new LazyJavaClassMemberScope(lazyJavaClassDescriptor.f87277k, lazyJavaClassDescriptor, lazyJavaClassDescriptor.f87275i, lazyJavaClassDescriptor.f87276j != null, lazyJavaClassDescriptor.f87284r);
    }

    public final LazyJavaClassDescriptor copy$descriptors_jvm(JavaResolverCache javaResolverCache, ClassDescriptor classDescriptor) {
        s.k(javaResolverCache, "javaResolverCache");
        LazyJavaResolverContext lazyJavaResolverContext = this.f87277k;
        LazyJavaResolverContext lazyJavaResolverContextReplaceComponents = ContextKt.replaceComponents(lazyJavaResolverContext, lazyJavaResolverContext.getComponents().replace(javaResolverCache));
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        s.j(containingDeclaration, "getContainingDeclaration(...)");
        return new LazyJavaClassDescriptor(lazyJavaResolverContextReplaceComponents, containingDeclaration, this.f87275i, classDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (LazyJavaClassMemberScope) this.f87285s.getScope(kotlinTypeRefiner);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f87288v;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo494getCompanionObjectDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return (List) this.f87289w.invoke();
    }

    public final JavaClass getJClass() {
        return this.f87275i;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.f87279m;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.f87280n;
    }

    public final List<JavaAnnotation> getModuleAnnotations() {
        return (List) this.f87278l.getValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        if (this.f87280n != Modality.SEALED) {
            return v.m();
        }
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
        i<JavaClassifierType> permittedTypes = this.f87275i.getPermittedTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<JavaClassifierType> it = permittedTypes.iterator();
        while (it.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = this.f87277k.getTypeResolver().transformJavaType(it.next(), attributes$default).getConstructor().mo500getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
            if (classDescriptor != null) {
                arrayList.add(classDescriptor);
            }
        }
        return v.a1(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.d(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t11).asString(), DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) t12).asString());
            }
        });
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        return this.f87287u;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f87283q;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        return this.f87286t;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        if (!s.f(this.f87281o, DescriptorVisibilities.PRIVATE) || this.f87275i.getOuterClass() != null) {
            return UtilsKt.toDescriptorVisibility(this.f87281o);
        }
        DescriptorVisibility descriptorVisibility = JavaDescriptorVisibilities.PACKAGE_VISIBILITY;
        s.h(descriptorVisibility);
        return descriptorVisibility;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.f87282p;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + DescriptorUtilsKt.getFqNameUnsafe(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassDescriptor(LazyJavaResolverContext outerContext, DeclarationDescriptor containingDeclaration, JavaClass jClass, ClassDescriptor classDescriptor) {
        ClassKind classKind;
        Modality modalityConvertFromFlags;
        super(outerContext.getStorageManager(), containingDeclaration, jClass.getName(), outerContext.getComponents().getSourceElementFactory().source(jClass), false);
        s.k(outerContext, "outerContext");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(jClass, "jClass");
        this.f87274h = outerContext;
        this.f87275i = jClass;
        this.f87276j = classDescriptor;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, jClass, 0, 4, null);
        this.f87277k = lazyJavaResolverContextChildForClassOrPackage$default;
        lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(jClass, this);
        jClass.getLightClassOriginKind();
        this.f87278l = m.b(new f(this));
        if (jClass.isAnnotationType()) {
            classKind = ClassKind.ANNOTATION_CLASS;
        } else if (jClass.isInterface()) {
            classKind = ClassKind.INTERFACE;
        } else {
            classKind = jClass.isEnum() ? ClassKind.ENUM_CLASS : ClassKind.CLASS;
        }
        this.f87279m = classKind;
        if (jClass.isAnnotationType() || jClass.isEnum()) {
            modalityConvertFromFlags = Modality.FINAL;
        } else {
            modalityConvertFromFlags = Modality.Companion.convertFromFlags(jClass.isSealed(), jClass.isSealed() || jClass.isAbstract() || jClass.isInterface(), !jClass.isFinal());
        }
        this.f87280n = modalityConvertFromFlags;
        this.f87281o = jClass.getVisibility();
        this.f87282p = (jClass.getOuterClass() == null || jClass.isStatic()) ? false : true;
        this.f87283q = new a();
        LazyJavaClassMemberScope lazyJavaClassMemberScope = new LazyJavaClassMemberScope(lazyJavaResolverContextChildForClassOrPackage$default, this, jClass, classDescriptor != null, null, 16, null);
        this.f87284r = lazyJavaClassMemberScope;
        this.f87285s = ScopesHolderForClass.Companion.create(this, lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager(), lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new g(this));
        this.f87286t = new InnerClassesScopeWrapper(lazyJavaClassMemberScope);
        this.f87287u = new LazyJavaStaticClassScope(lazyJavaResolverContextChildForClassOrPackage$default, jClass, this);
        this.f87288v = LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jClass);
        this.f87289w = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new h(this));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return (List) this.f87284r.getConstructors$descriptors_jvm().invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public LazyJavaClassMemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        s.i(unsubstitutedMemberScope, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (LazyJavaClassMemberScope) unsubstitutedMemberScope;
    }
}
