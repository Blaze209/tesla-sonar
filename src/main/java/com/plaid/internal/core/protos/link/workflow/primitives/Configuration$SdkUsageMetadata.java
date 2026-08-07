package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Configuration$SdkUsageMetadata extends GeneratedMessageLite<Configuration$SdkUsageMetadata, a> implements MessageLiteOrBuilder {
    private static final Configuration$SdkUsageMetadata DEFAULT_INSTANCE;
    private static volatile Parser<Configuration$SdkUsageMetadata> PARSER = null;
    public static final int USES_ON_EVENT_FIELD_NUMBER = 1;
    public static final int USES_ON_EXIT_FIELD_NUMBER = 2;
    public static final int USES_ON_LOAD_FIELD_NUMBER = 3;
    public static final int USES_ON_RESULT_FIELD_NUMBER = 4;
    private boolean usesOnEvent_;
    private boolean usesOnExit_;
    private boolean usesOnLoad_;
    private boolean usesOnResult_;

    public static final class a extends GeneratedMessageLite.Builder<Configuration$SdkUsageMetadata, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$SdkUsageMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$SdkUsageMetadata configuration$SdkUsageMetadata = new Configuration$SdkUsageMetadata();
        DEFAULT_INSTANCE = configuration$SdkUsageMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$SdkUsageMetadata.class, configuration$SdkUsageMetadata);
    }

    private Configuration$SdkUsageMetadata() {
    }

    private void clearUsesOnEvent() {
        this.usesOnEvent_ = false;
    }

    private void clearUsesOnExit() {
        this.usesOnExit_ = false;
    }

    private void clearUsesOnLoad() {
        this.usesOnLoad_ = false;
    }

    private void clearUsesOnResult() {
        this.usesOnResult_ = false;
    }

    public static Configuration$SdkUsageMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$SdkUsageMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SdkUsageMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$SdkUsageMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setUsesOnEvent(boolean z11) {
        this.usesOnEvent_ = z11;
    }

    private void setUsesOnExit(boolean z11) {
        this.usesOnExit_ = z11;
    }

    private void setUsesOnLoad(boolean z11) {
        this.usesOnLoad_ = z11;
    }

    private void setUsesOnResult(boolean z11) {
        this.usesOnResult_ = z11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (e.f47559a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$SdkUsageMetadata();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"usesOnEvent_", "usesOnExit_", "usesOnLoad_", "usesOnResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$SdkUsageMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$SdkUsageMetadata.class) {
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

    public boolean getUsesOnEvent() {
        return this.usesOnEvent_;
    }

    public boolean getUsesOnExit() {
        return this.usesOnExit_;
    }

    public boolean getUsesOnLoad() {
        return this.usesOnLoad_;
    }

    public boolean getUsesOnResult() {
        return this.usesOnResult_;
    }

    public static a newBuilder(Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SdkUsageMetadata);
    }

    public static Configuration$SdkUsageMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SdkUsageMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$SdkUsageMetadata parseFrom(ByteString byteString) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$SdkUsageMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$SdkUsageMetadata parseFrom(byte[] bArr) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$SdkUsageMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$SdkUsageMetadata parseFrom(InputStream inputStream) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SdkUsageMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SdkUsageMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$SdkUsageMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SdkUsageMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
