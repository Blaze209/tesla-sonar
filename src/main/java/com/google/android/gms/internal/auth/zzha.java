package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z11;
    }

    public static zzha zza() {
        return zza;
    }

    static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i11 = zzhaVar.zzb + zzhaVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhaVar.zzc, i11);
        System.arraycopy(zzhaVar2.zzc, 0, iArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhaVar.zzd, i11);
        System.arraycopy(zzhaVar2.zzd, 0, objArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        return new zzha(i11, iArrCopyOf, objArrCopyOf, true);
    }

    static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i11) {
        int[] iArr = this.zzc;
        if (i11 > iArr.length) {
            int i12 = this.zzb;
            int i13 = i12 + (i12 / 2);
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i11);
            this.zzd = Arrays.copyOf(this.zzd, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i11 = this.zzb;
        if (i11 == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzhaVar.zzd;
            int i13 = this.zzb;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.zzb;
        int i12 = i11 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 * 31) + i13;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return (i15 * 31) + iHashCode;
    }

    final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i11 = this.zzb + zzhaVar.zzb;
        zzi(i11);
        System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i11;
        return this;
    }

    final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    final void zzg(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzfz.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    final void zzh(int i11, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i12 = this.zzb;
        iArr[i12] = i11;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
