package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class zzh {
    public static final zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzaf zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    /* synthetic */ zzh(boolean z11, boolean z12, zzaf zzafVar, zzg zzgVar) {
        this.zzb = z11;
        this.zzd = zzafVar;
    }

    static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z11 = zzhVar.zzc;
        return false;
    }

    static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i11 = 0;
        while (i11 < size) {
            int iZza = ((zzk) zzafVar.get(i11)).zza(context, zzjVar, zzhVar.zzb) - 1;
            i11++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
