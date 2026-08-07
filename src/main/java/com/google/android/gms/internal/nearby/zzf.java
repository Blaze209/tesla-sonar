package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes5.dex */
final class zzf extends zzi {
    private String zza;
    private byte zzb;
    private int zzc;

    zzf() {
    }

    public final zzi zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zzi
    public final zzi zzb(boolean z11) {
        this.zzb = (byte) (this.zzb | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zzi
    public final zzi zzc(boolean z11) {
        this.zzb = (byte) (this.zzb | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zzi
    public final zzj zzd() {
        if (this.zzb == 3 && this.zza != null && this.zzc != 0) {
            return new zzh(this.zza, false, false, null, null, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if ((this.zzb & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((this.zzb & 2) == 0) {
            sb2.append(" skipChecks");
        }
        if (this.zzc == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.nearby.zzi
    public final zzi zze(int i11) {
        this.zzc = 1;
        return this;
    }
}
