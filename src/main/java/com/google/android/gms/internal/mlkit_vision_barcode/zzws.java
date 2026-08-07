package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import tv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzws implements zzwe {
    private final zzrd zza;
    private zzvb zzb = new zzvb();
    private final int zzc;

    private zzws(zzrd zzrdVar, int i11) {
        this.zza = zzrdVar;
        zzxb.zza();
        this.zzc = i11;
    }

    public static zzwe zzf(zzrd zzrdVar) {
        return new zzws(zzrdVar, 0);
    }

    public static zzwe zzg(zzrd zzrdVar, int i11) {
        return new zzws(zzrdVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzb(zzrc zzrcVar) {
        this.zza.zzf(zzrcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzc(zzvb zzvbVar) {
        this.zzb = zzvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final String zzd() {
        zzvd zzvdVarZzg = this.zza.zzk().zzg();
        return (zzvdVarZzg == null || zzba.zzc(zzvdVarZzg.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzvdVarZzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzxb.zza();
            if (i11 == 0) {
                return new d().i(zzox.zza).j(true).h().encode(this.zza.zzk()).getBytes("utf-8");
            }
            zzrf zzrfVarZzk = this.zza.zzk();
            zzfi zzfiVar = new zzfi();
            zzox.zza.configure(zzfiVar);
            return zzfiVar.zza().zza(zzrfVarZzk);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}
