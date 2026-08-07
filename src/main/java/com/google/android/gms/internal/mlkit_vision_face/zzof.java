package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import tv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzof implements zznr {
    private final zzku zza;
    private zzmt zzb = new zzmt();
    private final int zzc;

    private zzof(zzku zzkuVar, int i11) {
        this.zza = zzkuVar;
        zzoo.zza();
        this.zzc = i11;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i11) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.zzb = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.zza.zzj().zzf();
        return (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzmvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzoo.zza();
            if (i11 == 0) {
                return new d().i(zzix.zza).j(true).h().encode(this.zza.zzj()).getBytes("utf-8");
            }
            zzkw zzkwVarZzj = this.zza.zzj();
            zzcy zzcyVar = new zzcy();
            zzix.zza.configure(zzcyVar);
            return zzcyVar.zza().zza(zzkwVarZzj);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}
