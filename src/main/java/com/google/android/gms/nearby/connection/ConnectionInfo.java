package com.google.android.gms.nearby.connection;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionInfo {
    private final String zza;
    private final String zzb;
    private final byte[] zzc;
    private final boolean zzd;
    private final boolean zze;
    private final byte[] zzf;
    private final int zzg;

    private ConnectionInfo(String str, String str2, byte[] bArr, boolean z11, boolean z12, byte[] bArr2, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = z11;
        this.zze = z12;
        this.zzf = bArr2;
        this.zzg = i11;
    }

    @NonNull
    public String getAuthenticationDigits() {
        int i11 = 1;
        int i12 = 0;
        for (byte b11 : this.zzc) {
            int i13 = i12 + (b11 * i11);
            i11 = (i11 * 31) % 9973;
            i12 = i13 % 9973;
        }
        return String.format(Locale.US, "%04d", Integer.valueOf(Math.abs(i12)));
    }

    public int getAuthenticationStatus() {
        return this.zzg;
    }

    @NonNull
    @Deprecated
    public String getAuthenticationToken() {
        return this.zzb;
    }

    @NonNull
    public byte[] getEndpointInfo() {
        return this.zzf;
    }

    @NonNull
    public String getEndpointName() {
        return this.zza;
    }

    @NonNull
    public byte[] getRawAuthenticationToken() {
        return this.zzc;
    }

    @Deprecated
    public boolean isConnectionVerified() {
        return this.zze;
    }

    public boolean isIncomingConnection() {
        return this.zzd;
    }

    @Deprecated
    public ConnectionInfo(@NonNull String str, @NonNull String str2, boolean z11) {
        this(str, str2, str2.getBytes(), z11, false, str.getBytes(), 0);
    }
}
