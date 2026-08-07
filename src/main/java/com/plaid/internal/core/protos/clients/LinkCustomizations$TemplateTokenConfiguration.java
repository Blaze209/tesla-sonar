package com.plaid.internal.core.protos.clients;

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
public final class LinkCustomizations$TemplateTokenConfiguration extends GeneratedMessageLite<LinkCustomizations$TemplateTokenConfiguration, a> implements MessageLiteOrBuilder {
    public static final int ACCOUNT_SUBTYPES_FIELD_NUMBER = 2;
    private static final LinkCustomizations$TemplateTokenConfiguration DEFAULT_INSTANCE;
    private static volatile Parser<LinkCustomizations$TemplateTokenConfiguration> PARSER = null;
    public static final int PRODUCTS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> products_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> accountSubtypes_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<LinkCustomizations$TemplateTokenConfiguration, a> implements MessageLiteOrBuilder {
        public a() {
            super(LinkCustomizations$TemplateTokenConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration = new LinkCustomizations$TemplateTokenConfiguration();
        DEFAULT_INSTANCE = linkCustomizations$TemplateTokenConfiguration;
        GeneratedMessageLite.registerDefaultInstance(LinkCustomizations$TemplateTokenConfiguration.class, linkCustomizations$TemplateTokenConfiguration);
    }

    private LinkCustomizations$TemplateTokenConfiguration() {
    }

    private void addAccountSubtypes(String str) {
        str.getClass();
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.add(str);
    }

    private void addAccountSubtypesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.add(byteString.toStringUtf8());
    }

    private void addAllAccountSubtypes(Iterable<String> iterable) {
        ensureAccountSubtypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.accountSubtypes_);
    }

    private void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.products_);
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

    private void clearAccountSubtypes() {
        this.accountSubtypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearProducts() {
        this.products_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAccountSubtypesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.accountSubtypes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.accountSubtypes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.products_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.products_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static LinkCustomizations$TemplateTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkCustomizations$TemplateTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAccountSubtypes(int i11, String str) {
        str.getClass();
        ensureAccountSubtypesIsMutable();
        this.accountSubtypes_.set(i11, str);
    }

    private void setProducts(int i11, String str) {
        str.getClass();
        ensureProductsIsMutable();
        this.products_.set(i11, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (com.plaid.internal.core.protos.clients.a.f46957a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkCustomizations$TemplateTokenConfiguration();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"products_", "accountSubtypes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkCustomizations$TemplateTokenConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LinkCustomizations$TemplateTokenConfiguration.class) {
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

    public String getAccountSubtypes(int i11) {
        return this.accountSubtypes_.get(i11);
    }

    public ByteString getAccountSubtypesBytes(int i11) {
        return ByteString.copyFromUtf8(this.accountSubtypes_.get(i11));
    }

    public int getAccountSubtypesCount() {
        return this.accountSubtypes_.size();
    }

    public List<String> getAccountSubtypesList() {
        return this.accountSubtypes_;
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

    public static a newBuilder(LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$TemplateTokenConfiguration);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(ByteString byteString) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(byte[] bArr) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(InputStream inputStream) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkCustomizations$TemplateTokenConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$TemplateTokenConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
