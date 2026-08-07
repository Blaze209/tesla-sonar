package p013kotlin.reflect.jvm.internal.impl.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ContainingType f88286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Type f88287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final MessageLite f88288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final b f88289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f88290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f88291f;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, b bVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f88286a = containingtype;
            this.f88287b = type;
            this.f88288c = messageLite;
            this.f88289d = bVar;
            this.f88290e = cls;
            if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f88291f = GeneratedMessageLite.c(cls, CoreConstants.VALUE_OF, Integer.TYPE);
            } else {
                this.f88291f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f88289d.isRepeated()) {
                return b(obj);
            }
            if (this.f88289d.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return arrayList;
        }

        Object b(Object obj) {
            return this.f88289d.getLiteJavaType() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.d(this.f88291f, null, (Integer) obj) : obj;
        }

        Object c(Object obj) {
            return this.f88289d.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f88286a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.f88288c;
        }

        public int getNumber() {
            return this.f88289d.getNumber();
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88292a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f88292a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88292a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static final class b implements FieldSet.FieldDescriptorLite<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Internal.EnumLiteMap<?> f88293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f88294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WireFormat.FieldType f88295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f88296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f88297e;

        b(Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11, boolean z12) {
            this.f88293a = enumLiteMap;
            this.f88294b = i11;
            this.f88295c = fieldType;
            this.f88296d = z11;
            this.f88297e = z12;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f88294b - bVar.f88294b;
        }

        public Internal.EnumLiteMap<?> b() {
            return this.f88293a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.f88295c.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.f88295c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f88294b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f88297e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f88296d;
        }
    }

    protected GeneratedMessageLite() {
    }

    static Method c(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e11) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    static Object d(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends MessageLite> boolean g(FieldSet<b> fieldSet, MessageType messagetype, CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) throws InvalidProtocolBufferException {
        boolean z11;
        boolean z12;
        Object objBuild;
        MessageLite messageLite;
        int iA = WireFormat.a(i11);
        GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, WireFormat.getTagFieldNumber(i11));
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            z12 = true;
            z11 = false;
        } else if (iA == FieldSet.l(generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType(), false)) {
            z12 = false;
            z11 = false;
        } else {
            b bVar = generatedExtensionFindLiteExtensionByNumber.f88289d;
            if (bVar.f88296d && bVar.f88295c.isPackable() && iA == FieldSet.l(generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType(), true)) {
                z11 = true;
                z12 = false;
            } else {
                z12 = true;
                z11 = false;
            }
        }
        if (z12) {
            return codedInputStream.skipField(i11, codedOutputStream);
        }
        if (z11) {
            int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
            if (generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType() == WireFormat.FieldType.ENUM) {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    Internal.EnumLite enumLiteFindValueByNumber = generatedExtensionFindLiteExtensionByNumber.f88289d.b().findValueByNumber(codedInputStream.readEnum());
                    if (enumLiteFindValueByNumber == null) {
                        return true;
                    }
                    fieldSet.a(generatedExtensionFindLiteExtensionByNumber.f88289d, generatedExtensionFindLiteExtensionByNumber.c(enumLiteFindValueByNumber));
                }
            } else {
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    fieldSet.a(generatedExtensionFindLiteExtensionByNumber.f88289d, FieldSet.u(codedInputStream, generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType(), false));
                }
            }
            codedInputStream.popLimit(iPushLimit);
        } else {
            int i12 = a.f88292a[generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteJavaType().ordinal()];
            if (i12 == 1) {
                MessageLite.Builder builder = (generatedExtensionFindLiteExtensionByNumber.f88289d.isRepeated() || (messageLite = (MessageLite) fieldSet.h(generatedExtensionFindLiteExtensionByNumber.f88289d)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                }
                if (generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType() == WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtensionFindLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = FieldSet.u(codedInputStream, generatedExtensionFindLiteExtensionByNumber.f88289d.getLiteType(), false);
            } else {
                int i13 = codedInputStream.readEnum();
                Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtensionFindLiteExtensionByNumber.f88289d.b().findValueByNumber(i13);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.writeRawVarint32(i11);
                    codedOutputStream.writeUInt32NoTag(i13);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            if (generatedExtensionFindLiteExtensionByNumber.f88289d.isRepeated()) {
                fieldSet.a(generatedExtensionFindLiteExtensionByNumber.f88289d, generatedExtensionFindLiteExtensionByNumber.c(objBuild));
            } else {
                fieldSet.v(generatedExtensionFindLiteExtensionByNumber.f88289d, generatedExtensionFindLiteExtensionByNumber.c(objBuild));
            }
        }
        return true;
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, boolean z11, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new b(enumLiteMap, i11, fieldType, true, z11), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i11, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new b(enumLiteMap, i11, fieldType, false, false), cls);
    }

    protected void e() {
    }

    protected boolean f(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) {
        return codedInputStream.skipField(i11, codedOutputStream);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ByteString f88278a = ByteString.EMPTY;

        protected Builder() {
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.f88278a;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.f88278a = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo499clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FieldSet<b> f88281b;

        /* JADX INFO: Access modifiers changed from: protected */
        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<b, Object>> f88282a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry<b, Object> f88283b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f88284c;

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z11, a aVar) {
                this(z11);
            }

            public void writeUntil(int i11, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<b, Object> entry = this.f88283b;
                    if (entry == null || entry.getKey().getNumber() >= i11) {
                        return;
                    }
                    b key = this.f88283b.getKey();
                    if (this.f88284c && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (MessageLite) this.f88283b.getValue());
                    } else {
                        FieldSet.z(key, this.f88283b.getValue(), codedOutputStream);
                    }
                    if (this.f88282a.hasNext()) {
                        this.f88283b = this.f88282a.next();
                    } else {
                        this.f88283b = null;
                    }
                }
            }

            private ExtensionWriter(boolean z11) {
                Iterator<Map.Entry<b, Object>> itP = ExtendableMessage.this.f88281b.p();
                this.f88282a = itP;
                if (itP.hasNext()) {
                    this.f88283b = itP.next();
                }
                this.f88284c = z11;
            }
        }

        protected ExtendableMessage() {
            this.f88281b = FieldSet.t();
        }

        private void l(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void e() {
            this.f88281b.q();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean f(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i11) {
            return GeneratedMessageLite.g(this.f88281b, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            l(generatedExtension);
            Object objH = this.f88281b.h(generatedExtension.f88289d);
            return objH == null ? generatedExtension.f88287b : (Type) generatedExtension.a(objH);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            l(generatedExtension);
            return this.f88281b.j(generatedExtension.f88289d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            l(generatedExtension);
            return this.f88281b.m(generatedExtension.f88289d);
        }

        protected boolean i() {
            return this.f88281b.n();
        }

        protected int j() {
            return this.f88281b.k();
        }

        protected ExtendableMessage<MessageType>.ExtensionWriter k() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.f88281b = extendableBuilder.c();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i11) {
            l(generatedExtension);
            return (Type) generatedExtension.b(this.f88281b.i(generatedExtension.f88289d, i11));
        }
    }

    protected GeneratedMessageLite(Builder builder) {
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private FieldSet<b> f88279b = FieldSet.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f88280c;

        protected ExtendableBuilder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet<b> c() {
            this.f88279b.q();
            this.f88280c = false;
            return this.f88279b;
        }

        private void d() {
            if (this.f88280c) {
                return;
            }
            this.f88279b = this.f88279b.clone();
            this.f88280c = true;
        }

        protected boolean e() {
            return this.f88279b.n();
        }

        protected final void f(MessageType messagetype) {
            d();
            this.f88279b.r(((ExtendableMessage) messagetype).f88281b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo499clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }
}
