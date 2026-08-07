package okhttp3.internal;

import ch.qos.logback.core.CoreConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import okio.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", PlaceTypes.ADDRESS, "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (s.m(cCharAt, 31) <= 0 || s.m(cCharAt, 127) >= 0 || t.u0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i11, int i12, byte[] bArr, int i13) {
        int i14 = i13;
        while (i11 < i12) {
            if (i14 == bArr.length) {
                return false;
            }
            if (i14 != i13) {
                if (str.charAt(i11) != '.') {
                    return false;
                }
                i11++;
            }
            int i15 = i11;
            int i16 = 0;
            while (i15 < i12) {
                char cCharAt = str.charAt(i15);
                if (s.m(cCharAt, 48) < 0 || s.m(cCharAt, 57) > 0) {
                    break;
                }
                if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i15++;
            }
            if (i15 - i11 == 0) {
                return false;
            }
            bArr[i14] = (byte) i16;
            i14++;
            i11 = i15;
        }
        return i14 == i13 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[LOOP:1: B:30:0x0064->B:33:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0076 A[EDGE_INSN: B:54:0x0076->B:34:0x0076 BREAK  A[LOOP:1: B:30:0x0064->B:33:0x0070], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i11, int i12) {
        int i13;
        int i14;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i15 = i11;
        int i16 = 0;
        int i17 = -1;
        int i18 = -1;
        while (i15 < i12) {
            if (i16 == 16) {
                return null;
            }
            int i19 = i15 + 2;
            if (i19 <= i12 && t.a0(str, "::", i15, false, 4, null)) {
                if (i17 != -1) {
                    return null;
                }
                i16 += 2;
                if (i19 == i12) {
                    i17 = i16;
                    break;
                }
                i17 = i16;
                i18 = i19;
                i13 = 0;
                i15 = i18;
                while (i15 < i12) {
                    hexDigit = Util.parseHexDigit(str.charAt(i15));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i13 = (i13 << 4) + hexDigit;
                    i15++;
                }
                i14 = i15 - i18;
                if (i14 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!t.a0(str, ":", i15, false, 4, null)) {
                    if (!t.a0(str, ".", i15, false, 4, null) || !decodeIpv4Suffix(str, i18, i12, bArr, i16 - 2)) {
                        return null;
                    }
                    i16 += 2;
                    break;
                }
                i15++;
            }
            i18 = i15;
            i13 = 0;
            i15 = i18;
            while (i15 < i12) {
                hexDigit = Util.parseHexDigit(str.charAt(i15));
                if (hexDigit != -1) {
                    break;
                }
                i13 = (i13 << 4) + hexDigit;
                i15++;
            }
            i14 = i15 - i18;
            if (i14 != 0 || i14 > 4) {
                return null;
            }
            int i21 = i16 + 1;
            bArr[i16] = (byte) ((i13 >>> 8) & 255);
            i16 += 2;
            bArr[i21] = (byte) (i13 & 255);
        }
        if (i16 != 16) {
            if (i17 == -1) {
                return null;
            }
            int i22 = i16 - i17;
            System.arraycopy(bArr, i17, bArr, 16 - i22, i22);
            Arrays.fill(bArr, i17, (16 - i16) + i17, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            int i15 = i13;
            while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        h hVar = new h();
        while (i12 < bArr.length) {
            if (i12 == i11) {
                hVar.writeByte(58);
                i12 += i14;
                if (i12 == 16) {
                    hVar.writeByte(58);
                }
            } else {
                if (i12 > 0) {
                    hVar.writeByte(58);
                }
                hVar.l1((Util.and(bArr[i12], 255) << 8) | Util.and(bArr[i12 + 1], 255));
                i12 += 2;
            }
        }
        return hVar.t1();
    }

    public static final String toCanonicalHost(String str) {
        s.k(str, "<this>");
        if (!t.h0(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                s.j(ascii, "toASCII(host)");
                Locale US = Locale.US;
                s.j(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                s.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (t.b0(str, "[", false, 2, null) && t.L(str, "]", false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            s.j(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + CoreConstants.SINGLE_QUOTE_CHAR);
    }
}
