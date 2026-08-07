package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class zzahp extends zzahr {
    zzahp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final double zza(Object obj, long j11) {
        return Double.longBitsToDouble(zzk(obj, j11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final float zzb(Object obj, long j11) {
        return Float.intBitsToFloat(zzj(obj, j11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzc(Object obj, long j11, boolean z11) {
        if (zzahs.zzb) {
            zzahs.zzD(obj, j11, z11 ? (byte) 1 : (byte) 0);
        } else {
            zzahs.zzE(obj, j11, z11 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzd(Object obj, long j11, byte b11) {
        if (zzahs.zzb) {
            zzahs.zzD(obj, j11, b11);
        } else {
            zzahs.zzE(obj, j11, b11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zze(Object obj, long j11, double d11) {
        zzo(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final void zzf(Object obj, long j11, float f11) {
        zzn(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.libraries.places.internal.zzahr
    public final boolean zzg(Object obj, long j11) {
        return zzahs.zzb ? zzahs.zzt(obj, j11) : zzahs.zzu(obj, j11);
    }
}
