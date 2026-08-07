package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsw extends zzaey implements zzagh {
    private static final zzsw zzb;
    private int zzd;
    private int zze;

    static {
        zzsw zzswVar = new zzsw();
        zzb = zzswVar;
        zzaey.zzI(zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzty.zza});
        }
        if (i12 == 3) {
            return new zzsw();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zzsv(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
