package com.tesla.proto.charging.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class EnergyProto {

    /* JADX INFO: renamed from: com.tesla.proto.charging.v1.EnergyProto$1, reason: invalid class name */
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

    public static final class Energy extends GeneratedMessageLite<Energy, Builder> implements EnergyOrBuilder {
        private static final Energy DEFAULT_INSTANCE;
        public static final int MILLI_WATT_HOURS_FIELD_NUMBER = 2;
        private static volatile Parser<Energy> PARSER = null;
        public static final int WATT_HOURS_FIELD_NUMBER = 1;
        private int milliWattHours_;
        private int wattHours_;

        public static final class Builder extends GeneratedMessageLite.Builder<Energy, Builder> implements EnergyOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearMilliWattHours() {
                copyOnWrite();
                ((Energy) this.instance).clearMilliWattHours();
                return this;
            }

            public Builder clearWattHours() {
                copyOnWrite();
                ((Energy) this.instance).clearWattHours();
                return this;
            }

            @Override // com.tesla.proto.charging.v1.EnergyProto.EnergyOrBuilder
            public int getMilliWattHours() {
                return ((Energy) this.instance).getMilliWattHours();
            }

            @Override // com.tesla.proto.charging.v1.EnergyProto.EnergyOrBuilder
            public int getWattHours() {
                return ((Energy) this.instance).getWattHours();
            }

            public Builder setMilliWattHours(int i11) {
                copyOnWrite();
                ((Energy) this.instance).setMilliWattHours(i11);
                return this;
            }

            public Builder setWattHours(int i11) {
                copyOnWrite();
                ((Energy) this.instance).setWattHours(i11);
                return this;
            }

            private Builder() {
                super(Energy.DEFAULT_INSTANCE);
            }
        }

        static {
            Energy energy = new Energy();
            DEFAULT_INSTANCE = energy;
            GeneratedMessageLite.registerDefaultInstance(Energy.class, energy);
        }

        private Energy() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMilliWattHours() {
            this.milliWattHours_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWattHours() {
            this.wattHours_ = 0;
        }

        public static Energy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Energy parseDelimitedFrom(InputStream inputStream) {
            return (Energy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Energy parseFrom(ByteBuffer byteBuffer) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Energy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMilliWattHours(int i11) {
            this.milliWattHours_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWattHours(int i11) {
            this.wattHours_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Energy();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"wattHours_", "milliWattHours_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Energy> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Energy.class) {
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

        @Override // com.tesla.proto.charging.v1.EnergyProto.EnergyOrBuilder
        public int getMilliWattHours() {
            return this.milliWattHours_;
        }

        @Override // com.tesla.proto.charging.v1.EnergyProto.EnergyOrBuilder
        public int getWattHours() {
            return this.wattHours_;
        }

        public static Builder newBuilder(Energy energy) {
            return DEFAULT_INSTANCE.createBuilder(energy);
        }

        public static Energy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Energy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Energy parseFrom(ByteString byteString) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Energy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Energy parseFrom(byte[] bArr) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Energy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Energy parseFrom(InputStream inputStream) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Energy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Energy parseFrom(CodedInputStream codedInputStream) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Energy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Energy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EnergyOrBuilder extends MessageLiteOrBuilder {
        int getMilliWattHours();

        int getWattHours();
    }

    private EnergyProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
