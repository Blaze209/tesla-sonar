package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzaeq {
    private static final zzaeo zza = new zzaep();
    private static final zzaeo zzb;

    static {
        zzaeo zzaeoVar = null;
        try {
            zzaeoVar = (zzaeo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzaeoVar;
    }

    static zzaeo zza() {
        zzaeo zzaeoVar = zzb;
        if (zzaeoVar != null) {
            return zzaeoVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzaeo zzb() {
        return zza;
    }
}
