package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DiscoveredEndpointInfo {
    private final String zza;
    private final String zzb;
    private final BluetoothDevice zzc;
    private final byte[] zzd;

    /* synthetic */ DiscoveredEndpointInfo(String str, String str2, BluetoothDevice bluetoothDevice, byte[] bArr, zzt zztVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bluetoothDevice;
        this.zzd = bArr;
    }

    @NonNull
    public byte[] getEndpointInfo() {
        return this.zzd;
    }

    @NonNull
    public String getEndpointName() {
        return this.zzb;
    }

    @NonNull
    public String getServiceId() {
        return this.zza;
    }

    @Deprecated
    public DiscoveredEndpointInfo(@NonNull String str, @NonNull String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = str2.getBytes();
        this.zzc = null;
    }
}
