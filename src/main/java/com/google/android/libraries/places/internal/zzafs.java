package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzafs extends zzafu {
    /* synthetic */ zzafs(zzafr zzafrVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzafu
    final void zza(Object obj, long j11) {
        ((zzafg) zzahs.zzf(obj, j11)).zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzafu
    final void zzb(Object obj, Object obj2, long j11) {
        zzafg zzafgVarZzf = (zzafg) zzahs.zzf(obj, j11);
        zzafg zzafgVar = (zzafg) zzahs.zzf(obj2, j11);
        int size = zzafgVarZzf.size();
        int size2 = zzafgVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzafgVarZzf.zzc()) {
                zzafgVarZzf = zzafgVarZzf.zzf(size2 + size);
            }
            zzafgVarZzf.addAll(zzafgVar);
        }
        if (size > 0) {
            zzafgVar = zzafgVarZzf;
        }
        zzahs.zzs(obj, j11, zzafgVar);
    }

    private zzafs() {
        super(null);
    }
}
