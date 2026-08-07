package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AnnotationDeserializer f88582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, SerializerExtensionProtocol protocol) {
        super(protocol);
        s.k(module, "module");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(protocol, "protocol");
        this.f88582b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadAnnotationDefaultValue(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(expectedType, "expectedType");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public AnnotationDescriptor loadAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        return this.f88582b.deserializeAnnotation(proto, nameResolver);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public ConstantValue<?> loadPropertyConstant(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.getExtensionOrNull(proto, a().getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.f88582b.resolveValue(expectedType, value, container.getNameResolver());
    }
}
