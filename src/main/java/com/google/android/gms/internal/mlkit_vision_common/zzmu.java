package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmjVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        zzmjVar.zzc(zzc(i11, i12, j11, i13, i14, i15, i16), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        return new zzmt(i11, i12, i15, i13, i14, SystemClock.elapsedRealtime() - j11, i16);
    }
}
