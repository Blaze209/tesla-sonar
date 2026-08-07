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

/* JADX INFO: loaded from: classes6.dex */
public final class Common$SegmentedInput extends GeneratedMessageLite<Common$SegmentedInput, a> implements MessageLiteOrBuilder {
    private static final Common$SegmentedInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile Parser<Common$SegmentedInput> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private String id_ = "";
    private int length_;
    private int size_;
    private int type_;
    private Common$TextInputValidation validation_;

    public static final class a extends GeneratedMessageLite.Builder<Common$SegmentedInput, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$SegmentedInput.DEFAULT_INSTANCE);
        }
    }

    public enum b implements Internal.EnumLite {
        INPUT_SIZE_UNKNOWN(0),
        INPUT_SIZE_40(1),
        INPUT_SIZE_48(2),
        INPUT_SIZE_56(3),
        UNRECOGNIZED(-1);

        public static final int INPUT_SIZE_40_VALUE = 1;
        public static final int INPUT_SIZE_48_VALUE = 2;
        public static final int INPUT_SIZE_56_VALUE = 3;
        public static final int INPUT_SIZE_UNKNOWN_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47189b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47191a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return b.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b$b, reason: collision with other inner class name */
        public static final class C0745b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0745b f47192a = new C0745b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return b.forNumber(i11) != null;
            }
        }

        b(int i11) {
            this.f47191a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return INPUT_SIZE_UNKNOWN;
            }
            if (i11 == 1) {
                return INPUT_SIZE_40;
            }
            if (i11 == 2) {
                return INPUT_SIZE_48;
            }
            if (i11 != 3) {
                return null;
            }
            return INPUT_SIZE_56;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f47189b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0745b.f47192a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47191a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum c implements Internal.EnumLite {
        INPUT_TYPE_UNKNOWN(0),
        INPUT_TYPE_TEXT(1),
        INPUT_TYPE_NUMBER(2),
        INPUT_TYPE_PASSWORD(3),
        INPUT_TYPE_TELEPHONE(4),
        UNRECOGNIZED(-1);

        public static final int INPUT_TYPE_NUMBER_VALUE = 2;
        public static final int INPUT_TYPE_PASSWORD_VALUE = 3;
        public static final int INPUT_TYPE_TELEPHONE_VALUE = 4;
        public static final int INPUT_TYPE_TEXT_VALUE = 1;
        public static final int INPUT_TYPE_UNKNOWN_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47193b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47195a;

        public class a implements Internal.EnumLiteMap<c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return c.forNumber(i11);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47196a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return c.forNumber(i11) != null;
            }
        }

        c(int i11) {
            this.f47195a = i11;
        }

        public static c forNumber(int i11) {
            if (i11 == 0) {
                return INPUT_TYPE_UNKNOWN;
            }
            if (i11 == 1) {
                return INPUT_TYPE_TEXT;
            }
            if (i11 == 2) {
                return INPUT_TYPE_NUMBER;
            }
            if (i11 == 3) {
                return INPUT_TYPE_PASSWORD;
            }
            if (i11 != 4) {
                return null;
            }
            return INPUT_TYPE_TELEPHONE;
        }

        public static Internal.EnumLiteMap<c> internalGetValueMap() {
            return f47193b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47196a;
        }

        @Deprecated
        public static c valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47195a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$SegmentedInput common$SegmentedInput = new Common$SegmentedInput();
        DEFAULT_INSTANCE = common$SegmentedInput;
        GeneratedMessageLite.registerDefaultInstance(Common$SegmentedInput.class, common$SegmentedInput);
    }

    private Common$SegmentedInput() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLength() {
        this.length_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$SegmentedInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 != null && common$TextInputValidation2 != Common$TextInputValidation.getDefaultInstance()) {
            common$TextInputValidation = Common$TextInputValidation.newBuilder(this.validation_).mergeFrom(common$TextInputValidation).buildPartial();
        }
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$SegmentedInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setLength(int i11) {
        this.length_ = i11;
    }

    private void setSize(b bVar) {
        this.size_ = bVar.getNumber();
    }

    private void setSizeValue(int i11) {
        this.size_ = i11;
    }

    private void setType(c cVar) {
        this.type_ = cVar.getNumber();
    }

    private void setTypeValue(int i11) {
        this.type_ = i11;
    }

    private void setValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SegmentedInput();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f\u0005ဉ\u0000", new Object[]{"bitField0_", "id_", "type_", "length_", "size_", "validation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SegmentedInput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SegmentedInput.class) {
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

    public int getLength() {
        return this.length_;
    }

    public b getSize() {
        b bVarForNumber = b.forNumber(this.size_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public c getType() {
        c cVarForNumber = c.forNumber(this.type_);
        return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Common$TextInputValidation getValidation() {
        Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Common$SegmentedInput common$SegmentedInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SegmentedInput);
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
