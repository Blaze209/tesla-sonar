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
public final class Common$TabularList extends GeneratedMessageLite<Common$TabularList, a> implements MessageLiteOrBuilder {
    public static final int CAPTION_FIELD_NUMBER = 2;
    private static final Common$TabularList DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Common$TabularList> PARSER = null;
    public static final int TABLE_ROWS_FIELD_NUMBER = 4;
    private int bitField0_;
    private Common$LocalizedString caption_;
    private String id_ = "";
    private Internal.ProtobufList<Common$TabularListRow> tableRows_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Common$TabularList, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$TabularList.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TabularList common$TabularList = new Common$TabularList();
        DEFAULT_INSTANCE = common$TabularList;
        GeneratedMessageLite.registerDefaultInstance(Common$TabularList.class, common$TabularList);
    }

    private Common$TabularList() {
    }

    private void addAllTableRows(Iterable<? extends Common$TabularListRow> iterable) {
        ensureTableRowsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.tableRows_);
    }

    private void addTableRows(int i11, Common$TabularListRow common$TabularListRow) {
        common$TabularListRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.add(i11, common$TabularListRow);
    }

    private void clearCaption() {
        this.caption_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearTableRows() {
        this.tableRows_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTableRowsIsMutable() {
        Internal.ProtobufList<Common$TabularListRow> protobufList = this.tableRows_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.tableRows_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$TabularList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCaption(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.caption_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.caption_).mergeFrom(common$LocalizedString).buildPartial();
        }
        this.caption_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TabularList parseDelimitedFrom(InputStream inputStream) {
        return (Common$TabularList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TabularList parseFrom(ByteString byteString) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TabularList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeTableRows(int i11) {
        ensureTableRowsIsMutable();
        this.tableRows_.remove(i11);
    }

    private void setCaption(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.caption_ = common$LocalizedString;
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

    private void setTableRows(int i11, Common$TabularListRow common$TabularListRow) {
        common$TabularListRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.set(i11, common$TabularListRow);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TabularList();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "id_", "caption_", "tableRows_", Common$TabularListRow.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TabularList> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TabularList.class) {
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

    public Common$LocalizedString getCaption() {
        Common$LocalizedString common$LocalizedString = this.caption_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$TabularListRow getTableRows(int i11) {
        return this.tableRows_.get(i11);
    }

    public int getTableRowsCount() {
        return this.tableRows_.size();
    }

    public List<Common$TabularListRow> getTableRowsList() {
        return this.tableRows_;
    }

    public T getTableRowsOrBuilder(int i11) {
        return this.tableRows_.get(i11);
    }

    public List<? extends T> getTableRowsOrBuilderList() {
        return this.tableRows_;
    }

    public boolean hasCaption() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addTableRows(Common$TabularListRow common$TabularListRow) {
        common$TabularListRow.getClass();
        ensureTableRowsIsMutable();
        this.tableRows_.add(common$TabularListRow);
    }

    public static a newBuilder(Common$TabularList common$TabularList) {
        return DEFAULT_INSTANCE.createBuilder(common$TabularList);
    }

    public static Common$TabularList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TabularList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TabularList parseFrom(CodedInputStream codedInputStream) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TabularList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TabularList parseFrom(InputStream inputStream) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TabularList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TabularList parseFrom(ByteBuffer byteBuffer) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TabularList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TabularList parseFrom(byte[] bArr) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TabularList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
