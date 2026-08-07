package p013kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import p013kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import p013kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import p013kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import p013kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import p013kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import p013kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmProtoBuf {
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> constructorSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> flags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> isRaw;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> methodSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> propertySignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final JvmFieldSignature f88078h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f88083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f88084g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88085b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f88086c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88087d;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
            }

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i11 = this.f88085b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f88081d = this.f88086c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmFieldSignature.f88082e = this.f88087d;
                jvmFieldSignature.f88080c = i12;
                return jvmFieldSignature;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i11) {
                this.f88085b |= 2;
                this.f88087d = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f88085b |= 1;
                this.f88086c = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureBuildPartial = buildPartial();
                if (jvmFieldSignatureBuildPartial.isInitialized()) {
                    return jvmFieldSignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(jvmFieldSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.f88079b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature partialFrom = JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                mergeFrom(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmFieldSignature != null) {
                        mergeFrom(jvmFieldSignature);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<JvmFieldSignature> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f88078h = jvmFieldSignature;
            jvmFieldSignature.l();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return f88078h;
        }

        private void l() {
            this.f88081d = 0;
            this.f88082e = 0;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public int getDesc() {
            return this.f88082e;
        }

        public int getName() {
            return this.f88081d;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88084g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f88080c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f88081d) : 0;
            if ((this.f88080c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88082e);
            }
            int size = iComputeInt32Size + this.f88079b.size();
            this.f88084g = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f88080c & 2) == 2;
        }

        public boolean hasName() {
            return (this.f88080c & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88083f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88083f = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f88080c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f88081d);
            }
            if ((this.f88080c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f88082e);
            }
            codedOutputStream.writeRawBytes(this.f88079b);
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmFieldSignature getDefaultInstanceForType() {
            return f88078h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88083f = (byte) -1;
            this.f88084g = -1;
            this.f88079b = builder.getUnknownFields();
        }

        private JvmFieldSignature(boolean z11) {
            this.f88083f = (byte) -1;
            this.f88084g = -1;
            this.f88079b = ByteString.EMPTY;
        }

        private JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88083f = (byte) -1;
            this.f88084g = -1;
            l();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f88080c |= 1;
                                this.f88081d = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f88080c |= 2;
                                this.f88082e = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88079b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88079b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final JvmMethodSignature f88088h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f88093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f88094g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f88096c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88097d;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
            }

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i11 = this.f88095b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f88091d = this.f88096c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmMethodSignature.f88092e = this.f88097d;
                jvmMethodSignature.f88090c = i12;
                return jvmMethodSignature;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i11) {
                this.f88095b |= 2;
                this.f88097d = i11;
                return this;
            }

            public Builder setName(int i11) {
                this.f88095b |= 1;
                this.f88096c = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureBuildPartial = buildPartial();
                if (jvmMethodSignatureBuildPartial.isInitialized()) {
                    return jvmMethodSignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(jvmMethodSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.f88089b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature partialFrom = JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                mergeFrom(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmMethodSignature != null) {
                        mergeFrom(jvmMethodSignature);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<JvmMethodSignature> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f88088h = jvmMethodSignature;
            jvmMethodSignature.l();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return f88088h;
        }

        private void l() {
            this.f88091d = 0;
            this.f88092e = 0;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public int getDesc() {
            return this.f88092e;
        }

        public int getName() {
            return this.f88091d;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88094g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeInt32Size = (this.f88090c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f88091d) : 0;
            if ((this.f88090c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88092e);
            }
            int size = iComputeInt32Size + this.f88089b.size();
            this.f88094g = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f88090c & 2) == 2;
        }

        public boolean hasName() {
            return (this.f88090c & 1) == 1;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88093f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88093f = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f88090c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f88091d);
            }
            if ((this.f88090c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f88092e);
            }
            codedOutputStream.writeRawBytes(this.f88089b);
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmMethodSignature getDefaultInstanceForType() {
            return f88088h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88093f = (byte) -1;
            this.f88094g = -1;
            this.f88089b = builder.getUnknownFields();
        }

        private JvmMethodSignature(boolean z11) {
            this.f88093f = (byte) -1;
            this.f88094g = -1;
            this.f88089b = ByteString.EMPTY;
        }

        private JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88093f = (byte) -1;
            this.f88094g = -1;
            l();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f88090c |= 1;
                                this.f88091d = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f88090c |= 2;
                                this.f88092e = codedInputStream.readInt32();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88089b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88089b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final JvmPropertySignature f88098k;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JvmFieldSignature f88101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JvmMethodSignature f88102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private JvmMethodSignature f88103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private JvmMethodSignature f88104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private JvmMethodSignature f88105h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte f88106i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f88107j;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88108b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private JvmFieldSignature f88109c = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private JvmMethodSignature f88110d = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private JvmMethodSignature f88111e = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private JvmMethodSignature f88112f = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private JvmMethodSignature f88113g = JvmMethodSignature.getDefaultInstance();

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
            }

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i11 = this.f88108b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f88101d = this.f88109c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmPropertySignature.f88102e = this.f88110d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                jvmPropertySignature.f88103f = this.f88111e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                jvmPropertySignature.f88104g = this.f88112f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                jvmPropertySignature.f88105h = this.f88113g;
                jvmPropertySignature.f88100c = i12;
                return jvmPropertySignature;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDelegateMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f88108b & 16) != 16 || this.f88113g == JvmMethodSignature.getDefaultInstance()) {
                    this.f88113g = jvmMethodSignature;
                } else {
                    this.f88113g = JvmMethodSignature.newBuilder(this.f88113g).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f88108b |= 16;
                return this;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.f88108b & 1) != 1 || this.f88109c == JvmFieldSignature.getDefaultInstance()) {
                    this.f88109c = jvmFieldSignature;
                } else {
                    this.f88109c = JvmFieldSignature.newBuilder(this.f88109c).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.f88108b |= 1;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f88108b & 4) != 4 || this.f88111e == JvmMethodSignature.getDefaultInstance()) {
                    this.f88111e = jvmMethodSignature;
                } else {
                    this.f88111e = JvmMethodSignature.newBuilder(this.f88111e).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f88108b |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f88108b & 8) != 8 || this.f88112f == JvmMethodSignature.getDefaultInstance()) {
                    this.f88112f = jvmMethodSignature;
                } else {
                    this.f88112f = JvmMethodSignature.newBuilder(this.f88112f).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f88108b |= 8;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f88108b & 2) != 2 || this.f88110d == JvmMethodSignature.getDefaultInstance()) {
                    this.f88110d = jvmMethodSignature;
                } else {
                    this.f88110d = JvmMethodSignature.newBuilder(this.f88110d).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f88108b |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureBuildPartial = buildPartial();
                if (jvmPropertySignatureBuildPartial.isInitialized()) {
                    return jvmPropertySignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(jvmPropertySignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    mergeDelegateMethod(jvmPropertySignature.getDelegateMethod());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.f88099b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature partialFrom = JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                mergeFrom(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmPropertySignature != null) {
                        mergeFrom(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        static class a extends AbstractParser<JvmPropertySignature> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            f88098k = jvmPropertySignature;
            jvmPropertySignature.o();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f88098k;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        private void o() {
            this.f88101d = JvmFieldSignature.getDefaultInstance();
            this.f88102e = JvmMethodSignature.getDefaultInstance();
            this.f88103f = JvmMethodSignature.getDefaultInstance();
            this.f88104g = JvmMethodSignature.getDefaultInstance();
            this.f88105h = JvmMethodSignature.getDefaultInstance();
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.f88105h;
        }

        public JvmFieldSignature getField() {
            return this.f88101d;
        }

        public JvmMethodSignature getGetter() {
            return this.f88103f;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88107j;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = (this.f88100c & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f88101d) : 0;
            if ((this.f88100c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f88102e);
            }
            if ((this.f88100c & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f88103f);
            }
            if ((this.f88100c & 8) == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f88104g);
            }
            if ((this.f88100c & 16) == 16) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f88105h);
            }
            int size = iComputeMessageSize + this.f88099b.size();
            this.f88107j = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.f88104g;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.f88102e;
        }

        public boolean hasDelegateMethod() {
            return (this.f88100c & 16) == 16;
        }

        public boolean hasField() {
            return (this.f88100c & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.f88100c & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.f88100c & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.f88100c & 2) == 2;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88106i;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88106i = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f88100c & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f88101d);
            }
            if ((this.f88100c & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f88102e);
            }
            if ((this.f88100c & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f88103f);
            }
            if ((this.f88100c & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f88104g);
            }
            if ((this.f88100c & 16) == 16) {
                codedOutputStream.writeMessage(5, this.f88105h);
            }
            codedOutputStream.writeRawBytes(this.f88099b);
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmPropertySignature getDefaultInstanceForType() {
            return f88098k;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88106i = (byte) -1;
            this.f88107j = -1;
            this.f88099b = builder.getUnknownFields();
        }

        private JvmPropertySignature(boolean z11) {
            this.f88106i = (byte) -1;
            this.f88107j = -1;
            this.f88099b = ByteString.EMPTY;
        }

        private JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88106i = (byte) -1;
            this.f88107j = -1;
            o();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                JvmFieldSignature.Builder builder = (this.f88100c & 1) == 1 ? this.f88101d.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.readMessage(JvmFieldSignature.PARSER, extensionRegistryLite);
                                this.f88101d = jvmFieldSignature;
                                if (builder != null) {
                                    builder.mergeFrom(jvmFieldSignature);
                                    this.f88101d = builder.buildPartial();
                                }
                                this.f88100c |= 1;
                            } else if (tag == 18) {
                                JvmMethodSignature.Builder builder2 = (this.f88100c & 2) == 2 ? this.f88102e.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f88102e = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.mergeFrom(jvmMethodSignature);
                                    this.f88102e = builder2.buildPartial();
                                }
                                this.f88100c |= 2;
                            } else if (tag == 26) {
                                JvmMethodSignature.Builder builder3 = (this.f88100c & 4) == 4 ? this.f88103f.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f88103f = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(jvmMethodSignature2);
                                    this.f88103f = builder3.buildPartial();
                                }
                                this.f88100c |= 4;
                            } else if (tag == 34) {
                                JvmMethodSignature.Builder builder4 = (this.f88100c & 8) == 8 ? this.f88104g.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f88104g = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.mergeFrom(jvmMethodSignature3);
                                    this.f88104g = builder4.buildPartial();
                                }
                                this.f88100c |= 8;
                            } else if (tag != 42) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                JvmMethodSignature.Builder builder5 = (this.f88100c & 16) == 16 ? this.f88105h.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f88105h = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.mergeFrom(jvmMethodSignature4);
                                    this.f88105h = builder5.buildPartial();
                                }
                                this.f88100c |= 16;
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f88099b = outputNewOutput.toByteString();
                        }
                        e();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88099b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final StringTableTypes f88114h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteString f88115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Record> f88116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<Integer> f88117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f88119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f88120g;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f88121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<Record> f88122c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private List<Integer> f88123d;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f88122c = list;
                this.f88123d = list;
                f();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder c() {
                return new Builder();
            }

            private void d() {
                if ((this.f88121b & 2) != 2) {
                    this.f88123d = new ArrayList(this.f88123d);
                    this.f88121b |= 2;
                }
            }

            private void e() {
                if ((this.f88121b & 1) != 1) {
                    this.f88122c = new ArrayList(this.f88122c);
                    this.f88121b |= 1;
                }
            }

            private void f() {
            }

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f88121b & 1) == 1) {
                    this.f88122c = Collections.unmodifiableList(this.f88122c);
                    this.f88121b &= -2;
                }
                stringTableTypes.f88116c = this.f88122c;
                if ((this.f88121b & 2) == 2) {
                    this.f88123d = Collections.unmodifiableList(this.f88123d);
                    this.f88121b &= -3;
                }
                stringTableTypes.f88117d = this.f88123d;
                return stringTableTypes;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTableTypes build() {
                StringTableTypes stringTableTypesBuildPartial = buildPartial();
                if (stringTableTypesBuildPartial.isInitialized()) {
                    return stringTableTypesBuildPartial;
                }
                throw AbstractMessageLite.Builder.a(stringTableTypesBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo499clone() {
                return c().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.f88116c.isEmpty()) {
                    if (this.f88122c.isEmpty()) {
                        this.f88122c = stringTableTypes.f88116c;
                        this.f88121b &= -2;
                    } else {
                        e();
                        this.f88122c.addAll(stringTableTypes.f88116c);
                    }
                }
                if (!stringTableTypes.f88117d.isEmpty()) {
                    if (this.f88123d.isEmpty()) {
                        this.f88123d = stringTableTypes.f88117d;
                        this.f88121b &= -3;
                    } else {
                        d();
                        this.f88123d.addAll(stringTableTypes.f88117d);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.f88115b));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes partialFrom = StringTableTypes.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e11.getUnfinishedMessage();
                        try {
                            throw e11;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                mergeFrom(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTableTypes != null) {
                        mergeFrom(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new a();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static final Record f88124n;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ByteString f88125b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f88126c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f88127d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f88128e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Object f88129f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Operation f88130g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private List<Integer> f88131h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f88132i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<Integer> f88133j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f88134k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private byte f88135l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private int f88136m;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f88137b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f88139d;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private List<Integer> f88142g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private List<Integer> f88143h;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private int f88138c = 1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private Object f88140e = "";

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private Operation f88141f = Operation.NONE;

                private Builder() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f88142g = list;
                    this.f88143h = list;
                    f();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder c() {
                    return new Builder();
                }

                private void d() {
                    if ((this.f88137b & 32) != 32) {
                        this.f88143h = new ArrayList(this.f88143h);
                        this.f88137b |= 32;
                    }
                }

                private void e() {
                    if ((this.f88137b & 16) != 16) {
                        this.f88142g = new ArrayList(this.f88142g);
                        this.f88137b |= 16;
                    }
                }

                private void f() {
                }

                public Record buildPartial() {
                    Record record = new Record(this);
                    int i11 = this.f88137b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    record.f88127d = this.f88138c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    record.f88128e = this.f88139d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    record.f88129f = this.f88140e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    record.f88130g = this.f88141f;
                    if ((this.f88137b & 16) == 16) {
                        this.f88142g = Collections.unmodifiableList(this.f88142g);
                        this.f88137b &= -17;
                    }
                    record.f88131h = this.f88142g;
                    if ((this.f88137b & 32) == 32) {
                        this.f88143h = Collections.unmodifiableList(this.f88143h);
                        this.f88137b &= -33;
                    }
                    record.f88133j = this.f88143h;
                    record.f88126c = i12;
                    return record;
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setOperation(Operation operation) {
                    operation.getClass();
                    this.f88137b |= 8;
                    this.f88141f = operation;
                    return this;
                }

                public Builder setPredefinedIndex(int i11) {
                    this.f88137b |= 2;
                    this.f88139d = i11;
                    return this;
                }

                public Builder setRange(int i11) {
                    this.f88137b |= 1;
                    this.f88138c = i11;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Record build() {
                    Record recordBuildPartial = buildPartial();
                    if (recordBuildPartial.isInitialized()) {
                        return recordBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.a(recordBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo499clone() {
                    return c().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f88137b |= 4;
                        this.f88140e = record.f88129f;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.f88131h.isEmpty()) {
                        if (this.f88142g.isEmpty()) {
                            this.f88142g = record.f88131h;
                            this.f88137b &= -17;
                        } else {
                            e();
                            this.f88142g.addAll(record.f88131h);
                        }
                    }
                    if (!record.f88133j.isEmpty()) {
                        if (this.f88143h.isEmpty()) {
                            this.f88143h = record.f88133j;
                            this.f88137b &= -33;
                        } else {
                            d();
                            this.f88143h.addAll(record.f88133j);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.f88125b));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record partialFrom = Record.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e11) {
                            Record record2 = (Record) e11.getUnfinishedMessage();
                            try {
                                throw e11;
                            } catch (Throwable th2) {
                                th = th2;
                                record = record2;
                                if (record != null) {
                                    mergeFrom(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (record != null) {
                            mergeFrom(record);
                        }
                        throw th;
                    }
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static Internal.EnumLiteMap<Operation> internalValueMap = new a();
                private final int value;

                static class a implements Internal.EnumLiteMap<Operation> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Operation findValueByNumber(int i11) {
                        return Operation.valueOf(i11);
                    }
                }

                Operation(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i11) {
                    if (i11 == 0) {
                        return NONE;
                    }
                    if (i11 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static class a extends AbstractParser<Record> {
                a() {
                }

                @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Record parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return new Record(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Record record = new Record(true);
                f88124n = record;
                record.s();
            }

            public static Record getDefaultInstance() {
                return f88124n;
            }

            public static Builder newBuilder() {
                return Builder.c();
            }

            private void s() {
                this.f88127d = 1;
                this.f88128e = 0;
                this.f88129f = "";
                this.f88130g = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f88131h = list;
                this.f88133j = list;
            }

            public Operation getOperation() {
                return this.f88130g;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.f88128e;
            }

            public int getRange() {
                return this.f88127d;
            }

            public int getReplaceCharCount() {
                return this.f88133j.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.f88133j;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i11 = this.f88136m;
                if (i11 != -1) {
                    return i11;
                }
                int iComputeInt32Size = (this.f88126c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f88127d) : 0;
                if ((this.f88126c & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f88128e);
                }
                if ((this.f88126c & 8) == 8) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f88130g.getNumber());
                }
                int iComputeInt32SizeNoTag = 0;
                for (int i12 = 0; i12 < this.f88131h.size(); i12++) {
                    iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f88131h.get(i12).intValue());
                }
                int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
                if (!getSubstringIndexList().isEmpty()) {
                    iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
                }
                this.f88132i = iComputeInt32SizeNoTag;
                int iComputeInt32SizeNoTag3 = 0;
                for (int i13 = 0; i13 < this.f88133j.size(); i13++) {
                    iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.f88133j.get(i13).intValue());
                }
                int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
                if (!getReplaceCharList().isEmpty()) {
                    iComputeBytesSize = iComputeBytesSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
                }
                this.f88134k = iComputeInt32SizeNoTag3;
                if ((this.f88126c & 4) == 4) {
                    iComputeBytesSize += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
                int size = iComputeBytesSize + this.f88125b.size();
                this.f88136m = size;
                return size;
            }

            public String getString() {
                Object obj = this.f88129f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f88129f = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj = this.f88129f;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f88129f = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSubstringIndexCount() {
                return this.f88131h.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.f88131h;
            }

            public boolean hasOperation() {
                return (this.f88126c & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.f88126c & 2) == 2;
            }

            public boolean hasRange() {
                return (this.f88126c & 1) == 1;
            }

            public boolean hasString() {
                return (this.f88126c & 4) == 4;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b11 = this.f88135l;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                this.f88135l = (byte) 1;
                return true;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f88126c & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f88127d);
                }
                if ((this.f88126c & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f88128e);
                }
                if ((this.f88126c & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.f88130g.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.f88132i);
                }
                for (int i11 = 0; i11 < this.f88131h.size(); i11++) {
                    codedOutputStream.writeInt32NoTag(this.f88131h.get(i11).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.f88134k);
                }
                for (int i12 = 0; i12 < this.f88133j.size(); i12++) {
                    codedOutputStream.writeInt32NoTag(this.f88133j.get(i12).intValue());
                }
                if ((this.f88126c & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
                }
                codedOutputStream.writeRawBytes(this.f88125b);
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Record getDefaultInstanceForType() {
                return f88124n;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f88132i = -1;
                this.f88134k = -1;
                this.f88135l = (byte) -1;
                this.f88136m = -1;
                this.f88125b = builder.getUnknownFields();
            }

            private Record(boolean z11) {
                this.f88132i = -1;
                this.f88134k = -1;
                this.f88135l = (byte) -1;
                this.f88136m = -1;
                this.f88125b = ByteString.EMPTY;
            }

            private Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f88132i = -1;
                this.f88134k = -1;
                this.f88135l = (byte) -1;
                this.f88136m = -1;
                s();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z11 = false;
                int i11 = 0;
                while (!z11) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f88126c |= 1;
                                    this.f88127d = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.f88126c |= 2;
                                    this.f88128e = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    int i12 = codedInputStream.readEnum();
                                    Operation operationValueOf = Operation.valueOf(i12);
                                    if (operationValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i12);
                                    } else {
                                        this.f88126c |= 8;
                                        this.f88130g = operationValueOf;
                                    }
                                } else if (tag == 32) {
                                    if ((i11 & 16) != 16) {
                                        this.f88131h = new ArrayList();
                                        i11 |= 16;
                                    }
                                    this.f88131h.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 34) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 16) != 16 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f88131h = new ArrayList();
                                        i11 |= 16;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f88131h.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 40) {
                                    if ((i11 & 32) != 32) {
                                        this.f88133j = new ArrayList();
                                        i11 |= 32;
                                    }
                                    this.f88133j.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 42) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i11 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f88133j = new ArrayList();
                                        i11 |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f88133j.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag != 50) {
                                    if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.f88126c |= 4;
                                    this.f88129f = bytes;
                                }
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            if ((i11 & 16) == 16) {
                                this.f88131h = Collections.unmodifiableList(this.f88131h);
                            }
                            if ((i11 & 32) == 32) {
                                this.f88133j = Collections.unmodifiableList(this.f88133j);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.f88125b = outputNewOutput.toByteString();
                            }
                            e();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((i11 & 16) == 16) {
                    this.f88131h = Collections.unmodifiableList(this.f88131h);
                }
                if ((i11 & 32) == 32) {
                    this.f88133j = Collections.unmodifiableList(this.f88133j);
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f88125b = outputNewOutput.toByteString();
                }
                e();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static class a extends AbstractParser<StringTableTypes> {
            a() {
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public StringTableTypes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            f88114h = stringTableTypes;
            stringTableTypes.m();
        }

        public static StringTableTypes getDefaultInstance() {
            return f88114h;
        }

        private void m() {
            List list = Collections.EMPTY_LIST;
            this.f88116c = list;
            this.f88117d = list;
        }

        public static Builder newBuilder() {
            return Builder.c();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.f88117d;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.f88116c;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i11 = this.f88120g;
            if (i11 != -1) {
                return i11;
            }
            int iComputeMessageSize = 0;
            for (int i12 = 0; i12 < this.f88116c.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f88116c.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.f88117d.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f88117d.get(i13).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeMessageSize + iComputeInt32SizeNoTag;
            if (!getLocalNameList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f88118e = iComputeInt32SizeNoTag;
            int size = iComputeInt32SizeNoTag2 + this.f88115b.size();
            this.f88120g = size;
            return size;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b11 = this.f88119f;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.f88119f = (byte) 1;
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i11 = 0; i11 < this.f88116c.size(); i11++) {
                codedOutputStream.writeMessage(1, this.f88116c.get(i11));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.f88118e);
            }
            for (int i12 = 0; i12 < this.f88117d.size(); i12++) {
                codedOutputStream.writeInt32NoTag(this.f88117d.get(i12).intValue());
            }
            codedOutputStream.writeRawBytes(this.f88115b);
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTableTypes getDefaultInstanceForType() {
            return f88114h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f88118e = -1;
            this.f88119f = (byte) -1;
            this.f88120g = -1;
            this.f88115b = builder.getUnknownFields();
        }

        private StringTableTypes(boolean z11) {
            this.f88118e = -1;
            this.f88119f = (byte) -1;
            this.f88120g = -1;
            this.f88115b = ByteString.EMPTY;
        }

        private StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f88118e = -1;
            this.f88119f = (byte) -1;
            this.f88120g = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if ((i11 & 1) != 1) {
                                    this.f88116c = new ArrayList();
                                    i11 |= 1;
                                }
                                this.f88116c.add((Record) codedInputStream.readMessage(Record.PARSER, extensionRegistryLite));
                            } else if (tag == 40) {
                                if ((i11 & 2) != 2) {
                                    this.f88117d = new ArrayList();
                                    i11 |= 2;
                                }
                                this.f88117d.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 42) {
                                if (!f(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i11 & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f88117d = new ArrayList();
                                    i11 |= 2;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f88117d.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 1) == 1) {
                        this.f88116c = Collections.unmodifiableList(this.f88116c);
                    }
                    if ((i11 & 2) == 2) {
                        this.f88117d = Collections.unmodifiableList(this.f88117d);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f88115b = outputNewOutput.toByteString();
                    }
                    e();
                    throw th2;
                }
            }
            if ((i11 & 1) == 1) {
                this.f88116c = Collections.unmodifiableList(this.f88116c);
            }
            if ((i11 & 2) == 2) {
                this.f88117d = Collections.unmodifiableList(this.f88117d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f88115b = outputNewOutput.toByteString();
            }
            e();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        flags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        isRaw = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        jvmClassFlags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(flags);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(jvmClassFlags);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
