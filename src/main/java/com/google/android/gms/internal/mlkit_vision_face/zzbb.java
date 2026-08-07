package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzbb extends zzaq {
    final /* synthetic */ zzbd zza;
    private final Object zzb;
    private int zzc;

    zzbb(zzbd zzbdVar, int i11) {
        this.zza = zzbdVar;
        this.zzb = zzbd.zzg(zzbdVar, i11);
        this.zzc = i11;
    }

    private final void zza() {
        int i11 = this.zzc;
        if (i11 == -1 || i11 >= this.zza.size() || !zzx.zza(this.zzb, zzbd.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzv(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
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
        return zzbd.zzj(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
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
        Object objZzj = zzbd.zzj(this.zza, i11);
        zzbd.zzm(this.zza, this.zzc, obj);
        return objZzj;
    }
}
