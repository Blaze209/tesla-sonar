package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87259e = {o0.k(new f0(o0.b(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageFragment f87261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LazyJavaPackageScope f87262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f87263d;

    public JvmPackageScope(LazyJavaResolverContext c11, JavaPackage jPackage, LazyJavaPackageFragment packageFragment) {
        s.k(c11, "c");
        s.k(jPackage, "jPackage");
        s.k(packageFragment, "packageFragment");
        this.f87260a = c11;
        this.f87261b = packageFragment;
        this.f87262c = new LazyJavaPackageScope(c11, jPackage, packageFragment);
        this.f87263d = c11.getStorageManager().createLazyValue(new b(this));
    }

    private final MemberScope[] b() {
        return (MemberScope[]) StorageKt.getValue(this.f87263d, this, (m<?>) f87259e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope[] c(JvmPackageScope jvmPackageScope) {
        Collection<KotlinJvmBinaryClass> collectionValues = jvmPackageScope.f87261b.getBinaryClasses$descriptors_jvm().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            MemberScope memberScopeCreateKotlinPackagePartScope = jvmPackageScope.f87260a.getComponents().getDeserializedDescriptorResolver().createKotlinPackagePartScope(jvmPackageScope.f87261b, (KotlinJvmBinaryClass) it.next());
            if (memberScopeCreateKotlinPackagePartScope != null) {
                arrayList.add(memberScopeCreateKotlinPackagePartScope);
            }
        }
        return (MemberScope[]) ScopeUtilsKt.listOfNonEmptyScopes(arrayList).toArray(new MemberScope[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        Set<Name> setFlatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(n.Y(b()));
        if (setFlatMapClassifierNamesOrNull == null) {
            return null;
        }
        setFlatMapClassifierNamesOrNull.addAll(this.f87262c.getClassifierNames());
        return setFlatMapClassifierNamesOrNull;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        ClassDescriptor classDescriptorMo501getContributedClassifier = this.f87262c.mo501getContributedClassifier(name, location);
        if (classDescriptorMo501getContributedClassifier != null) {
            return classDescriptorMo501getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : b()) {
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
        LazyJavaPackageScope lazyJavaPackageScope = this.f87262c;
        MemberScope[] memberScopeArrB = b();
        Collection<DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrB) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors == null ? d1.d() : contributedDescriptors;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f87262c;
        MemberScope[] memberScopeArrB = b();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, location);
        int length = memberScopeArrB.length;
        int i11 = 0;
        Collection collection = contributedFunctions;
        while (i11 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrB[i11].getContributedFunctions(name, location));
            i11++;
            collection = collectionConcat;
        }
        return collection == null ? d1.d() : collection;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        LazyJavaPackageScope lazyJavaPackageScope = this.f87262c;
        MemberScope[] memberScopeArrB = b();
        Collection<? extends PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name, location);
        int length = memberScopeArrB.length;
        int i11 = 0;
        Collection collection = contributedVariables;
        while (i11 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrB[i11].getContributedVariables(name, location));
            i11++;
            collection = collectionConcat;
        }
        return collection == null ? d1.d() : collection;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArrB = b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrB) {
            v.E(linkedHashSet, memberScope.getFunctionNames());
        }
        linkedHashSet.addAll(this.f87262c.getFunctionNames());
        return linkedHashSet;
    }

    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.f87262c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArrB = b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrB) {
            v.E(linkedHashSet, memberScope.getVariableNames());
        }
        linkedHashSet.addAll(this.f87262c.getVariableNames());
        return linkedHashSet;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo504recordLookup(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        UtilsKt.record(this.f87260a.getComponents().getLookupTracker(), location, this.f87261b, name);
    }

    public String toString() {
        return "scope for " + this.f87261b;
    }
}
