package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class External$DocumentUploadFilePreference extends GeneratedMessageLite<External$DocumentUploadFilePreference, a> implements c {
    private static final External$DocumentUploadFilePreference DEFAULT_INSTANCE;
    private static volatile Parser<External$DocumentUploadFilePreference> PARSER = null;
    public static final int UPLOAD_FILE_TYPE_FIELD_NUMBER = 1;
    private int uploadFileType_;

    public static final class a extends GeneratedMessageLite.Builder<External$DocumentUploadFilePreference, a> implements c {
        public a() {
            super(External$DocumentUploadFilePreference.DEFAULT_INSTANCE);
        }
    }

    static {
        External$DocumentUploadFilePreference external$DocumentUploadFilePreference = new External$DocumentUploadFilePreference();
        DEFAULT_INSTANCE = external$DocumentUploadFilePreference;
        GeneratedMessageLite.registerDefaultInstance(External$DocumentUploadFilePreference.class, external$DocumentUploadFilePreference);
    }

    private External$DocumentUploadFilePreference() {
    }

    private void clearUploadFileType() {
        this.uploadFileType_ = 0;
    }

    public static External$DocumentUploadFilePreference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static External$DocumentUploadFilePreference parseDelimitedFrom(InputStream inputStream) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static External$DocumentUploadFilePreference parseFrom(ByteBuffer byteBuffer) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<External$DocumentUploadFilePreference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setUploadFileType(d dVar) {
        this.uploadFileType_ = dVar.getNumber();
    }

    private void setUploadFileTypeValue(int i11) {
        this.uploadFileType_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (com.plaid.internal.core.protos.income_verification_manager.a.f46958a[methodToInvoke.ordinal()]) {
            case 1:
                return new External$DocumentUploadFilePreference();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"uploadFileType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<External$DocumentUploadFilePreference> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (External$DocumentUploadFilePreference.class) {
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

    public d getUploadFileType() {
        d dVarForNumber = d.forNumber(this.uploadFileType_);
        return dVarForNumber == null ? d.UNRECOGNIZED : dVarForNumber;
    }

    public int getUploadFileTypeValue() {
        return this.uploadFileType_;
    }

    public static a newBuilder(External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        return DEFAULT_INSTANCE.createBuilder(external$DocumentUploadFilePreference);
    }

    public static External$DocumentUploadFilePreference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static External$DocumentUploadFilePreference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static External$DocumentUploadFilePreference parseFrom(ByteString byteString) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static External$DocumentUploadFilePreference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static External$DocumentUploadFilePreference parseFrom(byte[] bArr) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static External$DocumentUploadFilePreference parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static External$DocumentUploadFilePreference parseFrom(InputStream inputStream) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static External$DocumentUploadFilePreference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static External$DocumentUploadFilePreference parseFrom(CodedInputStream codedInputStream) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static External$DocumentUploadFilePreference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentUploadFilePreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
