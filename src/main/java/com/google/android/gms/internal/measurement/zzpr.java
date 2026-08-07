package com.google.android.gms.internal.measurement;

import org.checkerframework.dataflow.qual.SideEffectFree;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpr implements x {
    private static final zzpr zza = new zzpr();
    private final x zzb = y.b(new zzpt());

    @SideEffectFree
    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    @SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return zza.get().zzc();
    }

    @Override // ou.x
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzps get() {
        return (zzps) this.zzb.get();
    }
}
