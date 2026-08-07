package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final BinaryVersion f88628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final DeserializedContainerSource f88629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NameResolverImpl f88630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ProtoBasedClassDataFinder f88631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ProtoBuf.PackageFragment f88632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MemberScope f88633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor module, ProtoBuf.PackageFragment proto, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        s.k(fqName, "fqName");
        s.k(storageManager, "storageManager");
        s.k(module, "module");
        s.k(proto, "proto");
        s.k(metadataVersion, "metadataVersion");
        this.f88628h = metadataVersion;
        this.f88629i = deserializedContainerSource;
        ProtoBuf.StringTable strings = proto.getStrings();
        s.j(strings, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        s.j(qualifiedNames, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.f88630j = nameResolverImpl;
        this.f88631k = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new c(this));
        this.f88632l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SourceElement d(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, ClassId it) {
        s.k(it, "it");
        DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.f88629i;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        s.j(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection e(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        Collection<ClassId> allClassIds = deserializedPackageFragmentImpl.getClassDataFinder().getAllClassIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allClassIds) {
            ClassId classId = (ClassId) obj;
            if (!classId.isNestedClass() && !ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ClassId) it.next()).getShortClassName());
        }
        return arrayList2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope getMemberScope() {
        MemberScope memberScope = this.f88633m;
        if (memberScope != null) {
            return memberScope;
        }
        s.B("_memberScope");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(DeserializationComponents components) {
        s.k(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f88632l;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f88632l = null;
        ProtoBuf.Package r11 = packageFragment.getPackage();
        s.j(r11, "getPackage(...)");
        this.f88633m = new DeserializedPackageMemberScope(this, r11, this.f88630j, this.f88628h, this.f88629i, components, "scope of " + this, new d(this));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.f88631k;
    }
}
