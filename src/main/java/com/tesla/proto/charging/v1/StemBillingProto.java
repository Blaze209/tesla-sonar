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
public final class StemBillingProto {

    /* JADX INFO: renamed from: com.tesla.proto.charging.v1.StemBillingProto$1, reason: invalid class name */
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

    public static final class StemBilling extends GeneratedMessageLite<StemBilling, Builder> implements StemBillingOrBuilder {
        public static final int CHARGE_SESSION_TIME_SERIES_FIELD_NUMBER = 7;
        private static final StemBilling DEFAULT_INSTANCE;
        public static final int IDLE_TIME_S_FIELD_NUMBER = 6;
        public static final int LIFETIME_ENERGY_END_KWH_FIELD_NUMBER = 5;
        public static final int LIFETIME_ENERGY_START_KWH_FIELD_NUMBER = 4;
        private static volatile Parser<StemBilling> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        public static final int STEM_EVENT_INFO_FIELD_NUMBER = 3;
        public static final int STEM_INFO_FIELD_NUMBER = 1;
        private ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries_;
        private int idleTimeS_;
        private float lifetimeEnergyEndKwh_;
        private float lifetimeEnergyStartKwh_;
        private int sessionId_;
        private StemCommonProto.StemEventInfo stemEventInfo_;
        private StemCommonProto.StemInfo stemInfo_;

        public static final class Builder extends GeneratedMessageLite.Builder<StemBilling, Builder> implements StemBillingOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearChargeSessionTimeSeries() {
                copyOnWrite();
                ((StemBilling) this.instance).clearChargeSessionTimeSeries();
                return this;
            }

            public Builder clearIdleTimeS() {
                copyOnWrite();
                ((StemBilling) this.instance).clearIdleTimeS();
                return this;
            }

            public Builder clearLifetimeEnergyEndKwh() {
                copyOnWrite();
                ((StemBilling) this.instance).clearLifetimeEnergyEndKwh();
                return this;
            }

            public Builder clearLifetimeEnergyStartKwh() {
                copyOnWrite();
                ((StemBilling) this.instance).clearLifetimeEnergyStartKwh();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((StemBilling) this.instance).clearSessionId();
                return this;
            }

            public Builder clearStemEventInfo() {
                copyOnWrite();
                ((StemBilling) this.instance).clearStemEventInfo();
                return this;
            }

            public Builder clearStemInfo() {
                copyOnWrite();
                ((StemBilling) this.instance).clearStemInfo();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries getChargeSessionTimeSeries() {
                return ((StemBilling) this.instance).getChargeSessionTimeSeries();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public int getIdleTimeS() {
                return ((StemBilling) this.instance).getIdleTimeS();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public float getLifetimeEnergyEndKwh() {
                return ((StemBilling) this.instance).getLifetimeEnergyEndKwh();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public float getLifetimeEnergyStartKwh() {
                return ((StemBilling) this.instance).getLifetimeEnergyStartKwh();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public int getSessionId() {
                return ((StemBilling) this.instance).getSessionId();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public StemCommonProto.StemEventInfo getStemEventInfo() {
                return ((StemBilling) this.instance).getStemEventInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public StemCommonProto.StemInfo getStemInfo() {
                return ((StemBilling) this.instance).getStemInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public boolean hasChargeSessionTimeSeries() {
                return ((StemBilling) this.instance).hasChargeSessionTimeSeries();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public boolean hasStemEventInfo() {
                return ((StemBilling) this.instance).hasStemEventInfo();
            }

            @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
            public boolean hasStemInfo() {
                return ((StemBilling) this.instance).hasStemInfo();
            }

            public Builder mergeChargeSessionTimeSeries(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries) {
                copyOnWrite();
                ((StemBilling) this.instance).mergeChargeSessionTimeSeries(chargeSessionTimeSeries);
                return this;
            }

            public Builder mergeStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
                copyOnWrite();
                ((StemBilling) this.instance).mergeStemEventInfo(stemEventInfo);
                return this;
            }

            public Builder mergeStemInfo(StemCommonProto.StemInfo stemInfo) {
                copyOnWrite();
                ((StemBilling) this.instance).mergeStemInfo(stemInfo);
                return this;
            }

            public Builder setChargeSessionTimeSeries(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries) {
                copyOnWrite();
                ((StemBilling) this.instance).setChargeSessionTimeSeries(chargeSessionTimeSeries);
                return this;
            }

            public Builder setIdleTimeS(int i11) {
                copyOnWrite();
                ((StemBilling) this.instance).setIdleTimeS(i11);
                return this;
            }

            public Builder setLifetimeEnergyEndKwh(float f11) {
                copyOnWrite();
                ((StemBilling) this.instance).setLifetimeEnergyEndKwh(f11);
                return this;
            }

            public Builder setLifetimeEnergyStartKwh(float f11) {
                copyOnWrite();
                ((StemBilling) this.instance).setLifetimeEnergyStartKwh(f11);
                return this;
            }

            public Builder setSessionId(int i11) {
                copyOnWrite();
                ((StemBilling) this.instance).setSessionId(i11);
                return this;
            }

            public Builder setStemEventInfo(StemCommonProto.StemEventInfo stemEventInfo) {
                copyOnWrite();
                ((StemBilling) this.instance).setStemEventInfo(stemEventInfo);
                return this;
            }

            public Builder setStemInfo(StemCommonProto.StemInfo stemInfo) {
                copyOnWrite();
                ((StemBilling) this.instance).setStemInfo(stemInfo);
                return this;
            }

            private Builder() {
                super(StemBilling.DEFAULT_INSTANCE);
            }

            public Builder setChargeSessionTimeSeries(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.Builder builder) {
                copyOnWrite();
                ((StemBilling) this.instance).setChargeSessionTimeSeries(builder.build());
                return this;
            }

            public Builder setStemEventInfo(StemCommonProto.StemEventInfo.Builder builder) {
                copyOnWrite();
                ((StemBilling) this.instance).setStemEventInfo(builder.build());
                return this;
            }

            public Builder setStemInfo(StemCommonProto.StemInfo.Builder builder) {
                copyOnWrite();
                ((StemBilling) this.instance).setStemInfo(builder.build());
                return this;
            }
        }

        static {
            StemBilling stemBilling = new StemBilling();
            DEFAULT_INSTANCE = stemBilling;
            GeneratedMessageLite.registerDefaultInstance(StemBilling.class, stemBilling);
        }

        private StemBilling() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChargeSessionTimeSeries() {
            this.chargeSessionTimeSeries_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdleTimeS() {
            this.idleTimeS_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLifetimeEnergyEndKwh() {
            this.lifetimeEnergyEndKwh_ = BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLifetimeEnergyStartKwh() {
            this.lifetimeEnergyStartKwh_ = BitmapDescriptorFactory.HUE_RED;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStemEventInfo() {
            this.stemEventInfo_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStemInfo() {
            this.stemInfo_ = null;
        }

        public static StemBilling getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeChargeSessionTimeSeries(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries) {
            chargeSessionTimeSeries.getClass();
            ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries2 = this.chargeSessionTimeSeries_;
            if (chargeSessionTimeSeries2 == null || chargeSessionTimeSeries2 == ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.getDefaultInstance()) {
                this.chargeSessionTimeSeries_ = chargeSessionTimeSeries;
            } else {
                this.chargeSessionTimeSeries_ = ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.newBuilder(this.chargeSessionTimeSeries_).mergeFrom(chargeSessionTimeSeries).buildPartial();
            }
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

        public static StemBilling parseDelimitedFrom(InputStream inputStream) {
            return (StemBilling) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemBilling parseFrom(ByteBuffer byteBuffer) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StemBilling> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChargeSessionTimeSeries(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries) {
            chargeSessionTimeSeries.getClass();
            this.chargeSessionTimeSeries_ = chargeSessionTimeSeries;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdleTimeS(int i11) {
            this.idleTimeS_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifetimeEnergyEndKwh(float f11) {
            this.lifetimeEnergyEndKwh_ = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLifetimeEnergyStartKwh(float f11) {
            this.lifetimeEnergyStartKwh_ = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionId(int i11) {
            this.sessionId_ = i11;
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

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new StemBilling();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\t\u0004\u0001\u0005\u0001\u0006\u000b\u0007\t", new Object[]{"stemInfo_", "sessionId_", "stemEventInfo_", "lifetimeEnergyStartKwh_", "lifetimeEnergyEndKwh_", "idleTimeS_", "chargeSessionTimeSeries_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StemBilling> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StemBilling.class) {
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

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries getChargeSessionTimeSeries() {
            ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeries = this.chargeSessionTimeSeries_;
            return chargeSessionTimeSeries == null ? ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.getDefaultInstance() : chargeSessionTimeSeries;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public int getIdleTimeS() {
            return this.idleTimeS_;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public float getLifetimeEnergyEndKwh() {
            return this.lifetimeEnergyEndKwh_;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public float getLifetimeEnergyStartKwh() {
            return this.lifetimeEnergyStartKwh_;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public StemCommonProto.StemEventInfo getStemEventInfo() {
            StemCommonProto.StemEventInfo stemEventInfo = this.stemEventInfo_;
            return stemEventInfo == null ? StemCommonProto.StemEventInfo.getDefaultInstance() : stemEventInfo;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public StemCommonProto.StemInfo getStemInfo() {
            StemCommonProto.StemInfo stemInfo = this.stemInfo_;
            return stemInfo == null ? StemCommonProto.StemInfo.getDefaultInstance() : stemInfo;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public boolean hasChargeSessionTimeSeries() {
            return this.chargeSessionTimeSeries_ != null;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public boolean hasStemEventInfo() {
            return this.stemEventInfo_ != null;
        }

        @Override // com.tesla.proto.charging.v1.StemBillingProto.StemBillingOrBuilder
        public boolean hasStemInfo() {
            return this.stemInfo_ != null;
        }

        public static Builder newBuilder(StemBilling stemBilling) {
            return DEFAULT_INSTANCE.createBuilder(stemBilling);
        }

        public static StemBilling parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemBilling parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StemBilling parseFrom(ByteString byteString) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StemBilling parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StemBilling parseFrom(byte[] bArr) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StemBilling parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StemBilling parseFrom(InputStream inputStream) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StemBilling parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StemBilling parseFrom(CodedInputStream codedInputStream) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StemBilling parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StemBilling) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface StemBillingOrBuilder extends MessageLiteOrBuilder {
        ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries getChargeSessionTimeSeries();

        int getIdleTimeS();

        float getLifetimeEnergyEndKwh();

        float getLifetimeEnergyStartKwh();

        int getSessionId();

        StemCommonProto.StemEventInfo getStemEventInfo();

        StemCommonProto.StemInfo getStemInfo();

        boolean hasChargeSessionTimeSeries();

        boolean hasStemEventInfo();

        boolean hasStemInfo();
    }

    private StemBillingProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
