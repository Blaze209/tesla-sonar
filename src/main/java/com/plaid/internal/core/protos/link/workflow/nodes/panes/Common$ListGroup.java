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
public final class Common$ListGroup extends GeneratedMessageLite<Common$ListGroup, a> implements MessageLiteOrBuilder {
    private static final Common$ListGroup DEFAULT_INSTANCE;
    public static final int HEADER_COMPONENTS_FIELD_NUMBER = 1;
    public static final int LIST_ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$ListGroup> PARSER;
    private Internal.ProtobufList<Common$FlexibleComponent> headerComponents_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Common$FlexibleComponent> listItems_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Common$ListGroup, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$ListGroup.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$ListGroup common$ListGroup = new Common$ListGroup();
        DEFAULT_INSTANCE = common$ListGroup;
        GeneratedMessageLite.registerDefaultInstance(Common$ListGroup.class, common$ListGroup);
    }

    private Common$ListGroup() {
    }

    private void addAllHeaderComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureHeaderComponentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.headerComponents_);
    }

    private void addAllListItems(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureListItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.listItems_);
    }

    private void addHeaderComponents(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.add(i11, common$FlexibleComponent);
    }

    private void addListItems(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureListItemsIsMutable();
        this.listItems_.add(i11, common$FlexibleComponent);
    }

    private void clearHeaderComponents() {
        this.headerComponents_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearListItems() {
        this.listItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureHeaderComponentsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.headerComponents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.headerComponents_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureListItemsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.listItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.listItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$ListGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ListGroup parseDelimitedFrom(InputStream inputStream) {
        return (Common$ListGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListGroup parseFrom(ByteString byteString) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$ListGroup> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeHeaderComponents(int i11) {
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.remove(i11);
    }

    private void removeListItems(int i11) {
        ensureListItemsIsMutable();
        this.listItems_.remove(i11);
    }

    private void setHeaderComponents(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.set(i11, common$FlexibleComponent);
    }

    private void setListItems(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureListItemsIsMutable();
        this.listItems_.set(i11, common$FlexibleComponent);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ListGroup();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"headerComponents_", Common$FlexibleComponent.class, "listItems_", Common$FlexibleComponent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ListGroup> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ListGroup.class) {
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

    public Common$FlexibleComponent getHeaderComponents(int i11) {
        return this.headerComponents_.get(i11);
    }

    public int getHeaderComponentsCount() {
        return this.headerComponents_.size();
    }

    public List<Common$FlexibleComponent> getHeaderComponentsList() {
        return this.headerComponents_;
    }

    public InterfaceC4388w getHeaderComponentsOrBuilder(int i11) {
        return this.headerComponents_.get(i11);
    }

    public List<? extends InterfaceC4388w> getHeaderComponentsOrBuilderList() {
        return this.headerComponents_;
    }

    public Common$FlexibleComponent getListItems(int i11) {
        return this.listItems_.get(i11);
    }

    public int getListItemsCount() {
        return this.listItems_.size();
    }

    public List<Common$FlexibleComponent> getListItemsList() {
        return this.listItems_;
    }

    public InterfaceC4388w getListItemsOrBuilder(int i11) {
        return this.listItems_.get(i11);
    }

    public List<? extends InterfaceC4388w> getListItemsOrBuilderList() {
        return this.listItems_;
    }

    private void addHeaderComponents(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureHeaderComponentsIsMutable();
        this.headerComponents_.add(common$FlexibleComponent);
    }

    private void addListItems(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureListItemsIsMutable();
        this.listItems_.add(common$FlexibleComponent);
    }

    public static a newBuilder(Common$ListGroup common$ListGroup) {
        return DEFAULT_INSTANCE.createBuilder(common$ListGroup);
    }

    public static Common$ListGroup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListGroup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ListGroup parseFrom(CodedInputStream codedInputStream) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ListGroup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$ListGroup parseFrom(InputStream inputStream) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ListGroup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ListGroup parseFrom(ByteBuffer byteBuffer) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$ListGroup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ListGroup parseFrom(byte[] bArr) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ListGroup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ListGroup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
