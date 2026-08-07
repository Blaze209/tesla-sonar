package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z11, int i11, int i12, String str, Throwable th2, long j11) {
        this.zza = z11;
        this.zzd = i11;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    static zzy zzb() {
        return zze;
    }

    static zzy zzc(@NonNull String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    static zzy zzd(@NonNull String str, @NonNull Throwable th2) {
        return new zzy(false, 1, 5, str, th2, -1L);
    }

    public static zzy zzf(int i11, long j11) {
        return new zzy(true, i11, 1, null, null, j11);
    }

    static zzy zzg(int i11, int i12, @NonNull String str, Throwable th2) {
        return new zzy(false, i11, i12, str, th2, -1L);
    }

    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.zzc;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", zza(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }

    /* synthetic */ zzy(boolean z11, int i11, int i12, String str, Throwable th2, long j11, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
