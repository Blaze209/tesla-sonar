package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzma {
    private final zzmc zza = new zzmc(null);

    public final zzma zza(zzni zzniVar) {
        this.zza.zza = zzniVar;
        return this;
    }

    public final zzma zzb(int i11) {
        this.zza.zzb = i11;
        return this;
    }

    public final zzma zzc(byte[] bArr) {
        this.zza.zzc = bArr;
        return this;
    }

    public final zzmc zzd() {
        return this.zza;
    }
}
