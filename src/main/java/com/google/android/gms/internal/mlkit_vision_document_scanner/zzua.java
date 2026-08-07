package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
public final class zzua {
    private static zzua zza;

    private zzua() {
    }

    public static synchronized zzua zza() {
        try {
            if (zza == null) {
                zza = new zzua();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
