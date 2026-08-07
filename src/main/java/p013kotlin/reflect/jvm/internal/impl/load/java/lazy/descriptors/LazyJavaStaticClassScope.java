package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final JavaClass f87336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JavaClassDescriptor f87337n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext c11, JavaClass jClass, JavaClassDescriptor ownerDescriptor) {
        super(c11);
        s.k(c11, "c");
        s.k(jClass, "jClass");
        s.k(ownerDescriptor, "ownerDescriptor");
        this.f87336m = jClass;
        this.f87337n = ownerDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(JavaMember it) {
        s.k(it, "it");
        return it.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d0(Name name, MemberScope it) {
        s.k(it, "it");
        return it.getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection e0(MemberScope it) {
        s.k(it, "it");
        return it.getVariableNames();
    }

    private final <R> Set<R> f0(final ClassDescriptor classDescriptor, final Set<R> set, final l<? super MemberScope, ? extends Collection<? extends R>> lVar) {
        DFS.dfs(v.e(classDescriptor), n0.f87375a, new DFS.AbstractNodeHandler<ClassDescriptor, h0>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2
            /* JADX INFO: renamed from: result, reason: collision with other method in class */
            public void m498result() {
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(ClassDescriptor current) {
                s.k(current, "current");
                if (current == classDescriptor) {
                    return true;
                }
                MemberScope staticScope = current.getStaticScope();
                s.j(staticScope, "getStaticScope(...)");
                if (!(staticScope instanceof LazyJavaStaticScope)) {
                    return true;
                }
                set.addAll((Collection<? extends R>) ((Collection) lVar.invoke(staticScope)));
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public /* bridge */ /* synthetic */ Object result() {
                m498result();
                return h0.f84049a;
            }
        });
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g0(ClassDescriptor classDescriptor) {
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        s.j(supertypes, "getSupertypes(...)");
        return ho0.l.z(ho0.l.V(v.e0(supertypes), o0.f87377a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor h0(KotlinType kotlinType) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
        }
        return null;
    }

    private final PropertyDescriptor j0(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(v.y(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            s.h(propertyDescriptor2);
            arrayList.add(j0(propertyDescriptor2));
        }
        return (PropertyDescriptor) v.U0(v.h0(arrayList));
    }

    private final Set<SimpleFunctionDescriptor> k0(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        return parentJavaStaticClassScope == null ? d1.d() : v.r1(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f87336m, k0.f87367a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> computeFunctionNames(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        Set<Name> setQ1 = v.q1(((DeclaredMemberIndex) E().invoke()).getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = d1.d();
        }
        setQ1.addAll(functionNames);
        if (this.f87336m.isEnum()) {
            setQ1.addAll(v.p(StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES));
        }
        setQ1.addAll(C().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getOwnerDescriptor(), C()));
        return setQ1;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public JavaClassDescriptor getOwnerDescriptor() {
        return this.f87337n;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> o(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void q(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
        C().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getOwnerDescriptor(), name, result, C());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(Collection<SimpleFunctionDescriptor> result, Name name) {
        s.k(result, "result");
        s.k(name, "name");
        Collection<? extends SimpleFunctionDescriptor> collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, k0(name, getOwnerDescriptor()), result, getOwnerDescriptor(), C().getComponents().getErrorReporter(), C().getComponents().getKotlinTypeChecker().getOverridingUtil());
        s.j(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionResolveOverridesForStaticMembers);
        if (this.f87336m.isEnum()) {
            if (s.f(name, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
                s.j(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (s.f(name, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
                s.j(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void t(Name name, Collection<PropertyDescriptor> result) {
        Name name2;
        Collection<PropertyDescriptor> collection;
        s.k(name, "name");
        s.k(result, "result");
        Set setF0 = f0(getOwnerDescriptor(), new LinkedHashSet(), new m0(name));
        if (result.isEmpty()) {
            name2 = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setF0) {
                PropertyDescriptor propertyDescriptorJ0 = j0((PropertyDescriptor) obj);
                Object arrayList = linkedHashMap.get(propertyDescriptorJ0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorJ0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, (Collection) ((Map.Entry) it.next()).getValue(), collection, getOwnerDescriptor(), C().getComponents().getErrorReporter(), C().getComponents().getKotlinTypeChecker().getOverridingUtil());
                s.j(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
                v.E(arrayList2, collectionResolveOverridesForStaticMembers);
            }
            collection.addAll(arrayList2);
        } else {
            name2 = name;
            collection = result;
            Collection<? extends PropertyDescriptor> collectionResolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name2, setF0, collection, getOwnerDescriptor(), C().getComponents().getErrorReporter(), C().getComponents().getKotlinTypeChecker().getOverridingUtil());
            s.j(collectionResolveOverridesForStaticMembers2, "resolveOverridesForStaticMembers(...)");
            collection.addAll(collectionResolveOverridesForStaticMembers2);
        }
        if (this.f87336m.isEnum() && s.f(name2, StandardNames.ENUM_ENTRIES)) {
            CollectionsKt.addIfNotNull(collection, DescriptorFactory.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected Set<Name> u(DescriptorKindFilter kindFilter, l<? super Name, Boolean> lVar) {
        s.k(kindFilter, "kindFilter");
        Set<Name> setQ1 = v.q1(((DeclaredMemberIndex) E().invoke()).getFieldNames());
        f0(getOwnerDescriptor(), setQ1, l0.f87370a);
        if (this.f87336m.isEnum()) {
            setQ1.add(StandardNames.ENUM_ENTRIES);
        }
        return setQ1;
    }
}
