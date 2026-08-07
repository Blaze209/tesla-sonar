package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzij extends zzhr {
    final zzhw zzc;
    int zzd = 0;
    int zze = Integer.MAX_VALUE;
    final CharSequence zzb = "2.7.0";

    protected zzij(zzik zzikVar, CharSequence charSequence) {
        this.zzc = zzikVar.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzhr
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i11 = this.zzd;
        while (true) {
            int i12 = this.zzd;
            if (i12 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i12);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzd = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzd = iZzc;
            }
            if (iZzc != i11) {
                if (i11 < iZzd) {
                    this.zzb.charAt(i11);
                }
                if (i11 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i13 = this.zze;
                if (i13 == 1) {
                    iZzd = this.zzb.length();
                    this.zzd = -1;
                    if (iZzd > i11) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zze = i13 - 1;
                }
                return this.zzb.subSequence(i11, iZzd).toString();
            }
            int i14 = iZzc + 1;
            this.zzd = i14;
            if (i14 > this.zzb.length()) {
                this.zzd = -1;
            }
        }
    }

    abstract int zzc(int i11);

    abstract int zzd(int i11);
}
