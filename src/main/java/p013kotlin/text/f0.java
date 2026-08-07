package p013kotlin.text;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import java.util.Locale;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.d;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00020\u0000*\u00020\u00182\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010!\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005\u001a+\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#\u001a#\u0010%\u001a\u00020\u0002*\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0005\u001a#\u0010&\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a \u0010)\u001a\u00020\u0002*\u0004\u0018\u00010(2\b\u0010\u0001\u001a\u0004\u0018\u00010(H\u0087\u0004¢\u0006\u0004\b)\u0010*\u001a;\u0010.\u001a\u00020\u0002*\u00020\u00002\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/\u001a\u001b\u00102\u001a\u00020\u0000*\u00020\u00002\u0006\u00101\u001a\u000200H\u0007¢\u0006\u0004\b2\u00103\u001a\u0019\u00105\u001a\u00020\u0000*\u00020(2\u0006\u00104\u001a\u00020\u0013¢\u0006\u0004\b5\u00106\"%\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000008j\b\u0012\u0004\u0012\u00020\u0000`9*\u0002078F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"", "other", "", "ignoreCase", Gender.MALE, "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "S", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "W", "", "D", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "E", "([CII)Ljava/lang/String;", "", "G", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "H", "([BIIZ)Ljava/lang/String;", "J", "(Ljava/lang/String;)[B", "prefix", "Z", "Y", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "K", "C", "(Ljava/lang/String;Ljava/lang/String;Z)I", "", Gender.FEMALE, "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "thisOffset", "otherOffset", "length", "P", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "Ljava/util/Locale;", "locale", "B", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "n", "R", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", Gender.OTHER, "(Lkotlin/jvm/internal/t0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class f0 extends e0 {
    @e
    public static String B(String str, Locale locale) {
        s.k(str, "<this>");
        s.k(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            s.j(strSubstring, "substring(...)");
            s.i(strSubstring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strSubstring.toUpperCase(locale);
            s.j(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        s.j(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static int C(String str, String other, boolean z11) {
        s.k(str, "<this>");
        s.k(other, "other");
        return z11 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static String D(char[] cArr) {
        s.k(cArr, "<this>");
        return new String(cArr);
    }

    public static String E(char[] cArr, int i11, int i12) {
        s.k(cArr, "<this>");
        d.INSTANCE.a(i11, i12, cArr.length);
        return new String(cArr, i11, i12 - i11);
    }

    public static boolean F(CharSequence charSequence, CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? i0.i0(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    public static String G(byte[] bArr) {
        s.k(bArr, "<this>");
        return new String(bArr, d.UTF_8);
    }

    public static final String H(byte[] bArr, int i11, int i12, boolean z11) {
        s.k(bArr, "<this>");
        d.INSTANCE.a(i11, i12, bArr.length);
        if (!z11) {
            return new String(bArr, i11, i12 - i11, d.UTF_8);
        }
        CharsetDecoder charsetDecoderNewDecoder = d.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i11, i12 - i11)).toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String I(byte[] bArr, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        return H(bArr, i11, i12, z11);
    }

    public static byte[] J(String str) {
        s.k(str, "<this>");
        byte[] bytes = str.getBytes(d.UTF_8);
        s.j(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean K(String str, String suffix, boolean z11) {
        s.k(str, "<this>");
        s.k(suffix, "suffix");
        return !z11 ? str.endsWith(suffix) : P(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean L(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return K(str, str2, z11);
    }

    public static boolean M(String str, String str2, boolean z11) {
        if (str == null) {
            return str2 == null;
        }
        return !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean N(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return M(str, str2, z11);
    }

    public static Comparator<String> O(t0 t0Var) {
        s.k(t0Var, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        s.j(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static boolean P(String str, int i11, String other, int i12, int i13, boolean z11) {
        s.k(str, "<this>");
        s.k(other, "other");
        return !z11 ? str.regionMatches(i11, other, i12, i13) : str.regionMatches(z11, i11, other, i12, i13);
    }

    public static /* synthetic */ boolean Q(String str, int i11, String str2, int i12, int i13, boolean z11, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = false;
        }
        return P(str, i11, str2, i12, i13, z11);
    }

    public static String R(CharSequence charSequence, int i11) {
        s.k(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i11 + CoreConstants.DOT).toString());
        }
        if (i11 == 0) {
            return "";
        }
        int i12 = 1;
        if (i11 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                cArr[i13] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i11);
        if (1 <= i11) {
            while (true) {
                sb2.append(charSequence);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String string = sb2.toString();
        s.h(string);
        return string;
    }

    public static final String S(String str, char c11, char c12, boolean z11) {
        s.k(str, "<this>");
        if (!z11) {
            String strReplace = str.replace(c11, c12);
            s.j(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (c.i(cCharAt, c11, z11)) {
                cCharAt = c12;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String T(String str, String oldValue, String newValue, boolean z11) {
        s.k(str, "<this>");
        s.k(oldValue, "oldValue");
        s.k(newValue, "newValue");
        int i11 = 0;
        int iR0 = i0.r0(str, oldValue, 0, z11);
        if (iR0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int iF = n.f(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i11, iR0);
            sb2.append(newValue);
            i11 = iR0 + length;
            if (iR0 >= str.length()) {
                break;
            }
            iR0 = i0.r0(str, oldValue, iR0 + iF, z11);
        } while (iR0 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String U(String str, char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return S(str, c11, c12, z11);
    }

    public static /* synthetic */ String V(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return T(str, str2, str3, z11);
    }

    public static final String W(String str, String oldValue, String newValue, boolean z11) {
        s.k(str, "<this>");
        s.k(oldValue, "oldValue");
        s.k(newValue, "newValue");
        int iV0 = i0.v0(str, oldValue, 0, z11, 2, null);
        return iV0 < 0 ? str : i0.Z0(str, iV0, oldValue.length() + iV0, newValue).toString();
    }

    public static /* synthetic */ String X(String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return W(str, str2, str3, z11);
    }

    public static boolean Y(String str, String prefix, int i11, boolean z11) {
        s.k(str, "<this>");
        s.k(prefix, "prefix");
        return !z11 ? str.startsWith(prefix, i11) : P(str, i11, prefix, 0, prefix.length(), z11);
    }

    public static boolean Z(String str, String prefix, boolean z11) {
        s.k(str, "<this>");
        s.k(prefix, "prefix");
        return !z11 ? str.startsWith(prefix) : P(str, 0, prefix, 0, prefix.length(), z11);
    }

    public static /* synthetic */ boolean a0(String str, String str2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return Y(str, str2, i11, z11);
    }

    public static /* synthetic */ boolean b0(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return Z(str, str2, z11);
    }
}
