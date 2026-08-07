package com.google.android.libraries.places.internal;

import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzkm {
    private static final zzkq zza = new zzkj();
    private static final zzkp zzb = new zzkk();
    private final zzkq zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzkp zzf = null;

    public final zzkm zza(zzkp zzkpVar) {
        this.zzf = zzkpVar;
        return this;
    }

    public final zzkr zzd() {
        return new zzko(this, null);
    }

    final void zzg(zzkd zzkdVar) {
        zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
        if (!zzkdVar.zzb()) {
            zzkq zzkqVar = zza;
            zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
            this.zzd.remove(zzkdVar);
            this.zzc.put(zzkdVar, zzkqVar);
            return;
        }
        zzkp zzkpVar = zzb;
        zzma.zza(zzkdVar, Action.KEY_ATTRIBUTE);
        if (!zzkdVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzkdVar);
        this.zzd.put(zzkdVar, zzkpVar);
    }
}
