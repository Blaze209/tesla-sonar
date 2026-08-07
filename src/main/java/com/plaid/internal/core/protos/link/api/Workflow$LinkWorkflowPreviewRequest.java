package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization;
import com.plaid.internal.core.protos.link.workflow.primitives.LocaleOuterClass$Locale;
import com.plaid.internal.core.protos.link.workflow.primitives.PreviewOuterClass$Preview;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Workflow$LinkWorkflowPreviewRequest extends GeneratedMessageLite<Workflow$LinkWorkflowPreviewRequest, a> implements MessageLiteOrBuilder {
    public static final int COBRANDING_CONFIG_FIELD_NUMBER = 5;
    private static final Workflow$LinkWorkflowPreviewRequest DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 6;
    public static final int LINK_CUSTOMIZATION_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 4;
    private static volatile Parser<Workflow$LinkWorkflowPreviewRequest> PARSER = null;
    public static final int PRESET_REQUESTS_FIELD_NUMBER = 1;
    public static final int PRODUCTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig_;
    private PreviewOuterClass$Preview.Error error_;
    private LinkCustomizations$LinkCustomization linkCustomization_;
    private LocaleOuterClass$Locale locale_;
    private Internal.ProtobufList<PresetRequest> presetRequests_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> products_ = GeneratedMessageLite.emptyProtobufList();

    public static final class PresetRequest extends GeneratedMessageLite<PresetRequest, a> implements b {
        private static final PresetRequest DEFAULT_INSTANCE;
        private static volatile Parser<PresetRequest> PARSER = null;
        public static final int PRESET_FIELD_NUMBER = 1;
        public static final int SCENARIO_FIELD_NUMBER = 2;
        private int preset_;
        private int scenario_;

        public static final class a extends GeneratedMessageLite.Builder<PresetRequest, a> implements b {
            public a() {
                super(PresetRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            PresetRequest presetRequest = new PresetRequest();
            DEFAULT_INSTANCE = presetRequest;
            GeneratedMessageLite.registerDefaultInstance(PresetRequest.class, presetRequest);
        }

        private PresetRequest() {
        }

        private void clearPreset() {
            this.preset_ = 0;
        }

        private void clearScenario() {
            this.scenario_ = 0;
        }

        public static PresetRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PresetRequest parseDelimitedFrom(InputStream inputStream) {
            return (PresetRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PresetRequest parseFrom(ByteBuffer byteBuffer) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PresetRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPreset(PreviewOuterClass$Preview.b bVar) {
            this.preset_ = bVar.getNumber();
        }

        private void setPresetValue(int i11) {
            this.preset_ = i11;
        }

        private void setScenario(PreviewOuterClass$Preview.c cVar) {
            this.scenario_ = cVar.getNumber();
        }

        private void setScenarioValue(int i11) {
            this.scenario_ = i11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (g.f47056a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PresetRequest();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"preset_", "scenario_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PresetRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PresetRequest.class) {
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

        public PreviewOuterClass$Preview.b getPreset() {
            PreviewOuterClass$Preview.b bVarForNumber = PreviewOuterClass$Preview.b.forNumber(this.preset_);
            return bVarForNumber == null ? PreviewOuterClass$Preview.b.UNRECOGNIZED : bVarForNumber;
        }

        public int getPresetValue() {
            return this.preset_;
        }

        public PreviewOuterClass$Preview.c getScenario() {
            PreviewOuterClass$Preview.c cVarForNumber = PreviewOuterClass$Preview.c.forNumber(this.scenario_);
            return cVarForNumber == null ? PreviewOuterClass$Preview.c.UNRECOGNIZED : cVarForNumber;
        }

        public int getScenarioValue() {
            return this.scenario_;
        }

        public static a newBuilder(PresetRequest presetRequest) {
            return DEFAULT_INSTANCE.createBuilder(presetRequest);
        }

        public static PresetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PresetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PresetRequest parseFrom(ByteString byteString) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PresetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PresetRequest parseFrom(byte[] bArr) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PresetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PresetRequest parseFrom(InputStream inputStream) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PresetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PresetRequest parseFrom(CodedInputStream codedInputStream) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PresetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PresetRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowPreviewRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowPreviewRequest.DEFAULT_INSTANCE);
        }
    }

    public interface b extends MessageLiteOrBuilder {
    }

    static {
        Workflow$LinkWorkflowPreviewRequest workflow$LinkWorkflowPreviewRequest = new Workflow$LinkWorkflowPreviewRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowPreviewRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowPreviewRequest.class, workflow$LinkWorkflowPreviewRequest);
    }

    private Workflow$LinkWorkflowPreviewRequest() {
    }

    private void addAllPresetRequests(Iterable<? extends PresetRequest> iterable) {
        ensurePresetRequestsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.presetRequests_);
    }

    private void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.products_);
    }

    private void addPresetRequests(PresetRequest presetRequest) {
        presetRequest.getClass();
        ensurePresetRequestsIsMutable();
        this.presetRequests_.add(presetRequest);
    }

    private void addProducts(String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    private void addProductsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureProductsIsMutable();
        this.products_.add(byteString.toStringUtf8());
    }

    private void clearCobrandingConfig() {
        this.cobrandingConfig_ = null;
        this.bitField0_ &= -5;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -9;
    }

    private void clearLinkCustomization() {
        this.linkCustomization_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPresetRequests() {
        this.presetRequests_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProducts() {
        this.products_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePresetRequestsIsMutable() {
        Internal.ProtobufList<PresetRequest> protobufList = this.presetRequests_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.presetRequests_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Workflow$LinkWorkflowPreviewRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCobrandingConfig(PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig2 = this.cobrandingConfig_;
        if (cobrandingConfig2 == null || cobrandingConfig2 == PreviewOuterClass$Preview.CobrandingConfig.getDefaultInstance()) {
            this.cobrandingConfig_ = cobrandingConfig;
        } else {
            this.cobrandingConfig_ = PreviewOuterClass$Preview.CobrandingConfig.newBuilder(this.cobrandingConfig_).mergeFrom(cobrandingConfig).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeError(PreviewOuterClass$Preview.Error error) {
        error.getClass();
        PreviewOuterClass$Preview.Error error2 = this.error_;
        if (error2 == null || error2 == PreviewOuterClass$Preview.Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = PreviewOuterClass$Preview.Error.newBuilder(this.error_).mergeFrom(error).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization2 = this.linkCustomization_;
        if (linkCustomizations$LinkCustomization2 == null || linkCustomizations$LinkCustomization2 == LinkCustomizations$LinkCustomization.getDefaultInstance()) {
            this.linkCustomization_ = linkCustomizations$LinkCustomization;
        } else {
            this.linkCustomization_ = LinkCustomizations$LinkCustomization.newBuilder(this.linkCustomization_).mergeFrom(linkCustomizations$LinkCustomization).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom(localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowPreviewRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowPreviewRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePresetRequests(int i11) {
        ensurePresetRequestsIsMutable();
        this.presetRequests_.remove(i11);
    }

    private void setCobrandingConfig(PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig) {
        cobrandingConfig.getClass();
        this.cobrandingConfig_ = cobrandingConfig;
        this.bitField0_ |= 4;
    }

    private void setError(PreviewOuterClass$Preview.Error error) {
        error.getClass();
        this.error_ = error;
        this.bitField0_ |= 8;
    }

    private void setLinkCustomization(LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        linkCustomizations$LinkCustomization.getClass();
        this.linkCustomization_ = linkCustomizations$LinkCustomization;
        this.bitField0_ |= 1;
    }

    private void setLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 2;
    }

    private void setPresetRequests(int i11, PresetRequest presetRequest) {
        presetRequest.getClass();
        ensurePresetRequestsIsMutable();
        this.presetRequests_.set(i11, presetRequest);
    }

    private void setProducts(int i11, String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.set(i11, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f47056a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowPreviewRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0003Ț\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "presetRequests_", PresetRequest.class, "linkCustomization_", "products_", "locale_", "cobrandingConfig_", "error_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowPreviewRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowPreviewRequest.class) {
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

    public PreviewOuterClass$Preview.CobrandingConfig getCobrandingConfig() {
        PreviewOuterClass$Preview.CobrandingConfig cobrandingConfig = this.cobrandingConfig_;
        return cobrandingConfig == null ? PreviewOuterClass$Preview.CobrandingConfig.getDefaultInstance() : cobrandingConfig;
    }

    public PreviewOuterClass$Preview.Error getError() {
        PreviewOuterClass$Preview.Error error = this.error_;
        return error == null ? PreviewOuterClass$Preview.Error.getDefaultInstance() : error;
    }

    public LinkCustomizations$LinkCustomization getLinkCustomization() {
        LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = this.linkCustomization_;
        return linkCustomizations$LinkCustomization == null ? LinkCustomizations$LinkCustomization.getDefaultInstance() : linkCustomizations$LinkCustomization;
    }

    public LocaleOuterClass$Locale getLocale() {
        LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public PresetRequest getPresetRequests(int i11) {
        return this.presetRequests_.get(i11);
    }

    public int getPresetRequestsCount() {
        return this.presetRequests_.size();
    }

    public List<PresetRequest> getPresetRequestsList() {
        return this.presetRequests_;
    }

    public b getPresetRequestsOrBuilder(int i11) {
        return this.presetRequests_.get(i11);
    }

    public List<? extends b> getPresetRequestsOrBuilderList() {
        return this.presetRequests_;
    }

    public String getProducts(int i11) {
        return this.products_.get(i11);
    }

    public ByteString getProductsBytes(int i11) {
        return ByteString.copyFromUtf8(this.products_.get(i11));
    }

    public int getProductsCount() {
        return this.products_.size();
    }

    public List<String> getProductsList() {
        return this.products_;
    }

    public boolean hasCobrandingConfig() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasError() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLinkCustomization() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(Workflow$LinkWorkflowPreviewRequest workflow$LinkWorkflowPreviewRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowPreviewRequest);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addPresetRequests(int i11, PresetRequest presetRequest) {
        presetRequest.getClass();
        ensurePresetRequestsIsMutable();
        this.presetRequests_.add(i11, presetRequest);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowPreviewRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowPreviewRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
