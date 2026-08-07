package com.plaid.internal.core.protos.link.workflow.primitives;

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
public final class OauthInitializationOptions$MobileSdkUrlOpenMessage extends GeneratedMessageLite<OauthInitializationOptions$MobileSdkUrlOpenMessage, a> implements MessageLiteOrBuilder {
    public static final int ANDROID_PARTIAL_CUSTOM_TAB_SCREEN_HEIGHT_PIXELS_FIELD_NUMBER = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 2;
    public static final int CLOSE_URI_FIELD_NUMBER = 4;
    private static final OauthInitializationOptions$MobileSdkUrlOpenMessage DEFAULT_INSTANCE;
    public static final int IOS_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 1;
    private static volatile Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> PARSER;
    private int androidPartialCustomTabScreenHeightPixels_;
    private int androidUrlOpenBehavior_;
    private String closeUri_ = "";
    private int iosUrlOpenBehavior_;

    public static final class a extends GeneratedMessageLite.Builder<OauthInitializationOptions$MobileSdkUrlOpenMessage, a> implements MessageLiteOrBuilder {
        public a() {
            super(OauthInitializationOptions$MobileSdkUrlOpenMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = new OauthInitializationOptions$MobileSdkUrlOpenMessage();
        DEFAULT_INSTANCE = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        GeneratedMessageLite.registerDefaultInstance(OauthInitializationOptions$MobileSdkUrlOpenMessage.class, oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    private OauthInitializationOptions$MobileSdkUrlOpenMessage() {
    }

    private void clearAndroidPartialCustomTabScreenHeightPixels() {
        this.androidPartialCustomTabScreenHeightPixels_ = 0;
    }

    private void clearAndroidUrlOpenBehavior() {
        this.androidUrlOpenBehavior_ = 0;
    }

    private void clearCloseUri() {
        this.closeUri_ = getDefaultInstance().getCloseUri();
    }

    private void clearIosUrlOpenBehavior() {
        this.iosUrlOpenBehavior_ = 0;
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(InputStream inputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteBuffer byteBuffer) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidPartialCustomTabScreenHeightPixels(int i11) {
        this.androidPartialCustomTabScreenHeightPixels_ = i11;
    }

    private void setAndroidUrlOpenBehavior(m mVar) {
        this.androidUrlOpenBehavior_ = mVar.getNumber();
    }

    private void setAndroidUrlOpenBehaviorValue(int i11) {
        this.androidUrlOpenBehavior_ = i11;
    }

    private void setCloseUri(String str) {
        str.getClass();
        this.closeUri_ = str;
    }

    private void setCloseUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.closeUri_ = byteString.toStringUtf8();
    }

    private void setIosUrlOpenBehavior(o oVar) {
        this.iosUrlOpenBehavior_ = oVar.getNumber();
    }

    private void setIosUrlOpenBehaviorValue(int i11) {
        this.iosUrlOpenBehavior_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (l.f47581a[methodToInvoke.ordinal()]) {
            case 1:
                return new OauthInitializationOptions$MobileSdkUrlOpenMessage();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ", new Object[]{"iosUrlOpenBehavior_", "androidUrlOpenBehavior_", "androidPartialCustomTabScreenHeightPixels_", "closeUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OauthInitializationOptions$MobileSdkUrlOpenMessage> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (OauthInitializationOptions$MobileSdkUrlOpenMessage.class) {
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

    public int getAndroidPartialCustomTabScreenHeightPixels() {
        return this.androidPartialCustomTabScreenHeightPixels_;
    }

    public m getAndroidUrlOpenBehavior() {
        m mVarForNumber = m.forNumber(this.androidUrlOpenBehavior_);
        return mVarForNumber == null ? m.UNRECOGNIZED : mVarForNumber;
    }

    public int getAndroidUrlOpenBehaviorValue() {
        return this.androidUrlOpenBehavior_;
    }

    public String getCloseUri() {
        return this.closeUri_;
    }

    public ByteString getCloseUriBytes() {
        return ByteString.copyFromUtf8(this.closeUri_);
    }

    public o getIosUrlOpenBehavior() {
        o oVarForNumber = o.forNumber(this.iosUrlOpenBehavior_);
        return oVarForNumber == null ? o.UNRECOGNIZED : oVarForNumber;
    }

    public int getIosUrlOpenBehaviorValue() {
        return this.iosUrlOpenBehavior_;
    }

    public static a newBuilder(OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        return DEFAULT_INSTANCE.createBuilder(oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteString byteString) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(InputStream inputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(CodedInputStream codedInputStream) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (OauthInitializationOptions$MobileSdkUrlOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
