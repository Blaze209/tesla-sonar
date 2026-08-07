package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzkx {
    private static String zza = "com.google.android.libraries.places.internal.zzlc";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.libraries.places.internal.zzlc", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzmc.zza();
    }

    public static long zzb() {
        return zzkv.zza.zzc();
    }

    public static zzkg zzd(String str) {
        return zzkv.zza.zze(str);
    }

    public static zzki zzf() {
        return zzi().zza();
    }

    public static zzkw zzg() {
        return zzkv.zza.zzh();
    }

    public static zzll zzi() {
        return zzkv.zza.zzj();
    }

    public static zzly zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zzkv.zza.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z11) {
        zzi().zzd(str, level, z11);
        return false;
    }

    protected long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract zzkg zze(String str);

    protected abstract zzkw zzh();

    protected zzll zzj() {
        return zzll.zze();
    }

    protected abstract String zzm();
}
