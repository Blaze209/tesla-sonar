package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zztc extends zzaey implements zzagh {
    private static final zztc zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private long zzk;

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzaey.zzI(zztc.class, zztcVar);
    }

    private zztc() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဂ\u0006", new Object[]{"zzd", "zze", "zzf", zztt.zza, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i12 == 3) {
            return new zztc();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zztb(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
