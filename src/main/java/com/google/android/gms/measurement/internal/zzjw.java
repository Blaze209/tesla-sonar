package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.util.concurrent.l;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzjw implements l {
    final /* synthetic */ zzoh zza;
    final /* synthetic */ zzlj zzb;

    zzjw(zzlj zzljVar, zzoh zzohVar) {
        this.zza = zzohVar;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    private final void zza() {
        zzic zzicVar = this.zzb.zzu;
        SparseArray sparseArrayZzf = zzicVar.zzd().zzf();
        zzoh zzohVar = this.zza;
        sparseArrayZzf.put(zzohVar.zzc, Long.valueOf(zzohVar.zzb));
        zzhh zzhhVarZzd = zzicVar.zzd();
        int[] iArr = new int[sparseArrayZzf.size()];
        long[] jArr = new long[sparseArrayZzf.size()];
        for (int i11 = 0; i11 < sparseArrayZzf.size(); i11++) {
            iArr[i11] = sparseArrayZzf.keyAt(i11);
            jArr[i11] = ((Long) sparseArrayZzf.valueAt(i11)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhhVarZzd.zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.l
    public final void onFailure(Throwable th2) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zzljVar.zzam(false);
        zzic zzicVar = zzljVar.zzu;
        int iZzaq = (zzicVar.zzc().zzp(null, zzfy.zzaT) ? zzljVar.zzaq(th2) : 2) - 1;
        if (iZzaq == 0) {
            zzicVar.zzaV().zze().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(th2.toString()));
            zzljVar.zzao(1);
            zzljVar.zzy().add(this.zza);
            return;
        }
        if (iZzaq != 1) {
            zzicVar.zzaV().zzb().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), th2);
            zza();
            zzljVar.zzao(1);
            zzljVar.zzz();
            return;
        }
        zzljVar.zzy().add(this.zza);
        if (zzljVar.zzan() > ((Integer) zzfy.zzaw.zzb(null)).intValue()) {
            zzljVar.zzao(1);
            zzicVar.zzaV().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(th2.toString()));
        } else {
            zzicVar.zzaV().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(String.valueOf(zzljVar.zzan())), zzgu.zzl(th2.toString()));
            zzljVar.zzai(zzljVar.zzan());
            int iZzan = zzljVar.zzan();
            zzljVar.zzao(iZzan + iZzan);
        }
    }

    @Override // com.google.common.util.concurrent.l
    public final void onSuccess(Object obj) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zza();
        zzljVar.zzam(false);
        zzljVar.zzao(1);
        zzljVar.zzu.zzaV().zzj().zzb("Successfully registered trigger URI", this.zza.zza);
        zzljVar.zzz();
    }
}
