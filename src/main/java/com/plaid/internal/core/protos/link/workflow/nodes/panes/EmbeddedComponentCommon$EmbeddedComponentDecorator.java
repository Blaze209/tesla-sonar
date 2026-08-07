package com.plaid.internal.core.protos.link.workflow.nodes.panes;

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
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class EmbeddedComponentCommon$EmbeddedComponentDecorator extends GeneratedMessageLite<EmbeddedComponentCommon$EmbeddedComponentDecorator, a> implements MessageLiteOrBuilder {
    public static final int ASSET_OVERLAP_WITH_PLAID_LOGO_FIELD_NUMBER = 4;
    private static final EmbeddedComponentCommon$EmbeddedComponentDecorator DEFAULT_INSTANCE;
    public static final int LABELED_ASSET_FIELD_NUMBER = 2;
    public static final int OVERLAPPING_ASSETS_FIELD_NUMBER = 1;
    private static volatile Parser<EmbeddedComponentCommon$EmbeddedComponentDecorator> PARSER = null;
    public static final int PLAID_LOGO_FIELD_NUMBER = 3;
    private int decoratorCase_ = 0;
    private Object decorator_;

    public static final class AssetOverlapWithPlaidLogo extends GeneratedMessageLite<AssetOverlapWithPlaidLogo, a> implements MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 1;
        private static final AssetOverlapWithPlaidLogo DEFAULT_INSTANCE;
        private static volatile Parser<AssetOverlapWithPlaidLogo> PARSER;
        private Common$RenderedAssetAppearance asset_;
        private int bitField0_;

        public static final class a extends GeneratedMessageLite.Builder<AssetOverlapWithPlaidLogo, a> implements MessageLiteOrBuilder {
            public a() {
                super(AssetOverlapWithPlaidLogo.DEFAULT_INSTANCE);
            }
        }

        static {
            AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo = new AssetOverlapWithPlaidLogo();
            DEFAULT_INSTANCE = assetOverlapWithPlaidLogo;
            GeneratedMessageLite.registerDefaultInstance(AssetOverlapWithPlaidLogo.class, assetOverlapWithPlaidLogo);
        }

        private AssetOverlapWithPlaidLogo() {
        }

        private void clearAsset() {
            this.asset_ = null;
            this.bitField0_ &= -2;
        }

        public static AssetOverlapWithPlaidLogo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.asset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.asset_ = common$RenderedAssetAppearance;
            } else {
                this.asset_ = Common$RenderedAssetAppearance.newBuilder(this.asset_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AssetOverlapWithPlaidLogo parseDelimitedFrom(InputStream inputStream) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(ByteBuffer byteBuffer) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AssetOverlapWithPlaidLogo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.asset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e0.f47456a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AssetOverlapWithPlaidLogo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "asset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AssetOverlapWithPlaidLogo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (AssetOverlapWithPlaidLogo.class) {
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

        public Common$RenderedAssetAppearance getAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.asset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public boolean hasAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
            return DEFAULT_INSTANCE.createBuilder(assetOverlapWithPlaidLogo);
        }

        public static AssetOverlapWithPlaidLogo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(ByteString byteString) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(byte[] bArr) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(InputStream inputStream) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(CodedInputStream codedInputStream) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AssetOverlapWithPlaidLogo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AssetOverlapWithPlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LabeledAsset extends GeneratedMessageLite<LabeledAsset, a> implements MessageLiteOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 2;
        private static final LabeledAsset DEFAULT_INSTANCE;
        public static final int LABEL_FIELD_NUMBER = 1;
        private static volatile Parser<LabeledAsset> PARSER;
        private Common$RenderedAssetAppearance asset_;
        private int bitField0_;
        private String label_ = "";

        public static final class a extends GeneratedMessageLite.Builder<LabeledAsset, a> implements MessageLiteOrBuilder {
            public a() {
                super(LabeledAsset.DEFAULT_INSTANCE);
            }
        }

        static {
            LabeledAsset labeledAsset = new LabeledAsset();
            DEFAULT_INSTANCE = labeledAsset;
            GeneratedMessageLite.registerDefaultInstance(LabeledAsset.class, labeledAsset);
        }

        private LabeledAsset() {
        }

        private void clearAsset() {
            this.asset_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLabel() {
            this.label_ = getDefaultInstance().getLabel();
        }

        public static LabeledAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.asset_;
            if (common$RenderedAssetAppearance2 == null || common$RenderedAssetAppearance2 == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.asset_ = common$RenderedAssetAppearance;
            } else {
                this.asset_ = Common$RenderedAssetAppearance.newBuilder(this.asset_).mergeFrom(common$RenderedAssetAppearance).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static LabeledAsset parseDelimitedFrom(InputStream inputStream) {
            return (LabeledAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LabeledAsset parseFrom(ByteBuffer byteBuffer) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<LabeledAsset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAsset(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.asset_ = common$RenderedAssetAppearance;
            this.bitField0_ |= 1;
        }

        private void setLabel(String str) {
            str.getClass();
            this.label_ = str;
        }

        private void setLabelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.label_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e0.f47456a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LabeledAsset();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "label_", "asset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<LabeledAsset> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (LabeledAsset.class) {
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

        public Common$RenderedAssetAppearance getAsset() {
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.asset_;
            return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
        }

        public String getLabel() {
            return this.label_;
        }

        public ByteString getLabelBytes() {
            return ByteString.copyFromUtf8(this.label_);
        }

        public boolean hasAsset() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(LabeledAsset labeledAsset) {
            return DEFAULT_INSTANCE.createBuilder(labeledAsset);
        }

        public static LabeledAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LabeledAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LabeledAsset parseFrom(ByteString byteString) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LabeledAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LabeledAsset parseFrom(byte[] bArr) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LabeledAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LabeledAsset parseFrom(InputStream inputStream) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LabeledAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LabeledAsset parseFrom(CodedInputStream codedInputStream) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LabeledAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LabeledAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OverlappingAssets extends GeneratedMessageLite<OverlappingAssets, a> implements MessageLiteOrBuilder {
        public static final int ASSETS_FIELD_NUMBER = 1;
        private static final OverlappingAssets DEFAULT_INSTANCE;
        private static volatile Parser<OverlappingAssets> PARSER;
        private Internal.ProtobufList<Common$RenderedAssetAppearance> assets_ = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.Builder<OverlappingAssets, a> implements MessageLiteOrBuilder {
            public a() {
                super(OverlappingAssets.DEFAULT_INSTANCE);
            }
        }

        static {
            OverlappingAssets overlappingAssets = new OverlappingAssets();
            DEFAULT_INSTANCE = overlappingAssets;
            GeneratedMessageLite.registerDefaultInstance(OverlappingAssets.class, overlappingAssets);
        }

        private OverlappingAssets() {
        }

        private void addAllAssets(Iterable<? extends Common$RenderedAssetAppearance> iterable) {
            ensureAssetsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assets_);
        }

        private void addAssets(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(common$RenderedAssetAppearance);
        }

        private void clearAssets() {
            this.assets_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAssetsIsMutable() {
            Internal.ProtobufList<Common$RenderedAssetAppearance> protobufList = this.assets_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.assets_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static OverlappingAssets getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OverlappingAssets parseDelimitedFrom(InputStream inputStream) {
            return (OverlappingAssets) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OverlappingAssets parseFrom(ByteBuffer byteBuffer) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OverlappingAssets> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAssets(int i11) {
            ensureAssetsIsMutable();
            this.assets_.remove(i11);
        }

        private void setAssets(int i11, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureAssetsIsMutable();
            this.assets_.set(i11, common$RenderedAssetAppearance);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e0.f47456a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OverlappingAssets();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"assets_", Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OverlappingAssets> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OverlappingAssets.class) {
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

        public Common$RenderedAssetAppearance getAssets(int i11) {
            return this.assets_.get(i11);
        }

        public int getAssetsCount() {
            return this.assets_.size();
        }

        public List<Common$RenderedAssetAppearance> getAssetsList() {
            return this.assets_;
        }

        public K getAssetsOrBuilder(int i11) {
            return this.assets_.get(i11);
        }

        public List<? extends K> getAssetsOrBuilderList() {
            return this.assets_;
        }

        public static a newBuilder(OverlappingAssets overlappingAssets) {
            return DEFAULT_INSTANCE.createBuilder(overlappingAssets);
        }

        public static OverlappingAssets parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OverlappingAssets parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OverlappingAssets parseFrom(ByteString byteString) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addAssets(int i11, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureAssetsIsMutable();
            this.assets_.add(i11, common$RenderedAssetAppearance);
        }

        public static OverlappingAssets parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OverlappingAssets parseFrom(byte[] bArr) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OverlappingAssets parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OverlappingAssets parseFrom(InputStream inputStream) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OverlappingAssets parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OverlappingAssets parseFrom(CodedInputStream codedInputStream) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OverlappingAssets parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingAssets) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PlaidLogo extends GeneratedMessageLite<PlaidLogo, a> implements MessageLiteOrBuilder {
        private static final PlaidLogo DEFAULT_INSTANCE;
        private static volatile Parser<PlaidLogo> PARSER;

        public static final class a extends GeneratedMessageLite.Builder<PlaidLogo, a> implements MessageLiteOrBuilder {
            public a() {
                super(PlaidLogo.DEFAULT_INSTANCE);
            }
        }

        static {
            PlaidLogo plaidLogo = new PlaidLogo();
            DEFAULT_INSTANCE = plaidLogo;
            GeneratedMessageLite.registerDefaultInstance(PlaidLogo.class, plaidLogo);
        }

        private PlaidLogo() {
        }

        public static PlaidLogo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PlaidLogo parseDelimitedFrom(InputStream inputStream) {
            return (PlaidLogo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaidLogo parseFrom(ByteBuffer byteBuffer) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PlaidLogo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e0.f47456a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PlaidLogo();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PlaidLogo> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PlaidLogo.class) {
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

        public static a newBuilder(PlaidLogo plaidLogo) {
            return DEFAULT_INSTANCE.createBuilder(plaidLogo);
        }

        public static PlaidLogo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlaidLogo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PlaidLogo parseFrom(ByteString byteString) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PlaidLogo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PlaidLogo parseFrom(byte[] bArr) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlaidLogo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PlaidLogo parseFrom(InputStream inputStream) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlaidLogo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PlaidLogo parseFrom(CodedInputStream codedInputStream) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PlaidLogo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PlaidLogo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<EmbeddedComponentCommon$EmbeddedComponentDecorator, a> implements MessageLiteOrBuilder {
        public a() {
            super(EmbeddedComponentCommon$EmbeddedComponentDecorator.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        OVERLAPPING_ASSETS(1),
        LABELED_ASSET(2),
        PLAID_LOGO(3),
        ASSET_OVERLAP_WITH_PLAID_LOGO(4),
        DECORATOR_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47263a;

        b(int i11) {
            this.f47263a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return DECORATOR_NOT_SET;
            }
            if (i11 == 1) {
                return OVERLAPPING_ASSETS;
            }
            if (i11 == 2) {
                return LABELED_ASSET;
            }
            if (i11 == 3) {
                return PLAID_LOGO;
            }
            if (i11 != 4) {
                return null;
            }
            return ASSET_OVERLAP_WITH_PLAID_LOGO;
        }

        public int getNumber() {
            return this.f47263a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        EmbeddedComponentCommon$EmbeddedComponentDecorator embeddedComponentCommon$EmbeddedComponentDecorator = new EmbeddedComponentCommon$EmbeddedComponentDecorator();
        DEFAULT_INSTANCE = embeddedComponentCommon$EmbeddedComponentDecorator;
        GeneratedMessageLite.registerDefaultInstance(EmbeddedComponentCommon$EmbeddedComponentDecorator.class, embeddedComponentCommon$EmbeddedComponentDecorator);
    }

    private EmbeddedComponentCommon$EmbeddedComponentDecorator() {
    }

    private void clearAssetOverlapWithPlaidLogo() {
        if (this.decoratorCase_ == 4) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearDecorator() {
        this.decoratorCase_ = 0;
        this.decorator_ = null;
    }

    private void clearLabeledAsset() {
        if (this.decoratorCase_ == 2) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearOverlappingAssets() {
        if (this.decoratorCase_ == 1) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    private void clearPlaidLogo() {
        if (this.decoratorCase_ == 3) {
            this.decoratorCase_ = 0;
            this.decorator_ = null;
        }
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAssetOverlapWithPlaidLogo(AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
        assetOverlapWithPlaidLogo.getClass();
        if (this.decoratorCase_ != 4 || this.decorator_ == AssetOverlapWithPlaidLogo.getDefaultInstance()) {
            this.decorator_ = assetOverlapWithPlaidLogo;
        } else {
            this.decorator_ = AssetOverlapWithPlaidLogo.newBuilder((AssetOverlapWithPlaidLogo) this.decorator_).mergeFrom(assetOverlapWithPlaidLogo).buildPartial();
        }
        this.decoratorCase_ = 4;
    }

    private void mergeLabeledAsset(LabeledAsset labeledAsset) {
        labeledAsset.getClass();
        if (this.decoratorCase_ != 2 || this.decorator_ == LabeledAsset.getDefaultInstance()) {
            this.decorator_ = labeledAsset;
        } else {
            this.decorator_ = LabeledAsset.newBuilder((LabeledAsset) this.decorator_).mergeFrom(labeledAsset).buildPartial();
        }
        this.decoratorCase_ = 2;
    }

    private void mergeOverlappingAssets(OverlappingAssets overlappingAssets) {
        overlappingAssets.getClass();
        if (this.decoratorCase_ != 1 || this.decorator_ == OverlappingAssets.getDefaultInstance()) {
            this.decorator_ = overlappingAssets;
        } else {
            this.decorator_ = OverlappingAssets.newBuilder((OverlappingAssets) this.decorator_).mergeFrom(overlappingAssets).buildPartial();
        }
        this.decoratorCase_ = 1;
    }

    private void mergePlaidLogo(PlaidLogo plaidLogo) {
        plaidLogo.getClass();
        if (this.decoratorCase_ != 3 || this.decorator_ == PlaidLogo.getDefaultInstance()) {
            this.decorator_ = plaidLogo;
        } else {
            this.decorator_ = PlaidLogo.newBuilder((PlaidLogo) this.decorator_).mergeFrom(plaidLogo).buildPartial();
        }
        this.decoratorCase_ = 3;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseDelimitedFrom(InputStream inputStream) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(ByteBuffer byteBuffer) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmbeddedComponentCommon$EmbeddedComponentDecorator> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAssetOverlapWithPlaidLogo(AssetOverlapWithPlaidLogo assetOverlapWithPlaidLogo) {
        assetOverlapWithPlaidLogo.getClass();
        this.decorator_ = assetOverlapWithPlaidLogo;
        this.decoratorCase_ = 4;
    }

    private void setLabeledAsset(LabeledAsset labeledAsset) {
        labeledAsset.getClass();
        this.decorator_ = labeledAsset;
        this.decoratorCase_ = 2;
    }

    private void setOverlappingAssets(OverlappingAssets overlappingAssets) {
        overlappingAssets.getClass();
        this.decorator_ = overlappingAssets;
        this.decoratorCase_ = 1;
    }

    private void setPlaidLogo(PlaidLogo plaidLogo) {
        plaidLogo.getClass();
        this.decorator_ = plaidLogo;
        this.decoratorCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (e0.f47456a[methodToInvoke.ordinal()]) {
            case 1:
                return new EmbeddedComponentCommon$EmbeddedComponentDecorator();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"decorator_", "decoratorCase_", OverlappingAssets.class, LabeledAsset.class, PlaidLogo.class, AssetOverlapWithPlaidLogo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmbeddedComponentCommon$EmbeddedComponentDecorator> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (EmbeddedComponentCommon$EmbeddedComponentDecorator.class) {
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

    public AssetOverlapWithPlaidLogo getAssetOverlapWithPlaidLogo() {
        return this.decoratorCase_ == 4 ? (AssetOverlapWithPlaidLogo) this.decorator_ : AssetOverlapWithPlaidLogo.getDefaultInstance();
    }

    public b getDecoratorCase() {
        return b.forNumber(this.decoratorCase_);
    }

    public LabeledAsset getLabeledAsset() {
        return this.decoratorCase_ == 2 ? (LabeledAsset) this.decorator_ : LabeledAsset.getDefaultInstance();
    }

    public OverlappingAssets getOverlappingAssets() {
        return this.decoratorCase_ == 1 ? (OverlappingAssets) this.decorator_ : OverlappingAssets.getDefaultInstance();
    }

    public PlaidLogo getPlaidLogo() {
        return this.decoratorCase_ == 3 ? (PlaidLogo) this.decorator_ : PlaidLogo.getDefaultInstance();
    }

    public boolean hasAssetOverlapWithPlaidLogo() {
        return this.decoratorCase_ == 4;
    }

    public boolean hasLabeledAsset() {
        return this.decoratorCase_ == 2;
    }

    public boolean hasOverlappingAssets() {
        return this.decoratorCase_ == 1;
    }

    public boolean hasPlaidLogo() {
        return this.decoratorCase_ == 3;
    }

    public static a newBuilder(EmbeddedComponentCommon$EmbeddedComponentDecorator embeddedComponentCommon$EmbeddedComponentDecorator) {
        return DEFAULT_INSTANCE.createBuilder(embeddedComponentCommon$EmbeddedComponentDecorator);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(ByteString byteString) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(byte[] bArr) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(InputStream inputStream) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(CodedInputStream codedInputStream) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmbeddedComponentCommon$EmbeddedComponentDecorator parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (EmbeddedComponentCommon$EmbeddedComponentDecorator) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
