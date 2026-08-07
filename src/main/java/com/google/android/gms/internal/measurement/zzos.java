package com.google.android.gms.internal.measurement;

import com.plaid.internal.EnumC4419g;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzop.zza() && zzop.zzb()) {
            int i11 = zzkv.zza;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    static boolean zza(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return true;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            int iZzd = bArr[i11];
            if (iZzd >= 0) {
                i11 = i13;
            } else if (iZzd < -32) {
                if (i13 >= i12) {
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                if (iZzd < -62) {
                    return false;
                }
                i11 += 2;
                if (bArr[i13] > -65) {
                    return false;
                }
            } else if (iZzd < -16) {
                if (i13 >= i12 - 1) {
                    iZzd = zzd(bArr, i13, i12);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i14 = i11 + 2;
                char c11 = bArr[i13];
                if (c11 > -65) {
                    return false;
                }
                if (iZzd == -32 && c11 < -96) {
                    return false;
                }
                if (iZzd == -19 && c11 >= -96) {
                    return false;
                }
                i11 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            } else {
                if (i13 >= i12 - 2) {
                    iZzd = zzd(bArr, i13, i12);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i15 = i11 + 2;
                int i16 = bArr[i13];
                if (i16 > -65 || (((iZzd << 28) + (i16 + 112)) >> 30) != 0) {
                    return false;
                }
                int i17 = i11 + 3;
                if (bArr[i15] > -65) {
                    return false;
                }
                i11 += 4;
                if (bArr[i17] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    static int zzb(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && str.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i12 < length2) {
                    char cCharAt2 = str.charAt(i12);
                    if (cCharAt2 < 2048) {
                        i11 += (127 - cCharAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new zzor(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
                break;
            }
            i13 += (127 - cCharAt) >>> 31;
            i12++;
        }
        if (i13 >= length) {
            return i13;
        }
        long j11 = ((long) i13) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j11);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int zzc(String str, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int length = str.length();
        int i16 = 0;
        while (true) {
            i13 = i11 + i12;
            if (i16 >= length || (i15 = i16 + i11) >= i13 || (cCharAt = str.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i11 + length;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char cCharAt2 = str.charAt(i16);
            if (cCharAt2 < 128 && i17 < i13) {
                bArr[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 < 2048 && i17 <= i13 - 2) {
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i17 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i17 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i13 - 3) {
                    if (i17 > i13 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                            throw new zzor(i16, length);
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i17).length());
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i17);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i18 = i16 + 1;
                    if (i18 != str.length()) {
                        char cCharAt3 = str.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i19 = i17 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i16 = i18;
                        } else {
                            i16 = i18;
                        }
                    }
                    throw new zzor(i16 - 1, length);
                }
                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i17 += 3;
            }
            i16++;
        }
        return i17;
    }

    static /* synthetic */ int zzd(byte[] bArr, int i11, int i12) {
        int i13 = i12 - i11;
        byte b11 = bArr[i11 - 1];
        if (i13 == 0) {
            if (b11 <= -12) {
                return b11;
            }
            return -1;
        }
        if (i13 == 1) {
            byte b12 = bArr[i11];
            if (b11 > -12 || b12 > -65) {
                return -1;
            }
            return (b12 << 8) ^ b11;
        }
        if (i13 != 2) {
            throw new AssertionError();
        }
        byte b13 = bArr[i11];
        byte b14 = bArr[i11 + 1];
        if (b11 > -12 || b13 > -65 || b14 > -65) {
            return -1;
        }
        return (b14 << Tnaf.POW_2_WIDTH) ^ ((b13 << 8) ^ b11);
    }
}
