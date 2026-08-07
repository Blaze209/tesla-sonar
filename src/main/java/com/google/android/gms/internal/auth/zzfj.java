package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes5.dex */
final class zzfj extends zzfl {
    /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zza(Object obj, long j11) {
        ((zzez) zzhj.zzf(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    final void zzb(Object obj, Object obj2, long j11) {
        zzez zzezVarZzd = (zzez) zzhj.zzf(obj, j11);
        zzez zzezVar = (zzez) zzhj.zzf(obj2, j11);
        int size = zzezVarZzd.size();
        int size2 = zzezVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVarZzd.zzc()) {
                zzezVarZzd = zzezVarZzd.zzd(size2 + size);
            }
            zzezVarZzd.addAll(zzezVar);
        }
        if (size > 0) {
            zzezVar = zzezVarZzd;
        }
        zzhj.zzp(obj, j11, zzezVar);
    }

    private zzfj() {
        super(null);
    }
}
