package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinClassFinder f87527a;

    public static abstract class AnnotationsContainer<A> {
        public abstract Map<MemberSignature, List<A>> getMemberAnnotations();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer container, boolean z11, boolean z12, Boolean bool, boolean z13, KotlinClassFinder kotlinClassFinder, JvmMetadataVersion jvmMetadataVersion) {
            ProtoContainer.Class outerClass;
            s.k(container, "container");
            s.k(kotlinClassFinder, "kotlinClassFinder");
            s.k(jvmMetadataVersion, "jvmMetadataVersion");
            if (z11) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + container + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                }
                if (container instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r11 = (ProtoContainer.Class) container;
                    if (r11.getKind() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classId = r11.getClassId();
                        Name nameIdentifier = Name.identifier("DefaultImpls");
                        s.j(nameIdentifier, "identifier(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, classId.createNestedClassId(nameIdentifier), jvmMetadataVersion);
                    }
                }
                if (bool.booleanValue() && (container instanceof ProtoContainer.Package)) {
                    SourceElement source = container.getSource();
                    JvmPackagePartSource jvmPackagePartSource = source instanceof JvmPackagePartSource ? (JvmPackagePartSource) source : null;
                    JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        ClassId.Companion companion = ClassId.Companion;
                        String internalName = facadeClassName.getInternalName();
                        s.j(internalName, "getInternalName(...)");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, companion.topLevel(new FqName(t.U(internalName, '/', CoreConstants.DOT, false, 4, null))), jvmMetadataVersion);
                    }
                }
            }
            if (z12 && (container instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r12 = (ProtoContainer.Class) container;
                if (r12.getKind() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (outerClass = r12.getOuterClass()) != null && (outerClass.getKind() == ProtoBuf.Class.Kind.CLASS || outerClass.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS || (z13 && (outerClass.getKind() == ProtoBuf.Class.Kind.INTERFACE || outerClass.getKind() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement source2 = outerClass.getSource();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.getBinaryClass();
                    }
                    return null;
                }
            }
            if (!(container instanceof ProtoContainer.Package) || !(container.getSource() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement source3 = container.getSource();
            s.i(source3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source3;
            KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
            return knownJvmBinaryClass == null ? KotlinClassFinderKt.findKotlinClass(kotlinClassFinder, jvmPackagePartSource2.getClassId(), jvmMetadataVersion) : knownJvmBinaryClass;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private enum a {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    public AbstractBinaryClassAnnotationLoader(KotlinClassFinder kotlinClassFinder) {
        s.k(kotlinClassFinder, "kotlinClassFinder");
        this.f87527a = kotlinClassFinder;
    }

    private final int a(ProtoContainer protoContainer, MessageLite messageLite) {
        if (messageLite instanceof ProtoBuf.Function) {
            return ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Function) messageLite) ? 1 : 0;
        }
        if (messageLite instanceof ProtoBuf.Property) {
            return ProtoTypeTableUtilKt.hasReceiver((ProtoBuf.Property) messageLite) ? 1 : 0;
        }
        if (!(messageLite instanceof ProtoBuf.Constructor)) {
            throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
        }
        s.i(protoContainer, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        ProtoContainer.Class r11 = (ProtoContainer.Class) protoContainer;
        if (r11.getKind() == ProtoBuf.Class.Kind.ENUM_CLASS) {
            return 2;
        }
        return r11.isInner() ? 1 : 0;
    }

    private final List<A> b(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z11, boolean z12, Boolean bool, boolean z13) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassD = d(protoContainer, Companion.getSpecialCaseContainerClass(protoContainer, z11, z12, bool, z13, this.f87527a, getJvmMetadataVersion()));
        if (kotlinJvmBinaryClassD == null) {
            return v.m();
        }
        List<A> list = getAnnotationsContainer(kotlinJvmBinaryClassD).getMemberAnnotations().get(memberSignature);
        return list == null ? v.m() : list;
    }

    static /* synthetic */ List c(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z11, boolean z12, Boolean bool, boolean z13, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        if ((i11 & 16) != 0) {
            bool = null;
        }
        if ((i11 & 32) != 0) {
            z13 = false;
        }
        return abstractBinaryClassAnnotationLoader.b(protoContainer, memberSignature, z11, z12, bool, z13);
    }

    public static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return abstractBinaryClassAnnotationLoader.f(messageLite, nameResolver, typeTable, annotatedCallableKind, z11);
    }

    private final List<A> k(ProtoContainer protoContainer, ProtoBuf.Property property, a aVar) {
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        s.j(bool, "get(...)");
        bool.booleanValue();
        boolean zIsMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (aVar == a.PROPERTY) {
            MemberSignature propertySignature$default = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            return propertySignature$default == null ? v.m() : c(this, protoContainer, propertySignature$default, true, false, bool, zIsMovedFromInterfaceCompanion, 8, null);
        }
        MemberSignature propertySignature$default2 = AbstractBinaryClassAnnotationLoaderKt.getPropertySignature$default(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return v.m();
        }
        return t.h0(propertySignature$default2.getSignature(), "$delegate", false, 2, null) != (aVar == a.DELEGATE_FIELD) ? v.m() : b(protoContainer, propertySignature$default2, true, true, bool, zIsMovedFromInterfaceCompanion);
    }

    private final KotlinJvmBinaryClass l(ProtoContainer.Class r11) {
        SourceElement source = r11.getSource();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = source instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) source : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    protected final KotlinJvmBinaryClass d(ProtoContainer container, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        s.k(container, "container");
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (container instanceof ProtoContainer.Class) {
            return l((ProtoContainer.Class) container);
        }
        return null;
    }

    protected byte[] e(KotlinJvmBinaryClass kotlinClass) {
        s.k(kotlinClass, "kotlinClass");
        return null;
    }

    protected final MemberSignature f(MessageLite proto, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind kind, boolean z11) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        s.k(typeTable, "typeTable");
        s.k(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            return companion.fromJvmMemberSignature(jvmConstructorSignature);
        }
        if (proto instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            return companion2.fromJvmMemberSignature(jvmMethodSignature);
        }
        if (proto instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
            s.j(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull((GeneratedMessageLite.ExtendableMessage) proto, propertySignature);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return AbstractBinaryClassAnnotationLoaderKt.getPropertySignature((ProtoBuf.Property) proto, nameResolver, typeTable, true, true, z11);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                MemberSignature.Companion companion3 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                s.j(setter, "getSetter(...)");
                return companion3.fromMethod(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                MemberSignature.Companion companion4 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                s.j(getter, "getGetter(...)");
                return companion4.fromMethod(nameResolver, getter);
            }
        }
        return null;
    }

    protected final KotlinClassFinder g() {
        return this.f87527a;
    }

    protected abstract S getAnnotationsContainer(KotlinJvmBinaryClass kotlinJvmBinaryClass);

    public abstract JvmMetadataVersion getJvmMetadataVersion();

    protected final boolean h(ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass;
        s.k(classId, "classId");
        return classId.getOuterClassId() != null && s.f(classId.getShortClassName().asString(), "Container") && (kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(this.f87527a, classId, getJvmMetadataVersion())) != null && SpecialJvmAnnotations.INSTANCE.isAnnotatedWithContainerMetaAnnotation(kotlinJvmBinaryClassFindKotlinClass);
    }

    protected abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor i(ClassId classId, SourceElement sourceElement, List<A> list);

    protected final KotlinJvmBinaryClass.AnnotationArgumentVisitor j(ClassId annotationClassId, SourceElement source, List<A> result) {
        s.k(annotationClassId, "annotationClassId");
        s.k(source, "source");
        s.k(result, "result");
        if (SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS().contains(annotationClassId)) {
            return null;
        }
        return i(annotationClassId, source, result);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public abstract A loadAnnotation(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadCallableAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(kind, "kind");
        if (kind == AnnotatedCallableKind.PROPERTY) {
            return k(container, (ProtoBuf.Property) proto, a.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        return callableSignature$default == null ? v.m() : c(this, container, callableSignature$default, false, false, null, false, 60, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadClassAnnotations(ProtoContainer.Class container) {
        s.k(container, "container");
        KotlinJvmBinaryClass kotlinJvmBinaryClassL = l(container);
        if (kotlinJvmBinaryClassL != null) {
            final ArrayList arrayList = new ArrayList(1);
            kotlinJvmBinaryClassL.loadClassAnnotations(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.loadClassAnnotations.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f87528a;

                {
                    this.f87528a = this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(ClassId classId, SourceElement source) {
                    s.k(classId, "classId");
                    s.k(source, "source");
                    return this.f87528a.j(classId, source, arrayList);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                }
            }, e(kotlinJvmBinaryClassL));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + container.debugFqName()).toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadEnumEntryAnnotations(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        return c(this, container, MemberSignature.Companion.fromFieldNameAndDesc(container.getNameResolver().getString(proto.getName()), ClassMapperLite.mapClass(((ProtoContainer.Class) container).getClassId().asString())), false, false, null, false, 60, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        s.k(container, "container");
        s.k(proto, "proto");
        s.k(kind, "kind");
        MemberSignature callableSignature$default = getCallableSignature$default(this, proto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        return callableSignature$default != null ? c(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, false, null, false, 60, null) : v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        return k(container, proto, a.BACKING_FIELD);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer container, ProtoBuf.Property proto) {
        s.k(container, "container");
        s.k(proto, "proto");
        return k(container, proto, a.DELEGATE_FIELD);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeAnnotations(ProtoBuf.Type proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeAnnotation);
        s.j(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            s.h(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadTypeParameterAnnotations(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        Object extension = proto.getExtension(JvmProtoBuf.typeParameterAnnotation);
        s.j(extension, "getExtension(...)");
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            s.h(annotation);
            arrayList.add(loadAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> loadValueParameterAnnotations(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i11, ProtoBuf.ValueParameter proto) {
        s.k(container, "container");
        s.k(callableProto, "callableProto");
        s.k(kind, "kind");
        s.k(proto, "proto");
        MemberSignature callableSignature$default = getCallableSignature$default(this, callableProto, container.getNameResolver(), container.getTypeTable(), kind, false, 16, null);
        if (callableSignature$default == null) {
            return v.m();
        }
        return c(this, container, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i11 + a(container, callableProto)), false, false, null, false, 60, null);
    }
}
