package com.google.android.gms.internal.nearby;

import android.util.Log;
import androidx.collection.x0;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhc {
    private final ExecutorService zza;
    private final x0 zzb;
    private volatile boolean zzc;
    private final x0 zzd;
    private final x0 zze;

    public zzhc() {
        zzn.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zzb = new x0();
        this.zzc = false;
        this.zzd = new x0();
        this.zze = new x0();
    }

    static /* bridge */ /* synthetic */ void zza(zzhc zzhcVar, OutputStream outputStream, boolean z11, long j11) {
        try {
            try {
                outputStream.write(z11 ? 1 : 0);
            } catch (IOException e11) {
                Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j11)), e11);
            }
        } finally {
            IOUtils.closeQuietly(outputStream);
        }
    }

    final synchronized void zzb(long j11) {
        x0 x0Var = this.zzb;
        Long lValueOf = Long.valueOf(j11);
        IOUtils.closeQuietly((Closeable) x0Var.get(lValueOf));
        this.zzb.remove(lValueOf);
        IOUtils.closeQuietly((Closeable) this.zzd.get(lValueOf));
        this.zzd.remove(lValueOf);
        zzhk zzhkVar = (zzhk) this.zze.remove(lValueOf);
        if (zzhkVar != null) {
            IOUtils.closeQuietly(zzhkVar.zzf());
            IOUtils.closeQuietly(zzhkVar.zzg());
        }
    }

    final synchronized void zzc(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, zzhk zzhkVar, long j11) throws Throwable {
        try {
            try {
                x0 x0Var = this.zzb;
                Long lValueOf = Long.valueOf(j11);
                x0Var.put(lValueOf, inputStream);
                this.zzd.put(lValueOf, outputStream);
                this.zze.put(lValueOf, zzhkVar);
                this.zza.execute(new zzhb(this, inputStream, outputStream, j11, outputStream2));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    final synchronized void zzd() {
        try {
            this.zzc = true;
            this.zza.shutdownNow();
            for (int i11 = 0; i11 < this.zzb.getSize(); i11++) {
                IOUtils.closeQuietly((Closeable) this.zzb.m(i11));
            }
            this.zzb.clear();
            for (int i12 = 0; i12 < this.zzd.getSize(); i12++) {
                IOUtils.closeQuietly((Closeable) this.zzd.m(i12));
            }
            this.zzd.clear();
            for (int i13 = 0; i13 < this.zze.getSize(); i13++) {
                zzhk zzhkVar = (zzhk) this.zze.m(i13);
                IOUtils.closeQuietly(zzhkVar.zzf());
                IOUtils.closeQuietly(zzhkVar.zzg());
            }
            this.zze.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
