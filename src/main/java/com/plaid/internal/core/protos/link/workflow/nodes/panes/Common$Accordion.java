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
public final class Common$Accordion extends GeneratedMessageLite<Common$Accordion, a> implements MessageLiteOrBuilder {
    private static final Common$Accordion DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$Accordion> PARSER;
    private String id_ = "";
    private Internal.ProtobufList<Common$AccordionItem> items_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Common$Accordion, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$Accordion.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Accordion common$Accordion = new Common$Accordion();
        DEFAULT_INSTANCE = common$Accordion;
        GeneratedMessageLite.registerDefaultInstance(Common$Accordion.class, common$Accordion);
    }

    private Common$Accordion() {
    }

    private void addAllItems(Iterable<? extends Common$AccordionItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    private void addItems(int i11, Common$AccordionItem common$AccordionItem) {
        common$AccordionItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i11, common$AccordionItem);
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Common$AccordionItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Accordion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Accordion parseDelimitedFrom(InputStream inputStream) {
        return (Common$Accordion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Accordion parseFrom(ByteString byteString) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Accordion> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeItems(int i11) {
        ensureItemsIsMutable();
        this.items_.remove(i11);
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setItems(int i11, Common$AccordionItem common$AccordionItem) {
        common$AccordionItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i11, common$AccordionItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Accordion();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"id_", "items_", Common$AccordionItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Accordion> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Accordion.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$AccordionItem getItems(int i11) {
        return this.items_.get(i11);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Common$AccordionItem> getItemsList() {
        return this.items_;
    }

    public InterfaceC4377k getItemsOrBuilder(int i11) {
        return this.items_.get(i11);
    }

    public List<? extends InterfaceC4377k> getItemsOrBuilderList() {
        return this.items_;
    }

    private void addItems(Common$AccordionItem common$AccordionItem) {
        common$AccordionItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(common$AccordionItem);
    }

    public static a newBuilder(Common$Accordion common$Accordion) {
        return DEFAULT_INSTANCE.createBuilder(common$Accordion);
    }

    public static Common$Accordion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Accordion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Accordion parseFrom(CodedInputStream codedInputStream) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Accordion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Accordion parseFrom(InputStream inputStream) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Accordion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Accordion parseFrom(ByteBuffer byteBuffer) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Accordion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Accordion parseFrom(byte[] bArr) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Accordion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Accordion) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
