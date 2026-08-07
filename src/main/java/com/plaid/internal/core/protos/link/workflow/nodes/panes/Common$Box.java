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
public final class Common$Box extends GeneratedMessageLite<Common$Box, d> implements MessageLiteOrBuilder {
    public static final int AS_FIELD_NUMBER = 7;
    public static final int BORDER_BOTTOM_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_FIELD_NUMBER = 8;
    public static final int BORDER_LEFT_FIELD_NUMBER = 5;
    public static final int BORDER_RIGHT_FIELD_NUMBER = 3;
    public static final int BORDER_TOP_FIELD_NUMBER = 2;
    public static final int COMPONENTS_FIELD_NUMBER = 1;
    private static final Common$Box DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 6;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_BEHAVIOR_FIELD_NUMBER = 11;
    public static final int JUSTIFY_CONTENT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$Box> PARSER;
    private int as_;
    private int borderBottom_;
    private int borderColor_;
    private int borderLeft_;
    private int borderRight_;
    private int borderTop_;
    private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
    private int display_;
    private int flexDirection_;
    private int heightBehavior_;
    private int justifyContent_;

    public enum a implements Internal.EnumLite {
        AS_DIV(0),
        AS_SPAN(1),
        UNRECOGNIZED(-1);

        public static final int AS_DIV_VALUE = 0;
        public static final int AS_SPAN_VALUE = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0735a f47113b = new C0735a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47115a;

        /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a$a, reason: collision with other inner class name */
        public class C0735a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return a.forNumber(i11);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47116a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return a.forNumber(i11) != null;
            }
        }

        a(int i11) {
            this.f47115a = i11;
        }

        public static a forNumber(int i11) {
            if (i11 == 0) {
                return AS_DIV;
            }
            if (i11 != 1) {
                return null;
            }
            return AS_SPAN;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f47113b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47116a;
        }

        @Deprecated
        public static a valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47115a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum b implements Internal.EnumLite {
        BORDER_NONE(0),
        BORDER_STANDARD(1),
        UNRECOGNIZED(-1);

        public static final int BORDER_NONE_VALUE = 0;
        public static final int BORDER_STANDARD_VALUE = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47117b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47119a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return b.forNumber(i11);
            }
        }

        /* JADX INFO: renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b$b, reason: collision with other inner class name */
        public static final class C0736b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0736b f47120a = new C0736b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return b.forNumber(i11) != null;
            }
        }

        b(int i11) {
            this.f47119a = i11;
        }

        public static b forNumber(int i11) {
            if (i11 == 0) {
                return BORDER_NONE;
            }
            if (i11 != 1) {
                return null;
            }
            return BORDER_STANDARD;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f47117b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0736b.f47120a;
        }

        @Deprecated
        public static b valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47119a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum c implements Internal.EnumLite {
        BORDER_COLOR_CONTRAST_DEFAULT(0),
        BORDER_COLOR_CONTRAST_LOW(1),
        BORDER_COLOR_CONTRAST_HIGH(2),
        BORDER_COLOR_STATE_DEFAULT(3),
        BORDER_COLOR_STATE_ERROR(4),
        BORDER_COLOR_STATE_INFO(5),
        BORDER_COLOR_STATE_SUCCESS(6),
        BORDER_COLOR_STATE_WARNING(7),
        BORDER_COLOR_STATUS_DEFAULT(8),
        BORDER_COLOR_STATUS_ERROR(9),
        BORDER_COLOR_STATUS_INFO(10),
        BORDER_COLOR_STATUS_SUCCESS(11),
        BORDER_COLOR_STATUS_WARNING(12),
        UNRECOGNIZED(-1);

        public static final int BORDER_COLOR_CONTRAST_DEFAULT_VALUE = 0;
        public static final int BORDER_COLOR_CONTRAST_HIGH_VALUE = 2;
        public static final int BORDER_COLOR_CONTRAST_LOW_VALUE = 1;
        public static final int BORDER_COLOR_STATE_DEFAULT_VALUE = 3;
        public static final int BORDER_COLOR_STATE_ERROR_VALUE = 4;
        public static final int BORDER_COLOR_STATE_INFO_VALUE = 5;
        public static final int BORDER_COLOR_STATE_SUCCESS_VALUE = 6;
        public static final int BORDER_COLOR_STATE_WARNING_VALUE = 7;
        public static final int BORDER_COLOR_STATUS_DEFAULT_VALUE = 8;
        public static final int BORDER_COLOR_STATUS_ERROR_VALUE = 9;
        public static final int BORDER_COLOR_STATUS_INFO_VALUE = 10;
        public static final int BORDER_COLOR_STATUS_SUCCESS_VALUE = 11;
        public static final int BORDER_COLOR_STATUS_WARNING_VALUE = 12;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47121b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47123a;

        public class a implements Internal.EnumLiteMap<c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return c.forNumber(i11);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47124a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return c.forNumber(i11) != null;
            }
        }

        c(int i11) {
            this.f47123a = i11;
        }

        public static c forNumber(int i11) {
            switch (i11) {
                case 0:
                    return BORDER_COLOR_CONTRAST_DEFAULT;
                case 1:
                    return BORDER_COLOR_CONTRAST_LOW;
                case 2:
                    return BORDER_COLOR_CONTRAST_HIGH;
                case 3:
                    return BORDER_COLOR_STATE_DEFAULT;
                case 4:
                    return BORDER_COLOR_STATE_ERROR;
                case 5:
                    return BORDER_COLOR_STATE_INFO;
                case 6:
                    return BORDER_COLOR_STATE_SUCCESS;
                case 7:
                    return BORDER_COLOR_STATE_WARNING;
                case 8:
                    return BORDER_COLOR_STATUS_DEFAULT;
                case 9:
                    return BORDER_COLOR_STATUS_ERROR;
                case 10:
                    return BORDER_COLOR_STATUS_INFO;
                case 11:
                    return BORDER_COLOR_STATUS_SUCCESS;
                case 12:
                    return BORDER_COLOR_STATUS_WARNING;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<c> internalGetValueMap() {
            return f47121b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47124a;
        }

        @Deprecated
        public static c valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47123a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class d extends GeneratedMessageLite.Builder<Common$Box, d> implements MessageLiteOrBuilder {
        public d() {
            super(Common$Box.DEFAULT_INSTANCE);
        }
    }

    public enum e implements Internal.EnumLite {
        DISPLAY_INLINE(0),
        DISPLAY_BLOCK(1),
        DISPLAY_INLINE_BLOCK(2),
        DISPLAY_FLEX(3),
        DISPLAY_INLINE_FLEX(4),
        DISPLAY_GRID(5),
        DISPLAY_INLINE_GRID(6),
        UNRECOGNIZED(-1);

        public static final int DISPLAY_BLOCK_VALUE = 1;
        public static final int DISPLAY_FLEX_VALUE = 3;
        public static final int DISPLAY_GRID_VALUE = 5;
        public static final int DISPLAY_INLINE_BLOCK_VALUE = 2;
        public static final int DISPLAY_INLINE_FLEX_VALUE = 4;
        public static final int DISPLAY_INLINE_GRID_VALUE = 6;
        public static final int DISPLAY_INLINE_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47125b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47127a;

        public class a implements Internal.EnumLiteMap<e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return e.forNumber(i11);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47128a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return e.forNumber(i11) != null;
            }
        }

        e(int i11) {
            this.f47127a = i11;
        }

        public static e forNumber(int i11) {
            switch (i11) {
                case 0:
                    return DISPLAY_INLINE;
                case 1:
                    return DISPLAY_BLOCK;
                case 2:
                    return DISPLAY_INLINE_BLOCK;
                case 3:
                    return DISPLAY_FLEX;
                case 4:
                    return DISPLAY_INLINE_FLEX;
                case 5:
                    return DISPLAY_GRID;
                case 6:
                    return DISPLAY_INLINE_GRID;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<e> internalGetValueMap() {
            return f47125b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47128a;
        }

        @Deprecated
        public static e valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47127a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum f implements Internal.EnumLite {
        HEIGHT_BEHAVIOR_DEFAULT(0),
        HEIGHT_BEHAVIOR_100_PERCENT(1),
        UNRECOGNIZED(-1);

        public static final int HEIGHT_BEHAVIOR_100_PERCENT_VALUE = 1;
        public static final int HEIGHT_BEHAVIOR_DEFAULT_VALUE = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47129b = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47131a;

        public class a implements Internal.EnumLiteMap<f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i11) {
                return f.forNumber(i11);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f47132a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i11) {
                return f.forNumber(i11) != null;
            }
        }

        f(int i11) {
            this.f47131a = i11;
        }

        public static f forNumber(int i11) {
            if (i11 == 0) {
                return HEIGHT_BEHAVIOR_DEFAULT;
            }
            if (i11 != 1) {
                return null;
            }
            return HEIGHT_BEHAVIOR_100_PERCENT;
        }

        public static Internal.EnumLiteMap<f> internalGetValueMap() {
            return f47129b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f47132a;
        }

        @Deprecated
        public static f valueOf(int i11) {
            return forNumber(i11);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f47131a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$Box common$Box = new Common$Box();
        DEFAULT_INSTANCE = common$Box;
        GeneratedMessageLite.registerDefaultInstance(Common$Box.class, common$Box);
    }

    private Common$Box() {
    }

    private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureComponentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
    }

    private void addComponents(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(i11, common$FlexibleComponent);
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearBorderBottom() {
        this.borderBottom_ = 0;
    }

    private void clearBorderColor() {
        this.borderColor_ = 0;
    }

    private void clearBorderLeft() {
        this.borderLeft_ = 0;
    }

    private void clearBorderRight() {
        this.borderRight_ = 0;
    }

    private void clearBorderTop() {
        this.borderTop_ = 0;
    }

    private void clearComponents() {
        this.components_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisplay() {
        this.display_ = 0;
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void clearHeightBehavior() {
        this.heightBehavior_ = 0;
    }

    private void clearJustifyContent() {
        this.justifyContent_ = 0;
    }

    private void ensureComponentsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Box getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(ByteString byteString) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Box> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeComponents(int i11) {
        ensureComponentsIsMutable();
        this.components_.remove(i11);
    }

    private void setAs(a aVar) {
        this.as_ = aVar.getNumber();
    }

    private void setAsValue(int i11) {
        this.as_ = i11;
    }

    private void setBorderBottom(b bVar) {
        this.borderBottom_ = bVar.getNumber();
    }

    private void setBorderBottomValue(int i11) {
        this.borderBottom_ = i11;
    }

    private void setBorderColor(c cVar) {
        this.borderColor_ = cVar.getNumber();
    }

    private void setBorderColorValue(int i11) {
        this.borderColor_ = i11;
    }

    private void setBorderLeft(b bVar) {
        this.borderLeft_ = bVar.getNumber();
    }

    private void setBorderLeftValue(int i11) {
        this.borderLeft_ = i11;
    }

    private void setBorderRight(b bVar) {
        this.borderRight_ = bVar.getNumber();
    }

    private void setBorderRightValue(int i11) {
        this.borderRight_ = i11;
    }

    private void setBorderTop(b bVar) {
        this.borderTop_ = bVar.getNumber();
    }

    private void setBorderTopValue(int i11) {
        this.borderTop_ = i11;
    }

    private void setComponents(int i11, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.set(i11, common$FlexibleComponent);
    }

    private void setDisplay(e eVar) {
        this.display_ = eVar.getNumber();
    }

    private void setDisplayValue(int i11) {
        this.display_ = i11;
    }

    private void setFlexDirection(EnumC4386u enumC4386u) {
        this.flexDirection_ = enumC4386u.getNumber();
    }

    private void setFlexDirectionValue(int i11) {
        this.flexDirection_ = i11;
    }

    private void setHeightBehavior(f fVar) {
        this.heightBehavior_ = fVar.getNumber();
    }

    private void setHeightBehaviorValue(int i11) {
        this.heightBehavior_ = i11;
    }

    private void setJustifyContent(EnumC4384s enumC4384s) {
        this.justifyContent_ = enumC4384s.getNumber();
    }

    private void setJustifyContentValue(int i11) {
        this.justifyContent_ = i11;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C4376j.f47465a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Box();
            case 2:
                return new d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\f\b\f\t\f\n\f\u000b\f", new Object[]{"components_", Common$FlexibleComponent.class, "borderTop_", "borderRight_", "borderBottom_", "borderLeft_", "display_", "as_", "borderColor_", "justifyContent_", "flexDirection_", "heightBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Box> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Box.class) {
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

    public a getAs() {
        a aVarForNumber = a.forNumber(this.as_);
        return aVarForNumber == null ? a.UNRECOGNIZED : aVarForNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public b getBorderBottom() {
        b bVarForNumber = b.forNumber(this.borderBottom_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getBorderBottomValue() {
        return this.borderBottom_;
    }

    public c getBorderColor() {
        c cVarForNumber = c.forNumber(this.borderColor_);
        return cVarForNumber == null ? c.UNRECOGNIZED : cVarForNumber;
    }

    public int getBorderColorValue() {
        return this.borderColor_;
    }

    public b getBorderLeft() {
        b bVarForNumber = b.forNumber(this.borderLeft_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getBorderLeftValue() {
        return this.borderLeft_;
    }

    public b getBorderRight() {
        b bVarForNumber = b.forNumber(this.borderRight_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getBorderRightValue() {
        return this.borderRight_;
    }

    public b getBorderTop() {
        b bVarForNumber = b.forNumber(this.borderTop_);
        return bVarForNumber == null ? b.UNRECOGNIZED : bVarForNumber;
    }

    public int getBorderTopValue() {
        return this.borderTop_;
    }

    public Common$FlexibleComponent getComponents(int i11) {
        return this.components_.get(i11);
    }

    public int getComponentsCount() {
        return this.components_.size();
    }

    public List<Common$FlexibleComponent> getComponentsList() {
        return this.components_;
    }

    public InterfaceC4388w getComponentsOrBuilder(int i11) {
        return this.components_.get(i11);
    }

    public List<? extends InterfaceC4388w> getComponentsOrBuilderList() {
        return this.components_;
    }

    public e getDisplay() {
        e eVarForNumber = e.forNumber(this.display_);
        return eVarForNumber == null ? e.UNRECOGNIZED : eVarForNumber;
    }

    public int getDisplayValue() {
        return this.display_;
    }

    public EnumC4386u getFlexDirection() {
        EnumC4386u enumC4386uForNumber = EnumC4386u.forNumber(this.flexDirection_);
        return enumC4386uForNumber == null ? EnumC4386u.UNRECOGNIZED : enumC4386uForNumber;
    }

    public int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public f getHeightBehavior() {
        f fVarForNumber = f.forNumber(this.heightBehavior_);
        return fVarForNumber == null ? f.UNRECOGNIZED : fVarForNumber;
    }

    public int getHeightBehaviorValue() {
        return this.heightBehavior_;
    }

    public EnumC4384s getJustifyContent() {
        EnumC4384s enumC4384sForNumber = EnumC4384s.forNumber(this.justifyContent_);
        return enumC4384sForNumber == null ? EnumC4384s.UNRECOGNIZED : enumC4384sForNumber;
    }

    public int getJustifyContentValue() {
        return this.justifyContent_;
    }

    private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(common$FlexibleComponent);
    }

    public static d newBuilder(Common$Box common$Box) {
        return DEFAULT_INSTANCE.createBuilder(common$Box);
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Box parseFrom(byte[] bArr) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Box parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
