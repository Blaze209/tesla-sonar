package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzoo {
    final Unsafe zza;

    zzoo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j11, byte b11);

    public abstract boolean zzb(Object obj, long j11);

    public abstract void zzc(Object obj, long j11, boolean z11);

    public abstract float zzd(Object obj, long j11);

    public abstract void zze(Object obj, long j11, float f11);

    public abstract double zzf(Object obj, long j11);

    public abstract void zzg(Object obj, long j11, double d11);
}
