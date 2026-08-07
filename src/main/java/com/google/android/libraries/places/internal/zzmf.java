package com.google.android.libraries.places.internal;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzmf {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzmf(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c11 = cArr[i11];
            boolean z11 = true;
            zzig.zzf(c11 < 128, "Non-ASCII character: %s", c11);
            if (bArr[c11] != -1) {
                z11 = false;
            }
            zzig.zzf(z11, "Duplicate character: %s", c11);
            bArr[c11] = (byte) i11;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzmf) && Arrays.equals(this.zzf, ((zzmf) obj).zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i11) {
        return this.zzf[i11];
    }

    public final boolean zzb(char c11) {
        return c11 < 128 && this.zzg[c11] != -1;
    }

    private zzmf(String str, char[] cArr, byte[] bArr, boolean z11) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzacl.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i11 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i11;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i11];
            for (int i12 = 0; i12 < this.zzd; i12++) {
                zArr[zzacl.zza(i12 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
        }
    }
}
