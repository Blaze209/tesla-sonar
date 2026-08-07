package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class Pane$PresentationMode extends GeneratedMessageLite<Pane$PresentationMode, a> implements MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final Pane$PresentationMode DEFAULT_INSTANCE;
    public static final int HALF_PANE_FIELD_NUMBER = 2;
    private static volatile Parser<Pane$PresentationMode> PARSER = null;
    public static final int VARIABLE_HEIGHT_FIELD_NUMBER = 4;
    private int typeCase_ = 0;
    private Object type_;

    public static final class Default extends GeneratedMessageLite<Default, a> implements MessageLiteOrBuilder {
        private static final Default DEFAULT_INSTANCE;
        private static volatile Parser<Default> PARSER;

        public static final class a extends GeneratedMessageLite.Builder<Default, a> implements MessageLiteOrBuilder {
            public a() {
                super(Default.DEFAULT_INSTANCE);
            }
        }

        static {
            Default r11 = new Default();
            DEFAULT_INSTANCE = r11;
            GeneratedMessageLite.registerDefaultInstance(Default.class, r11);
        }

        private Default() {
        }

        public static Default getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Default parseDelimitedFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(ByteBuffer byteBuffer) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Default> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (m0.f47473a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Default();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Default> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Default.class) {
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

        public static a newBuilder(Default r11) {
            return DEFAULT_INSTANCE.createBuilder(r11);
        }

        public static Default parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Default parseFrom(ByteString byteString) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Default parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Default parseFrom(byte[] bArr) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Default parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Default parseFrom(InputStream inputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Default parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Default parseFrom(CodedInputStream codedInputStream) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Default parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Default) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HalfPane extends GeneratedMessageLite<HalfPane, a> implements MessageLiteOrBuilder {
        private static final HalfPane DEFAULT_INSTANCE;
        private static volatile Parser<HalfPane> PARSER;

        public static final class a extends GeneratedMessageLite.Builder<HalfPane, a> implements MessageLiteOrBuilder {
            public a() {
                super(HalfPane.DEFAULT_INSTANCE);
            }
        }

        static {
            HalfPane halfPane = new HalfPane();
            DEFAULT_INSTANCE = halfPane;
            GeneratedMessageLite.registerDefaultInstance(HalfPane.class, halfPane);
        }

        private HalfPane() {
        }

        public static HalfPane getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HalfPane parseDelimitedFrom(InputStream inputStream) {
            return (HalfPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HalfPane parseFrom(ByteBuffer byteBuffer) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<HalfPane> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (m0.f47473a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HalfPane();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HalfPane> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (HalfPane.class) {
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

        public static a newBuilder(HalfPane halfPane) {
            return DEFAULT_INSTANCE.createBuilder(halfPane);
        }

        public static HalfPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HalfPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HalfPane parseFrom(ByteString byteString) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HalfPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HalfPane parseFrom(byte[] bArr) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HalfPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HalfPane parseFrom(InputStream inputStream) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HalfPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HalfPane parseFrom(CodedInputStream codedInputStream) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HalfPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HalfPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VariableHeight extends GeneratedMessageLite<VariableHeight, a> implements MessageLiteOrBuilder {
        private static final VariableHeight DEFAULT_INSTANCE;
        private static volatile Parser<VariableHeight> PARSER;

        public static final class a extends GeneratedMessageLite.Builder<VariableHeight, a> implements MessageLiteOrBuilder {
            public a() {
                super(VariableHeight.DEFAULT_INSTANCE);
            }
        }

        static {
            VariableHeight variableHeight = new VariableHeight();
            DEFAULT_INSTANCE = variableHeight;
            GeneratedMessageLite.registerDefaultInstance(VariableHeight.class, variableHeight);
        }

        private VariableHeight() {
        }

        public static VariableHeight getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VariableHeight parseDelimitedFrom(InputStream inputStream) {
            return (VariableHeight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VariableHeight parseFrom(ByteBuffer byteBuffer) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VariableHeight> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (m0.f47473a[methodToInvoke.ordinal()]) {
                case 1:
                    return new VariableHeight();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VariableHeight> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (VariableHeight.class) {
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

        public static a newBuilder(VariableHeight variableHeight) {
            return DEFAULT_INSTANCE.createBuilder(variableHeight);
        }

        public static VariableHeight parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(ByteString byteString) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VariableHeight parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(byte[] bArr) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VariableHeight parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(InputStream inputStream) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VariableHeight parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VariableHeight parseFrom(CodedInputStream codedInputStream) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VariableHeight parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VariableHeight) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<Pane$PresentationMode, a> implements MessageLiteOrBuilder {
        public a() {
            super(Pane$PresentationMode.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        DEFAULT(1),
        HALF_PANE(2),
        VARIABLE_HEIGHT(4),
        TYPE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47344a;

        b(int i11) {
            this.f47344a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return TYPE_NOT_SET;
            }
            if (i11 == 1) {
                return DEFAULT;
            }
            if (i11 == 2) {
                return HALF_PANE;
            }
            if (i11 != 4) {
                return null;
            }
            return VARIABLE_HEIGHT;
        }

        public int getNumber() {
            return this.f47344a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Pane$PresentationMode pane$PresentationMode = new Pane$PresentationMode();
        DEFAULT_INSTANCE = pane$PresentationMode;
        GeneratedMessageLite.registerDefaultInstance(Pane$PresentationMode.class, pane$PresentationMode);
    }

    private Pane$PresentationMode() {
    }

    private void clearDefault() {
        if (this.typeCase_ == 1) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearHalfPane() {
        if (this.typeCase_ == 2) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    private void clearType() {
        this.typeCase_ = 0;
        this.type_ = null;
    }

    private void clearVariableHeight() {
        if (this.typeCase_ == 4) {
            this.typeCase_ = 0;
            this.type_ = null;
        }
    }

    public static Pane$PresentationMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDefault(Default r11) {
        r11.getClass();
        if (this.typeCase_ != 1 || this.type_ == Default.getDefaultInstance()) {
            this.type_ = r11;
        } else {
            this.type_ = Default.newBuilder((Default) this.type_).mergeFrom(r11).buildPartial();
        }
        this.typeCase_ = 1;
    }

    private void mergeHalfPane(HalfPane halfPane) {
        halfPane.getClass();
        if (this.typeCase_ != 2 || this.type_ == HalfPane.getDefaultInstance()) {
            this.type_ = halfPane;
        } else {
            this.type_ = HalfPane.newBuilder((HalfPane) this.type_).mergeFrom(halfPane).buildPartial();
        }
        this.typeCase_ = 2;
    }

    private void mergeVariableHeight(VariableHeight variableHeight) {
        variableHeight.getClass();
        if (this.typeCase_ != 4 || this.type_ == VariableHeight.getDefaultInstance()) {
            this.type_ = variableHeight;
        } else {
            this.type_ = VariableHeight.newBuilder((VariableHeight) this.type_).mergeFrom(variableHeight).buildPartial();
        }
        this.typeCase_ = 4;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Pane$PresentationMode parseDelimitedFrom(InputStream inputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PresentationMode parseFrom(ByteBuffer byteBuffer) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Pane$PresentationMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefault(Default r11) {
        r11.getClass();
        this.type_ = r11;
        this.typeCase_ = 1;
    }

    private void setHalfPane(HalfPane halfPane) {
        halfPane.getClass();
        this.type_ = halfPane;
        this.typeCase_ = 2;
    }

    private void setVariableHeight(VariableHeight variableHeight) {
        variableHeight.getClass();
        this.type_ = variableHeight;
        this.typeCase_ = 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (m0.f47473a[methodToInvoke.ordinal()]) {
            case 1:
                return new Pane$PresentationMode();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0004<\u0000", new Object[]{"type_", "typeCase_", Default.class, HalfPane.class, VariableHeight.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Pane$PresentationMode> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Pane$PresentationMode.class) {
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

    public Default getDefault() {
        return this.typeCase_ == 1 ? (Default) this.type_ : Default.getDefaultInstance();
    }

    public HalfPane getHalfPane() {
        return this.typeCase_ == 2 ? (HalfPane) this.type_ : HalfPane.getDefaultInstance();
    }

    public b getTypeCase() {
        return b.forNumber(this.typeCase_);
    }

    public VariableHeight getVariableHeight() {
        return this.typeCase_ == 4 ? (VariableHeight) this.type_ : VariableHeight.getDefaultInstance();
    }

    public boolean hasDefault() {
        return this.typeCase_ == 1;
    }

    public boolean hasHalfPane() {
        return this.typeCase_ == 2;
    }

    public boolean hasVariableHeight() {
        return this.typeCase_ == 4;
    }

    public static a newBuilder(Pane$PresentationMode pane$PresentationMode) {
        return DEFAULT_INSTANCE.createBuilder(pane$PresentationMode);
    }

    public static Pane$PresentationMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(ByteString byteString) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Pane$PresentationMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(byte[] bArr) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pane$PresentationMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(InputStream inputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pane$PresentationMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Pane$PresentationMode parseFrom(CodedInputStream codedInputStream) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pane$PresentationMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Pane$PresentationMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
