package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartList;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ChainedMemberScope implements MemberScope {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MemberScope[] f88499b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemberScope create(String debugName, Iterable<? extends MemberScope> scopes) {
            s.k(debugName, "debugName");
            s.k(scopes, "scopes");
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        v.F(smartList, ((ChainedMemberScope) memberScope).f88499b);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(debugName, smartList);
        }

        public final MemberScope createOrSingle$descriptors(String debugName, List<? extends MemberScope> scopes) {
            s.k(debugName, "debugName");
            s.k(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                return size != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0);
            }
            return MemberScope.Empty.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, memberScopeArr);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return MemberScopeKt.flatMapClassifierNamesOrNull(n.Y(this.f88499b));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f88499b) {
            ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = memberScope.mo501getContributedClassifier(name, location);
            if (classifierDescriptorMo501getContributedClassifier != null) {
                if (!(classifierDescriptorMo501getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo501getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo501getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo501getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        MemberScope[] memberScopeArr = this.f88499b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return v.m();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(kindFilter, nameFilter);
        }
        Collection<DeclarationDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return collectionConcat == null ? d1.d() : collectionConcat;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        MemberScope[] memberScopeArr = this.f88499b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return v.m();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, location);
        }
        Collection<SimpleFunctionDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedFunctions(name, location));
        }
        return collectionConcat == null ? d1.d() : collectionConcat;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        MemberScope[] memberScopeArr = this.f88499b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return v.m();
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, location);
        }
        Collection<PropertyDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedVariables(name, location));
        }
        return collectionConcat == null ? d1.d() : collectionConcat;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArr = this.f88499b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            v.E(linkedHashSet, memberScope.getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArr = this.f88499b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            v.E(linkedHashSet, memberScope.getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo504recordLookup(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        for (MemberScope memberScope : this.f88499b) {
            memberScope.mo504recordLookup(name, location);
        }
    }

    public String toString() {
        return this.f88498a;
    }

    private ChainedMemberScope(String str, MemberScope[] memberScopeArr) {
        this.f88498a = str;
        this.f88499b = memberScopeArr;
    }
}
