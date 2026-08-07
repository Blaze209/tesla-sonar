package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PackageFragmentDescriptor f88738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f88739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FqName f88740h;

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageDescriptor, ProtoBuf.Package proto, NameResolver nameResolver, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, DeserializationComponents components, String debugName, a<? extends Collection<Name>> classNames) {
        s.k(packageDescriptor, "packageDescriptor");
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(metadataVersion, "metadataVersion");
        s.k(components, "components");
        s.k(debugName, "debugName");
        s.k(classNames, "classNames");
        ProtoBuf.TypeTable typeTable = proto.getTypeTable();
        s.j(typeTable, "getTypeTable(...)");
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = proto.getVersionRequirementTable();
        s.j(versionRequirementTable, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextCreateContext = components.createContext(packageDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), metadataVersion, deserializedContainerSource);
        List<ProtoBuf.Function> functionList = proto.getFunctionList();
        s.j(functionList, "getFunctionList(...)");
        List<ProtoBuf.Property> propertyList = proto.getPropertyList();
        s.j(propertyList, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> typeAliasList = proto.getTypeAliasList();
        s.j(typeAliasList, "getTypeAliasList(...)");
        super(deserializationContextCreateContext, functionList, propertyList, typeAliasList, classNames);
        this.f88738f = packageDescriptor;
        this.f88739g = debugName;
        this.f88740h = packageDescriptor.getFqName();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected void c(Collection<DeclarationDescriptor> result, l<? super Name, Boolean> nameFilter) {
        s.k(result, "result");
        s.k(nameFilter, "nameFilter");
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo501getContributedClassifier(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        mo504recordLookup(name, location);
        return super.mo501getContributedClassifier(name, location);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, l lVar) {
        return getContributedDescriptors(descriptorKindFilter, (l<? super Name, Boolean>) lVar);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected ClassId i(Name name) {
        s.k(name, "name");
        return new ClassId(this.f88740h, name);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> n() {
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> o() {
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> p() {
        return d1.d();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected boolean r(Name name) {
        s.k(name, "name");
        if (super.r(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = l().getComponents().getFictitiousClassDescriptorFactories();
        if ((fictitiousClassDescriptorFactories instanceof Collection) && ((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            return false;
        }
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            if (it.next().shouldCreateClass(this.f88740h, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo504recordLookup(Name name, LookupLocation location) {
        s.k(name, "name");
        s.k(location, "location");
        UtilsKt.record(l().getComponents().getLookupTracker(), location, this.f88738f, name);
    }

    public String toString() {
        return this.f88739g;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, l<? super Name, Boolean> nameFilter) {
        s.k(kindFilter, "kindFilter");
        s.k(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> collectionF = f(kindFilter, nameFilter, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = l().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            v.E(arrayList, it.next().getAllContributedClassesIfPossible(this.f88740h));
        }
        return v.P0(collectionF, arrayList);
    }
}
