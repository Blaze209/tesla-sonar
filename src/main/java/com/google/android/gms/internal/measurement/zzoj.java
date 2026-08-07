package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = i11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzoj zza() {
        return zza;
    }

    static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i11 = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i11);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i11);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i11, iArrCopyOf, objArrCopyOf, true);
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i11 = this.zzb;
        if (i11 == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzojVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzov zzovVar) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzovVar.zzv(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zzg(zzov zzovVar) {
        if (this.zzb != 0) {
            for (int i11 = 0; i11 < this.zzb; i11++) {
                int i12 = this.zzc[i11];
                Object obj = this.zzd[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zzovVar.zzc(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzovVar.zzj(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzovVar.zzn(i14, (zzlh) obj);
                } else if (i13 == 3) {
                    zzovVar.zzt(i14);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i14);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    zzovVar.zzk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i11 = this.zze;
        if (i11 != -1) {
            return i11;
        }
        int iZzz = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12] >>> 3;
            zzlh zzlhVar = (zzlh) this.zzd[i12];
            int iZzz2 = zzlm.zzz(8);
            int iZzz3 = zzlm.zzz(16) + zzlm.zzz(i13);
            int iZzz4 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzlm.zzz(iZzc) + iZzc;
        }
        this.zze = iZzz;
        return iZzz;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
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
                    iZzz2 = zzlm.zzz(i15 << 3) + 8;
                } else if (i16 == 2) {
                    int i17 = i15 << 3;
                    zzlh zzlhVar = (zzlh) this.zzd[i13];
                    int iZzz3 = zzlm.zzz(i17);
                    int iZzc = zzlhVar.zzc();
                    iZzz2 = iZzz3 + zzlm.zzz(iZzc) + iZzc;
                } else if (i16 == 3) {
                    int iZzz4 = zzlm.zzz(i15 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzoj) this.zzd[i13]).zzi();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i13]).getClass();
                    iZzz2 = zzlm.zzz(i15 << 3) + 4;
                }
                i12 += iZzz2;
            } else {
                int i18 = i15 << 3;
                long jLongValue = ((Long) this.zzd[i13]).longValue();
                iZzz = zzlm.zzz(i18);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i12 += iZzz2;
        }
        this.zze = i12;
        return i12;
    }

    final void zzj(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.zzb; i12++) {
            zzno.zzb(sb2, i11, String.valueOf(this.zzc[i12] >>> 3), this.zzd[i12]);
        }
    }

    final void zzk(int i11, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i12 = this.zzb;
        iArr[i12] = i11;
        this.zzd[i12] = obj;
        this.zzb = i12 + 1;
    }

    final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i11 = this.zzb + zzojVar.zzb;
        zzm(i11);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i11;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
