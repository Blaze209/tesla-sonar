package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzago {
    private static final zzago zza = new zzago();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzags zzb = new zzafy();

    private zzago() {
    }

    public static zzago zza() {
        return zza;
    }

    public final zzagr zzb(Class cls) {
        zzafh.zzf(cls, "messageType");
        zzagr zzagrVar = (zzagr) this.zzc.get(cls);
        if (zzagrVar != null) {
            return zzagrVar;
        }
        zzagr zzagrVarZza = this.zzb.zza(cls);
        zzafh.zzf(cls, "messageType");
        zzafh.zzf(zzagrVarZza, "schema");
        zzagr zzagrVar2 = (zzagr) this.zzc.putIfAbsent(cls, zzagrVarZza);
        return zzagrVar2 == null ? zzagrVarZza : zzagrVar2;
    }
}
