package j$.time.format;

import j$.time.DateTimeException;
import java.util.Objects;
import org.slf4j.Marker;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f82108d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f82109e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f82110f = new j("+HH:MM:ss", WebrtcBuildVersion.maint_version);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82113c;

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i11 = 0;
        while (true) {
            String[] strArr = f82108d;
            if (i11 < strArr.length) {
                if (strArr[i11].equals(str)) {
                    this.f82112b = i11;
                    this.f82113c = i11 % 11;
                    this.f82111a = str2;
                    return;
                }
                i11++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z11 = false;
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.f82111a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
        if (this.f82112b < 11 || iAbs >= 10) {
            a(false, iAbs, sb2);
        } else {
            sb2.append((char) (iAbs + 48));
        }
        int i11 = this.f82113c;
        if ((i11 >= 3 && i11 <= 8) || ((i11 >= 9 && iAbs3 > 0) || (i11 >= 1 && iAbs2 > 0))) {
            a(i11 > 0 && i11 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i11 == 7 || i11 == 8 || (i11 >= 5 && iAbs3 > 0)) {
                if (i11 > 0 && i11 % 2 == 0) {
                    z11 = true;
                }
                a(z11, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z11, int i11, StringBuilder sb2) {
        sb2.append(z11 ? ":" : "");
        sb2.append((char) ((i11 / 10) + 48));
        sb2.append((char) ((i11 % 10) + 48));
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        CharSequence charSequence2;
        int i12;
        int i13;
        int i14;
        int i15;
        int length = charSequence.length();
        int length2 = this.f82111a.length();
        if (length2 == 0) {
            if (i11 == length) {
                return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i11, i11);
            }
            charSequence2 = charSequence;
        } else {
            if (i11 == length) {
                return ~i11;
            }
            charSequence2 = charSequence;
            if (uVar.g(charSequence2, i11, this.f82111a, 0, length2)) {
                return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i11, i11 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt == '+' || cCharAt == '-') {
            int i16 = cCharAt == '-' ? -1 : 1;
            int i17 = this.f82113c;
            boolean z11 = i17 > 0 && i17 % 2 == 0;
            int i18 = this.f82112b;
            boolean z12 = i18 < 11;
            int[] iArr = new int[4];
            iArr[0] = i11 + 1;
            if (!uVar.f82147c) {
                if (z12) {
                    if (z11 || (i18 == 0 && length > (i15 = i11 + 3) && charSequence2.charAt(i15) == ':')) {
                        i18 = 10;
                        z11 = true;
                    } else {
                        i18 = 9;
                    }
                } else if (z11 || (i18 == 11 && length > (i14 = i11 + 3) && (charSequence2.charAt(i11 + 2) == ':' || charSequence2.charAt(i14) == ':'))) {
                    i18 = 21;
                    z11 = true;
                } else {
                    i18 = 20;
                }
            }
            switch (i18) {
                case 0:
                case 11:
                    c(charSequence2, z12, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z12, iArr);
                    d(charSequence2, z11, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z12, iArr);
                    d(charSequence2, z11, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z12, iArr);
                    d(charSequence2, z11, true, iArr);
                    b(charSequence2, z11, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z12, iArr);
                    d(charSequence2, z11, true, iArr);
                    if (!b(charSequence2, z11, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z12, iArr);
                    if (b(charSequence2, z11, 2, iArr)) {
                        b(charSequence2, z11, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i19 = iArr[0];
            if (i19 > 0) {
                int i21 = iArr[1];
                if (i21 > 23 || (i12 = iArr[2]) > 59 || (i13 = iArr[3]) > 59) {
                    throw new DateTimeException("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i12) * 60) + (((long) i21) * 3600) + ((long) i13)) * ((long) i16), i11, i19);
            }
        }
        return length2 == 0 ? uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i11, i11) : ~i11;
    }

    public static void c(CharSequence charSequence, boolean z11, int[] iArr) {
        if (z11) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(CharSequence charSequence, boolean z11, boolean z12, int[] iArr) {
        if (b(charSequence, z11, 2, iArr) || !z12) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public static boolean b(CharSequence charSequence, boolean z11, int i11, int[] iArr) {
        int i12;
        char cCharAt;
        char cCharAt2;
        int i13;
        int i14 = iArr[0];
        if (i14 < 0) {
            return true;
        }
        if (z11 && i11 != 1) {
            int i15 = i14 + 1;
            if (i15 <= charSequence.length() && charSequence.charAt(i14) == ':') {
                i14 = i15;
                i12 = i14 + 2;
                if (i12 <= charSequence.length()) {
                    int i16 = i14 + 1;
                    cCharAt = charSequence.charAt(i14);
                    cCharAt2 = charSequence.charAt(i16);
                    if (cCharAt >= '0') {
                        i13 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i13 >= 0) {
                            iArr[i11] = i13;
                            iArr[0] = i12;
                            return true;
                        }
                    }
                }
            }
        } else {
            i12 = i14 + 2;
            if (i12 <= charSequence.length()) {
                int i17 = i14 + 1;
                cCharAt = charSequence.charAt(i14);
                cCharAt2 = charSequence.charAt(i17);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i13 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i13 >= 0 && i13 <= 59) {
                        iArr[i11] = i13;
                        iArr[0] = i12;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void e(CharSequence charSequence, int i11, int i12, int[] iArr) {
        int i13;
        char cCharAt;
        int i14 = iArr[0];
        char[] cArr = new char[i12];
        int i15 = 0;
        int i16 = 0;
        while (i15 < i12 && (i13 = i14 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i14)) >= '0' && cCharAt <= '9') {
            cArr[i15] = cCharAt;
            i16++;
            i15++;
            i14 = i13;
        }
        if (i16 < i11) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i16) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i14;
    }

    public final String toString() {
        String strReplace = this.f82111a.replace("'", "''");
        return "Offset(" + f82108d[this.f82112b] + ",'" + strReplace + "')";
    }
}
