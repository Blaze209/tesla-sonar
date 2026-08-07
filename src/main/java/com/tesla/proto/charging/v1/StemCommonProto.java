package com.tesla.proto.charging.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class StemCommonProto {

    /* JADX INFO: renamed from: com.tesla.proto.charging.v1.StemCommonProto$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class StemEventInfo extends GeneratedMessageLite<StemEventInfo, Builder> implements StemEventInfoOrBuilder {
        private static final StemEventInfo DEFAULT_INSTANCE;
        public static final int EVENT_OCCURRED_FIELD_NUMBER = 1;
        public static final int INVALIDATED_FIELD_NUMBER = 2;
        private static volatile Parser<StemEventInfo> PARSER = null;
        public static final int TIME_SYNCHRONIZED_FIELD_NUMBER = 3;
        private boolean eventOccurred_;
        private boolean invalidated_;
        private boolean timeSynchronized_;

        public static final class Builder extends GeneratedMessageLite.Builder<StemEventInfo, Builder> implements StemEventInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEventOccurred() {
                copyOnWrite();
                ((StemEventInfo) this.instance).clearEventOccurred();
                return this;
            }

            public Builder clearInvalidated() {
                copyOnWrite();
                ((StemEventInfo) this.instance).clearInvalidated();
                return this;
            }

            public Builder clearTimeSynchronized() {
                copyOnWrite();
                ((StemEventInfo) this.instance).clearTimeSynchronized();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
            public boolean getEventOccurred() {
                return ((StemEventInfo) this.instance).getEventOccurred();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
            public boolean getInvalidated() {
                return ((StemEventInfo) this.instance).getInvalidated();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
            public boolean getTimeSynchronized() {
                return ((StemEventInfo) this.instance).getTimeSynchronized();
            }

            public Builder setEventOccurred(boolean z11) {
                copyOnWrite();
                ((StemEventInfo) this.instance).setEventOccurred(z11);
                return this;
            }

            public Builder setInvalidated(boolean z11) {
                copyOnWrite();
                ((StemEventInfo) this.instance).setInvalidated(z11);
                return this;
            }

            public Builder setTimeSynchronized(boolean z11) {
                copyOnWrite();
                ((StemEventInfo) this.instance).setTimeSynchronized(z11);
                return this;
            }

            private Builder() {
                super(StemEventInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            StemEventInfo stemEventInfo = new StemEventInfo();
            DEFAULT_INSTANCE = stemEventInfo;
            GeneratedMessageLite.registerDefaultInstance(StemEventInfo.class, stemEventInfo);
        }

        private StemEventInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventOccurred() {
            this.eventOccurred_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInvalidated() {
            this.invalidated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeSynchronized() {
            this.timeSynchronized_ = false;
        }

        public static StemEventInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StemEventInfo parseDelimitedFrom(InputStream inputStream) {
            return (StemEventInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemEventInfo parseFrom(ByteBuffer byteBuffer) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StemEventInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventOccurred(boolean z11) {
            this.eventOccurred_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInvalidated(boolean z11) {
            this.invalidated_ = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeSynchronized(boolean z11) {
            this.timeSynchronized_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StemEventInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"eventOccurred_", "invalidated_", "timeSynchronized_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StemEventInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StemEventInfo.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
        public boolean getEventOccurred() {
            return this.eventOccurred_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
        public boolean getInvalidated() {
            return this.invalidated_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemEventInfoOrBuilder
        public boolean getTimeSynchronized() {
            return this.timeSynchronized_;
        }

        public static Builder newBuilder(StemEventInfo stemEventInfo) {
            return DEFAULT_INSTANCE.createBuilder(stemEventInfo);
        }

        public static StemEventInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemEventInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StemEventInfo parseFrom(ByteString byteString) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StemEventInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StemEventInfo parseFrom(byte[] bArr) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StemEventInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StemEventInfo parseFrom(InputStream inputStream) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemEventInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemEventInfo parseFrom(CodedInputStream codedInputStream) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StemEventInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemEventInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StemEventInfoOrBuilder extends MessageLiteOrBuilder {
        boolean getEventOccurred();

        boolean getInvalidated();

        boolean getTimeSynchronized();
    }

    public static final class StemInfo extends GeneratedMessageLite<StemInfo, Builder> implements StemInfoOrBuilder {
        private static final StemInfo DEFAULT_INSTANCE;
        public static final int FW_GITHASH_FIELD_NUMBER = 1;
        public static final int METER_ID_FIELD_NUMBER = 4;
        private static volatile Parser<StemInfo> PARSER = null;
        public static final int PART_NUMBER_FIELD_NUMBER = 3;
        public static final int SERIAL_NUMBER_FIELD_NUMBER = 2;
        private ByteString fwGithash_ = ByteString.EMPTY;
        private String serialNumber_ = "";
        private String partNumber_ = "";
        private String meterId_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<StemInfo, Builder> implements StemInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearFwGithash() {
                copyOnWrite();
                ((StemInfo) this.instance).clearFwGithash();
                return this;
            }

            public Builder clearMeterId() {
                copyOnWrite();
                ((StemInfo) this.instance).clearMeterId();
                return this;
            }

            public Builder clearPartNumber() {
                copyOnWrite();
                ((StemInfo) this.instance).clearPartNumber();
                return this;
            }

            public Builder clearSerialNumber() {
                copyOnWrite();
                ((StemInfo) this.instance).clearSerialNumber();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public ByteString getFwGithash() {
                return ((StemInfo) this.instance).getFwGithash();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public String getMeterId() {
                return ((StemInfo) this.instance).getMeterId();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public ByteString getMeterIdBytes() {
                return ((StemInfo) this.instance).getMeterIdBytes();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public String getPartNumber() {
                return ((StemInfo) this.instance).getPartNumber();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public ByteString getPartNumberBytes() {
                return ((StemInfo) this.instance).getPartNumberBytes();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public String getSerialNumber() {
                return ((StemInfo) this.instance).getSerialNumber();
            }

            @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
            public ByteString getSerialNumberBytes() {
                return ((StemInfo) this.instance).getSerialNumberBytes();
            }

            public Builder setFwGithash(ByteString byteString) {
                copyOnWrite();
                ((StemInfo) this.instance).setFwGithash(byteString);
                return this;
            }

            public Builder setMeterId(String str) {
                copyOnWrite();
                ((StemInfo) this.instance).setMeterId(str);
                return this;
            }

            public Builder setMeterIdBytes(ByteString byteString) {
                copyOnWrite();
                ((StemInfo) this.instance).setMeterIdBytes(byteString);
                return this;
            }

            public Builder setPartNumber(String str) {
                copyOnWrite();
                ((StemInfo) this.instance).setPartNumber(str);
                return this;
            }

            public Builder setPartNumberBytes(ByteString byteString) {
                copyOnWrite();
                ((StemInfo) this.instance).setPartNumberBytes(byteString);
                return this;
            }

            public Builder setSerialNumber(String str) {
                copyOnWrite();
                ((StemInfo) this.instance).setSerialNumber(str);
                return this;
            }

            public Builder setSerialNumberBytes(ByteString byteString) {
                copyOnWrite();
                ((StemInfo) this.instance).setSerialNumberBytes(byteString);
                return this;
            }

            private Builder() {
                super(StemInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            StemInfo stemInfo = new StemInfo();
            DEFAULT_INSTANCE = stemInfo;
            GeneratedMessageLite.registerDefaultInstance(StemInfo.class, stemInfo);
        }

        private StemInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFwGithash() {
            this.fwGithash_ = getDefaultInstance().getFwGithash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMeterId() {
            this.meterId_ = getDefaultInstance().getMeterId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPartNumber() {
            this.partNumber_ = getDefaultInstance().getPartNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSerialNumber() {
            this.serialNumber_ = getDefaultInstance().getSerialNumber();
        }

        public static StemInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StemInfo parseDelimitedFrom(InputStream inputStream) {
            return (StemInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemInfo parseFrom(ByteBuffer byteBuffer) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StemInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFwGithash(ByteString byteString) {
            byteString.getClass();
            this.fwGithash_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeterId(String str) {
            str.getClass();
            this.meterId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMeterIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.meterId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartNumber(String str) {
            str.getClass();
            this.partNumber_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPartNumberBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.partNumber_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerialNumber(String str) {
            str.getClass();
            this.serialNumber_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSerialNumberBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.serialNumber_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StemInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"fwGithash_", "serialNumber_", "partNumber_", "meterId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StemInfo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StemInfo.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public ByteString getFwGithash() {
            return this.fwGithash_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public String getMeterId() {
            return this.meterId_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public ByteString getMeterIdBytes() {
            return ByteString.copyFromUtf8(this.meterId_);
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public String getPartNumber() {
            return this.partNumber_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public ByteString getPartNumberBytes() {
            return ByteString.copyFromUtf8(this.partNumber_);
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public String getSerialNumber() {
            return this.serialNumber_;
        }

        @Override // com.tesla.proto.charging.v1.StemCommonProto.StemInfoOrBuilder
        public ByteString getSerialNumberBytes() {
            return ByteString.copyFromUtf8(this.serialNumber_);
        }

        public static Builder newBuilder(StemInfo stemInfo) {
            return DEFAULT_INSTANCE.createBuilder(stemInfo);
        }

        public static StemInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StemInfo parseFrom(ByteString byteString) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StemInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StemInfo parseFrom(byte[] bArr) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StemInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StemInfo parseFrom(InputStream inputStream) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemInfo parseFrom(CodedInputStream codedInputStream) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StemInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StemInfoOrBuilder extends MessageLiteOrBuilder {
        ByteString getFwGithash();

        String getMeterId();

        ByteString getMeterIdBytes();

        String getPartNumber();

        ByteString getPartNumberBytes();

        String getSerialNumber();

        ByteString getSerialNumberBytes();
    }

    private StemCommonProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
