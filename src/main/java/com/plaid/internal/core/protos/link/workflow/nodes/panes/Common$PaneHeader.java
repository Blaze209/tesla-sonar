package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.EnumC4419g;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Common$PaneHeader extends GeneratedMessageLite<Common$PaneHeader, a> implements MessageLiteOrBuilder {
    public static final int COBRANDED_HEADER_ASSET_FIELD_NUMBER = 13;
    public static final int CONTENT_JUSTIFY_FIELD_NUMBER = 12;
    private static final Common$PaneHeader DEFAULT_INSTANCE;
    public static final int HEADER_STYLE_FIELD_NUMBER = 14;
    public static final int ICON_MISSING_COLOR_FIELD_NUMBER = 4;
    public static final int ILLUSTRATION_FIELD_NUMBER = 7;
    public static final int IS_SCROLLABLE_FIELD_NUMBER = 9;
    public static final int LOGO_FIELD_NUMBER = 3;
    public static final int PADDING_BOTTOM_FIELD_NUMBER = 11;
    public static final int PADDING_TOP_FIELD_NUMBER = 10;
    private static volatile Parser<Common$PaneHeader> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TRAILING_ICON_ACTION_FIELD_NUMBER = 6;
    public static final int TRAILING_ICON_FIELD_NUMBER = 5;
    private int bitField0_;
    private int contentJustify_;
    private int headerStyle_;
    private int iconCase_ = 0;
    private String iconMissingColor_ = "";
    private Object icon_;
    private boolean isScrollable_;
    private float paddingBottom_;
    private float paddingTop_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private Common$LocalAction trailingIconAction_;
    private int trailingIcon_;

    public static final class a extends GeneratedMessageLite.Builder<Common$PaneHeader, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$PaneHeader.DEFAULT_INSTANCE);
        }
    }

    public enum b implements Internal.EnumLite {
        HEADER_STYLE_UNKNOWN(0),
        HEADER_STYLE_CONSENT(1),
        HEADER_STYLE_THREADS(2),
        UNRECOGNIZED(-1);

        public static final int HEADER_STYLE_CONSENT_VALUE = 1;
        public static final int HEADER_STYLE_THREADS_VALUE = 2;
        public static final int HEADER_STYLE_UNKNOWN_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47165b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47167a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return b.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneHeader$b$b, reason: collision with other inner class name */
        public static final class C0742b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0742b f47168a = new C0742b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return b.forNumber(i11) != null;
            }
        }

        b(int i11) {
            this.f47167a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return HEADER_STYLE_UNKNOWN;
            }
            if (i11 == 1) {
                return HEADER_STYLE_CONSENT;
            }
            if (i11 != 2) {
                return null;
            }
            return HEADER_STYLE_THREADS;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f47165b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0742b.f47168a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47167a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    public enum c {
        LOGO(3),
        ILLUSTRATION(7),
        COBRANDED_HEADER_ASSET(13),
        ICON_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47170a;

        c(int i11) {
            this.f47170a = i11;
        }

        public static c forNumber(int i11) {
            if (i11 == 0) {
                return ICON_NOT_SET;
            }
            if (i11 == 3) {
                return LOGO;
            }
            if (i11 == 7) {
                return ILLUSTRATION;
            }
            if (i11 != 13) {
                return null;
            }
            return COBRANDED_HEADER_ASSET;
        }

        public int getNumber() {
            return this.f47170a;
        }

        @Deprecated
        public static c valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$PaneHeader common$PaneHeader = new Common$PaneHeader();
        DEFAULT_INSTANCE = common$PaneHeader;
        GeneratedMessageLite.registerDefaultInstance(Common$PaneHeader.class, common$PaneHeader);
    }

    private Common$PaneHeader() {
    }

    private void clearCobrandedHeaderAsset() {
        if (this.iconCase_ == 13) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearContentJustify() {
        this.contentJustify_ = 0;
    }

    private void clearHeaderStyle() {
        this.headerStyle_ = 0;
    }

    private void clearIcon() {
        this.iconCase_ = 0;
        this.icon_ = null;
    }

    private void clearIconMissingColor() {
        this.iconMissingColor_ = getDefaultInstance().getIconMissingColor();
    }

    private void clearIllustration() {
        if (this.iconCase_ == 7) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearIsScrollable() {
        this.isScrollable_ = false;
    }

    private void clearLogo() {
        if (this.iconCase_ == 3) {
            this.iconCase_ = 0;
            this.icon_ = null;
        }
    }

    private void clearPaddingBottom() {
        this.paddingBottom_ = BitmapDescriptorFactory.HUE_RED;
    }

    private void clearPaddingTop() {
        this.paddingTop_ = BitmapDescriptorFactory.HUE_RED;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTrailingIcon() {
        this.trailingIcon_ = 0;
    }

    private void clearTrailingIconAction() {
        this.trailingIconAction_ = null;
        this.bitField0_ &= -5;
    }

    public static Common$PaneHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCobrandedHeaderAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        common$CobrandedHeaderAsset.getClass();
        if (this.iconCase_ != 13 || this.icon_ == Common$CobrandedHeaderAsset.getDefaultInstance()) {
            this.icon_ = common$CobrandedHeaderAsset;
        } else {
            this.icon_ = Common$CobrandedHeaderAsset.newBuilder((Common$CobrandedHeaderAsset) this.icon_).mergeFrom(common$CobrandedHeaderAsset).buildPartial();
        }
        this.iconCase_ = 13;
    }

    private void mergeLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        if (this.iconCase_ != 3 || this.icon_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
            this.icon_ = common$RenderedAssetAppearance;
        } else {
            this.icon_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.icon_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
        }
        this.iconCase_ = 3;
    }

    private void mergeSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.subtitle_ = common$LocalizedString;
        } else {
            this.subtitle_ = Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom(common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.title_ = common$LocalizedString;
        } else {
            this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom(common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeTrailingIconAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.trailingIconAction_;
        if (common$LocalAction2 == null || common$LocalAction2 == Common$LocalAction.getDefaultInstance()) {
            this.trailingIconAction_ = common$LocalAction;
        } else {
            this.trailingIconAction_ = Common$LocalAction.newBuilder(this.trailingIconAction_).mergeFrom(common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PaneHeader parseDelimitedFrom(InputStream inputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneHeader parseFrom(ByteBuffer byteBuffer) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PaneHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCobrandedHeaderAsset(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
        common$CobrandedHeaderAsset.getClass();
        this.icon_ = common$CobrandedHeaderAsset;
        this.iconCase_ = 13;
    }

    private void setContentJustify(EnumC4384s enumC4384s) {
        this.contentJustify_ = enumC4384s.getNumber();
    }

    private void setContentJustifyValue(int i11) {
        this.contentJustify_ = i11;
    }

    private void setHeaderStyle(b bVar) {
        this.headerStyle_ = bVar.getNumber();
    }

    private void setHeaderStyleValue(int i11) {
        this.headerStyle_ = i11;
    }

    private void setIconMissingColor(String str) {
        str.getClass();
        this.iconMissingColor_ = str;
    }

    private void setIconMissingColorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iconMissingColor_ = byteString.toStringUtf8();
    }

    private void setIllustration(EnumC4419g enumC4419g) {
        this.icon_ = Integer.valueOf(enumC4419g.getNumber());
        this.iconCase_ = 7;
    }

    private void setIllustrationValue(int i11) {
        this.iconCase_ = 7;
        this.icon_ = Integer.valueOf(i11);
    }

    private void setIsScrollable(boolean z11) {
        this.isScrollable_ = z11;
    }

    private void setLogo(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.iconCase_ = 3;
    }

    private void setPaddingBottom(float f11) {
        this.paddingBottom_ = f11;
    }

    private void setPaddingTop(float f11) {
        this.paddingTop_ = f11;
    }

    private void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setTrailingIcon(EnumC4419g enumC4419g) {
        this.trailingIcon_ = enumC4419g.getNumber();
    }

    private void setTrailingIconAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.trailingIconAction_ = common$LocalAction;
        this.bitField0_ |= 4;
    }

    private void setTrailingIconValue(int i11) {
        this.trailingIcon_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PaneHeader();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004Ȉ\u0005\f\u0006ဉ\u0002\u0007?\u0000\t\u0007\n\u0001\u000b\u0001\f\f\r<\u0000\u000e\f", new Object[]{"icon_", "iconCase_", "bitField0_", "title_", "subtitle_", Common$RenderedAssetAppearance.class, "iconMissingColor_", "trailingIcon_", "trailingIconAction_", "isScrollable_", "paddingTop_", "paddingBottom_", "contentJustify_", Common$CobrandedHeaderAsset.class, "headerStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PaneHeader> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PaneHeader.class) {
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

    public Common$CobrandedHeaderAsset getCobrandedHeaderAsset() {
        return this.iconCase_ == 13 ? (Common$CobrandedHeaderAsset) this.icon_ : Common$CobrandedHeaderAsset.getDefaultInstance();
    }

    public EnumC4384s getContentJustify() {
        EnumC4384s enumC4384sForNumber = EnumC4384s.forNumber(this.contentJustify_);
        return enumC4384sForNumber == null ? EnumC4384s.UNRECOGNIZED : enumC4384sForNumber;
    }

    public int getContentJustifyValue() {
        return this.contentJustify_;
    }

    public b getHeaderStyle() {
        b bVarForNumber = b.forNumber(this.headerStyle_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getHeaderStyleValue() {
        return this.headerStyle_;
    }

    public c getIconCase() {
        return c.forNumber(this.iconCase_);
    }

    public String getIconMissingColor() {
        return this.iconMissingColor_;
    }

    public ByteString getIconMissingColorBytes() {
        return ByteString.copyFromUtf8(this.iconMissingColor_);
    }

    public EnumC4419g getIllustration() {
        if (this.iconCase_ != 7) {
            return EnumC4419g.SDK_ASSET_UNKNOWN;
        }
        EnumC4419g enumC4419gForNumber = EnumC4419g.forNumber(((Integer) this.icon_).intValue());
        return enumC4419gForNumber == null ? EnumC4419g.UNRECOGNIZED : enumC4419gForNumber;
    }

    public int getIllustrationValue() {
        if (this.iconCase_ == 7) {
            return ((Integer) this.icon_).intValue();
        }
        return 0;
    }

    public boolean getIsScrollable() {
        return this.isScrollable_;
    }

    public Common$RenderedAssetAppearance getLogo() {
        return this.iconCase_ == 3 ? (Common$RenderedAssetAppearance) this.icon_ : Common$RenderedAssetAppearance.getDefaultInstance();
    }

    public float getPaddingBottom() {
        return this.paddingBottom_;
    }

    public float getPaddingTop() {
        return this.paddingTop_;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC4419g getTrailingIcon() {
        EnumC4419g enumC4419gForNumber = EnumC4419g.forNumber(this.trailingIcon_);
        return enumC4419gForNumber == null ? EnumC4419g.UNRECOGNIZED : enumC4419gForNumber;
    }

    public Common$LocalAction getTrailingIconAction() {
        Common$LocalAction common$LocalAction = this.trailingIconAction_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public int getTrailingIconValue() {
        return this.trailingIcon_;
    }

    public boolean hasCobrandedHeaderAsset() {
        return this.iconCase_ == 13;
    }

    public boolean hasIllustration() {
        return this.iconCase_ == 7;
    }

    public boolean hasLogo() {
        return this.iconCase_ == 3;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrailingIconAction() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(Common$PaneHeader common$PaneHeader) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneHeader);
    }

    public static Common$PaneHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(ByteString byteString) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PaneHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(byte[] bArr) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PaneHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(InputStream inputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneHeader parseFrom(CodedInputStream codedInputStream) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PaneHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
