package p013kotlin.reflect.jvm.internal.impl.types.error;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ThrowingScope extends ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(ErrorScopeKind kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        s.k(kind, "kind");
        s.k(formatParams, "formatParams");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        throw new IllegalStateException(a() + ", required name: " + name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        throw new IllegalStateException(a());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        throw new IllegalStateException();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    public String toString() {
        return "ThrowingScope{" + a() + CoreConstants.CURLY_RIGHT;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Set<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        throw new IllegalStateException(a() + ", required name: " + name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        throw new IllegalStateException(a() + ", required name: " + name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup, reason: merged with bridge method [inline-methods] */
    public Void mo504recordLookup(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        throw new IllegalStateException();
    }
}
