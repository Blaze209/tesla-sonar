package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class zzc {
    private int zza = 0;

    public final zzc zza(int i11) {
        this.zza = i11;
        return this;
    }

    public final zze zzb() {
        Preconditions.checkArgument(this.zza != 0, "deviceType must be set.");
        return new zze(this.zza, false, null, hashCode(), null);
    }
}
