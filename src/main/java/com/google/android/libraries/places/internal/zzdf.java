package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.CancellationToken;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdf {
    private final zzft zza;

    protected zzdf(zzft zzftVar) {
        this.zza = zzftVar;
    }

    protected final CancellationToken zza() {
        return this.zza.getCancellationToken();
    }

    protected final zzft zzb() {
        return this.zza;
    }

    protected abstract String zzc();

    protected abstract Map zzd();
}
