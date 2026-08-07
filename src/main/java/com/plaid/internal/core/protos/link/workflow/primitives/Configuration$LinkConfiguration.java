package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Configuration$LinkConfiguration extends GeneratedMessageLite<Configuration$LinkConfiguration, b> implements MessageLiteOrBuilder {
    public static final int ACCOUNT_FILTER_FIELD_NUMBER = 7;
    public static final int CLIENT_NAME_FIELD_NUMBER = 22;
    private static final Configuration$LinkConfiguration DEFAULT_INSTANCE;
    public static final int ENABLE_ACCOUNT_SELECT_FIELD_NUMBER = 18;
    public static final int INITIAL_PRODUCTS_FIELD_NUMBER = 6;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 23;
    public static final int LINK_CUSTOMIZATION_NAME_FIELD_NUMBER = 5;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 1;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 25;
    public static final int OAUTH_ANDROID_PACKAGE_NAME_FIELD_NUMBER = 27;
    public static final int OAUTH_NONCE_FIELD_NUMBER = 16;
    public static final int OAUTH_REDIRECT_URI_FIELD_NUMBER = 11;
    public static final int OAUTH_STATE_ID_FIELD_NUMBER = 15;
    private static volatile Parser<Configuration$LinkConfiguration> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 4;
    public static final int TOKEN_FIELD_NUMBER = 24;
    public static final int USER_FIELD_NUMBER = 8;
    public static final int USER_ID_FIELD_NUMBER = 26;
    public static final int WEBHOOK_FIELD_NUMBER = 17;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 28;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 12;
    private int bitField0_;
    private boolean enableAccountSelect_;
    private LocaleOuterClass$Locale locale_;
    private User user_;
    private MapFieldLite<String, RepeatedAccountSubtype> accountFilter_ = MapFieldLite.emptyMapField();
    private String linkOpenId_ = "";
    private String linkPersistentId_ = "";
    private String publicKey_ = "";
    private String linkCustomizationName_ = "";
    private Internal.ProtobufList<String> initialProducts_ = GeneratedMessageLite.emptyProtobufList();
    private String oauthRedirectUri_ = "";
    private String webviewRedirectUri_ = "";
    private String oauthStateId_ = "";
    private String oauthNonce_ = "";
    private String webhook_ = "";
    private String clientName_ = "";
    private String institutionId_ = "";
    private String token_ = "";
    private String userId_ = "";
    private String oauthAndroidPackageName_ = "";
    private String webviewFallbackId_ = "";

    public static final class RepeatedAccountSubtype extends GeneratedMessageLite<RepeatedAccountSubtype, a> implements MessageLiteOrBuilder {
        private static final RepeatedAccountSubtype DEFAULT_INSTANCE;
        private static volatile Parser<RepeatedAccountSubtype> PARSER = null;
        public static final int SUBTYPES_FIELD_NUMBER = 1;
        private Internal.ProtobufList<String> subtypes_ = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.Builder<RepeatedAccountSubtype, a> implements MessageLiteOrBuilder {
            public a() {
                super(RepeatedAccountSubtype.DEFAULT_INSTANCE);
            }
        }

        static {
            RepeatedAccountSubtype repeatedAccountSubtype = new RepeatedAccountSubtype();
            DEFAULT_INSTANCE = repeatedAccountSubtype;
            GeneratedMessageLite.registerDefaultInstance(RepeatedAccountSubtype.class, repeatedAccountSubtype);
        }

        private RepeatedAccountSubtype() {
        }

        private void addAllSubtypes(Iterable<String> iterable) {
            ensureSubtypesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.subtypes_);
        }

        private void addSubtypes(String str) {
            str.getClass();
            ensureSubtypesIsMutable();
            this.subtypes_.add(str);
        }

        private void addSubtypesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureSubtypesIsMutable();
            this.subtypes_.add(byteString.toStringUtf8());
        }

        private void clearSubtypes() {
            this.subtypes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSubtypesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.subtypes_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.subtypes_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static RepeatedAccountSubtype getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RepeatedAccountSubtype parseDelimitedFrom(InputStream inputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepeatedAccountSubtype parseFrom(ByteBuffer byteBuffer) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RepeatedAccountSubtype> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSubtypes(int i11, String str) {
            str.getClass();
            ensureSubtypesIsMutable();
            this.subtypes_.set(i11, str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e.f47559a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RepeatedAccountSubtype();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"subtypes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RepeatedAccountSubtype> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RepeatedAccountSubtype.class) {
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

        public String getSubtypes(int i11) {
            return this.subtypes_.get(i11);
        }

        public ByteString getSubtypesBytes(int i11) {
            return ByteString.copyFromUtf8(this.subtypes_.get(i11));
        }

        public int getSubtypesCount() {
            return this.subtypes_.size();
        }

        public List<String> getSubtypesList() {
            return this.subtypes_;
        }

        public static a newBuilder(RepeatedAccountSubtype repeatedAccountSubtype) {
            return DEFAULT_INSTANCE.createBuilder(repeatedAccountSubtype);
        }

        public static RepeatedAccountSubtype parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(ByteString byteString) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RepeatedAccountSubtype parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(byte[] bArr) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RepeatedAccountSubtype parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(InputStream inputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RepeatedAccountSubtype parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RepeatedAccountSubtype parseFrom(CodedInputStream codedInputStream) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RepeatedAccountSubtype parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RepeatedAccountSubtype) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class User extends GeneratedMessageLite<User, a> implements MessageLiteOrBuilder {
        private static final User DEFAULT_INSTANCE;
        public static final int EMAIL_ADDRESS_FIELD_NUMBER = 2;
        public static final int EMAIL_ADDRESS_VERIFIED_TIME_FIELD_NUMBER = 4;
        public static final int LEGAL_NAME_FIELD_NUMBER = 1;
        private static volatile Parser<User> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 3;
        public static final int PHONE_NUMBER_VERIFIED_TIME_FIELD_NUMBER = 5;
        private int bitField0_;
        private Timestamp emailAddressVerifiedTime_;
        private Timestamp phoneNumberVerifiedTime_;
        private String legalName_ = "";
        private String emailAddress_ = "";
        private String phoneNumber_ = "";

        public static final class a extends GeneratedMessageLite.Builder<User, a> implements MessageLiteOrBuilder {
            public a() {
                super(User.DEFAULT_INSTANCE);
            }
        }

        static {
            User user = new User();
            DEFAULT_INSTANCE = user;
            GeneratedMessageLite.registerDefaultInstance(User.class, user);
        }

        private User() {
        }

        private void clearEmailAddress() {
            this.emailAddress_ = getDefaultInstance().getEmailAddress();
        }

        private void clearEmailAddressVerifiedTime() {
            this.emailAddressVerifiedTime_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLegalName() {
            this.legalName_ = getDefaultInstance().getLegalName();
        }

        private void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        private void clearPhoneNumberVerifiedTime() {
            this.phoneNumberVerifiedTime_ = null;
            this.bitField0_ &= -3;
        }

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEmailAddressVerifiedTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.emailAddressVerifiedTime_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.emailAddressVerifiedTime_ = timestamp;
            } else {
                this.emailAddressVerifiedTime_ = Timestamp.newBuilder(this.emailAddressVerifiedTime_).mergeFrom(timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePhoneNumberVerifiedTime(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.phoneNumberVerifiedTime_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.phoneNumberVerifiedTime_ = timestamp;
            } else {
                this.phoneNumberVerifiedTime_ = Timestamp.newBuilder(this.phoneNumberVerifiedTime_).mergeFrom(timestamp).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<User> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEmailAddress(String str) {
            str.getClass();
            this.emailAddress_ = str;
        }

        private void setEmailAddressBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.emailAddress_ = byteString.toStringUtf8();
        }

        private void setEmailAddressVerifiedTime(Timestamp timestamp) {
            timestamp.getClass();
            this.emailAddressVerifiedTime_ = timestamp;
            this.bitField0_ |= 1;
        }

        private void setLegalName(String str) {
            str.getClass();
            this.legalName_ = str;
        }

        private void setLegalNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.legalName_ = byteString.toStringUtf8();
        }

        private void setPhoneNumber(String str) {
            str.getClass();
            this.phoneNumber_ = str;
        }

        private void setPhoneNumberBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.phoneNumber_ = byteString.toStringUtf8();
        }

        private void setPhoneNumberVerifiedTime(Timestamp timestamp) {
            timestamp.getClass();
            this.phoneNumberVerifiedTime_ = timestamp;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (e.f47559a[methodToInvoke.ordinal()]) {
                case 1:
                    return new User();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "legalName_", "emailAddress_", "phoneNumber_", "emailAddressVerifiedTime_", "phoneNumberVerifiedTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<User> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (User.class) {
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

        public String getEmailAddress() {
            return this.emailAddress_;
        }

        public ByteString getEmailAddressBytes() {
            return ByteString.copyFromUtf8(this.emailAddress_);
        }

        public Timestamp getEmailAddressVerifiedTime() {
            Timestamp timestamp = this.emailAddressVerifiedTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public String getLegalName() {
            return this.legalName_;
        }

        public ByteString getLegalNameBytes() {
            return ByteString.copyFromUtf8(this.legalName_);
        }

        public String getPhoneNumber() {
            return this.phoneNumber_;
        }

        public ByteString getPhoneNumberBytes() {
            return ByteString.copyFromUtf8(this.phoneNumber_);
        }

        public Timestamp getPhoneNumberVerifiedTime() {
            Timestamp timestamp = this.phoneNumberVerifiedTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasEmailAddressVerifiedTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPhoneNumberVerifiedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static a newBuilder(User user) {
            return DEFAULT_INSTANCE.createBuilder(user);
        }

        public static User parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static User parseFrom(ByteString byteString) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static User parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static User parseFrom(byte[] bArr) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static User parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static User parseFrom(InputStream inputStream) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static User parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static User parseFrom(CodedInputStream codedInputStream) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static User parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapEntryLite<String, RepeatedAccountSubtype> f47532a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, RepeatedAccountSubtype.getDefaultInstance());
    }

    public static final class b extends GeneratedMessageLite.Builder<Configuration$LinkConfiguration, b> implements MessageLiteOrBuilder {
        public b() {
            super(Configuration$LinkConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$LinkConfiguration configuration$LinkConfiguration = new Configuration$LinkConfiguration();
        DEFAULT_INSTANCE = configuration$LinkConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$LinkConfiguration.class, configuration$LinkConfiguration);
    }

    private Configuration$LinkConfiguration() {
    }

    private void addAllInitialProducts(Iterable<String> iterable) {
        ensureInitialProductsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.initialProducts_);
    }

    private void addInitialProducts(String str) {
        str.getClass();
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(str);
    }

    private void addInitialProductsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureInitialProductsIsMutable();
        this.initialProducts_.add(byteString.toStringUtf8());
    }

    private void clearClientName() {
        this.clientName_ = getDefaultInstance().getClientName();
    }

    private void clearEnableAccountSelect() {
        this.enableAccountSelect_ = false;
    }

    private void clearInitialProducts() {
        this.initialProducts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearLinkCustomizationName() {
        this.linkCustomizationName_ = getDefaultInstance().getLinkCustomizationName();
    }

    private void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    private void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    private void clearLocale() {
        this.locale_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOauthAndroidPackageName() {
        this.oauthAndroidPackageName_ = getDefaultInstance().getOauthAndroidPackageName();
    }

    private void clearOauthNonce() {
        this.oauthNonce_ = getDefaultInstance().getOauthNonce();
    }

    private void clearOauthRedirectUri() {
        this.oauthRedirectUri_ = getDefaultInstance().getOauthRedirectUri();
    }

    private void clearOauthStateId() {
        this.oauthStateId_ = getDefaultInstance().getOauthStateId();
    }

    private void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    private void clearToken() {
        this.token_ = getDefaultInstance().getToken();
    }

    private void clearUser() {
        this.user_ = null;
        this.bitField0_ &= -3;
    }

    private void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    private void clearWebhook() {
        this.webhook_ = getDefaultInstance().getWebhook();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    private void ensureInitialProductsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.initialProducts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.initialProducts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$LinkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, RepeatedAccountSubtype> getMutableAccountFilterMap() {
        return internalGetMutableAccountFilter();
    }

    private MapFieldLite<String, RepeatedAccountSubtype> internalGetAccountFilter() {
        return this.accountFilter_;
    }

    private MapFieldLite<String, RepeatedAccountSubtype> internalGetMutableAccountFilter() {
        if (!this.accountFilter_.isMutable()) {
            this.accountFilter_ = this.accountFilter_.mutableCopy();
        }
        return this.accountFilter_;
    }

    private void mergeLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        LocaleOuterClass$Locale localeOuterClass$Locale2 = this.locale_;
        if (localeOuterClass$Locale2 == null || localeOuterClass$Locale2 == LocaleOuterClass$Locale.getDefaultInstance()) {
            this.locale_ = localeOuterClass$Locale;
        } else {
            this.locale_ = LocaleOuterClass$Locale.newBuilder(this.locale_).mergeFrom(localeOuterClass$Locale).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeUser(User user) {
        user.getClass();
        User user2 = this.user_;
        if (user2 == null || user2 == User.getDefaultInstance()) {
            this.user_ = user;
        } else {
            this.user_ = User.newBuilder(this.user_).mergeFrom(user).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$LinkConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$LinkConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientName(String str) {
        str.getClass();
        this.clientName_ = str;
    }

    private void setClientNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.clientName_ = byteString.toStringUtf8();
    }

    private void setEnableAccountSelect(boolean z11) {
        this.enableAccountSelect_ = z11;
    }

    private void setInitialProducts(int i11, String str) {
        str.getClass();
        ensureInitialProductsIsMutable();
        this.initialProducts_.set(i11, str);
    }

    private void setInstitutionId(String str) {
        str.getClass();
        this.institutionId_ = str;
    }

    private void setInstitutionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    private void setLinkCustomizationName(String str) {
        str.getClass();
        this.linkCustomizationName_ = str;
    }

    private void setLinkCustomizationNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkCustomizationName_ = byteString.toStringUtf8();
    }

    private void setLinkOpenId(String str) {
        str.getClass();
        this.linkOpenId_ = str;
    }

    private void setLinkOpenIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    private void setLinkPersistentId(String str) {
        str.getClass();
        this.linkPersistentId_ = str;
    }

    private void setLinkPersistentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    private void setLocale(LocaleOuterClass$Locale localeOuterClass$Locale) {
        localeOuterClass$Locale.getClass();
        this.locale_ = localeOuterClass$Locale;
        this.bitField0_ |= 1;
    }

    private void setOauthAndroidPackageName(String str) {
        str.getClass();
        this.oauthAndroidPackageName_ = str;
    }

    private void setOauthAndroidPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthAndroidPackageName_ = byteString.toStringUtf8();
    }

    private void setOauthNonce(String str) {
        str.getClass();
        this.oauthNonce_ = str;
    }

    private void setOauthNonceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthNonce_ = byteString.toStringUtf8();
    }

    private void setOauthRedirectUri(String str) {
        str.getClass();
        this.oauthRedirectUri_ = str;
    }

    private void setOauthRedirectUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthRedirectUri_ = byteString.toStringUtf8();
    }

    private void setOauthStateId(String str) {
        str.getClass();
        this.oauthStateId_ = str;
    }

    private void setOauthStateIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthStateId_ = byteString.toStringUtf8();
    }

    private void setPublicKey(String str) {
        str.getClass();
        this.publicKey_ = str;
    }

    private void setPublicKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicKey_ = byteString.toStringUtf8();
    }

    private void setToken(String str) {
        str.getClass();
        this.token_ = str;
    }

    private void setTokenBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.token_ = byteString.toStringUtf8();
    }

    private void setUser(User user) {
        user.getClass();
        this.user_ = user;
        this.bitField0_ |= 2;
    }

    private void setUserId(String str) {
        str.getClass();
        this.userId_ = str;
    }

    private void setUserIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.userId_ = byteString.toStringUtf8();
    }

    private void setWebhook(String str) {
        str.getClass();
        this.webhook_ = str;
    }

    private void setWebhookBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webhook_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackId(String str) {
        str.getClass();
        this.webviewFallbackId_ = str;
    }

    private void setWebviewFallbackIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    private void setWebviewRedirectUri(String str) {
        str.getClass();
        this.webviewRedirectUri_ = str;
    }

    private void setWebviewRedirectUriBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    public boolean containsAccountFilter(String str) {
        str.getClass();
        return internalGetAccountFilter().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (e.f47559a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$LinkConfiguration();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u001c\u0014\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u00072\bဉ\u0001\u000bȈ\fȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012\u0007\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019ဉ\u0000\u001aȈ\u001bȈ\u001cȈ", new Object[]{"bitField0_", "linkOpenId_", "linkPersistentId_", "publicKey_", "linkCustomizationName_", "initialProducts_", "accountFilter_", a.f47532a, "user_", "oauthRedirectUri_", "webviewRedirectUri_", "oauthStateId_", "oauthNonce_", "webhook_", "enableAccountSelect_", "clientName_", "institutionId_", "token_", "locale_", "userId_", "oauthAndroidPackageName_", "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$LinkConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$LinkConfiguration.class) {
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

    @Deprecated
    public Map<String, RepeatedAccountSubtype> getAccountFilter() {
        return getAccountFilterMap();
    }

    public int getAccountFilterCount() {
        return internalGetAccountFilter().size();
    }

    public Map<String, RepeatedAccountSubtype> getAccountFilterMap() {
        return Collections.unmodifiableMap(internalGetAccountFilter());
    }

    public RepeatedAccountSubtype getAccountFilterOrDefault(String str, RepeatedAccountSubtype repeatedAccountSubtype) {
        str.getClass();
        MapFieldLite<String, RepeatedAccountSubtype> mapFieldLiteInternalGetAccountFilter = internalGetAccountFilter();
        return mapFieldLiteInternalGetAccountFilter.containsKey(str) ? mapFieldLiteInternalGetAccountFilter.get(str) : repeatedAccountSubtype;
    }

    public RepeatedAccountSubtype getAccountFilterOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, RepeatedAccountSubtype> mapFieldLiteInternalGetAccountFilter = internalGetAccountFilter();
        if (mapFieldLiteInternalGetAccountFilter.containsKey(str)) {
            return mapFieldLiteInternalGetAccountFilter.get(str);
        }
        throw new IllegalArgumentException();
    }

    public String getClientName() {
        return this.clientName_;
    }

    public ByteString getClientNameBytes() {
        return ByteString.copyFromUtf8(this.clientName_);
    }

    public boolean getEnableAccountSelect() {
        return this.enableAccountSelect_;
    }

    public String getInitialProducts(int i11) {
        return this.initialProducts_.get(i11);
    }

    public ByteString getInitialProductsBytes(int i11) {
        return ByteString.copyFromUtf8(this.initialProducts_.get(i11));
    }

    public int getInitialProductsCount() {
        return this.initialProducts_.size();
    }

    public List<String> getInitialProductsList() {
        return this.initialProducts_;
    }

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public ByteString getInstitutionIdBytes() {
        return ByteString.copyFromUtf8(this.institutionId_);
    }

    public String getLinkCustomizationName() {
        return this.linkCustomizationName_;
    }

    public ByteString getLinkCustomizationNameBytes() {
        return ByteString.copyFromUtf8(this.linkCustomizationName_);
    }

    public String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public ByteString getLinkOpenIdBytes() {
        return ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public ByteString getLinkPersistentIdBytes() {
        return ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public LocaleOuterClass$Locale getLocale() {
        LocaleOuterClass$Locale localeOuterClass$Locale = this.locale_;
        return localeOuterClass$Locale == null ? LocaleOuterClass$Locale.getDefaultInstance() : localeOuterClass$Locale;
    }

    public String getOauthAndroidPackageName() {
        return this.oauthAndroidPackageName_;
    }

    public ByteString getOauthAndroidPackageNameBytes() {
        return ByteString.copyFromUtf8(this.oauthAndroidPackageName_);
    }

    public String getOauthNonce() {
        return this.oauthNonce_;
    }

    public ByteString getOauthNonceBytes() {
        return ByteString.copyFromUtf8(this.oauthNonce_);
    }

    public String getOauthRedirectUri() {
        return this.oauthRedirectUri_;
    }

    public ByteString getOauthRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.oauthRedirectUri_);
    }

    public String getOauthStateId() {
        return this.oauthStateId_;
    }

    public ByteString getOauthStateIdBytes() {
        return ByteString.copyFromUtf8(this.oauthStateId_);
    }

    public String getPublicKey() {
        return this.publicKey_;
    }

    public ByteString getPublicKeyBytes() {
        return ByteString.copyFromUtf8(this.publicKey_);
    }

    public String getToken() {
        return this.token_;
    }

    public ByteString getTokenBytes() {
        return ByteString.copyFromUtf8(this.token_);
    }

    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    public String getUserId() {
        return this.userId_;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    public String getWebhook() {
        return this.webhook_;
    }

    public ByteString getWebhookBytes() {
        return ByteString.copyFromUtf8(this.webhook_);
    }

    public String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public ByteString getWebviewFallbackIdBytes() {
        return ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public ByteString getWebviewRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUser() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b newBuilder(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkConfiguration);
    }

    public static Configuration$LinkConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteString byteString) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$LinkConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(byte[] bArr) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$LinkConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$LinkConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$LinkConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$LinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
