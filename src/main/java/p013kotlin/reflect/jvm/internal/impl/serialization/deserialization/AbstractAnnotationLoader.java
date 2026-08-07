package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerializerExtensionProtocol f88576a;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractAnnotationLoader(SerializerExtensionProtocol protocol) {
        s.k(protocol, "protocol");
        this.f88576a = protocol;
    }

    protected final SerializerExtensionProtocol a() {
        return this.f88576a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        List listM;
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            listM = (List) ((ProtoBuf.Constructor) proto).getExtension(this.f88576a.getConstructorAnnotation());
        } else if (proto instanceof ProtoBuf.Function) {
            listM = (List) ((ProtoBuf.Function) proto).getExtension(this.f88576a.getFunctionAnnotation());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 == 1) {
                listM = (List) ((ProtoBuf.Property) proto).getExtension(this.f88576a.getPropertyAnnotation());
            } else if (i11 == 2) {
                listM = (List) ((ProtoBuf.Property) proto).getExtension(this.f88576a.getPropertyGetterAnnotation());
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listM = (List) ((ProtoBuf.Property) proto).getExtension(this.f88576a.getPropertySetterAnnotation());
            }
        }
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class container) {
        s.k(container, "container");
        List listM = (List) container.getClassProto().getExtension(this.f88576a.getClassAnnotation());
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        List listM = (List) proto.getExtension(this.f88576a.getEnumEntryAnnotation());
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(kind, "kind");
        List listM = null;
        if (proto instanceof ProtoBuf.Function) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> functionExtensionReceiverAnnotation = this.f88576a.getFunctionExtensionReceiverAnnotation();
            if (functionExtensionReceiverAnnotation != null) {
                listM = (List) ((ProtoBuf.Function) proto).getExtension(functionExtensionReceiverAnnotation);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyExtensionReceiverAnnotation = this.f88576a.getPropertyExtensionReceiverAnnotation();
            if (propertyExtensionReceiverAnnotation != null) {
                listM = (List) ((ProtoBuf.Property) proto).getExtension(propertyExtensionReceiverAnnotation);
            }
        }
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyBackingFieldAnnotation = this.f88576a.getPropertyBackingFieldAnnotation();
        List listM = propertyBackingFieldAnnotation != null ? (List) proto.getExtension(propertyBackingFieldAnnotation) : null;
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> propertyDelegatedFieldAnnotation = this.f88576a.getPropertyDelegatedFieldAnnotation();
        List listM = propertyDelegatedFieldAnnotation != null ? (List) proto.getExtension(propertyDelegatedFieldAnnotation) : null;
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        List listM = (List) proto.getExtension(this.f88576a.getTypeAnnotation());
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        List listM = (List) proto.getExtension(this.f88576a.getTypeParameterAnnotation());
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i11, ProtoBuf.ValueParameter proto) {
        s.k(container, "container");
        s.k(callableProto, "callableProto");
        s.k(kind, "kind");
        s.k(proto, "proto");
        List listM = (List) proto.getExtension(this.f88576a.getParameterAnnotation());
        if (listM == null) {
            listM = v.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(loadAnnotation((ProtoBuf.Annotation) it.next(), container.getNameResolver()));
        }
        return arrayList;
    }
}
