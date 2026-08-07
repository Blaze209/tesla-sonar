package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartList;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeIntersectionScope extends AbstractScopeAdapter {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MemberScope f88538b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope create(String message, Collection<? extends KotlinType> types) {
            s.k(message, "message");
            s.k(types, "types");
            Collection<? extends KotlinType> collection = types;
            ArrayList arrayList = new ArrayList(v.y(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((KotlinType) it.next()).getMemberScope());
            }
            SmartList<MemberScope> smartListListOfNonEmptyScopes = ScopeUtilsKt.listOfNonEmptyScopes(arrayList);
            MemberScope memberScopeCreateOrSingle$descriptors = ChainedMemberScope.Companion.createOrSingle$descriptors(message, smartListListOfNonEmptyScopes);
            return smartListListOfNonEmptyScopes.size() <= 1 ? memberScopeCreateOrSingle$descriptors : new TypeIntersectionScope(message, memberScopeCreateOrSingle$descriptors, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeIntersectionScope(String str, MemberScope memberScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScope);
    }

    public static final MemberScope create(String str, Collection<? extends KotlinType> collection) {
        return Companion.create(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor e(CallableDescriptor selectMostSpecificInEachOverridableGroup) {
        s.k(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor f(SimpleFunctionDescriptor selectMostSpecificInEachOverridableGroup) {
        s.k(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CallableDescriptor g(PropertyDescriptor selectMostSpecificInEachOverridableGroup) {
        s.k(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected MemberScope a() {
        return this.f88538b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> contributedDescriptors = super.getContributedDescriptors(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (((DeclarationDescriptor) obj) instanceof CallableDescriptor) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        s.i(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return v.P0(OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list, j.f88548a), list2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedFunctions(name, location), h.f88546a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(super.getContributedVariables(name, location), i.f88547a);
    }

    private TypeIntersectionScope(String str, MemberScope memberScope) {
        this.f88537a = str;
        this.f88538b = memberScope;
    }
}
