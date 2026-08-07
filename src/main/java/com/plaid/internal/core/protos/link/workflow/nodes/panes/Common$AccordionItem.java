package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Common$AccordionItem extends GeneratedMessageLite<Common$AccordionItem, a> implements InterfaceC4377k {
    public static final int ATTRIBUTED_DETAIL_FIELD_NUMBER = 4;
    public static final int ATTRIBUTED_LABEL_FIELD_NUMBER = 5;
    public static final int BUTTON_FIELD_NUMBER = 8;
    private static final Common$AccordionItem DEFAULT_INSTANCE;
    public static final int DETAIL_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 9;
    public static final int IS_EXPANDED_FIELD_NUMBER = 6;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile Parser<Common$AccordionItem> PARSER = null;
    public static final int PROMPTS_FIELD_NUMBER = 7;
    private Common$AttributedLocalizedString attributedDetail_;
    private Common$AttributedLocalizedString attributedLabel_;
    private int bitField0_;
    private Common$ButtonContent button_;
    private Common$LocalizedString detail_;
    private Common$RenderedAssetAppearance icon_;
    private int id_;
    private boolean isExpanded_;
    private Common$LocalizedString label_;
    private Internal.ProtobufList<Common$Prompt> prompts_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Common$AccordionItem, a> implements InterfaceC4377k {
        public a() {
            super(Common$AccordionItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AccordionItem common$AccordionItem = new Common$AccordionItem();
        DEFAULT_INSTANCE = common$AccordionItem;
        GeneratedMessageLite.registerDefaultInstance(Common$AccordionItem.class, common$AccordionItem);
    }

    private Common$AccordionItem() {
    }

    private void addAllPrompts(Iterable<? extends Common$Prompt> iterable) {
        ensurePromptsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.prompts_);
    }

    private void addPrompts(int i11, Common$Prompt common$Prompt) {
        common$Prompt.getClass();
        ensurePromptsIsMutable();
        this.prompts_.add(i11, common$Prompt);
    }

    private void clearAttributedDetail() {
        this.attributedDetail_ = null;
        this.bitField0_ &= -17;
    }

    private void clearAttributedLabel() {
        this.attributedLabel_ = null;
        this.bitField0_ &= -5;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -33;
    }

    private void clearDetail() {
        this.detail_ = null;
        this.bitField0_ &= -9;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIsExpanded() {
        this.isExpanded_ = false;
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPrompts() {
        this.prompts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePromptsIsMutable() {
        Internal.ProtobufList<Common$Prompt> protobufList = this.prompts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.prompts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$AccordionItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAttributedDetail(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedDetail_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.attributedDetail_).mergeFrom(common$AttributedLocalizedString).buildPartial();
        }
        this.attributedDetail_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    private void mergeAttributedLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedLabel_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.attributedLabel_).mergeFrom(common$AttributedLocalizedString).buildPartial();
        }
        this.attributedLabel_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = Common$ButtonContent.newBuilder(this.button_).mergeFrom(common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void mergeDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.detail_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.detail_).mergeFrom(common$LocalizedString).buildPartial();
        }
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.label_).mergeFrom(common$LocalizedString).buildPartial();
        }
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AccordionItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$AccordionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AccordionItem parseFrom(ByteString byteString) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$AccordionItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePrompts(int i11) {
        ensurePromptsIsMutable();
        this.prompts_.remove(i11);
    }

    private void setAttributedDetail(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.attributedDetail_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    private void setAttributedLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.attributedLabel_ = common$AttributedLocalizedString;
        this.bitField0_ |= 4;
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 32;
    }

    private void setDetail(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.detail_ = common$LocalizedString;
        this.bitField0_ |= 8;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setId(int i11) {
        this.id_ = i11;
    }

    private void setIsExpanded(boolean z11) {
        this.isExpanded_ = z11;
    }

    private void setLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setPrompts(int i11, Common$Prompt common$Prompt) {
        common$Prompt.getClass();
        ensurePromptsIsMutable();
        this.prompts_.set(i11, common$Prompt);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AccordionItem();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0002\u0006\u0007\u0007\u001b\bဉ\u0005\t\u0004", new Object[]{"bitField0_", "icon_", "label_", "detail_", "attributedDetail_", "attributedLabel_", "isExpanded_", "prompts_", Common$Prompt.class, "button_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AccordionItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$AccordionItem.class) {
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

    public Common$AttributedLocalizedString getAttributedDetail() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedDetail_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$AttributedLocalizedString getAttributedLabel() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedLabel_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$ButtonContent getButton() {
        Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$LocalizedString getDetail() {
        Common$LocalizedString common$LocalizedString = this.detail_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public int getId() {
        return this.id_;
    }

    public boolean getIsExpanded() {
        return this.isExpanded_;
    }

    public Common$LocalizedString getLabel() {
        Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$Prompt getPrompts(int i11) {
        return this.prompts_.get(i11);
    }

    public int getPromptsCount() {
        return this.prompts_.size();
    }

    public List<Common$Prompt> getPromptsList() {
        return this.prompts_;
    }

    public J getPromptsOrBuilder(int i11) {
        return this.prompts_.get(i11);
    }

    public List<? extends J> getPromptsOrBuilderList() {
        return this.prompts_;
    }

    public boolean hasAttributedDetail() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAttributedLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDetail() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    private void addPrompts(Common$Prompt common$Prompt) {
        common$Prompt.getClass();
        ensurePromptsIsMutable();
        this.prompts_.add(common$Prompt);
    }

    public static a newBuilder(Common$AccordionItem common$AccordionItem) {
        return DEFAULT_INSTANCE.createBuilder(common$AccordionItem);
    }

    public static Common$AccordionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AccordionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AccordionItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AccordionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$AccordionItem parseFrom(InputStream inputStream) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AccordionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AccordionItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$AccordionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AccordionItem parseFrom(byte[] bArr) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AccordionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AccordionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
