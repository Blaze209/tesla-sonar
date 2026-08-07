package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a=\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0015\u001a?\u0010\u001b\u001a\u00020\u0000*\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001e\u001a\u00020\u0000*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&\u001a'\u0010+\u001a\u00020)*\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\"\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020 0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010/\" \u0010<\u001a\b\u0012\u0004\u0012\u00020 0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b:\u0010;\"\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107¨\u0006>"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "q", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "p", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "o", "(Ljava/lang/String;Z)Ljava/lang/String;", "l", "n", "", "start", "end", "plusIsSpace", "j", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "h", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "g", "", "prefixEnd", "f", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "u", "(B)Ljava/lang/String;", "", "c2", "e", "(C)I", "digit", "t", "(I)C", "Lll0/k;", "Lkotlin/Function1;", "Ljn0/h0;", "block", "s", "(Lll0/k;Lwn0/l;)V", "", "a", "Ljava/util/Set;", "URL_ALPHABET", "b", "URL_ALPHABET_CHARS", "c", "HEX_ALPHABET", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "URL_PROTOCOL_PART", "VALID_PATH_PART", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "ATTRIBUTE_CHARACTERS", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Byte> f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Character> f17526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<Character> f17527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<Byte> f17528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<Character> f17529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<Character> f17530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<Byte> f17531g;

    /* JADX INFO: renamed from: bl0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    static final class C0352a extends p013kotlin.jvm.internal.u implements wn0.l<Byte, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StringBuilder f17532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f17533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0352a(StringBuilder sb2, boolean z11) {
            super(1);
            this.f17532c = sb2;
            this.f17533d = z11;
        }

        public final void a(byte b11) {
            if (a.f17525a.contains(Byte.valueOf(b11)) || a.f17531g.contains(Byte.valueOf(b11))) {
                this.f17532c.append((char) b11);
            } else if (this.f17533d && b11 == 32) {
                this.f17532c.append('+');
            } else {
                this.f17532c.append(a.u(b11));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Byte b11) {
            a(b11.byteValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Byte, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StringBuilder f17534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StringBuilder sb2) {
            super(1);
            this.f17534c = sb2;
        }

        public final void a(byte b11) {
            this.f17534c.append(a.u(b11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Byte b11) {
            a(b11.byteValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(B)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Byte, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StringBuilder f17536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f17537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, StringBuilder sb2, boolean z12) {
            super(1);
            this.f17535c = z11;
            this.f17536d = sb2;
            this.f17537e = z12;
        }

        public final void a(byte b11) {
            if (b11 == 32) {
                if (this.f17535c) {
                    this.f17536d.append('+');
                    return;
                } else {
                    this.f17536d.append("%20");
                    return;
                }
            }
            if (a.f17525a.contains(Byte.valueOf(b11)) || (!this.f17537e && a.f17528d.contains(Byte.valueOf(b11)))) {
                this.f17536d.append((char) b11);
            } else {
                this.f17536d.append(a.u(b11));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Byte b11) {
            a(b11.byteValue());
            return jn0.h0.f84049a;
        }
    }

    static {
        Character chValueOf = Character.valueOf(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        Character chValueOf2 = Character.valueOf(CoreConstants.LEFT_PARENTHESIS_CHAR);
        Character chValueOf3 = Character.valueOf(CoreConstants.SINGLE_QUOTE_CHAR);
        Character chValueOf4 = Character.valueOf(CoreConstants.COLON_CHAR);
        Character chValueOf5 = Character.valueOf(CoreConstants.DOLLAR);
        Character chValueOf6 = Character.valueOf(CoreConstants.DOT);
        Character chValueOf7 = Character.valueOf(CoreConstants.DASH_CHAR);
        List listP0 = p013kotlin.collections.v.P0(p013kotlin.collections.v.N0(new bo0.c('a', 'z'), new bo0.c('A', 'Z')), new bo0.c('0', '9'));
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f17525a = p013kotlin.collections.v.r1(arrayList);
        f17526b = p013kotlin.collections.v.r1(p013kotlin.collections.v.P0(p013kotlin.collections.v.N0(new bo0.c('a', 'z'), new bo0.c('A', 'Z')), new bo0.c('0', '9')));
        f17527c = p013kotlin.collections.v.r1(p013kotlin.collections.v.P0(p013kotlin.collections.v.N0(new bo0.c('a', 'f'), new bo0.c('A', 'F')), new bo0.c('0', '9')));
        Set setI = d1.i(chValueOf4, '/', '?', '#', '[', ']', '@', '!', chValueOf5, '&', chValueOf3, chValueOf2, chValueOf, '*', Character.valueOf(CoreConstants.COMMA_CHAR), ';', '=', chValueOf7, chValueOf6, '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(setI, 10));
        Iterator it2 = setI.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f17528d = arrayList2;
        f17529e = d1.i(chValueOf4, '@', '!', chValueOf5, '&', chValueOf3, chValueOf2, chValueOf, '*', '+', Character.valueOf(CoreConstants.COMMA_CHAR), ';', '=', chValueOf7, chValueOf6, '_', '~');
        f17530f = d1.n(f17526b, d1.i('!', '#', chValueOf5, '&', '+', chValueOf7, chValueOf6, '^', '_', '`', '|', '~'));
        List listP = p013kotlin.collections.v.p(chValueOf7, chValueOf6, '_', '~');
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listP, 10));
        Iterator it3 = listP.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f17531g = arrayList3;
    }

    private static final int e(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        if ('a' > c11 || c11 >= 'g') {
            return -1;
        }
        return c11 - 'W';
    }

    private static final String f(CharSequence charSequence, int i11, int i12, int i13, boolean z11, Charset charset) throws URLDecodeException {
        int i14 = i12 - i11;
        if (i14 > 255) {
            i14 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i14);
        if (i13 > i11) {
            sb2.append(charSequence, i11, i13);
        }
        byte[] bArr = null;
        while (i13 < i12) {
            char cCharAt = charSequence.charAt(i13);
            if (z11 && cCharAt == '+') {
                sb2.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i12 - i13) / 3];
                }
                int i15 = 0;
                while (i13 < i12 && charSequence.charAt(i13) == '%') {
                    int i16 = i13 + 2;
                    if (i16 >= i12) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i13, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i13);
                    }
                    int i17 = i13 + 1;
                    int iE = e(charSequence.charAt(i17));
                    int iE2 = e(charSequence.charAt(i16));
                    if (iE == -1 || iE2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i17) + charSequence.charAt(i16) + ", in " + ((Object) charSequence) + ", at " + i13);
                    }
                    bArr[i15] = (byte) ((iE * 16) + iE2);
                    i13 += 3;
                    i15++;
                }
                sb2.append(new String(bArr, 0, i15, charset));
            } else {
                sb2.append(cCharAt);
            }
            i13++;
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "sb.toString()");
        return string;
    }

    private static final String g(String str, int i11, int i12, boolean z11, Charset charset) {
        for (int i13 = i11; i13 < i12; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '%' || (z11 && cCharAt == '+')) {
                return f(str, i11, i12, i13, z11, charset);
            }
        }
        if (i11 == 0 && i12 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i11, i12);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String h(String str, int i11, int i12, Charset charset) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return g(str, i11, i12, false, charset);
    }

    public static /* synthetic */ String i(String str, int i11, int i12, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return h(str, i11, i12, charset);
    }

    public static final String j(String str, int i11, int i12, boolean z11, Charset charset) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return g(str, i11, i12, z11, charset);
    }

    public static /* synthetic */ String k(String str, int i11, int i12, boolean z11, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return j(str, i11, i12, z11, charset);
    }

    public static final String l(String str, boolean z11) throws Throwable {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = p013kotlin.text.d.UTF_8.newEncoder();
        p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        s(kl0.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new C0352a(sb2, z11));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String m(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return l(str, z11);
    }

    public static final String n(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str, boolean z11) throws Throwable {
        int i11;
        p013kotlin.jvm.internal.s.k(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = p013kotlin.text.d.UTF_8;
        int i12 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            if ((!z11 && cCharAt == '/') || f17526b.contains(Character.valueOf(cCharAt)) || f17529e.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                i12++;
            } else {
                if (cCharAt == '%' && (i11 = i12 + 2) < str.length()) {
                    Set<Character> set = f17527c;
                    int i13 = i12 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i13))) && set.contains(Character.valueOf(str.charAt(i11)))) {
                        sb2.append(cCharAt);
                        sb2.append(str.charAt(i13));
                        sb2.append(str.charAt(i11));
                        i12 += 3;
                    }
                }
                int i14 = p013kotlin.text.a.j(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
                int i15 = i14 + i12;
                s(kl0.b.c(charsetEncoderNewEncoder, str, i12, i15), new b(sb2));
                i12 = i15;
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String p(String str) {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        return o(str, true);
    }

    public static final String q(String str, boolean z11, boolean z12, Charset charset) throws Throwable {
        p013kotlin.jvm.internal.s.k(str, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
        s(kl0.b.d(charsetEncoderNewEncoder, str, 0, 0, 6, null), new c(z12, sb2, z11));
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String r(String str, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            charset = p013kotlin.text.d.UTF_8;
        }
        return q(str, z11, z12, charset);
    }

    private static final void s(ll0.k kVar, wn0.l<? super Byte, jn0.h0> lVar) throws Throwable {
        boolean z11 = true;
        ml0.a aVarB = ml0.f.b(kVar, 1);
        if (aVarB == null) {
            return;
        }
        while (true) {
            try {
                if (aVarB.getWritePosition() > aVarB.getReadPosition()) {
                    lVar.invoke(Byte.valueOf(aVarB.l()));
                } else {
                    try {
                        aVarB = ml0.f.c(kVar, aVarB);
                        if (aVarB == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        if (z11) {
                            ml0.f.a(kVar, aVarB);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static final char t(int i11) {
        return (char) ((i11 < 0 || i11 >= 10) ? ((char) (i11 + 65)) - '\n' : i11 + 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(byte b11) {
        return p013kotlin.text.t.D(new char[]{CoreConstants.PERCENT_CHAR, t((b11 & 255) >> 4), t(b11 & 15)});
    }
}
