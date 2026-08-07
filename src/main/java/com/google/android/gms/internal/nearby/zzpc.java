package com.google.android.gms.internal.nearby;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpc {
    private static zzpb zza;

    public static synchronized zzpb zza() {
        try {
            if (zza == null) {
                zzb(new zzpg());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public static synchronized void zzb(zzpb zzpbVar) {
        if (zza != null) {
            throw new IllegalStateException("init() already called");
        }
        zza = zzpbVar;
    }
}
