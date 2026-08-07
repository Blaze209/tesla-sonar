package com.google.android.gms.internal.measurement;

import org.checkerframework.dataflow.qual.SideEffectFree;
import ou.x;
import ou.y;

/* JADX INFO: loaded from: classes5.dex */
public final class zzqd implements x {
    private static final zzqd zza = new zzqd();
    private final x zzb = y.b(new zzqf());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // ou.x
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqe get() {
        return (zzqe) this.zzb.get();
    }
}
