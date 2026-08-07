package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Channel$LinkChannelPushRequest extends GeneratedMessageLite<Channel$LinkChannelPushRequest, a> implements MessageLiteOrBuilder {
    public static final int CHANNEL_ID_FIELD_NUMBER = 1;
    private static final Channel$LinkChannelPushRequest DEFAULT_INSTANCE;
    public static final int MESSAGES_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Channel$LinkChannelPushRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private Channel$Message message_;
    private String channelId_ = "";
    private String workflowSessionId_ = "";
    private Internal.ProtobufList<Channel$Message> messages_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Channel$LinkChannelPushRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Channel$LinkChannelPushRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        Channel$LinkChannelPushRequest channel$LinkChannelPushRequest = new Channel$LinkChannelPushRequest();
        DEFAULT_INSTANCE = channel$LinkChannelPushRequest;
        GeneratedMessageLite.registerDefaultInstance(Channel$LinkChannelPushRequest.class, channel$LinkChannelPushRequest);
    }

    private Channel$LinkChannelPushRequest() {
    }

    private void addAllMessages(Iterable<? extends Channel$Message> iterable) {
        ensureMessagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
    }

    private void addMessages(Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(channel$Message);
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearMessage() {
        this.message_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMessages() {
        this.messages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureMessagesIsMutable() {
        Internal.ProtobufList<Channel$Message> protobufList = this.messages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Channel$LinkChannelPushRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMessage(Channel$Message channel$Message) {
        channel$Message.getClass();
        Channel$Message channel$Message2 = this.message_;
        if (channel$Message2 == null || channel$Message2 == Channel$Message.getDefaultInstance()) {
            this.message_ = channel$Message;
        } else {
            this.message_ = Channel$Message.newBuilder(this.message_).mergeFrom(channel$Message).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Channel$LinkChannelPushRequest parseDelimitedFrom(InputStream inputStream) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelPushRequest parseFrom(ByteBuffer byteBuffer) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Channel$LinkChannelPushRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMessages(int i11) {
        ensureMessagesIsMutable();
        this.messages_.remove(i11);
    }

    private void setChannelId(String str) {
        str.getClass();
        this.channelId_ = str;
    }

    private void setChannelIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    private void setMessage(Channel$Message channel$Message) {
        channel$Message.getClass();
        this.message_ = channel$Message;
        this.bitField0_ |= 1;
    }

    private void setMessages(int i11, Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i11, channel$Message);
    }

    private void setWorkflowSessionId(String str) {
        str.getClass();
        this.workflowSessionId_ = str;
    }

    private void setWorkflowSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (com.plaid.internal.core.protos.link.api.a.f47051a[methodToInvoke.ordinal()]) {
            case 1:
                return new Channel$LinkChannelPushRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004\u001b", new Object[]{"bitField0_", "channelId_", "message_", "workflowSessionId_", "messages_", Channel$Message.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Channel$LinkChannelPushRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Channel$LinkChannelPushRequest.class) {
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

    public String getChannelId() {
        return this.channelId_;
    }

    public ByteString getChannelIdBytes() {
        return ByteString.copyFromUtf8(this.channelId_);
    }

    public Channel$Message getMessage() {
        Channel$Message channel$Message = this.message_;
        return channel$Message == null ? Channel$Message.getDefaultInstance() : channel$Message;
    }

    public Channel$Message getMessages(int i11) {
        return this.messages_.get(i11);
    }

    public int getMessagesCount() {
        return this.messages_.size();
    }

    public List<Channel$Message> getMessagesList() {
        return this.messages_;
    }

    public com.plaid.internal.core.protos.link.channel.b getMessagesOrBuilder(int i11) {
        return this.messages_.get(i11);
    }

    public List<? extends com.plaid.internal.core.protos.link.channel.b> getMessagesOrBuilderList() {
        return this.messages_;
    }

    public String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public ByteString getWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public boolean hasMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Channel$LinkChannelPushRequest channel$LinkChannelPushRequest) {
        return DEFAULT_INSTANCE.createBuilder(channel$LinkChannelPushRequest);
    }

    public static Channel$LinkChannelPushRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushRequest parseFrom(ByteString byteString) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addMessages(int i11, Channel$Message channel$Message) {
        channel$Message.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i11, channel$Message);
    }

    public static Channel$LinkChannelPushRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushRequest parseFrom(byte[] bArr) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Channel$LinkChannelPushRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushRequest parseFrom(InputStream inputStream) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$LinkChannelPushRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$LinkChannelPushRequest parseFrom(CodedInputStream codedInputStream) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Channel$LinkChannelPushRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$LinkChannelPushRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
