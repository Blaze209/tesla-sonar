package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zznx extends zzaey implements zzagh {
    private static final zznx zzb;
    private int zzd;
    private zznm zze;
    private int zzf;
    private int zzg;

    static {
        zznx zznxVar = new zznx();
        zzb = zznxVar;
        zzaey.zzI(zznx.class, zznxVar);
    }

    private zznx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", zznw.zza, "zzg"});
        }
        if (i12 == 3) {
            return new zznx();
        }
        zznk zznkVar = null;
        if (i12 == 4) {
            return new zznv(zznkVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
