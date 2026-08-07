package com.google.android.gms.internal.measurement;

import org.checkerframework.dataflow.qual.SideEffectFree;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class zzrn implements x {
    private static final zzrn zza = new zzrn();
    private final x zzb = y.b(new zzrp());

    @SideEffectFree
    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    @SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // ou.x
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzro get() {
        return (zzro) this.zzb.get();
    }
}
