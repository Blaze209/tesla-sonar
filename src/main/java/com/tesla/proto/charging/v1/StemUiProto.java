package com.tesla.proto.charging.v1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class StemUiProto {

    /* JADX INFO: renamed from: com.tesla.proto.charging.v1.StemUiProto$1, reason: invalid class name */
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

    public static final class StemUi extends GeneratedMessageLite<StemUi, Builder> implements StemUiOrBuilder {
        private static final StemUi DEFAULT_INSTANCE;
        public static final int IDLE_TIME_S_FIELD_NUMBER = 4;
        private static volatile Parser<StemUi> PARSER = null;
        public static final int SESSION_ENERGY_KWH_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        public static final int START_TIME_EPOCH_S_FIELD_NUMBER = 5;
        public static final int STEM_EVENT_INFO_FIELD_NUMBER = 6;
        public static final int STEM_INFO_FIELD_NUMBER = 1;
        public static final int SYSTEM_TIME_EPOCH_S_FIELD_NUMBER = 3;
        private int idleTimeS_;
        private float sessionEnergyKwh_;
        private int sessionId_;
        private long startTimeEpochS_;
        private StemCommonProto.StemEventInfo stemEventInfo_;
        private StemCommonProto.StemInfo stemInfo_;
        private long systemTimeEpochS_;

        public static final class Builder extends GeneratedMessageLite.Builder<StemUi, Builder> implements StemUiOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearIdleTimeS() {
                copyOnWrite();
                ((StemUi) this.instance).clearIdleTimeS();
                return this;
            }

            public Builder clearSessionEnergyKwh() {
                copyOnWrite();
                ((StemUi) this.instance).clearSessionEnergyKwh();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StemUi) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStartTimeEpochS() {
                copyOnWrite();
                ((StemUi) this.instance).clearStartTimeEpochS();
                return this;
            }

            public Builder clearStemEventInfo() {
                copyOnWrite();
                ((StemUi) this.instance).clearStemEventInfo();
                return this;
            }

            public Builder clearStemInfo() {
                copyOnWrite();
                ((StemUi) this.instance).clearStemInfo();
                return this;
            }

            public Builder clearSystemTimeEpochS() {
                copyOnWrite();
                ((StemUi) this.instance).clearSystemTimeEpochS();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public int getIdleTimeS() {
                return ((StemUi) this.instance).getIdleTimeS();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public float getSessionEnergyKwh() {
                return ((StemUi) this.instance).getSessionEnergyKwh();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public int getSessionId() {
                return ((StemUi) this.instance).getSessionId();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public long getStartTimeEpochS() {
                return ((StemUi) this.instance).getStartTimeEpochS();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public StemCommonProto.StemEventInfo getStemEventInfo() {
                return ((StemUi) this.instance).getStemEventInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public StemCommonProto.StemInfo getStemInfo() {
                return ((StemUi) this.instance).getStemInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public long getSystemTimeEpochS() {
                return ((StemUi) this.instance).getSystemTimeEpochS();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public boolean hasStemEventInfo() {
                return ((StemUi) this.instance).hasStemEventInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
            public boolean hasStemInfo() {
                return ((StemUi) this.instance).hasStemInfo();
            }

            public Builder mergeStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
                copyOnWrite();
                ((StemUi) this.instance).mergeStemEventInfo(stemEventInfo);
                return this;
            }

            public Builder mergeStemInfo(StemCommonProto.StemInfo stemInfo) {
                copyOnWrite();
                ((StemUi) this.instance).mergeStemInfo(stemInfo);
                return this;
            }

            public Builder setIdleTimeS(int i11) {
                copyOnWrite();
                ((StemUi) this.instance).setIdleTimeS(i11);
                return this;
            }

            public Builder setSessionEnergyKwh(float f11) {
                copyOnWrite();
                ((StemUi) this.instance).setSessionEnergyKwh(f11);
                return this;
            }

            public Builder setSessionId(int i11) {
                copyOnWrite();
                ((StemUi) this.instance).setSessionId(i11);
                return this;
            }

            public Builder setStartTimeEpochS(long j11) {
                copyOnWrite();
                ((StemUi) this.instance).setStartTimeEpochS(j11);
                return this;
            }

            public Builder setStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
                copyOnWrite();
                ((StemUi) this.instance).setStemEventInfo(stemEventInfo);
                return this;
            }

            public Builder setStemInfo(StemCommonProto.StemInfo stemInfo) {
                copyOnWrite();
                ((StemUi) this.instance).setStemInfo(stemInfo);
                return this;
            }

            public Builder setSystemTimeEpochS(long j11) {
                copyOnWrite();
                ((StemUi) this.instance).setSystemTimeEpochS(j11);
                return this;
            }

            private Builder() {
                super(StemUi.DEFAULT_INSTANCE);
            }

            public Builder setStemEventInfo(StemCommonProto.StemEventInfo.Builder builder) {
                copyOnWrite();
                ((StemUi) this.instance).setStemEventInfo(builder.build());
                return this;
            }

            public Builder setStemInfo(StemCommonProto.StemInfo.Builder builder) {
                copyOnWrite();
                ((StemUi) this.instance).setStemInfo(builder.build());
                return this;
            }
        }

        static {
            StemUi stemUi = new StemUi();
            DEFAULT_INSTANCE = stemUi;
            GeneratedMessageLite.registerDefaultInstance(StemUi.class, stemUi);
        }

        private StemUi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdleTimeS() {
            this.idleTimeS_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionEnergyKwh() {
            this.sessionEnergyKwh_ = BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimeEpochS() {
            this.startTimeEpochS_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStemEventInfo() {
            this.stemEventInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStemInfo() {
            this.stemInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemTimeEpochS() {
            this.systemTimeEpochS_ = 0L;
        }

        public static StemUi getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
            stemEventInfo.getClass();
            StemCommonProto.StemEventInfo stemEventInfo2 = this.stemEventInfo_;
            if (stemEventInfo2 == null || stemEventInfo2 == StemCommonProto.StemEventInfo.getDefaultInstance()) {
                this.stemEventInfo_ = stemEventInfo;
            } else {
                this.stemEventInfo_ = StemCommonProto.StemEventInfo.newBuilder(this.stemEventInfo_).mergeFrom(stemEventInfo).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStemInfo(StemCommonProto.StemInfo stemInfo) {
            stemInfo.getClass();
            StemCommonProto.StemInfo stemInfo2 = this.stemInfo_;
            if (stemInfo2 == null || stemInfo2 == StemCommonProto.StemInfo.getDefaultInstance()) {
                this.stemInfo_ = stemInfo;
            } else {
                this.stemInfo_ = StemCommonProto.StemInfo.newBuilder(this.stemInfo_).mergeFrom(stemInfo).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StemUi parseDelimitedFrom(InputStream inputStream) {
            return (StemUi) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemUi parseFrom(ByteBuffer byteBuffer) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StemUi> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdleTimeS(int i11) {
            this.idleTimeS_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionEnergyKwh(float f11) {
            this.sessionEnergyKwh_ = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(int i11) {
            this.sessionId_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeEpochS(long j11) {
            this.startTimeEpochS_ = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
            stemEventInfo.getClass();
            this.stemEventInfo_ = stemEventInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStemInfo(StemCommonProto.StemInfo stemInfo) {
            stemInfo.getClass();
            this.stemInfo_ = stemInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemTimeEpochS(long j11) {
            this.systemTimeEpochS_ = j11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StemUi();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u0003\u0004\u000b\u0005\u0003\u0006\t\u0007\u0001", new Object[]{"stemInfo_", "sessionId_", "systemTimeEpochS_", "idleTimeS_", "startTimeEpochS_", "stemEventInfo_", "sessionEnergyKwh_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StemUi> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StemUi.class) {
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

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public int getIdleTimeS() {
            return this.idleTimeS_;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public float getSessionEnergyKwh() {
            return this.sessionEnergyKwh_;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public long getStartTimeEpochS() {
            return this.startTimeEpochS_;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public StemCommonProto.StemEventInfo getStemEventInfo() {
            StemCommonProto.StemEventInfo stemEventInfo = this.stemEventInfo_;
            return stemEventInfo == null ? StemCommonProto.StemEventInfo.getDefaultInstance() : stemEventInfo;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public StemCommonProto.StemInfo getStemInfo() {
            StemCommonProto.StemInfo stemInfo = this.stemInfo_;
            return stemInfo == null ? StemCommonProto.StemInfo.getDefaultInstance() : stemInfo;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public long getSystemTimeEpochS() {
            return this.systemTimeEpochS_;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public boolean hasStemEventInfo() {
            return this.stemEventInfo_ != null;
        }

        @Override // com.tesla.proto.charging.v1.StemUiProto.StemUiOrBuilder
        public boolean hasStemInfo() {
            return this.stemInfo_ != null;
        }

        public static Builder newBuilder(StemUi stemUi) {
            return DEFAULT_INSTANCE.createBuilder(stemUi);
        }

        public static StemUi parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemUi parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StemUi parseFrom(ByteString byteString) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StemUi parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StemUi parseFrom(byte[] bArr) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StemUi parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StemUi parseFrom(InputStream inputStream) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemUi parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemUi parseFrom(CodedInputStream codedInputStream) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StemUi parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemUi) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StemUiOrBuilder extends MessageLiteOrBuilder {
        int getIdleTimeS();

        float getSessionEnergyKwh();

        int getSessionId();

        long getStartTimeEpochS();

        StemCommonProto.StemEventInfo getStemEventInfo();

        StemCommonProto.StemInfo getStemInfo();

        long getSystemTimeEpochS();

        boolean hasStemEventInfo();

        boolean hasStemInfo();
    }

    private StemUiProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
