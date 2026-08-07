package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bo0.n;
import co0.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import p013kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import p013kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import p013kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import p013kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ClassDescriptor f87292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JavaClass f87293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f87294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final NotNullLazyValue<List<ClassConstructorDescriptor>> f87295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f87296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f87297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final NotNullLazyValue<Map<Name, JavaField>> f87298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MemoizedFunctionToNullable<Name, ClassDescriptor> f87299t;

    /* synthetic */ class a extends o implements l<Name, Collection<? extends SimpleFunctionDescriptor>> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(Name p11) {
            s.k(p11, "p0");
            return ((LazyJavaClassMemberScope) this.receiver).c1(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(LazyJavaClassMemberScope.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    /* synthetic */ class b extends o implements l<Name, Collection<? extends SimpleFunctionDescriptor>> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection<SimpleFunctionDescriptor> invoke(Name p11) {
            s.k(p11, "p0");
            return ((LazyJavaClassMemberScope) this.receiver).d1(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(LazyJavaClassMemberScope.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z11, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z11, (i11 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    private final List<ValueParameterDescriptor> A0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        Collection<JavaRecordComponent> recordComponents = this.f87293n.getRecordComponents();
        ArrayList arrayList = new ArrayList(recordComponents.size());
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<T> it = recordComponents.iterator();
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (!it.hasNext()) {
                return arrayList;
            }
            i11 = i12 + 1;
            JavaRecordComponent javaRecordComponent = (JavaRecordComponent) it.next();
            KotlinType kotlinTypeTransformJavaType = C().getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
            arrayList.add(new ValueParameterDescriptorImpl(classConstructorDescriptorImpl, null, i12, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), kotlinTypeTransformJavaType, false, false, false, javaRecordComponent.isVararg() ? C().getComponents().getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformJavaType) : null, C().getComponents().getSourceElementFactory().source(javaRecordComponent)));
        }
    }

    private final SimpleFunctionDescriptor B0(SimpleFunctionDescriptor simpleFunctionDescriptor, Name name) {
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        copyBuilderNewCopyBuilder.setName(name);
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
        s.h(functionDescriptorBuild);
        return (SimpleFunctionDescriptor) functionDescriptorBuild;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    private final SimpleFunctionDescriptor C0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName safe;
        FqNameUnsafe fqNameUnsafe;
        List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) v.C0(valueParameters);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo500getDeclarationDescriptor();
            if (classifierDescriptorMo500getDeclarationDescriptor == null || (fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo500getDeclarationDescriptor)) == null) {
                safe = null;
            } else {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    safe = fqNameUnsafe.toSafe();
                } else {
                    safe = null;
                }
            }
            if (!s.f(safe, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                valueParameterDescriptor = null;
            }
            if (valueParameterDescriptor != null) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                s.j(valueParameters2, "getValueParameters(...)");
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.setValueParameters(v.j0(valueParameters2, 1)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) simpleFunctionDescriptor2;
                if (simpleFunctionDescriptorImpl != null) {
                    simpleFunctionDescriptorImpl.setSuspend(true);
                }
                return simpleFunctionDescriptor2;
            }
        }
        return null;
    }

    private final boolean D0(PropertyDescriptor propertyDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorK0 = K0(propertyDescriptor, lVar);
        SimpleFunctionDescriptor simpleFunctionDescriptorL0 = L0(propertyDescriptor, lVar);
        if (simpleFunctionDescriptorK0 == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorL0 != null && simpleFunctionDescriptorL0.getModality() == simpleFunctionDescriptorK0.getModality();
        }
        return true;
    }

    private final boolean E0(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor2, callableDescriptor, true).getResult();
        s.j(result, "getResult(...)");
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor2, callableDescriptor);
    }

    private final boolean F0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name = simpleFunctionDescriptor.getName();
        s.j(name, "getName(...)");
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name);
        if (builtinFunctionNamesByJvmName == null) {
            return false;
        }
        Set<SimpleFunctionDescriptor> setO0 = O0(builtinFunctionNamesByJvmName);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setO0) {
            if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorB0 = B0(simpleFunctionDescriptor, builtinFunctionNamesByJvmName);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (G0((SimpleFunctionDescriptor) it.next(), simpleFunctionDescriptorB0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean G0(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        if (BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor)) {
            functionDescriptor = functionDescriptor.getOriginal();
        }
        s.h(functionDescriptor);
        return E0(functionDescriptor, simpleFunctionDescriptor);
    }

    private final boolean H0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        SimpleFunctionDescriptor simpleFunctionDescriptorC0 = C0(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorC0 == null) {
            return false;
        }
        Name name = simpleFunctionDescriptor.getName();
        s.j(name, "getName(...)");
        Set<SimpleFunctionDescriptor> setO0 = O0(name);
        if ((setO0 instanceof Collection) && setO0.isEmpty()) {
            return false;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : setO0) {
            if (simpleFunctionDescriptor2.isSuspend() && E0(simpleFunctionDescriptorC0, simpleFunctionDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map I0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        Collection<JavaField> fields = lazyJavaClassMemberScope.f87293n.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((JavaField) obj).isEnumEntry()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((JavaField) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final SimpleFunctionDescriptor J0(PropertyDescriptor propertyDescriptor, String str, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        Iterator<T> it = lVar.invoke(nameIdentifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor K0(PropertyDescriptor propertyDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), propertyGetterDescriptor)) {
            return J0(propertyDescriptor, builtinSpecialPropertyGetterName, lVar);
        }
        String strAsString = propertyDescriptor.getName().asString();
        s.j(strAsString, "asString(...)");
        return J0(propertyDescriptor, JvmAbi.getterName(strAsString), lVar);
    }

    private final SimpleFunctionDescriptor L0(PropertyDescriptor propertyDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strAsString = propertyDescriptor.getName().asString();
        s.j(strAsString, "asString(...)");
        Name nameIdentifier = Name.identifier(JvmAbi.setterName(strAsString));
        s.j(nameIdentifier, "identifier(...)");
        Iterator<T> it = lVar.invoke(nameIdentifier).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                s.j(valueParameters, "getValueParameters(...)");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) v.U0(valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set M0(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return v.r1(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaClassMemberScope.getOwnerDescriptor(), lazyJavaResolverContext));
    }

    private final DescriptorVisibility N0(ClassDescriptor classDescriptor) {
        DescriptorVisibility visibility = classDescriptor.getVisibility();
        s.j(visibility, "getVisibility(...)");
        if (!s.f(visibility, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        DescriptorVisibility PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
        s.j(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set<SimpleFunctionDescriptor> O0(Name name) {
        Collection<KotlinType> collectionQ0 = q0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionQ0.iterator();
        while (it.hasNext()) {
            v.E(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<PropertyDescriptor> Q0(Name name) {
        Collection<KotlinType> collectionQ0 = q0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionQ0.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(v.y(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            v.E(arrayList, arrayList2);
        }
        return v.r1(arrayList);
    }

    private final boolean R0(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        s.j(original, "getOriginal(...)");
        return s.f(strComputeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !E0(simpleFunctionDescriptor, functionDescriptor);
    }

    private final boolean S0(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        s.j(name, "getName(...)");
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> setQ0 = Q0((Name) it.next());
                if (!(setQ0 instanceof Collection) || !setQ0.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setQ0) {
                        if (D0(propertyDescriptor, new p(simpleFunctionDescriptor, this))) {
                            if (!propertyDescriptor.isVar()) {
                                String strAsString = simpleFunctionDescriptor.getName().asString();
                                s.j(strAsString, "asString(...)");
                                if (!JvmAbi.isSetterName(strAsString)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (F0(simpleFunctionDescriptor) || e1(simpleFunctionDescriptor) || H0(simpleFunctionDescriptor)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection T0(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope, Name accessorName) {
        s.k(accessorName, "accessorName");
        return s.f(simpleFunctionDescriptor.getName(), accessorName) ? v.e(simpleFunctionDescriptor) : v.P0(lazyJavaClassMemberScope.c1(accessorName), lazyJavaClassMemberScope.d1(accessorName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set U0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return v.r1(lazyJavaClassMemberScope.f87293n.getInnerClassNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor V0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext, Name name) {
        s.k(name, "name");
        if (((Set) lazyJavaClassMemberScope.f87296q.invoke()).contains(name)) {
            JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
            ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassMemberScope.getOwnerDescriptor());
            s.h(classId);
            JavaClass javaClassFindClass = finder.findClass(new JavaClassFinder.Request(classId.createNestedClassId(name), null, lazyJavaClassMemberScope.f87293n, 2, null));
            if (javaClassFindClass == null) {
                return null;
            }
            LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.getOwnerDescriptor(), javaClassFindClass, null, 8, null);
            lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            return lazyJavaClassDescriptor;
        }
        if (!((Set) lazyJavaClassMemberScope.f87297r.invoke()).contains(name)) {
            JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.f87298s.invoke()).get(name);
            if (javaField == null) {
                return null;
            }
            return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.getOwnerDescriptor(), name, lazyJavaResolverContext.getStorageManager().createLazyValue(new s(lazyJavaClassMemberScope)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
        }
        List<ClassDescriptor> listC = v.c();
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaClassMemberScope.getOwnerDescriptor(), name, listC, lazyJavaResolverContext);
        List listA = v.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (ClassDescriptor) v.U0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set W0(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        return d1.n(lazyJavaClassMemberScope.getFunctionNames(), lazyJavaClassMemberScope.getVariableNames());
    }

    private final SimpleFunctionDescriptor X0(SimpleFunctionDescriptor simpleFunctionDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptorW0;
        FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null && (simpleFunctionDescriptorW0 = w0(overriddenBuiltinFunctionWithErasedValueParametersInJava, lVar)) != null) {
            if (!S0(simpleFunctionDescriptorW0)) {
                simpleFunctionDescriptorW0 = null;
            }
            if (simpleFunctionDescriptorW0 != null) {
                return v0(simpleFunctionDescriptorW0, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor Y0(SimpleFunctionDescriptor simpleFunctionDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar, Name name, Collection<? extends SimpleFunctionDescriptor> collection) {
        SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor);
        if (simpleFunctionDescriptor2 == null) {
            return null;
        }
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor2);
        s.h(jvmMethodNameIfSpecial);
        Name nameIdentifier = Name.identifier(jvmMethodNameIfSpecial);
        s.j(nameIdentifier, "identifier(...)");
        Iterator<? extends SimpleFunctionDescriptor> it = lVar.invoke(nameIdentifier).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorB0 = B0(it.next(), name);
            if (G0(simpleFunctionDescriptor2, simpleFunctionDescriptorB0)) {
                return v0(simpleFunctionDescriptorB0, simpleFunctionDescriptor2, collection);
            }
        }
        return null;
    }

    private final SimpleFunctionDescriptor Z0(SimpleFunctionDescriptor simpleFunctionDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        if (!simpleFunctionDescriptor.isSuspend()) {
            return null;
        }
        Name name = simpleFunctionDescriptor.getName();
        s.j(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptorC0 = C0((SimpleFunctionDescriptor) it.next());
            if (simpleFunctionDescriptorC0 == null || !E0(simpleFunctionDescriptorC0, simpleFunctionDescriptor)) {
                simpleFunctionDescriptorC0 = null;
            }
            if (simpleFunctionDescriptorC0 != null) {
                return simpleFunctionDescriptorC0;
            }
        }
        return null;
    }

    private final JavaClassConstructorDescriptor a1(JavaConstructor javaConstructor) {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(C(), javaConstructor), false, C().getComponents().getSourceElementFactory().source(javaConstructor));
        s.j(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod = ContextKt.childForMethod(C(), javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor, ownerDescriptor.getDeclaredTypeParameters().size());
        LazyJavaScope.ResolvedValueParameters resolvedValueParametersT = T(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor.getValueParameters());
        List<TypeParameterDescriptor> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        s.j(declaredTypeParameters, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> list = declaredTypeParameters;
        List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
        ArrayList arrayList = new ArrayList(v.y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it.next());
            s.h(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(resolvedValueParametersT.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), v.P0(list, arrayList));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(resolvedValueParametersT.getHasSynthesizedNames());
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final JavaMethodDescriptor b1(JavaRecordComponent javaRecordComponent) {
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(C(), javaRecordComponent), javaRecordComponent.getName(), C().getComponents().getSourceElementFactory().source(javaRecordComponent), true);
        s.j(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        javaMethodDescriptorCreateJavaMethod.initialize(null, F(), v.m(), v.m(), v.m(), C().getTypeResolver().transformJavaType(javaRecordComponent.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(false, false);
        C().getComponents().getJavaResolverCache().recordMethod(javaRecordComponent, javaMethodDescriptorCreateJavaMethod);
        return javaMethodDescriptorCreateJavaMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> c1(Name name) {
        Collection<JavaMethod> collectionFindMethodsByName = ((DeclaredMemberIndex) E().invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(v.y(collectionFindMethodsByName, 10));
        Iterator<T> it = collectionFindMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(P((JavaMethod) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<SimpleFunctionDescriptor> d1(Name name) {
        Set<SimpleFunctionDescriptor> setO0 = O0(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setO0) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean e1(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = simpleFunctionDescriptor.getName();
        s.j(name, "getName(...)");
        if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return false;
        }
        Name name2 = simpleFunctionDescriptor.getName();
        s.j(name2, "getName(...)");
        Set<SimpleFunctionDescriptor> setO0 = O0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setO0.iterator();
        while (it.hasNext()) {
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (R0(simpleFunctionDescriptor, (FunctionDescriptor) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void g0(List<ValueParameterDescriptor> list, ConstructorDescriptor constructorDescriptor, int i11, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        s.j(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        list.add(new ValueParameterDescriptorImpl(constructorDescriptor, null, i11, empty, name, kotlinTypeMakeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, C().getComponents().getSourceElementFactory().source(javaMethod)));
    }

    private final void h0(Collection<SimpleFunctionDescriptor> collection, Name name, Collection<? extends SimpleFunctionDescriptor> collection2, boolean z11) {
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, collection2, collection, getOwnerDescriptor(), C().getComponents().getErrorReporter(), C().getComponents().getKotlinTypeChecker().getOverridingUtil());
        s.j(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        if (!z11) {
            collection.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        Collection<? extends SimpleFunctionDescriptor> collection3 = collectionResolveOverridesForNonStaticMembers;
        List listP0 = v.P0(collection, collection3);
        ArrayList arrayList = new ArrayList(v.y(collection3, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorV0 : collection3) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptorV0);
            if (simpleFunctionDescriptor == null) {
                s.h(simpleFunctionDescriptorV0);
            } else {
                s.h(simpleFunctionDescriptorV0);
                simpleFunctionDescriptorV0 = v0(simpleFunctionDescriptorV0, simpleFunctionDescriptor, listP0);
            }
            arrayList.add(simpleFunctionDescriptorV0);
        }
        collection.addAll(arrayList);
    }

    private final void i0(Name name, Collection<? extends SimpleFunctionDescriptor> collection, Collection<? extends SimpleFunctionDescriptor> collection2, Collection<SimpleFunctionDescriptor> collection3, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection2) {
            CollectionsKt.addIfNotNull(collection3, Y0(simpleFunctionDescriptor, lVar, name, collection));
            CollectionsKt.addIfNotNull(collection3, X0(simpleFunctionDescriptor, lVar, collection));
            CollectionsKt.addIfNotNull(collection3, Z0(simpleFunctionDescriptor, lVar));
        }
    }

    private final void j0(Set<? extends PropertyDescriptor> set, Collection<PropertyDescriptor> collection, Set<PropertyDescriptor> set2, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        for (PropertyDescriptor propertyDescriptor : set) {
            JavaPropertyDescriptor javaPropertyDescriptorX0 = x0(propertyDescriptor, lVar);
            if (javaPropertyDescriptorX0 != null) {
                collection.add(javaPropertyDescriptorX0);
                if (set2 != null) {
                    set2.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    private final void k0(Name name, Collection<PropertyDescriptor> collection) {
        JavaMethod javaMethod = (JavaMethod) v.V0(((DeclaredMemberIndex) E().invoke()).findMethodsByName(name));
        if (javaMethod == null) {
            return;
        }
        collection.add(z0(this, javaMethod, null, Modality.FINAL, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(JavaMember it) {
        s.k(it, "it");
        return !it.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name it) {
        s.k(it, "it");
        return lazyJavaClassMemberScope.c1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection p0(LazyJavaClassMemberScope lazyJavaClassMemberScope, Name it) {
        s.k(it, "it");
        return lazyJavaClassMemberScope.d1(it);
    }

    private final Collection<KotlinType> q0() {
        if (!this.f87294o) {
            return C().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
        }
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r0(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        Collection<JavaConstructor> constructors = lazyJavaClassMemberScope.f87293n.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<JavaConstructor> it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaClassMemberScope.a1(it.next()));
        }
        if (lazyJavaClassMemberScope.f87293n.isRecord()) {
            ClassConstructorDescriptor classConstructorDescriptorU0 = lazyJavaClassMemberScope.u0();
            String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptorU0, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(classConstructorDescriptorU0);
                        lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.f87293n, classConstructorDescriptorU0);
                        break;
                    }
                } while (!s.f(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it2.next(), false, false, 2, null), strComputeJvmDescriptor$default));
            } else {
                arrayList.add(classConstructorDescriptorU0);
                lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(lazyJavaClassMemberScope.f87293n, classConstructorDescriptorU0);
                break;
            }
        }
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaClassMemberScope.getOwnerDescriptor(), arrayList, lazyJavaResolverContext);
        SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
        boolean zIsEmpty = arrayList.isEmpty();
        List listQ = arrayList;
        if (zIsEmpty) {
            listQ = v.q(lazyJavaClassMemberScope.t0());
        }
        return v.m1(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listQ));
    }

    private final List<ValueParameterDescriptor> s0(ClassConstructorDescriptorImpl classConstructorDescriptorImpl) {
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl2;
        Pair pair;
        Collection<JavaMethod> methods = this.f87293n.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (s.f(((JavaMethod) obj).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<JavaMethod> list2 = (List) pair2.b();
        list.size();
        JavaMethod javaMethod = (JavaMethod) v.q0(list);
        if (javaMethod != null) {
            JavaType returnType = javaMethod.getReturnType();
            if (returnType instanceof JavaArrayType) {
                JavaArrayType javaArrayType = (JavaArrayType) returnType;
                pair = new Pair(C().getTypeResolver().transformArrayType(javaArrayType, attributes$default, true), C().getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default));
            } else {
                pair = new Pair(C().getTypeResolver().transformJavaType(returnType, attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.a();
            KotlinType kotlinType2 = (KotlinType) pair.b();
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
            g0(arrayList, classConstructorDescriptorImpl2, 0, javaMethod, kotlinType, kotlinType2);
        } else {
            classConstructorDescriptorImpl2 = classConstructorDescriptorImpl;
        }
        int i11 = 0;
        int i12 = javaMethod == null ? 0 : 1;
        for (JavaMethod javaMethod2 : list2) {
            g0(arrayList, classConstructorDescriptorImpl2, i11 + i12, javaMethod2, C().getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default), null);
            i11++;
        }
        return arrayList;
    }

    private final ClassConstructorDescriptor t0() {
        boolean zIsAnnotationType = this.f87293n.isAnnotationType();
        if ((this.f87293n.isInterface() || !this.f87293n.hasDefaultConstructor()) && !zIsAnnotationType) {
            return null;
        }
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, C().getComponents().getSourceElementFactory().source(this.f87293n));
        s.j(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
        List<ValueParameterDescriptor> listS0 = zIsAnnotationType ? s0(javaClassConstructorDescriptorCreateJavaConstructor) : Collections.EMPTY_LIST;
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(listS0, N0(ownerDescriptor));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(true);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        C().getComponents().getJavaResolverCache().recordConstructor(this.f87293n, javaClassConstructorDescriptorCreateJavaConstructor);
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final ClassConstructorDescriptor u0() {
        ClassDescriptor ownerDescriptor = getOwnerDescriptor();
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(ownerDescriptor, Annotations.Companion.getEMPTY(), true, C().getComponents().getSourceElementFactory().source(this.f87293n));
        s.j(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
        List<ValueParameterDescriptor> listA0 = A0(javaClassConstructorDescriptorCreateJavaConstructor);
        javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.initialize(listA0, N0(ownerDescriptor));
        javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
        javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        return javaClassConstructorDescriptorCreateJavaConstructor;
    }

    private final SimpleFunctionDescriptor v0(SimpleFunctionDescriptor simpleFunctionDescriptor, CallableDescriptor callableDescriptor, Collection<? extends SimpleFunctionDescriptor> collection) {
        Collection<? extends SimpleFunctionDescriptor> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor2 : collection2) {
            if (!s.f(simpleFunctionDescriptor, simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && E0(simpleFunctionDescriptor2, callableDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                s.h(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    private final SimpleFunctionDescriptor w0(FunctionDescriptor functionDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        Object next;
        Name name = functionDescriptor.getName();
        s.j(name, "getName(...)");
        Iterator<T> it = lVar.invoke(name).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!R0((SimpleFunctionDescriptor) next, functionDescriptor));
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
        if (simpleFunctionDescriptor == null) {
            return null;
        }
        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it2.next()).getType());
        }
        List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
        s.j(valueParameters2, "getValueParameters(...)");
        copyBuilderNewCopyBuilder.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, functionDescriptor));
        copyBuilderNewCopyBuilder.setSignatureChange();
        copyBuilderNewCopyBuilder.setPreserveSourceElement();
        copyBuilderNewCopyBuilder.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
        return (SimpleFunctionDescriptor) copyBuilderNewCopyBuilder.build();
    }

    private final JavaPropertyDescriptor x0(PropertyDescriptor propertyDescriptor, l<? super Name, ? extends Collection<? extends SimpleFunctionDescriptor>> lVar) {
        SimpleFunctionDescriptor simpleFunctionDescriptorL0;
        PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
        if (!D0(propertyDescriptor, lVar)) {
            return null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorK0 = K0(propertyDescriptor, lVar);
        s.h(simpleFunctionDescriptorK0);
        if (propertyDescriptor.isVar()) {
            simpleFunctionDescriptorL0 = L0(propertyDescriptor, lVar);
            s.h(simpleFunctionDescriptorL0);
        } else {
            simpleFunctionDescriptorL0 = null;
        }
        if (simpleFunctionDescriptorL0 != null) {
            simpleFunctionDescriptorL0.getModality();
            simpleFunctionDescriptorK0.getModality();
        }
        JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(getOwnerDescriptor(), simpleFunctionDescriptorK0, simpleFunctionDescriptorL0, propertyDescriptor);
        KotlinType returnType = simpleFunctionDescriptorK0.getReturnType();
        s.h(returnType);
        javaForKotlinOverridePropertyDescriptor.setType(returnType, v.m(), F(), null, v.m());
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorK0.getAnnotations(), false, false, false, simpleFunctionDescriptorK0.getSource());
        propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorK0);
        propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
        s.j(propertyGetterDescriptorImplCreateGetter, "apply(...)");
        if (simpleFunctionDescriptorL0 != null) {
            List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptorL0.getValueParameters();
            s.j(valueParameters, "getValueParameters(...)");
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) v.q0(valueParameters);
            if (valueParameterDescriptor == null) {
                throw new AssertionError("No parameter found for " + simpleFunctionDescriptorL0);
            }
            propertySetterDescriptorImplCreateSetter = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptorL0.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorL0.getVisibility(), simpleFunctionDescriptorL0.getSource());
            propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorL0);
        }
        javaForKotlinOverridePropertyDescriptor.initialize(propertyGetterDescriptorImplCreateGetter, propertySetterDescriptorImplCreateSetter);
        return javaForKotlinOverridePropertyDescriptor;
    }

    private final JavaPropertyDescriptor y0(JavaMethod javaMethod, KotlinType kotlinType, Modality modality) {
        LazyJavaClassMemberScope lazyJavaClassMemberScope;
        KotlinType kotlinTypeR;
        JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(C(), javaMethod), modality, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), C().getComponents().getSourceElementFactory().source(javaMethod), false);
        s.j(javaPropertyDescriptorCreate, "create(...)");
        PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, Annotations.Companion.getEMPTY());
        s.j(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
        javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
        if (kotlinType == null) {
            LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(C(), javaPropertyDescriptorCreate, javaMethod, 0, 4, null);
            lazyJavaClassMemberScope = this;
            kotlinTypeR = lazyJavaClassMemberScope.r(javaMethod, lazyJavaResolverContextChildForMethod$default);
        } else {
            lazyJavaClassMemberScope = this;
            kotlinTypeR = kotlinType;
        }
        javaPropertyDescriptorCreate.setType(kotlinTypeR, v.m(), lazyJavaClassMemberScope.F(), null, v.m());
        propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinTypeR);
        return javaPropertyDescriptorCreate;
    }

    static /* synthetic */ JavaPropertyDescriptor z0(LazyJavaClassMemberScope lazyJavaClassMemberScope, JavaMethod javaMethod, KotlinType kotlinType, Modality modality, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            kotlinType = null;
        }
        return lazyJavaClassMemberScope.y0(javaMethod, kotlinType, modality);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected ReceiverParameterDescriptor F() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected boolean L(JavaMethodDescriptor javaMethodDescriptor) {
        s.k(javaMethodDescriptor, "<this>");
        if (this.f87293n.isAnnotationType()) {
            return false;
        }
        return S0(javaMethodDescriptor);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected LazyJavaScope.MethodSignatureData O(JavaMethod method, List<? extends TypeParameterDescriptor> methodTypeParameters, KotlinType returnType, List<? extends ValueParameterDescriptor> valueParameters) {
        s.k(method, "method");
        s.k(methodTypeParameters, "methodTypeParameters");
        s.k(returnType, "returnType");
        s.k(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = C().getComponents().getSignaturePropagator().resolvePropagatedSignature(method, getOwnerDescriptor(), returnType, null, valueParameters, methodTypeParameters);
        s.j(propagatedSignatureResolvePropagatedSignature, "resolvePropagatedSignature(...)");
        KotlinType returnType2 = propagatedSignatureResolvePropagatedSignature.getReturnType();
        s.j(returnType2, "getReturnType(...)");
        KotlinType receiverType = propagatedSignatureResolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters2 = propagatedSignatureResolvePropagatedSignature.getValueParameters();
        s.j(valueParameters2, "getValueParameters(...)");
        List<TypeParameterDescriptor> typeParameters = propagatedSignatureResolvePropagatedSignature.getTypeParameters();
        s.j(typeParameters, "getTypeParameters(...)");
        boolean zHasStableParameterNames = propagatedSignatureResolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = propagatedSignatureResolvePropagatedSignature.getErrors();
        s.j(errors, "getErrors(...)");
        return new LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, zHasStableParameterNames, errors);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor getOwnerDescriptor() {
        return this.f87292m;
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.f87295p;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        MemoizedFunctionToNullable<Name, ClassDescriptor> memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) H();
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f87299t) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.f87299t.invoke(name) : classDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<Name> computeFunctionNames(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        LinkedHashSet<Name> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            v.E(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(((DeclaredMemberIndex) E().invoke()).getMethodNames());
        linkedHashSet.addAll(((DeclaredMemberIndex) E().invoke()).getRecordComponentNames());
        linkedHashSet.addAll(o(kindFilter, lVar));
        linkedHashSet.addAll(C().getComponents().getSyntheticPartsProvider().getMethodNames(getOwnerDescriptor(), C()));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f87293n, o.f87376a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> o(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        return d1.n((Set) this.f87296q.invoke(), ((Map) this.f87298s.invoke()).keySet());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void q(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
        if (this.f87293n.isRecord() && ((DeclaredMemberIndex) E().invoke()).findRecordComponentByName(name) != null) {
            Collection<SimpleFunctionDescriptor> collection = result;
            if (collection.isEmpty()) {
                JavaRecordComponent javaRecordComponentFindRecordComponentByName = ((DeclaredMemberIndex) E().invoke()).findRecordComponentByName(name);
                s.h(javaRecordComponentFindRecordComponentByName);
                result.add(b1(javaRecordComponentFindRecordComponentByName));
            } else {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                    }
                }
                JavaRecordComponent javaRecordComponentFindRecordComponentByName2 = ((DeclaredMemberIndex) E().invoke()).findRecordComponentByName(name);
                s.h(javaRecordComponentFindRecordComponentByName2);
                result.add(b1(javaRecordComponentFindRecordComponentByName2));
            }
        }
        C().getComponents().getSyntheticPartsProvider().generateMethods(getOwnerDescriptor(), name, result, C());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo504recordLookup(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        p013kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(C().getComponents().getLookupTracker(), location, getOwnerDescriptor(), name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
        Set<SimpleFunctionDescriptor> setO0 = O0(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            Set<SimpleFunctionDescriptor> set = setO0;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((FunctionDescriptor) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (S0((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            h0(result, name, arrayList, false);
            return;
        }
        SmartSet smartSetCreate = SmartSet.Companion.create();
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, setO0, v.m(), getOwnerDescriptor(), ErrorReporter.DO_NOTHING, C().getComponents().getKotlinTypeChecker().getOverridingUtil());
        s.j(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        i0(name, result, collectionResolveOverridesForNonStaticMembers, result, new a(this));
        i0(name, result, collectionResolveOverridesForNonStaticMembers, smartSetCreate, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setO0) {
            if (S0((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        h0(result, name, v.P0(arrayList2, smartSetCreate), true);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void t(Name name, Collection<PropertyDescriptor> result) {
        s.k(name, "name");
        s.k(result, "result");
        if (this.f87293n.isAnnotationType()) {
            k0(name, result);
        }
        Set<PropertyDescriptor> setQ0 = Q0(name);
        if (setQ0.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetCreate = companion.create();
        SmartSet smartSetCreate2 = companion.create();
        j0(setQ0, result, smartSetCreate, new q(this));
        j0(d1.l(setQ0, smartSetCreate), smartSetCreate2, null, new r(this));
        Collection<? extends PropertyDescriptor> collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, d1.n(setQ0, smartSetCreate2), result, getOwnerDescriptor(), C().getComponents().getErrorReporter(), C().getComponents().getKotlinTypeChecker().getOverridingUtil());
        s.j(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionResolveOverridesForNonStaticMembers);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.f87293n.getFqName();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> u(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        if (this.f87293n.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) E().invoke()).getFieldNames());
        Collection<KotlinType> supertypes = getOwnerDescriptor().getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            v.E(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(LazyJavaResolverContext c11, ClassDescriptor ownerDescriptor, JavaClass jClass, boolean z11, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c11, lazyJavaClassMemberScope);
        s.k(c11, "c");
        s.k(ownerDescriptor, "ownerDescriptor");
        s.k(jClass, "jClass");
        this.f87292m = ownerDescriptor;
        this.f87293n = jClass;
        this.f87294o = z11;
        this.f87295p = c11.getStorageManager().createLazyValue(new j(this, c11));
        this.f87296q = c11.getStorageManager().createLazyValue(new k(this));
        this.f87297r = c11.getStorageManager().createLazyValue(new l(c11, this));
        this.f87298s = c11.getStorageManager().createLazyValue(new m(this));
        this.f87299t = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new n(this, c11));
    }
}
