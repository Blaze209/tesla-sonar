package com.google.android.libraries.places.internal;

import com.plaid.internal.EnumC4419g;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes5.dex */
final class zzahw {
    private static final zzaht zza;

    static {
        if (zzahs.zzx() && zzahs.zzy()) {
            int i11 = zzads.zza;
        }
        zza = new zzahu();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i11, int i12) {
        byte b11 = bArr[i11 - 1];
        int i13 = i12 - i11;
        if (i13 == 0) {
            if (b11 > -12) {
                return -1;
            }
            return b11;
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

    static int zzb(CharSequence charSequence, byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        char cCharAt;
        int length = charSequence.length();
        int i15 = i12 + i11;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i11) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i11 + length;
        }
        int i17 = i11 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 < 128 && i17 < i15) {
                bArr[i17] = (byte) cCharAt2;
                i17++;
            } else if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                int i18 = i17 + 1;
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                i17 += 2;
                bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i17 > i15 - 3) {
                    if (i17 > i15 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                            throw new zzahv(i16, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                    }
                    int i19 = i16 + 1;
                    if (i19 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i19);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i17] = (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i21 = i17 + 3;
                            bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i17 += 4;
                            bArr[i21] = (byte) ((codePoint & 63) | 128);
                            i16 = i19;
                        } else {
                            i16 = i19;
                        }
                    }
                    throw new zzahv(i16 - 1, length);
                }
                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i22 = i17 + 2;
                bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i17 += 3;
                bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
            }
            i16++;
        }
        return i17;
    }

    static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (i12 < length) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i12 < length2) {
                    char cCharAt2 = charSequence.charAt(i12);
                    if (cCharAt2 < 2048) {
                        i11 += (127 - cCharAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i12) < 65536) {
                                throw new zzahv(i12, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i13) + 4294967296L));
    }

    static boolean zzd(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zze(byte[] bArr, int i11, int i12) {
        return zza.zzb(bArr, 0, i12);
    }
}
