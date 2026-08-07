package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzay extends zzam {
    final /* synthetic */ zzba zza;
    private final Object zzb;
    private int zzc;

    zzay(zzba zzbaVar, int i11) {
        this.zza = zzbaVar;
        this.zzb = zzba.zzg(zzbaVar, i11);
        this.zzc = i11;
    }

    private final void zza() {
        int i11 = this.zzc;
        if (i11 == -1 || i11 >= this.zza.size() || !zzw.zza(this.zzb, zzba.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i11 = this.zzc;
        if (i11 == -1) {
            return null;
        }
        return zzba.zzj(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i11 = this.zzc;
        if (i11 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzba zzbaVar = this.zza;
        Object objZzj = zzba.zzj(zzbaVar, i11);
        zzba.zzn(zzbaVar, this.zzc, obj);
        return objZzj;
    }
}
