package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ProtoBuf.TypeAlias f88741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final NameResolver f88742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TypeTable f88743m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final VersionRequirementTable f88744n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final DeserializedContainerSource f88745o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SimpleType f88746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SimpleType f88747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<? extends TypeParameterDescriptor> f88748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SimpleType f88749s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DescriptorVisibility visibility, ProtoBuf.TypeAlias proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        s.k(storageManager, "storageManager");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(annotations, "annotations");
        s.k(name, "name");
        s.k(visibility, "visibility");
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        s.k(versionRequirementTable, "versionRequirementTable");
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        s.j(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f88741k = proto;
        this.f88742l = nameResolver;
        this.f88743m = typeTable;
        this.f88744n = versionRequirementTable;
        this.f88745o = deserializedContainerSource;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public ClassDescriptor getClassDescriptor() {
        if (KotlinTypeKt.isError(getExpandedType())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = getExpandedType().getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource getContainerSource() {
        return this.f88745o;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = this.f88749s;
        if (simpleType != null) {
            return simpleType;
        }
        s.B("defaultTypeImpl");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getExpandedType() {
        SimpleType simpleType = this.f88747q;
        if (simpleType != null) {
            return simpleType;
        }
        s.B("expandedType");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver getNameResolver() {
        return this.f88742l;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable getTypeTable() {
        return this.f88743m;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType getUnderlyingType() {
        SimpleType simpleType = this.f88746p;
        if (simpleType != null) {
            return simpleType;
        }
        s.B("underlyingType");
        return null;
    }

    public VersionRequirementTable getVersionRequirementTable() {
        return this.f88744n;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    protected List<TypeParameterDescriptor> h() {
        List list = this.f88748r;
        if (list != null) {
            return list;
        }
        s.B("typeConstructorParameters");
        return null;
    }

    public final void initialize(List<? extends TypeParameterDescriptor> declaredTypeParameters, SimpleType underlyingType, SimpleType expandedType) {
        s.k(declaredTypeParameters, "declaredTypeParameters");
        s.k(underlyingType, "underlyingType");
        s.k(expandedType, "expandedType");
        initialize(declaredTypeParameters);
        this.f88746p = underlyingType;
        this.f88747q = expandedType;
        this.f88748r = TypeParameterUtilsKt.computeConstructorTypeParameters(this);
        this.f88749s = e();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public ProtoBuf.TypeAlias getProto() {
        return this.f88741k;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public TypeAliasDescriptor substitute(TypeSubstitutor substitutor) {
        s.k(substitutor, "substitutor");
        if (substitutor.isEmpty()) {
            return this;
        }
        StorageManager storageManager = getStorageManager();
        DeclarationDescriptor containingDeclaration = getContainingDeclaration();
        s.j(containingDeclaration, "getContainingDeclaration(...)");
        Annotations annotations = getAnnotations();
        s.j(annotations, "<get-annotations>(...)");
        Name name = getName();
        s.j(name, "getName(...)");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List<TypeParameterDescriptor> declaredTypeParameters = getDeclaredTypeParameters();
        SimpleType underlyingType = getUnderlyingType();
        Variance variance = Variance.INVARIANT;
        KotlinType kotlinTypeSafeSubstitute = substitutor.safeSubstitute(underlyingType, variance);
        s.j(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(kotlinTypeSafeSubstitute);
        KotlinType kotlinTypeSafeSubstitute2 = substitutor.safeSubstitute(getExpandedType(), variance);
        s.j(kotlinTypeSafeSubstitute2, "safeSubstitute(...)");
        deserializedTypeAliasDescriptor.initialize(declaredTypeParameters, simpleTypeAsSimpleType, TypeSubstitutionKt.asSimpleType(kotlinTypeSafeSubstitute2));
        return deserializedTypeAliasDescriptor;
    }
}
