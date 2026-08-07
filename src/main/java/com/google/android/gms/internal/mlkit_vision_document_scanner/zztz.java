package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
public final class zztz {
    private static zzty zza;

    public static synchronized zztp zza(String str) {
        return zzb(zztk.zzd("play-services-mlkit-document-scanner").zzd());
    }

    public static synchronized zztp zzb(zztk zztkVar) {
        try {
            if (zza == null) {
                zza = new zzty(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zztp) zza.get(zztkVar);
    }
}
