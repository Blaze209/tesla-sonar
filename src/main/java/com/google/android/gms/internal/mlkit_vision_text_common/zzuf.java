package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import tv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzuf implements zztr {
    private final zzow zza;
    private zzsr zzb = new zzsr();
    private final int zzc;

    private zzuf(zzow zzowVar, int i11) {
        this.zza = zzowVar;
        zzuo.zza();
        this.zzc = i11;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i11) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.zza.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.zzb = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzstVarZzf = this.zza.zzj().zzf();
        return (zzstVarZzf == null || zzy.zzb(zzstVarZzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzstVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzuo.zza();
            if (i11 == 0) {
                return new d().i(zzmq.zza).j(true).h().encode(this.zza.zzj()).getBytes("utf-8");
            }
            zzoy zzoyVarZzj = this.zza.zzj();
            zzdb zzdbVar = new zzdb();
            zzmq.zza.configure(zzdbVar);
            return zzdbVar.zza().zza(zzoyVarZzj);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}
