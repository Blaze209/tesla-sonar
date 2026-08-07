package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzap {
    private final zzar zza = new zzar(null);

    public final zzap zza(zzfb zzfbVar) {
        this.zza.zzb = zzfbVar;
        return this;
    }

    public final zzap zzb(byte[] bArr) {
        this.zza.zzd = bArr;
        return this;
    }

    public final zzap zzc(zzfp zzfpVar) {
        this.zza.zze = zzfpVar;
        return this;
    }

    public final zzap zzd(String str) {
        this.zza.zzc = str;
        return this;
    }

    public final zzap zze(zzfs zzfsVar) {
        this.zza.zza = zzfsVar;
        return this;
    }

    public final zzar zzf() {
        return this.zza;
    }
}
