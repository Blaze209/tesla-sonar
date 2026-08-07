package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* JADX INFO: loaded from: classes5.dex */
final class zzaz extends zzby {
    final /* synthetic */ zzgb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzbf zzbfVar, zzgb zzgbVar) {
        super(null);
        this.zza = zzgbVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0055 A[PHI: r4
      0x0055: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:5:0x004f, B:7:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ConnectionLifecycleCallback connectionLifecycleCallback = (ConnectionLifecycleCallback) obj;
        String strZzc = this.zza.zzc();
        com.google.android.gms.nearby.connection.zzk zzkVar = new com.google.android.gms.nearby.connection.zzk();
        zzkVar.zzd(this.zza.zzd());
        zzkVar.zzb(this.zza.zzb());
        zzkVar.zzg(this.zza.zzg());
        zzkVar.zzf(this.zza.zzf());
        zzkVar.zzc(this.zza.zzh());
        zzkVar.zze(this.zza.zze());
        int iZza = this.zza.zza();
        int i11 = zzch.zze;
        int i12 = 0;
        if (iZza != 0) {
            int i13 = 1;
            if (iZza != 1) {
                i13 = 2;
                if (iZza == 2) {
                    i12 = i13;
                }
            } else {
                i12 = i13;
            }
        }
        zzkVar.zza(i12);
        connectionLifecycleCallback.onConnectionInitiated(strZzc, zzkVar.zzh());
    }
}
