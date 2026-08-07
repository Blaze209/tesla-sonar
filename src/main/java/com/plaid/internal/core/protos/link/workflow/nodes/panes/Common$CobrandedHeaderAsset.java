package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Common$CobrandedHeaderAsset extends GeneratedMessageLite<Common$CobrandedHeaderAsset, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_BRAND_COLOR_FIELD_NUMBER = 1;
    public static final int CLIENT_LOGO_ASSET_FIELD_NUMBER = 2;
    public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 4;
    private static final Common$CobrandedHeaderAsset DEFAULT_INSTANCE;
    public static final int HAS_GLOW_ARC_FIELD_NUMBER = 5;
    private static volatile Parser<Common$CobrandedHeaderAsset> PARSER = null;
    public static final int PLAID_LOGO_ASSET_FIELD_NUMBER = 3;
    private int bitField0_;
    private String clientBrandColor_ = "";
    private Common$RenderedAssetAppearance clientLogoAsset_;
    private int contentJustify_;
    private boolean hasGlowArc_;
    private Common$RenderedAssetAppearance plaidLogoAsset_;

    public static final class a extends GeneratedMessageLite.Builder<Common$CobrandedHeaderAsset, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$CobrandedHeaderAsset.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$CobrandedHeaderAsset common$CobrandedHeaderAsset = new Common$CobrandedHeaderAsset();
        DEFAULT_INSTANCE = common$CobrandedHeaderAsset;
        GeneratedMessageLite.registerDefaultInstance(Common$CobrandedHeaderAsset.class, common$CobrandedHeaderAsset);
    }

    private Common$CobrandedHeaderAsset() {
    }

    private void clearClientBrandColor() {
        this.clientBrandColor_ = getDefaultInstance().getClientBrandColor();
    }

    private void clearClientLogoAsset() {
        this.clientLogoAsset_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContentJustify() {
        this.contentJustify_ = 0;
    }

    private void clearHasGlowArc() {
        this.hasGlowArc_ = false;
    }

    private void clearPlaidLogoAsset() {
        this.plaidLogoAsset_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$CobrandedHeaderAsset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.clientLogoAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.clientLogoAsset_ = common$RenderedAssetAppearance;
        } else {
            this.clientLogoAsset_ = Common$RenderedAssetAppearance.newBuilder(this.clientLogoAsset_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePlaidLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.plaidLogoAsset_;
        if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.plaidLogoAsset_ = common$RenderedAssetAppearance;
        } else {
            this.plaidLogoAsset_ = Common$RenderedAssetAppearance.newBuilder(this.plaidLogoAsset_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CobrandedHeaderAsset parseDelimitedFrom(InputStream inputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteBuffer byteBuffer) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$CobrandedHeaderAsset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientBrandColor(String str) {
        str.getClass();
        this.clientBrandColor_ = str;
    }

    private void setClientBrandColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientBrandColor_ = byteString.toStringUtf8();
    }

    private void setClientLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.clientLogoAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setContentJustify(EnumC4384s enumC4384s) {
        this.contentJustify_ = enumC4384s.getNumber();
    }

    private void setContentJustifyValue(int i11) {
        this.contentJustify_ = i11;
    }

    private void setHasGlowArc(boolean z11) {
        this.hasGlowArc_ = z11;
    }

    private void setPlaidLogoAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.plaidLogoAsset_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CobrandedHeaderAsset();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\f\u0005\u0007", new Object[]{"bitField0_", "clientBrandColor_", "clientLogoAsset_", "plaidLogoAsset_", "contentJustify_", "hasGlowArc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CobrandedHeaderAsset> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$CobrandedHeaderAsset.class) {
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

    public String getClientBrandColor() {
        return this.clientBrandColor_;
    }

    public ByteString getClientBrandColorBytes() {
        return ByteString.copyFromUtf8(this.clientBrandColor_);
    }

    public Common$RenderedAssetAppearance getClientLogoAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.clientLogoAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public EnumC4384s getContentJustify() {
        EnumC4384s enumC4384sForNumber = EnumC4384s.forNumber(this.contentJustify_);
        return enumC4384sForNumber == null ? EnumC4384s.UNRECOGNIZED : enumC4384sForNumber;
    }

    public int getContentJustifyValue() {
        return this.contentJustify_;
    }

    public boolean getHasGlowArc() {
        return this.hasGlowArc_;
    }

    public Common$RenderedAssetAppearance getPlaidLogoAsset() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.plaidLogoAsset_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public boolean hasClientLogoAsset() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlaidLogoAsset() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        return DEFAULT_INSTANCE.createBuilder(common$CobrandedHeaderAsset);
    }

    public static Common$CobrandedHeaderAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteString byteString) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$CobrandedHeaderAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(byte[] bArr) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CobrandedHeaderAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(InputStream inputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CobrandedHeaderAsset parseFrom(CodedInputStream codedInputStream) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CobrandedHeaderAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CobrandedHeaderAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
