package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;

/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Reserved({1000})
public final class zzhr {
    private final zzht zza = new zzht(null);

    public final zzhr zza(zzfb zzfbVar) {
        this.zza.zzb = zzfbVar;
        return this;
    }

    public final zzhr zzb(zzfe zzfeVar) {
        this.zza.zzg = zzfeVar;
        return this;
    }

    public final zzhr zzc(zzfh zzfhVar) {
        this.zza.zzc = zzfhVar;
        return this;
    }

    public final zzhr zzd(byte[] bArr) {
        this.zza.zzh = bArr;
        return this;
    }

    public final zzhr zze(byte[] bArr) {
        this.zza.zzf = bArr;
        return this;
    }

    public final zzhr zzf(String str) {
        this.zza.zzd = str;
        return this;
    }

    public final zzhr zzg(ConnectionOptions connectionOptions) {
        this.zza.zzi = connectionOptions;
        return this;
    }

    public final zzhr zzh(String str) {
        this.zza.zze = str;
        return this;
    }

    public final zzhr zzi(zzfs zzfsVar) {
        this.zza.zza = zzfsVar;
        return this;
    }

    public final zzht zzj() {
        return this.zza;
    }
}
