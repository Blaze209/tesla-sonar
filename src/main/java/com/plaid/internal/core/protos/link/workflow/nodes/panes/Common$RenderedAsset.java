package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Common$RenderedAsset extends GeneratedMessageLite<Common$RenderedAsset, a> implements MessageLiteOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 8;
    public static final int BYTES_FIELD_NUMBER = 6;
    public static final int CLIENT_CUSTOMIZATIONS_FIELD_NUMBER = 9;
    private static final Common$RenderedAsset DEFAULT_INSTANCE;
    public static final int DIMENSIONS_FIELD_NUMBER = 3;
    public static final int EXPIRY_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_TEMPLATE_FIELD_NUMBER = 4;
    private static volatile Parser<Common$RenderedAsset> PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    private int bitField0_;
    private ClientCustomizations clientCustomizations_;
    private Object content_;
    private Dimensions dimensions_;
    private Timestamp expiry_;
    private boolean isTemplate_;
    private int contentCase_ = 0;
    private String id_ = "";

    public static final class ClientCustomizations extends GeneratedMessageLite<ClientCustomizations, a> implements MessageLiteOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 1;
        private static final ClientCustomizations DEFAULT_INSTANCE;
        private static volatile Parser<ClientCustomizations> PARSER;
        private String color_ = "";

        public static final class a extends GeneratedMessageLite.Builder<ClientCustomizations, a> implements MessageLiteOrBuilder {
            public a() {
                super(ClientCustomizations.DEFAULT_INSTANCE);
            }
        }

        static {
            ClientCustomizations clientCustomizations = new ClientCustomizations();
            DEFAULT_INSTANCE = clientCustomizations;
            GeneratedMessageLite.registerDefaultInstance(ClientCustomizations.class, clientCustomizations);
        }

        private ClientCustomizations() {
        }

        private void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        public static ClientCustomizations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientCustomizations parseDelimitedFrom(InputStream inputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCustomizations parseFrom(ByteBuffer byteBuffer) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ClientCustomizations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        private void setColorBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientCustomizations();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"color_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientCustomizations> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ClientCustomizations.class) {
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

        public String getColor() {
            return this.color_;
        }

        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        public static a newBuilder(ClientCustomizations clientCustomizations) {
            return DEFAULT_INSTANCE.createBuilder(clientCustomizations);
        }

        public static ClientCustomizations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(ByteString byteString) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientCustomizations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(byte[] bArr) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientCustomizations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(InputStream inputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientCustomizations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientCustomizations parseFrom(CodedInputStream codedInputStream) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientCustomizations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Dimensions extends GeneratedMessageLite<Dimensions, a> implements MessageLiteOrBuilder {
        private static final Dimensions DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile Parser<Dimensions> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int height_;
        private int width_;

        public static final class a extends GeneratedMessageLite.Builder<Dimensions, a> implements MessageLiteOrBuilder {
            public a() {
                super(Dimensions.DEFAULT_INSTANCE);
            }
        }

        static {
            Dimensions dimensions = new Dimensions();
            DEFAULT_INSTANCE = dimensions;
            GeneratedMessageLite.registerDefaultInstance(Dimensions.class, dimensions);
        }

        private Dimensions() {
        }

        private void clearHeight() {
            this.height_ = 0;
        }

        private void clearWidth() {
            this.width_ = 0;
        }

        public static Dimensions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Dimensions parseDelimitedFrom(InputStream inputStream) {
            return (Dimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dimensions parseFrom(ByteBuffer byteBuffer) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Dimensions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHeight(int i11) {
            this.height_ = i11;
        }

        private void setWidth(int i11) {
            this.width_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dimensions();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"width_", "height_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Dimensions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Dimensions.class) {
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

        public int getHeight() {
            return this.height_;
        }

        public int getWidth() {
            return this.width_;
        }

        public static a newBuilder(Dimensions dimensions) {
            return DEFAULT_INSTANCE.createBuilder(dimensions);
        }

        public static Dimensions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dimensions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Dimensions parseFrom(ByteString byteString) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Dimensions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Dimensions parseFrom(byte[] bArr) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dimensions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Dimensions parseFrom(InputStream inputStream) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dimensions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Dimensions parseFrom(CodedInputStream codedInputStream) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Dimensions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Dimensions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<Common$RenderedAsset, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$RenderedAsset.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        URL(5),
        BYTES(6),
        ASSET(8),
        CONTENT_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47176a;

        b(int i11) {
            this.f47176a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return CONTENT_NOT_SET;
            }
            if (i11 == 8) {
                return ASSET;
            }
            if (i11 == 5) {
                return URL;
            }
            if (i11 != 6) {
                return null;
            }
            return BYTES;
        }

        public int getNumber() {
            return this.f47176a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$RenderedAsset common$RenderedAsset = new Common$RenderedAsset();
        DEFAULT_INSTANCE = common$RenderedAsset;
        GeneratedMessageLite.registerDefaultInstance(Common$RenderedAsset.class, common$RenderedAsset);
    }

    private Common$RenderedAsset() {
    }

    private void clearAsset() {
        if (this.contentCase_ == 8) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    private void clearBytes() {
        if (this.contentCase_ == 6) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    private void clearClientCustomizations() {
        this.clientCustomizations_ = null;
        this.bitField0_ &= -5;
    }

    private void clearContent() {
        this.contentCase_ = 0;
        this.content_ = null;
    }

    private void clearDimensions() {
        this.dimensions_ = null;
        this.bitField0_ &= -3;
    }

    private void clearExpiry() {
        this.expiry_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsTemplate() {
        this.isTemplate_ = false;
    }

    private void clearUrl() {
        if (this.contentCase_ == 5) {
            this.contentCase_ = 0;
            this.content_ = null;
        }
    }

    public static Common$RenderedAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientCustomizations(ClientCustomizations clientCustomizations) {
        clientCustomizations.getClass();
        ClientCustomizations clientCustomizations2 = this.clientCustomizations_;
        if (clientCustomizations2 == null || clientCustomizations2 == ClientCustomizations.getDefaultInstance()) {
            this.clientCustomizations_ = clientCustomizations;
        } else {
            this.clientCustomizations_ = ClientCustomizations.newBuilder(this.clientCustomizations_).mergeFrom(clientCustomizations).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeDimensions(Dimensions dimensions) {
        dimensions.getClass();
        Dimensions dimensions2 = this.dimensions_;
        if (dimensions2 == null || dimensions2 == Dimensions.getDefaultInstance()) {
            this.dimensions_ = dimensions;
        } else {
            this.dimensions_ = Dimensions.newBuilder(this.dimensions_).mergeFrom(dimensions).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeExpiry(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.expiry_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.expiry_ = timestamp;
        } else {
            this.expiry_ = Timestamp.newBuilder(this.expiry_).mergeFrom(timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RenderedAsset parseDelimitedFrom(InputStream inputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAsset parseFrom(ByteBuffer byteBuffer) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$RenderedAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAsset(EnumC4419g enumC4419g) {
        this.content_ = Integer.valueOf(enumC4419g.getNumber());
        this.contentCase_ = 8;
    }

    private void setAssetValue(int i11) {
        this.contentCase_ = 8;
        this.content_ = Integer.valueOf(i11);
    }

    private void setBytes(ByteString byteString) {
        byteString.getClass();
        this.contentCase_ = 6;
        this.content_ = byteString;
    }

    private void setClientCustomizations(ClientCustomizations clientCustomizations) {
        clientCustomizations.getClass();
        this.clientCustomizations_ = clientCustomizations;
        this.bitField0_ |= 4;
    }

    private void setDimensions(Dimensions dimensions) {
        dimensions.getClass();
        this.dimensions_ = dimensions;
        this.bitField0_ |= 2;
    }

    private void setExpiry(Timestamp timestamp) {
        timestamp.getClass();
        this.expiry_ = timestamp;
        this.bitField0_ |= 1;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setIsTemplate(boolean z11) {
        this.isTemplate_ = z11;
    }

    private void setUrl(String str) {
        str.getClass();
        this.contentCase_ = 5;
        this.content_ = str;
    }

    private void setUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
        this.contentCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RenderedAsset();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005Ȼ\u0000\u0006=\u0000\b?\u0000\tဉ\u0002", new Object[]{"content_", "contentCase_", "bitField0_", "id_", "expiry_", "dimensions_", "isTemplate_", "clientCustomizations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RenderedAsset> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$RenderedAsset.class) {
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

    public EnumC4419g getAsset() {
        if (this.contentCase_ != 8) {
            return EnumC4419g.SDK_ASSET_UNKNOWN;
        }
        EnumC4419g enumC4419gForNumber = EnumC4419g.forNumber(((Integer) this.content_).intValue());
        return enumC4419gForNumber == null ? EnumC4419g.UNRECOGNIZED : enumC4419gForNumber;
    }

    public int getAssetValue() {
        if (this.contentCase_ == 8) {
            return ((Integer) this.content_).intValue();
        }
        return 0;
    }

    public ByteString getBytes() {
        return this.contentCase_ == 6 ? (ByteString) this.content_ : ByteString.EMPTY;
    }

    public ClientCustomizations getClientCustomizations() {
        ClientCustomizations clientCustomizations = this.clientCustomizations_;
        return clientCustomizations == null ? ClientCustomizations.getDefaultInstance() : clientCustomizations;
    }

    public b getContentCase() {
        return b.forNumber(this.contentCase_);
    }

    public Dimensions getDimensions() {
        Dimensions dimensions = this.dimensions_;
        return dimensions == null ? Dimensions.getDefaultInstance() : dimensions;
    }

    public Timestamp getExpiry() {
        Timestamp timestamp = this.expiry_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public boolean getIsTemplate() {
        return this.isTemplate_;
    }

    public String getUrl() {
        return this.contentCase_ == 5 ? (String) this.content_ : "";
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.contentCase_ == 5 ? (String) this.content_ : "");
    }

    public boolean hasAsset() {
        return this.contentCase_ == 8;
    }

    public boolean hasBytes() {
        return this.contentCase_ == 6;
    }

    public boolean hasClientCustomizations() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDimensions() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasExpiry() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUrl() {
        return this.contentCase_ == 5;
    }

    public static a newBuilder(Common$RenderedAsset common$RenderedAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAsset);
    }

    public static Common$RenderedAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(ByteString byteString) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$RenderedAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(byte[] bArr) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RenderedAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(InputStream inputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAsset parseFrom(CodedInputStream codedInputStream) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RenderedAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
