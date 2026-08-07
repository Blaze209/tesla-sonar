package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f88617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NameResolver f88618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DeclarationDescriptor f88619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeTable f88620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VersionRequirementTable f88621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BinaryVersion f88622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DeserializedContainerSource f88623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TypeDeserializer f88624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MemberDeserializer f88625i;

    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameters) {
        String presentableString;
        s.k(components, "components");
        s.k(nameResolver, "nameResolver");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(typeTable, "typeTable");
        s.k(versionRequirementTable, "versionRequirementTable");
        s.k(metadataVersion, "metadataVersion");
        s.k(typeParameters, "typeParameters");
        this.f88617a = components;
        this.f88618b = nameResolver;
        this.f88619c = containingDeclaration;
        this.f88620d = typeTable;
        this.f88621e = versionRequirementTable;
        this.f88622f = metadataVersion;
        this.f88623g = deserializedContainerSource;
        this.f88624h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + CoreConstants.DOUBLE_QUOTE_CHAR, (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString);
        this.f88625i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            nameResolver = deserializationContext.f88618b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i11 & 8) != 0) {
            typeTable = deserializationContext.f88620d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i11 & 16) != 0) {
            versionRequirementTable = deserializationContext.f88621e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i11 & 32) != 0) {
            binaryVersion = deserializationContext.f88622f;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    public final DeserializationContext childContext(DeclarationDescriptor descriptor, List<ProtoBuf.TypeParameter> typeParameterProtos, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion) {
        s.k(descriptor, "descriptor");
        s.k(typeParameterProtos, "typeParameterProtos");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        s.k(versionRequirementTable, "versionRequirementTable");
        s.k(metadataVersion, "metadataVersion");
        return new DeserializationContext(this.f88617a, nameResolver, descriptor, typeTable, VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(metadataVersion) ? versionRequirementTable : this.f88621e, metadataVersion, this.f88623g, this.f88624h, typeParameterProtos);
    }

    public final DeserializationComponents getComponents() {
        return this.f88617a;
    }

    public final DeserializedContainerSource getContainerSource() {
        return this.f88623g;
    }

    public final DeclarationDescriptor getContainingDeclaration() {
        return this.f88619c;
    }

    public final MemberDeserializer getMemberDeserializer() {
        return this.f88625i;
    }

    public final NameResolver getNameResolver() {
        return this.f88618b;
    }

    public final StorageManager getStorageManager() {
        return this.f88617a.getStorageManager();
    }

    public final TypeDeserializer getTypeDeserializer() {
        return this.f88624h;
    }

    public final TypeTable getTypeTable() {
        return this.f88620d;
    }

    public final VersionRequirementTable getVersionRequirementTable() {
        return this.f88621e;
    }
}
