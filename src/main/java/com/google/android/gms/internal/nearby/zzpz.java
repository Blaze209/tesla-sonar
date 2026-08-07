package com.google.android.gms.internal.nearby;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class zzpz {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzpz(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c11 = cArr[i11];
            boolean z11 = true;
            zzpm.zzf(c11 < 128, "Non-ASCII character: %s", c11);
            if (bArr[c11] != -1) {
                z11 = false;
            }
            zzpm.zzf(z11, "Duplicate character: %s", c11);
            bArr[c11] = (byte) i11;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzpz) && Arrays.equals(this.zzf, ((zzpz) obj).zzf);
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

    final int zzb(char c11) throws zzqc {
        if (c11 > 127) {
            throw new zzqc("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c11))));
        }
        byte b11 = this.zzg[c11];
        if (b11 != -1) {
            return b11;
        }
        if (c11 <= ' ' || c11 == 127) {
            throw new zzqc("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c11))));
        }
        throw new zzqc("Unrecognized character: " + c11);
    }

    final boolean zzc(int i11) {
        return this.zzh[i11 % this.zzc];
    }

    public final boolean zzd(char c11) {
        return c11 < 128 && this.zzg[c11] != -1;
    }

    private zzpz(String str, char[] cArr, byte[] bArr, boolean z11) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzqh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i11 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i11;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i11];
            for (int i12 = 0; i12 < this.zzd; i12++) {
                zArr[zzqh.zza(i12 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e11) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e11);
        }
    }
}
