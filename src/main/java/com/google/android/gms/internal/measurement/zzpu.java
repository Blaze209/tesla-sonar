package com.google.android.gms.internal.measurement;

import org.checkerframework.dataflow.qual.SideEffectFree;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpu implements x {
    private static final zzpu zza = new zzpu();
    private final x zzb = y.b(new zzpw());

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

    @SideEffectFree
    public static boolean zzd() {
        return zza.get().zzd();
    }

    @Override // ou.x
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzpv get() {
        return (zzpv) this.zzb.get();
    }
}
