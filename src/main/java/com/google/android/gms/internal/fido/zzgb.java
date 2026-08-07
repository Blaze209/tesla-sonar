package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzgb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c11 = cArr[i11];
            boolean z11 = true;
            zzbm.zzd(c11 < 128, "Non-ASCII character: %s", c11);
            if (bArr[c11] != -1) {
                z11 = false;
            }
            zzbm.zzd(z11, "Duplicate character: %s", c11);
            bArr[c11] = (byte) i11;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i11) {
        return this.zzf[i11];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final zzgb zzb() {
        int i11;
        boolean z11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i13 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i13])) {
                int i14 = 0;
                while (true) {
                    if (i14 >= cArr.length) {
                        z11 = false;
                        break;
                    }
                    char c11 = cArr[i14];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                zzbm.zzf(!z11, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i12 >= cArr3.length) {
                        break;
                    }
                    char c12 = cArr3[i12];
                    if (zzba.zza(c12)) {
                        c12 ^= 32;
                    }
                    cArr2[i12] = (char) c12;
                    i12++;
                }
                zzgb zzgbVar = new zzgb(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i11 = 65; i11 <= 90; i11++) {
                    int i15 = i11 | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b11 = bArr2[i11];
                    byte b12 = bArr2[i15];
                    if (b11 == -1) {
                        bArrCopyOf[i11] = b12;
                    } else {
                        char c13 = (char) i11;
                        char c14 = (char) i15;
                        if (b12 != -1) {
                            throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                        }
                        bArrCopyOf[i15] = b11;
                    }
                }
                return new zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, bArrCopyOf, true);
            }
            i13++;
        }
    }

    public final boolean zzc(char c11) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z11) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i11 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i11;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i11];
            for (int i12 = 0; i12 < this.zzd; i12++) {
                zArr[zzgh.zza(i12 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z11;
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
        }
    }
}
