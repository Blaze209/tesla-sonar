package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zztx extends zzaey implements zzagh {
    private static final zztx zzb;
    private int zzd;
    private int zze;
    private float zzf;
    private float zzg;

    static {
        zztx zztxVar = new zztx();
        zzb = zztxVar;
        zzaey.zzI(zztx.class, zztxVar);
    }

    private zztx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", zztt.zza, "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new zztx();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zztw(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
