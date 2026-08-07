package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class TrustedAuth$TrustedAuthVerifyRequest extends GeneratedMessageLite<TrustedAuth$TrustedAuthVerifyRequest, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_MEASUREMENT_FIELD_NUMBER = 1;
    private static final TrustedAuth$TrustedAuthVerifyRequest DEFAULT_INSTANCE;
    private static volatile Parser<TrustedAuth$TrustedAuthVerifyRequest> PARSER = null;
    public static final int PLAID_TRUSTED_AUTH_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private AuthorizationNoticeOuterClass$ClientMeasurement clientMeasurement_;
    private String plaidTrustedAuthToken_ = "";

    public static final class a extends GeneratedMessageLite.Builder<TrustedAuth$TrustedAuthVerifyRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(TrustedAuth$TrustedAuthVerifyRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        TrustedAuth$TrustedAuthVerifyRequest trustedAuth$TrustedAuthVerifyRequest = new TrustedAuth$TrustedAuthVerifyRequest();
        DEFAULT_INSTANCE = trustedAuth$TrustedAuthVerifyRequest;
        GeneratedMessageLite.registerDefaultInstance(TrustedAuth$TrustedAuthVerifyRequest.class, trustedAuth$TrustedAuthVerifyRequest);
    }

    private TrustedAuth$TrustedAuthVerifyRequest() {
    }

    private void clearClientMeasurement() {
        this.clientMeasurement_ = null;
        this.bitField0_ &= -2;
    }

    private void clearPlaidTrustedAuthToken() {
        this.plaidTrustedAuthToken_ = getDefaultInstance().getPlaidTrustedAuthToken();
    }

    public static TrustedAuth$TrustedAuthVerifyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientMeasurement(AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        authorizationNoticeOuterClass$ClientMeasurement.getClass();
        AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement2 = this.clientMeasurement_;
        if (authorizationNoticeOuterClass$ClientMeasurement2 == null || authorizationNoticeOuterClass$ClientMeasurement2 == AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance()) {
            this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        } else {
            this.clientMeasurement_ = AuthorizationNoticeOuterClass$ClientMeasurement.newBuilder(this.clientMeasurement_).mergeFrom(authorizationNoticeOuterClass$ClientMeasurement).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseDelimitedFrom(InputStream inputStream) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(ByteBuffer byteBuffer) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TrustedAuth$TrustedAuthVerifyRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientMeasurement(AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        authorizationNoticeOuterClass$ClientMeasurement.getClass();
        this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        this.bitField0_ |= 1;
    }

    private void setPlaidTrustedAuthToken(String str) {
        str.getClass();
        this.plaidTrustedAuthToken_ = str;
    }

    private void setPlaidTrustedAuthTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidTrustedAuthToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (f.f47055a[methodToInvoke.ordinal()]) {
            case 1:
                return new TrustedAuth$TrustedAuthVerifyRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "clientMeasurement_", "plaidTrustedAuthToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TrustedAuth$TrustedAuthVerifyRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (TrustedAuth$TrustedAuthVerifyRequest.class) {
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

    public AuthorizationNoticeOuterClass$ClientMeasurement getClientMeasurement() {
        AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = this.clientMeasurement_;
        return authorizationNoticeOuterClass$ClientMeasurement == null ? AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance() : authorizationNoticeOuterClass$ClientMeasurement;
    }

    public String getPlaidTrustedAuthToken() {
        return this.plaidTrustedAuthToken_;
    }

    public ByteString getPlaidTrustedAuthTokenBytes() {
        return ByteString.copyFromUtf8(this.plaidTrustedAuthToken_);
    }

    public boolean hasClientMeasurement() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(TrustedAuth$TrustedAuthVerifyRequest trustedAuth$TrustedAuthVerifyRequest) {
        return DEFAULT_INSTANCE.createBuilder(trustedAuth$TrustedAuthVerifyRequest);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(ByteString byteString) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(byte[] bArr) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(InputStream inputStream) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(CodedInputStream codedInputStream) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TrustedAuth$TrustedAuthVerifyRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TrustedAuth$TrustedAuthVerifyRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
