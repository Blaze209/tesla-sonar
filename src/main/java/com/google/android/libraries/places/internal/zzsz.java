package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzsz extends zzaey implements zzagh {
    private static final zzsz zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;

    static {
        zzsz zzszVar = new zzsz();
        zzb = zzszVar;
        zzaey.zzI(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i12 == 3) {
            return new zzsz();
        }
        zzsu zzsuVar = null;
        if (i12 == 4) {
            return new zzsy(zzsuVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
