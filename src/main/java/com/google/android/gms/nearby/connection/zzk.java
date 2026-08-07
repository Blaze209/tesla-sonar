package com.google.android.gms.nearby.connection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzk {
    private String zza;
    private String zzb;
    private byte[] zzc;
    private boolean zzd;
    private boolean zze;
    private byte[] zzf;
    private int zzg = 0;

    public final zzk zza(int i11) {
        this.zzg = i11;
        return this;
    }

    @Deprecated
    public final zzk zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzk zzc(byte[] bArr) {
        this.zzf = bArr;
        return this;
    }

    public final zzk zzd(String str) {
        this.zza = str;
        return this;
    }

    @Deprecated
    public final zzk zze(boolean z11) {
        this.zze = z11;
        return this;
    }

    public final zzk zzf(boolean z11) {
        this.zzd = z11;
        return this;
    }

    public final zzk zzg(byte[] bArr) {
        this.zzc = bArr;
        return this;
    }

    public final ConnectionInfo zzh() {
        return new ConnectionInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }
}
