package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NameResolver f88646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeTable f88647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SourceElement f88648c;

    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ProtoBuf.Class f88649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Class f88650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClassId f88651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ProtoBuf.Class.Kind f88652g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f88653h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f88654i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r11) {
            super(nameResolver, typeTable, sourceElement, null);
            s.k(classProto, "classProto");
            s.k(nameResolver, "nameResolver");
            s.k(typeTable, "typeTable");
            this.f88649d = classProto;
            this.f88650e = r11;
            this.f88651f = NameResolverUtilKt.getClassId(nameResolver, classProto.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(classProto.getFlags());
            this.f88652g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            Boolean bool = Flags.IS_INNER.get(classProto.getFlags());
            s.j(bool, "get(...)");
            this.f88653h = bool.booleanValue();
            Boolean bool2 = Flags.IS_DATA.get(classProto.getFlags());
            s.j(bool2, "get(...)");
            this.f88654i = bool2.booleanValue();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.f88651f.asSingleFqName();
        }

        public final ClassId getClassId() {
            return this.f88651f;
        }

        public final ProtoBuf.Class getClassProto() {
            return this.f88649d;
        }

        public final ProtoBuf.Class.Kind getKind() {
            return this.f88652g;
        }

        public final Class getOuterClass() {
            return this.f88650e;
        }

        public final boolean isInner() {
            return this.f88653h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final FqName f88655d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            s.k(fqName, "fqName");
            s.k(nameResolver, "nameResolver");
            s.k(typeTable, "typeTable");
            this.f88655d = fqName;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName debugFqName() {
            return this.f88655d;
        }
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    public abstract FqName debugFqName();

    public final NameResolver getNameResolver() {
        return this.f88646a;
    }

    public final SourceElement getSource() {
        return this.f88648c;
    }

    public final TypeTable getTypeTable() {
        return this.f88647b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + debugFqName();
    }

    private ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f88646a = nameResolver;
        this.f88647b = typeTable;
        this.f88648c = sourceElement;
    }
}
