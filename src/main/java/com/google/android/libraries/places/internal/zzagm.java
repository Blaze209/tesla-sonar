package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzagm {
    private static final zzagl zza;
    private static final zzagl zzb;

    static {
        zzagl zzaglVar = null;
        try {
            zzaglVar = (zzagl) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzaglVar;
        zzb = new zzagl();
    }

    static zzagl zza() {
        return zza;
    }

    static zzagl zzb() {
        return zzb;
    }
}
