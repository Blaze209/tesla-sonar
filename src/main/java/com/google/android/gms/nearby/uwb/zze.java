package com.google.android.gms.nearby.uwb;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
public final class zze implements Api.ApiOptions.HasOptions {
    private final int zzb;
    private final int zzd;
    private final boolean zzc = false;
    private final String zza = null;

    /* synthetic */ zze(int i11, boolean z11, String str, int i12, zzd zzdVar) {
        this.zzb = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzeVar.zzb)) && Objects.equal(null, null) && Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzeVar.zzd));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Boolean.FALSE, null, Integer.valueOf(this.zzd));
    }

    public final int zza() {
        return this.zzb;
    }
}
