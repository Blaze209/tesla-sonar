package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final DeserializationContext f88750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ProtoBuf.TypeParameter f88751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final DeserializedAnnotations f88752m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext c11, ProtoBuf.TypeParameter proto, int i11) {
        s.k(c11, "c");
        s.k(proto, "proto");
        StorageManager storageManager = c11.getStorageManager();
        DeclarationDescriptor containingDeclaration = c11.getContainingDeclaration();
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = NameResolverUtilKt.getName(c11.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        ProtoBuf.TypeParameter.Variance variance = proto.getVariance();
        s.j(variance, "getVariance(...)");
        super(storageManager, containingDeclaration, empty, name, protoEnumFlags.variance(variance), proto.getReified(), i11, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.f88750k = c11;
        this.f88751l = proto;
        this.f88752m = new DeserializedAnnotations(c11.getStorageManager(), new e0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return v.m1(deserializedTypeParameterDescriptor.f88750k.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(deserializedTypeParameterDescriptor.f88751l, deserializedTypeParameterDescriptor.f88750k.getNameResolver()));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> c() {
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(this.f88751l, this.f88750k.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return v.e(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        List<ProtoBuf.Type> list = listUpperBounds;
        TypeDeserializer typeDeserializer = this.f88750k.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void reportSupertypeLoopError(KotlinType type) {
        s.k(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public DeserializedAnnotations getAnnotations() {
        return this.f88752m;
    }
}
