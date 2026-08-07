package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import tv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i11) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzlaVarZzc = this.zza.zzf().zzc();
        return (zzlaVarZzc == null || zzg.zzb(zzlaVarZzc.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzlaVarZzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i11 == 0) {
                return new d().i(zzhe.zza).j(true).h().encode(this.zza.zzf()).getBytes("utf-8");
            }
            zziy zziyVarZzf = this.zza.zzf();
            zzam zzamVar = new zzam();
            zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zziyVarZzf);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}
