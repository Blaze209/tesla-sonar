package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class RangingControleeParameters {
    private final UwbAddress zza;
    private final int zzb;
    private final byte[] zzc;

    public RangingControleeParameters(@NonNull UwbAddress uwbAddress) {
        this.zza = uwbAddress;
        this.zzb = 0;
        this.zzc = null;
    }

    @NonNull
    public UwbAddress getAddress() {
        return this.zza;
    }

    public int getSubSessionId() {
        return this.zzb;
    }

    public byte[] getSubSessionKey() {
        return this.zzc;
    }

    public RangingControleeParameters(@NonNull UwbAddress uwbAddress, int i11, byte[] bArr) {
        this.zza = uwbAddress;
        this.zzb = i11;
        this.zzc = bArr;
    }
}
