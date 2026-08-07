package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ModuleDescriptor f87533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotFoundClasses f87534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AnnotationDeserializer f87535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JvmMetadataVersion f87536f;

    /* JADX INFO: Access modifiers changed from: private */
    abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.this.w(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(final Name name, ClassId classId) {
            s.k(classId, "classId");
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            s.j(NO_SOURCE, "NO_SOURCE");
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorI = binaryClassAnnotationAndConstantLoaderImpl.i(classId, NO_SOURCE, arrayList);
            s.h(annotationArgumentVisitorI);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f87538a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f87540c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Name f87541d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ArrayList<AnnotationDescriptor> f87542e;

                {
                    this.f87540c = this;
                    this.f87541d = name;
                    this.f87542e = arrayList;
                    this.f87538a = this.f87539b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(Name name2, Object obj) {
                    this.f87538a.visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name2, ClassId classId2) {
                    s.k(classId2, "classId");
                    return this.f87538a.visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name2) {
                    return this.f87538a.visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(Name name2, ClassLiteralValue value) {
                    s.k(value, "value");
                    this.f87538a.visitClassLiteral(name2, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.f87539b.visitEnd();
                    this.f87540c.visitConstantValue(this.f87541d, new AnnotationValue((AnnotationDescriptor) v.U0(this.f87542e)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(Name name2, ClassId enumClassId, Name enumEntryName) {
                    s.k(enumClassId, "enumClassId");
                    s.k(enumEntryName, "enumEntryName");
                    this.f87538a.visitEnum(name2, enumClassId, enumEntryName);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            return new BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitArray$1(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void visitArrayValue(Name name, ArrayList<ConstantValue<?>> arrayList);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue value) {
            s.k(value, "value");
            visitConstantValue(name, new KClassValue(value));
        }

        public abstract void visitConstantValue(Name name, ConstantValue<?> constantValue);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId enumClassId, Name enumEntryName) {
            s.k(enumClassId, "enumClassId");
            s.k(enumEntryName, "enumEntryName");
            visitConstantValue(name, new EnumValue(enumClassId, enumEntryName));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        s.k(module, "module");
        s.k(notFoundClasses, "notFoundClasses");
        s.k(storageManager, "storageManager");
        s.k(kotlinClassFinder, "kotlinClassFinder");
        this.f87533c = module;
        this.f87534d = notFoundClasses;
        this.f87535e = new AnnotationDeserializer(module, notFoundClasses);
        this.f87536f = JvmMetadataVersion.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> w(Name name, Object obj) {
        ConstantValue<?> constantValueCreateConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, this.f87533c);
        if (constantValueCreateConstantValue != null) {
            return constantValueCreateConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    private final ClassDescriptor y(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f87533c, classId, this.f87534d);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public JvmMetadataVersion getJvmMetadataVersion() {
        return this.f87536f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    protected KotlinJvmBinaryClass.AnnotationArgumentVisitor i(final ClassId annotationClassId, final SourceElement source, final List<AnnotationDescriptor> result) {
        s.k(annotationClassId, "annotationClassId");
        s.k(source, "source");
        s.k(result, "result");
        final ClassDescriptor classDescriptorY = y(annotationClassId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final HashMap<Name, ConstantValue<?>> f87551b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f87551b = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(Name name, ArrayList<ConstantValue<?>> elements) {
                s.k(elements, "elements");
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, classDescriptorY);
                if (annotationParameterByName != null) {
                    HashMap<Name, ConstantValue<?>> map = this.f87551b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listCompact = CollectionsKt.compact(elements);
                    KotlinType type = annotationParameterByName.getType();
                    s.j(type, "getType(...)");
                    map.put(name, constantValueFactory.createArrayValue(listCompact, type));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.h(annotationClassId) && s.f(name.asString(), "value")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof AnnotationValue) {
                            arrayList.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list = result;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(Name name, ConstantValue<?> value) {
                s.k(value, "value");
                if (name != null) {
                    this.f87551b.put(name, value);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.q(annotationClassId, this.f87551b) || BinaryClassAnnotationAndConstantLoaderImpl.this.h(annotationClassId)) {
                    return;
                }
                result.add(new AnnotationDescriptorImpl(classDescriptorY.getDefaultType(), this.f87551b, source));
            }
        };
    }

    public void setJvmMetadataVersion(JvmMetadataVersion jvmMetadataVersion) {
        s.k(jvmMetadataVersion, "<set-?>");
        this.f87536f = jvmMetadataVersion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> loadConstant(String desc, Object initializer) {
        s.k(desc, "desc");
        s.k(initializer, "initializer");
        if (t.h0("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(initializer, this.f87533c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> transformToUnsignedConstant(ConstantValue<?> constant) {
        s.k(constant, "constant");
        if (constant instanceof ByteValue) {
            return new UByteValue(((ByteValue) constant).getValue().byteValue());
        }
        if (constant instanceof ShortValue) {
            return new UShortValue(((ShortValue) constant).getValue().shortValue());
        }
        if (constant instanceof IntValue) {
            return new UIntValue(((IntValue) constant).getValue().intValue());
        }
        return constant instanceof LongValue ? new ULongValue(((LongValue) constant).getValue().longValue()) : constant;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public AnnotationDescriptor loadAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        s.k(proto, "proto");
        s.k(nameResolver, "nameResolver");
        return this.f87535e.deserializeAnnotation(proto, nameResolver);
    }
}
