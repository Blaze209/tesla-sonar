package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzkd {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzkd(String str, Class cls, boolean z11) {
        this(str, cls, z11, true);
    }

    public static zzkd zza(String str, Class cls) {
        return new zzkd(str, cls, false, false);
    }

    public final String toString() {
        return getClass().getName() + "/" + this.zza + "[" + this.zzb.getName() + "]";
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzkd(String str, Class cls, boolean z11, boolean z12) {
        zzma.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z11;
        System.identityHashCode(this);
        for (int i11 = 0; i11 < 5; i11++) {
        }
    }
}
