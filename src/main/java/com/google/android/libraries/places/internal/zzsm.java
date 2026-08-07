package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsm extends zzaey implements zzagh {
    private static final zzsm zzb;
    private int zzd;
    private int zze;
    private float zzf;
    private int zzg;
    private float zzh;
    private int zzi;

    static {
        zzsm zzsmVar = new zzsm();
        zzb = zzsmVar;
        zzaey.zzI(zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new zzsm();
        }
        zzqo zzqoVar = null;
        if (i12 == 4) {
            return new zzsl(zzqoVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
