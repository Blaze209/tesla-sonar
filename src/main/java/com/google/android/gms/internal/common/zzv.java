package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i11 = this.zze;
        while (true) {
            int i12 = this.zze;
            if (i12 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i12);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i11) {
                int i13 = iZzd + 1;
                this.zze = i13;
                if (i13 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i11 < iZzc) {
                    this.zzb.charAt(i11);
                }
                if (i11 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i11 != iZzc) {
                    int i14 = this.zzf;
                    if (i14 == 1) {
                        CharSequence charSequence = this.zzb;
                        int length = charSequence.length();
                        this.zze = -1;
                        if (length > i11) {
                            charSequence.charAt(length - 1);
                        }
                        iZzc = length;
                    } else {
                        this.zzf = i14 - 1;
                    }
                    return this.zzb.subSequence(i11, iZzc).toString();
                }
                i11 = this.zze;
            }
        }
    }

    abstract int zzc(int i11);

    abstract int zzd(int i11);
}
