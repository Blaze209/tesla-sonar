package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhq implements zzhp {
    private final zzfz zza;
    private final zzgd zzb;

    public zzhq(zzgd zzgdVar, zzfz zzfzVar, byte[] bArr) {
        this.zzb = zzgdVar;
        this.zza = zzfzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final void zza(zzho zzhoVar) {
        zzza zzzaVarZza = zzzd.zza();
        zzzaVarZza.zzg(zzhoVar.zzz());
        zzzaVarZza.zzd(zzhoVar.zzx());
        zzzaVarZza.zze(zzhoVar.zzy());
        zzzaVarZza.zzj(zzhoVar.zzd());
        zzzaVarZza.zzc(zzhoVar.zzb());
        zzzaVarZza.zzb(zzhoVar.zza());
        zzzaVarZza.zzk(zzhoVar.zze());
        zzzaVarZza.zzh(zzhoVar.zzk().length());
        zzzaVarZza.zzl(zzhoVar.zzg());
        zzzaVarZza.zzf(zzhoVar.zzc());
        zzzaVarZza.zzi(zzhoVar.zzA());
        zzzaVarZza.zza(zzhoVar.zzf());
        if (zzhoVar.zzi() == zzgp.FRAGMENT) {
            zzzaVarZza.zzn(2);
        } else if (zzhoVar.zzi() == zzgp.INTENT) {
            zzzaVarZza.zzn(3);
        } else {
            zzzaVarZza.zzn(1);
        }
        if (zzhoVar.zzj() == AutocompleteActivityMode.FULLSCREEN) {
            zzzaVarZza.zzm(2);
        } else if (zzhoVar.zzj() == AutocompleteActivityMode.OVERLAY) {
            zzzaVarZza.zzm(1);
        }
        zzzd zzzdVar = (zzzd) zzzaVarZza.zzq();
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(10);
        zzzjVarZzb.zzc(zzzdVar);
        this.zzb.zza(zzge.zza((zzzo) zzzjVarZzb.zzq()));
    }
}
