package p013kotlin.text;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.c0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.collections.d;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0012\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0010\u001aC\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#\u001aG\u0010'\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,\u001a1\u0010-\u001a\u00020)*\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100\u001a3\u00102\u001a\u00020)*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u0006H\u0003¢\u0006\u0004\b2\u00103\u001aC\u00109\u001a\u000208*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00032\u0006\u00107\u001a\u0002062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:\u001a+\u0010;\u001a\u000208*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u000208*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010?\u001a\u00020)*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@\u001a3\u0010C\u001a\u000208*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010D\u001a3\u0010G\u001a\u000208*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a3\u0010I\u001a\u000208*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003H\u0002¢\u0006\u0004\bI\u0010H\u001a\u001b\u0010K\u001a\u00020J*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010L\" \u0010R\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b+\u0010M\u0012\u0004\bP\u0010Q\u001a\u0004\bN\u0010O\"\u0014\u0010S\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010M\"\u0014\u0010T\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010M\"\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010V¨\u0006X"}, d2 = {"", "Lkotlin/text/h;", "format", "", "t", "([BLkotlin/text/h;)Ljava/lang/String;", "", "startIndex", "endIndex", "s", "([BIILkotlin/text/h;)Ljava/lang/String;", "Lkotlin/text/h$a;", "bytesFormat", "", "byteToDigits", "v", "([BIILkotlin/text/h$a;[I)Ljava/lang/String;", "x", "w", "y", "index", "bytePrefix", "byteSuffix", "", "destination", "destinationOffset", "e", "([BILjava/lang/String;Ljava/lang/String;[I[CI)I", "f", "([BI[I[CI)I", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "g", "(IIII)I", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "h", "(IIIIIII)I", "", "formatLength", "a", "(J)I", "j", "(Ljava/lang/String;IILkotlin/text/h;)J", "r", "(Ljava/lang/String;[CI)I", "typeHexLength", "l", "(Ljava/lang/String;IILkotlin/text/h;I)J", "prefix", "suffix", "", "ignoreCase", "Ljn0/h0;", "c", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZI)V", "b", "(Ljava/lang/String;III)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;II)V", "m", "(Ljava/lang/String;II)J", "specifier", "expected", "o", "(Ljava/lang/String;IILjava/lang/String;I)V", "part", "partName", "q", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "p", "", "n", "(Ljava/lang/String;I)Ljava/lang/Void;", "[I", IntegerTokenConverter.CONVERTER_KEY, "()[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f89140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f89141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f89142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f89143d;

    static {
        int[] iArr = new int[256];
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = "0123456789abcdef".charAt(i12 & 15) | ("0123456789abcdef".charAt(i12 >> 4) << '\b');
        }
        f89140a = iArr;
        int[] iArr2 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr2[i13] = "0123456789ABCDEF".charAt(i13 & 15) | ("0123456789ABCDEF".charAt(i13 >> 4) << '\b');
        }
        f89141b = iArr2;
        int[] iArr3 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr3[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        f89142c = iArr3;
        long[] jArr = new long[256];
        for (int i19 = 0; i19 < 256; i19++) {
            jArr[i19] = -1;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i21)] = i22;
            i21++;
            i22++;
        }
        int i23 = 0;
        while (i11 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i11)] = i23;
            i11++;
            i23++;
        }
        f89143d = jArr;
    }

    private static final int a(long j11) {
        if (0 <= j11 && j11 <= 2147483647L) {
            return (int) j11;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) c0.f(c0.b(j11))));
    }

    private static final void b(String str, int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if (i14 < 1) {
            o(str, i11, i12, "at least", 1);
        } else if (i14 > i13) {
            d(str, i11, (i14 + i11) - i13);
        }
    }

    private static final void c(String str, int i11, int i12, String str2, String str3, boolean z11, int i13) {
        if ((i12 - i11) - str2.length() <= str3.length()) {
            p(str, i11, i12, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i14 = 0; i14 < length; i14++) {
                if (!c.i(str2.charAt(i14), str.charAt(i11 + i14), z11)) {
                    q(str, i11, i12, str2, "prefix");
                }
            }
            i11 += str2.length();
        }
        int length2 = i12 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i15 = 0; i15 < length3; i15++) {
                if (!c.i(str3.charAt(i15), str.charAt(length2 + i15), z11)) {
                    q(str, length2, i12, str3, "suffix");
                }
            }
        }
        b(str, i11, length2, i13);
    }

    private static final void d(String str, int i11, int i12) {
        while (i11 < i12) {
            if (str.charAt(i11) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i11 + ", but was '" + str.charAt(i11) + "'.\nThe result won't fit the type being parsed.");
            }
            i11++;
        }
    }

    private static final int e(byte[] bArr, int i11, String str, String str2, int[] iArr, char[] cArr, int i12) {
        return r(str2, cArr, f(bArr, i11, iArr, cArr, r(str, cArr, i12)));
    }

    private static final int f(byte[] bArr, int i11, int[] iArr, char[] cArr, int i12) {
        int i13 = iArr[bArr[i11] & 255];
        cArr[i12] = (char) (i13 >> 8);
        cArr[i12 + 1] = (char) (i13 & 255);
        return i12 + 2;
    }

    private static final int g(int i11, int i12, int i13, int i14) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i12;
        return a((((long) i11) * (((((long) i13) + 2) + ((long) i14)) + j11)) - j11);
    }

    public static final int h(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i18 = i11 - 1;
        int i19 = i18 / i12;
        int i21 = (i12 - 1) / i13;
        int i22 = i11 % i12;
        if (i22 != 0) {
            i12 = i22;
        }
        int i23 = (i21 * i19) + ((i12 - 1) / i13);
        return a(((long) i19) + (((long) i23) * ((long) i14)) + (((long) ((i18 - i19) - i23)) * ((long) i15)) + (((long) i11) * (((long) i16) + 2 + ((long) i17))));
    }

    public static final int[] i() {
        return f89140a;
    }

    public static final long j(String str, int i11, int i12, HexFormat format) {
        s.k(str, "<this>");
        s.k(format, "format");
        return l(str, i11, i12, format, 16);
    }

    public static /* synthetic */ long k(String str, int i11, int i12, HexFormat hexFormat, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        if ((i13 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return j(str, i11, i12, hexFormat);
    }

    private static final long l(String str, int i11, int i12, HexFormat hexFormat, int i13) {
        d.INSTANCE.a(i11, i12, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.FloatField.TYPE2 java.lang.String();
        if (number.getIsDigitsOnly()) {
            b(str, i11, i12, i13);
            return m(str, i11, i12);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        c(str, i11, i12, prefix, suffix, number.getIgnoreCase(), i13);
        return m(str, i11 + prefix.length(), i12 - suffix.length());
    }

    private static final long m(String str, int i11, int i12) {
        long j11 = 0;
        while (i11 < i12) {
            long j12 = j11 << 4;
            char cCharAt = str.charAt(i11);
            if ((cCharAt >>> '\b') == 0) {
                long j13 = f89143d[cCharAt];
                if (j13 >= 0) {
                    j11 = j12 | j13;
                    i11++;
                }
            }
            n(str, i11);
            throw new KotlinNothingValueException();
        }
        return j11;
    }

    private static final Void n(String str, int i11) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i11 + ", but was " + str.charAt(i11));
    }

    private static final void o(String str, int i11, int i12, String str2, int i13) {
        s.i(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, i12);
        s.j(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i13 + " hexadecimal digits at index " + i11 + ", but was \"" + strSubstring + "\" of length " + (i12 - i11));
    }

    private static final void p(String str, int i11, int i12, String str2, String str3) {
        s.i(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, i12);
        s.j(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void q(String str, int i11, int i12, String str2, String str3) {
        int iJ = n.j(str2.length() + i11, i12);
        s.i(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i11, iJ);
        s.j(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i11 + ", but was " + strSubstring);
    }

    private static final int r(String str, char[] cArr, int i11) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                s.i(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i11);
            } else {
                cArr[i11] = str.charAt(0);
            }
        }
        return i11 + str.length();
    }

    public static final String s(byte[] bArr, int i11, int i12, HexFormat format) {
        s.k(bArr, "<this>");
        s.k(format, "format");
        d.INSTANCE.a(i11, i12, bArr.length);
        if (i11 == i12) {
            return "";
        }
        int[] iArr = format.getUpperCase() ? f89141b : f89140a;
        HexFormat.BytesHexFormat bytes = format.getBytes();
        return bytes.getNoLineAndGroupSeparator() ? v(bArr, i11, i12, bytes, iArr) : y(bArr, i11, i12, bytes, iArr);
    }

    public static final String t(byte[] bArr, HexFormat format) {
        s.k(bArr, "<this>");
        s.k(format, "format");
        return s(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String u(byte[] bArr, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.a();
        }
        return t(bArr, hexFormat);
    }

    private static final String v(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix() ? x(bArr, i11, i12, bytesHexFormat, iArr) : w(bArr, i11, i12, bytesHexFormat, iArr);
    }

    private static final String w(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[g(i12 - i11, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int iE = e(bArr, i11, bytePrefix, byteSuffix, iArr, cArr, 0);
        for (int i13 = i11 + 1; i13 < i12; i13++) {
            iE = e(bArr, i13, bytePrefix, byteSuffix, iArr, cArr, r(byteSeparator, cArr, iE));
        }
        return f0.D(cArr);
    }

    private static final String x(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = i12 - i11;
        int iF = 0;
        if (length == 0) {
            char[] cArr = new char[a(((long) i13) * 2)];
            while (i11 < i12) {
                iF = f(bArr, i11, iArr, cArr, iF);
                i11++;
            }
            return f0.D(cArr);
        }
        char[] cArr2 = new char[a((((long) i13) * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int iF2 = f(bArr, i11, iArr, cArr2, 0);
        for (int i14 = i11 + 1; i14 < i12; i14++) {
            cArr2[iF2] = cCharAt;
            iF2 = f(bArr, i14, iArr, cArr2, iF2 + 1);
        }
        return f0.D(cArr2);
    }

    private static final String y(byte[] bArr, int i11, int i12, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i13;
        int i14;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int iH = h(i12 - i11, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[iH];
        int i15 = i11;
        int iR = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i12) {
            if (i16 == bytesPerLine) {
                cArr[iR] = '\n';
                iR++;
                i13 = 0;
                i14 = 0;
            } else if (i17 == bytesPerGroup) {
                iR = r(groupSeparator, cArr, iR);
                i13 = i16;
                i14 = 0;
            } else {
                i13 = i16;
                i14 = i17;
            }
            if (i14 != 0) {
                iR = r(byteSeparator, cArr, iR);
            }
            String str = bytePrefix;
            int iE = e(bArr, i15, str, byteSuffix, iArr, cArr, iR);
            i15++;
            i17 = i14 + 1;
            iR = iE;
            bytePrefix = str;
            i16 = i13 + 1;
        }
        if (iR == iH) {
            return f0.D(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
