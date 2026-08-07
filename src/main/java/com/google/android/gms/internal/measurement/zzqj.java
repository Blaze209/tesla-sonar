package com.google.android.gms.internal.measurement;

import org.checkerframework.dataflow.qual.SideEffectFree;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqj implements x {
    private static final zzqj zza = new zzqj();
    private final x zzb = y.b(new zzql());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // ou.x
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqk get() {
        return (zzqk) this.zzb.get();
    }
}
