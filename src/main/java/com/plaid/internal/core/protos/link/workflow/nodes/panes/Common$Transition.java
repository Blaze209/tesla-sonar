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
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Common$Transition extends GeneratedMessageLite<Common$Transition, a> implements MessageLiteOrBuilder {
    public static final int DEFAULT_FIELD_NUMBER = 1;
    private static final Common$Transition DEFAULT_INSTANCE;
    public static final int DYNAMIC_INPUTS_FIELD_NUMBER = 6;
    public static final int FADE_OUT_WITH_SPINNER_FIELD_NUMBER = 5;
    public static final int NONE_FIELD_NUMBER = 4;
    public static final int PANE_CONTROLLED_FIELD_NUMBER = 7;
    private static volatile Parser<Common$Transition> PARSER = null;
    public static final int SPINNER_FIELD_NUMBER = 3;
    private int styleCase_ = 0;
    private Object style_;

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
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
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

    public static final class DynamicInputs extends GeneratedMessageLite<DynamicInputs, a> implements MessageLiteOrBuilder {
        public static final int BUTTON_CUSTOMIZATIONS_FIELD_NUMBER = 5;
        public static final int BUTTON_PLACEMENT_FIELD_NUMBER = 3;
        private static final DynamicInputs DEFAULT_INSTANCE;
        public static final int DISPLAY_CHECK_MARKS_FIELD_NUMBER = 2;
        public static final int PANE_TRANSITION_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile Parser<DynamicInputs> PARSER = null;
        public static final int STEPPED_TRANSITION_TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private ButtonCustomizations buttonCustomizations_;
        private int buttonPlacement_;
        private boolean displayCheckMarks_;
        private long paneTransitionTimeoutMs_;
        private Common$SteppedTransitionText steppedTransitionText_;

        public static final class ButtonCustomizations extends GeneratedMessageLite<ButtonCustomizations, a> implements MessageLiteOrBuilder {
            public static final int BORDER_RADIUS_FIELD_NUMBER = 1;
            private static final ButtonCustomizations DEFAULT_INSTANCE;
            private static volatile Parser<ButtonCustomizations> PARSER;
            private int bitField0_;
            private BorderRadius borderRadius_;

            public static final class BorderRadius extends GeneratedMessageLite<BorderRadius, a> implements MessageLiteOrBuilder {
                private static final BorderRadius DEFAULT_INSTANCE;
                private static volatile Parser<BorderRadius> PARSER = null;
                public static final int SIZE_FIELD_NUMBER = 1;
                private int size_;

                public static final class a extends GeneratedMessageLite.Builder<BorderRadius, a> implements MessageLiteOrBuilder {
                    public a() {
                        super(BorderRadius.DEFAULT_INSTANCE);
                    }
                }

                static {
                    BorderRadius borderRadius = new BorderRadius();
                    DEFAULT_INSTANCE = borderRadius;
                    GeneratedMessageLite.registerDefaultInstance(BorderRadius.class, borderRadius);
                }

                private BorderRadius() {
                }

                private void clearSize() {
                    this.size_ = 0;
                }

                public static BorderRadius getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static a newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static BorderRadius parseDelimitedFrom(InputStream inputStream) {
                    return (BorderRadius) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BorderRadius parseFrom(ByteBuffer byteBuffer) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<BorderRadius> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                private void setSize(int i11) {
                    this.size_ = i11;
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new BorderRadius();
                        case 2:
                            return new a();
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"size_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<BorderRadius> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (BorderRadius.class) {
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

                public int getSize() {
                    return this.size_;
                }

                public static a newBuilder(BorderRadius borderRadius) {
                    return DEFAULT_INSTANCE.createBuilder(borderRadius);
                }

                public static BorderRadius parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BorderRadius parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static BorderRadius parseFrom(ByteString byteString) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static BorderRadius parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static BorderRadius parseFrom(byte[] bArr) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static BorderRadius parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static BorderRadius parseFrom(InputStream inputStream) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BorderRadius parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static BorderRadius parseFrom(CodedInputStream codedInputStream) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static BorderRadius parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    return (BorderRadius) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            public static final class a extends GeneratedMessageLite.Builder<ButtonCustomizations, a> implements MessageLiteOrBuilder {
                public a() {
                    super(ButtonCustomizations.DEFAULT_INSTANCE);
                }
            }

            static {
                ButtonCustomizations buttonCustomizations = new ButtonCustomizations();
                DEFAULT_INSTANCE = buttonCustomizations;
                GeneratedMessageLite.registerDefaultInstance(ButtonCustomizations.class, buttonCustomizations);
            }

            private ButtonCustomizations() {
            }

            private void clearBorderRadius() {
                this.borderRadius_ = null;
                this.bitField0_ &= -2;
            }

            public static ButtonCustomizations getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeBorderRadius(BorderRadius borderRadius) {
                borderRadius.getClass();
                BorderRadius borderRadius2 = this.borderRadius_;
                if (borderRadius2 == null || borderRadius2 == BorderRadius.getDefaultInstance()) {
                    this.borderRadius_ = borderRadius;
                } else {
                    this.borderRadius_ = BorderRadius.newBuilder(this.borderRadius_).mergeFrom(borderRadius).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static ButtonCustomizations parseDelimitedFrom(InputStream inputStream) {
                return (ButtonCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonCustomizations parseFrom(ByteBuffer byteBuffer) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ButtonCustomizations> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBorderRadius(BorderRadius borderRadius) {
                borderRadius.getClass();
                this.borderRadius_ = borderRadius;
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ButtonCustomizations();
                    case 2:
                        return new a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "borderRadius_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ButtonCustomizations> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (ButtonCustomizations.class) {
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

            public BorderRadius getBorderRadius() {
                BorderRadius borderRadius = this.borderRadius_;
                return borderRadius == null ? BorderRadius.getDefaultInstance() : borderRadius;
            }

            public boolean hasBorderRadius() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a newBuilder(ButtonCustomizations buttonCustomizations) {
                return DEFAULT_INSTANCE.createBuilder(buttonCustomizations);
            }

            public static ButtonCustomizations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonCustomizations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ButtonCustomizations parseFrom(ByteString byteString) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ButtonCustomizations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ButtonCustomizations parseFrom(byte[] bArr) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ButtonCustomizations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ButtonCustomizations parseFrom(InputStream inputStream) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ButtonCustomizations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ButtonCustomizations parseFrom(CodedInputStream codedInputStream) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ButtonCustomizations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ButtonCustomizations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<DynamicInputs, a> implements MessageLiteOrBuilder {
            public a() {
                super(DynamicInputs.DEFAULT_INSTANCE);
            }
        }

        static {
            DynamicInputs dynamicInputs = new DynamicInputs();
            DEFAULT_INSTANCE = dynamicInputs;
            GeneratedMessageLite.registerDefaultInstance(DynamicInputs.class, dynamicInputs);
        }

        private DynamicInputs() {
        }

        private void clearButtonCustomizations() {
            this.buttonCustomizations_ = null;
            this.bitField0_ &= -3;
        }

        private void clearButtonPlacement() {
            this.buttonPlacement_ = 0;
        }

        private void clearDisplayCheckMarks() {
            this.displayCheckMarks_ = false;
        }

        private void clearPaneTransitionTimeoutMs() {
            this.paneTransitionTimeoutMs_ = 0L;
        }

        private void clearSteppedTransitionText() {
            this.steppedTransitionText_ = null;
            this.bitField0_ &= -2;
        }

        public static DynamicInputs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeButtonCustomizations(ButtonCustomizations buttonCustomizations) {
            buttonCustomizations.getClass();
            ButtonCustomizations buttonCustomizations2 = this.buttonCustomizations_;
            if (buttonCustomizations2 == null || buttonCustomizations2 == ButtonCustomizations.getDefaultInstance()) {
                this.buttonCustomizations_ = buttonCustomizations;
            } else {
                this.buttonCustomizations_ = ButtonCustomizations.newBuilder(this.buttonCustomizations_).mergeFrom(buttonCustomizations).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeSteppedTransitionText(Common$SteppedTransitionText common$SteppedTransitionText) {
            common$SteppedTransitionText.getClass();
            Common$SteppedTransitionText common$SteppedTransitionText2 = this.steppedTransitionText_;
            if (common$SteppedTransitionText2 == null || common$SteppedTransitionText2 == Common$SteppedTransitionText.getDefaultInstance()) {
                this.steppedTransitionText_ = common$SteppedTransitionText;
            } else {
                this.steppedTransitionText_ = Common$SteppedTransitionText.newBuilder(this.steppedTransitionText_).mergeFrom(common$SteppedTransitionText).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicInputs parseDelimitedFrom(InputStream inputStream) {
            return (DynamicInputs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicInputs parseFrom(ByteBuffer byteBuffer) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DynamicInputs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setButtonCustomizations(ButtonCustomizations buttonCustomizations) {
            buttonCustomizations.getClass();
            this.buttonCustomizations_ = buttonCustomizations;
            this.bitField0_ |= 2;
        }

        private void setButtonPlacement(EnumC4382p enumC4382p) {
            this.buttonPlacement_ = enumC4382p.getNumber();
        }

        private void setButtonPlacementValue(int i11) {
            this.buttonPlacement_ = i11;
        }

        private void setDisplayCheckMarks(boolean z11) {
            this.displayCheckMarks_ = z11;
        }

        private void setPaneTransitionTimeoutMs(long j11) {
            this.paneTransitionTimeoutMs_ = j11;
        }

        private void setSteppedTransitionText(Common$SteppedTransitionText common$SteppedTransitionText) {
            common$SteppedTransitionText.getClass();
            this.steppedTransitionText_ = common$SteppedTransitionText;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DynamicInputs();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\f\u0004\u0003\u0005ဉ\u0001", new Object[]{"bitField0_", "steppedTransitionText_", "displayCheckMarks_", "buttonPlacement_", "paneTransitionTimeoutMs_", "buttonCustomizations_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DynamicInputs> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (DynamicInputs.class) {
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

        public ButtonCustomizations getButtonCustomizations() {
            ButtonCustomizations buttonCustomizations = this.buttonCustomizations_;
            return buttonCustomizations == null ? ButtonCustomizations.getDefaultInstance() : buttonCustomizations;
        }

        public EnumC4382p getButtonPlacement() {
            EnumC4382p enumC4382pForNumber = EnumC4382p.forNumber(this.buttonPlacement_);
            return enumC4382pForNumber == null ? EnumC4382p.UNRECOGNIZED : enumC4382pForNumber;
        }

        public int getButtonPlacementValue() {
            return this.buttonPlacement_;
        }

        public boolean getDisplayCheckMarks() {
            return this.displayCheckMarks_;
        }

        public long getPaneTransitionTimeoutMs() {
            return this.paneTransitionTimeoutMs_;
        }

        public Common$SteppedTransitionText getSteppedTransitionText() {
            Common$SteppedTransitionText common$SteppedTransitionText = this.steppedTransitionText_;
            return common$SteppedTransitionText == null ? Common$SteppedTransitionText.getDefaultInstance() : common$SteppedTransitionText;
        }

        public boolean hasButtonCustomizations() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSteppedTransitionText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(DynamicInputs dynamicInputs) {
            return DEFAULT_INSTANCE.createBuilder(dynamicInputs);
        }

        public static DynamicInputs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicInputs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DynamicInputs parseFrom(ByteString byteString) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DynamicInputs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DynamicInputs parseFrom(byte[] bArr) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicInputs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DynamicInputs parseFrom(InputStream inputStream) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicInputs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DynamicInputs parseFrom(CodedInputStream codedInputStream) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DynamicInputs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DynamicInputs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FadeOutWithSpinner extends GeneratedMessageLite<FadeOutWithSpinner, a> implements MessageLiteOrBuilder {
        private static final FadeOutWithSpinner DEFAULT_INSTANCE;
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static volatile Parser<FadeOutWithSpinner> PARSER;
        private Internal.ProtobufList<Common$LocalizedString> messages_ = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.Builder<FadeOutWithSpinner, a> implements MessageLiteOrBuilder {
            public a() {
                super(FadeOutWithSpinner.DEFAULT_INSTANCE);
            }
        }

        static {
            FadeOutWithSpinner fadeOutWithSpinner = new FadeOutWithSpinner();
            DEFAULT_INSTANCE = fadeOutWithSpinner;
            GeneratedMessageLite.registerDefaultInstance(FadeOutWithSpinner.class, fadeOutWithSpinner);
        }

        private FadeOutWithSpinner() {
        }

        private void addAllMessages(Iterable<? extends Common$LocalizedString> iterable) {
            ensureMessagesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
        }

        private void addMessages(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(common$LocalizedString);
        }

        private void clearMessages() {
            this.messages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureMessagesIsMutable() {
            Internal.ProtobufList<Common$LocalizedString> protobufList = this.messages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.messages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static FadeOutWithSpinner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FadeOutWithSpinner parseDelimitedFrom(InputStream inputStream) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FadeOutWithSpinner parseFrom(ByteBuffer byteBuffer) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FadeOutWithSpinner> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMessages(int i11) {
            ensureMessagesIsMutable();
            this.messages_.remove(i11);
        }

        private void setMessages(int i11, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.set(i11, common$LocalizedString);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FadeOutWithSpinner();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"messages_", Common$LocalizedString.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FadeOutWithSpinner> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FadeOutWithSpinner.class) {
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

        public Common$LocalizedString getMessages(int i11) {
            return this.messages_.get(i11);
        }

        public int getMessagesCount() {
            return this.messages_.size();
        }

        public List<Common$LocalizedString> getMessagesList() {
            return this.messages_;
        }

        public C getMessagesOrBuilder(int i11) {
            return this.messages_.get(i11);
        }

        public List<? extends C> getMessagesOrBuilderList() {
            return this.messages_;
        }

        public static a newBuilder(FadeOutWithSpinner fadeOutWithSpinner) {
            return DEFAULT_INSTANCE.createBuilder(fadeOutWithSpinner);
        }

        public static FadeOutWithSpinner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FadeOutWithSpinner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FadeOutWithSpinner parseFrom(ByteString byteString) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addMessages(int i11, Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            ensureMessagesIsMutable();
            this.messages_.add(i11, common$LocalizedString);
        }

        public static FadeOutWithSpinner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FadeOutWithSpinner parseFrom(byte[] bArr) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FadeOutWithSpinner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FadeOutWithSpinner parseFrom(InputStream inputStream) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FadeOutWithSpinner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FadeOutWithSpinner parseFrom(CodedInputStream codedInputStream) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FadeOutWithSpinner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FadeOutWithSpinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class None extends GeneratedMessageLite<None, a> implements MessageLiteOrBuilder {
        private static final None DEFAULT_INSTANCE;
        public static final int PANE_TRANSITION_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile Parser<None> PARSER;
        private long paneTransitionTimeoutMs_;

        public static final class a extends GeneratedMessageLite.Builder<None, a> implements MessageLiteOrBuilder {
            public a() {
                super(None.DEFAULT_INSTANCE);
            }
        }

        static {
            None none = new None();
            DEFAULT_INSTANCE = none;
            GeneratedMessageLite.registerDefaultInstance(None.class, none);
        }

        private None() {
        }

        private void clearPaneTransitionTimeoutMs() {
            this.paneTransitionTimeoutMs_ = 0L;
        }

        public static None getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static None parseDelimitedFrom(InputStream inputStream) {
            return (None) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static None parseFrom(ByteBuffer byteBuffer) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<None> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneTransitionTimeoutMs(long j11) {
            this.paneTransitionTimeoutMs_ = j11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new None();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"paneTransitionTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<None> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (None.class) {
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

        public long getPaneTransitionTimeoutMs() {
            return this.paneTransitionTimeoutMs_;
        }

        public static a newBuilder(None none) {
            return DEFAULT_INSTANCE.createBuilder(none);
        }

        public static None parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static None parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static None parseFrom(ByteString byteString) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static None parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static None parseFrom(byte[] bArr) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static None parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static None parseFrom(InputStream inputStream) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static None parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static None parseFrom(CodedInputStream codedInputStream) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static None parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (None) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PaneControlled extends GeneratedMessageLite<PaneControlled, a> implements MessageLiteOrBuilder {
        private static final PaneControlled DEFAULT_INSTANCE;
        private static volatile Parser<PaneControlled> PARSER;

        public static final class a extends GeneratedMessageLite.Builder<PaneControlled, a> implements MessageLiteOrBuilder {
            public a() {
                super(PaneControlled.DEFAULT_INSTANCE);
            }
        }

        static {
            PaneControlled paneControlled = new PaneControlled();
            DEFAULT_INSTANCE = paneControlled;
            GeneratedMessageLite.registerDefaultInstance(PaneControlled.class, paneControlled);
        }

        private PaneControlled() {
        }

        public static PaneControlled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PaneControlled parseDelimitedFrom(InputStream inputStream) {
            return (PaneControlled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneControlled parseFrom(ByteBuffer byteBuffer) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PaneControlled> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PaneControlled();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PaneControlled> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PaneControlled.class) {
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

        public static a newBuilder(PaneControlled paneControlled) {
            return DEFAULT_INSTANCE.createBuilder(paneControlled);
        }

        public static PaneControlled parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneControlled parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PaneControlled parseFrom(ByteString byteString) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PaneControlled parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PaneControlled parseFrom(byte[] bArr) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PaneControlled parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PaneControlled parseFrom(InputStream inputStream) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PaneControlled parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PaneControlled parseFrom(CodedInputStream codedInputStream) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PaneControlled parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaneControlled) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Spinner extends GeneratedMessageLite<Spinner, a> implements MessageLiteOrBuilder {
        private static final Spinner DEFAULT_INSTANCE;
        public static final int HIDE_FAIRY_BITS_FIELD_NUMBER = 1;
        private static volatile Parser<Spinner> PARSER;
        private boolean hideFairyBits_;

        public static final class a extends GeneratedMessageLite.Builder<Spinner, a> implements MessageLiteOrBuilder {
            public a() {
                super(Spinner.DEFAULT_INSTANCE);
            }
        }

        static {
            Spinner spinner = new Spinner();
            DEFAULT_INSTANCE = spinner;
            GeneratedMessageLite.registerDefaultInstance(Spinner.class, spinner);
        }

        private Spinner() {
        }

        private void clearHideFairyBits() {
            this.hideFairyBits_ = false;
        }

        public static Spinner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Spinner parseDelimitedFrom(InputStream inputStream) {
            return (Spinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Spinner parseFrom(ByteBuffer byteBuffer) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Spinner> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setHideFairyBits(boolean z11) {
            this.hideFairyBits_ = z11;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Spinner();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"hideFairyBits_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Spinner> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Spinner.class) {
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

        public boolean getHideFairyBits() {
            return this.hideFairyBits_;
        }

        public static a newBuilder(Spinner spinner) {
            return DEFAULT_INSTANCE.createBuilder(spinner);
        }

        public static Spinner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Spinner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Spinner parseFrom(ByteString byteString) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Spinner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Spinner parseFrom(byte[] bArr) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Spinner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Spinner parseFrom(InputStream inputStream) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Spinner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Spinner parseFrom(CodedInputStream codedInputStream) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Spinner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Spinner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<Common$Transition, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$Transition.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        DEFAULT(1),
        SPINNER(3),
        NONE(4),
        FADE_OUT_WITH_SPINNER(5),
        DYNAMIC_INPUTS(6),
        PANE_CONTROLLED(7),
        STYLE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47233a;

        b(int i11) {
            this.f47233a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return STYLE_NOT_SET;
            }
            if (i11 == 1) {
                return DEFAULT;
            }
            if (i11 == 3) {
                return SPINNER;
            }
            if (i11 == 4) {
                return NONE;
            }
            if (i11 == 5) {
                return FADE_OUT_WITH_SPINNER;
            }
            if (i11 == 6) {
                return DYNAMIC_INPUTS;
            }
            if (i11 != 7) {
                return null;
            }
            return PANE_CONTROLLED;
        }

        public int getNumber() {
            return this.f47233a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        Common$Transition common$Transition = new Common$Transition();
        DEFAULT_INSTANCE = common$Transition;
        GeneratedMessageLite.registerDefaultInstance(Common$Transition.class, common$Transition);
    }

    private Common$Transition() {
    }

    private void clearDefault() {
        if (this.styleCase_ == 1) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearDynamicInputs() {
        if (this.styleCase_ == 6) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearFadeOutWithSpinner() {
        if (this.styleCase_ == 5) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearNone() {
        if (this.styleCase_ == 4) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearPaneControlled() {
        if (this.styleCase_ == 7) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearSpinner() {
        if (this.styleCase_ == 3) {
            this.styleCase_ = 0;
            this.style_ = null;
        }
    }

    private void clearStyle() {
        this.styleCase_ = 0;
        this.style_ = null;
    }

    public static Common$Transition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDefault(Default r11) {
        r11.getClass();
        if (this.styleCase_ != 1 || this.style_ == Default.getDefaultInstance()) {
            this.style_ = r11;
        } else {
            this.style_ = Default.newBuilder((Default) this.style_).mergeFrom(r11).buildPartial();
        }
        this.styleCase_ = 1;
    }

    private void mergeDynamicInputs(DynamicInputs dynamicInputs) {
        dynamicInputs.getClass();
        if (this.styleCase_ != 6 || this.style_ == DynamicInputs.getDefaultInstance()) {
            this.style_ = dynamicInputs;
        } else {
            this.style_ = DynamicInputs.newBuilder((DynamicInputs) this.style_).mergeFrom(dynamicInputs).buildPartial();
        }
        this.styleCase_ = 6;
    }

    private void mergeFadeOutWithSpinner(FadeOutWithSpinner fadeOutWithSpinner) {
        fadeOutWithSpinner.getClass();
        if (this.styleCase_ != 5 || this.style_ == FadeOutWithSpinner.getDefaultInstance()) {
            this.style_ = fadeOutWithSpinner;
        } else {
            this.style_ = FadeOutWithSpinner.newBuilder((FadeOutWithSpinner) this.style_).mergeFrom(fadeOutWithSpinner).buildPartial();
        }
        this.styleCase_ = 5;
    }

    private void mergeNone(None none) {
        none.getClass();
        if (this.styleCase_ != 4 || this.style_ == None.getDefaultInstance()) {
            this.style_ = none;
        } else {
            this.style_ = None.newBuilder((None) this.style_).mergeFrom(none).buildPartial();
        }
        this.styleCase_ = 4;
    }

    private void mergePaneControlled(PaneControlled paneControlled) {
        paneControlled.getClass();
        if (this.styleCase_ != 7 || this.style_ == PaneControlled.getDefaultInstance()) {
            this.style_ = paneControlled;
        } else {
            this.style_ = PaneControlled.newBuilder((PaneControlled) this.style_).mergeFrom(paneControlled).buildPartial();
        }
        this.styleCase_ = 7;
    }

    private void mergeSpinner(Spinner spinner) {
        spinner.getClass();
        if (this.styleCase_ != 3 || this.style_ == Spinner.getDefaultInstance()) {
            this.style_ = spinner;
        } else {
            this.style_ = Spinner.newBuilder((Spinner) this.style_).mergeFrom(spinner).buildPartial();
        }
        this.styleCase_ = 3;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Transition parseDelimitedFrom(InputStream inputStream) {
        return (Common$Transition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Transition parseFrom(ByteBuffer byteBuffer) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$Transition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefault(Default r11) {
        r11.getClass();
        this.style_ = r11;
        this.styleCase_ = 1;
    }

    private void setDynamicInputs(DynamicInputs dynamicInputs) {
        dynamicInputs.getClass();
        this.style_ = dynamicInputs;
        this.styleCase_ = 6;
    }

    private void setFadeOutWithSpinner(FadeOutWithSpinner fadeOutWithSpinner) {
        fadeOutWithSpinner.getClass();
        this.style_ = fadeOutWithSpinner;
        this.styleCase_ = 5;
    }

    private void setNone(None none) {
        none.getClass();
        this.style_ = none;
        this.styleCase_ = 4;
    }

    private void setPaneControlled(PaneControlled paneControlled) {
        paneControlled.getClass();
        this.style_ = paneControlled;
        this.styleCase_ = 7;
    }

    private void setSpinner(Spinner spinner) {
        spinner.getClass();
        this.style_ = spinner;
        this.styleCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Transition();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"style_", "styleCase_", Default.class, Spinner.class, None.class, FadeOutWithSpinner.class, DynamicInputs.class, PaneControlled.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Transition> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Transition.class) {
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
        return this.styleCase_ == 1 ? (Default) this.style_ : Default.getDefaultInstance();
    }

    public DynamicInputs getDynamicInputs() {
        return this.styleCase_ == 6 ? (DynamicInputs) this.style_ : DynamicInputs.getDefaultInstance();
    }

    public FadeOutWithSpinner getFadeOutWithSpinner() {
        return this.styleCase_ == 5 ? (FadeOutWithSpinner) this.style_ : FadeOutWithSpinner.getDefaultInstance();
    }

    public None getNone() {
        return this.styleCase_ == 4 ? (None) this.style_ : None.getDefaultInstance();
    }

    public PaneControlled getPaneControlled() {
        return this.styleCase_ == 7 ? (PaneControlled) this.style_ : PaneControlled.getDefaultInstance();
    }

    public Spinner getSpinner() {
        return this.styleCase_ == 3 ? (Spinner) this.style_ : Spinner.getDefaultInstance();
    }

    public b getStyleCase() {
        return b.forNumber(this.styleCase_);
    }

    public boolean hasDefault() {
        return this.styleCase_ == 1;
    }

    public boolean hasDynamicInputs() {
        return this.styleCase_ == 6;
    }

    public boolean hasFadeOutWithSpinner() {
        return this.styleCase_ == 5;
    }

    public boolean hasNone() {
        return this.styleCase_ == 4;
    }

    public boolean hasPaneControlled() {
        return this.styleCase_ == 7;
    }

    public boolean hasSpinner() {
        return this.styleCase_ == 3;
    }

    public static a newBuilder(Common$Transition common$Transition) {
        return DEFAULT_INSTANCE.createBuilder(common$Transition);
    }

    public static Common$Transition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Transition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Transition parseFrom(ByteString byteString) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$Transition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Transition parseFrom(byte[] bArr) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Transition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$Transition parseFrom(InputStream inputStream) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Transition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Transition parseFrom(CodedInputStream codedInputStream) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Transition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Transition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
