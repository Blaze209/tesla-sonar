package com.tesla.proto.charging.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ChargeSessionTimeSeriesProto {

    /* JADX INFO: renamed from: com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto$1, reason: invalid class name */
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

    public static final class ChargeSessionTimeSeries extends GeneratedMessageLite<ChargeSessionTimeSeries, Builder> implements ChargeSessionTimeSeriesOrBuilder {
        public static final int BUCKET_DURATION_S_FIELD_NUMBER = 4;
        public static final int BUCKET_ENERGY_VENDED_FIELD_NUMBER = 8;
        public static final int BUCKET_ENERGY_VENDED_WH_FIELD_NUMBER = 6;
        private static final ChargeSessionTimeSeries DEFAULT_INSTANCE;
        public static final int END_TIME_EPOCH_S_FIELD_NUMBER = 2;
        public static final int FIRST_BUCKET_DURATION_S_FIELD_NUMBER = 5;
        private static volatile Parser<ChargeSessionTimeSeries> PARSER = null;
        public static final int START_TIME_EPOCH_S_FIELD_NUMBER = 1;
        public static final int TOTAL_ENERGY_VENDED_FIELD_NUMBER = 7;
        public static final int TOTAL_ENERGY_VENDED_WH_FIELD_NUMBER = 3;
        private int bucketDurationS_;
        private int bucketEnergyVendedWhMemoizedSerializedSize = -1;
        private Internal.IntList bucketEnergyVendedWh_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<EnergyProto.Energy> bucketEnergyVended_ = GeneratedMessageLite.emptyProtobufList();
        private long endTimeEpochS_;
        private int firstBucketDurationS_;
        private long startTimeEpochS_;
        private int totalEnergyVendedWh_;
        private EnergyProto.Energy totalEnergyVended_;

        public static final class Builder extends GeneratedMessageLite.Builder<ChargeSessionTimeSeries, Builder> implements ChargeSessionTimeSeriesOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllBucketEnergyVended(Iterable<? extends EnergyProto.Energy> iterable) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addAllBucketEnergyVended(iterable);
                return this;
            }

            public Builder addAllBucketEnergyVendedWh(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addAllBucketEnergyVendedWh(iterable);
                return this;
            }

            public Builder addBucketEnergyVended(EnergyProto.Energy energy) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addBucketEnergyVended(energy);
                return this;
            }

            public Builder addBucketEnergyVendedWh(int i11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addBucketEnergyVendedWh(i11);
                return this;
            }

            public Builder clearBucketDurationS() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearBucketDurationS();
                return this;
            }

            public Builder clearBucketEnergyVended() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearBucketEnergyVended();
                return this;
            }

            public Builder clearBucketEnergyVendedWh() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearBucketEnergyVendedWh();
                return this;
            }

            public Builder clearEndTimeEpochS() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearEndTimeEpochS();
                return this;
            }

            public Builder clearFirstBucketDurationS() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearFirstBucketDurationS();
                return this;
            }

            public Builder clearStartTimeEpochS() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearStartTimeEpochS();
                return this;
            }

            public Builder clearTotalEnergyVended() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearTotalEnergyVended();
                return this;
            }

            public Builder clearTotalEnergyVendedWh() {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).clearTotalEnergyVendedWh();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getBucketDurationS() {
                return ((ChargeSessionTimeSeries) this.instance).getBucketDurationS();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public EnergyProto.Energy getBucketEnergyVended(int i11) {
                return ((ChargeSessionTimeSeries) this.instance).getBucketEnergyVended(i11);
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getBucketEnergyVendedCount() {
                return ((ChargeSessionTimeSeries) this.instance).getBucketEnergyVendedCount();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public List<EnergyProto.Energy> getBucketEnergyVendedList() {
                return Collections.unmodifiableList(((ChargeSessionTimeSeries) this.instance).getBucketEnergyVendedList());
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getBucketEnergyVendedWh(int i11) {
                return ((ChargeSessionTimeSeries) this.instance).getBucketEnergyVendedWh(i11);
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getBucketEnergyVendedWhCount() {
                return ((ChargeSessionTimeSeries) this.instance).getBucketEnergyVendedWhCount();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public List<Integer> getBucketEnergyVendedWhList() {
                return Collections.unmodifiableList(((ChargeSessionTimeSeries) this.instance).getBucketEnergyVendedWhList());
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public long getEndTimeEpochS() {
                return ((ChargeSessionTimeSeries) this.instance).getEndTimeEpochS();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getFirstBucketDurationS() {
                return ((ChargeSessionTimeSeries) this.instance).getFirstBucketDurationS();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public long getStartTimeEpochS() {
                return ((ChargeSessionTimeSeries) this.instance).getStartTimeEpochS();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public EnergyProto.Energy getTotalEnergyVended() {
                return ((ChargeSessionTimeSeries) this.instance).getTotalEnergyVended();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public int getTotalEnergyVendedWh() {
                return ((ChargeSessionTimeSeries) this.instance).getTotalEnergyVendedWh();
            }

            @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
            public boolean hasTotalEnergyVended() {
                return ((ChargeSessionTimeSeries) this.instance).hasTotalEnergyVended();
            }

            public Builder mergeTotalEnergyVended(EnergyProto.Energy energy) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).mergeTotalEnergyVended(energy);
                return this;
            }

            public Builder removeBucketEnergyVended(int i11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).removeBucketEnergyVended(i11);
                return this;
            }

            public Builder setBucketDurationS(int i11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setBucketDurationS(i11);
                return this;
            }

            public Builder setBucketEnergyVended(int i11, EnergyProto.Energy energy) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setBucketEnergyVended(i11, energy);
                return this;
            }

            public Builder setBucketEnergyVendedWh(int i11, int i12) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setBucketEnergyVendedWh(i11, i12);
                return this;
            }

            public Builder setEndTimeEpochS(long j11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setEndTimeEpochS(j11);
                return this;
            }

            public Builder setFirstBucketDurationS(int i11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setFirstBucketDurationS(i11);
                return this;
            }

            public Builder setStartTimeEpochS(long j11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setStartTimeEpochS(j11);
                return this;
            }

            public Builder setTotalEnergyVended(EnergyProto.Energy energy) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setTotalEnergyVended(energy);
                return this;
            }

            public Builder setTotalEnergyVendedWh(int i11) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setTotalEnergyVendedWh(i11);
                return this;
            }

            private Builder() {
                super(ChargeSessionTimeSeries.DEFAULT_INSTANCE);
            }

            public Builder addBucketEnergyVended(int i11, EnergyProto.Energy energy) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addBucketEnergyVended(i11, energy);
                return this;
            }

            public Builder setBucketEnergyVended(int i11, EnergyProto.Energy.Builder builder) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setBucketEnergyVended(i11, builder.build());
                return this;
            }

            public Builder setTotalEnergyVended(EnergyProto.Energy.Builder builder) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).setTotalEnergyVended(builder.build());
                return this;
            }

            public Builder addBucketEnergyVended(EnergyProto.Energy.Builder builder) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addBucketEnergyVended(builder.build());
                return this;
            }

            public Builder addBucketEnergyVended(int i11, EnergyProto.Energy.Builder builder) {
                copyOnWrite();
                ((ChargeSessionTimeSeries) this.instance).addBucketEnergyVended(i11, builder.build());
                return this;
            }
        }

        static {
            ChargeSessionTimeSeries chargeSessionTimeSeries = new ChargeSessionTimeSeries();
            DEFAULT_INSTANCE = chargeSessionTimeSeries;
            GeneratedMessageLite.registerDefaultInstance(ChargeSessionTimeSeries.class, chargeSessionTimeSeries);
        }

        private ChargeSessionTimeSeries() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBucketEnergyVended(Iterable<? extends EnergyProto.Energy> iterable) {
            ensureBucketEnergyVendedIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.bucketEnergyVended_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBucketEnergyVendedWh(Iterable<? extends Integer> iterable) {
            ensureBucketEnergyVendedWhIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.bucketEnergyVendedWh_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBucketEnergyVended(EnergyProto.Energy energy) {
            energy.getClass();
            ensureBucketEnergyVendedIsMutable();
            this.bucketEnergyVended_.add(energy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBucketEnergyVendedWh(int i11) {
            ensureBucketEnergyVendedWhIsMutable();
            this.bucketEnergyVendedWh_.addInt(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBucketDurationS() {
            this.bucketDurationS_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBucketEnergyVended() {
            this.bucketEnergyVended_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBucketEnergyVendedWh() {
            this.bucketEnergyVendedWh_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndTimeEpochS() {
            this.endTimeEpochS_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirstBucketDurationS() {
            this.firstBucketDurationS_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartTimeEpochS() {
            this.startTimeEpochS_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalEnergyVended() {
            this.totalEnergyVended_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotalEnergyVendedWh() {
            this.totalEnergyVendedWh_ = 0;
        }

        private void ensureBucketEnergyVendedIsMutable() {
            Internal.ProtobufList<EnergyProto.Energy> protobufList = this.bucketEnergyVended_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.bucketEnergyVended_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureBucketEnergyVendedWhIsMutable() {
            Internal.IntList intList = this.bucketEnergyVendedWh_;
            if (intList.isModifiable()) {
                return;
            }
            this.bucketEnergyVendedWh_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static ChargeSessionTimeSeries getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTotalEnergyVended(EnergyProto.Energy energy) {
            energy.getClass();
            EnergyProto.Energy energy2 = this.totalEnergyVended_;
            if (energy2 == null || energy2 == EnergyProto.Energy.getDefaultInstance()) {
                this.totalEnergyVended_ = energy;
            } else {
                this.totalEnergyVended_ = EnergyProto.Energy.newBuilder(this.totalEnergyVended_).mergeFrom(energy).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChargeSessionTimeSeries parseDelimitedFrom(InputStream inputStream) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChargeSessionTimeSeries parseFrom(ByteBuffer byteBuffer) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ChargeSessionTimeSeries> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBucketEnergyVended(int i11) {
            ensureBucketEnergyVendedIsMutable();
            this.bucketEnergyVended_.remove(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBucketDurationS(int i11) {
            this.bucketDurationS_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBucketEnergyVended(int i11, EnergyProto.Energy energy) {
            energy.getClass();
            ensureBucketEnergyVendedIsMutable();
            this.bucketEnergyVended_.set(i11, energy);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBucketEnergyVendedWh(int i11, int i12) {
            ensureBucketEnergyVendedWhIsMutable();
            this.bucketEnergyVendedWh_.setInt(i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndTimeEpochS(long j11) {
            this.endTimeEpochS_ = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirstBucketDurationS(int i11) {
            this.firstBucketDurationS_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartTimeEpochS(long j11) {
            this.startTimeEpochS_ = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalEnergyVended(EnergyProto.Energy energy) {
            energy.getClass();
            this.totalEnergyVended_ = energy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotalEnergyVendedWh(int i11) {
            this.totalEnergyVendedWh_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChargeSessionTimeSeries();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\u0003\u0002\u0003\u0003\u000b\u0004\u000b\u0005\u000b\u0006+\u0007\t\b\u001b", new Object[]{"startTimeEpochS_", "endTimeEpochS_", "totalEnergyVendedWh_", "bucketDurationS_", "firstBucketDurationS_", "bucketEnergyVendedWh_", "totalEnergyVended_", "bucketEnergyVended_", EnergyProto.Energy.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChargeSessionTimeSeries> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ChargeSessionTimeSeries.class) {
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

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getBucketDurationS() {
            return this.bucketDurationS_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public EnergyProto.Energy getBucketEnergyVended(int i11) {
            return this.bucketEnergyVended_.get(i11);
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getBucketEnergyVendedCount() {
            return this.bucketEnergyVended_.size();
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public List<EnergyProto.Energy> getBucketEnergyVendedList() {
            return this.bucketEnergyVended_;
        }

        public EnergyProto.EnergyOrBuilder getBucketEnergyVendedOrBuilder(int i11) {
            return this.bucketEnergyVended_.get(i11);
        }

        public List<? extends EnergyProto.EnergyOrBuilder> getBucketEnergyVendedOrBuilderList() {
            return this.bucketEnergyVended_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getBucketEnergyVendedWh(int i11) {
            return this.bucketEnergyVendedWh_.getInt(i11);
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getBucketEnergyVendedWhCount() {
            return this.bucketEnergyVendedWh_.size();
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public List<Integer> getBucketEnergyVendedWhList() {
            return this.bucketEnergyVendedWh_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public long getEndTimeEpochS() {
            return this.endTimeEpochS_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getFirstBucketDurationS() {
            return this.firstBucketDurationS_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public long getStartTimeEpochS() {
            return this.startTimeEpochS_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public EnergyProto.Energy getTotalEnergyVended() {
            EnergyProto.Energy energy = this.totalEnergyVended_;
            return energy == null ? EnergyProto.Energy.getDefaultInstance() : energy;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public int getTotalEnergyVendedWh() {
            return this.totalEnergyVendedWh_;
        }

        @Override // com.tesla.proto.charging.v1.ChargeSessionTimeSeriesProto.ChargeSessionTimeSeriesOrBuilder
        public boolean hasTotalEnergyVended() {
            return this.totalEnergyVended_ != null;
        }

        public static Builder newBuilder(ChargeSessionTimeSeries chargeSessionTimeSeries) {
            return DEFAULT_INSTANCE.createBuilder(chargeSessionTimeSeries);
        }

        public static ChargeSessionTimeSeries parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChargeSessionTimeSeries parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ChargeSessionTimeSeries parseFrom(ByteString byteString) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBucketEnergyVended(int i11, EnergyProto.Energy energy) {
            energy.getClass();
            ensureBucketEnergyVendedIsMutable();
            this.bucketEnergyVended_.add(i11, energy);
        }

        public static ChargeSessionTimeSeries parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ChargeSessionTimeSeries parseFrom(byte[] bArr) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChargeSessionTimeSeries parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ChargeSessionTimeSeries parseFrom(InputStream inputStream) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChargeSessionTimeSeries parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ChargeSessionTimeSeries parseFrom(CodedInputStream codedInputStream) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ChargeSessionTimeSeries parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChargeSessionTimeSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ChargeSessionTimeSeriesOrBuilder extends MessageLiteOrBuilder {
        int getBucketDurationS();

        EnergyProto.Energy getBucketEnergyVended(int i11);

        int getBucketEnergyVendedCount();

        List<EnergyProto.Energy> getBucketEnergyVendedList();

        int getBucketEnergyVendedWh(int i11);

        int getBucketEnergyVendedWhCount();

        List<Integer> getBucketEnergyVendedWhList();

        long getEndTimeEpochS();

        int getFirstBucketDurationS();

        long getStartTimeEpochS();

        EnergyProto.Energy getTotalEnergyVended();

        int getTotalEnergyVendedWh();

        boolean hasTotalEnergyVended();
    }

    private ChargeSessionTimeSeriesProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
