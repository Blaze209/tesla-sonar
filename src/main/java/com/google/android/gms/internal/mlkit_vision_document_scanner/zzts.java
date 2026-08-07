package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import tv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class zzts implements zzth {
    private final zznv zza;
    private zzsj zzb = new zzsj();

    private zzts(zznv zznvVar, int i11) {
        this.zza = zznvVar;
        zzua.zza();
    }

    public static zzth zze(zznv zznvVar) {
        return new zzts(zznvVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzth
    public final byte[] zza(int i11, boolean z11) {
        this.zzb.zzi(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zzg(Boolean.FALSE);
        zzsk zzskVarZzl = this.zzb.zzl();
        zznv zznvVar = this.zza;
        zznvVar.zza(zzskVarZzl);
        try {
            zzua.zza();
            if (i11 == 0) {
                return new d().i(zzlo.zza).j(true).h().encode(zznvVar.zzf()).getBytes("utf-8");
            }
            zznw zznwVarZzf = zznvVar.zzf();
            zzat zzatVar = new zzat();
            zzlo.zza.configure(zzatVar);
            return zzatVar.zza().zza(zznwVarZzf);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzth
    public final zzth zzb(zzsj zzsjVar) {
        this.zzb = zzsjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzth
    public final zzth zzc(zznu zznuVar) {
        this.zza.zzb(zznuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzth
    public final String zzd() {
        String strZzd;
        zzsk zzskVarZza = this.zza.zzf().zza();
        return (zzskVarZza == null || (strZzd = zzskVarZza.zzd()) == null || strZzd.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzskVarZza.zzd());
    }
}
