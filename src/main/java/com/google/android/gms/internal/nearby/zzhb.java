package com.google.android.gms.internal.nearby;

import android.util.Log;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzhb implements Runnable {
    final /* synthetic */ InputStream zza;
    final /* synthetic */ OutputStream zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ OutputStream zzd;
    final /* synthetic */ zzhc zze;

    zzhb(zzhc zzhcVar, InputStream inputStream, OutputStream outputStream, long j11, OutputStream outputStream2) {
        this.zza = inputStream;
        this.zzb = outputStream;
        this.zzc = j11;
        this.zzd = outputStream2;
        this.zze = zzhcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z11 = false;
        try {
            IOUtils.copyStream(this.zza, this.zzb, false, 65536);
            IOUtils.closeQuietly(this.zza);
            zzhc.zza(this.zze, this.zzd, false, this.zzc);
        } catch (IOException e11) {
            try {
                if (this.zze.zzc) {
                    Log.d("NearbyConnections", String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.zzc)));
                } else {
                    Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.zzc)), e11);
                }
                IOUtils.closeQuietly(this.zza);
                zzhc.zza(this.zze, this.zzd, true, this.zzc);
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                IOUtils.closeQuietly(this.zza);
                zzhc.zza(this.zze, this.zzd, z11, this.zzc);
                IOUtils.closeQuietly(this.zzb);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly(this.zza);
            zzhc.zza(this.zze, this.zzd, z11, this.zzc);
            IOUtils.closeQuietly(this.zzb);
            throw th;
        }
        IOUtils.closeQuietly(this.zzb);
    }
}
