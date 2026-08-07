package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ch.qos.logback.core.CoreConstants;
import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87316l = {o0.k(new f0(o0.b(LazyJavaScope.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), o0.k(new f0(o0.b(LazyJavaScope.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), o0.k(new f0(o0.b(LazyJavaScope.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaScope f87318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue<Collection<DeclarationDescriptor>> f87319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<DeclaredMemberIndex> f87320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f87321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MemoizedFunctionToNullable<Name, PropertyDescriptor> f87322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f87323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final NotNullLazyValue f87324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final NotNullLazyValue f87325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue f87326j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, List<PropertyDescriptor>> f87327k;

    protected static final class MethodSignatureData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KotlinType f87328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final KotlinType f87329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f87330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f87331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f87332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f87333f;

        /* JADX WARN: Multi-variable type inference failed */
        public MethodSignatureData(KotlinType returnType, KotlinType kotlinType, List<? extends ValueParameterDescriptor> valueParameters, List<? extends TypeParameterDescriptor> typeParameters, boolean z11, List<String> errors) {
            s.k(returnType, "returnType");
            s.k(valueParameters, "valueParameters");
            s.k(typeParameters, "typeParameters");
            s.k(errors, "errors");
            this.f87328a = returnType;
            this.f87329b = kotlinType;
            this.f87330c = valueParameters;
            this.f87331d = typeParameters;
            this.f87332e = z11;
            this.f87333f = errors;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj;
            return s.f(this.f87328a, methodSignatureData.f87328a) && s.f(this.f87329b, methodSignatureData.f87329b) && s.f(this.f87330c, methodSignatureData.f87330c) && s.f(this.f87331d, methodSignatureData.f87331d) && this.f87332e == methodSignatureData.f87332e && s.f(this.f87333f, methodSignatureData.f87333f);
        }

        public final List<String> getErrors() {
            return this.f87333f;
        }

        public final boolean getHasStableParameterNames() {
            return this.f87332e;
        }

        public final KotlinType getReceiverType() {
            return this.f87329b;
        }

        public final KotlinType getReturnType() {
            return this.f87328a;
        }

        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.f87331d;
        }

        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.f87330c;
        }

        public int hashCode() {
            int iHashCode = this.f87328a.hashCode() * 31;
            KotlinType kotlinType = this.f87329b;
            return ((((((((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31) + this.f87330c.hashCode()) * 31) + this.f87331d.hashCode()) * 31) + Boolean.hashCode(this.f87332e)) * 31) + this.f87333f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f87328a + ", receiverType=" + this.f87329b + ", valueParameters=" + this.f87330c + ", typeParameters=" + this.f87331d + ", hasStableParameterNames=" + this.f87332e + ", errors=" + this.f87333f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    protected static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f87334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f87335b;

        /* JADX WARN: Multi-variable type inference failed */
        public ResolvedValueParameters(List<? extends ValueParameterDescriptor> descriptors, boolean z11) {
            s.k(descriptors, "descriptors");
            this.f87334a = descriptors;
            this.f87335b = z11;
        }

        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.f87334a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.f87335b;
        }
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i11 & 2) != 0 ? null : lazyJavaScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A(LazyJavaScope lazyJavaScope, Name name) {
        s.k(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) lazyJavaScope.f87321e.invoke(name));
        lazyJavaScope.U(linkedHashSet);
        lazyJavaScope.s(linkedHashSet, name);
        return v.m1(lazyJavaScope.f87317a.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.f87317a, linkedHashSet));
    }

    private final Set<Name> D() {
        return (Set) StorageKt.getValue(this.f87326j, this, (m<?>) f87316l[2]);
    }

    private final Set<Name> G() {
        return (Set) StorageKt.getValue(this.f87324h, this, (m<?>) f87316l[0]);
    }

    private final Set<Name> I() {
        return (Set) StorageKt.getValue(this.f87325i, this, (m<?>) f87316l[1]);
    }

    private final KotlinType J(JavaField javaField) {
        KotlinType kotlinTypeTransformJavaType = this.f87317a.getTypeResolver().transformJavaType(javaField.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
        if ((!KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) && !KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) || !K(javaField) || !javaField.getHasConstantNotNullInitializer()) {
            return kotlinTypeTransformJavaType;
        }
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
        s.j(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        return kotlinTypeMakeNotNullable;
    }

    private final boolean K(JavaField javaField) {
        return javaField.isFinal() && javaField.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M(LazyJavaScope lazyJavaScope, Name name) {
        s.k(name, "name");
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addIfNotNull(arrayList, lazyJavaScope.f87322f.invoke(name));
        lazyJavaScope.t(name, arrayList);
        return DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor()) ? v.m1(arrayList) : v.m1(lazyJavaScope.f87317a.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaScope.f87317a, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set N(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.u(DescriptorKindFilter.VARIABLES, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl] */
    private final PropertyDescriptor Q(JavaField javaField) {
        n0 n0Var = new n0();
        ?? V = v(javaField);
        n0Var.f86529a = V;
        V.initialize(null, null, null, null);
        ((PropertyDescriptorImpl) n0Var.f86529a).setType(J(javaField), v.m(), F(), null, v.m());
        DeclarationDescriptor ownerDescriptor = getOwnerDescriptor();
        ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
        if (classDescriptor != null) {
            n0Var.f86529a = this.f87317a.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) n0Var.f86529a, this.f87317a);
        }
        T t11 = n0Var.f86529a;
        if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) t11, ((PropertyDescriptorImpl) t11).getType())) {
            ((PropertyDescriptorImpl) n0Var.f86529a).setCompileTimeInitializerFactory(new z(this, javaField, n0Var));
        }
        this.f87317a.getComponents().getJavaResolverCache().recordField(javaField, (PropertyDescriptor) n0Var.f86529a);
        return (PropertyDescriptor) n0Var.f86529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NullableLazyValue R(LazyJavaScope lazyJavaScope, JavaField javaField, n0 n0Var) {
        return lazyJavaScope.f87317a.getStorageManager().createNullableLazyValue(new a0(lazyJavaScope, javaField, n0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstantValue S(LazyJavaScope lazyJavaScope, JavaField javaField, n0 n0Var) {
        return lazyJavaScope.f87317a.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(javaField, (PropertyDescriptor) n0Var.f86529a);
    }

    private final void U(Set<SimpleFunctionDescriptor> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection<? extends SimpleFunctionDescriptor> collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, j0.f87365a);
                set.removeAll(list2);
                set.addAll(collectionSelectMostSpecificInEachOverridableGroup);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor V(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
        s.k(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection m(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.p(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set n(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.o(DescriptorKindFilter.CLASSIFIERS, null);
    }

    private final PropertyDescriptorImpl v(JavaField javaField) {
        JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f87317a, javaField), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaField.getVisibility()), !javaField.isFinal(), javaField.getName(), this.f87317a.getComponents().getSourceElementFactory().source(javaField), K(javaField));
        s.j(javaPropertyDescriptorCreate, "create(...)");
        return javaPropertyDescriptorCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PropertyDescriptor w(LazyJavaScope lazyJavaScope, Name name) {
        s.k(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f87318b;
        if (lazyJavaScope2 != null) {
            return (PropertyDescriptor) lazyJavaScope2.f87322f.invoke(name);
        }
        JavaField javaFieldFindFieldByName = ((DeclaredMemberIndex) lazyJavaScope.f87320d.invoke()).findFieldByName(name);
        if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
            return null;
        }
        return lazyJavaScope.Q(javaFieldFindFieldByName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(LazyJavaScope lazyJavaScope, Name name) {
        s.k(name, "name");
        LazyJavaScope lazyJavaScope2 = lazyJavaScope.f87318b;
        if (lazyJavaScope2 != null) {
            return (Collection) lazyJavaScope2.f87321e.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope.f87320d.invoke()).findMethodsByName(name)) {
            JavaMethodDescriptor javaMethodDescriptorP = lazyJavaScope.P(javaMethod);
            if (lazyJavaScope.L(javaMethodDescriptorP)) {
                lazyJavaScope.f87317a.getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorP);
                arrayList.add(javaMethodDescriptorP);
            }
        }
        lazyJavaScope.q(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclaredMemberIndex y(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computeMemberIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set z(LazyJavaScope lazyJavaScope) {
        return lazyJavaScope.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
    }

    protected final NotNullLazyValue<Collection<DeclarationDescriptor>> B() {
        return this.f87319c;
    }

    protected final LazyJavaResolverContext C() {
        return this.f87317a;
    }

    protected final NotNullLazyValue<DeclaredMemberIndex> E() {
        return this.f87320d;
    }

    protected abstract ReceiverParameterDescriptor F();

    protected final LazyJavaScope H() {
        return this.f87318b;
    }

    protected boolean L(JavaMethodDescriptor javaMethodDescriptor) {
        s.k(javaMethodDescriptor, "<this>");
        return true;
    }

    protected abstract MethodSignatureData O(JavaMethod javaMethod, List<? extends TypeParameterDescriptor> list, KotlinType kotlinType, List<? extends ValueParameterDescriptor> list2);

    protected final JavaMethodDescriptor P(JavaMethod method) {
        s.k(method, "method");
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(this.f87317a, method), method.getName(), this.f87317a.getComponents().getSourceElementFactory().source(method), ((DeclaredMemberIndex) this.f87320d.invoke()).findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty());
        s.j(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.f87317a, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        List<? extends TypeParameterDescriptor> arrayList = new ArrayList<>(v.y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            s.h(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        ResolvedValueParameters resolvedValueParametersT = T(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        MethodSignatureData methodSignatureDataO = O(method, arrayList, r(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersT.getDescriptors());
        KotlinType receiverType = methodSignatureDataO.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null, F(), v.m(), methodSignatureDataO.getTypeParameters(), methodSignatureDataO.getValueParameters(), methodSignatureDataO.getReturnType(), Modality.Companion.convertFromFlags(false, method.isAbstract(), !method.isFinal()), UtilsKt.toDescriptorVisibility(method.getVisibility()), methodSignatureDataO.getReceiverType() != null ? v0.f(x.a(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, v.o0(resolvedValueParametersT.getDescriptors()))) : v0.i());
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataO.getHasStableParameterNames(), resolvedValueParametersT.getHasSynthesizedNames());
        if (!methodSignatureDataO.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataO.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    protected final ResolvedValueParameters T(LazyJavaResolverContext c11, FunctionDescriptor functionDescriptor, List<? extends JavaValueParameter> jValueParameters) {
        Pair pairA;
        Name name;
        s.k(c11, "c");
        FunctionDescriptor function = functionDescriptor;
        s.k(function, "function");
        s.k(jValueParameters, "jValueParameters");
        Iterable<IndexedValue> iterableT1 = v.t1(jValueParameters);
        ArrayList arrayList = new ArrayList(v.y(iterableT1, 10));
        boolean z11 = false;
        for (IndexedValue indexedValue : iterableT1) {
            int index = indexedValue.getIndex();
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.b();
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c11, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeTransformArrayType = c11.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pairA = x.a(kotlinTypeTransformArrayType, c11.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pairA = x.a(c11.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pairA.a();
            KotlinType kotlinType2 = (KotlinType) pairA.b();
            if (s.f(function.getName().asString(), "equals") && jValueParameters.size() == 1 && s.f(c11.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z11 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(index);
                    name = Name.identifier(sb2.toString());
                    s.j(name, "identifier(...)");
                }
            }
            boolean z12 = z11;
            s.h(name);
            arrayList.add(new ValueParameterDescriptorImpl(function, null, index, annotationsResolveAnnotations, name, kotlinType, false, false, false, kotlinType2, c11.getComponents().getSourceElementFactory().source(javaValueParameter)));
            function = functionDescriptor;
            z11 = z12;
        }
        return new ResolvedValueParameters(v.m1(arrayList), z11);
    }

    protected abstract Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, l<? super Name, Boolean> lVar);

    protected abstract DeclaredMemberIndex computeMemberIndex();

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return D();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        return (Collection) this.f87319c.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return !getFunctionNames().contains(name) ? v.m() : (Collection) this.f87323g.invoke(name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return !getVariableNames().contains(name) ? v.m() : (Collection) this.f87327k.invoke(name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return G();
    }

    protected abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return I();
    }

    protected abstract Set<Name> o(DescriptorKindFilter descriptorKindFilter, l<? super Name, Boolean> lVar);

    protected final List<DeclarationDescriptor> p(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : o(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name).booleanValue()) {
                    CollectionsKt.addIfNotNull(linkedHashSet, mo501getContributedClassifier(name, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name2 : computeFunctionNames(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(name2, noLookupLocation));
                }
            }
        }
        if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
            for (Name name3 : u(kindFilter, nameFilter)) {
                if (nameFilter.invoke(name3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(name3, noLookupLocation));
                }
            }
        }
        return v.m1(linkedHashSet);
    }

    protected void q(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
    }

    protected final KotlinType r(JavaMethod method, LazyJavaResolverContext c11) {
        s.k(method, "method");
        s.k(c11, "c");
        return c11.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    protected abstract void s(Collection<SimpleFunctionDescriptor> collection, Name name);

    protected abstract void t(Name name, Collection<PropertyDescriptor> collection);

    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    protected abstract Set<Name> u(DescriptorKindFilter descriptorKindFilter, l<? super Name, Boolean> lVar);

    public LazyJavaScope(LazyJavaResolverContext c11, LazyJavaScope lazyJavaScope) {
        s.k(c11, "c");
        this.f87317a = c11;
        this.f87318b = lazyJavaScope;
        this.f87319c = c11.getStorageManager().createRecursionTolerantLazyValue(new y(this), v.m());
        this.f87320d = c11.getStorageManager().createLazyValue(new b0(this));
        this.f87321e = c11.getStorageManager().createMemoizedFunction(new c0(this));
        this.f87322f = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new d0(this));
        this.f87323g = c11.getStorageManager().createMemoizedFunction(new e0(this));
        this.f87324h = c11.getStorageManager().createLazyValue(new f0(this));
        this.f87325i = c11.getStorageManager().createLazyValue(new g0(this));
        this.f87326j = c11.getStorageManager().createLazyValue(new h0(this));
        this.f87327k = c11.getStorageManager().createMemoizedFunction(new i0(this));
    }
}
