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
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ClientSubmissionPaneOuterClass$ClientSubmissionPane extends GeneratedMessageLite<ClientSubmissionPaneOuterClass$ClientSubmissionPane, a> implements MessageLiteOrBuilder {
    private static final ClientSubmissionPaneOuterClass$ClientSubmissionPane DEFAULT_INSTANCE;
    private static volatile Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> PARSER;

    public static final class Actions extends GeneratedMessageLite<Actions, b> implements MessageLiteOrBuilder {
        private static final Actions DEFAULT_INSTANCE;
        public static final int EXIT_FIELD_NUMBER = 2;
        private static volatile Parser<Actions> PARSER = null;
        public static final int SUBMIT_FIELD_NUMBER = 1;
        private int actionCase_ = 0;
        private Object action_;

        public static final class ExitAction extends GeneratedMessageLite<ExitAction, a> implements MessageLiteOrBuilder {
            private static final ExitAction DEFAULT_INSTANCE;
            private static volatile Parser<ExitAction> PARSER;

            public static final class a extends GeneratedMessageLite.Builder<ExitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ExitAction.DEFAULT_INSTANCE);
                }
            }

            static {
                ExitAction exitAction = new ExitAction();
                DEFAULT_INSTANCE = exitAction;
                GeneratedMessageLite.registerDefaultInstance(ExitAction.class, exitAction);
            }

            private ExitAction() {
            }

            public static ExitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ExitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ExitAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ExitAction.class) {
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

            public static a newBuilder(ExitAction exitAction) {
                return DEFAULT_INSTANCE.createBuilder(exitAction);
            }

            public static ExitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ExitAction parseFrom(ByteString byteString) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ExitAction parseFrom(byte[] bArr) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ExitAction parseFrom(InputStream inputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ExitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SubmitAction extends GeneratedMessageLite<SubmitAction, a> implements MessageLiteOrBuilder {
            public static final int DATA_FIELD_NUMBER = 1;
            private static final SubmitAction DEFAULT_INSTANCE;
            private static volatile Parser<SubmitAction> PARSER;
            private Internal.ProtobufList<Data> data_ = GeneratedMessageLite.emptyProtobufList();

            public static final class Data extends GeneratedMessageLite<Data, a> implements b {
                private static final Data DEFAULT_INSTANCE;
                public static final int FINGERPRINT_CALCULATED_FIELD_NUMBER = 2;
                private static volatile Parser<Data> PARSER = null;
                public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
                private int valueCase_ = 0;
                private Object value_;

                public static final class a extends GeneratedMessageLite.Builder<Data, a> implements b {
                    public a() {
                        super(Data.DEFAULT_INSTANCE);
                    }
                }

                public enum b {
                    PHONE_NUMBER(1),
                    FINGERPRINT_CALCULATED(2),
                    VALUE_NOT_SET(0);


                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f47097a;

                    b(int i11) {
                        this.f47097a = i11;
                    }

                    public static b forNumber(int i11) {
                        if (i11 == 0) {
                            return VALUE_NOT_SET;
                        }
                        if (i11 == 1) {
                            return PHONE_NUMBER;
                        }
                        if (i11 != 2) {
                            return null;
                        }
                        return FINGERPRINT_CALCULATED;
                    }

                    public int getNumber() {
                        return this.f47097a;
                    }

                    @Deprecated
                    public static b valueOf(int i11) {
                        return forNumber(i11);
                    }
                }

                static {
                    Data data = new Data();
                    DEFAULT_INSTANCE = data;
                    GeneratedMessageLite.registerDefaultInstance(Data.class, data);
                }

                private Data() {
                }

                private void clearFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearPhoneNumber() {
                    if (this.valueCase_ == 1) {
                        this.valueCase_ = 0;
                        this.value_ = null;
                    }
                }

                private void clearValue() {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }

                public static Data getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Data parseDelimitedFrom(InputStream inputStream) {
                    return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Data parseFrom(ByteBuffer byteBuffer) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<Data> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setFingerprintCalculated(boolean z11) {
                    this.valueCase_ = 2;
                    this.value_ = Boolean.valueOf(z11);
                }

                private void setPhoneNumber(String str) {
                    str.getClass();
                    this.valueCase_ = 1;
                    this.value_ = str;
                }

                private void setPhoneNumberBytes(ByteString byteString) {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.value_ = byteString.toStringUtf8();
                    this.valueCase_ = 1;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Data();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000", new Object[]{"value_", "valueCase_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<Data> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (Data.class) {
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

                public boolean getFingerprintCalculated() {
                    if (this.valueCase_ == 2) {
                        return ((Boolean) this.value_).booleanValue();
                    }
                    return false;
                }

                public String getPhoneNumber() {
                    return this.valueCase_ == 1 ? (String) this.value_ : "";
                }

                public ByteString getPhoneNumberBytes() {
                    return ByteString.copyFromUtf8(this.valueCase_ == 1 ? (String) this.value_ : "");
                }

                public b getValueCase() {
                    return b.forNumber(this.valueCase_);
                }

                public boolean hasFingerprintCalculated() {
                    return this.valueCase_ == 2;
                }

                public boolean hasPhoneNumber() {
                    return this.valueCase_ == 1;
                }

                public static a newBuilder(Data data) {
                    return DEFAULT_INSTANCE.createBuilder(data);
                }

                public static Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static Data parseFrom(ByteString byteString) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static Data parseFrom(byte[] bArr) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static Data parseFrom(InputStream inputStream) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static Data parseFrom(CodedInputStream codedInputStream) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends GeneratedMessageLite.Builder<SubmitAction, a> implements MessageLiteOrBuilder {
                public a() {
                    super(SubmitAction.DEFAULT_INSTANCE);
                }
            }

            public interface b extends MessageLiteOrBuilder {
            }

            static {
                SubmitAction submitAction = new SubmitAction();
                DEFAULT_INSTANCE = submitAction;
                GeneratedMessageLite.registerDefaultInstance(SubmitAction.class, submitAction);
            }

            private SubmitAction() {
            }

            private void addAllData(Iterable<? extends Data> iterable) {
                ensureDataIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
            }

            private void addData(Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(data);
            }

            private void clearData() {
                this.data_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureDataIsMutable() {
                Internal.ProtobufList<Data> protobufList = this.data_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static SubmitAction getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<SubmitAction> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeData(int i11) {
                ensureDataIsMutable();
                this.data_.remove(i11);
            }

            private void setData(int i11, Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.set(i11, data);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SubmitAction();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", Data.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<SubmitAction> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (SubmitAction.class) {
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

            public Data getData(int i11) {
                return this.data_.get(i11);
            }

            public int getDataCount() {
                return this.data_.size();
            }

            public List<Data> getDataList() {
                return this.data_;
            }

            public b getDataOrBuilder(int i11) {
                return this.data_.get(i11);
            }

            public List<? extends b> getDataOrBuilderList() {
                return this.data_;
            }

            public static a newBuilder(SubmitAction submitAction) {
                return DEFAULT_INSTANCE.createBuilder(submitAction);
            }

            public static SubmitAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(ByteString byteString) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addData(int i11, Data data) {
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(i11, data);
            }

            public static SubmitAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(byte[] bArr) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SubmitAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(InputStream inputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SubmitAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SubmitAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SubmitAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a {
            SUBMIT(1),
            EXIT(2),
            ACTION_NOT_SET(0);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f47099a;

            a(int i11) {
                this.f47099a = i11;
            }

            public static a forNumber(int i11) {
                if (i11 == 0) {
                    return ACTION_NOT_SET;
                }
                if (i11 == 1) {
                    return SUBMIT;
                }
                if (i11 != 2) {
                    return null;
                }
                return EXIT;
            }

            public int getNumber() {
                return this.f47099a;
            }

            @Deprecated
            public static a valueOf(int i11) {
                return forNumber(i11);
            }
        }

        public static final class b extends GeneratedMessageLite.Builder<Actions, b> implements MessageLiteOrBuilder {
            public b() {
                super(Actions.DEFAULT_INSTANCE);
            }
        }

        static {
            Actions actions = new Actions();
            DEFAULT_INSTANCE = actions;
            GeneratedMessageLite.registerDefaultInstance(Actions.class, actions);
        }

        private Actions() {
        }

        private void clearAction() {
            this.actionCase_ = 0;
            this.action_ = null;
        }

        private void clearExit() {
            if (this.actionCase_ == 2) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        private void clearSubmit() {
            if (this.actionCase_ == 1) {
                this.actionCase_ = 0;
                this.action_ = null;
            }
        }

        public static Actions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExit(ExitAction exitAction) {
            exitAction.getClass();
            if (this.actionCase_ != 2 || this.action_ == ExitAction.getDefaultInstance()) {
                this.action_ = exitAction;
            } else {
                this.action_ = ExitAction.newBuilder((ExitAction) this.action_).mergeFrom(exitAction).buildPartial();
            }
            this.actionCase_ = 2;
        }

        private void mergeSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            if (this.actionCase_ != 1 || this.action_ == SubmitAction.getDefaultInstance()) {
                this.action_ = submitAction;
            } else {
                this.action_ = SubmitAction.newBuilder((SubmitAction) this.action_).mergeFrom(submitAction).buildPartial();
            }
            this.actionCase_ = 1;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Actions parseDelimitedFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Actions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExit(ExitAction exitAction) {
            exitAction.getClass();
            this.action_ = exitAction;
            this.actionCase_ = 2;
        }

        private void setSubmit(SubmitAction submitAction) {
            submitAction.getClass();
            this.action_ = submitAction;
            this.actionCase_ = 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Actions();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"action_", "actionCase_", SubmitAction.class, ExitAction.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Actions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Actions.class) {
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

        public a getActionCase() {
            return a.forNumber(this.actionCase_);
        }

        public ExitAction getExit() {
            return this.actionCase_ == 2 ? (ExitAction) this.action_ : ExitAction.getDefaultInstance();
        }

        public SubmitAction getSubmit() {
            return this.actionCase_ == 1 ? (SubmitAction) this.action_ : SubmitAction.getDefaultInstance();
        }

        public boolean hasExit() {
            return this.actionCase_ == 2;
        }

        public boolean hasSubmit() {
            return this.actionCase_ == 1;
        }

        public static b newBuilder(Actions actions) {
            return DEFAULT_INSTANCE.createBuilder(actions);
        }

        public static Actions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Actions parseFrom(ByteString byteString) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Actions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Actions parseFrom(byte[] bArr) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Actions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Actions parseFrom(InputStream inputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Actions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Actions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Actions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Rendering extends GeneratedMessageLite<Rendering, b> implements MessageLiteOrBuilder {
        private static final Rendering DEFAULT_INSTANCE;
        public static final int EVENTS_FIELD_NUMBER = 1;
        private static volatile Parser<Rendering> PARSER = null;
        public static final int REQUIRED_SUBMISSION_DATA_FIELD_NUMBER = 3;
        public static final int WAIT_FOR_TD_DATA_COLLECTION_FIELD_NUMBER = 2;
        private static final Internal.ListAdapter.Converter<Integer, c> requiredSubmissionData_converter_ = new a();
        private int bitField0_;
        private Events events_;
        private int requiredSubmissionDataMemoizedSerializedSize;
        private Internal.IntList requiredSubmissionData_ = GeneratedMessageLite.emptyIntList();
        private boolean waitForTdDataCollection_;

        public static final class Events extends GeneratedMessageLite<Events, a> implements MessageLiteOrBuilder {
            private static final Events DEFAULT_INSTANCE;
            public static final int ON_APPEAR_FIELD_NUMBER = 1;
            private static volatile Parser<Events> PARSER;
            private Internal.ProtobufList<Common$SDKEvent> onAppear_ = GeneratedMessageLite.emptyProtobufList();

            public static final class a extends GeneratedMessageLite.Builder<Events, a> implements MessageLiteOrBuilder {
                public a() {
                    super(Events.DEFAULT_INSTANCE);
                }
            }

            static {
                Events events = new Events();
                DEFAULT_INSTANCE = events;
                GeneratedMessageLite.registerDefaultInstance(Events.class, events);
            }

            private Events() {
            }

            private void addAllOnAppear(Iterable<? extends Common$SDKEvent> iterable) {
                ensureOnAppearIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.onAppear_);
            }

            private void addOnAppear(Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(common$SDKEvent);
            }

            private void clearOnAppear() {
                this.onAppear_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void ensureOnAppearIsMutable() {
                Internal.ProtobufList<Common$SDKEvent> protobufList = this.onAppear_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.onAppear_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            public static Events getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Events parseDelimitedFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(ByteBuffer byteBuffer) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Events> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void removeOnAppear(int i11) {
                ensureOnAppearIsMutable();
                this.onAppear_.remove(i11);
            }

            private void setOnAppear(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.set(i11, common$SDKEvent);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Events();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"onAppear_", Common$SDKEvent.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Events> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Events.class) {
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

            public Common$SDKEvent getOnAppear(int i11) {
                return this.onAppear_.get(i11);
            }

            public int getOnAppearCount() {
                return this.onAppear_.size();
            }

            public List<Common$SDKEvent> getOnAppearList() {
                return this.onAppear_;
            }

            public M getOnAppearOrBuilder(int i11) {
                return this.onAppear_.get(i11);
            }

            public List<? extends M> getOnAppearOrBuilderList() {
                return this.onAppear_;
            }

            public static a newBuilder(Events events) {
                return DEFAULT_INSTANCE.createBuilder(events);
            }

            public static Events parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Events parseFrom(ByteString byteString) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void addOnAppear(int i11, Common$SDKEvent common$SDKEvent) {
                common$SDKEvent.getClass();
                ensureOnAppearIsMutable();
                this.onAppear_.add(i11, common$SDKEvent);
            }

            public static Events parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Events parseFrom(byte[] bArr) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Events parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Events parseFrom(InputStream inputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Events parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Events parseFrom(CodedInputStream codedInputStream) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Events parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Events) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public class a implements Internal.ListAdapter.Converter<Integer, c> {
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public final c convert(Integer num) {
                c cVarForNumber = c.forNumber(num.intValue());
                return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
            }
        }

        public static final class b extends GeneratedMessageLite.Builder<Rendering, b> implements MessageLiteOrBuilder {
            public b() {
                super(Rendering.DEFAULT_INSTANCE);
            }
        }

        public enum c implements Internal.EnumLite {
            SUBMITTED_DATA_UNKNOWN(0),
            SUBMITTED_DATA_TRUSTED_DATA(1),
            SUBMITTED_DATA_PHONE_NUMBER(2),
            UNRECOGNIZED(-1);

            public static final int SUBMITTED_DATA_PHONE_NUMBER_VALUE = 2;
            public static final int SUBMITTED_DATA_TRUSTED_DATA_VALUE = 1;
            public static final int SUBMITTED_DATA_UNKNOWN_VALUE = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f47100b = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f47102a;

            public class a implements Internal.EnumLiteMap<c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i11) {
                    return c.forNumber(i11);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f47103a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i11) {
                    return c.forNumber(i11) != null;
                }
            }

            c(int i11) {
                this.f47102a = i11;
            }

            public static c forNumber(int i11) {
                if (i11 == 0) {
                    return SUBMITTED_DATA_UNKNOWN;
                }
                if (i11 == 1) {
                    return SUBMITTED_DATA_TRUSTED_DATA;
                }
                if (i11 != 2) {
                    return null;
                }
                return SUBMITTED_DATA_PHONE_NUMBER;
            }

            public static Internal.EnumLiteMap<c> internalGetValueMap() {
                return f47100b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f47103a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f47102a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static c valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Rendering rendering = new Rendering();
            DEFAULT_INSTANCE = rendering;
            GeneratedMessageLite.registerDefaultInstance(Rendering.class, rendering);
        }

        private Rendering() {
        }

        private void addAllRequiredSubmissionData(Iterable<? extends c> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            Iterator<? extends c> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().getNumber());
            }
        }

        private void addAllRequiredSubmissionDataValue(Iterable<Integer> iterable) {
            ensureRequiredSubmissionDataIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.requiredSubmissionData_.addInt(it.next().intValue());
            }
        }

        private void addRequiredSubmissionData(c cVar) {
            cVar.getClass();
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(cVar.getNumber());
        }

        private void addRequiredSubmissionDataValue(int i11) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.addInt(i11);
        }

        private void clearEvents() {
            this.events_ = null;
            this.bitField0_ &= -2;
        }

        private void clearRequiredSubmissionData() {
            this.requiredSubmissionData_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearWaitForTdDataCollection() {
            this.waitForTdDataCollection_ = false;
        }

        private void ensureRequiredSubmissionDataIsMutable() {
            Internal.IntList intList = this.requiredSubmissionData_;
            if (intList.isModifiable()) {
                return;
            }
            this.requiredSubmissionData_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static Rendering getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEvents(Events events) {
            events.getClass();
            Events events2 = this.events_;
            if (events2 == null || events2 == Events.getDefaultInstance()) {
                this.events_ = events;
            } else {
                this.events_ = Events.newBuilder(this.events_).mergeFrom(events).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Rendering> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEvents(Events events) {
            events.getClass();
            this.events_ = events;
            this.bitField0_ |= 1;
        }

        private void setRequiredSubmissionData(int i11, c cVar) {
            cVar.getClass();
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i11, cVar.getNumber());
        }

        private void setRequiredSubmissionDataValue(int i11, int i12) {
            ensureRequiredSubmissionDataIsMutable();
            this.requiredSubmissionData_.setInt(i11, i12);
        }

        private void setWaitForTdDataCollection(boolean z11) {
            this.waitForTdDataCollection_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Rendering();
                case 2:
                    return new b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0007\u0003,", new Object[]{"bitField0_", "events_", "waitForTdDataCollection_", "requiredSubmissionData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Rendering> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Rendering.class) {
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

        public Events getEvents() {
            Events events = this.events_;
            return events == null ? Events.getDefaultInstance() : events;
        }

        public c getRequiredSubmissionData(int i11) {
            c cVarForNumber = c.forNumber(this.requiredSubmissionData_.getInt(i11));
            return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
        }

        public int getRequiredSubmissionDataCount() {
            return this.requiredSubmissionData_.size();
        }

        public List<c> getRequiredSubmissionDataList() {
            return new Internal.ListAdapter(this.requiredSubmissionData_, requiredSubmissionData_converter_);
        }

        public int getRequiredSubmissionDataValue(int i11) {
            return this.requiredSubmissionData_.getInt(i11);
        }

        public List<Integer> getRequiredSubmissionDataValueList() {
            return this.requiredSubmissionData_;
        }

        public boolean getWaitForTdDataCollection() {
            return this.waitForTdDataCollection_;
        }

        public boolean hasEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public static b newBuilder(Rendering rendering) {
            return DEFAULT_INSTANCE.createBuilder(rendering);
        }

        public static Rendering parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Rendering parseFrom(ByteString byteString) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Rendering parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Rendering parseFrom(byte[] bArr) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rendering parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Rendering parseFrom(InputStream inputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rendering parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rendering parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Rendering) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<ClientSubmissionPaneOuterClass$ClientSubmissionPane, a> implements MessageLiteOrBuilder {
        public a() {
            super(ClientSubmissionPaneOuterClass$ClientSubmissionPane.DEFAULT_INSTANCE);
        }
    }

    static {
        ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane = new ClientSubmissionPaneOuterClass$ClientSubmissionPane();
        DEFAULT_INSTANCE = clientSubmissionPaneOuterClass$ClientSubmissionPane;
        GeneratedMessageLite.registerDefaultInstance(ClientSubmissionPaneOuterClass$ClientSubmissionPane.class, clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    private ClientSubmissionPaneOuterClass$ClientSubmissionPane() {
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(InputStream inputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteBuffer byteBuffer) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4375i.f47463a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientSubmissionPaneOuterClass$ClientSubmissionPane();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientSubmissionPaneOuterClass$ClientSubmissionPane> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientSubmissionPaneOuterClass$ClientSubmissionPane.class) {
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

    public static a newBuilder(ClientSubmissionPaneOuterClass$ClientSubmissionPane clientSubmissionPaneOuterClass$ClientSubmissionPane) {
        return DEFAULT_INSTANCE.createBuilder(clientSubmissionPaneOuterClass$ClientSubmissionPane);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteString byteString) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(InputStream inputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(CodedInputStream codedInputStream) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSubmissionPaneOuterClass$ClientSubmissionPane parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientSubmissionPaneOuterClass$ClientSubmissionPane) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
