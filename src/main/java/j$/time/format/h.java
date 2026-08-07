package j$.time.format;

import ch.qos.logback.core.CoreConstants;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f82101b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f82100a = i11;
        this.f82101b = obj;
    }

    @Override // j$.time.format.e
    public final boolean s(w wVar, StringBuilder sb2) {
        switch (this.f82100a) {
            case 0:
                Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb2.append("GMT");
                int intExact = Math.toIntExact(lA.longValue());
                if (intExact != 0) {
                    int iAbs = Math.abs((intExact / 3600) % 100);
                    int iAbs2 = Math.abs((intExact / 60) % 60);
                    int iAbs3 = Math.abs(intExact % 60);
                    sb2.append(intExact < 0 ? "-" : Marker.ANY_NON_NULL_MARKER);
                    if (((e0) this.f82101b) == e0.FULL) {
                        a(sb2, iAbs);
                        sb2.append(CoreConstants.COLON_CHAR);
                        a(sb2, iAbs2);
                        if (iAbs3 != 0) {
                            sb2.append(CoreConstants.COLON_CHAR);
                            a(sb2, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb2.append((char) ((iAbs / 10) + 48));
                        }
                        sb2.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb2.append(CoreConstants.COLON_CHAR);
                            a(sb2, iAbs2);
                            if (iAbs3 != 0) {
                                sb2.append(CoreConstants.COLON_CHAR);
                                a(sb2, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb2.append((String) this.f82101b);
                return true;
        }
    }

    @Override // j$.time.format.e
    public final int w(u uVar, CharSequence charSequence, int i11) {
        int i12;
        int iB;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f82100a) {
            case 0:
                int length = charSequence.length();
                if (uVar.g(charSequence, i11, "GMT", 0, 3)) {
                    int i17 = i11 + 3;
                    if (i17 == length) {
                        return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i11, i17);
                    }
                    char cCharAt = charSequence.charAt(i17);
                    if (cCharAt == '+') {
                        i12 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i11, i17);
                        }
                        i12 = -1;
                    }
                    int i18 = i11 + 4;
                    int i19 = 0;
                    if (((e0) this.f82101b) == e0.FULL) {
                        int i21 = i11 + 5;
                        int iB2 = b(charSequence, i18);
                        int i22 = i11 + 6;
                        int iB3 = b(charSequence, i21);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i23 = i11 + 7;
                            if (charSequence.charAt(i22) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i23);
                                i16 = i11 + 9;
                                int iB5 = b(charSequence, i11 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i15 = (iB4 * 10) + iB5;
                                    int i24 = i11 + 11;
                                    if (i24 < length && charSequence.charAt(i16) == ':') {
                                        int iB6 = b(charSequence, i11 + 10);
                                        int iB7 = b(charSequence, i24);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i19 = (iB6 * 10) + iB7;
                                            i16 = i11 + 12;
                                        }
                                    }
                                    i13 = i19;
                                    i14 = i16;
                                }
                            }
                        }
                    } else {
                        int i25 = i11 + 5;
                        iB = b(charSequence, i18);
                        if (iB >= 0) {
                            if (i25 < length) {
                                int iB8 = b(charSequence, i25);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i25 = i11 + 6;
                                }
                                int i26 = i25 + 2;
                                if (i26 < length && charSequence.charAt(i25) == ':' && i26 < length && charSequence.charAt(i25) == ':') {
                                    int iB9 = b(charSequence, i25 + 1);
                                    int iB10 = b(charSequence, i26);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i15 = (iB9 * 10) + iB10;
                                        int i27 = i25 + 3;
                                        int i28 = i25 + 5;
                                        if (i28 < length && charSequence.charAt(i27) == ':') {
                                            int iB11 = b(charSequence, i25 + 4);
                                            int iB12 = b(charSequence, i28);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i19 = (iB11 * 10) + iB12;
                                                i16 = i25 + 6;
                                                i13 = i19;
                                                i14 = i16;
                                            }
                                        }
                                        i14 = i27;
                                        i13 = 0;
                                    }
                                    return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i19) * 60) + (((long) iB) * 3600) + ((long) i13)) * ((long) i12), i11, i14);
                                }
                            }
                            i13 = 0;
                            i14 = i25;
                            return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i19) * 60) + (((long) iB) * 3600) + ((long) i13)) * ((long) i12), i11, i14);
                        }
                    }
                    i19 = i15;
                    return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i19) * 60) + (((long) iB) * 3600) + ((long) i13)) * ((long) i12), i11, i14);
                }
                return ~i11;
            default:
                String str = (String) this.f82101b;
                if (i11 > charSequence.length() || i11 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !uVar.g(charSequence, i11, str, 0, str.length()) ? ~i11 : str.length() + i11;
        }
    }

    public final String toString() {
        switch (this.f82100a) {
            case 0:
                return "LocalizedOffset(" + ((e0) this.f82101b) + ")";
            default:
                return "'" + ((String) this.f82101b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb2, int i11) {
        sb2.append((char) ((i11 / 10) + 48));
        sb2.append((char) ((i11 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
