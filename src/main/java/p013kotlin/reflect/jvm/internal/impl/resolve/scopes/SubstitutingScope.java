package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MemberScope f88532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f88533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeSubstitutor f88534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<DeclarationDescriptor, DeclarationDescriptor> f88535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f88536e;

    public SubstitutingScope(MemberScope workerScope, TypeSubstitutor givenSubstitutor) {
        s.k(workerScope, "workerScope");
        s.k(givenSubstitutor, "givenSubstitutor");
        this.f88532a = workerScope;
        this.f88533b = m.b(new f(givenSubstitutor));
        TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        s.j(substitution, "getSubstitution(...)");
        this.f88534c = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this.f88536e = m.b(new g(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection a(SubstitutingScope substitutingScope) {
        return substitutingScope.e(ResolutionScope.DefaultImpls.getContributedDescriptors$default(substitutingScope.f88532a, null, null, 3, null));
    }

    private final Collection<DeclarationDescriptor> d() {
        return (Collection) this.f88536e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <D extends DeclarationDescriptor> Collection<D> e(Collection<? extends D> collection) {
        if (this.f88534c.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(f((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }

    private final <D extends DeclarationDescriptor> D f(D d11) {
        if (this.f88534c.isEmpty()) {
            return d11;
        }
        if (this.f88535d == null) {
            this.f88535d = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.f88535d;
        s.h(map);
        DeclarationDescriptor declarationDescriptorSubstitute = map.get(d11);
        if (declarationDescriptorSubstitute == null) {
            if (!(d11 instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d11).toString());
            }
            declarationDescriptorSubstitute = ((Substitutable) d11).substitute(this.f88534c);
            if (declarationDescriptorSubstitute == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d11 + " substitution fails");
            }
            map.put(d11, declarationDescriptorSubstitute);
        }
        D d12 = (D) declarationDescriptorSubstitute;
        s.i(d12, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeSubstitutor g(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.getSubstitution().buildSubstitutor();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return this.f88532a.getClassifierNames();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = this.f88532a.mo501getContributedClassifier(name, location);
        if (classifierDescriptorMo501getContributedClassifier != null) {
            return (ClassifierDescriptor) f(classifierDescriptorMo501getContributedClassifier);
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        return d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return e(this.f88532a.getContributedFunctions(name, location));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        return e(this.f88532a.getContributedVariables(name, location));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.f88532a.getFunctionNames();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.f88532a.getVariableNames();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo504recordLookup(Name name, LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }
}
