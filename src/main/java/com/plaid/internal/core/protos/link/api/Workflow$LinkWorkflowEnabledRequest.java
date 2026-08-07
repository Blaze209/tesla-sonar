package com.plaid.internal.core.protos.link.api;

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
public final class Workflow$LinkWorkflowEnabledRequest extends GeneratedMessageLite<Workflow$LinkWorkflowEnabledRequest, a> implements MessageLiteOrBuilder {
    private static final Workflow$LinkWorkflowEnabledRequest DEFAULT_INSTANCE;
    public static final int INBOUND_REQUEST_USER_AGENT_FIELD_NUMBER = 4;
    private static volatile Parser<Workflow$LinkWorkflowEnabledRequest> PARSER = null;
    public static final int QUERY_STRING_FIELD_NUMBER = 1;
    public static final int UNIQUE_LINK_REQUEST_ID_FIELD_NUMBER = 3;
    private Object configuration_;
    private int configurationCase_ = 0;
    private String uniqueLinkRequestId_ = "";
    private String inboundRequestUserAgent_ = "";

    public static final class a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowEnabledRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(Workflow$LinkWorkflowEnabledRequest.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        QUERY_STRING(1),
        CONFIGURATION_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47015a;

        b(int i11) {
            this.f47015a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return CONFIGURATION_NOT_SET;
            }
            if (i11 != 1) {
                return null;
            }
            return QUERY_STRING;
        }

        public int getNumber() {
            return this.f47015a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Workflow$LinkWorkflowEnabledRequest workflow$LinkWorkflowEnabledRequest = new Workflow$LinkWorkflowEnabledRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEnabledRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowEnabledRequest.class, workflow$LinkWorkflowEnabledRequest);
    }

    private Workflow$LinkWorkflowEnabledRequest() {
    }

    private void clearConfiguration() {
        this.configurationCase_ = 0;
        this.configuration_ = null;
    }

    private void clearInboundRequestUserAgent() {
        this.inboundRequestUserAgent_ = getDefaultInstance().getInboundRequestUserAgent();
    }

    private void clearQueryString() {
        if (this.configurationCase_ == 1) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearUniqueLinkRequestId() {
        this.uniqueLinkRequestId_ = getDefaultInstance().getUniqueLinkRequestId();
    }

    public static Workflow$LinkWorkflowEnabledRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowEnabledRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowEnabledRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setInboundRequestUserAgent(String str) {
        str.getClass();
        this.inboundRequestUserAgent_ = str;
    }

    private void setInboundRequestUserAgentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.inboundRequestUserAgent_ = byteString.toStringUtf8();
    }

    private void setQueryString(String str) {
        str.getClass();
        this.configurationCase_ = 1;
        this.configuration_ = str;
    }

    private void setQueryStringBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.configuration_ = byteString.toStringUtf8();
        this.configurationCase_ = 1;
    }

    private void setUniqueLinkRequestId(String str) {
        str.getClass();
        this.uniqueLinkRequestId_ = str;
    }

    private void setUniqueLinkRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueLinkRequestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (g.f47056a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowEnabledRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"configuration_", "configurationCase_", "uniqueLinkRequestId_", "inboundRequestUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowEnabledRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowEnabledRequest.class) {
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

    public b getConfigurationCase() {
        return b.forNumber(this.configurationCase_);
    }

    public String getInboundRequestUserAgent() {
        return this.inboundRequestUserAgent_;
    }

    public ByteString getInboundRequestUserAgentBytes() {
        return ByteString.copyFromUtf8(this.inboundRequestUserAgent_);
    }

    public String getQueryString() {
        return this.configurationCase_ == 1 ? (String) this.configuration_ : "";
    }

    public ByteString getQueryStringBytes() {
        return ByteString.copyFromUtf8(this.configurationCase_ == 1 ? (String) this.configuration_ : "");
    }

    public String getUniqueLinkRequestId() {
        return this.uniqueLinkRequestId_;
    }

    public ByteString getUniqueLinkRequestIdBytes() {
        return ByteString.copyFromUtf8(this.uniqueLinkRequestId_);
    }

    public boolean hasQueryString() {
        return this.configurationCase_ == 1;
    }

    public static a newBuilder(Workflow$LinkWorkflowEnabledRequest workflow$LinkWorkflowEnabledRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEnabledRequest);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowEnabledRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowEnabledRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
