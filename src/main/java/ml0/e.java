package ml0;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import io.ktor.utils.io.core.internal.MalformedUTF8InputException;
import java.nio.ByteBuffer;
import jn0.f0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0005\u001aA\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\u000f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aQ\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010\u001f\u001a\u001f\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Ljl0/c;", "", "text", "", "from", "to", "dstOffset", "dstLimit", "Lml0/c;", "b", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIII)I", "index1", "lastCharIndex", "resultPosition1", "resultLimit", "c", "(Ljava/nio/ByteBuffer;Ljava/lang/CharSequence;IIIIII)I", DateTokenConverter.CONVERTER_KEY, "byteCount", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Void;", "value", "j", "cp", "", "f", "(I)Z", "codePoint", "g", "h", "(I)I", "e", "", "high", "low", "a", "(CC)I", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final int a(char c11, char c12) {
        return ((c11 - 55232) << 10) | (c12 - 56320);
    }

    public static final int b(ByteBuffer encodeUTF8, CharSequence text, int i11, int i12, int i13, int i14) {
        s.k(encodeUTF8, "$this$encodeUTF8");
        s.k(text, "text");
        int iMin = Math.min(i12, i11 + 65535);
        int iJ = n.j(i14, 65535);
        int i15 = i11;
        int i16 = i13;
        while (i16 < iJ && i15 < iMin) {
            int i17 = i15 + 1;
            char cCharAt = text.charAt(i15);
            int i18 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                return c(encodeUTF8, text, i15, iMin, i11, i16, iJ, i13);
            }
            encodeUTF8.put(i16, (byte) i18);
            i15 = i17;
            i16++;
        }
        return c.d(f0.b((short) (i15 - i11)), f0.b((short) (i16 - i13)));
    }

    private static final int c(ByteBuffer byteBuffer, CharSequence charSequence, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iA;
        int i17;
        int i18 = i15 - 3;
        while (i18 - i14 > 0 && i11 < i12) {
            int i19 = i11 + 1;
            char cCharAt = charSequence.charAt(i11);
            if (!Character.isHighSurrogate(cCharAt)) {
                i11 = i19;
                iA = cCharAt;
            } else if (i19 == i12 || !Character.isLowSurrogate(charSequence.charAt(i19))) {
                i11 = i19;
                iA = 63;
            } else {
                i11 += 2;
                iA = a(cCharAt, charSequence.charAt(i19));
            }
            if (iA >= 0 && iA < 128) {
                byteBuffer.put(i14, (byte) iA);
                i17 = 1;
            } else if (128 <= iA && iA < 2048) {
                byteBuffer.put(i14, (byte) (((iA >> 6) & 31) | 192));
                byteBuffer.put(i14 + 1, (byte) (128 | (iA & 63)));
                i17 = 2;
            } else if (2048 <= iA && iA < 65536) {
                byteBuffer.put(i14, (byte) (((iA >> 12) & 15) | 224));
                byteBuffer.put(i14 + 1, (byte) ((63 & (iA >> 6)) | 128));
                byteBuffer.put(i14 + 2, (byte) (128 | (iA & 63)));
                i17 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    j(iA);
                    throw new KotlinNothingValueException();
                }
                byteBuffer.put(i14, (byte) (((iA >> 18) & 7) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i14 + 1, (byte) (((iA >> 12) & 63) | 128));
                byteBuffer.put(i14 + 2, (byte) ((63 & (iA >> 6)) | 128));
                byteBuffer.put(i14 + 3, (byte) (128 | (iA & 63)));
                i17 = 4;
            }
            i14 += i17;
        }
        return i14 == i18 ? d(byteBuffer, charSequence, i11, i12, i13, i14, i15, i16) : c.d(f0.b((short) (i11 - i13)), f0.b((short) (i14 - i16)));
    }

    private static final int d(ByteBuffer byteBuffer, CharSequence charSequence, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iA;
        int i17;
        int i18;
        int i19 = i11;
        int i21 = i14;
        while (true) {
            int i22 = i15 - i21;
            if (i22 <= 0 || i19 >= i12) {
                break;
            }
            int i23 = i19 + 1;
            char cCharAt = charSequence.charAt(i19);
            if (!Character.isHighSurrogate(cCharAt)) {
                i19 = i23;
                iA = cCharAt;
            } else if (i23 == i12 || !Character.isLowSurrogate(charSequence.charAt(i23))) {
                i19 = i23;
                iA = 63;
            } else {
                i19 += 2;
                iA = a(cCharAt, charSequence.charAt(i23));
            }
            if (1 <= iA && iA < 128) {
                i17 = 1;
            } else if (128 <= iA && iA < 2048) {
                i17 = 2;
            } else if (2048 <= iA && iA < 65536) {
                i17 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    j(iA);
                    throw new KotlinNothingValueException();
                }
                i17 = 4;
            }
            if (i17 > i22) {
                i19--;
                break;
            }
            if (iA >= 0 && iA < 128) {
                byteBuffer.put(i21, (byte) iA);
                i18 = 1;
            } else if (128 <= iA && iA < 2048) {
                byteBuffer.put(i21, (byte) (((iA >> 6) & 31) | 192));
                byteBuffer.put(i21 + 1, (byte) ((iA & 63) | 128));
                i18 = 2;
            } else if (2048 <= iA && iA < 65536) {
                byteBuffer.put(i21, (byte) (((iA >> 12) & 15) | 224));
                byteBuffer.put(i21 + 1, (byte) (((iA >> 6) & 63) | 128));
                byteBuffer.put(i21 + 2, (byte) ((iA & 63) | 128));
                i18 = 3;
            } else {
                if (65536 > iA || iA >= 1114112) {
                    j(iA);
                    throw new KotlinNothingValueException();
                }
                byteBuffer.put(i21, (byte) (((iA >> 18) & 7) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i21 + 1, (byte) (((iA >> 12) & 63) | 128));
                byteBuffer.put(i21 + 2, (byte) (((iA >> 6) & 63) | 128));
                byteBuffer.put(i21 + 3, (byte) ((iA & 63) | 128));
                i18 = 4;
            }
            i21 += i18;
        }
        return c.d(f0.b((short) (i19 - i13)), f0.b((short) (i21 - i16)));
    }

    public static final int e(int i11) {
        return (i11 >>> 10) + 55232;
    }

    public static final boolean f(int i11) {
        return (i11 >>> 16) == 0;
    }

    public static final boolean g(int i11) {
        return i11 <= 1114111;
    }

    public static final int h(int i11) {
        return (i11 & 1023) + 56320;
    }

    public static final Void i(int i11) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException("Expected " + i11 + " more character bytes");
    }

    public static final Void j(int i11) {
        throw new IllegalArgumentException("Malformed code-point " + i11 + " found");
    }
}
