package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzhn implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzht zza;

    zzhn(zzht zzhtVar) {
        Objects.requireNonNull(zzhtVar);
        this.zza = zzhtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i11, String str, List list, boolean z11, boolean z12) {
        zzgs zzgsVarZzj;
        int i12 = i11 - 1;
        if (i12 == 0) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzj();
        } else if (i12 != 1) {
            if (i12 == 3) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzk();
            } else if (i12 != 4) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzi();
            } else if (z11) {
                zzgsVarZzj = this.zza.zzu.zzaV().zzf();
            } else {
                zzgsVarZzj = !z12 ? this.zza.zzu.zzaV().zzh() : this.zza.zzu.zzaV().zze();
            }
        } else if (z11) {
            zzgsVarZzj = this.zza.zzu.zzaV().zzc();
        } else {
            zzgsVarZzj = !z12 ? this.zza.zzu.zzaV().zzd() : this.zza.zzu.zzaV().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzgsVarZzj.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgsVarZzj.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVarZzj.zza(str);
        } else {
            zzgsVarZzj.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
