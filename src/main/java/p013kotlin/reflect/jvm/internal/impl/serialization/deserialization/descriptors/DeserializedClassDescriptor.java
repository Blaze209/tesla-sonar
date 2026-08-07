package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bo0.n;
import co0.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ProtoBuf.Class f88673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BinaryVersion f88674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SourceElement f88675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ClassId f88676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Modality f88677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final DescriptorVisibility f88678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ClassKind f88679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DeserializationContext f88680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f88681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MemberScopeImpl f88682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f88683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ScopesHolderForClass<DeserializedClassMemberScope> f88684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f88685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final DeclarationDescriptor f88686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final NullableLazyValue<ClassConstructorDescriptor> f88687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> f88688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final NullableLazyValue<ClassDescriptor> f88689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final NotNullLazyValue<Collection<ClassDescriptor>> f88690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final NullableLazyValue<ValueClassRepresentation<SimpleType>> f88691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ProtoContainer.Class f88692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Annotations f88693y;

    /* JADX INFO: Access modifiers changed from: private */
    final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final KotlinTypeRefiner f88694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> f88695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue<Collection<KotlinType>> f88696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ DeserializedClassDescriptor f88697i;

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f88697i = deserializedClassDescriptor;
            DeserializationContext c11 = deserializedClassDescriptor.getC();
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            s.j(functionList, "getFunctionList(...)");
            List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
            s.j(propertyList, "getPropertyList(...)");
            List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
            s.j(typeAliasList, "getTypeAliasList(...)");
            List<Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
            s.j(nestedClassNameList, "getNestedClassNameList(...)");
            List<Integer> list = nestedClassNameList;
            NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it.next()).intValue()));
            }
            super(c11, functionList, propertyList, typeAliasList, new g(arrayList));
            this.f88694f = kotlinTypeRefiner;
            this.f88695g = l().getStorageManager().createLazyValue(new h(this));
            this.f88696h = l().getStorageManager().createLazyValue(new i(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection A(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.f88694f.refineSupertypes(deserializedClassMemberScope.z());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(List list) {
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection x(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.f(DescriptorKindFilter.ALL, MemberScope.Companion.getALL_NAME_FILTER(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        }

        private final <D extends CallableMemberDescriptor> void y(Name name, Collection<? extends D> collection, final List<D> list) {
            l().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, collection, new ArrayList(list), z(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                protected void a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                    s.k(fromSuper, "fromSuper");
                    s.k(fromCurrent, "fromCurrent");
                    if (fromCurrent instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) fromCurrent).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, fromSuper);
                    }
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                    s.k(fakeOverride, "fakeOverride");
                    OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                    list.add((D) fakeOverride);
                }
            });
        }

        private final DeserializedClassDescriptor z() {
            return this.f88697i;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void c(Collection<DeclarationDescriptor> result, l<? super Name, Boolean> nameFilter) {
            s.k(result, "result");
            s.k(nameFilter, "nameFilter");
            b bVar = z().f88685q;
            List listD = bVar != null ? bVar.d() : null;
            if (listD == null) {
                listD = v.m();
            }
            result.addAll(listD);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void g(Name name, List<SimpleFunctionDescriptor> functions) {
            s.k(name, "name");
            s.k(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f88696h.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            functions.addAll(l().getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.f88697i));
            y(name, arrayList, functions);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: getContributedClassifier */
        public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
            ClassDescriptor classDescriptorI;
            s.k(name, "name");
            s.k(location, "location");
            mo504recordLookup(name, location);
            b bVar = z().f88685q;
            return (bVar == null || (classDescriptorI = bVar.i(name)) == null) ? super.mo501getContributedClassifier(name, location) : classDescriptorI;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
            s.k(kindFilter, "kindFilter");
            s.k(nameFilter, "nameFilter");
            return (Collection) this.f88695g.invoke();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            mo504recordLookup(name, location);
            return super.getContributedFunctions(name, location);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            mo504recordLookup(name, location);
            return super.getContributedVariables(name, location);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void h(Name name, List<PropertyDescriptor> descriptors) {
            s.k(name, "name");
            s.k(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f88696h.invoke()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            y(name, arrayList, descriptors);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected ClassId i(Name name) {
            s.k(name, "name");
            return this.f88697i.f88676h.createNestedClassId(name);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> n() {
            List<KotlinType> supertypes = z().f88683o.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                Set<Name> classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
                if (classifierNames == null) {
                    return null;
                }
                v.E(linkedHashSet, classifierNames);
            }
            return linkedHashSet;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> o() {
            List<KotlinType> supertypes = z().f88683o.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                v.E(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(l().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.f88697i));
            return linkedHashSet;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> p() {
            List<KotlinType> supertypes = z().f88683o.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = supertypes.iterator();
            while (it.hasNext()) {
                v.E(linkedHashSet, ((KotlinType) it.next()).getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: recordLookup */
        public void mo504recordLookup(Name name, LookupLocation location) {
            s.k(name, "name");
            s.k(location, "location");
            UtilsKt.record(l().getComponents().getLookupTracker(), location, z(), name);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected boolean s(SimpleFunctionDescriptor function) {
            s.k(function, "function");
            return l().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.f88697i, function);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends AbstractClassTypeConstructor {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue<List<TypeParameterDescriptor>> f88699d;

        public a() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.f88699d = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new j(DeserializedClassDescriptor.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List D(DeserializedClassDescriptor deserializedClassDescriptor) {
            return TypeParameterUtilsKt.computeConstructorTypeParameters(deserializedClassDescriptor);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor mo500getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.f88699d.invoke();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> l() {
            String strAsString;
            FqName fqNameAsSingleFqName;
            List<ProtoBuf.Type> listSupertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(v.y(listSupertypes, 10));
            Iterator<T> it = listSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it.next()));
            }
            List listP0 = v.P0(arrayList, DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it2 = listP0.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = ((KotlinType) it2.next()).getConstructor().mo500getDeclarationDescriptor();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo500getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = fqNameAsSingleFqName.asString()) == null) {
                        strAsString = mockClassDescriptor2.getName().asString();
                        s.j(strAsString, "asString(...)");
                    }
                    arrayList3.add(strAsString);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor2, arrayList3);
            }
            return v.m1(listP0);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker p() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            s.j(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Name, ProtoBuf.EnumEntry> f88701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> f88702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NotNullLazyValue<Set<Name>> f88703c;

        public b() {
            List<ProtoBuf.EnumEntry> enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            s.j(enumEntryList, "getEnumEntryList(...)");
            List<ProtoBuf.EnumEntry> list = enumEntryList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.getName(DeserializedClassDescriptor.this.getC().getNameResolver(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.f88701a = linkedHashMap;
            this.f88702b = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new k(this, DeserializedClassDescriptor.this));
            this.f88703c = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new l(this));
        }

        private final Set<Name> e() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                    }
                }
            }
            List<ProtoBuf.Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            s.j(functionList, "getFunctionList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            List<ProtoBuf.Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            s.j(propertyList, "getPropertyList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.getName(deserializedClassDescriptor2.getC().getNameResolver(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return d1.n(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClassDescriptor f(b bVar, DeserializedClassDescriptor deserializedClassDescriptor, Name name) {
            s.k(name, "name");
            ProtoBuf.EnumEntry enumEntry = bVar.f88701a.get(name);
            if (enumEntry != null) {
                return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name, bVar.f88703c, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new m(deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
            return v.m1(deserializedClassDescriptor.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(deserializedClassDescriptor.getThisAsProtoContainer$deserialization(), enumEntry));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(b bVar) {
            return bVar.e();
        }

        public final Collection<ClassDescriptor> d() {
            Set<Name> setKeySet = this.f88701a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor classDescriptorI = i((Name) it.next());
                if (classDescriptorI != null) {
                    arrayList.add(classDescriptorI);
                }
            }
            return arrayList;
        }

        public final ClassDescriptor i(Name name) {
            s.k(name, "name");
            return (ClassDescriptor) this.f88702b.invoke(name);
        }
    }

    /* synthetic */ class c extends o implements l<ProtoBuf.Type, SimpleType> {
        c(Object obj) {
            super(1, obj);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(ProtoBuf.Type p11) {
            s.k(p11, "p0");
            return TypeDeserializer.simpleType$default((TypeDeserializer) this.receiver, p11, false, 2, null);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "simpleType";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(s.a.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* synthetic */ class d extends o implements l<Name, SimpleType> {
        d(Object obj) {
            super(1, obj);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(Name p11) {
            s.k(p11, "p0");
            return ((DeserializedClassDescriptor) this.receiver).r(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "getValueClassPropertyType";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(DeserializedClassDescriptor.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    /* synthetic */ class e extends o implements l<KotlinTypeRefiner, DeserializedClassMemberScope> {
        e(Object obj) {
            super(1, obj);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeserializedClassMemberScope invoke(KotlinTypeRefiner p11) {
            s.k(p11, "p0");
            return new DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "<init>";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(DeserializedClassMemberScope.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion metadataVersion, SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(outerContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName()).getShortClassName());
        s.k(outerContext, "outerContext");
        s.k(classProto, "classProto");
        s.k(nameResolver, "nameResolver");
        s.k(metadataVersion, "metadataVersion");
        s.k(sourceElement, "sourceElement");
        this.f88673e = classProto;
        this.f88674f = metadataVersion;
        this.f88675g = sourceElement;
        this.f88676h = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        this.f88677i = protoEnumFlags.modality(Flags.MODALITY.get(classProto.getFlags()));
        this.f88678j = ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(classProto.getFlags()));
        ClassKind classKind = protoEnumFlags.classKind(Flags.CLASS_KIND.get(classProto.getFlags()));
        this.f88679k = classKind;
        List<ProtoBuf.TypeParameter> typeParameterList = classProto.getTypeParameterList();
        s.j(typeParameterList, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTable = classProto.getTypeTable();
        s.j(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = classProto.getVersionRequirementTable();
        s.j(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextChildContext = outerContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion);
        this.f88680l = deserializationContextChildContext;
        Boolean bool = Flags.HAS_ENUM_ENTRIES.get(classProto.getFlags());
        s.j(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        this.f88681m = zBooleanValue;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        if (classKind == classKind2) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextChildContext.getStorageManager(), this, zBooleanValue || s.f(deserializationContextChildContext.getComponents().getEnumEntriesDeserializationSupport().canSynthesizeEnumEntries(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.INSTANCE;
        }
        this.f88682n = staticScopeForKotlinEnum;
        this.f88683o = new a();
        this.f88684p = ScopesHolderForClass.Companion.create(this, deserializationContextChildContext.getStorageManager(), deserializationContextChildContext.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new e(this));
        this.f88685q = classKind == classKind2 ? new b() : null;
        DeclarationDescriptor containingDeclaration = outerContext.getContainingDeclaration();
        this.f88686r = containingDeclaration;
        this.f88687s = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a(this));
        this.f88688t = deserializationContextChildContext.getStorageManager().createLazyValue(new p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.b(this));
        this.f88689u = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c(this));
        this.f88690v = deserializationContextChildContext.getStorageManager().createLazyValue(new p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d(this));
        this.f88691w = deserializationContextChildContext.getStorageManager().createNullableLazyValue(new p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e(this));
        NameResolver nameResolver2 = deserializationContextChildContext.getNameResolver();
        TypeTable typeTable3 = deserializationContextChildContext.getTypeTable();
        DeserializedClassDescriptor deserializedClassDescriptor = containingDeclaration instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) containingDeclaration : null;
        this.f88692x = new ProtoContainer.Class(classProto, nameResolver2, typeTable3, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f88692x : null);
        this.f88693y = !Flags.HAS_ANNOTATIONS.get(classProto.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(deserializationContextChildContext.getStorageManager(), new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List h(DeserializedClassDescriptor deserializedClassDescriptor) {
        return v.m1(deserializedClassDescriptor.f88680l.getComponents().getAnnotationAndConstantLoader().loadClassAnnotations(deserializedClassDescriptor.f88692x));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor i(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.j();
    }

    private final ClassDescriptor j() {
        if (!this.f88673e.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = q().mo501getContributedClassifier(NameResolverUtilKt.getName(this.f88680l.getNameResolver(), this.f88673e.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo501getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo501getContributedClassifier;
        }
        return null;
    }

    private final Collection<ClassConstructorDescriptor> k() {
        return v.P0(v.P0(m(), v.q(mo495getUnsubstitutedPrimaryConstructor())), this.f88680l.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    private final ClassConstructorDescriptor l() {
        Object next;
        if (this.f88679k.isSingleton()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplCreatePrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            classConstructorDescriptorImplCreatePrimaryConstructorForObject.setReturnType(getDefaultType());
            return classConstructorDescriptorImplCreatePrimaryConstructorForObject;
        }
        List<ProtoBuf.Constructor> constructorList = this.f88673e.getConstructorList();
        s.j(constructorList, "getConstructorList(...)");
        Iterator<T> it = constructorList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) next).getFlags()).booleanValue());
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.f88680l.getMemberDeserializer().loadConstructor(constructor, true);
        }
        return null;
    }

    private final List<ClassConstructorDescriptor> m() {
        List<ProtoBuf.Constructor> constructorList = this.f88673e.getConstructorList();
        s.j(constructorList, "getConstructorList(...)");
        ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
        for (Object obj : constructorList) {
            Boolean bool = Flags.IS_SECONDARY.get(((ProtoBuf.Constructor) obj).getFlags());
            s.j(bool, "get(...)");
            if (bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        for (ProtoBuf.Constructor constructor : arrayList) {
            MemberDeserializer memberDeserializer = this.f88680l.getMemberDeserializer();
            s.h(constructor);
            arrayList2.add(memberDeserializer.loadConstructor(constructor, false));
        }
        return arrayList2;
    }

    private final Collection<ClassDescriptor> n() {
        if (this.f88677i != Modality.SEALED) {
            return v.m();
        }
        List<Integer> sealedSubclassFqNameList = this.f88673e.getSealedSubclassFqNameList();
        s.h(sealedSubclassFqNameList);
        if (sealedSubclassFqNameList.isEmpty()) {
            return CliSealedClassInheritorsProvider.INSTANCE.computeSealedSubclasses(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents components = this.f88680l.getComponents();
            NameResolver nameResolver = this.f88680l.getNameResolver();
            s.h(num);
            ClassDescriptor classDescriptorDeserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (classDescriptorDeserializeClass != null) {
                arrayList.add(classDescriptorDeserializeClass);
            }
        }
        return arrayList;
    }

    private final ValueClassRepresentation<SimpleType> o() {
        if (!isInline() && !isValue()) {
            return null;
        }
        ValueClassRepresentation<SimpleType> valueClassRepresentationLoadValueClassRepresentation = ValueClassUtilKt.loadValueClassRepresentation(this.f88673e, this.f88680l.getNameResolver(), this.f88680l.getTypeTable(), new c(this.f88680l.getTypeDeserializer()), new d(this));
        if (valueClassRepresentationLoadValueClassRepresentation != null) {
            return valueClassRepresentationLoadValueClassRepresentation;
        }
        if (this.f88674f.isAtLeast(1, 5, 1)) {
            return null;
        }
        ClassConstructorDescriptor classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor = mo495getUnsubstitutedPrimaryConstructor();
        if (classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo495getUnsubstitutedPrimaryConstructor.getValueParameters();
        s.j(valueParameters, "getValueParameters(...)");
        Name name = ((ValueParameterDescriptor) v.o0(valueParameters)).getName();
        s.j(name, "getName(...)");
        SimpleType simpleTypeR = r(name);
        if (simpleTypeR != null) {
            return new InlineClassRepresentation(name, simpleTypeR);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection p(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.k();
    }

    private final DeserializedClassMemberScope q() {
        return (DeserializedClassMemberScope) this.f88684p.getScope(this.f88680l.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleType r(Name name) {
        Iterator<T> it = q().getContributedVariables(name, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z11 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z11) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((PropertyDescriptor) next).getExtensionReceiverParameter() == null) {
                if (!z11) {
                    z11 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        return (SimpleType) (propertyDescriptor != null ? propertyDescriptor.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassConstructorDescriptor s(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueClassRepresentation u(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.o();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f88693y;
    }

    public final DeserializationContext getC() {
        return this.f88680l;
    }

    public final ProtoBuf.Class getClassProto() {
        return this.f88673e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo494getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.f88689u.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.f88688t.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.f88686r;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(this.f88673e, this.f88680l.getTypeTable());
        ArrayList arrayList = new ArrayList(v.y(listContextReceiverTypes, 10));
        Iterator<T> it = listContextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(getThisAsReceiverParameter(), new ContextClassReceiver(this, this.f88680l.getTypeDeserializer().type((ProtoBuf.Type) it.next()), null, null), Annotations.Companion.getEMPTY()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f88680l.getTypeDeserializer().getOwnTypeParameters();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return this.f88679k;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.f88674f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return this.f88677i;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        return (Collection) this.f88690v.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        return this.f88675g;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.f88692x;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f88683o;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    protected MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f88684p.getScope(kotlinTypeRefiner);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.f88687s.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return (ValueClassRepresentation) this.f88691w.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f88678j;
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        s.k(name, "name");
        return q().getClassNames$deserialization().contains(name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return Flags.CLASS_KIND.get(this.f88673e.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.f88673e.getFlags());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.f88673e.getFlags());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.f88673e.getFlags());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        Boolean bool = Flags.IS_FUN_INTERFACE.get(this.f88673e.getFlags());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.IS_VALUE_CLASS.get(this.f88673e.getFlags()).booleanValue() && this.f88674f.isAtMost(1, 4, 1);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.f88673e.getFlags());
        s.j(bool, "get(...)");
        return bool.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return Flags.IS_VALUE_CLASS.get(this.f88673e.getFlags()).booleanValue() && this.f88674f.isAtLeast(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(isExpect() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScopeImpl getStaticScope() {
        return this.f88682n;
    }
}
