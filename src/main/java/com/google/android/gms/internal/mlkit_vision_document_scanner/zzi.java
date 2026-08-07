package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
public final class zzi {
    private final zzu zza;
    private final zzu zzb;
    private Boolean zzc;

    private zzi() {
        int i11 = zzx.zzd;
        this.zza = new zzu();
        this.zzb = new zzu();
    }

    public final zzi zza() {
        zzn.zzb(this.zzc == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzc = Boolean.TRUE;
        return this;
    }

    public final zzi zzb() {
        zzn.zzb(this.zzc == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzc = Boolean.FALSE;
        return this;
    }

    public final zzi zzc(zzm zzmVar) {
        zzn.zzc(this.zzc, "Must call internal() or external() before appending rules.");
        this.zza.zza(zzmVar);
        return this;
    }

    public final zzj zzd() {
        zzn.zzc(this.zzc, "Must call internal() or external() when building a SourcePolicy.");
        return new zzj(this.zzc.booleanValue(), false, this.zza.zzb(), this.zzb.zzb(), null);
    }

    /* synthetic */ zzi(byte[] bArr) {
        int i11 = zzx.zzd;
        this.zza = new zzu();
        this.zzb = new zzu();
    }
}
