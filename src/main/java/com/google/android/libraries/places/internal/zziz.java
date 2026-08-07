package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zziz {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zziz(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.zza + "=" + this.zzb + " and " + this.zza + "=" + this.zzc);
    }
}
