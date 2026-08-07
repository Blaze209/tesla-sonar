package p013kotlin.text;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: kotlin.text.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u0014\u0011B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/text/h;", "", "", "upperCase", "Lkotlin/text/h$a;", "bytes", "Lkotlin/text/h$c;", InquiryField.FloatField.TYPE2, "<init>", "(ZLkotlin/text/h$a;Lkotlin/text/h$c;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "Lkotlin/text/h$a;", "()Lkotlin/text/h$a;", "c", "Lkotlin/text/h$c;", "()Lkotlin/text/h$c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HexFormat {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HexFormat f89147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HexFormat f89148f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean upperCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BytesHexFormat bytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NumberHexFormat number;

    /* JADX INFO: renamed from: kotlin.text.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001\u0014B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\"\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010!¨\u0006'"}, d2 = {"Lkotlin/text/h$a;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "I", "g", "()I", "f", "c", "Ljava/lang/String;", "h", DateTokenConverter.CONVERTER_KEY, "e", "", "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "noLineAndGroupSeparator", "j", "shortByteSeparatorNoPrefixAndSuffix", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final BytesHexFormat f89153k = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerLine;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String groupSeparator;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String byteSeparator;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String bytePrefix;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String byteSuffix;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean noLineAndGroupSeparator;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        /* JADX INFO: renamed from: kotlin.text.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/h$a$a;", "", "<init>", "()V", "Lkotlin/text/h$a;", "Default", "Lkotlin/text/h$a;", "a", "()Lkotlin/text/h$a;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BytesHexFormat a() {
                return BytesHexFormat.f89153k;
            }

            private Companion() {
            }
        }

        public BytesHexFormat(int i11, int i12, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            s.k(groupSeparator, "groupSeparator");
            s.k(byteSeparator, "byteSeparator");
            s.k(bytePrefix, "bytePrefix");
            s.k(byteSuffix, "byteSuffix");
            this.bytesPerLine = i11;
            this.bytesPerGroup = i12;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
            this.noLineAndGroupSeparator = i11 == Integer.MAX_VALUE && i12 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.ignoreCase = i.b(groupSeparator) || i.b(byteSeparator) || i.b(bytePrefix) || i.b(byteSuffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            s.k(sb2, "sb");
            s.k(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.bytesPerLine);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.bytesPerGroup);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.groupSeparator);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.byteSeparator);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.bytePrefix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.byteSuffix);
            sb2.append("\"");
            return sb2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getNoLineAndGroupSeparator() {
            return this.noLineAndGroupSeparator;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getShortByteSeparatorNoPrefixAndSuffix() {
            return this.shortByteSeparatorNoPrefixAndSuffix;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/h$b;", "", "<init>", "()V", "Lkotlin/text/h;", "Default", "Lkotlin/text/h;", "a", "()Lkotlin/text/h;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HexFormat a() {
            return HexFormat.f89147e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: kotlin.text.h$c, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 &2\u00020\u0001:\u0001\u0013B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010#\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001a\u0010%\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006'"}, d2 = {"Lkotlin/text/h$c;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "e", "c", "Z", "getRemoveLeadingZeros", "()Z", "I", "getMinLength", "()I", "getMinLength$annotations", "()V", "f", "isDigitsOnly", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "g", "ignoreCase", "h", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final NumberHexFormat f89164i = new NumberHexFormat("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String suffix;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean removeLeadingZeros;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int minLength;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnly;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isDigitsOnlyAndNoPadding;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean ignoreCase;

        /* JADX INFO: renamed from: kotlin.text.h$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/h$c$a;", "", "<init>", "()V", "Lkotlin/text/h$c;", "Default", "Lkotlin/text/h$c;", "a", "()Lkotlin/text/h$c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NumberHexFormat a() {
                return NumberHexFormat.f89164i;
            }

            private Companion() {
            }
        }

        public NumberHexFormat(String prefix, String suffix, boolean z11, int i11) {
            s.k(prefix, "prefix");
            s.k(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z11;
            this.minLength = i11;
            boolean z12 = prefix.length() == 0 && suffix.length() == 0;
            this.isDigitsOnly = z12;
            this.isDigitsOnlyAndNoPadding = z12 && i11 == 1;
            this.ignoreCase = i.b(prefix) || i.b(suffix);
        }

        public final StringBuilder b(StringBuilder sb2, String indent) {
            s.k(sb2, "sb");
            s.k(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.prefix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.suffix);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.removeLeadingZeros);
            sb2.append(CoreConstants.COMMA_CHAR);
            sb2.append('\n');
            sb2.append(indent);
            sb2.append("minLength = ");
            sb2.append(this.minLength);
            return sb2;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsDigitsOnly() {
            return this.isDigitsOnly;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat bytesHexFormatA = companion.a();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f89147e = new HexFormat(false, bytesHexFormatA, companion2.a());
        f89148f = new HexFormat(true, companion.a(), companion2.a());
    }

    public HexFormat(boolean z11, BytesHexFormat bytes, NumberHexFormat number) {
        s.k(bytes, "bytes");
        s.k(number, "number");
        this.upperCase = z11;
        this.bytes = bytes;
        this.number = number;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUpperCase() {
        return this.upperCase;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.upperCase);
        sb2.append(",");
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.bytes.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.number.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
