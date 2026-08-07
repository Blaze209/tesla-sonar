package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzgt zzc() {
        return zza;
    }

    static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i11 = zzgtVar.zzb + zzgtVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgtVar.zzc, i11);
        System.arraycopy(zzgtVar2.zzc, 0, iArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgtVar.zzd, i11);
        System.arraycopy(zzgtVar2.zzd, 0, objArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i11, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i11) {
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
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i11 = this.zzb;
        if (i11 == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgtVar.zzd;
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
        int i15 = ((i12 * 31) + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzb; i13++) {
            int i14 = this.zzc[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.zzd[i13]).getClass();
                    iZzA2 = zzdn.zzA(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zzdf zzdfVar = (zzdf) this.zzd[i13];
                    int iZzA3 = zzdn.zzA(i17);
                    int iZzd = zzdfVar.zzd();
                    iZzA2 = iZzA3 + zzdn.zzA(iZzd) + iZzd;
                } else if (i16 == 3) {
                    int iZzA4 = zzdn.zzA(i15 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzgt) this.zzd[i13]).zza();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i13]).getClass();
                    iZzA2 = zzdn.zzA(i15 << 3) + 4;
                }
                i12 += iZzA2;
            } else {
                int i18 = i15 << 3;
                long jLongValue = ((Long) this.zzd[i13]).longValue();
                iZzA = zzdn.zzA(i18);
                iZzB = zzdn.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i12 += iZzA2;
        }
        this.zze = i12;
        return i12;
    }

    public final int zzb() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int iZzA = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12] >>> 3;
            zzdf zzdfVar = (zzdf) this.zzd[i12];
            int iZzA2 = zzdn.zzA(8);
            int iZzA3 = zzdn.zzA(16) + zzdn.zzA(i13);
            int iZzA4 = zzdn.zzA(24);
            int iZzd = zzdfVar.zzd();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zzdn.zzA(iZzd) + iZzd;
        }
        this.zze = iZzA;
        return iZzA;
    }

    final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i11 = this.zzb + zzgtVar.zzb;
        zzm(i11);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
        this.zzb = i11;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzfo.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    final void zzj(int i11, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i12 = this.zzb;
        iArr[i12] = i11;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }

    final void zzk(zzhh zzhhVar) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzhhVar.zzw(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zzl(zzhh zzhhVar) {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zzhhVar.zzt(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzhhVar.zzm(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzhhVar.zzd(i14, (zzdf) obj);
                } else if (i13 == 3) {
                    zzhhVar.zzF(i14);
                    ((zzgt) obj).zzl(zzhhVar);
                    zzhhVar.zzh(i14);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    zzhhVar.zzk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }
}
